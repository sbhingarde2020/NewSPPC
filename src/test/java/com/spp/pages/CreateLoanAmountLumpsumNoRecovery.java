package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateLoanAmountLumpsumNoRecovery extends BasePage{
	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[4]/a")
	WebElement SelectLoanMaster;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[1]/span/a")
	WebElement AddNewLoanMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement EnterLoanName;
	@FindBy(id="standing_instruction_master_interest_rate")
	WebElement EnterInterestRate;
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement UncheckClubbedInSalary;
	@FindBy(id="standing_instruction_master_max_amount")
	WebElement EnterMaxAmount;
	@FindBy(id="standing_instruction_master_max_allowed")
	WebElement EnterMaxAllowed;
	@FindBy(id="standing_instruction_master_emi_recovery")
	WebElement EnterEMIRecovery;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[8]/input")
	WebElement CreateLoanMaster;
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
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//a[text()='Loan Detail']")
	WebElement ClickOnLoanDetail;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
	WebElement ClickonGeneralLinks;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-1\"]/li[2]/a")
	WebElement ClickOnEmployeeMaster;
	
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullmessage;
	
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[1]/td[6]/a")
	WebElement View;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[1]/span/a")
	WebElement AddNewLoan;
	@FindBy(id="standing_instruction_detail_standing_instruction_master_id")
	WebElement LoanName;
	@FindBy(id="sal_date")
	WebElement LoanDate;
	@FindBy(id="standing_instruction_detail_financial_institution_id")
	WebElement InstitutionName;
	@FindBy(id="standing_instruction_detail_loan_account_no")
	WebElement LoanAccountNo;
	@FindBy(id="standing_instruction_detail_actual_amount")
	WebElement Amount;
	@FindBy(id="standing_instruction_detail_lumpsum_amount")
	WebElement InstallmentAmount;
	@FindBy(id="dpMonthYear")
	WebElement RecoverDate;
	@FindBy(id="standing_instruction_detail_no_recovery")
	WebElement NoRecovery;
	@FindBy(id="update_save")
	WebElement CreateButton;	
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr[1]/td[8]/a")
	WebElement DeleteButton;
	
	
	public CreateLoanAmountLumpsumNoRecovery(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void navigateMaster() throws Exception{
		ClickOnMaster.click();
	}
	public void selectloanmaster() throws Exception{
		SelectLoanMaster.click();
	}
	public void addnewloanmaster() throws Exception{
		AddNewLoanMaster.click();
	}
	public void enterloanName(String value) throws Exception{
		EnterLoanName.sendKeys(value);
	}
	public void enterinterestrate(String value) throws Exception{
		EnterInterestRate.sendKeys(value);
	}
	public void uncheckclubbedInsalary() throws Exception{
		UncheckClubbedInSalary.click();
	}
	public void entermaxamount(String value) throws Exception{
		EnterMaxAmount.sendKeys(value);
	}
	public void entermaxallowed(String value) throws Exception{
		EnterMaxAllowed.sendKeys(value);
	}
	public void enteremirecovery(String value) throws Exception{
		EnterEMIRecovery.sendKeys(value);
	}
	public void createloanmaster() throws Exception{
		CreateLoanMaster.click();
	}
	public void selectFinancialInst() throws Exception{
		financialInstitution.click();
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
	public void clickonsalary() {
		ClickOnSalary.click();
	}
	public void clickonloandetail() {
		ClickOnLoanDetail.click();
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
	public void clickAddNewLoan() throws Exception{
		AddNewLoan.click();
	}
	public void clickLoanName(String value) throws Exception{
		dropDownSelect(LoanName,value);
		
	}
	public void selectLoanDate(String value) throws Exception{
			LoanDate.sendKeys(value);
	}
	
	public void clickLoanAccountNo(String value) throws Exception{
		LoanAccountNo.sendKeys(value);
	}
	public void clickInstallmentAmount(String value) throws Exception{
		InstallmentAmount.sendKeys(value);
	}
	public void clickAmount(String value) throws Exception{
		Amount.sendKeys(value);
	}
	public void selectInstitutionName(String value){
		dropDownSelect(InstitutionName, value);
	}
	public void norecovery() {
		NoRecovery.click();
	}
	public void clickRecoverDate(String value) throws Exception{
		RecoverDate.sendKeys(value);
	}
	
	public void clickCreateButton() throws Exception{
		CreateButton.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}

	
   
   
}
