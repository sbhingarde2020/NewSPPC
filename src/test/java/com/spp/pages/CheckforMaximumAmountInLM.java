package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckforMaximumAmountInLM extends BasePage{
	@FindBy(xpath="//a[text()='Financial Institution (Bank)']")
	WebElement financialInstitution;
	@FindBy(xpath="//a[text()='Add New Financial Institution']")
	WebElement AddNewFinancialInstitution;
	@FindBy(id="financial_institution_account_type")
	WebElement SelectAccountType;
	@FindBy(id="financial_institution_name")
	WebElement EnterName;
	@FindBy(id="financial_institution_branch_code")
	WebElement EnterBranchCode;
	@FindBy(id="financial_institution_address")
	WebElement EnterAddress;
	@FindBy(id="financial_institution_ifsc_code")
	WebElement EnterIFSCCode;
	@FindBy(id="financial_institution_email")
	WebElement EnterEmail;
	@FindBy(id="financial_institution_pincode")
	WebElement EnterPincode;
	@FindBy(xpath="//input[@value='Create Financial institution']")
	WebElement CreateFinancialInstitution;
	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[4]/a")
	WebElement SelectLoanMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement EnterLoanName;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[1]/span/a")
	WebElement AddNewLoanMaster;
	@FindBy(xpath="//*[@class=\"action-edit\"]")
	WebElement ClickonEdit;
	@FindBy(id="standing_instruction_master_max_amount")
	WebElement EnterMaxAmount;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[8]/input")
	WebElement UpdateLoanMaster;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong") 
	WebElement successfullMessage;
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//a[text()='Loan Detail']")
	WebElement ClickonLoanDetail;
	@FindBy(id="add_employees")
	WebElement AddEmployees;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[1]/td[6]/a")
	WebElement ClickOnView;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[1]/span/a")
	WebElement AddNewLoanDetail;
	@FindBy(id="standing_instruction_detail_standing_instruction_master_id")
	WebElement SelectLoanName;
	@FindBy(id="sal_date")
	WebElement EnterLoanDate;
	@FindBy(id="standing_instruction_detail_financial_institution_id")
	WebElement EnterInstitutionName;
	@FindBy(id="standing_instruction_detail_loan_account_no")
	WebElement EnterLoanAccNo;
	@FindBy(id="standing_instruction_detail_actual_amount")
	WebElement EnterLoanAmount;
	@FindBy(id="standing_instruction_detail_lumpsum_amount")
	WebElement EnterInstallmentAmount;
	@FindBy(id="dpMonthYear")
	WebElement EnterRecordFrom;
	@FindBy(id="update_save")
	WebElement CreateLoan;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfulmessage;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[8]/input")
	WebElement CreateLoanMaster;
	
	@FindBy(xpath="//*[@id=\"financial_institutions\"]/tbody/tr/td[contains(text(),'HDFC Bank')]/parent::tr/td[9]/a")
	WebElement DeleteFinancialInstitution;
	
	public CheckforMaximumAmountInLM(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

		
	}
	
	
	public void addnewfinanInsti() throws Exception{
		AddNewFinancialInstitution.click();
	}
	
	 public void selectAccoutType(String value){
			dropDownSelect(SelectAccountType, value);
		}
		
		public void enterInstName(String value){
			EnterName.clear();
			EnterName.sendKeys(value);
		}
		
		public void enterBranchCode(String value){
			EnterBranchCode.clear();
			EnterBranchCode.sendKeys(value);
		}
		
		public void enterEmail(String value){
			EnterEmail.clear();
			EnterEmail.sendKeys(value);
		}
		
		public void enterAddress(String value){
			EnterAddress.clear();
			EnterAddress.sendKeys(value);
		}
		
		public void enterPinCode(String value){
			EnterPincode.clear();
			EnterPincode.sendKeys(value);
		}
		
		public void enterIFSCCode(String value){
			EnterIFSCCode.clear();
			EnterIFSCCode.sendKeys(value);
		}
		public void createfinanceinsti() {
			CreateFinancialInstitution.click();
		}
	public void clickonMaster() throws Exception{
		ClickOnMaster.click();
	}
	
	public void addnewloanmaster() throws Exception{
		AddNewLoanMaster.click();
	}
	public void enterloanName(String value) throws Exception{
		EnterLoanName.sendKeys(value);
	}
	public void selectloanmaster() {
		SelectLoanMaster.click();
	}
	public void clickonedit() throws Exception{
		ClickonEdit.click();
	}
	public void entermaxamount(String value) throws Exception{
		EnterMaxAmount.clear();
		EnterMaxAmount.sendKeys(value);
	}
	public void updateloanmaster() throws Exception{
		UpdateLoanMaster.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	} 
	public void clickonsalary() {
		ClickOnSalary.click();
	}
	public void clickonloandetail() {
		ClickonLoanDetail.click();
	}
	public void addemployees() {
		AddEmployees.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonview() {
		ClickOnView.click();
	}
	public void addnewloandetail() {
		AddNewLoanDetail.click();
	}
	public void selectloanname(String value) {
		dropDownSelect(SelectLoanName, value);
	}
	public void enterloanamount(String value) throws Exception{
		EnterLoanAmount.clear();
		EnterLoanAmount.sendKeys(value);
	}
	public void createloan() {
		CreateLoan.click();
	}
	
	public String getAlertText()
	{
		return switchToPopUpAndgetText(driver);
	}
	public void createloanmaster() throws Exception{
		CreateLoanMaster.click();
	}
	public void deletefinancialinsti() {
		DeleteFinancialInstitution.click();
		switchToPopUpAndAccept(driver);
	}
	public void selectFinancialInst() throws Exception{
		financialInstitution.click();
	}
	
}
