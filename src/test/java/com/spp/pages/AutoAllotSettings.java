package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AutoAllotSettings extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
    @FindBy(xpath="//div[@id='leave-policy-master-list']//tr[1]//td[4]//a[text()='Add Leaves']")
	WebElement addLeaves;
    @FindBy(xpath="//*[@id=\"leave_policy_setting_details\"]/div[2]/table/tbody/tr[5]/td[3]/a")
    WebElement settingsLink;
    @FindBy(xpath="//div[@id='main']//div[3]//li[4]//span[normalize-space(text()='Auto Allot Settings')]")
    WebElement autoAllot;
    @FindBy(id="auto_leave_allotment")
    WebElement leaveAllotment;
    @FindBy(id="leave_policy_head_wise_setting_auto_allot_settings_allot_type")
    WebElement allotType;
    @FindBy(xpath="(//select[@id='leave_policy_head_wise_setting_auto_allot_settings_allot_on'])[1]")
    WebElement allotOn;
    @FindBy(id="leave_policy_head_wise_setting_auto_allot_settings_round_off")
    WebElement roundOff;
    @FindBy(id="leave_policy_head_wise_setting_auto_allot_settings_effective_from")
    WebElement effectiveFrom;
    @FindBy(id="leave_policy_head_wise_setting_auto_allot_settings_no_of_days")
    WebElement numberOfDays;
    @FindBy(xpath="//form[@id='auto_allot_setting']//tr[3]//input[@value='Update']")
    WebElement updateButton;
	@FindBy(xpath="//strong[text()='Setting was successfully updated.']")
	WebElement successfullMessage;

	public AutoAllotSettings(WebDriver driver) {
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
	
	public void clickAutoAllot(){
		autoAllot.click();
	}
	
	public void clickLeaveAllotment(){
		leaveAllotment.click();
	}
	
	public void selectAllotType(String value){
		dropDownSelect(allotType, value);
	}
	
	public void selectAllotOn(String value){
		dropDownSelect(allotOn, value);
	}
	
	public void selectRoundOff(String value){
		dropDownSelect(roundOff, value);
	}
	
	public void selectEffectiveFrom(String value){
		dropDownSelect(effectiveFrom, value);
	}
	
	public void enterNumberOfDays(String value){
		numberOfDays.sendKeys(value);
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
