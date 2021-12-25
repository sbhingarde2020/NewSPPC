package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifSalaryAdditionalSalaryGeneralLinkAdditionalSalaryReportredirectstoReport extends BasePage{
	@FindBy(id="salary")
	WebElement SalaryLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[2]/a")
	WebElement AdditionalSalary;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/li[2]/a")
	WebElement AdditionalSalaryReport;
	@FindBy(id="paymonth_id")
	WebElement SelectPaymonth;
	@FindBy(id="addtional_salary_report_employees")
	WebElement GetEmployees;
	@FindBy(id="filter_head")
	WebElement AdvanceFilter;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(id="addition_sal_report_submit")
	WebElement GetExcelReport;
	
	public CheckifSalaryAdditionalSalaryGeneralLinkAdditionalSalaryReportredirectstoReport(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickSalaryLink(){
		SalaryLink.click();
	}
	
	public void selectAdditionalSalary(){
		AdditionalSalary.click();
	}
	public void selectadditionalsalaryreport() {
		AdditionalSalaryReport.click();
	}
	public void selectPaymonth(String value) {
		dropDownSelect(SelectPaymonth, value);
	}
	public void getemployees() {
		GetEmployees.click();
	}
	public void ClickAdvanceFilter(){
		AdvanceFilter.click();
	}
	public void ClickLoad(){
		ClickOnLoad.click();
	}
	public void getexcelreport() {
		GetExcelReport.click();
	}
}
