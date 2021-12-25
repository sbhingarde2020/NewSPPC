package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class SearchtheLeavesApplied extends BasePage{
	@FindBy(id="leave")
	WebElement ClickOnLeave;
	@FindBy(xpath="//*[@id=\"menu\"]/li[5]/div/div/ul/li[1]/a")
	WebElement ClickOnApplyLeave;
	@FindBy(id="filter_head")
	WebElement ClickOnFilterHead;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id='dt_leave_details']/tbody/tr/td[contains(text(),'Tina')]/parent::tr/td[3]/a")
	WebElement ApplyLeave;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/nav/ul/li[3]/a")
	WebElement CheckLeaveHistory;
	@FindBy(xpath="//*[@id=\"from_date\"]")
	WebElement SelectFromdate;
	@FindBy(id="to_date")
	WebElement SelectToDate;
	@FindBy(xpath="//*[@id=\"leave_range_data\"]/div[3]/div/div/input[2]")
	WebElement ClickOnSearch;
	
	public SearchtheLeavesApplied(WebDriver driver) {
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
	public void checkleavehistory() {
		CheckLeaveHistory.click();
	}
	public void selectfromdate(String value) {
		SelectFromdate.clear();
		SelectFromdate.sendKeys(value);
	}
	public void selectodate(String value) {
		SelectToDate.clear();
		SelectToDate.sendKeys(value);
	}
	public void clickonsearch() {
		ClickOnSearch.click();
	}
}
