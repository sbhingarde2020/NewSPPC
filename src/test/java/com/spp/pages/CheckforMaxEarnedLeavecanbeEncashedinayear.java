package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckforMaxEarnedLeavecanbeEncashedinayear extends BasePage{
	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement ClickOnLeavePolicy;
	@FindBy(xpath="//*[@id=\"leave-policy-master-list\"]/table/tbody/tr/td[contains(text(),'PolicyNo1')]/parent::tr/td[4]/a")
	WebElement ClickOnAddLeaves;
	@FindBy(xpath="//*[@id=\"leave_policy_setting_details\"]/div/table/tbody/tr/td[contains(text(),'Earned Leave')]/parent::tr/td[3]/a")
	WebElement ClickOnSettings;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[3]/nav/ul/li[2]/a/span")
	WebElement ClickOnLapseCarry;
	@FindBy(id="leave_policy_head_wise_setting_encashment_settings_encash")
	WebElement AllowLeavetobeEncashed;
	@FindBy(id="leave_policy_head_wise_setting_encashment_settings_min_encash")
	WebElement MinimumLeaveEncash;
	@FindBy(id="leave_policy_head_wise_setting_encashment_settings_max_encash")
	WebElement MaxLeaveEncashinaYear;
	@FindBy(xpath="//*[@id=\"lapse_carryover_encashment_sets\"]/table/tbody/tr[6]/td/input")
	WebElement ClickOnUpdate;
	@FindBy(xpath="//strong[text()='Setting was successfully updated.']")
	WebElement successfulmessage;
	@FindBy(id="leave")
	WebElement ClickOnLeave;
	@FindBy(xpath="//a[text()='Leave Encashment']")
	WebElement ClickOnLeaveEncashment;
	@FindBy(id="filter_head")
	WebElement ClickOnFilter;
	@FindBy(xpath="//button[text()='LOAD']")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"dt_leave_encashment\"]/tbody/tr/td[contains(text(),'Ankit')]/parent::tr/td[3]/a")
	WebElement ClickonView;
	@FindBy(xpath="//a[text()='Add New Leave Encashment']")
	WebElement AddNewLeaveEncashment;
	@FindBy(id="leave_encashment_month_year")
	WebElement SelectMonth;
	@FindBy(id="leave_encashment_leave_definition_id")
	WebElement SelectLeave;
	@FindBy(id="leave_encashment_no_of_encashed_leave")
	WebElement EnterNoofLeaves;
	@FindBy(id="leave_encashment_unit_rate")
	WebElement EnterUnitRate;
	@FindBy(id="leave_encashment_in_salary")
	WebElement CheckShowInSalary;
	@FindBy(xpath="//*[@id=\"new_leave_encashment\"]/table/tbody/tr[13]/td/input")
	WebElement ClickOnSave;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/li")
	WebElement ClickOnAlertMessage;
	
	
	
	
	public CheckforMaxEarnedLeavecanbeEncashedinayear(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void clickonmaster() {
		ClickOnMaster.click();
	}
	public void clickonleavepolicy() {
		ClickOnLeavePolicy.click();
	}
	public void clickonaddeaves() {
		ClickOnAddLeaves.click();
	}
	public void clickonsettings() {
		ClickOnSettings.click();
	}
	public void clickonlapsecarry() {
		ClickOnLapseCarry.click();
	}
	public void allowleavetobeencashed() {
		AllowLeavetobeEncashed.click();
	}
	public void enterminleaveencash(String value) {
		MinimumLeaveEncash.clear();
		MinimumLeaveEncash.sendKeys(value);
	}
	public void entermaxleaveencash(String value) {
		MaxLeaveEncashinaYear.clear();
		MaxLeaveEncashinaYear.sendKeys(value);
	}
	public void clickonupdate() {
		ClickOnUpdate.click();
	}
	public String successfulmessage() {
		return successfulmessage.getText();
	}
	public void clickonleave() {
		ClickOnLeave.click();
	}
	public void clickonleaveencashment() {
		ClickOnLeaveEncashment.click();
	}
	public void clickonfilter() {
		ClickOnFilter.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonview() {
		ClickonView.click();
	}
	public void addnewleaveencashment() {
		AddNewLeaveEncashment.click();
	}
	public void selectmonth(String value) {
		dropDownSelect(SelectMonth, value);
	}
	public void selectleave(String value) {
		dropDownSelect(SelectLeave, value);
	}
	public void enternoofleaves(String value) {
		EnterNoofLeaves.clear();
		EnterNoofLeaves.sendKeys(value);
	}
	public void enterunitrate(String value) {
		EnterUnitRate.clear();
		EnterUnitRate.sendKeys(value);
	}
	public void checkshowinsalary() {
		CheckShowInSalary.click();
	}
	public void clickonsave() {
		ClickOnSave.click();
	}
	public String getalertmessage() {
		return ClickOnAlertMessage.getText();
	}
}
