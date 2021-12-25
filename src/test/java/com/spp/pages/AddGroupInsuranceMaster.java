package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddGroupInsuranceMaster extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Group Insurance Master']")
	WebElement groupInsurance;
	@FindBy(xpath="//a[text()='Add New Group Insurance Master']")
	WebElement addGroupInsurance;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement groupInsuranceName;
	@FindBy(xpath="//input[@value='Create Group Insurance']")
	WebElement createGroupInsurance;
	@FindBy(xpath="//strong[text()='Group Insurance successfully created ']")
	WebElement successfullMessage;
	
	public AddGroupInsuranceMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void selectGroupInsurance() throws Exception{
		groupInsurance.click();
	}
	
	public void clickaddGroupInsurance() throws Exception{
		addGroupInsurance.click();
	}
	
	public void enterGroupInsurance(String value) throws Exception{
		groupInsuranceName.sendKeys(value);
	}
	
	public void clickCreateGroupInsurance() throws Exception{
		createGroupInsurance.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
