package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateLeaveDefinition extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Definitions']")
	WebElement leaveDefinitions;
	@FindBy(xpath="//*[@id='leave_definitions']/div/table/tbody/tr/td[contains(text(),'Leave1')]/parent::tr/td[6]/a")
	WebElement editButton;
	@FindBy(id="leave_definition_leave_name")
	WebElement leaveName;
	@FindBy(id="leave_definition_short_name")
	WebElement shortName;
	@FindBy(id="leave_definition_consider_for_setting")
	WebElement considerForLeaveSettings;
	@FindBy(xpath="//input[@value='Update Leave Definition']")
	WebElement updateButton;
	@FindBy(xpath="//strong[text()='Leave definition successfully updated.']")
	WebElement sucessfullMessage;
	
	public UpdateLeaveDefinition(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectLeaveDefinitions(){
		leaveDefinitions.click();
	}
	
	public void clickEditLeaveDefinition(){
		editButton.click();
	}
	
	public void enterLeaveName(String value)throws Exception{
		leaveName.clear();
		leaveName.sendKeys(value);
	}

	public void enterShortName(String value)throws Exception{
		shortName.clear();
		shortName.sendKeys(value);
	}
	
	public void clickConsiderForLeaveSettings(){
		considerForLeaveSettings.click();
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return sucessfullMessage.getText();
	}	
}