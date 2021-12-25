package com.spp.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;
import com.spp.generics.ExcelUtil;

public class GenerateMonthlyLeaveSummary extends BasePage {
@FindBy(id="leave")
WebElement ClickOnLeave;
@FindBy(xpath="//*[@id=\"menu\"]/li[5]/div/div/ul/li[4]/a")
WebElement ClickOnMonthlyLeaveSummary;
@FindBy(id="leave_summary_month_year")
WebElement SelectPaymonth;
@FindBy(id="leave_policy")
WebElement SelectLeavePolicy;
@FindBy(id="leave_type")
WebElement SelectLeaveType;
@FindBy(id="filter")
WebElement ClickOnGetEmployees;
@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
WebElement ClickOnLoad;
@FindBy(id="select_all_employees")
WebElement SelectallEmployees;
@FindBy(xpath="//input[@value='Generate Report']")
WebElement GenerateReport;
@FindBy(id="order_by")
WebElement SelectOrderBy;

	public GenerateMonthlyLeaveSummary(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	public void clickonleave() {
		ClickOnLeave.click();
	}
	public void clickonmonthlyleavesummary() {
		ClickOnMonthlyLeaveSummary.click();
	}
	public void selectpaymonth(String value) {
		dropDownSelect(SelectPaymonth, value);
	}
	public void selectleavepolicy(String value) {
		dropDownSelect(SelectLeavePolicy, value);
	}
	public void selectleavetype(String value) {
		dropDownSelect(SelectLeaveType, value);
	}
	public void selectorderby(String value) {
		dropDownSelect(SelectOrderBy, value);
	}
	public void clickongetemployees() {
		ClickOnGetEmployees.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void selectallemployees() {
		SelectallEmployees.click();
	}
	public void generatereport() {
		GenerateReport.click();
	}
	
	public ArrayList<String> getColumn() throws EncryptedDocumentException, InvalidFormatException, IOException {
		ExcelUtil exc = new ExcelUtil("C:\\Users\\Administrator\\Downloads\\excel_leave_report.xls","excel_leave_report");
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(exc.getColumn("C")));
		return arrayList;
				
	}
}
