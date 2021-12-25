package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckAttendanceConfigforOnlyWorkingDaysandWeeklyHoliday extends BasePage{

	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[3]/ul/li[5]/a")
	WebElement ClickonAttemdanceConfig;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/span/a")
	WebElement AddNewAttendanceConf;
	@FindBy(xpath="//*[@id=\"main\"]/div[4]/table/tbody/tr/td[contains(text(),'Hyderabad')]/parent::tr/td[5]/a")
	WebElement ClickOnEdit;
	@FindBy(id="attendance_configuration_attendance")
	WebElement EnterAttendanceName;
	@FindBy(id="attendance_configuration_short_name")
	WebElement EnterShortName;
	@FindBy(id="attendance_configuration_salary_calendar_days_only_working_days__weekly_holiday")
	WebElement SelectSalCalender;
	@FindBy(id="attendance_configuration_attendance_type_monthly")
	WebElement SelectAttendanceType;
	@FindBy(xpath="//*[@id=\"attendance_configuration_form\"]/div[3]/input")
	WebElement CreateAttendanceConfig;
	@FindBy(css="input[type=submit]")
	WebElement UpdateAttendanceConfig;
	@FindBy(xpath="//*[@id=\"flash_success\"]")
	WebElement successfulmessage;
	
	public CheckAttendanceConfigforOnlyWorkingDaysandWeeklyHoliday(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver, this);
	}
	public void clickonmaster() {
		ClickOnMaster.click();
	}
	public void clickonattendanceconfig() {
		ClickonAttemdanceConfig.click();
	}
	public void addnewattendanceconfig() {
		AddNewAttendanceConf.click();
	}
	public void editattendanceconfig() {
		ClickOnEdit.click();
	}
	public void enterattendancename(String value) {
		EnterAttendanceName.sendKeys(value);
	}
	public void entershortname(String value) {
		EnterShortName.sendKeys(value);
	}
	public void selectsalcalender() {
		SelectSalCalender.click();
	}
	public void selectattendancetype() {
		SelectAttendanceType.click();
	}
	public void createattendanceconfig() {
		CreateAttendanceConfig.click();
	}
	public void updateattendconfig() {
		UpdateAttendanceConfig.click();
	}
	public String getMessage(){
		return successfulmessage.getText();
	}
}
