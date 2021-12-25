package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckForMaxAllowedInLoanMaster extends BasePage {
	// In Standing instruction script
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//*[@id='menu']/li[3]/div/div[2]/ul/li[4]/a")
	WebElement LoanMaster;
	@FindBy(xpath="//*[@id=\"employee-2\"]/td[4]/a")
	WebElement EditLink;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[2]/table/tbody[2]/tr[1]/td[1]")
	WebElement SelectedLoanMaster;
	@FindBy(id="standing_instruction_master_max_allowed")
	WebElement MaxAllowedValue;
	@FindBy(id="standing_instruction_master_max_amount")
	WebElement MaxAmount;
	@FindBy(id="standing_instruction_master_emi_recovery")
	WebElement EMIRecovery;
	@FindBy(id="standing_instruction_master_interest_rate")
	WebElement InterestRate;
	
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[8]/input")
	WebElement UpdateButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfullMessage;
	@FindBy(id="salary")
	WebElement salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[7]/a")
	WebElement LoanDetails;
	@FindBy(id="add_employees")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[1]/td[6]/a")
	WebElement View;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[1]/span/a")
	WebElement AddNewLoanDetails;
	@FindBy(id="standing_instruction_detail_standing_instruction_master_id")
	WebElement LoanName;
	@FindBy(xpath="//*[@id=\"standing_instruction_detail_financial_institution_id\"]")
	WebElement InstitutionName;
	@FindBy(xpath="//*[@id=\"standing_instruction_detail_actual_amount\"]")
	WebElement Amount;
	@FindBy(id="sal_date")
	WebElement LoanDate;
	@FindBy(id="lump")
	WebElement lumpsum;
	@FindBy(xpath="//*[@id=\"standing_instruction_detail_lumpsum_amount\"]")
	WebElement Installments;
	
	@FindBy(id="dpMonthYear")
	WebElement RecoveryDate;
	@FindBy(id="standing_instruction_detail_loan_account_no")
	WebElement LoanAccountNo;
	@FindBy(id="update_save")
	WebElement CreateAdvance;
	@FindBy(xpath="//*[@id='main']/div[2]/strong")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id=\"main\"]/section/p/a[2]")
	WebElement Previouslistpage;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr/td[8]/a")
	WebElement deleteadvancedetails;
	
	public CheckForMaxAllowedInLoanMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickLoanMaster() throws Exception{
		LoanMaster.click();
	}
	public String getLoanMaster() {
		return SelectedLoanMaster.getText();
	}

	public void clickEditLink() throws Exception{
		EditLink.click();
	}

	public void enterMaxAllowedValue(String value) throws Exception{
		MaxAllowedValue.clear();
		MaxAllowedValue.sendKeys(value);
	}
	public void clickMaxAmount() {
	
		MaxAmount.clear();
	}
	public void clickEMIRecovery() {
		
		EMIRecovery.clear();
	}
public void clickInterestRate() {
		
		InterestRate.clear();
	}
	
	
	public void clickUpdateButton() throws Exception{
		UpdateButton.click();
	}
	public String getMessage1() {
		return SuccessfullMessage.getText();
	}
	public void clicksalary() throws Exception{
		salary.click();
	}

	public void clickLoanDetails() throws Exception{
		LoanDetails.click();
	}

	public void clickAddEmployee() throws Exception{
		AddEmployee.click();
	}

	public void clickLoad() throws Exception{
		Load.click();
	}

	public void clickView() throws Exception{
		View.click();
	}
	public void clickAddNewLoanDetails() throws Exception{
		AddNewLoanDetails.click();
	}
	public void clickLoanName(String value){
		dropDownSelect(LoanName,value);
	}
	public void clickInstitutionName(String value){
		dropDownSelect(InstitutionName,value);
	} 	
    public void clickAmount(String value){
		Amount.clear();
		Amount.sendKeys(value);
	}
    public void clickLoanDate(String value) throws InterruptedException{
		LoanDate.sendKeys(value);
		Thread.sleep(1000);
		LoanDate.sendKeys(Keys.TAB);
}
    
    public void clickRecoveryDate(String value) throws InterruptedException{
    	RecoveryDate.sendKeys(value);
		Thread.sleep(1000);
	  RecoveryDate.sendKeys(Keys.TAB);
}
    public void clicklumpsum(){
    	lumpsum.click();
	} 
    
    public void clickInstallments(String value){
		Installments.clear();
		Installments.sendKeys(value);
	}
    public void clickLoanAccountNo(String value){
    	LoanAccountNo.clear();
    	LoanAccountNo.sendKeys(value);
	}
   
    public void clickCreateAdvance(){

		CreateAdvance.click();
	}
    
    public String getMessage() {
		return successfullMessage.getText();
	}
    public void selectPreviouslistpage() {
    	Previouslistpage.click();
    }

	public void deleteadvancedetails(String loanMaster) {
		// TODO Auto-generated method stub
		deleteadvancedetails.click();
	}
	public String getAlertMessage() {
    	return switchToPopUpAndgetText(driver);

}
    
    

}
