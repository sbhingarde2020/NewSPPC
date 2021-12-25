package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifLeaveLeaveEncashmentGeneralLinkEmployeeMasterredirectstoEmployeeMaster extends BasePage{
	@FindBy(id="leave")
	WebElement ClickOnLeave;
	@FindBy(xpath="//*[@id=\"menu\"]/li[5]/div/div/ul/li[2]/a")
	WebElement ClickOnLeaveEncashment;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
	WebElement ClickOnGeneralLinks;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/li/a")
	WebElement ClickOnEmployeeMaster;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/ul/li[1]/a")
	WebElement AddNewEmployee;
	@FindBy(id="employee_emp_id")
	WebElement employeeid;
	@FindBy(id="employee_refno")
	WebElement employeeref;
	@FindBy(id="employee_empname")
	WebElement employeename;
	@FindBy(id="employee_father_name")
	WebElement employeefather;
	@FindBy(id="dob")
	WebElement DateofBirth;
	@FindBy(id="employee_gender")
	WebElement Gender;
	@FindBy(id="marital_status")
	WebElement MaritalStatus;
	@FindBy(id="doj")
	WebElement DateofJoining;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/nav/ul/li[1]/a")
	WebElement PresentAddress;
	@FindBy(id="employee_present_state_id")
	WebElement State;
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
	@FindBy(id="employee_detail_classification_1")
	WebElement SelectDesignation;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/div/div[8]/input")
	WebElement CreateEmployee;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullmessage;
	
	public CheckifLeaveLeaveEncashmentGeneralLinkEmployeeMasterredirectstoEmployeeMaster(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	public void clickonleave() {
		ClickOnLeave.click();
	}
	public void clickonleaveencashment() {
		ClickOnLeaveEncashment.click();
	}
	public void clickongenerallinks() {
		ClickOnGeneralLinks.click();
	}
	public void clickonemployeemaster() {
		ClickOnEmployeeMaster.click();
	}
	public void addnewemployee() {
		AddNewEmployee.click();
	}
	public void enterEmployeeid(String value) throws Exception{
	    	employeeid.sendKeys(value);
	}
	    
	public void enterEmployeeref(String value) throws Exception{
	    	employeeref.sendKeys(value);
	} 
	public void enterEmployeename(String value) throws Exception {
	    	employeename.sendKeys(value);
	}
    public void enterEmployeefather(String value) throws Exception{
	    	employeefather.sendKeys(value);
	}
    public void selectDateofBirth(String value) throws Exception {
	    	DateofBirth.sendKeys(value);
	}
	public void selectGender(String value){
			dropDownSelect(Gender, value);
	}
	public void selectMaritalStatus(String value){
			dropDownSelect(MaritalStatus, value);
	}
	public void selectDateofJoining(String value) throws Exception {
			DateofJoining.sendKeys(value);
	}	
	public void clickPresentAddress(){
			PresentAddress.click();
	}
	public void selectState(String value){
			dropDownSelect(State, value);
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
    	dropDownSelect(SelectFinanacialInstitution, value);
    }
    public void selectleavepolicy(String value) {
    	dropDownSelect(SelectLeavyPolicyId, value);
    }
    public void selectdesignation(String value) {
    	dropDownSelect(SelectDesignation, value);
    }
    public void createemployee() {
    	CreateEmployee.click();
    }
    public String getMessage(){
		return successfullmessage.getText();
	}
}
