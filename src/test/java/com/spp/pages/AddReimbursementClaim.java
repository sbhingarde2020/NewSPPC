package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddReimbursementClaim extends BasePage{
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[4]/a")
	WebElement ReimbursementClaim;
	@FindBy(linkText="Add New Reimbursement Claim")
	WebElement AddReimbursement;
	@FindBy(xpath="//*[@id=\"employees_table\"]/tbody/tr[1]/td[5]/input")
	WebElement AddEmployee;
	
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/form/div[3]/input")
	WebElement ClaimButton;

	//@FindBy(xpath="//*[@id=\"new_reimbursement_allotment\"]/div[2]/fieldset/div[1]/div[1]/div")
	@FindBy(id="reimbursement_claim_reimbursement_master_id")
	WebElement Name;
	@FindBy(id="reimbursement_claim_financial_year")
	WebElement FinancialYear;
	@FindBy(id="reimbursement_claim_mode_of_payment")
	WebElement PaymentMode;
	@FindBy(id="reimbursement_claim_paymonth_id")
	WebElement PaidMonth;
	@FindBy(id="sal_date")
	WebElement ClaimDate;
	@FindBy(id="paid_date")
	WebElement PaidDate;
	@FindBy(id="reimbursement_claim_amount"					)
	WebElement Amount;
	@FindBy(xpath="//*[@id=\"new_claim\"]/div[2]/div/input")
	WebElement CreateReimbursementButton;
	@FindBy(xpath="//*[@id=\"reimbursement_claim_result_response\"]/div/strong")
	WebElement successfulMessage;
	
	
	
	
	public AddReimbursementClaim(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateSalary() throws Exception{
		Salary.click();
	}
	
	public void clickReimbursementClaim() throws Exception{
		ReimbursementClaim.click();
	}
	public void ClickAddReimbursement() throws Exception{
		AddReimbursement.click();
	}
	
	public void SelectAddEmployee() throws Exception{
		AddEmployee.click();
	}
	public void selectClaimButton() {
		ClaimButton.click();
	}
	public void selectName(String value){
		dropDownSelect(Name, value);
	}
	public void selectFinancialYear(String value){
		dropDownSelect(FinancialYear, value);
	}
	public void selectPaymentMode(String value){
		dropDownSelect(PaymentMode, value);
	}

	public void selectPaidMonth(String Value) {
		PaidMonth.sendKeys(Value);
	}
	public void selectClaimDate(String Value) {
		
		ClaimDate.sendKeys(Value);
	}
     public void selectPaidDate(String Value) {
		
		PaidDate.sendKeys(Value);
	}
	
     public void selectAmount(String Value) {
		
		Amount.sendKeys(Value);
	}
	
	
	public void selectCreateReimbursementButton() {
		CreateReimbursementButton.click();
	}
	public String getMessage() {
    	return successfulMessage.getText();
}

}
