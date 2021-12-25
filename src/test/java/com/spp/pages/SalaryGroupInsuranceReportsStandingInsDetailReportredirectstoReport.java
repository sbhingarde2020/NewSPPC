package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class SalaryGroupInsuranceReportsStandingInsDetailReportredirectstoReport extends BasePage{

	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//a[text()='Group Insurance Detail']")
	WebElement ClickOnGroupInsuranceDetail;
	@FindBy(xpath="//a[text()='Standing Ins. Detail Report']")
	WebElement ClickonStandInsDetailRpt;
	@FindBy(id="si_type")
	WebElement SelectSIType;
	@FindBy(id="report_type")
	WebElement SelectReportType;
	@FindBy(id="si_from_month")
	WebElement SelectMonthFrom;
	@FindBy(id="si_to_month")
	WebElement SelectMonthTo;
	@FindBy(id="group_by")
	WebElement SelectGroupBy;
	@FindBy(id="order_by")
	WebElement SelectOrderBy;
	@FindBy(id="filter")
	WebElement GetEmployees;
	@FindBy(xpath="//button[text()='LOAD']")
	WebElement ClickOnLoad;
	@FindBy(id="employee_data_")
	WebElement SelectEmployees;
	@FindBy(xpath="//*[@id=\"standing_instruction_form\"]/div[5]/input")
	WebElement GenerateReport;
	@FindBy(xpath="//strong[text()='Employees Successfully Loaded.']")
	WebElement successfullmessage;
	
	
	
	
	public SalaryGroupInsuranceReportsStandingInsDetailReportredirectstoReport(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonsalary() {
		ClickOnSalary.click();
	}
	public void clickongroupinsurancedetail() {
		ClickOnGroupInsuranceDetail.click();
	}
	public void clickonstandInsdetailrpt() {
		ClickonStandInsDetailRpt.click();
	}
	public void selectsitype(String value) {
		dropDownSelect(SelectSIType, value);
	}
	public void selectreporttype(String value) {
		dropDownSelect(SelectReportType, value);
	}
	public void selectmonthfrom(String value) {
		dropDownSelect(SelectMonthFrom, value);
	}
	public void selectmonthto(String value) {
		dropDownSelect(SelectMonthTo, value);
	}
	public void selectgroupby(String value) {
		dropDownSelect(SelectGroupBy, value);
	}
	public void selectorderby(String value) {
		dropDownSelect(SelectOrderBy, value);
	}
	public void clickgetemployees() {
		GetEmployees.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void selectemployee() {
		SelectEmployees.click();
	}
	public void clickongeneratereport() {
		GenerateReport.click();	
	}
	public String getMessage() {
		return successfullmessage.getText();
	}
}
