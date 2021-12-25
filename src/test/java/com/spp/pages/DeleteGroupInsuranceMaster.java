package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteGroupInsuranceMaster extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Group Insurance Master']")
	WebElement groupInsurance;
	@FindBy(xpath="(//a[text()='Delete'])[1]")
	WebElement deleteGroupInsurance;
	@FindBy(xpath="//strong[text()='Group Insurance successfully deleted']")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[2]/table/tbody/tr/td[contains(text(),'Group_Insurance_Master')]")
	WebElement SelectedGroupInsuranceMaster;

	public DeleteGroupInsuranceMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void selectGroupInsurance() throws Exception{
		groupInsurance.click();
	}

	public void clickDeleteGroupInsurance() throws Exception{
		deleteGroupInsurance.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
	public boolean CheckIfPresent() {
		return checkIfExist(SelectedGroupInsuranceMaster);
	}
}
