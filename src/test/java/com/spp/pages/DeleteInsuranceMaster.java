package com.spp.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteInsuranceMaster extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Insurance Master']")
	WebElement insuranceMaster;
	@FindBy(xpath="//*[@class=\"action-delete\"]")
	WebElement deleteInsurance;
	@FindBy(xpath="//strong[text()='Insurance successfully deleted']")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id='standing_instr_list']/div/table/tbody/tr/td[contains(text(),'Insurance_Master')]")
	WebElement SelectedInsuranceMaster;
	
	public DeleteInsuranceMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void clickInsuranceMaster() throws Exception{
		insuranceMaster.click();
	}
	
	public void clickDeleteInsuranceMaster() throws Exception{
		deleteInsurance.click();
		
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
	public boolean CIfPresent() {
		return checkIfExist(SelectedInsuranceMaster);
	}

	
}
