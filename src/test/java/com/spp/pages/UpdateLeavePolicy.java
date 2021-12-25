package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateLeavePolicy extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
	@FindBy(xpath="//*[@id=\"leave-policy-master-list\"]/table/tbody/tr/td[contains(text(),'LeavePolicy')]/parent::tr/td[5]/a")
	WebElement editLink;
	@FindBy(id="leave_policy_master_policy_name")
	WebElement policyName;
	@FindBy(id="leave_policy_master_attendance_type_id")
	WebElement leaveDropDown;
    @FindBy(id="leave_policy_master_remarks")
    WebElement remarks;
    @FindBy(xpath="//input[@value='Update Leave Policy Master']")
    WebElement updateLeavePolicy;
    @FindBy(xpath="//strong[text()='Leave policy master successfully updated']")
    WebElement successfullMessage;
    

	public UpdateLeavePolicy(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectLeavePolicy(){
		leavePolicy.click();
	}
	
	public void clickEditLink(){
		editLink.click();
	}
	
	public void enterPolicyName(String value){
		policyName.clear();
		policyName.sendKeys(value);
	}
	
	public void selectLeaveType(String value){
		dropDownSelect(leaveDropDown,value);
	}
	
	public void enterRemarks(String value){
		remarks.clear();
		remarks.sendKeys(value);
	}
	
	public void clickUpdateLeavePolicy(){
		updateLeavePolicy.click();;
	}
	
	public String getMessage(){
		return successfullMessage.getText();
		
	}
}
