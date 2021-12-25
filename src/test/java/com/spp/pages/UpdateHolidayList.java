package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateHolidayList extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Holiday Lists']")
	WebElement holidayList;
	@FindBy(xpath="//table[@id='holidays_list']//tr[1]//td[3]//a[text()='View']")
	WebElement viewList;
	@FindBy(xpath="//table[@id='holidays_master_list']//tr[1]//td[5]//a[text()='edit']")
	WebElement editLink;
	@FindBy(name="holiday_master_list[holiday_date]")
	WebElement date;
	@FindBy(id="holiday_master_list_description")
	WebElement description;
	@FindBy(xpath="//input[@value='Update Holiday']")
	WebElement updateHoliday;
	@FindBy(xpath="//strong[text()='Holiday Master List successfully updated']")
	WebElement successfullMessage;

	public UpdateHolidayList(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectHolidayList(){
		holidayList.click();
	}

	public void clickView(){
		viewList.click();
	}
	
	public void clickEditLink(){
		editLink.click();
	}
	
	public void enterDate(String value){
		date.clear();
		date.sendKeys(value);
	}

	public void enterDescription(String value){
		description.clear();
		description.sendKeys(value);
	}
	
	public void clickUpdateHoliday(){
		updateHoliday.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
		
	}
}
