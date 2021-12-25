package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class LeaveEncashmentLumpsumUnitRate extends BasePage{

	@FindBy(id="leave")
	WebElement ClickOnLeave;
	@FindBy(xpath="//a[text()='Leave Encashment']")
	WebElement ClickOnLeaveEncashment;
	@FindBy(id="filter_head")
	WebElement ClickOnFilter;
	@FindBy(xpath="//button[text()='LOAD']")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"dt_leave_encashment\"]/tbody/tr/td[contains(text(),'Ankit')]/parent::tr/td[3]/a")
	WebElement ClickOnView;
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
	@FindBy(xpath="//strong[text()='Leave encashment successfully created.']")
	WebElement SuccessfulMessage;
	
	public LeaveEncashmentLumpsumUnitRate(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

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
		ClickOnView.click();
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
	public String getMessage() {
		return SuccessfulMessage.getText();
	}

}
