package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateWeeklyOffDetailsofanEmployee extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement ClickOnEmployDetails;
	@FindBy(id="filter_head")
	WebElement ClickOnFilterHead;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"employees_dtable\"]/tbody/tr/td[contains(text(),'Anil')]/parent::tr/td[6]/a[1]")
	WebElement ClickonView;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-2\"]/h3")
	WebElement ClickOnGeneral;
	@FindBy(xpath="//*[@id=\"weekly_off\"]/a")
	WebElement ClickonWeeklyOff;
	@FindBy(xpath="//*[@id=\"weekly_off_list\"]/div[1]/span/a")
	WebElement AddNewWeeklyOff;
	@FindBy(id="eff_from")
	WebElement EffectiveFromDate;
	@FindBy(id="eff_to")
	WebElement EffectiveTillDate;
	@FindBy(id="attendance_weekly_off_first_week_first_off")
	WebElement FirstWeeklyOff;
	@FindBy(id="attendance_weekly_off_first_week_off_1")
	WebElement EnterHalforFullDay1;
	@FindBy(id="attendance_weekly_off_first_week_second_off")
	WebElement SecondWeeklyOff;
	@FindBy(id="attendance_weekly_off_first_week_off_2")
	WebElement EnterHalforFullDay2;
	@FindBy(xpath="//*[@id=\"new_attendance_weekly_off\"]/div[4]/input")
	WebElement CreateWeeklyOff;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfulmessage;
	
	
	public CreateWeeklyOffDetailsofanEmployee(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonemployeedetails() {
		ClickOnEmployDetails.click();
	}
	public void clickonfilter() {
		ClickOnFilterHead.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonview() {
		ClickonView.click();
	}
	public void clickongeneral() {
		ClickOnGeneral.click();
	}
	public void clickonweeklyoff() {
		ClickonWeeklyOff.click();
	}
	public void addnewweeklyoff() {
		AddNewWeeklyOff.click();
	}
	public void selecteffectivefromdate(String value) {
		EffectiveFromDate.sendKeys(value);
	}
	public void selecteffectivetilldate(String value) {
		EffectiveTillDate.sendKeys(value);
	}
	public void firstweeklyoff(String value) {
		dropDownSelect(FirstWeeklyOff, value);
	}
	public void secondweeklyoff(String value) {
		dropDownSelect(SecondWeeklyOff, value);
	}
	public void enterfirstorsecondhalf1(String value) {
		dropDownSelect(EnterHalforFullDay1, value);
	}
	public void enterfirstorsecondhalf2(String value) {
		dropDownSelect(EnterHalforFullDay2, value);
	}
	public void createweeklyoff() {
		CreateWeeklyOff.click();
	}
	public String getMessage(){
		return successfulmessage.getText();
	}
}
