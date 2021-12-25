package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateAttendanceConfiguration extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Attendance Configuration']")
	WebElement attendanceConfiguration;
	@FindBy(xpath="//*[@id='main']/div/table/tbody/tr/td[contains(text(),'Chennai')]/parent::tr/td[5]/a")
	WebElement editIcon;
	@FindBy(id="attendance_configuration_attendance")
	WebElement attendanceName;
	@FindBy(id="attendance_configuration_short_name")
	WebElement shortName;
	@FindBy(id="attendance_configuration_salary_calendar_days_only_working_days__holiday")
	WebElement salaryCalender;
	@FindBy(id="attendance_configuration_attendance_type_monthly")
	WebElement attendanceType;
	@FindBy(xpath="//input[@value='Update Attendance Configuration']")
	WebElement updateButton;
	@FindBy(xpath="//div[text()='Attendance Configuration was Successfully updated']")
	WebElement successfullMessage;

	public UpdateAttendanceConfiguration(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectAttendanceConfiguration(){
		attendanceConfiguration.click();
	}
	
	public void clickEditIcon(){
		editIcon.click();
	}
	
	public void enterAttendanceName(String value){
		attendanceName.clear();
		attendanceName.sendKeys(value);
	}
	
	public void enterShortName(String value){
		shortName.clear();
		shortName.sendKeys(value);
	}
	
	public void clickSalaryCalender(){
		salaryCalender.click();
	}
	
	public void clickAttendanceType(){
		attendanceType.click();
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
