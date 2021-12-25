package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateReimbursementMstrwithConsiderClaimAmtOnPresentDays extends BasePage {
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
	@FindBy(id="reimbursement_master_allotment_type_definition_3")
	WebElement SelectAllotmentType;
	@FindBy(id="reimbursement_master_claim_amt_based_on_3")
	WebElement SelectConsiderclaimAmt;
	@FindBy(css="input[type=submit]")
	WebElement UpdateReimbursementMstr;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfulmessage;
	
	public UpdateReimbursementMstrwithConsiderClaimAmtOnPresentDays(WebDriver driver) {
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
	
}
