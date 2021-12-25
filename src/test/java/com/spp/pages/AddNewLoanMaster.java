package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddNewLoanMaster extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Loan Master']")
	WebElement loanMaster;
	@FindBy(xpath="//a[text()='Add New Loan Master']")
	WebElement addLoanMaster;
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
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement clubbedinSalary;
	@FindBy(id="standing_instruction_master_reducing_balance")
	WebElement reducingBalance;
	@FindBy(xpath="//input[@value='Create Loan']")
	WebElement createLoan;
	@FindBy(xpath="//strong[text()='Loan successfully created ']")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[2]/table/tbody[2]/tr[3]/td[5]/a")
	WebElement DeleteButton;

	public AddNewLoanMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void clickLoanMaster() throws Exception{
		loanMaster.click();
	}

	public void clickAddLoanMaster() throws Exception{
		addLoanMaster.click();
	}
	
	public void enterLoanName(String value) throws Exception{
		loanName.sendKeys(value);
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
	
	public void clickCreateLoan() throws Exception{
		createLoan.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
}
