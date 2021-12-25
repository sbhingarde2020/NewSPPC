package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddEmployeewithClassificationDetail extends BasePage{
	@FindBy(id="emp_detail")
	WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement EmployeeDetails;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/ul/li[1]/a")
	WebElement AddNewEmployee;
	@FindBy(id="employee_emp_id")
	WebElement EnterEmployeeId;
	@FindBy(id="employee_refno")
	WebElement EnterEmployeeRefNo;
	@FindBy(id="employee_empname")
	WebElement EnterEmployeeName;
	@FindBy(id="employee_father_name")
	WebElement EnterFatherName;
	@FindBy(id="dob")
	WebElement EnterDOB;
	@FindBy(id="employee_gender")
	WebElement Gender;
	@FindBy(id="marital_status")
	WebElement MaritalStatus;
	@FindBy(id="doj")
	WebElement EnterDOJ;
	@FindBy(id="sal_date")
	WebElement EnterSalDate;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/nav/ul/li[1]/a/span")
	WebElement clickPresentAdd;
	@FindBy(id="employee_present_state_id")
	WebElement SelectState;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/nav/ul/li[5]/a")
	WebElement SelectStatDetails;
	@FindBy(id="employee_statutory_tds_enable")
	WebElement CheckTDS;
	@FindBy(id="panoption")
	WebElement SelectPanOption;
	@FindBy(id="employee_statutory_pan")
	WebElement EnterPANNo;
	@FindBy(id="pan_ed")
	WebElement EffectiveFromDate;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/nav/ul/li[7]/a/span")
	WebElement SelectClassficationDetail;
	@FindBy(id="employee_detail_salary_group_id")
	WebElement SelectSalaryGroup;
	@FindBy(id="employee_detail_branch_id")
	WebElement SelectBranch;
	@FindBy(id="employee_detail_attendance_configuration_id")
	WebElement SelectAttendanceConfigId;
	@FindBy(id="employee_detail_leave_policy_master_id")
	WebElement SelectLeavyPolicyId;
	@FindBy(id="employee_detail_financial_institution_id")
	WebElement SelectFinanacialInstitution;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/div/div[8]/input")
	WebElement CreateEmployee;
	@FindBy(xpath="//strong[text()='Advance successfully created ']")
	WebElement successfullMessage;	
	@FindBy(id="dob")
	WebElement DateofBirth;
	@FindBy(id="employee_detail_financial_institution_id")
	WebElement SelectBank;
	@FindBy(id="employee_detail_leave_policy_master_id")
	WebElement SelectLeavePolicy;
	@FindBy(id="bank_ac")
	WebElement EnterBankAcc;
	@FindBy(id="employee_detail_classification_1")
	WebElement SelectDesignation;
	
	

	public AddEmployeewithClassificationDetail(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateEmployee() throws Exception{
		Employee.click();
	}
	public void clickEmployeeDetails() throws Exception{
		EmployeeDetails.click();
	}
	public void clickAddNewEmployee() throws Exception{
		AddNewEmployee.click();
	}
	public void enterEmployeeId(String value) throws Exception{
		EnterEmployeeId.sendKeys(value);
	}
	public void enterEmployeeRefNo(String value) throws Exception{
		EnterEmployeeRefNo.sendKeys(value);
	}
	public void enterEmployeeName(String value) throws Exception{
		EnterEmployeeName.sendKeys(value);
	}
	public void enterFathername(String value) throws Exception{
		EnterFatherName.sendKeys(value);
	}
	public void selectGender(String value){
		dropDownSelect(Gender, value);
}
	public void selectMaritalStatus(String value){
		dropDownSelect(MaritalStatus, value);
}
	public void enterdob(String value) throws Exception{
		EnterDOB.sendKeys(value);
	}
	
	public void enterdoj(String value) throws Exception{
		EnterDOJ.sendKeys(value);
	}
	public void entersaldate(String value) throws Exception{
		EnterSalDate.sendKeys(value);
	}
	public void selectPresentadd() throws Exception{
		clickPresentAdd.click();
	}
	public void selectstate(String value) throws Exception{
		dropDownSelect(SelectState, value);
	}
	 public void selectDateofBirth(String value) throws Exception {
	    	DateofBirth.sendKeys(value);
	}
	 public void selectstatdetails() {
	    	SelectStatDetails.click();
	}
	 public void selectclassificationdetail(){
	    	SelectClassficationDetail.click();
	    }
	    public void selectsalstructure(String value) {
	    	dropDownSelect(SelectSalaryGroup, value);
	    }
	    public void selectbranch(String value) {
	    	dropDownSelect(SelectBranch, value);
	    }
	    public void selectattendancestructure(String value) {
	    	dropDownSelect(SelectAttendanceConfigId, value);
	    }
	    public void selectbank(String value) {
	    	dropDownSelect(SelectBank, value);
	    }
	    public void selectleavepolicy(String value) {
	    	dropDownSelect(SelectLeavePolicy, value);
	    }
	    public void enterbankacc(String value) {
	    	EnterBankAcc.sendKeys(value);
	    }
	    public void selectdesignation(String value) {
	    	dropDownSelect(SelectDesignation, value);
	    }
}
