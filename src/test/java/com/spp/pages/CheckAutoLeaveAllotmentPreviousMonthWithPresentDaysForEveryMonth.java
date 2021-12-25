package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckAutoLeaveAllotmentPreviousMonthWithPresentDaysForEveryMonth extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
    @FindBy(xpath="//div[@id='leave-policy-master-list']//tr[1]//td[4]//a[text()='Add Leaves']")
	WebElement addLeaves;
   // @FindBy(xpath="//*[@id=\"leave_policy_setting_details\"]/div[2]/table/tbody/tr/td[2][contains(text(),'Earned')]/parent::tr/td[3]/a")
    @FindBy(xpath="//*[@id=\"leave_policy_setting_details\"]/div[2]/table/tbody/tr/td[2][contains(text(),'Casual')]/parent::tr/td[3]/a")
    WebElement settingsLink;
    @FindBy(xpath="//*[@id=\"main\"]/div/div[3]/nav/ul/li[4]/a/span")
    WebElement AutoAllotTab;
    @FindBy(id="auto_leave_allotment")
    WebElement LeaveAllotmentBox;
    @FindBy(id="leave_policy_head_wise_setting_auto_allot_settings_allot_type")
    WebElement AllotType;
    @FindBy(xpath="//*[@id=\"auto_allot_setting\"]/table/tbody/tr[1]/td[1]/fieldset/div/table/tbody/tr[2]/td[2]/div[2]/select")
    WebElement AllotOn;
    @FindBy(xpath="//*[@id=\"auto_leave_allotment_div\"]/table/tbody/tr[4]/td[2]/div[1]/select")
    WebElement EveryMonth;
    @FindBy(id="leave_policy_head_wise_setting_auto_allot_settings_effective_from")
    WebElement EffectiveFrom;
    @FindBy(xpath="//*[@id=\"auto_leave_config_div\"]/fieldset/table/tbody/tr[2]/td[2]/input")
    WebElement NoOfLeaves;
    @FindBy(id="leave_policy_head_wise_setting_auto_allot_settings_period")
    WebElement PeriodInDays;
    
    @FindBy(xpath="//*[@id=\"auto_allot_setting\"]/table/tbody/tr[3]/td/input")
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
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/nav/ul/li[2]/a/span")
	WebElement LeaveSummaryTab;
	@FindBy(xpath="//*[@id=\"menu\"]/li[8]/a")
	WebElement Report;
	@FindBy(xpath="//*[@id=\"menu\"]/li[8]/div/div[1]/ul/li[7]/a")
	WebElement AdvanceLeaveReport;
	@FindBy(id="leave_report_type")
	WebElement LeaveReport;
	@FindBy(id="leave_policy")
	WebElement LeavePolicy;
	@FindBy(id="paymonth")
	WebElement Paymonth;
	@FindBy(id="select_all_leaves")
	WebElement SelectAllCheckBox;
	@FindBy(id="leave_report_employees")
	WebElement GetEmployee;
	
	@FindBy(xpath="//*[@id=\"leave_report_table\"]/tbody/tr[1]/td[1]/input")
	WebElement Employee1;
	@FindBy(xpath="//*[@id=\"leave_report_table\"]/tbody/tr[2]/td[1]/input")
	WebElement Employee2;
	@FindBy(id="leave_report_submit")
	WebElement GenerateReport;
	
	public CheckAutoLeaveAllotmentPreviousMonthWithPresentDaysForEveryMonth(WebDriver driver) {
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
	
	public void clickAutoAllotTab(){
		AutoAllotTab.click();
	}
	public void clickLeaveAllotmentBox(){
		LeaveAllotmentBox.click();
	}
	public void SelectAllotType(String value) {
		dropDownSelect(AllotType, value);
	}
	public void SelectAllotOn(String value) {
		dropDownSelect(AllotOn, value);
	}
	public void SelectEveryMonth(String value) {
		dropDownSelect(EveryMonth, value);
	}
	public void SelectEffectiveFrom(String value) {
		dropDownSelect(EffectiveFrom, value);
	}
	public void enterNoOfLeaves(String value) {
		NoOfLeaves.sendKeys(value);
	}
	public void enterPeriodInDays(String value) {
		PeriodInDays.sendKeys(value);
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
	
	
	public void clickApplyLeave(){
		ApplyLeave.click();
	}
	public void clickLeaveSummaryTab(){
		LeaveSummaryTab.click();
	}
	public void clickReport(){
		Report.click();
	}
	public void clickAdvanceLeaveReport(){
		AdvanceLeaveReport.click();
	}
	public void selectLeaveReport(String value) {
		dropDownSelect(LeaveReport, value);
	}
	public void selectLeavePolicy(String value) {
		dropDownSelect(LeavePolicy, value);
	}
	public void clickPaymonth(String value){
		Paymonth.clear();
		Paymonth.sendKeys(value);
	}
	public void clickSelectAllCheckBox(){
		SelectAllCheckBox.click();
	}
	public void clickGetEmployee(){
		GetEmployee.click();
	}
	public void clickLoad(){
		Load.click();
	}
	public void clickEmployee1(){
		Employee1.click();
	}
	
	public void clickEmployee2(){
		Employee2.click();
	}
	public void clickGenerateReport(){
		GenerateReport.click();
	}
}
