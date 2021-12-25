package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class PTChallanMaharashtraNewFormatVerifyingslbsinreport extends BasePage{

	
	@FindBy(id="report")
	WebElement ClickOnReport;
	@FindBy(xpath="//*[@id=\"menu\"]/li[8]/div/div[1]/ul/li[6]/a")
	WebElement ClickOnPTReport;
	@FindBy(id="report_type")
	WebElement SelectReportType;
	@FindBy(id="month_year")
	WebElement SelectMonthYear;
	@FindBy(id="state_name")
	WebElement SelectState;
	@FindBy(id="pt_state_group_id")
	WebElement SelectPTGroup;
	@FindBy(id="year")
	WebElement SelectYear;
	@FindBy(id="report_name")
	WebElement SelectReportName;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/form/div[4]/input[1]")
	WebElement GetPreview;
	@FindBy(id="format")
	WebElement SelectFormat;
	@FindBy(id="group_by")
	WebElement SelectGroupBy;
	@FindBy(id="order_by")
	WebElement SelectOrderBy;
	public PTChallanMaharashtraNewFormatVerifyingslbsinreport(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonreport() {
		ClickOnReport.click();
	}
	public void clickonptreport() {
		ClickOnPTReport.click();
	}
	public void selectreporttype(String value) {
		dropDownSelect(SelectReportType, value);
	}
	public void selectmonthyear(String value) {
		dropDownSelect(SelectMonthYear, value);
	}
	public void getpreview() {
		GetPreview.click();
	}
	public void selectstate(String value) {
		dropDownSelect(SelectState, value);
	}
	public void selectptgroup(String value) {
		dropDownSelect(SelectPTGroup, value);
	}
	public void selectyear(String value) {
		dropDownSelect(SelectYear, value);
	}
	public void selectreportname(String value) {
		dropDownSelect(SelectReportName, value);
	}
	public void selectformat(String value) {
		dropDownSelect(SelectFormat, value);
	}
	public void selectgroupby(String value) {
		dropDownSelect(SelectGroupBy, value);
	}
	public void selectorderby(String value) {
		dropDownSelect(SelectOrderBy, value);
	}
}
