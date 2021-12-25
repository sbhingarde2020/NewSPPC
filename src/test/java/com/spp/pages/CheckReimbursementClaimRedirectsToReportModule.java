package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckReimbursementClaimRedirectsToReportModule extends BasePage{
	public CheckReimbursementClaimRedirectsToReportModule(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[4]/a")
	WebElement ReimbursementClaim;
	@FindBy(id="report")
	WebElement Report;
	@FindBy(linkText="Bank Statement Reimbursement")
	WebElement BankReimbursement;
	@FindBy(id="reim_mop_4")
	WebElement Bank;

	//@FindBy(xpath="//*[@id=\"new_reimbursement_allotment\"]/div[2]/fieldset/div[1]/div[1]/div")
	@FindBy(xpath="//*[@id=\"dt_bank_statement\"]/tbody/tr/td[1]/input")
	WebElement CheckBox;
	@FindBy(id="sal_from_date")
	WebElement FromDate;
	
	@FindBy(id="sal_to_date")
	WebElement ToDate;
	@FindBy(xpath="//*[@id=\"bank_rpt_id\"]/div[5]/input")
	WebElement GenerateReport;
	
	@FindBy(xpath="//*[@id=\"bulk_claim\"]/tbody/tr[10]/td[6]/input")
	WebElement Amount;
	@FindBy(xpath="//*[@id=\"bulk_claim\"]/tbody/tr[10]/td[8]/select")
	WebElement Paymonth;
	@FindBy(xpath="//*[@id=\"bulk_claim_reimburs\"]/div[4]/input")
	WebElement ClaimReimbursementButton;
	@FindBy(xpath="//*[@id=\"reimbursement_claim_result_response\"]/div/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"reimbursement_claims\"]/tbody/tr[1]/td[8]/a")
	//@FindBy(xpath="//*[@id=\"reimbursement_allotments\"]/tbody/tr/td[2][contains(text(),'Reim. LTA')]/parent::tr/td[8]/a")
	WebElement DeleteButton;
	
	public void selectSalary() {
		Salary.click();
	}
	public void selectReimbursementClaim() {
		ReimbursementClaim.click();
	}
	public void selectReport() {
		Report.click();
	}
	public void selectBankReimbursement() {
		BankReimbursement.click();
	}
	public void selectBank() {
		Bank.click();
	}
	
	public void selectCheckBox() {
		CheckBox.click();
	}
	public void selectFromDate(String Value) {
		FromDate.sendKeys(Value);
	}
	public void selectToDate(String Value) {
		ToDate.sendKeys(Value);
	}
	public void selectPaymonth(String value){
		dropDownSelect(Paymonth, value);
	}
	public void selectGenerateReport() {
		GenerateReport.click();
	}
	public String getMessage(){
		return SuccessfulMessage.getText();
	}
//	}public void clickPagechange() throws Exception{
//		Pagechange.click();
//	}
//	
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}

}
