package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifEmployeeEmployeeDetailsReportsEmployeeSummaryredirectstoReportmodule extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement ClickOnEmployeeDetails;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-2\"]/h3")
	WebElement ClickOnReports;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-2\"]/ul/li[3]/a")
	WebElement ClickOnEmployeeSummary;
	@FindBy(xpath="//*[@id='employees_table']/tbody/tr/td[contains(text(),'Ashish')]/parent::tr/td[5]/a")
	WebElement ClickOnViewSummary;
	@FindBy(xpath="//*[@id=\"main\"]/div[12]/a[1]")
	WebElement DownloadPDF;
	@FindBy(xpath="//*[@id=\"main\"]/div[12]/a[2]")
	WebElement DownloadExcel;
		
	public CheckifEmployeeEmployeeDetailsReportsEmployeeSummaryredirectstoReportmodule(WebDriver driver) {
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
	public void clickonemployeesummary() {
		ClickOnEmployeeSummary.click();
	}
	public void clickonviewsummary() {
		ClickOnViewSummary.click();
	}
	public void downloadpdf() {
		DownloadPDF.click();
	}
	public void downloadexcel() {
		DownloadExcel.click();
		
	}
}
