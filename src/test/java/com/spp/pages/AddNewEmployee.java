package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddNewEmployee extends BasePage {

	
	
	@FindBy(id="emp_detail")
	WebElement employeeLink;	
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement EmployeeDetails;
	@FindBy(xpath="//*[@id='ui-accordion-accordion-panel-0']/ul/li[1]/a")
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
	@FindBy(id="sal_date")
	WebElement DateofSalary;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/nav/ul/li[1]/a")
	WebElement PresentAddress;
	@FindBy(id="employee_present_state_id")
	WebElement State;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/nav/ul/li[5]/a")
	WebElement StatutoryTab;
	@FindBy(id="employee_statutory_pf_number")
	WebElement employeePfNumber;
	@FindBy(id="pf_ed")
	WebElement PfEffective;
	@FindBy(id="employee_statutory_uan")
	WebElement Uan;
	@FindBy(id="employee_statutory_esi_number")
	WebElement ESINo;	
	@FindBy(id="esi_ed")
	WebElement EffectiveESIDate;
	@FindBy(xpath="//*[@class=\"btn2 btn-bglightblue\"]")
	WebElement CreateEmployeeButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullMessage;
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
	@FindBy(id="employee_detail_classification_1")
	WebElement SelectDesignation;
	@FindBy(id="sal_date")
	WebElement EnterSalDate;
	
	
	public AddNewEmployee(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}



     public void clickEmployeeLink() {
	   employeeLink.click();
}
    public void selectEmployeeDetails(){
    	EmployeeDetails.click();
}
    public void selectAddNewEmployee() {
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
	public void selectdateofsalary(String value) throws Exception {
		DateofSalary.clear();
		DateofSalary.sendKeys(value);
	}
	public void clickPresentAddress(){
		PresentAddress.click();
}
	public void selectState(String value){
		dropDownSelect(State, value);
}		
	public void clickStatutoryTab(){
		StatutoryTab.click();
}	
	
	public void enteremployeePfNumber(String value) throws Exception {
		employeePfNumber.sendKeys(value);
}	    
	public void selectPfEffective(String value) throws Exception {
			PfEffective.sendKeys(value);
}	
	public void enterUan(String value) throws Exception {
		Uan.sendKeys(value);
}
	public void enterESINo(String value) throws Exception {
		ESINo.sendKeys(value);
}	
    public void selectEffectiveESIDate(String value) throws Exception {
    	EffectiveESIDate.sendKeys(value);
}		
	public void clickCreateEmployeeButton(){
		CreateEmployeeButton.click();
}
    public String getMessage(){
	return successfullMessage.getText();
}
    public void selectstatdetails() {
    	SelectStatDetails.click();
}
    public void checkTDS() {
    	CheckTDS.click();
}
    public void selectpanoption(String value) {
    	dropDownSelect(SelectPanOption, value);
    }
    public void enterpanno(String value) {
    EnterPANNo.sendKeys(value);
}
    public void entereffectivedatePAN(String value){
    EffectiveFromDate.sendKeys(value);
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
    public void entersaldate(String value) throws Exception{
		EnterSalDate.sendKeys(value);
	}
    }