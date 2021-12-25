package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class ApplyUserDefinedtLeave extends BasePage{
	@FindBy(id="leave")
	WebElement ClickOnLeave;
	@FindBy(xpath="//*[@id=\"menu\"]/li[5]/div/div/ul/li[1]/a")
	WebElement ClickOnApplyLeave;
	@FindBy(id="filter_head")
	WebElement ClickOnFilterHead;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"dt_leave_details\"]/tbody/tr/td[contains(text(),'Ankit')]/parent::tr/td[3]/a")
	WebElement ApplyLeave;
	@FindBy(id="leave_detail_leave_definition_id")
	WebElement SelectLeaveType;
	@FindBy(id="leave_detail_from_date")
	WebElement SelectFromDate;
	@FindBy(id="leave_detail_to_date")
	WebElement SelectToDate;
	@FindBy(xpath="//*[@id=\"apply\"]")
	WebElement ClickOnApply;
	@FindBy(xpath="//*[@id=\"apply_leave_response\"]/div/strong")
	WebElement successfullmessage;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/nav/ul/li[2]/a/span")
	WebElement CheckLeaveSummary;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/nav/ul/li[3]/a")
	WebElement CheckLeaveHistory;


	public ApplyUserDefinedtLeave(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	public void clickonleave() {
		ClickOnLeave.click();
	}
	public void clickonapplyleave() {
		ClickOnApplyLeave.click();
	}
	public void clickonfilterhead() {
		ClickOnFilterHead.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void applyleave() {
		ApplyLeave.click();
	}
	public void selectleavetype(String value) {
		dropDownSelect(SelectLeaveType, value);
	}
	public void selectfromdate(String value) {
		SelectFromDate.sendKeys(value);
	}
	public void selecttodate(String value) {
		SelectToDate.sendKeys(value);
	}
	public void clickonapply() {
		ClickOnApply.click();
	}
	public String getMessage(){
		return successfullmessage.getText();
	}
	public void checkleavesummary() {
		CheckLeaveSummary.click();
	}
	public void checkleavehistory() {
		CheckLeaveHistory.click();
	}

}
