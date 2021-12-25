package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifEmployeeEmployeeDetailsReportsEmployeeStatutoryReportredirectstoReportmodule extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement ClickOnEmployeeDetails;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-2\"]/h3")
	WebElement ClickOnReports;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-2\"]/ul/li[2]/a")
	WebElement ClickOnEmployeeStatRept;
	@FindBy(id="st_report")
	WebElement SelectReportType;
	@FindBy(id="pf_report_pf_group")
	WebElement SelectGroup;
	@FindBy(id="order_by")
	WebElement SelectOrderBy;
	@FindBy(id="month_year")
	WebElement SelectPaymonth;
	@FindBy(xpath="//*[@id=\"statutory_report\"]/div[2]/div[13]/input")
	WebElement ClickOnGenerateStatReport;
	
	public CheckifEmployeeEmployeeDetailsReportsEmployeeStatutoryReportredirectstoReportmodule(WebDriver driver) {
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
	public void clickonstatreport() {
		ClickOnEmployeeStatRept.click();
	}
	public void selectreporttype(String value) throws Exception{
		dropDownSelect(SelectReportType, value);
	}
	public void selectgroup(String value) throws Exception{
		dropDownSelect(SelectGroup, value);
	}
	public void selectorderby(String value) throws Exception{
		dropDownSelect(SelectOrderBy, value);
	}
	public void selectpaymonth(String value) throws Exception{
		dropDownSelect(SelectPaymonth, value);
	}
	public void generatestatreport() {
		ClickOnGenerateStatReport.click();
	}
	

}	
