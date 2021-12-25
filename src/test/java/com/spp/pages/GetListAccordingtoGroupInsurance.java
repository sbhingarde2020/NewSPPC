package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class GetListAccordingtoGroupInsurance extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Financial Institution (Bank)']")
	WebElement financialInstitution;
	@FindBy(id="account_type")
	WebElement accType;
	@FindBy(xpath="//input[@value='Get List']")
	WebElement getListButton;

	public GetListAccordingtoGroupInsurance(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectFinancialInstitution(){
		financialInstitution.click();
	}
	
	public void selectAccountType(String value){
		dropDownSelect(accType, value);
	}
	
	public void clickGetListButton(){
		getListButton.click();
	}
}
