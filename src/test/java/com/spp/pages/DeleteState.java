package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteState extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='States']")
	WebElement state;
	@FindBy(xpath="//tr/td[contains(text(),'Arunachal Pradesh')]/parent::tr/td[3]/a")
	WebElement deleteButton;
	@FindBy(xpath="//strong[text()='State was successfully deleted.']")
	WebElement successfullMessage;

	public DeleteState(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectState(){
		state.click();
	}
	
	public void clickDeleteButton(){
		deleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}