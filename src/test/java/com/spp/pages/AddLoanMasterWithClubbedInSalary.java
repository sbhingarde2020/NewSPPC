package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddLoanMasterWithClubbedInSalary extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(linkText="Advance Master")
	WebElement AdvanceMaster;
	@FindBy(linkText="Add New Advance Master")
	WebElement NewAdvanceMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement AdvanceName;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement clubbedInSalary; 
	@FindBy(xpath="//input[@value='Create Advance']")
	WebElement CreateAdvance; 
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[2]/table/tbody//tr/td[1][contains(text(),'ADMaster')]/parent::tr/td[5]/a ")
	WebElement DeleteButton;
	
	
	public AddLoanMasterWithClubbedInSalary(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void clickAdvanceMaster() throws Exception{
		AdvanceMaster.click();
	}
	
	public void clickNewAdvanceMaster() throws Exception{
		NewAdvanceMaster.click();
	}
	public void clickAdvanceName(String value) throws Exception{
		AdvanceName.sendKeys(value);
	}
	public void clickclubbedInSalary() throws Exception{
		clubbedInSalary.click();
	}
	
	public void clickCreateAdvance() throws Exception{
		CreateAdvance.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	
}
