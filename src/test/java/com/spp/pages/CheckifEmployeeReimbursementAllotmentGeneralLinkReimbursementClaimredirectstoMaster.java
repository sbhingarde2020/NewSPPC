package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;


public class CheckifEmployeeReimbursementAllotmentGeneralLinkReimbursementClaimredirectstoMaster extends BasePage{
	@FindBy(id="emp_detail")
	WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[8]/a")
	WebElement ReimbursementAllotment;
	@FindBy(xpath="//*[@id=\"allotments_list\"]/div[1]/span/a")
	WebElement NewReimbursement;
	@FindBy(xpath="//*[@id='employees_table']/tbody/tr/td[contains(text(),'Tina')]/parent::tr/td/input")
	WebElement AddEmployee;
	@FindBy(xpath="//input[@value='Allot Reimbursement']")
	WebElement AllotButton;
	@FindBy(id="reimbursement_master_id")
	WebElement AllotmentName;
	@FindBy(id="reimbursement_allotment_financial_year")
	WebElement FinancialYearAlllotment;
	@FindBy(id="sal_date")
	WebElement AllotmentDate;
	@FindBy(xpath="//*[@id=\"amount\"]/div/input")
	WebElement AllotmentAmount;
	@FindBy(id="submit")
	WebElement CreateReimbursementAllotmentButton;
	@FindBy(xpath="//*[@id='allotment_link']/img")
	WebElement FunctionKey;
	@FindBy(id="sum_amount")
	WebElement SumAmount;
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
	@FindBy(id="reimbursement_master_allotment_type_2")
	WebElement allotmentType;
	@FindBy(id="reimbursement_master_clubbed_in_salary")
	WebElement salaryHead;
	@FindBy(xpath="//input[@value='Create Reimbursement Master']")
	WebElement createReimbursementMaster;
	@FindBy(xpath="//strong[text()='Reimbursement Master is successfully created.']")
	WebElement successfullMassege;
	@FindBy(xpath="//*[@id=\"main\"]/section/p/a")
	WebElement Pagechange;
	@FindBy(xpath="//*[@class='action-delete']")
	WebElement DeleteButton;
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[8]/a")
	WebElement ClickOnReimbursementAllotment;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-2\"]/h3")
	WebElement ClickOnGeneralLinks;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-2\"]/li[2]/a")
	WebElement ClickOnReimburseClaim;
	@FindBy(xpath="//*[@id=\"claims_list\"]/div[1]/span/a")
	WebElement AddNewReimbursementClaim;
	@FindBy(xpath="//*[@id='employees_table']/tbody/tr/td[contains(text(),'Tina')]/parent::tr/td/input")
	WebElement SelectEmployee;
	@FindBy(xpath="//input[@value='Claim Reimbursement']")
	WebElement ClaimReimbursement;
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
	@FindBy(xpath="//input[@value='Create Reimbursement claim']")
	WebElement CreateReimbursementButton;
	@FindBy(xpath="//strong[text()='Reimbursement Claim was successfully created']")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id='reimbursement_claims']/tbody/tr[1]/td/a[2]")
	WebElement DeleteClaim;
	@FindBy(xpath="//*[@id='reimbursement_allotments']/tbody/tr[1]/td/a[2]")
	WebElement DeleteAllotmentButton;
	@FindBy(id = "reimbursement_master_tds_ref_option_id")
	WebElement TDSRef;
	
	public CheckifEmployeeReimbursementAllotmentGeneralLinkReimbursementClaimredirectstoMaster(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
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
	public void selectAllotmentName(String value){
		dropDownSelect(AllotmentName, value);
	}
	public void selectFinancialAllotmentYear(String value){
		dropDownSelect(FinancialYearAlllotment, value);
	}
	public void selectAllotmentDate(String Value) {
		AllotmentDate.sendKeys(Value);
	}
	
	public void ClickOnFunctionKey() {
		FunctionKey.click();
	}
	public void EnterSumAmount(String Value) {
		SumAmount.clear();
		SumAmount.sendKeys(Value);
	}
	public void selectAllotmentAmount(String Value) {
		
		AllotmentAmount.sendKeys(Value);
	}
	public void selectCreateReimbursementAllotmentButton() {
		CreateReimbursementAllotmentButton.click();
	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonreimbursement() {
		ClickOnReimbursementAllotment.click();
	}
	public void clickongenrallinks() {
		ClickOnGeneralLinks.click();
	}
	public void clickonreimbursclaim() {
		ClickOnReimburseClaim.click();
	}
	public void addnewreimbursement() {
		AddNewReimbursementClaim.click();
	}
	public void selectemployee() {
		SelectEmployee.click();
	}
	public void claimreimbursement() {
		ClaimReimbursement.click();
	}
	public void enterReimbursementNameinClaim(String value){
		Name.sendKeys(value);
	}
	public void selectFinancialYear(String value){
		dropDownSelect(FinancialYear, value);
	}
	public void selectPaymentMode(String value){
		dropDownSelect(PaymentMode, value);
	}
	public void selectPaidMonth(String value){
		dropDownSelect(PaidMonth, value);
	}
	public void selectClaimDate(String Value) {
		ClaimDate.sendKeys(Value);
		ClaimDate.sendKeys(Keys.TAB);
	}
	public void selectPaidDate(String Value) {
		PaidDate.sendKeys(Value);
		//PaidDate.sendKeys(Keys.TAB);
	}
	public void selectAmount(String Value) {
		Amount.clear();
		Amount.sendKeys(Value);
	}
	public void selectCreateReimbursementButton() {
		CreateReimbursementButton.click();
	}
	public String getMessage(){
		return SuccessfulMessage.getText();
	}
	public void clickMastserLink(){
		PageFactory.initElements(driver, this);
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
	
	public void clickPagechange() throws Exception{
		Pagechange.click();
	}
	public void clickDeleteAllotmentButton() throws Exception{
		DeleteAllotmentButton.click();
		switchToPopUpAndAccept(driver);
	}
	public void DeleteClaim() throws Exception {
		DeleteClaim.click();
		switchToPopUpAndAccept(driver);
		Thread.sleep(2000);
		DeleteClaim.click();
		switchToPopUpAndAccept(driver);
	}
	public void clickDeleteMasterButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	public void selectTDSRef(String value){
		dropDownSelect(TDSRef, value);
	}	
}