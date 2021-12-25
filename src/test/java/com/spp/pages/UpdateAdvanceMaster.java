package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class UpdateAdvanceMaster extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Advance Master']")
	WebElement advanceMaster;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[2]/table/tbody/tr/td[contains(text(),'Advance_Master')]/parent::tr/td[4]/a")
	WebElement EditButton;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement advanceName;
	@FindBy(id="standing_instruction_master_interest_rate")
	WebElement interestRate;
	@FindBy(id="standing_instruction_master_max_amount")
	WebElement maxAmount;
	@FindBy(id="standing_instruction_master_max_allowed")
	WebElement maxAllowed;
	@FindBy(id="standing_instruction_master_emi_recovery")
	WebElement emiRecovery;
	@FindBy(xpath="//input[@value='Update Advance']")
	WebElement updateAdvance;
	@FindBy(xpath="//strong[text()='Advance successfully updated']")
	WebElement successfullMessage;

	public UpdateAdvanceMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void  clickAdvanceMaster() throws Exception{
		advanceMaster.click();
	}

	public void  clickEditAdvanceMaster() throws Exception{
		EditButton.click();
	}

	public void enterAdvanceName(String value) throws Exception{
		advanceName.clear();
		advanceName.sendKeys(value);
	}

	public void enterInterestRate(String value) throws Exception{
		interestRate.clear();
		interestRate.sendKeys(value);
	}

	public void enterMaximumAmount(String value) throws Exception{
		maxAmount.clear();
		maxAmount.sendKeys(value);
	}

	public void enterMaximumAllowed(String value) throws Exception{
		maxAllowed.clear();
		maxAllowed.sendKeys(value);
	}

	public void enterEMIRecovery(String value) throws Exception{
		emiRecovery.clear();
		emiRecovery.sendKeys(value);
	}

	public void  clickUpdateAdvanceMaster() throws Exception{
		updateAdvance.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
