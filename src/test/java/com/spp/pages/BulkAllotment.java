package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class BulkAllotment extends BasePage {
	
	public BulkAllotment(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	
			PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="emp_detail")
    WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[8]/a")
	WebElement ReimbursementAllotment;	
	@FindBy(id="bulk_reimbursement_allot")
    WebElement BulkAllotmentButton;
	@FindBy(id="reimbursement_master_id")
	WebElement Name;
	@FindBy(id="reimbursement_allotment_financial_year")
	WebElement FinancialYear;
	@FindBy(xpath="//*[@id=\"allotment_date\"]")
	WebElement AllotmentDate;
	@FindBy(id="modified_total_amount")
	WebElement Amount;
	@FindBy(id="allotment_type_1")
	WebElement AmountFor;
	@FindBy(id="block_period")
	WebElement BlockPeriod;
	@FindBy(xpath="//*[@id=\"multi_allot_form\"]/div[2]/div/button")
	WebElement CreateReimbursementButton;
	
	@FindBy(xpath="//*[@id='bf_form']/div[10]/button[1]")
	WebElement LoadButton;
	@FindBy(xpath="//*[@id=\"bulk_allotment_employees\"]/tbody/tr[1]/td[1]/input")
	WebElement EmployeeSelection;
	@FindBy(xpath="(//*[@id='employee_data_'])[2]")
	WebElement BulkAllotment;
	@FindBy(xpath="//*[@id='multi_employee']/div[4]/input")
	WebElement AllotReimbursementButton;
	@FindBy(xpath="//*[@id=\"reimbursement_allotment_result_response\"]/div/strong")
	WebElement successfullMessage;	
	@FindBy(id="filter")
	WebElement GetEmployees;
	
	public void selectEmployee() {
		Employee.click();
	}
	public void selectReimbursementAllotment() {
		ReimbursementAllotment.click();
	}
	public void selectBulkAllotmentButton() {
		BulkAllotmentButton.click();
		
	}
	public void selectName(String value){
		dropDownSelect(Name, value);
	}
	public void selectFinancialYear(String value){
		dropDownSelect(FinancialYear, value);
	}
	public void selectAllotmentDate(String Value) {
		AllotmentDate.sendKeys(Value);
	}
	public void selectAmount(String Value) {
		
		Amount.sendKeys(Value);
	}
	public void selectAmountFor() {
		AmountFor.click();
	}
	public void selectBlockPeriod(String value){
		dropDownSelect(BlockPeriod, value);
	}
	public void selectCreateReimbursementButton() {
		CreateReimbursementButton.click();
	}
	public void selectLoadButton() {
		LoadButton.click();
	}
	public void selectEmployeeSelection() {
		EmployeeSelection.click();
	}
	public void selectAllotReimbursementButton() {
		AllotReimbursementButton.click();
	}
	public void EmployeeBulkAllotmentButton() {
		BulkAllotment.click();
		
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
	
	public void getemployees() {
		GetEmployees.click();
	}

	
	
}
