package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddPeriodicIncentive extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Periodic Incentive Master']")
	WebElement periodicIncentive;
	@FindBy(xpath="//a[text()='Add New Periodic Incentive Master']")
	WebElement addPeriodicIncentive;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement periodicIncentiveName;
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement UntickClubbedInSalary;
	
	@FindBy(xpath="//input[@value='Create Periodic Incentive']")
	WebElement createPeriodicIncentive;
	@FindBy(xpath="//strong[text()='Periodic Incentive successfully created ']")
	WebElement successfullMessage;

	public AddPeriodicIncentive(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void selectPeriodicIncentive() throws Exception{
		periodicIncentive.click();
	}

	public void selectUntickClubbedInSalary() throws Exception{
		UntickClubbedInSalary.click();
	}
	
	public void clickAddPeriodicIncentive() throws Exception{
		addPeriodicIncentive.click();
	}

	public void enterPeriodicIncentiveName(String value) throws Exception{
		periodicIncentiveName.sendKeys(value);
	}

	public void clickCreatePeriodicIncentive() throws Exception{
		createPeriodicIncentive.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
