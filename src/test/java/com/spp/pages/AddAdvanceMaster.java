package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class AddAdvanceMaster extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Advance Master']")
	WebElement advanceMaster;
	@FindBy(xpath="//a[text()='Add New Advance Master']")
	WebElement addAdvanceMaster;
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
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement clubbedinSalary;
	@FindBy(id="standing_instruction_master_reducing_balance")
	WebElement reducingBalance;
	@FindBy(xpath="//input[@value='Create Advance']")
	WebElement createAdvance;
	@FindBy(xpath="//strong[text()='Advance successfully created ']")
	WebElement successfullMessage;

	public AddAdvanceMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void  clickAdvanceMaster() throws Exception{
		advanceMaster.click();
	}

	public void clickAddAdvancMaster() throws Exception{
		addAdvanceMaster.click();
	}

	public void enterAdvanceName(String value) throws Exception{
		advanceName.sendKeys(value);
	}

	public void enterInterestRate(String value) throws Exception{
		interestRate.sendKeys(value);
	}

	public void enterMaximumAmount(String value) throws Exception{
		maxAmount.sendKeys(value);
	}

	public void enterMaximumAllowed(String value) throws Exception{
		maxAllowed.sendKeys(value);
	}

	public void enterEMIRecovery(String value) throws Exception{
		emiRecovery.sendKeys(value);
	}

	public void clickClubbedInSalary() throws Exception{
		clubbedinSalary.click();
	}

	public void clickReducingBalance() throws Exception{
		reducingBalance.click();
	}

	public void clickCreateAdvanceButton() throws Exception{
		createAdvance.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
