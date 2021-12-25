package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckLMcanbecreatedwithClubbSalandRedBal extends BasePage{
	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[4]/a")
	WebElement SelectLoanMaster;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[1]/span/a")
	WebElement AddNewLoanMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement EnterLoanName;
	@FindBy(id="standing_instruction_master_interest_rate")
	WebElement EnterInterestRate;
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement UncheckClubbedInSalary;
	@FindBy(id="standing_instruction_master_reducing_balance")
	WebElement CheckReducingBal;
	@FindBy(id="standing_instruction_master_max_amount")
	WebElement EnterMaxAmount;
	@FindBy(id="standing_instruction_master_max_allowed")
	WebElement EnterMaxAllowed;
	@FindBy(id="standing_instruction_master_emi_recovery")
	WebElement EnterEMIRecovery;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[8]/input")
	WebElement CreateLoanMaster;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong") 
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[2]/table/tbody/tr/td[5]/a")
	WebElement ClickDelete;
	
	public CheckLMcanbecreatedwithClubbSalandRedBal(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickonMaster() throws Exception{
		ClickOnMaster.click();
	}
	public void selectloanmaster() throws Exception{
		SelectLoanMaster.click();
	}
	public void addnewloanmaster() throws Exception{
		AddNewLoanMaster.click();
	}
	public void enterloanName(String value) throws Exception{
		EnterLoanName.sendKeys(value);
	}
	public void enterinterestrate(String value) throws Exception{
		EnterInterestRate.sendKeys(value);
	}
	public void uncheckclubbedInsalary() throws Exception{
		UncheckClubbedInSalary.click();
	}
	public void checkreducingbal() throws Exception{
		CheckReducingBal.click();
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
	public void createloanmaster() throws Exception{
		CreateLoanMaster.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	} 
	public void clickDeleteButton() {
		ClickDelete.click();
	}
}
