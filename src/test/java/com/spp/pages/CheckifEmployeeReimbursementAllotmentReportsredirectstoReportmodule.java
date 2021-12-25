package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifEmployeeReimbursementAllotmentReportsredirectstoReportmodule extends BasePage{
	
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[8]/a")
	WebElement ClickOnReimbursementAllotment;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
	WebElement ClickOnReports;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-1\"]/li/a")
	WebElement SelectBankStatementReimbursement;
	@FindBy(id="reim_mop_4")
	WebElement SelectModeofPayment;
	
	public CheckifEmployeeReimbursementAllotmentReportsredirectstoReportmodule(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonreimbursement() {
		ClickOnReimbursementAllotment.click();
	}
	public void clickonreports() {
		ClickOnReports.click();
	}
	public void selectbankstatreim() {
		SelectBankStatementReimbursement.click();
	}
	public void selectmodeofpayment() {
		SelectModeofPayment.click();
	}
}
