package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class UpdateInsuranceMaster extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Insurance Master']")
	WebElement insuranceMaster;
	@FindBy(xpath="(//a[text()='Edit'])[1]")
	WebElement editInsurance;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement insuranceName;
	@FindBy(xpath="//input[@value='Update Insurance']")
	WebElement updateInsurance;
	@FindBy(xpath="//strong[text()='Insurance successfully updated']")
    WebElement successfullMessage;
	
	public UpdateInsuranceMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	public void clickInsuranceMaster() throws Exception{
		insuranceMaster.click();
	}
	
	public void clickEditInsuranceMaster() throws Exception{
		editInsurance.click();
	}
	
	public void enterInsuranceName(String value) throws Exception{
		insuranceName.clear();
		insuranceName.sendKeys(value);
	}
	
	public void clickUpdateInsuranceMaster() throws Exception{
		updateInsurance.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
