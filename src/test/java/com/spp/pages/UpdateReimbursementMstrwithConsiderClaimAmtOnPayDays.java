package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateReimbursementMstrwithConsiderClaimAmtOnPayDays extends BasePage{

	
	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[8]/a")
	WebElement ClickOnReimbursementMstr;
	@FindBy(xpath="//*[@id=\"reimb_list\"]/div[1]/span/a")
	WebElement AddNewReimbursement;
	@FindBy(id="reimbursement_master_reimbursement_name")
	WebElement EnterReimbursementName;
	@FindBy(xpath="(//a[text()='Edit'])[1]")
	WebElement ClickOnEdit;
	@FindBy(xpath="//*[@id=\"edit_radio_allotment\"][2]")
	WebElement SelectAllotment;
	@FindBy(id="reimbursement_master_allotment_type_definition_1")
	WebElement SelectAllotmentType;
	@FindBy(id="reimbursement_master_claim_amt_based_on_2")
	WebElement SelectConsiderclaimAmt;
	@FindBy(css="input[type=submit]")
	WebElement UpdateReimbursementMstr;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfulmessage;
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
	@FindBy(id = "reimbursement_master_tds_ref_option_id")
	WebElement TDSRef;
	
	public UpdateReimbursementMstrwithConsiderClaimAmtOnPayDays(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonmaster() {
		ClickOnMaster.click();
		}
	public void clickonreimbursement() {
		ClickOnReimbursementMstr.click();
		}
	public void clickonedit() {
			ClickOnEdit.click();
	}
	public void editreimbursementname(String value) throws Exception{
		EnterReimbursementName.clear();
		EnterReimbursementName.sendKeys(value);
	}
	public void selectallotment() {
		SelectAllotment.click();
	}
	public void selectallotmenttype() {
		SelectAllotmentType.click();
	}
	public void selectclaimamt() {
		SelectConsiderclaimAmt.click();
	}
	public void updatereimbursement() {
		UpdateReimbursementMstr.click();
	}
	public String getMessage(){
		return successfulmessage.getText();
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
	public void selectTDSRef(String value){
		dropDownSelect(TDSRef, value);
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
	
	
}
