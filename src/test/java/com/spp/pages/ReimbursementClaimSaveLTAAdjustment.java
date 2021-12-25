package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class ReimbursementClaimSaveLTAAdjustment extends BasePage {
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[4]/a")
	WebElement ReimbursementClaim;
	@FindBy(linkText="LTA Adjustment")
	WebElement ClickOnLTAAdjustment;
	@FindBy(id="lta_adjustment_financial_year")
	WebElement SelectFinancialYear;
	@FindBy(id="lta_adjustment_block_period")
	WebElement SelectBlockPeriod;
	@FindBy(css="input[type=button")
	WebElement GetEmployees;
	@FindBy(css="input[type=submit]")
	WebElement SaveDetails;
	public ReimbursementClaimSaveLTAAdjustment(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void selectSalary() {
		Salary.click();
	}
	public void selectReimbursementClaim() {
		ReimbursementClaim.click();
	}
	public void clickonltaadjustment() {
		ClickOnLTAAdjustment.click();
	}
	public void selectfinancialyear(String value) {
		dropDownSelect(SelectFinancialYear, value);
	}
	public void selectblockperiod(String value) {
		dropDownSelect(SelectBlockPeriod, value);
	}
	public void clickongetemployees() {
		GetEmployees.click();
	}
	public void savedetails() {
		SaveDetails.click();
	}
}
