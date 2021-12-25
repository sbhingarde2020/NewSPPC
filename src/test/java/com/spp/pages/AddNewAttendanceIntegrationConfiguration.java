package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddNewAttendanceIntegrationConfiguration extends BasePage{
	
	@FindBy(id="leave")
	WebElement Leave;
	@FindBy(xpath="//*[@id='menu']/li[5]/div/div/ul/li[6]/a")
	WebElement AttendanceIntegration;
	@FindBy(xpath="//*[@id='attendance-format-list']/form/div[2]/span/a")
	WebElement AddNewAttendanceIntegration;
	@FindBy(id="attendance_configuration_format_name")
	WebElement FormatName;
	@FindBy(id="attendance_configuration_sample_file")
	WebElement SelectSampleFile;
	@FindBy(id="attendance_configuration_strarting_row")
	WebElement Startingrow;
	@FindBy(xpath="//input[@value='Next']")
	WebElement NextBtn;
	@FindBy(id="leave_abbreviation_checkbox")
	WebElement LeaveAbbreviationCheckbox;
	@FindBy(id="create_format")
	WebElement SaveBtn;
	@FindBy(xpath="//*[@id='show_message']/div/strong")
	WebElement SuccessfulMessage;
	@FindBy(id="text_radio_button")
	WebElement FileTypeRadio;
	
	public AddNewAttendanceIntegrationConfiguration(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickonleave() {
		Leave.click();
	}
	public void clickonAttendanceIntegration() {
		AttendanceIntegration.click();
	}
	public void clickonAddNewAttendanceIntegration() {
		AddNewAttendanceIntegration.click();
	}
	public void writeFormatName(String value) throws Exception{
		FormatName.sendKeys(value);
	}
	public void addSampleFile(String value) throws Exception{
		SelectSampleFile.sendKeys(value);
	}
	public void writeStartingrow(String value) throws Exception{
		Startingrow.sendKeys(value);
	}
	public void clickNext() {
		NextBtn.click();
	}
	public void checkConsiderLeaveAbbreviation() {
		LeaveAbbreviationCheckbox.click();
	}
	public void clickSave() {
		SaveBtn.click();
	}
	public String getMessage(){
		return SuccessfulMessage.getText();
	}
	public void changeFileType() {
		FileTypeRadio.click();
	}
	
}