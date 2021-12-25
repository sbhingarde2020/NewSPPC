package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteSalaryHead extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Salary Heads']")
	WebElement salaryheads;
	@FindBy(xpath="//*[@id='earning_heads']/tbody/tr/td[contains(text(),'EDU2')]/parent::tr/td/a[text()='Delete']")	
	WebElement deletebutton;
	@FindBy(xpath="//strong[text()='Salary head successfully deleted']")
	WebElement successfullMessage;
	
	public DeleteSalaryHead(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickSalaryHeadsLink() throws Exception{
		salaryheads.click();
	}
	
	public void clickDeleteSalaryHeadsButton() throws Exception{
		deletebutton.click();
	    //switchToPopUpAndAccept(driver);
	}
	
    public String getMessage(){
		return successfullMessage.getText();
	}
}
