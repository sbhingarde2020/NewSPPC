package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateGroupInsurance extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Group Insurance Master']")
	WebElement groupInsurance;
	@FindBy(xpath="(//a[text()='Edit'])[1]")
	WebElement editGroupInsurance;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement groupInsuranceName;
	@FindBy(xpath="//input[@value='Update Group Insurance']")
	WebElement updateGroupInsurance;
	@FindBy(xpath="//strong[text()='Group Insurance successfully updated']")
	WebElement successfullMessage;
	
	public UpdateGroupInsurance(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void selectGroupInsurance() throws Exception{
		groupInsurance.click();
	}
	
	public void clickEditGroupInsurance() throws Exception{
		editGroupInsurance.click();
	}
	
	public void enterGroupInsurance(String value) throws Exception{
		groupInsuranceName.clear();
		groupInsuranceName.sendKeys(value);
	}
	
	public void clickUpdateGroupInsurance() throws Exception{
		updateGroupInsurance.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
