package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateReimbursementAllotment extends BasePage {
	public CreateReimbursementAllotment(WebDriver driver) {
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
	@FindBy(xpath="//*[@id=\"employees_table\"]/tbody/tr/td[contains(text(),'Ashish')]/parent::tr/td[5]/input")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/form/div[3]/input")
	WebElement AllotButton;
	//@FindBy(xpath="//*[@id=\"new_reimbursement_allotment\"]/div[2]/fieldset/div[1]/div[1]/div")
	@FindBy(id="reimbursement_master_id")
	WebElement Name;
	@FindBy(xpath="//*[@id='year_type']/div/select")
	WebElement FinancialYear;
	@FindBy(xpath="//*[@id='new_reimbursement_allotment']/div[2]/fieldset/div[1]/div[3]/div/input")
	WebElement AllotmentDate;
	@FindBy(xpath="//*[@id='amount']/div/input")
	WebElement Amount;
	@FindBy(id="submit")
	WebElement CreateReimbursementButton;
	@FindBy(xpath="//*[@id=\"reimbursement_allotment_result_response\"]/div/strong")
	WebElement SuccessfulMessage;
	WebElement Pagechange;
	@FindBy(xpath="//*[@id=\"reimbursement_allotments\"]/tbody/tr[1]/td[8]/a")
	WebElement DeleteAllotmentButton;
	@FindBy(xpath="//*[@class='action-delete']")
	WebElement DeleteButton;
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Reimbursement Master']")
	WebElement reimbursemnetLink;
	@FindBy(xpath="//a[text()='Add New Reimbursement']")
	WebElement addReimbursement;
	@FindBy(id="reimbursement_master_reimbursement_type")
	WebElement reimbursementType;
	@FindBy(id="reimbursement_master_payment_mode")
	WebElement modeOfPayment;
	@FindBy(id="reimbursement_master_reimbursement_name")
	WebElement reimbursementName;
	@FindBy(id="reimbursement_master_allotment_type_3")
	WebElement LumpsumType;
	@FindBy(id="reimbursement_master_clubbed_in_salary")
	WebElement salaryHead;
	@FindBy(xpath="//input[@value='Create Reimbursement Master']")
	WebElement createReimbursementMaster;
	@FindBy(xpath="//*[@id=\"allotment_link\"]/img")
	WebElement FunctionKey;
	@FindBy(id="sum_amount")
	WebElement SumAmount;
	
	public void clickMastserLink(){	
		masterLink.click();
	}

	public void clickReimbursementMaster(){
		reimbursemnetLink.click();
	}
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
	public void selectAllotmentDate(String Value) {
		AllotmentDate.sendKeys(Value);
	}
	public void selectAmount(String Value) {
		
		Amount.sendKeys(Value);
	}
	public void selectCreateReimbursementButton() {
		CreateReimbursementButton.click();
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
	public void clickDeleteMasterButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	
	public void selectReimbursementType(String value){
		dropDownSelect(reimbursementType, value);
	}
	
	public void selectModeOfPayment(String value){
		dropDownSelect(modeOfPayment, value);
	}
	
	public void enterReimbursementName(String value){
		reimbursementName.sendKeys(value);
	}
	
	public void selectLumpsumType(){
		LumpsumType.click();
	}
		
	public void clcikClubbedSalaryHead(){
		salaryHead.click();
	}
	
	public void clickCreateReimbursementMaster(){
		createReimbursementMaster.click();
	}
	public void clickAddReimbursementMaster(){
		addReimbursement.click();
	}
	public void ClickOnFunctionKey() {
		FunctionKey.click();
	}
	public void EnterSumAmount(String Value) {
		SumAmount.sendKeys(Value);
	}
}