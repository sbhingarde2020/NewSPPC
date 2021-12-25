package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddNewAdvanceMaster extends BasePage{
	
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[3]/a")
	WebElement AdvanceMaster;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[1]/span/a")
	WebElement AddNewAdvanceMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement AdvanceName;
	@FindBy(id="standing_instruction_master_max_amount")
	WebElement MaxAmount;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[8]/input")
	WebElement CreateButton;
	@FindBy(id="standing_instruction_master_max_allowed")
	WebElement maxAllowed;
	@FindBy(xpath="//strong[text()='Advance successfully created ']")
	WebElement successfulMessage;
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement ClubbedInSal;
	@FindBy(id="standing_instruction_master_reducing_balance")
	WebElement ReducingBal;
	@FindBy(id="standing_instruction_master_interest_rate")
	WebElement EnterInterestRate;
	@FindBy(id="standing_instruction_master_emi_recovery")
	WebElement EMIRecovery;

	
	public AddNewAdvanceMaster(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){

		masterLink.click();
	}

	public void clickAdvanceMaster(){
		AdvanceMaster.click();
	}
	public void clickAddNewAdvanceMaster(){
		AddNewAdvanceMaster.click();	
	}
	public void clickAdvanceName(String value){
		AdvanceName.sendKeys(value);
	}

	public void ClickMaxAmount(String value){
		MaxAmount.sendKeys(value);
	}	

    public void clickCreateButton(){
	    CreateButton.click();
    }	
   
    public String getMessage() {
    	return successfulMessage.getText();
    }
    
    public void uncheckclubbedinsal() {
    	ClubbedInSal.click();
    }
    
    public void checkreducingbal() {
    	ReducingBal.click();	
    }  
    public void enterinterestrate(String value) {
    	EnterInterestRate.sendKeys(value);
    }
    public void emirecovery(String value) {
    	EMIRecovery.sendKeys(value);
    }
    public void enterMaximumAllowed(String value) throws Exception{
		maxAllowed.clear();
		maxAllowed.sendKeys(value);
	}

}
