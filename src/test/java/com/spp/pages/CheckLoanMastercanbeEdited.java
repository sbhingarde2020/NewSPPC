package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckLoanMastercanbeEdited extends BasePage {
	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[4]/a")
	WebElement SelectLoanMaster;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[1]/span/a")
	WebElement AddNewLoanMaster;
	@FindBy(xpath="//*[@class=\"action-edit\"]")
	WebElement ClickonEdit;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement EditLoanMasterName;
	@FindBy(id="standing_instruction_master_interest_rate")
	WebElement EnterInterestRate;
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement UncheckClubbedInSalary;
	@FindBy(id="standing_instruction_master_max_amount")
	WebElement EnterMaxAmount;
	@FindBy(id="standing_instruction_master_max_allowed")
	WebElement EnterMaxAllowed;
	@FindBy(id="standing_instruction_master_emi_recovery")
	WebElement EnterEMIRecovery;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[8]/input")
	WebElement UpdateLoanMaster;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong") 
	WebElement successfullMessage;
	
	public CheckLoanMastercanbeEdited(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickonMaster() throws Exception{
		ClickOnMaster.click();
	}
	public void selectloanmaster() throws Exception{
		SelectLoanMaster.click();
	}
	public void clickonedit() throws Exception{
		ClickonEdit.click();
	}
	public void editloanmastername(String value) throws Exception{
		EditLoanMasterName.clear();
		EditLoanMasterName.sendKeys(value);
	}
	public void enterinterestrate(String value) throws Exception{
		EnterInterestRate.sendKeys(value);
	}
	public void uncheckclubbedInsalary() throws Exception{
		UncheckClubbedInSalary.click();
	}
	public void entermaxamount(String value) throws Exception{
		EnterMaxAmount.sendKeys(value);
	}
	public void entermaxallowed(String value) throws Exception{
		EnterMaxAllowed.sendKeys(value);
	}
	public void enteremirecovery(String value) throws Exception{
		EnterEMIRecovery.sendKeys(value);
	}
	public void updateloanmaster() throws Exception{
		UpdateLoanMaster.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	} 
}
