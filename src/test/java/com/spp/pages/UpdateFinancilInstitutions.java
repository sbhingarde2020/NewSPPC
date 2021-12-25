package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateFinancilInstitutions extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Financial Institution (Bank)']")
	WebElement financialInstitution;
	@FindBy(xpath="//*[@id=\"financial_institutions\"]/tbody/tr/td[contains(text(),'ICICIBank')]/parent::tr/td[8]/a")
	WebElement editIcon;
	@FindBy(id="financial_institution_account_type")
	WebElement accoutType;
	@FindBy(id="financial_institution_name")
	WebElement instName;
	@FindBy(id="financial_institution_branch_code")
	WebElement branchCode;
	@FindBy(id="financial_institution_email")
	WebElement email;
	@FindBy(id="financial_institution_address")
	WebElement address;
	@FindBy(id="financial_institution_pincode")
	WebElement pinCode;
	@FindBy(id="financial_institution_ifsc_code")
	WebElement IFSCcode;
	@FindBy(id="financial_institution_micr_code")
	WebElement MICRCode;
	@FindBy(xpath="//input[@value='Update Financial institution']")
	WebElement updateButton;
	@FindBy(xpath="//strong[text()='Financial Institution successfully updated']")
	WebElement successfullMessage;

	public UpdateFinancilInstitutions(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectFinancialInstitution(){
		financialInstitution.click();
	}
	
    public void clickEditIcon(){
    	editIcon.click();
    }
    
    public void selectAccoutType(String value){
		dropDownSelect(accoutType, value);
	}
	
	public void enterInstName(String value){
		instName.clear();
		instName.sendKeys(value);
	}
	
	public void enterBranchCode(String value){
		branchCode.clear();
		branchCode.sendKeys(value);
	}
	
	public void enterEmail(String value){
		email.clear();
		email.sendKeys(value);
	}
	
	public void enterAddress(String value){
		address.clear();
		address.sendKeys(value);
	}
	
	public void enterPinCode(String value){
		pinCode.clear();
		pinCode.sendKeys(value);
	}
	
	public void enterIFSCCode(String value){
		IFSCcode.clear();
		IFSCcode.sendKeys(value);
	}
	
	public void enterMICRCode(String value){
		MICRCode.clear();
		MICRCode.sendKeys(value);
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
