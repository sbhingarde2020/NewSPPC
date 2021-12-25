package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckPeriodicIncentiveRedirectsToMaster extends BasePage{
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(linkText="Periodic Incentive Detail")
	WebElement PeriodicIncentiveDetails;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
	WebElement GeneralLink;
	@FindBy(linkText="Periodic Incentive Master")
	WebElement PeriodicMaster;
	@FindBy(linkText="Add New Periodic Incentive Master")
	WebElement AddNewPeriodicMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement PeriodicName;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[6]/input")
	WebElement CreateButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfulMessage;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[2]/table/tbody/tr[1]/td[4]/a")
	WebElement ClickDeleteMaster;
	
	public CheckPeriodicIncentiveRedirectsToMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickdelete() {
		ClickDeleteMaster.click();
		switchToPopUpAndAccept(driver);
	}
	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickPeriodicIncentiveDetails() throws Exception{
		PeriodicIncentiveDetails.click();
	}
	public void clickGeneralLink() throws Exception{
		GeneralLink.click();	
	}
	public void clickPeriodicMaster() throws Exception{
		PeriodicMaster.click();
	}
	public void clickAddNewPeriodicMaster(){
		AddNewPeriodicMaster.click();	
	}
	public void clickPeriodicName(String value){
		PeriodicName.sendKeys(value);
	}
    public void clickCreateButton(){
	    CreateButton.click();
    }	
    
    public String getMessage() {
    	return successfulMessage.getText();
}
}
