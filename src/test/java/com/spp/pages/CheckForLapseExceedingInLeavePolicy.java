package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckForLapseExceedingInLeavePolicy extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
    @FindBy(xpath="//div[@id='leave-policy-master-list']//tr[1]//td[4]//a[text()='Add Leaves']")
	WebElement addLeaves;
   // @FindBy(xpath="//*[@id=\"leave_policy_setting_details\"]/div[2]/table/tbody/tr/td[2][contains(text(),'Earned')]/parent::tr/td[3]/a")
    @FindBy(xpath="//*[@id=\"leave_policy_setting_details\"]/div[2]/table/tbody/tr/td[2][contains(text(),'Casual')]/parent::tr/td[3]/a")
    WebElement settingsLink;
    @FindBy(xpath="//*[@id=\"main\"]/div/div[3]/nav/ul/li[2]/a/span")
    WebElement LapseTab;
    @FindBy(xpath="//*[@id=\"lapse_carryover_encashment_sets\"]/fieldset/legend/label/input")
    WebElement CarryOver;
    @FindBy(xpath="//*[@id=\"excess_div\"]/table/tbody/tr[2]/td[1]/label/input[1]")
    WebElement clickLapseUnavailed;
    @FindBy(xpath="//*[@id=\"excess_div\"]/table/tbody/tr[3]/td[1]/select")
    WebElement Dropdown;
    @FindBy(xpath="//*[@id=\"excess_div\"]/table/tbody/tr[4]/td/div/select")
    WebElement Dropdown1;
    @FindBy(xpath="//*[@id=\"excess_div\"]/table/tbody/tr[3]/td[2]/label/input")
    WebElement LapseExceeding;
    @FindBy(id="update_carry_over_lapse")
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
	
	public CheckForLapseExceedingInLeavePolicy(WebDriver driver) {
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
		LapseTab.click();
	}
	public void clickCarryOver(){
		CarryOver.click();
	}
	public void clickLapseUnavailed(){
		clickLapseUnavailed.click();
	}
	public void enterDropdown(String value) {
		dropDownSelect(Dropdown, value);
	}
	public void enterDropdown1(String value) {
		dropDownSelect(Dropdown1, value);
	}
	public void clickLapseExceeding(String value){
		//LapseExceeding.clear();
		LapseExceeding.sendKeys(value);
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
