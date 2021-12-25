package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class ToCheckNoofCasualLeaveDayseitherPrefixedorSuffixedtoHolidaytomarkH extends BasePage{
	
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
    @FindBy(xpath="//*[@id='leave-policy-master-list']/table/tbody/tr/td[contains(text(),'Default')]/parent::tr/td[4]/a")
	WebElement addLeaves;
    @FindBy(xpath="//*[@id='leave_policy_setting_details']/div[2]/table/tbody/tr/td[contains(text(),'Leave')]/parent::tr/td[3]/a")
    WebElement settingsLink;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_max_leave_month")
    WebElement casualLeaveallowedavaiformonth; 
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_max_leave_year")
    WebElement casualLeaveallowedavailforyear;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_min_leave_year")
    WebElement casualLeavemustbeAvailedinYear;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_min_days_applied")
    WebElement daysshouldbeappliedtoavailtheCasualLeave;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_max_days_applied")
    WebElement casualLeavethatcanbeavailedforinstance ;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_prior_days")
    WebElement PriorDays ;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_backdate")
    WebElement backDate;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_allow_half")
    WebElement allowHalfDay;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_avail_excess_leave")
    WebElement allowExcessLeave;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_excess_setting_general_setting")
    WebElement considerasLOP;
    @FindBy(xpath="//div [@id='behaviour_policy_setting']//div[3]//input[@value='Update']")
    WebElement updateButton;
    @FindBy(xpath="//strong[text()='Setting was successfully updated.']")
    WebElement successfullMessage;
    @FindBy(id="non_saved_leaves")
	WebElement leaveType;
    @FindBy(xpath="//input[@value='Add']")
    WebElement addButton;
    @FindBy(id="leave")
    WebElement ClickOnLeave;
    @FindBy(xpath="//*[@id='menu']/li[5]/div/div/ul/li[1]/a")
    //@FindBy(xpath="//*[@id='dt_leave_details']/tbody/tr/td[contains(text(),'Tina')]/parent::tr/td/a")
    WebElement ClickOnApplyLeave;
    @FindBy(id="filter_head")
    WebElement ClickOnFilter;
    @FindBy(xpath="//*[@id='bf_form']/div[10]/button[1]")
    WebElement ClickOnLoad;
    //@FindBy(xpath="//*[@id='dt_leave_details']/tbody/tr/td[3]/a")
    @FindBy(xpath="//*[@id='dt_leave_details']/tbody/tr/td[contains(text(),'Tina')]/parent::tr/td/a")
    WebElement ClickOnAPPLYLEAVE;
    @FindBy(id="leave_detail_leave_definition_id")
    WebElement SelectLeave;
    @FindBy(id="leave_detail_from_date")
    WebElement FromDate;
    @FindBy(id="leave_detail_to_date")
    WebElement ToDate;
    @FindBy(id="apply")
    WebElement Apply;
    @FindBy(xpath="//*[@id='apply_leave_response']/div/li")
    WebElement AlertMessage;
    @FindBy(xpath="//*[@id='main']/div/div[3]/nav/ul/li[3]/a/span")
    WebElement WeeklyOff;
    @FindBy(xpath="(//input[@id='leave_policy_head_wise_setting_holiday_settings_consider_leave'])[2]")
    WebElement LeaveHasHoliday;
    @FindBy(id="leave_policy_head_wise_setting_holiday_settings_days")
    WebElement HolidayNoofLeaveDays;
    @FindBy(id="leave_policy_head_wise_setting_holiday_settings_prefix")
    WebElement HolidayPrefix;
    @FindBy(xpath="//*[@id='holidy_weekly_off_setting']/input")
    WebElement UpdateButton;
    @FindBy(xpath="//*[@id='leave_policy_head_wise_settings_response']/div/strong")
    WebElement SuccessfulMessage;
    @FindBy(id="leave")
    WebElement LeaveLink;
    @FindBy(linkText="Apply Leave")
    WebElement AppyLeaveLink;
    @FindBy(id="filter_head")
    WebElement Filter;
    @FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
    WebElement Load;
    @FindBy(id="leave_detail_leave_definition_id")
	WebElement LeaveType;
    @FindBy(id="apply")
	WebElement ApplyButton;
	@FindBy(xpath="//*[@id=\"apply_leave_response\"]/div/strong")
	WebElement Message2;
	@FindBy(xpath="//*[@id='main']/div[2]/nav/ul/li[3]/a/span")
	WebElement LeaveHistory;
	@FindBy(xpath="//*[@id='leave_detail_for_employee']/table/tbody/tr/td[4]/a")
	WebElement View;
	@FindBy(xpath="//*[@id='batch_details']/form/table[3]/tbody/tr[2]/td/input[3]")
	WebElement DeleteButton;
	@FindBy(id="to_date")
	WebElement LeaveHistoryToDate;
	@FindBy(xpath="//*[@id='leave_range_data']/div[3]/div/div/input[2]")
	WebElement SearchButton;
	@FindBy(xpath="//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[4]/a")
	WebElement FromDatePicker;
	@FindBy(xpath="//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[6]/a")
	WebElement ToDatePicker;
	

	public ToCheckNoofCasualLeaveDayseitherPrefixedorSuffixedtoHolidaytomarkH(WebDriver driver) {
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
	public void clickWeeklyOff(){
		WeeklyOff.click();
	}
	public void clickHolidayLeaveCheckbox() {
		LeaveHasHoliday.click();
	}
	public void HolidayPrefixLeaves(String value) {
		HolidayNoofLeaveDays.clear();
		HolidayNoofLeaveDays.sendKeys(value);
		HolidayNoofLeaveDays.sendKeys(Keys.TAB);
	}
	public void clickHolidayPrefixCheckbox() {
		HolidayPrefix.click();
	}
	public void clickUpdateButton() {
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
	public void ClickOnApplyLeave() {
		ClickOnAPPLYLEAVE.click();
	}
	public void selectLeaveType(String value){
		dropDownSelect(LeaveType, value);
	}
	public void enterFromDate(String value){
		FromDate.sendKeys(value);
		FromDatePicker.click();
	}
	public void enterToDate(String value){
		ToDate.sendKeys(value);
		ToDatePicker.click();
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
	public void enterHistoryToDate(String value){
		LeaveHistoryToDate.clear();
		LeaveHistoryToDate.sendKeys(value);
		LeaveHistoryToDate.sendKeys(Keys.TAB);
	}
	public void clickSearchButton(){
		SearchButton.click();
	}
}