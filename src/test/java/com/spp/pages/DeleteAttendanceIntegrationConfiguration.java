package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteAttendanceIntegrationConfiguration extends BasePage{

	@FindBy(id="leave")
	WebElement Leave;
	@FindBy(xpath="//*[@id='menu']/li[5]/div/div/ul/li[6]/a")
	WebElement AttendanceIntegration;
	@FindBy(xpath="//*[@id='attendance_foramts']/tbody/tr/td[contains(text(),'Attendance Format123')]/parent::tr/td/span[3]/a")
	WebElement DeleteAttendanceFormat;
	@FindBy(xpath="//*[@id='show_message']/div/strong")
	WebElement SuccessfulMessage;
	
	
	public DeleteAttendanceIntegrationConfiguration(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickonleave() {
		Leave.click();
	}
	public void clickonAttendanceIntegration() {
		AttendanceIntegration.click();
	}
	public void deleteAttendanceFormat() {
		DeleteAttendanceFormat.click();
	}
	public String getMessage(){
		return SuccessfulMessage.getText();
	}

}
