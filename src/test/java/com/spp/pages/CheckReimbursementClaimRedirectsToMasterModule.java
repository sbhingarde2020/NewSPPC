package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckReimbursementClaimRedirectsToMasterModule extends BasePage{
		public CheckReimbursementClaimRedirectsToMasterModule(WebDriver driver) {
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
		@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-2\"]/li[1]/a")
		WebElement ReimbursementMaster;
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
		@FindBy(xpath="//*[@id=\"reimbursement_masters\"]/tbody/tr/td[5]/a")
		WebElement DeleteMasterButton;
		@FindBy(id="master")
		WebElement masterLink;
		@FindBy(xpath="//a[text()='Reimbursement Master']")
		WebElement reimbursemnetLink;
		public void clickMastserLink(){
			masterLink.click();
		}

		public void clickReimbursementMaster(){
			reimbursemnetLink.click();
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
		public void selectReimbursementMaster() {
			ReimbursementMaster.click();
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
		
		public String getMessage(){
			return successfullMassege.getText();
		}
		public void clickPagechange() throws Exception{
			Pagechange.click();
		}
		
		public void clickDeleteButton() throws Exception{
			DeleteMasterButton.click();
			switchToPopUpAndAccept(driver);
		}
		
		
		
}
