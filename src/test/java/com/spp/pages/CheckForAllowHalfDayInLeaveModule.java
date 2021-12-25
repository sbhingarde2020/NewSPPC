package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckForAllowHalfDayInLeaveModule extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[3]/ul/li[2]/a")
	WebElement leavePolicy;
	@FindBy(xpath="//*[@id='leave-policy-master-list']/table/tbody/tr/td[contains(text(),'Default')]/parent::tr/td[4]/a")
	WebElement addLeaves;
	@FindBy(xpath="//*[@id='leave_policy_setting_details']/div/table/tbody/tr/td[contains(text(),'Leave')]/parent::tr/td[3]/a")
	WebElement settingsLink;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_max_leave_month")
    WebElement AvailForMonth;
    @FindBy(xpath="//*[@id='behaviour_policy_setting']/div[3]/input")
    WebElement UpdateButton;
    @FindBy(xpath="//*[@id=\"leave_policy_head_wise_settings_response\"]/div/strong")
    WebElement SuccessfulMessage;
    @FindBy(id="leave")
    WebElement LeaveLink;
    @FindBy(xpath="(//input[@id=\"leave_policy_head_wise_setting_behaviour_settings_allow_half\"])[2]")
    WebElement allowHalfDay;
    @FindBy(linkText="Apply Leave")
    WebElement AppyLeaveLink;
    @FindBy(id="filter_head")
    WebElement Filter;
    @FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
    WebElement Load;
    @FindBy(xpath="//*[@id='dt_leave_details']/tbody/tr/td[contains(text(),'Tina')]/parent::tr/td/a")
    WebElement ClickOnAPPLYLEAVE;
	@FindBy(id="leave_detail_leave_definition_id")
	WebElement LeaveType;
	@FindBy(id="leave_detail_from_date")
	WebElement FromDate;
	@FindBy(id="leave_detail_to_date")
	WebElement ToDate;
	@FindBy(id="to_date")
	WebElement LeaveHistoryToDate;
	@FindBy(xpath="//input[contains(@name,'second')]")
	WebElement SecondHalf;
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
	@FindBy(xpath="//*[@id='leave_range_data']/div[3]/div/div/input[2]")
	WebElement SearchButton;
	@FindBy(id="leave_policy_head_wise_setting_behaviour_settings_max_leave_month")
    WebElement casualLeaveallowedavaiformonth;
	 @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_max_leave_year")
	    WebElement casualLeaveallowedavailforyear;
	public CheckForAllowHalfDayInLeaveModule(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
	public void clickAllowHalfDay(){
		if(allowHalfDay.isSelected()) {
			System.out.println("Already Selected");
		}
		else {
		allowHalfDay.click();
		}
	}
	public void enterCasualLeaveallowedavailforyear(String value){
		casualLeaveallowedavailforyear.clear();
		casualLeaveallowedavailforyear.sendKeys(value);
	}
	public void enterCasualLeaveallowedavaiformonth(String value){
		casualLeaveallowedavaiformonth.clear();
		casualLeaveallowedavaiformonth.sendKeys(value);
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
	public void ClickOnApplyLeave() {
		ClickOnAPPLYLEAVE.click();
	}
	public void enterFromDate(String value){
		FromDate.sendKeys(value);
	}
	public void enterToDate(String value){
		ToDate.sendKeys(value);
		ToDate.sendKeys(Keys.TAB);
	}
	public void enterHistoryToDate(String value){
		LeaveHistoryToDate.clear();
		LeaveHistoryToDate.sendKeys(value);
		LeaveHistoryToDate.sendKeys(Keys.TAB);
	}
	public void selectSecondHalf(){
		SecondHalf.click();
	}
	public void clickApplyButton(){
		ApplyButton.click();
	}
	public String getMessage2(){
		return Message2.getText();
	}
	
	public void selectLeaveType(String value){
		dropDownSelect(LeaveType, value);
	}
	public void clickSearchButton(){
		SearchButton.click();
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