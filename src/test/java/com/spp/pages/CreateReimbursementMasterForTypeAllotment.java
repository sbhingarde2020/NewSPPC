package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateReimbursementMasterForTypeAllotment extends BasePage {
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
	@FindBy(id="reimbursement_master_allotment_type_definition_1")
	WebElement MonthlyallotmentType;
	
	@FindBy(id="reimbursement_master_clubbed_in_salary")
	WebElement salaryHead;
	@FindBy(xpath="//input[@value='Create Reimbursement Master']")
	WebElement createReimbursementMaster;
	@FindBy(xpath="//strong[text()='Reimbursement Master is successfully created.']")
	WebElement successfullMassege;
	@FindBy(xpath="//*[@class='action-delete']")
	WebElement DeleteButton;
	@FindBy(id = "reimbursement_master_tds_ref_option_id")
	WebElement TDSRef;

	public CreateReimbursementMasterForTypeAllotment(WebDriver driver) {
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
	public void selectTDSRef(String value){
		dropDownSelect(TDSRef, value);
	}
	public void enterReimbursementName(String value){
		reimbursementName.sendKeys(value);
	}
	
	public void selectAllotmentType(){
		allotmentType.click();
	}
	public void selectMonthlyAllotmentType(){
		MonthlyallotmentType.click();
	}
	
	public void clcikClubbedSalaryHead(){
		salaryHead.click();
	}
	
	public void clickCreateReimbursementMaster(){
		createReimbursementMaster.click();
	}
	
	public String getMessage(){
		return successfullMassege.getText();
	}
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
}