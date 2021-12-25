package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CloneLeavePolicy extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
	@FindBy(xpath="//a[text()='Clone Leave Policy']")
	WebElement clonePolicy;
	@FindBy(id="leave_policy_master_policy_name")
	WebElement policyName;
	@FindBy(id="old_policy")
	WebElement cloneOfDropdown;
	@FindBy(xpath="//input[@value='Create Leave Policy Master']")
	WebElement createButton;
	@FindBy(xpath="//strong[text()='Leave policy master successfully Cloned']")
	WebElement successfullMessage;

	public CloneLeavePolicy(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectLeavePolicy(){
		leavePolicy.click();
	}
	
	public void clickClonePolicy(){
		clonePolicy.click();
	}
	
	public void enterPolicyName(String value){
		policyName.sendKeys(value);
	}

	public void selectCloneOfDropdown(String value){
		dropDownSelect(cloneOfDropdown, value);
	}
	
	public void clickCreateButton(){
		createButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
