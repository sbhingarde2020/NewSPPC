package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckMaxNoOfCasualLeaveAllowedAvailForMonth extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
    @FindBy(xpath="//*[@id=\"leave-policy-master-list\"]/table/tbody/tr/td[contains(text(),'newLeavepolicy_91637')]/parent::tr/td[4]/a")
	WebElement addLeaves;
    @FindBy(xpath="//*[@id=\"leave_policy_setting_details\"]/div[2]/table/tbody/tr/td[contains(text(),'Casual Leave')]/parent::tr/td[3]/a")
    WebElement settingsLink;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_max_leave_month")
    WebElement AvailForMonth;
    @FindBy(xpath="//*[@id=\"behaviour_policy_setting\"]/div[3]/input")
    WebElement UpdateButton;
    @FindBy(xpath="//*[@id=\"leave_policy_head_wise_settings_response\"]/div/strong")
    WebElement SuccessfulMessage;
    @FindBy(id="leave")
    WebElement LeaveLink;
    @FindBy(linkText="Apply Leave")
    WebElement AppyLeaveLink;
    @FindBy(id="filter_head")
    WebElement Filter;
    @FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
    WebElement Load;
    @FindBy(xpath="//*[@id=\"dt_leave_details\"]/tbody/tr[1]/td[3]/a")
    WebElement ApplyLeave;
	@FindBy(id="leave_detail_leave_definition_id")
	WebElement LeaveType;
	@FindBy(id="leave_detail_from_date")
	WebElement FromDate;
	@FindBy(id="leave_detail_to_date")
	WebElement ToDate;
	@FindBy(xpath="//*[@id=\"apply_leave_response\"]/div/li")
	WebElement Message;
	@FindBy(id="apply")
	WebElement ApplyButton;
	public CheckMaxNoOfCasualLeaveAllowedAvailForMonth(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectLeavePolicy(){
		leavePolicy.click();
	}
	
	public void clickAddLeaves(){
		addLeaves.click();
	}
	
	public void clickSettingsLink(){
		settingsLink.click();
	}
	
	public void clickAvailForMonth(String value){
		AvailForMonth.clear();
		AvailForMonth.sendKeys(value);
	}
	
	public void clickUpdateButton(){
		UpdateButton.click();
	}
	public String getMessage1(){
		return SuccessfulMessage.getText();
	}
	public void clickLeaveLink(){
		LeaveLink.click();
	}
	public void clickAppyLeaveLink(){
		AppyLeaveLink.click();
	}
	public void clickFilter(){
		Filter.click();
	}
	
	public void clickLoad(){
		Load.click();
	}
	public void clickApplyLeave(){
		ApplyLeave.click();
	}
	public void enterFromDate(String value){
		FromDate.sendKeys(value);
	}
	public void enterToDate(String value){
		ToDate.sendKeys(value);
		ToDate.sendKeys(Keys.TAB);
	}
	public String getMessage2(){
		return Message.getText();
	}
	
	public void clickApplyButton(){
		ApplyButton.click();
	}
	
	public void selectLeaveType(String value){
		dropDownSelect(LeaveType, value);
	}
	
	
}
