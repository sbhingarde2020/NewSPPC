package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreatePaymonth extends BasePage {
	@FindBy(id="salary")
	WebElement SalaryLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[1]/a")
	WebElement PaymonthsLink;
	@FindBy(id="month_name")
	WebElement MonthName;
	@FindBy(xpath="//*[@id=\"create_paymonth_form\"]/div[4]/div/div/fieldset/div[2]/input")
	WebElement CreateButton;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id=\"paymonth-lists\"]/form/div[3]/table/tbody/tr[1]/td[8]/a")
	WebElement DeleteButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/div/div/fieldset/div[2]/form/div/input[2]")
	WebElement DeletePaymonth;
	public CreatePaymonth(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSalaryLink(){
		SalaryLink.click();
	}
	
	public void selectPaymonthsLink(){
		PaymonthsLink.click();
	}

	public void enterMonthName(String value){
		MonthName.clear();
		MonthName.sendKeys(value);
	}
	
	public void ClickCreateButton(){
		CreateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
	public void clickDeleteButton(){
		DeleteButton.click();
	}
	public void clickDeletePaymonth(){
		DeletePaymonth.click();
	}
}
