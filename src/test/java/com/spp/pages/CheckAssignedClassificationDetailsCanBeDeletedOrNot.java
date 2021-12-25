package com.spp.pages;

import java.time.Month;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckAssignedClassificationDetailsCanBeDeletedOrNot extends BasePage{
	@FindBy(id="emp_detail")
	WebElement employeeLink;	
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement EmployeeDetails;
	@FindBy(id="filter_head")
	WebElement FilterHead;
	@FindBy(xpath="//input[@attr='non_classified_emp']")
	WebElement EmployeewithoutClass;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement LoadButton;
	@FindBy(xpath="//*[@id='employees_dtable']/tbody/tr[1]/td[6]/a[1]")
	WebElement ViewButton;
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
	@FindBy(xpath="//*[@id=\"emp_det_form\"]/div[2]/div[15]/input")
	WebElement CreateClassificationButton; 
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullMessage1;
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Classifications']")
	WebElement classifications;
    @FindBy(xpath="//*[@id='list_classification_headings']/div/table/tbody/tr/td[contains(text(),'Classification')]/parent::tr/td[5]/a")
    WebElement deleteButton;
    @FindBy(xpath="//strong[text()='Classification heading was successfully deleted.']")
    WebElement successfullMessage2;
    @FindBy(id="sed")
    WebElement Month;
    @FindBy(xpath="//*[@id=\"CalendarControl\"]/table/tbody/tr[1]/td[1]/a")
	WebElement ChangeYear;
    @FindBy(id="sed")
	WebElement EffectiveDate;
    @FindBy(xpath="//*[@id='CalendarControl']/table/tbody/tr[5]/td[3]/a")
	WebElement SelectDate;
    @FindBy(xpath="//*[@id='classification_heading_result_response']/div/li")
	WebElement CantDeleteMessage;
    
	public CheckAssignedClassificationDetailsCanBeDeletedOrNot(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
}
	public void changeyear() {
		ChangeYear.click();
	}
	public void Effectivedate() {
		EffectiveDate.click();
	}
	public void Selectdate() {
		SelectDate.click();
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
	ViewButton.click();
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
	BankAc.clear();
	BankAc.sendKeys(value);
}
public void clickCreateClassificationButton(){
	CreateClassificationButton.click();
}
public String getMessage1(){
return successfullMessage1.getText();
}
public String getMessage(){
return CantDeleteMessage.getText();
}
public void clickMastserLink(){
	masterLink.click();
}

public void selectClassifications(){
	classifications.click();
}

public void clickDeleteButton(){
	deleteButton.click();
	switchToPopUpAndAccept(driver);
}

public String getMessage2(){
	return successfullMessage2.getText();
}
public void selectmonth(String value) {
	Month.sendKeys(value);
}
}
