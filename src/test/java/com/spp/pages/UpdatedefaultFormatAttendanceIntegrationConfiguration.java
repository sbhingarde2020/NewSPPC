package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdatedefaultFormatAttendanceIntegrationConfiguration extends BasePage{
	
	@FindBy(id="leave")
	WebElement Leave;
	@FindBy(xpath="//*[@id='menu']/li[5]/div/div/ul/li[6]/a")
	WebElement AttendanceIntegration;
	@FindBy(xpath="//*[@id=\"attendance_foramts\"]/tbody/tr[2]/td[3]/input")
	WebElement DefaultBtn;
	@FindBy(xpath="//input[@value='Update']")
	WebElement UpdateBtn;
	@FindBy(xpath="//*[@id='show_message']/div/strong")
	WebElement SuccessfulMessage;
	
	public UpdatedefaultFormatAttendanceIntegrationConfiguration(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonleave() {
		Leave.click();
	}
	public void clickonAttendanceIntegration() {
		AttendanceIntegration.click();
	}
	public void clickondefaultbtn() {
		DefaultBtn.click();
	}
	public void clickonUpdatebtn() {
		UpdateBtn.click();
	}
	public String getMessage(){
		return SuccessfulMessage.getText();
	}
}