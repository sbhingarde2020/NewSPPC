package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateAttendanceConfigwithAttendTypeMonthly extends BasePage{
	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[3]/ul/li[5]/a")
	WebElement ClickonAttemdanceConfig;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/span/a")
	WebElement AddNewAttendanceConf;
	@FindBy(id="attendance_configuration_attendance")
	WebElement EnterAttendanceName;
	@FindBy(id="attendance_configuration_short_name")
	WebElement EnterShortName;
	@FindBy(id="attendance_configuration_salary_calendar_days_actual_days__month")
	WebElement SelectSalCalender;
	@FindBy(id="attendance_configuration_attendance_type_monthly")
	WebElement SelectAttendanceType;
	@FindBy(xpath="//*[@id=\"attendance_configuration_form\"]/div[3]/input")
	WebElement CreateAttendanceConfig;
	@FindBy(xpath="//*[@id=\"flash_success\"]")
	WebElement successfulmessage;
	@FindBy(xpath="//tr[2]/td[6]/a[@class=\"action-delete\"]")
	WebElement DeleteButton;
	
	public CreateAttendanceConfigwithAttendTypeMonthly(WebDriver driver) {
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
	public String getMessage(){
		return successfulmessage.getText();
	}
	public void clickDelete() {
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	
	
	
}
