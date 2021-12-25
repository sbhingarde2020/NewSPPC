package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class PTChallanMaharashtraNewFormatVerifyingtheamount extends BasePage{
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
	@FindBy(id="branch")
	WebElement PrintBranchName;
	@FindBy(id="mh_stat_Jul_2018_interest_amount")
	WebElement EnterInterestAmount;
	@FindBy(id="mh_stat_Jul_2018_pt_paid")
	WebElement EnterPTPaid;
	@FindBy(id="mh_stat_Jul_2018_less_excess_paid")
	WebElement EnterLessExcessPaid;
	@FindBy(css="[name=commit][type=submit]")
	WebElement ClickOnPreview;
	
	public PTChallanMaharashtraNewFormatVerifyingtheamount(WebDriver driver) {
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
	public void printbranchname() {
		PrintBranchName.click();
	}
	public void enterinterestamount(String value) {
		EnterInterestAmount.sendKeys(value);
	}
	public void enterptpaid(String value) {
		EnterPTPaid.sendKeys(value);
	}
	public void enterlessexcesspaid(String value) {
		EnterLessExcessPaid.sendKeys(value);
	}
	public void clickonpreview() {
		ClickOnPreview.click();
	}
}
