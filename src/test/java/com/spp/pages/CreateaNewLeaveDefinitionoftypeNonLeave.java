package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class CreateaNewLeaveDefinitionoftypeNonLeave extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Definitions']")
	WebElement leaveDefinitions;
	@FindBy(id="leave_definition_leave_name")
	WebElement leaveName;
	@FindBy(id="leave_definition_short_name")
	WebElement shortName;
	
	@FindBy(xpath="//*[@id=\"new_leave_definition\"]/div[4]/input")
	WebElement createLeaveDefinition;
	@FindBy(xpath="//strong[text()='Leave definition successfully created.']")
	WebElement message;

	public CreateaNewLeaveDefinitionoftypeNonLeave(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectLeaveDefinitions(){
		leaveDefinitions.click();
	}

	public void enterLeaveName(String value){
		leaveName.sendKeys(value);
	}

	public void enterShortName(String value){
		shortName.sendKeys(value);
	}

	public void clickCreateDefinition(){
		createLeaveDefinition.click();	
	}
	
	public String getTextMessage(){
		return message.getText();
	}
}
