package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateAttendanceConfiguration extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Attendance Configuration']")
	WebElement attendanceConfiguration;
	@FindBy(xpath="//a[text()='Add New Attendance Conf.']")
	WebElement addAttendance;
	@FindBy(id="attendance_configuration_attendance")
	WebElement attendanceName;
	@FindBy(id="attendance_configuration_short_name")
	WebElement shortName;
	@FindBy(id="attendance_configuration_salary_calendar_days_actual_days__month")
	WebElement salaryCalender;
	@FindBy(id="attendance_configuration_attendance_type_leave_register")
	WebElement attendanceType;
	@FindBy(xpath="//input[@value='Create Attendance Configuration']")
	WebElement createButton;
	@FindBy(xpath="//div[text()='Attendance Configuration was Successfully created']")
	WebElement successfullMessage;

	public CreateAttendanceConfiguration(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectAttendanceConfiguration(){
		attendanceConfiguration.click();
	}
	
	public void clickAddAttendanceConfig(){
		addAttendance.click();
	}
	
	public void enterAttendanceName(String value){
		attendanceName.sendKeys(value);
	}
	
	public void enterShortName(String value){
		shortName.sendKeys(value);
	}
	
	public void clickSalaryCalender(){
		salaryCalender.click();
	}
	
	public void clickAttendanceType(){
		attendanceType.click();
	}
	
	public void clickCreateButton(){
		createButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
