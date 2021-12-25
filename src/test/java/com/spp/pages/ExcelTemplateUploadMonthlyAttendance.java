package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class ExcelTemplateUploadMonthlyAttendance extends BasePage{
	
	@FindBy(id="leave")
	WebElement ClickOnLeave;
	@FindBy(xpath="//*[@id='menu']/li[5]/div/div/ul/li[5]/a")
	WebElement ClickOnMonthlyAttendance;
	@FindBy(xpath="//*[@id='ui-accordion-accordion-header-1']/h3")
	WebElement SelectMonthlyAttendance;
	@FindBy(xpath="//*[@id='ui-accordion-accordion-panel-1']/li/a[contains(text(),'Upload Monthly Attendance ExcelTemplate')]")
	WebElement UploadMonthlyAttendance;
	@FindBy(id="excel_file")
	WebElement ExcelUpload;
	@FindBy(xpath="//*[@id=\"main\"]/div/form/div/fieldset/div/div/input[@class='btn2 btn-bglightblue']")
	WebElement UploadFileBtn;
	@FindBy(xpath="//*[@id='main']/div[3]/strong")
	WebElement successfullmessage;
	@FindBy(id="paymonth_id")
	WebElement SelectPaymonth;
	@FindBy(id="leave_policy_master")
	WebElement SelectLeavePolicy;
	@FindBy(id="filter")
	WebElement ClickOnGetEmployees;
	@FindBy(xpath="//*[@id='bf_form']/div[10]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id='monthly_employee_list']/tbody/tr/td[5]/a")
	WebElement ClickOnMakeLeaveEntry;
	@FindBy(xpath="//*[@id=\"main\"]/div/form/table/tbody/tr/td[contains(text(),'Compensatory Work')]/parent::tr/td/input")
	WebElement EnterCompensatoryWork;
	@FindBy(xpath="//*[@id='main']/div[5]/form/table/tbody/tr[7]/td/button")
	WebElement UpdateValues;
	
	public ExcelTemplateUploadMonthlyAttendance(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	public void clickonleave() {
		ClickOnLeave.click();
	}
	public void clickonmonthlyattendance() {
		ClickOnMonthlyAttendance.click();
	}
	public void selectmonthlyattendance() {
		SelectMonthlyAttendance.click();
	}
	public void uploadmonthlyattendance() {
		UploadMonthlyAttendance.click();
	}
	public void UploadExcelFile(String value) {
		ExcelUpload.sendKeys(value);
	}
	public void clickUploadFile() {
		UploadFileBtn.click();
	}
	public String getMessage() {
		return successfullmessage.getText();
	}
	public void selectpaymonth(String value) {
		dropDownSelect(SelectPaymonth,value);
	}
	public void selectleavepolicy(String value) {
		dropDownSelect(SelectLeavePolicy, value);
	}
	public void clickongetemployees() {
		ClickOnGetEmployees.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonmakeleaveentry() {
		ClickOnMakeLeaveEntry.click();
	}
	public void entercompwork(String value) {
		EnterCompensatoryWork.clear();
		EnterCompensatoryWork.sendKeys(value);
	}
	public void clickonupdatevalues() {
		UpdateValues.click();
	}
}