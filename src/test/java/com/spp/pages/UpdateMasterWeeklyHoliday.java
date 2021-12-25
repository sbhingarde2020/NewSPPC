package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateMasterWeeklyHoliday extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Master Weekly Holiday']")
	WebElement masterWeekly;
	@FindBy(xpath="//table[@id='filters_list']//td[3]//a[text()='View']")
	WebElement viewLink;
	@FindBy(id="master_weekly_off_first_week_first_off")
	WebElement firstWeeklyOff;
	@FindBy(id="master_weekly_off_first_week_off_1")
	WebElement halforFull;
	@FindBy(id="master_weekly_off_first_week_second_off")
	WebElement secondWeeklyOff;
	@FindBy(id="master_weekly_off_first_week_off_2")
	WebElement shalforFullday;
	@FindBy(xpath="//input[@value='Update Master Weekly Off']")
	WebElement updateButton;
	@FindBy(xpath="//strong[text()='Master Weekly off Successfully Updated.']")
	WebElement successfullMessage;

	public UpdateMasterWeeklyHoliday(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectMasterWeekly(){
		masterWeekly.click();
	}
	
	public void clickViewLink(){
		viewLink.click();
	}
	
	public void selectFirstWeeklyOff(String value){
		dropDownSelect(firstWeeklyOff, value);
	}
	
	public void selectHalfOrFullDay(String value){
		dropDownSelect(halforFull, value);
	}
	
	public void selectsScondWeeklyOff(String value){
		dropDownSelect(secondWeeklyOff, value);
	}
	
	public void selectSHalforFullDay(String value){
		dropDownSelect(shalforFullday, value);
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
