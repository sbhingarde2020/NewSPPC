package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateReimbursementClaimPaymentModeCash extends BasePage{
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
	WebElement allotmentType;
	@FindBy(id="reimbursement_master_clubbed_in_salary")
	WebElement salaryHead;
	@FindBy(xpath="//input[@value='Create Reimbursement Master']")
	WebElement createReimbursementMaster;
	@FindBy(id="reimbursement_allotment_block_period")
	WebElement BlockPeriod;
	@FindBy(id="reimbursement_claim_block_period")
	WebElement ClaimBlockPeriod;
	
	
	@FindBy(id="emp_detail")
	WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[8]/a")
	WebElement ReimbursementAllotment;
	@FindBy(xpath="//*[@id=\"allotments_list\"]/div[1]/span/a")
	WebElement NewReimbursementAllotment;
	@FindBy(xpath="//*[@id=\"employees_table\"]/tbody/tr/td[contains(text(),'Akshay')]/parent::tr/td[5]/input")
	WebElement AddEmployeeAllotment;
	@FindBy(xpath="//input[@value='Allot Reimbursement']")
	WebElement AllotButton;

	//@FindBy(xpath="//*[@id=\"new_reimbursement_allotment\"]/div[2]/fieldset/div[1]/div[1]/div")
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
	
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[4]/a")
	WebElement ReimbursementClaim;
	@FindBy(xpath="//*[@id=\"claims_list\"]/div[1]/span/a")
	WebElement NewReimbursement;
	@FindBy(xpath="//*[@id=\"employees_table\"]/tbody/tr/td[contains(text(),'Ashish')]/parent::tr/td[5]/input")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/form/div[3]/input")
	WebElement ClaimButton;
	@FindBy(xpath="//*[@id=\"reimbursement_masters\"]/tbody/tr/td[5]/a")
	WebElement DeleteMasterButton;
	//@FindBy(xpath="//*[@id=\"new_reimbursement_allotment\"]/div[2]/fieldset/div[1]/div[1]/div")
	@FindBy(id="reimbursement_claim_reimbursement_master_id")
	WebElement Name;
	@FindBy(id="reimbursement_claim_financial_year")
	WebElement FinancialYear;
	@FindBy(id="reimbursement_claim_mode_of_payment")
	WebElement PaymentMode;
	@FindBy(id="reimbursement_claim_paymonth_id")
	WebElement PaidMonth;
	@FindBy(id="sal_date")
	WebElement ClaimDate;
	@FindBy(id="paid_date")
	WebElement PaidDate;
	@FindBy(id="reimbursement_claim_amount")
	WebElement Amount;
	@FindBy(xpath="//*[@id=\"new_claim\"]/div[2]/div/input")
	WebElement CreateReimbursementButton;
	@FindBy(xpath="//*[@id=\"reimbursement_claim_result_response\"]/div/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"reimbursement_claims\"]/tbody/tr[1]/td[8]/a")
	//@FindBy(xpath="//*[@id=\"reimbursement_allotments\"]/tbody/tr/td[2][contains(text(),'Reim. LTA')]/parent::tr/td[8]/a")
	WebElement DeleteButton;
	
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[8]/a")
	WebElement ClickOnReimbursementAllotment;
	@FindBy(xpath="//*[@id='reimbursement_allotments']/tbody/tr[1]/td[7]/a[2]")
	WebElement DeleteAllotmentButton;
	
	
	
	
	
	
	
	

	public CreateReimbursementClaimPaymentModeCash(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickMastserLink(){
		masterLink.click();
	}

	public void clickReimbursementMaster(){
		reimbursemnetLink.click();
	}
	public void clickAddReimbursementMaster(){
		addReimbursement.click();
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
	
	public void selectAllotmentType(){
		allotmentType.click();
	}
	
	public void clcikClubbedSalaryHead(){
		salaryHead.click();
	}
	
	public void clickCreateReimbursementMaster(){
		createReimbursementMaster.click();
	}
	
	
	public void selectEmployee() {
		Employee.click();
	}
	public void selectReimbursementAllotment() {
		ReimbursementAllotment.click();
	}
	public void selectNewReimbursementAllotment() {
		NewReimbursementAllotment.click();
	}
	public void selectAddEmployeeAllotment() {
		AddEmployee.click();
	}
	public void selectAllotButton() {
		AllotButton.click();
	}
	public void selectAlllotmentName(String value){
		dropDownSelect(AllotmentName, value);
	}
	public void selectFinancialYearAllotment(String value){
		dropDownSelect(FinancialYearAllotment, value);
	}
	public void selectAllotmentDate(String Value) {
		AllotmentDate.sendKeys(Value);
	}
	public void SelectBlockPeriod(String value){
		dropDownSelect(BlockPeriod, value);
	}
	public void ClickOnFunctionKey() {
		FunctionKey.click();
	}
	public void EnterSumAmount(String Value) {
		SumAmount.sendKeys(Value);
	}
	public void selectAllotmentAmount(String Value) {
		
		Amount.sendKeys(Value);
	}
	public void selectCreateReimbursementAllotmentButton() {
		CreateReimbursementAllotmentButton.click();
	}
	
	
	public void selectSalary() {
		Salary.click();
	}
	public void selectReimbursementClaim() {
		ReimbursementClaim.click();
	}
	public void selectNewReimbursement() {
		NewReimbursement.click();
	}
	public void selectAddEmployee() {
		AddEmployee.click();
	}
	public void selectClaimButton() {
		ClaimButton.click();
	}
	public void selectName(String value){
		dropDownSelect(Name, value);
	}
	public void selectFinancialYear(String value){
		dropDownSelect(FinancialYear, value);
	}
	public void selectPaymentModeforClaim(String value){
		dropDownSelect(PaymentMode, value);
	}
	public void selectPaidMonth(String value){
		dropDownSelect(PaidMonth, value);
	}
	public void selectClaimDate(String Value) {
		ClaimDate.sendKeys(Value);
	}
	public void selectPaidDate(String Value) {
		PaidDate.sendKeys(Value);
	}
	public void selectAmount(String Value) throws InterruptedException {
		Amount.clear();
		Thread.sleep(1000);
		System.out.println("hfguj");
		Amount.sendKeys(Value);
	}
	public void selectCreateReimbursementButton() {
		CreateReimbursementButton.click();
	}
	public String getMessage(){
		return SuccessfulMessage.getText();
	}
//	}public void clickPagechange() throws Exception{
//		Pagechange.click();
//	}
//	
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	public void selectClaimBlockPeriod(String value) {
		dropDownSelect(ClaimBlockPeriod, value);
	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonreimbursement() {
		ClickOnReimbursementAllotment.click();
	}
	public void clickDeleteAllotmentButton() throws Exception{
		DeleteAllotmentButton.click();
		switchToPopUpAndAccept(driver);
	}
	public void clickDeleteMasterButton() throws Exception{
		DeleteMasterButton.click();
		switchToPopUpAndAccept(driver);
	}
}
