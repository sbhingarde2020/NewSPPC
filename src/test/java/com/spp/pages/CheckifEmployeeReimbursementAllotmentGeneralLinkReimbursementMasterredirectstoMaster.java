package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifEmployeeReimbursementAllotmentGeneralLinkReimbursementMasterredirectstoMaster extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[8]/a")
	WebElement ClickOnReimbursementAllotment;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-2\"]/h3")
	WebElement ClickOnGeneralLinks;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-2\"]/li[1]/a")
	WebElement ClickOnReimburseMstr;
	@FindBy(xpath="//*[@id=\"reimb_list\"]/div[1]/span/a")
	WebElement AddNewReimbursement;
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
	@FindBy(xpath="//strong[text()='Reimbursement Master is successfully created.']")
	WebElement successfullMassege;
	@FindBy(xpath="//*[@class='action-delete']")
	WebElement DeleteButton;
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Reimbursement Master']")
	WebElement reimbursemnetLink;
	@FindBy(id = "reimbursement_master_tds_ref_option_id")
	WebElement TDSRef;
	public CheckifEmployeeReimbursementAllotmentGeneralLinkReimbursementMasterredirectstoMaster(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
public void clickMastserLink(){
		
		masterLink.click();
	}

	public void clickReimbursementMaster(){
		reimbursemnetLink.click();
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
	public void clickonreimbursemstr() {
		ClickOnReimburseMstr.click();
	}
	public void addnewreimbursement() {
		AddNewReimbursement.click();
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
	
	public void clickClubbedSalaryHead(){
		salaryHead.click();
	}
	
	public void clickCreateReimbursementMaster(){
		createReimbursementMaster.click();
	}
	
	public String getMessage(){
		return successfullMassege.getText();
	}
	public void clickDeleteMasterButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	public void selectTDSRef(String value){
		dropDownSelect(TDSRef, value);
	}

}
