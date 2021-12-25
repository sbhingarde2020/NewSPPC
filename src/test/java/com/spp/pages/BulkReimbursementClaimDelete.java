package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class BulkReimbursementClaimDelete extends BasePage{
	public BulkReimbursementClaimDelete(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[4]/a")
	WebElement ReimbursementClaim;
	@FindBy(xpath="//*[@id=\"bulk_reimbursement_delete\"]/a")
	WebElement BulkReimbursementClaimDelete;
	@FindBy(xpath="//*[@id=\"bulk_claim_delete\"]/tbody/tr/td[1]/input")
	WebElement SelectBox;
	@FindBy(xpath="//*[@id=\"bulk_delete_claims\"]/div[4]/input")
	WebElement DeleteButton;
	@FindBy(xpath="//*[@id=\"reimbursement_claim_result_response\"]/div/strong")
	WebElement SuccessfulMessage;
	
	
	public void selectSalary() {
		Salary.click();
	}
	public void selectReimbursementClaim() {
		ReimbursementClaim.click();
	}
	public void selectBulkReimbursementClaimDelete() {
		BulkReimbursementClaimDelete.click();
	}
	public void selectSelectBox() {
		SelectBox.click();
	}
	
	public void selectDeleteButton() {
		DeleteButton.click();
	}
	public String getMessage(){
		return SuccessfulMessage.getText();
	}
}
