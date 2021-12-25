package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateLoanMaster extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Loan Master']")
	WebElement loanMaster;
	@FindBy(xpath="(//a[text()='Edit'])[2]")
	WebElement editLoan;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement loanName;
	@FindBy(id="standing_instruction_master_interest_rate")
	WebElement interestRate;
	@FindBy(id="standing_instruction_master_max_amount")
	WebElement maxAmount;
	@FindBy(id="standing_instruction_master_max_allowed")
	WebElement maxAllowed;
	@FindBy(id="standing_instruction_master_emi_recovery")
	WebElement emiRecovery;
	@FindBy(xpath="//input[@value='Update Loan']")
	WebElement updateLoan;
	@FindBy(xpath="//strong[text()='Loan successfully updated']")
	WebElement successfullMessage;

	public UpdateLoanMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickLoanMaster() throws Exception{
		loanMaster.click();
	}

	public void clickEditLoanMaster() throws Exception{
		editLoan.click();
	}

	public void enterLoanName(String value) throws Exception{
		loanName.clear();
		loanName.sendKeys(value);
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

	public void clickUpdateLoanMaster() throws Exception{
		updateLoan.click();
	}

	public String getMessage(){
		return successfullMessage.getText();
	}
}
