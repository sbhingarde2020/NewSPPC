package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateNewReportingAuthority extends BasePage {

	public CreateNewReportingAuthority(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="emp_detail")
    WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[2]/a")
	WebElement ReportingAuth;
	
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/div[1]/a/h3")
	WebElement CreateNewAuthority;
	
	@FindBy(id="find_by")
	WebElement ReportTo;
	
	@FindBy(id="employee_reporting_employee")
	WebElement EnterEmployeeName;
	@FindBy(id="filter_employee_workflows_1")
	WebElement GetEmployeeButton;
	@FindBy(xpath="//*[@id='bf_form']/div[10]/button[1]")
	WebElement LoadButton;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement SuccessfulMessage;
//	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
//	WebElement CheckBox;
	@FindBy(xpath="//*[@id=\"new_employee_workflow\"]/div[6]/input")
	WebElement CreateButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage1;
	@FindBy(xpath="//*[@id=\"main\"]/section/p/a")
	WebElement ReportingAuthorityPage;
	
	
	
	
	public void selectEmployee() {
		Employee.click();
	}
	public void selectReportingAuth() {
		ReportingAuth.click();
	}
	public void selectCreateNewAuthority() {
		CreateNewAuthority.click();
	}
	public void selectReportTo(String value){
		dropDownSelect(ReportTo, value);
	}
	public void enterName(String value) {
		EnterEmployeeName.sendKeys(value);
	}
	public void selectGetEmployeeButton() {
		GetEmployeeButton.click();
	}
	
	public void selectLoadButton() {
		LoadButton.click();
	}
	
	public String getMessage() {
	return 	SuccessfulMessage.getText();
	}
	//public void selectCheckBox() {
//		CheckBox.click();
	//}
	public void selectCreateButton() {
		CreateButton.click();
	}
	public String getMessage1() {
		return 	SuccessfulMessage1.getText();
		}
	public void selectReportingAuthorityPage() {
		ReportingAuthorityPage.click();
	}
}
