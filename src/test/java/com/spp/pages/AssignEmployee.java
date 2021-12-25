package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AssignEmployee extends BasePage {

	@FindBy(id="emp_detail")
	WebElement employeeLink;	
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement EmployeeDetails;
	@FindBy(id="filter_head")
	WebElement FilterHead;
	@FindBy(xpath="//input[@attr='non_classified_emp']")
	WebElement EmployeewithoutClass;
	@FindBy(xpath="//*[@id=\"bf_non_classified_emp_form\"]/div[2]/button[1]")
	WebElement LoadButton;
	@FindBy(xpath="//*[@id='employees_dtable']/tbody/tr/td[contains(text(),'Anil')]/parent::tr/td[6]/a[1]")
	WebElement ClickOnView; 
	@FindBy(xpath="//*[@id=\"classification_details\"]/a")
	WebElement ClassificationDetails;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/span/a")
	WebElement AddNewClassiDetails;
	@FindBy(id="employee_detail_salary_group_id")
	WebElement SalaryStructure;
	@FindBy(id="employee_detail_attendance_configuration_id")   
	WebElement AttendanceStructure;
	
	@FindBy(id="employee_detail_branch_id")
	WebElement Branch;
	
	@FindBy(id="employee_detail_financial_institution_id")
	WebElement Bank;
	
	@FindBy(id="employee_detail_leave_policy_master_id")
	WebElement LeavePolicy;
	
	@FindBy(id="bank_ac")
	WebElement BankAc;
	@FindBy(xpath="//*[@value='Create Classification Details']")
	WebElement CreateClassificationButton; 
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullMessage;
	
	public AssignEmployee(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
}


public void clickEmployeeLink() {
	   employeeLink.click();
}
public void selectEmployeeDetails(){
 	EmployeeDetails.click();
}
public void selectFilterHead(){
	FilterHead.click();
}
public void clickEmployeewithoutClass(){
	EmployeewithoutClass.click();
}
public void selectLoadButton(){
	LoadButton.click();
}
public void selectViewButton(){
	ClickOnView.click();
}
public void selectClassificationDetails(){
	ClassificationDetails.click();
}
public void selectAddNewClassiDetails(){
	AddNewClassiDetails.click();
}
public void selectSalaryStructure(String value){
	dropDownSelect(SalaryStructure, value);
}
public void selectAttendanceStructure(String value){
	dropDownSelect(AttendanceStructure, value);
}
public void selectBranch(String value){
	dropDownSelect(Branch, value);
}
public void selectBank(String value){
	dropDownSelect(Bank, value);
}
public void selectLeavePolicy(String value){
	dropDownSelect(LeavePolicy, value);
}
public void enterBankAc(String value) throws Exception {
	BankAc.sendKeys(value);
}
public void clickCreateClassificationButton(){
	CreateClassificationButton.click();
}
public String getMessage(){
return successfullMessage.getText();
}
}

