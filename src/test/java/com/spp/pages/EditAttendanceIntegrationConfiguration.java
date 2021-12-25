package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditAttendanceIntegrationConfiguration extends BasePage{
	
	@FindBy(id="leave")
	WebElement Leave;
	@FindBy(xpath="//*[@id='menu']/li[5]/div/div/ul/li[6]/a")
	WebElement AttendanceIntegration;
	@FindBy(xpath="//*[@id='attendance_foramts']/tbody/tr/td[contains(text(),'Attendance Format123')]/parent::tr/td/span[1]/a")
	WebElement EditAttendanceFormat;
	@FindBy(id="attendance_configuration_strarting_row")
	WebElement Startingrow;
	@FindBy(id="attendance_configuration_format_name")
	WebElement FormatName;
	@FindBy(xpath="//input[@value='Next']")
	WebElement NextBtn;
	@FindBy(id="create_format")
	WebElement UpdateBtn;
	@FindBy(xpath="//*[@id='show_message']/div/strong")
	WebElement SuccessfulMessage;
	
	public EditAttendanceIntegrationConfiguration(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickonleave() {
		Leave.click();
	}
	public void clickonAttendanceIntegration() {
		AttendanceIntegration.click();
	}
	public void editAttendanceFormat() {
		EditAttendanceFormat.click();
	}
	public void writeStartingrow(String value) throws Exception{
		Startingrow.clear();
		Startingrow.sendKeys(value);
	}
	public void writeFormatName(String value) throws Exception{
		FormatName.clear();
		FormatName.sendKeys(value);
	}
	public void clickNext() {
		NextBtn.click();
	}
	public void clickUpdate() {
		UpdateBtn.click();
	}
	public String getMessage(){
		return SuccessfulMessage.getText();
	}
}