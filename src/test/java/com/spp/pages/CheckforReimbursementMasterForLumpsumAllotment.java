package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckforReimbursementMasterForLumpsumAllotment extends BasePage {

	
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Reimbursement Master']")
	WebElement reimbursemnetLink;
    @FindBy(xpath="(//a[text()='Edit'])[1]")
    WebElement editReimbursement;
    @FindBy(xpath="//*[@id='reimbursement_masters']/tbody/tr[1]/td[1]")
	WebElement SelectedReimbursementMaster;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/form/div[2]/fieldset/div[4]/div/input[3]")
	WebElement LumpsumcheckBox;
	@FindBy(xpath="//input[@value='Update Reimbursement Master']")
	WebElement updateReimbursement;
	@FindBy(xpath="//strong[text()='Reimbursement Master is successfully updated.']")
	WebElement successfullMessage;
	@FindBy(id="emp_detail")
	WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[8]/a")
	WebElement ReimbursementAllotment;
	@FindBy(xpath="//*[@id=\"allotments_list\"]/div[1]/span/a")
	WebElement NewReimbursement;
	@FindBy(xpath="//*[@id=\"employees_table\"]/tbody/tr[1]/td[5]/input")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/form/div[3]/input")
	WebElement AllotButton;

	//@FindBy(xpath="//*[@id=\"new_reimbursement_allotment\"]/div[2]/fieldset/div[1]/div[1]/div")
	@FindBy(id="reimbursement_master_id")
	WebElement Name;
//	@FindBy(id="allotment_link")
//	WebElement AmountSideButton;
//	@FindBy(xpath="//*[@id=\"year_type\"]/div/select")
//	WebElement FinancialYear;
//	@FindBy(xpath="//*[@id=\"new_reimbursement_allotment\"]/div[2]/fieldset/div[1]/div[3]/div/input")
//	WebElement AllotmentDate;
//	
	
	
	public CheckforReimbursementMasterForLumpsumAllotment(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickMastserLink(){
		masterLink.click();
	}

	public void clickReimbursementMaster(){
		reimbursemnetLink.click();
	}
	
	public void clickEditButton(){
		editReimbursement.click();
	}
	public String getSelectedReimbursementMaster() {
		return SelectedReimbursementMaster.getText();
	}
	
	public void clickLumpsumcheckBox(){
		LumpsumcheckBox.click();
	}
	
	public void clickUpdateReimbursement(){
		updateReimbursement.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
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
	Name.sendKeys(value);	
	}
//	public void selectAmountSideButton() {
//		AmountSideButton.click();
//	}
//	public void selectFinancialYear(String value){
//		dropDownSelect(FinancialYear, value);
//	}
//	public void selectAllotmentDate(String Value) {
//		AllotmentDate.sendKeys(Value);
//	}
//	
}
