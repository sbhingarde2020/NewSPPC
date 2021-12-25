package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateLeaveEncashmentBasedonPercentagetoRemovevalueandInsertvalue extends BasePage{
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
	@FindBy(xpath="////*[@id=\"employee_leaves_encashed\"]/table/tbody/tr[2]/td[8]/a/img")
	WebElement ClickOnEdit;
	@FindBy(xpath="//*[@id=\"contribution_fields\"]/table/tbody/tr/td[1]/table/tbody/tr[6]/td[2]/button[1]")
	WebElement ClickOnRemove;
	@FindBy(id="leave_encashment_based_on_2")
	WebElement CheckBasedOnPercent;
	@FindBy(id="salary_head")
	WebElement SelectSalaryHead;
	@FindBy(id="amount")
	WebElement EnterAmount;
	@FindBy(css="[name=button][type=button]")
	WebElement ClickOnInsert;
	@FindBy(xpath="//strong[text()='Leave encashment successfully updated.']")
	WebElement SuccessfulMessage;
	@FindBy(css="input[name=commit][type=submit]")
	WebElement ClickOnUpdate;
	public UpdateLeaveEncashmentBasedonPercentagetoRemovevalueandInsertvalue(WebDriver driver) {
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
	public void clickonremove() {
		ClickOnRemove.click();
	}
	public void checkbasedonpercent() {
		CheckBasedOnPercent.click();
	}
	public void selectsalaryhead(String value) {
		dropDownSelect(SelectSalaryHead, value);
	}
	public void enteramount(String value) {
		EnterAmount.sendKeys(value);
	}
	public void clickoninsert() {
		ClickOnInsert.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickonupdate() {
		ClickOnUpdate.click();
	}
}
