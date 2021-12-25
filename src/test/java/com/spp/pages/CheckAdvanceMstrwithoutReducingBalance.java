package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckAdvanceMstrwithoutReducingBalance extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Advance Master']")
	WebElement advanceMaster;
	@FindBy(xpath="//a[text()='Add New Advance Master']")
	WebElement addAdvanceMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement advanceName;
	@FindBy(id="standing_instruction_master_interest_rate")
	WebElement interestRate;
	@FindBy(id="standing_instruction_master_max_amount")
	WebElement maxAmount;
	@FindBy(id="standing_instruction_master_reducing_balance")
	WebElement WithReducingBal;
	@FindBy(xpath="//input[@value='Create Advance']")
	WebElement createAdvance;
	@FindBy(xpath="//strong[text()='Advance successfully created ']")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[2]/table/tbody/tr/td[contains(text(),'Advance_Master')]/parent::tr/td[5]/a")
	WebElement Deletebutton;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[2]/table/tbody[2]/tr/td[contains(text(),'Advance_Master')]/parent::tr/td[2]")
	WebElement ReduceBalYes;
	
	
	public CheckAdvanceMstrwithoutReducingBalance(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void  clickAdvanceMaster() throws Exception{
		advanceMaster.click();
	}

	public void clickAddAdvancMaster() throws Exception{
		addAdvanceMaster.click();
	}

	public void enterAdvanceName(String value) throws Exception{
		advanceName.sendKeys(value);
	}

	public void enterInterestRate(String value) throws Exception{
		interestRate.sendKeys(value);
	}

	public void enterMaximumAmount(String value) throws Exception{
		maxAmount.sendKeys(value);
	}
	public void checkreducingbal() throws Exception{
		WithReducingBal.click();
	}
	public void clickCreateAdvanceButton() throws Exception{
		createAdvance.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}
	public void  clickDeleteAdvanceMaster() throws Exception{
		Deletebutton.click();
	}
	
	public String checkifYesButton(){
		return ReduceBalYes.getText();
	}
	
}
