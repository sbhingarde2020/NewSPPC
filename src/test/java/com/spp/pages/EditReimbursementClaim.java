package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditReimbursementClaim extends BasePage{
	public EditReimbursementClaim(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[4]/a")
	WebElement ReimbursementClaim;
	@FindBy(xpath="//*[@id=\"reimbursement_claims\"]/tbody/tr[1]/td[7]/a")
	WebElement Edit;
	@FindBy(id="reimbursement_claim_amount")
	WebElement Amount;
	@FindBy(xpath="//*[@id=\"new_claim\"]/div[2]/div/input")
	WebElement UpdateButton;

	@FindBy(xpath="//*[@id=\"reimbursement_claim_result_response\"]/div/strong")
	WebElement SuccessfulMessage;
	
	
	public void selectSalary() {
		Salary.click();
	}
	public void selectReimbursementClaim() {
		ReimbursementClaim.click();
	}
	public void selectEdit() {
		Edit.click();
	}
	public void selectAmount(String Value) {
		Amount.clear();
		Amount.sendKeys(Value);
	}
	public void selectUpdateButton() {
		UpdateButton.click();
	}

	
	
	public String getMessage(){
		return SuccessfulMessage.getText();
	}

}
