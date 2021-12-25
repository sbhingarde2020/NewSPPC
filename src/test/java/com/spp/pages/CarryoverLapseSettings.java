package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CarryoverLapseSettings extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
    @FindBy(xpath="//div[@id='leave-policy-master-list']//tr[1]//td[4]//a[text()='Add Leaves']")
	WebElement addLeaves;
    @FindBy(xpath="//*[@id=\"leave_policy_setting_details\"]/div[2]/table/tbody/tr[5]/td[3]/a")
    WebElement settingsLink;
	@FindBy(xpath="//div[@id='main']//div[3]//li[2]//span[normalize-space(text()='Lapse/Carry Over/Encashment')]")
	WebElement encashmentTab;
	@FindBy(id="leave_policy_head_wise_setting_carry_over_lapse_settings_carry_over")
	WebElement carryOver;
	@FindBy(id="leave_policy_head_wise_setting_carry_over_lapse_settings_lower_limit")
	WebElement lowerLimit;
	@FindBy(id="leave_policy_head_wise_setting_carry_over_lapse_settings_lower_limit_value")
	WebElement lowerLimitValue;
	@FindBy(id="leave_policy_head_wise_setting_carry_over_lapse_settings_upper_limit")
	WebElement upperLimit;
	@FindBy(id="leave_policy_head_wise_setting_carry_over_lapse_settings_upper_limit_value")
	WebElement upperLimitValue;
	@FindBy(id="leave_policy_head_wise_setting_carry_over_lapse_settings_lapse_unavailed_on")
	WebElement lapseUnavailedOn;
	@FindBy(id="leave_policy_head_wise_setting_carry_over_lapse_settings_lapse_type")
	WebElement lapseDropdown;
	@FindBy(id="leave_policy_head_wise_setting_carry_over_lapse_settings_lapse_exceeding")
	WebElement lapseExceeding;
	@FindBy(id="update_carry_over_lapse")
	WebElement updateButton;
	@FindBy(xpath="//strong[text()='Setting was successfully updated.']")
	WebElement successfullMessage;

	public CarryoverLapseSettings(WebDriver driver) {
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
	
	public void clickLapseTab(){
		encashmentTab.click();
	}
	
	public void clickCarryOver(){
		carryOver.click();
	}
	
	public void clickLowerLimit(){
		lowerLimit.click();
	}
	
	public void enterLowerLimitValue(String value){
		lowerLimitValue.clear();
		lowerLimitValue.sendKeys(value);
	}
	
	public void clickUpperLimit(){
		upperLimit.click();
	}
	
	public void enterUpperLimitValue(String value){
		upperLimitValue.clear();
		upperLimitValue.sendKeys(value);
	}
	
	public void clickLapseUnavailedOn(){
		lapseUnavailedOn.click();
	}
	
	public void selectLapseDropdown(String value){
		dropDownSelect(lapseDropdown, value);
	}
	
	public void enterLapseExceeding(String value){
		lapseExceeding.clear();
		lapseExceeding.sendKeys(value);
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
