package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateGeneralSettingsPaymonth extends BasePage {

	@FindBy(id="setting") 
	WebElement Settings;
	@FindBy(xpath="//*[@id=\"menu\"]/li[9]/div/div/ul/li[1]/a")
	WebElement OptionSettings;
	@FindBy(id="option_setting_hold_salary")
	WebElement HoldSalary;
	@FindBy(id="option_setting_pt_gross")
	WebElement PTOnGross;
	@FindBy(id="option_setting_voluntary_pf")
	WebElement VoluntaryPF;
	
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/div[1]/div[3]/input")
	WebElement UpdateSettings;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullMessage;
	
	public UpdateGeneralSettingsPaymonth(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSettings(){
		Settings.click();
	}
	
	public void selectOptionSettings(){
		OptionSettings.click();
	}
	public void selectHoldSalary(){
		
		if(!HoldSalary.isSelected())
		{
			HoldSalary.click();
		}
	}
	public void selectPTOnGross(){
		if(!PTOnGross.isSelected())
		{
			PTOnGross.click();
		}
	}
	public void selectVoluntaryPF(){
		if(!VoluntaryPF.isSelected())
		{
			VoluntaryPF.click();
		}
	}

		public void ClickUpdateSettings(){
			UpdateSettings.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}

}
