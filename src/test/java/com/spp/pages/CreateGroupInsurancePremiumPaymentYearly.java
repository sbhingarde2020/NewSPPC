package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateGroupInsurancePremiumPaymentYearly extends BasePage {
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//a[text()='Group Insurance Detail']")
	WebElement ClickOnGroupInsuranceDetail;
	@FindBy(id="add_employees")
	WebElement ClickAddEmployees;
	@FindBy(xpath="//button[text()='LOAD']")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr/td[contains(text(),'Akshay')]/parent::tr/td[6]/a")
	WebElement ClickOnView;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[1]/span/a")
	WebElement AddNewGroupInsuranceDetails;
	@FindBy(id="standing_instruction_detail_standing_instruction_master_id")
	WebElement GroupInsuranceName;
	@FindBy(id="standing_instruction_detail_loan_account_no")
	WebElement GroupInsuranceNo;
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
	@FindBy(id="p_payment_12")
	WebElement Yearly;
	@FindBy(id="update_save")
	WebElement CreateGroupInsurancebutton;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr/td[9]/a")
	WebElement ClickDelete;
	
	
	public CreateGroupInsurancePremiumPaymentYearly(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonsalary() {
		ClickOnSalary.click();
	}
	public void clickongroupinsurancedetail() {
		ClickOnGroupInsuranceDetail.click();
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
		AddNewGroupInsuranceDetails.click();
	}
	public void selectGroupInsuranceName(String value){
		dropDownSelect(GroupInsuranceName, value);
	}
	public void clickGroupInsuranceNo(String value) throws Exception{
		GroupInsuranceNo.sendKeys(value);
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
	public void clickyearly() throws Exception{
		Yearly.click();
	}
	public void clickCreateGroupInsurancebutton() throws Exception{
		CreateGroupInsurancebutton.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickdelete() {
		ClickDelete.click();
		switchToPopUpAndAccept(driver);
	}
}
