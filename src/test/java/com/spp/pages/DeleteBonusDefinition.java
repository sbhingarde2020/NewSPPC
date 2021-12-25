package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteBonusDefinition extends BasePage{
	@FindBy(id="salary") 
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[11]/a")
	WebElement Bonus;
	@FindBy(xpath="//*[@id=\"bonus_or_exgratia\"]/div/table/tbody/tr/td[4]/a")
	WebElement ClickOnDelete;
	@FindBy(xpath="//strong[text()='Bonus successfully deleted']")
	WebElement successfullmessage;
	public DeleteBonusDefinition(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickSalary(){
		Salary.click();
	}
	
	public void selectBonus(){
		Bonus.click();
	}
	public void clickondelete() {
		ClickOnDelete.click();
	}
	public String getmessage() {
		return successfullmessage.getText();
	}
}
