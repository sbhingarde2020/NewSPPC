package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateReimbursement extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Reimbursement Master']")
	WebElement reimbursemnetLink;
    @FindBy(xpath="(//a[text()='Edit'])[1]")
    WebElement editReimbursement;
	@FindBy(id="reimbursement_master_payment_mode")
	WebElement modeOfPayment;
	@FindBy(id="reimbursement_master_reimbursement_name")
	WebElement reimbursementName;
	@FindBy(xpath="(//input[@id='edit_radio_allotment'])[3]")
	WebElement lumpsum;
	@FindBy(id="reimbursement_master_applicable_for_tds_calc")
	WebElement considerTDS;
	@FindBy(xpath="//*[@class='btn2 btn-bglightblue']")
	WebElement updateReimbursement;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullMessage;
	
	public UpdateReimbursement(WebDriver driver) {
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
	
	public void selectModeOfPayment(String value){
		dropDownSelect(modeOfPayment, value);
	}
	
	public void enterReimbursementName(String value){
		reimbursementName.clear();
		reimbursementName.sendKeys(value);
	}
	
	public void clickLumpusum(){
		lumpsum.click();
	}
	
	public void clickConsiderTDS(){
		considerTDS.click();
	}
	
	public void clickUpdateReimbursement(){
		updateReimbursement.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
