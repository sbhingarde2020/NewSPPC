package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class CreateState extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='States']")
	WebElement state;
	@FindBy(id="state_state_name")
	WebElement stateName;
	@FindBy(xpath="//input[@value='Create State']")
	WebElement createButton;
	@FindBy(xpath="//strong[text()='State was created successfully.']")
	WebElement successfullMessage;

	public CreateState(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectState(){
		state.click();
	}
	
	public void enterStateName(String value){
		stateName.sendKeys(value);
	}
	
	public void clickCreateButton(){
		createButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}