package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteAttendanceConfig extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Attendance Configuration']")
	WebElement attendanceConfiguration;
	@FindBy(xpath="//tr[2]/td[6]/a[@class=\"action-delete\"]")
	WebElement deleteButton;
	@FindBy(xpath="//div[text()='Attendance Configuration Successfully deleted']")
	WebElement successfullMessage;

	public DeleteAttendanceConfig(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectAttendanceConfiguration(){
		attendanceConfiguration.click();
	}
	
	public void clickDeleteButton(){
		deleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
