package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckforMaxInstallmentinLM extends BasePage{

	
	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[4]/a")
	WebElement SelectLoanMaster;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[1]/span/a")
	WebElement AddNewLoanMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement EnterLoanName;
	@FindBy(xpath="//*[@class='action-edit']")
	WebElement ClickonEdit;
	@FindBy(xpath="//*[@class='btn2 btn-bglightblue']")
	WebElement CreateLoanmaster;
	@FindBy(id="standing_instruction_master_emi_recovery")
	WebElement EnterEMIRecovery;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[8]/input")
	WebElement UpdateLoanMaster;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong") 
	WebElement successfullMessage;
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//a[text()='Loan Detail']")
	WebElement ClickonLoanDetail;
	@FindBy(id="add_employees")
	WebElement AddEmployees;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[1]/td[6]/a")
	WebElement ClickOnView;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[1]/span/a")
	WebElement AddNewLoanDetail;
	@FindBy(id="standing_instruction_detail_standing_instruction_master_id")
	WebElement SelectLoanName;
	@FindBy(id="sal_date")
	WebElement EnterLoanDate;
	@FindBy(id="standing_instruction_detail_financial_institution_id")
	WebElement EnterInstitutionName;
	@FindBy(id="standing_instruction_detail_loan_account_no")
	WebElement EnterLoanAccNo;
	@FindBy(id="standing_instruction_detail_actual_amount")
	WebElement EnterLoanAmount;
	@FindBy(id="dpMonthYear")
	WebElement EnterRecoverFrom;
	@FindBy(id="update_save")
	WebElement CreateLoan;
	@FindBy(xpath="//*[@class='action-delete']")
	WebElement ClickDelete;
	
	
	public CheckforMaxInstallmentinLM(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickonMaster() {
		ClickOnMaster.click();
	}
	public void selectloanmaster() {
		SelectLoanMaster.click();
	}
	public void addnewloanmaster() throws Exception{
		AddNewLoanMaster.click();
	}
	public void enterloanName(String value) throws Exception{
		EnterLoanName.sendKeys(value);
	}
	public void clickonedit() throws Exception{
		ClickonEdit.click();
	}
	public void enteremirecovery(String value) throws Exception{
		EnterEMIRecovery.clear();
		EnterEMIRecovery.sendKeys(value);
	}
	public void updateloanmaster() throws Exception{
		UpdateLoanMaster.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	} 
	public void clickonsalary() {
		ClickOnSalary.click();
	}
	public void clickonloandetail() {
		ClickonLoanDetail.click();
	}
	public void addemployees() {
		AddEmployees.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonview() {
		ClickOnView.click();
	}
	public void addnewloandetail() {
		AddNewLoanDetail.click();
	}
	public void selectloanname(String value) {
		dropDownSelect(SelectLoanName, value);
	}
	public void enterloandate(String value) throws Exception {
		EnterLoanDate.sendKeys(value);
		Thread.sleep(1000);
		EnterLoanDate.sendKeys(Keys.TAB);
	}
	public void enterinstitutionname(String value) {
		dropDownSelect(EnterInstitutionName, value);
		EnterInstitutionName.sendKeys(Keys.TAB);
	}
	public void enterloanaccno(String value) {
		EnterLoanAccNo.sendKeys(value);
	}
	public void enterloanamount(String value) {
		EnterLoanAmount.sendKeys(value);
	}
	public void enterrecoverfrom(String value) throws Exception {
		EnterRecoverFrom.sendKeys(value);
		Thread.sleep(1000);
		EnterRecoverFrom.sendKeys(Keys.TAB);
	}
	public void createloan() {
		CreateLoan.click();
	}
	public void clickdelete() {
		ClickDelete.click();
	}
	public void createloanmaster() {
		CreateLoanmaster.click();
	}
}
