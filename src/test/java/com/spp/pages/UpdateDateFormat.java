package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateDateFormat extends BasePage{
	@FindBy(id="setting") 
	WebElement Settings;
	@FindBy(xpath="//*[@id=\"menu\"]/li[9]/div/div/ul/li[1]/a")
	WebElement OptionSettings;
	@FindBy(xpath="//*[@id=\"accordion\"]/ul/li[4]/a")
	WebElement DateFormatSettings;
	@FindBy(id="option_setting_date_format")
	WebElement DateFormat;
	@FindBy(xpath="//*[@id=\"tab-4\"]/div[2]/div/div/fieldset/div[3]/div/input")
	WebElement UpdateSettings;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullMessage;
	
	public UpdateDateFormat(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSettings(){
		Settings.click();
	}
	
	public void selectOptionSettings(){
		OptionSettings.click();
	}
	public void selectDateFormatSettings(){
		DateFormatSettings.click();
	}
	public void selectDateFormat(String value){
		dropDownSelect(DateFormat,value);
	}
		public void ClickUpdateSettings(){
		UpdateSettings.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}

}
