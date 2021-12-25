package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateReimbursementAllotment extends BasePage {

	public UpdateReimbursementAllotment(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="emp_detail")
	WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[8]/a")
	WebElement ReimbursementAllotment;
	@FindBy(xpath="//*[@id='reimbursement_allotments']/tbody/tr[1]/td[7]/a")
	WebElement Edit;
	@FindBy(xpath="//*[@id='amount']/div/input")
	WebElement Amount;
	@FindBy(id="submit")
	WebElement UpdateButton;
	@FindBy(xpath="//*[@id=\"reimbursement_allotment_result_response\"]/div/strong")
	WebElement successfullMessage;
	
	
	
	
	public void selectEmployee() {
		Employee.click();
	}
	public void selectReimbursementAllotment() {
		ReimbursementAllotment.click();
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
		return successfullMessage.getText();
	}
	
}
