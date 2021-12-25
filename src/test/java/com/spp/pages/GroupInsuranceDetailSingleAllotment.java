package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class GroupInsuranceDetailSingleAllotment extends BasePage{
	@FindBy(id="master")
	WebElement ClickOnMaster;
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
	WebElement salarylink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[5]/a")
	WebElement GroupInsuranceDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[1]/td[6]/a")
	WebElement View;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[1]/span/a")
	WebElement AddNewGroup;
	@FindBy(id="standing_instruction_detail_standing_instruction_master_id")
	WebElement GroupInsuranceName;
	@FindBy(id="standing_instruction_detail_loan_account_no")
	WebElement InsuranceNo;
	@FindBy(id="dpMonthYear1")
	WebElement StartMonth;
	@FindBy(id="dpMonthYear")
	WebElement EndMonth;
	@FindBy(id="standing_instruction_detail_actual_amount")
	WebElement Amount;
	@FindBy(id="standing_instruction_detail_financial_institution_id")
	WebElement InstitutionName;
	@FindBy(id="standing_instruction_detail_remarks")
	WebElement Remark;
	@FindBy(xpath="//*[@id=\"new_standing_instruction_detail\"]/div[4]/table/tbody/tr/td[2]/label/input")
	WebElement Monthly;
	@FindBy(id="update_save")
	WebElement CreateButton;	
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr[1]/td[9]/a")
	WebElement DeleteButton;
	@FindBy(id="select_all")
	WebElement SelectAll;
	public GroupInsuranceDetailSingleAllotment(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void selectall() {
		SelectAll.click();
	}
	public void clickonsalary() {
		salarylink.click();
	}
	public void navigateMaster() throws Exception{
		ClickOnMaster.click();
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
	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickGroupInsuranceDetails() throws Exception{
		GroupInsuranceDetails.click();
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
	public void clickAddNewGroup() throws Exception{
		AddNewGroup.click();
	}
	public void clickGroupInsuranceName(String value) throws Exception{
		dropDownSelect(GroupInsuranceName,value);
		
	}
	public void clickInsuranceNo(String value) throws Exception{
			InsuranceNo.sendKeys(value);
	}
	
	public void clickStartMonth(String value) throws Exception{
		StartMonth.sendKeys(value);
	}
	public void clickEndMonth(String value) throws Exception{
		EndMonth.sendKeys(value);
	}
	public void clickAmount(String value) throws Exception{
		Amount.sendKeys(value);
	}
	public void selectInstitutionName(String value){
		dropDownSelect(InstitutionName, value);
	}
	public void clickRemark(String value) throws Exception{
		Remark.sendKeys(value);
	}
	public void clickMonthly() throws Exception{
		Monthly.click();
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
