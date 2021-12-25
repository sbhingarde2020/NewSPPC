package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;


public class UpdateWeeklyOff extends BasePage{
	
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement ClickOnEmployeeDetails;
	@FindBy(id="filter_head")
	WebElement ClickonFilter;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"employees_dtable\"]/tbody/tr/td[contains(text(),'Anil')]/parent::tr/td[6]/a[1]")
	WebElement ClickonView;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-2\"]/h3")
	WebElement ClickOnGeneral;
	@FindBy(xpath="//*[@id=\"weekly_off\"]/a")
	WebElement ClickOnWeeklyOffDetails;
	@FindBy(xpath="//*[@id=\"weekly_off_list\"]/div[2]/table/tbody/tr[1]/td[4]/a")
	WebElement ClickOnEdit;
	@FindBy(id="eff_from")
	WebElement UpdateDate;
	@FindBy(xpath="//*[@value='Update Weekly Off']")
	WebElement UpdateWeeklyOff;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullmessage;
	public UpdateWeeklyOff(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonemployeedetails() {
		ClickOnEmployeeDetails.click();
	}
	public void clickonfilter() {
		ClickonFilter.click();
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
		ClickOnWeeklyOffDetails.click();
	}
	public void clickonedit() {
		ClickOnEdit.click();
	}
	public void updatedate(String value) {
		UpdateDate.clear();
		UpdateDate.sendKeys(value);
	}
	public void updateweeklyoff() {
		UpdateWeeklyOff.click();
	}
	public String getMessage(){
		return successfullmessage.getText();
	}
}
