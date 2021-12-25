package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteMasterWeeklyHoliday extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Master Weekly Holiday']")
	WebElement masterWeekly;
	@FindBy(xpath="//table[@id='filters_list']//td[3]//a[text()='View']")
	WebElement viewLink;
	@FindBy(xpath="//div[@id='weekly_off_content']//div[2]//li[3]//span[normalize-space(text='Weekly Off History')]")
	WebElement weeklyoffHistory;
	@FindBy(xpath="//a[@data-method='delete']")
	WebElement deleteButton;
	@FindBy(xpath="//strong[text()='Master Weekly off Successfully Deleted.']")
	WebElement successfullMessage;
	
	public DeleteMasterWeeklyHoliday(WebDriver driver) {
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
	
	public void clickWeeklyoffHistory(){
		weeklyoffHistory.click();
	}
	
	public void clickDeleteButton(){
		deleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}

}
