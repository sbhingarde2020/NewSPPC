package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddNewReimbursementAllotment extends BasePage{
	public AddNewReimbursementAllotment(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="emp_detail")
	WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[8]/a")
	WebElement ReimbursementAllotment;
	@FindBy(xpath="//*[@id=\"allotments_list\"]/div[1]/span/a")
	WebElement NewReimbursement;
	@FindBy(xpath="//*[@id='employees_table']/tbody/tr/td[contains(text(),'Anil')]/parent::tr/td[5]/input")
	WebElement AddEmployee;
	@FindBy(xpath="//input[@value='Allot Reimbursement']")
	WebElement AllotButton;
	//@FindBy(xpath="//*[@id=\"new_reimbursement_allotment\"]/div[2]/fieldset/div[1]/div[1]/div")
	@FindBy(id="reimbursement_master_id")
	WebElement Name;
	@FindBy(id="reimbursement_allotment_financial_year")
	WebElement FinancialYear;
	@FindBy(id="sal_date")
	WebElement AllotmentDate;
	@FindBy(xpath="//*[@id=\"amount\"]/div/input")
	WebElement Amount;
	@FindBy(id="submit")
	WebElement CreateReimbursementButton;
	@FindBy(xpath="//*[@id='allotment_link']/img")
	WebElement FunctionKey;
	@FindBy(id="sum_amount")
	WebElement SumAmount;
	@FindBy(xpath="//strong[text()='Reimbursement Allotment was successfully created']")
	WebElement successfullmessage;
	@FindBy(id="reimbursement_allotment_block_period")
	WebElement BlockPeriod;
	
	public void selectEmployee() {
		Employee.click();
	}
	public void selectReimbursementAllotment() {
		ReimbursementAllotment.click();
	}
	public void selectNewReimbursement() {
		NewReimbursement.click();
	}
	public void selectAddEmployee() {
		AddEmployee.click();
	}
	public void selectAllotButton() {
		AllotButton.click();
	}
	public void selectName(String value){
		dropDownSelect(Name, value);
	}
	public void selectFinancialYear(String value){
		dropDownSelect(FinancialYear, value);
	}
	public void selectBlockPeriod(String value){
		dropDownSelect(BlockPeriod, value);
	}
	public void selectAllotmentDate(String Value) {
		AllotmentDate.sendKeys(Value);
	}
	public void ClickOnFunctionKey() {
		FunctionKey.click();
	}
	public void EnterSumAmount(String Value) {
		SumAmount.sendKeys(Value);
	}
	public void selectAmount(String Value) {
		Amount.sendKeys(Value);
	}
	public void selectCreateReimbursementButton() {
		CreateReimbursementButton.click();
	}
	public String  getMessage(){
		return successfullmessage.getText();
	}
}