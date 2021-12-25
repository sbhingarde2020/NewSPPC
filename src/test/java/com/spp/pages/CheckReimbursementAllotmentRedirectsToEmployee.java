package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckReimbursementAllotmentRedirectsToEmployee extends BasePage{
	public CheckReimbursementAllotmentRedirectsToEmployee(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[4]/a")
	WebElement ReimbursementClaim;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-2\"]/h3")
	WebElement GeneralLink;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-2\"]/li[2]/a")
	WebElement ReimAllotment;
	@FindBy(xpath="//*[@id=\"allotments_list\"]/div[1]/span/a")
	WebElement NewReimbursement;
	@FindBy(xpath="//*[@id=\"employees_table\"]/tbody/tr/td[contains(text(),'Ashish')]/parent::tr/td[5]/input")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/form/div[3]/input")
	WebElement AllotButton;

	//@FindBy(xpath="//*[@id=\"new_reimbursement_allotment\"]/div[2]/fieldset/div[1]/div[1]/div")
	@FindBy(id="reimbursement_master_id")
	WebElement Name;
	@FindBy(xpath="//*[@id=\"year_type\"]/div/select")
	WebElement FinancialYear;
	
	@FindBy(xpath="//*[@id=\"amount\"]/div/input")
	WebElement Amount;
	@FindBy(id="submit")
	WebElement CreateReimbursementButton;
	@FindBy(xpath="//*[@id=\"reimbursement_allotment_result_response\"]/div/strong")
	WebElement SuccessfulMessage;
	WebElement Pagechange;
	@FindBy(xpath="//*[@id=\"reimbursement_allotments\"]/tbody/tr[1]/td[8]/a")
	WebElement DeleteButton;
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[8]/a")
	WebElement ClickOnReimbursementAllotment;
	@FindBy(xpath="//*[@id='reimbursement_allotments']/tbody/tr[1]/td[7]/a[2]")
	WebElement DeleteAllotmentButton;
	@FindBy(id="reimbursement_master_id")
	WebElement AllotmentName;
	@FindBy(id="reimbursement_allotment_financial_year")
	WebElement FinancialYearAllotment;
	@FindBy(id="sal_date")
	WebElement AllotmentDate;
	@FindBy(xpath="//*[@id=\"amount\"]/div/input")
	WebElement AllotmentAmount;
	@FindBy(id="submit")
	WebElement CreateReimbursementAllotmentButton;
	@FindBy(xpath="//*[@id=\"allotment_link\"]/img")
	WebElement FunctionKey;
	@FindBy(id="sum_amount")
	WebElement SumAmount;
	@FindBy(id="reimbursement_allotment_block_period")
	WebElement BlockPeriod;
	public void selectEmployee() {
		ClickOnEmployee.click();
	}
	public void selectReimbursementAllotment() {
		ClickOnReimbursementAllotment.click();
	}
	public void selectSalary() {
		Salary.click();
	}
	public void selectReimbursementClaim() {
		ReimbursementClaim.click();
	}
	public void selectGeneralLink() {
		GeneralLink.click();
	}
	public void selectReimAllotment() {
		ReimAllotment.click();
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
	
	public void selectAmount(String Value) {
		
		Amount.sendKeys(Value);
	}
	public void selectCreateReimbursementAllotmentButton() {
		CreateReimbursementAllotmentButton.click();
	}
	public String getMessage(){
		return SuccessfulMessage.getText();
	}public void clickPagechange() throws Exception{
		Pagechange.click();
	}
	
	public void clickDeleteButton() throws Exception{
		DeleteAllotmentButton.click();
		switchToPopUpAndAccept(driver);
	}
	public void selectAlllotmentName(String value){
		dropDownSelect(AllotmentName, value);
	}
	public void SelectBlockPeriod(String value){
		dropDownSelect(BlockPeriod, value);
	}
	public void selectFinancialYearAllotment(String value){
		dropDownSelect(FinancialYearAllotment, value);
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

}

