package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditLeaveEncashment extends BasePage{
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
	@FindBy(xpath="//*[@id=\"employee_leaves_encashed\"]/table/tbody/tr[1]/td[7]/a")
	WebElement ClickOnEdit;
	@FindBy(id="leave_encashment_mode_of_payment")
	WebElement SelectModeofPayment;
	@FindBy(id="leave_encashment_financial_inst_id")
	WebElement SelectBank;
	@FindBy(xpath="//strong[text()='Leave encashment successfully updated.']")
	WebElement SuccessfulMessage;
	@FindBy(css="input[name=commit][type=submit]")
	WebElement ClickOnUpdate;
	public EditLeaveEncashment(WebDriver driver) {
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
	public void clickonedit() {
		ClickOnEdit.click();
	}
	public void selectmodeofpayment(String value) {
		dropDownSelect(SelectModeofPayment, value);
	}
	
	public void selectbank(String value) {
		dropDownSelect(SelectBank, value);
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickonupdate() {
		ClickOnUpdate.click();
	}
}
