package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdatePeriodicIncentive extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Periodic Incentive Master']")
	WebElement periodicIncentive;
	@FindBy(xpath="(//a[text()='Edit'])[1]")
	WebElement editPeriodicIncentive;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement periodicIncentiveName;
	@FindBy(xpath="//input[@value='Update Periodic Incentive']")
	WebElement updatePriodivIncetive;
	@FindBy(xpath="//strong[text()='Periodic Incentive successfully updated']")
	WebElement successfullMessage;
	
	public UpdatePeriodicIncentive(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void selectPeriodicIncentive() throws Exception{
		periodicIncentive.click();
	}
	
	public void clickEditPeriodicIncentive() throws Exception{
		editPeriodicIncentive.click();
	}
	
	public void enterPeriodicIncentiveName(String value) throws Exception{
		periodicIncentiveName.clear();
		periodicIncentiveName.sendKeys(value);
	}
	
	public void clickUpdatePeriodicIncentive() throws Exception{
		updatePriodivIncetive.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
