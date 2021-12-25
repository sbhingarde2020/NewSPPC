package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class DeleteLeaveDefinition extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Definitions']")
	WebElement leaveDefinitions;
	@FindBy(xpath="//*[@id='leave_definitions']/div[2]/table/tbody/tr/td[contains(text(),'Leave2')]/parent::tr/td[7]/a")
	WebElement deleteButton;
	@FindBy(xpath="//strong[text()='Leave definition successfully deleted.']")
	WebElement successfullMessage;
	
	public DeleteLeaveDefinition(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectLeaveDefinitions(){
		leaveDefinitions.click();
	}
	
	public void clickDeleteLeaveDefinitions(){
		deleteButton.click();
		switchToPopUpAndAccept(driver);
	}

	public String getmessage(){
		return successfullMessage.getText();
	}
}
