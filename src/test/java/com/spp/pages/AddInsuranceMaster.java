package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddInsuranceMaster extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Insurance Master']")
	WebElement insuranceMaster;
	@FindBy(xpath="//a[text()='Add New Insurance Master']")
	WebElement addInsurance;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement insuranceName;
	@FindBy(xpath="//input[@value='Create Insurance']")
	WebElement createInsurance;
	@FindBy(xpath="//strong[text()='Insurance successfully created ']")
	WebElement successfullMessage;
	
	public AddInsuranceMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void clickInsuranceMaster() throws Exception{
		insuranceMaster.click();
	}
	
	public void clickAddInsuranceMaster() throws Exception{
		addInsurance.click();
	}
	
	public void enterInsuranceName(String value) throws Exception{
		insuranceName.sendKeys(value);
	}
	
	public void clicCreateInsuranceMaster() throws Exception{
		createInsurance.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
