package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifSalaryArrearsReportsArrearsReportredirectstoReportsmodule extends BasePage{
	
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[3]/a")
	WebElement Arrears;
	@FindBy(id="report")
	WebElement ClickOnReports;
	@FindBy(xpath="//*[@id=\"menu\"]/li[8]/div/div[3]/ul/li[1]/a")
	WebElement ClickOnArrearReport;
	@FindBy(id="report_type")
	WebElement SelectReportType;
	@FindBy(id="month_year")
	WebElement SelectPayMonth;
	@FindBy(id="arrears_filter")
	WebElement GetEmployees;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement ClickonLoad;
	@FindBy(id="employee_ids_")
	WebElement SelectEmployee;
	@FindBy(id="arrear_report_submit")
	WebElement GenerateReport;
	
	
	public CheckifSalaryArrearsReportsArrearsReportredirectstoReportsmodule(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	
	public void clickonsalary() {
		ClickOnSalary.click();
	}
	public void selectArrears(){
		Arrears.click();
	}
	public void clickonreports() {
		ClickOnReports.click();
	}
	public void clickonarrearreport() {
		ClickOnArrearReport.click();
	}
	public void selectreporttype(String value) {
		dropDownSelect(SelectReportType, value);
	}
	public void selectpaymonth(String value) {
		dropDownSelect(SelectPayMonth, value);
	}
	public void getemployees() {
		GetEmployees.click();
	}
	public void clickonload() {
		ClickonLoad.click();
	}
	public void selectemployee() {
		SelectEmployee.click();
	}
	public void generatereport() {
		GenerateReport.click();
	}
	
	

}
