package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifEmployeeEmployeeDetailsReportsEmployeeMasterReportredirectstoReportmodule extends BasePage{

	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement ClickOnEmployeeDetails;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-2\"]/h3")
	WebElement ClickOnReports;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-2\"]/ul/li[1]/a")
	WebElement ClickOnEmployeeMasterRept;
	@FindBy(id="report_type")
	WebElement SelectReportType;
	@FindBy(id="get_emp_data")
	WebElement GetEmployees;
	@FindBy(xpath="//*[@id='bf_form']/div[10]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(id="employee_id_")
	WebElement SelectEmployee;
	@FindBy(id="post_emp_data")
	WebElement ClickOnGenerateReport;
	
	public CheckifEmployeeEmployeeDetailsReportsEmployeeMasterReportredirectstoReportmodule(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonemployeedetails() {
		ClickOnEmployeeDetails.click();
	}
	public void clickonreports() {
		ClickOnReports.click();
	}
	public void clickonmasterreport() {
		ClickOnEmployeeMasterRept.click();
	}
	public void selectreporttype(String value) throws Exception{
		dropDownSelect(SelectReportType, value);
	}
	public void getemployees() {
		GetEmployees.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void selectemployee() {
		SelectEmployee.click();
	}
	public void generatereport() {
		ClickOnGenerateReport.click();
	}
	

}
