package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckExcessCasualLeaveTakenAsLOP extends BasePage {

	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[3]/ul/li[2]/a")
	WebElement leavePolicy;
    @FindBy(xpath="//*[@id='leave-policy-master-list']/table/tbody/tr[1]/td[4]/a")
	WebElement addLeaves;
    @FindBy(xpath="//*[@id=\"leave_policy_setting_details\"]/div[2]/table/tbody/tr[5]/td[3]/a")
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
	@FindBy(id="apply")
	WebElement ApplyButton;
	@FindBy(xpath="//*[@id=\"apply_leave_response\"]/div/strong")
	WebElement Message2;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/nav/ul/li[3]/a/span")
	WebElement LeaveHistory;
	@FindBy(xpath="//*[@id=\"leave_detail_for_employee\"]/table/tbody/tr/td[4]/a")
	WebElement View;
	@FindBy(xpath="//*[@id=\"batch_details\"]/form/table[3]/tbody/tr[2]/td/input[3]")
	WebElement DeleteButton;
	public CheckExcessCasualLeaveTakenAsLOP(WebDriver driver) {
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
	public void selectLeaveType(String value){
		dropDownSelect(LeaveType, value);
	}
	public void enterFromDate(String value){
		FromDate.sendKeys(value);
	}
	public void enterToDate(String value){
		ToDate.sendKeys(value);
		ToDate.sendKeys(Keys.TAB);
	}
	
	public void clickApplyButton(){
		ApplyButton.click();
	}
	public String getMessage2(){
		return Message2.getText();
	}
	public void selectLeaveHistory(){
		LeaveHistory.click();
	}
	public void selectView(){
		View.click();
	}
	public void clickDeleteButton(){
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	
	

    
    
}
