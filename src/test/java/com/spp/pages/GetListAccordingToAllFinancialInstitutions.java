package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class GetListAccordingToAllFinancialInstitutions extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[4]/ul/li[4]/a")
	WebElement FinancialLink;
	@FindBy(id="account_type")
	WebElement AccountType;
	@FindBy(xpath="//*[@id='search_form']/form/div[2]/div/input")
	WebElement GetList;
	
	
	
	public GetListAccordingToAllFinancialInstitutions(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){
		
		masterLink.click();
	}

	public void clickFinancialLink(){
		FinancialLink.click();
	}
	public void clickAccountType(String value){
		AccountType.sendKeys(value);	
	}
	public void clickGetList(){
		GetList.click();
	}


}
