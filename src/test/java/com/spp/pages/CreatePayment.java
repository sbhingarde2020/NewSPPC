package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreatePayment extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(linkText="Insurance Master")
	WebElement InsuranceMaster;
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//a[text()='Insurance Detail']")
	WebElement ClickOnInsuranceDetail;
	@FindBy(id="add_employees")
	WebElement ClickAddEmployees;
	@FindBy(xpath="//button[text()='LOAD']")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr/td[contains(text(),'Akshay')]/parent::tr/td[6]/a")
	WebElement ClickOnView;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr/td[8]/a")
	WebElement ClickOnDetail;
	@FindBy(id="dpMonthYear1")
	WebElement SelectFromMonth;
	@FindBy(id="dpMonthYear2")
	WebElement SelectToMonth;
	@FindBy(id="modified_amount")
	WebElement ModifiedAmount;
	@FindBy(id="financial_institution_id")
	WebElement InstitutionName;
	@FindBy(id="remarks")
	WebElement EnterRemarks;
	@FindBy(id="act_save")
	WebElement CreatePayment;
	@FindBy(xpath="//strong[text()='Details Successfully created.']")
	WebElement successfullmessage;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr/td[9]/a")
	WebElement Delete;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[2]/table/tbody/tr/td[4]/a")
	WebElement ClickDeleteInsuranceMaster;
	public CreatePayment(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void clickInsuranceMaster() throws Exception{
		InsuranceMaster.click();
	}
	public void clickonsalary() {
		ClickOnSalary.click();
	}
	public void clickoninsurancedetail() {
		ClickOnInsuranceDetail.click();
	}
	public void clickaddemployees() {
		ClickAddEmployees.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonview() {
		ClickOnView.click();
	}
	public void clickondetail() {
		ClickOnDetail.click();
	}
	public void selectfrommonth(String value) {
		SelectFromMonth.sendKeys(value);
	}
	public void selecttomonth(String value) {
		SelectToMonth.sendKeys(value);
	}
	public void entermodifiedamount(String value) {
		ModifiedAmount.sendKeys(value);
	}
	public void enterinstitutionname(String value) {
		InstitutionName.sendKeys(value);	
	}
	public void enterremarks(String value) {
		EnterRemarks.sendKeys(value);	
	}
	public void createpayment() {
		CreatePayment.click();
	}
	public String getMessage() {
		return successfullmessage.getText();
	}
	public void clickdelete() {
		Delete.click();
		switchToPopUpAndAccept(driver);
	}
	public void clickdeleteInsuranceMaster() {
		ClickDeleteInsuranceMaster.click();
		switchToPopUpAndAccept(driver);
	}
}
