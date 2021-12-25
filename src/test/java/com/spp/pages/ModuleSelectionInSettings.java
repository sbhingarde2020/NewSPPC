package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class ModuleSelectionInSettings extends BasePage{
	@FindBy(id="setting") 
	WebElement Settings;
	@FindBy(xpath="//*[@id=\"menu\"]/li[9]/div/div/ul/li[1]/a")
	WebElement OptionSettings;
	@FindBy(xpath="//*[@id=\"accordion\"]/ul/li[2]/a")
	WebElement ModuleSelection;
	@FindBy(id="option_setting_remibursement")
	WebElement RemibursementModule;
	@FindBy(xpath="//*[@id=\"tab-2\"]/div[3]/input")
	WebElement UpdateModule;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullMessage;
	
	public ModuleSelectionInSettings(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSettings(){
		Settings.click();
	}
	
	public void selectOptionSettings(){
		OptionSettings.click();
	}
	public void selectModuleSelection(){
		if(!ModuleSelection.isSelected()) {
		ModuleSelection.click();
		}
	}
	public void selectRemibursementModule(){
		if(!RemibursementModule.isSelected()) {
		RemibursementModule.click();
		}
	}
	public void clickUpdateModule(){
		UpdateModule.click();
	}

		
	public String getMessage(){
		return successfullMessage.getText();
	}

}
