package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class GenerateMonthlyAttendanceTemplate extends BasePage{
	@FindBy(id="leave")
	WebElement ClickOnLeave;
	@FindBy(xpath="//*[@id='menu']/li[5]/div/div/ul/li[5]/a")
	WebElement ClickOnMonthlyAttendance;
	@FindBy(xpath="//*[@id='ui-accordion-accordion-header-1']/h3")
	WebElement SelectMonthlyAttendance;
	@FindBy(xpath="//*[@id='ui-accordion-accordion-panel-1']/li/a[contains(text(),'Generate Monthly Attendance ExcelTemplate')]")
	WebElement GenerateMonthlyAttendance;
	@FindBy(id="paymonth_id")
	WebElement SelectPayMonth;
	@FindBy(id="leave_policy_master")
	WebElement SelectLeavePolicy;
	@FindBy(xpath="//*[@id='main']/div[4]/div/form/fieldset/div[4]/input")
	WebElement GenerateTemplate;
	
	public GenerateMonthlyAttendanceTemplate(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	public void clickonleave() {
		ClickOnLeave.click();
	}
	public void clickonmonthlyattendance() {
		ClickOnMonthlyAttendance.click();
	}
	public void selectmonthlyattendance() {
		SelectMonthlyAttendance.click();
	}
	public void generatemonthlyattendance() {
		GenerateMonthlyAttendance.click();
	}
	public void selectpaymonth(String value) {
		dropDownSelect(SelectPayMonth, value);
	}
	public void selectleavepolicy(String value) {
		dropDownSelect(SelectLeavePolicy, value);
	}
	public void generatetemplate() {
		GenerateTemplate.click();
	}	
}