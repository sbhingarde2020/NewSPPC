package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteReimbursementClaim extends BasePage{
	public DeleteReimbursementClaim(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[4]/a")
	WebElement ReimbursementClaim;
	@FindBy(xpath="//*[@id=\"reimbursement_claims\"]/tbody/tr[1]/td[7]/a[2]")
	WebElement DeleteButton;
	@FindBy(xpath="//*[@id=\"reimbursement_claim_result_response\"]/div/strong")
	WebElement SuccessfulMessage;
	
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[8]/a")
	WebElement ClickOnReimbursementAllotment;
	@FindBy(xpath="//*[@id=\"reimbursement_allotments\"]/tbody/tr[1]/td[8]/a")
	WebElement DeleteAllotmentButton;
	
	
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Reimbursement Master']")
	WebElement reimbursemnetLink;
	@FindBy(xpath="//*[@class='action-delete']")
	WebElement DeleteMasterButton;
	
	public void selectSalary() {
		Salary.click();
	}
	public void selectReimbursementClaim() {
		ReimbursementClaim.click();
	}
	public void selectDeleteButton() {
		DeleteButton.click();
	}
		public String getMessage(){
		return SuccessfulMessage.getText();
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
		
		
		public void clickMastserLink(){
			PageFactory.initElements(driver, this);
			masterLink.click();
		}

		public void clickReimbursementMaster(){
			reimbursemnetLink.click();
		}
		public void clickDeleteMasterButton() throws Exception{
			DeleteMasterButton.click();
			switchToPopUpAndAccept(driver);
		}
}
