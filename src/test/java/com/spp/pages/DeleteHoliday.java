package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteHoliday extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Holiday Lists']")
	WebElement holidayList;
	@FindBy(xpath="//table[@id='holidays_list']//tr[1]//td[3]//a[text()='View']")
	WebElement viewList;
	@FindBy(xpath="//table[@id='holidays_master_list']//tr[1]//td[5]//a[2]//img[@title='Delete Holiday']")
	WebElement deleteButton;
	@FindBy(xpath="//strong[text()='Master holiday successfully deleted.']")
	WebElement successfullMessage;
	
	public DeleteHoliday(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
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
	
	public void clickDeleteButton() throws InterruptedException{
		deleteButton.click();
		switchToPopUpAndDismiss(driver);
		Thread.sleep(5000);
		deleteButton.click();
		
		switchToPopUpAndAccept(driver);
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
