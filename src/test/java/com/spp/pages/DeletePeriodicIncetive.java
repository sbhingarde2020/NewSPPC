package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeletePeriodicIncetive extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Periodic Incentive Master']")
	WebElement periodicIncentive;
	@FindBy(xpath="(//a[text()='Delete'])[1]")
	WebElement deletePeriodicIncetive;
	@FindBy(xpath="//strong[text()='Periodic Incentive successfully deleted']")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[2]/table/tbody/tr/td[contains(text(),'PeriodicIncentiveMaster')]")
	WebElement SelectedPeriodicIncentiveMaster;
	
	public DeletePeriodicIncetive(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void selectPeriodicIncentive() throws Exception{
		periodicIncentive.click();
	}
	
	public void clickDeletePeriodicIncentive() throws Exception{
		deletePeriodicIncetive.click();
		
	}
	public String getMessage(){
		return successfullMessage.getText();
	}
	public boolean CheckIfPresent() {
		return checkIfExist(SelectedPeriodicIncentiveMaster);
	}
}
