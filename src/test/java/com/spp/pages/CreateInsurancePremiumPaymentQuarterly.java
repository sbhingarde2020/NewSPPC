package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateInsurancePremiumPaymentQuarterly extends BasePage{

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
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[1]/span/a")
	WebElement AddNewInsuranceDetails;
	@FindBy(id="standing_instruction_detail_standing_instruction_master_id")
	WebElement InsuranceName;
	@FindBy(id="standing_instruction_detail_loan_account_no")
	WebElement InsuranceNo;
	@FindBy(id="dpMonthYear1"	)
	WebElement StartMonth;
	@FindBy(id="dpMonthYear")
	WebElement EndMonth;
	@FindBy(id="standing_instruction_detail_actual_amount")
	WebElement Amount;
	@FindBy(id="standing_instruction_detail_financial_institution_id")
	WebElement InstitutionName;
	@FindBy(id="standing_instruction_detail_remarks")
	WebElement Remark;
	@FindBy(id="p_payment_3")
	WebElement Quaterly;
	@FindBy(id="update_save")
	WebElement CreateInsurancebutton;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr/td[9]/a")
	WebElement Delete;
	public CreateInsurancePremiumPaymentQuarterly(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
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
	public void clickAddNewInsuranceDetails() throws Exception{
		AddNewInsuranceDetails.click();
	}
	public void selectInsuranceName(String value){
		dropDownSelect(InsuranceName, value);
	}
	public void clickInsuranceNo(String value) throws Exception{
		InsuranceNo.sendKeys(value);
	}
	public void clickStartMonth(String value) throws Exception{
		StartMonth.sendKeys(value);
	}
	public void clickEndMonth(String value) throws Exception{
		EndMonth.sendKeys(value);
	}
	public void clickAmount(String value) throws Exception{
		Amount.sendKeys(value);
	}
	public void selectInstitutionName(String value){
		dropDownSelect(InstitutionName, value);
	}
	public void clickRemark(String value) throws Exception{
		Remark.sendKeys(value);
	}
	public void clickquaterly() throws Exception{
		Quaterly.click();
	}
	public void clickCreateInsurancebutton() throws Exception{
		CreateInsurancebutton.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickdelete() {
		Delete.click();
		switchToPopUpAndAccept(driver);
	}
}
