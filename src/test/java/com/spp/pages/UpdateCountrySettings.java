package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateCountrySettings extends BasePage{
	@FindBy(id="setting") 
	WebElement Settings;
	@FindBy(xpath="//*[@id=\"menu\"]/li[9]/div/div/ul/li[1]/a")
	WebElement OptionSettings;
	@FindBy(xpath="//*[@id=\"accordion\"]/ul/li[3]/a")
	WebElement CountrySettings;
	@FindBy(id="option_setting_country_id")
	WebElement Country;
	@FindBy(id="option_setting_time_zone")
	WebElement TimeZone;
	
	@FindBy(xpath="//*[@id=\"tab-3\"]/div[2]/div/div/fieldset/div[4]/div/input")
	WebElement UpdateSettings;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullMessage;
	
	public UpdateCountrySettings(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSettings(){
		Settings.click();
	}
	
	public void selectOptionSettings(){
		OptionSettings.click();
	}
	public void selectCountrySettings(){
		CountrySettings.click();
	}
	public void selectCountry(String value){
		Country.sendKeys(value);
	}
	public void selectTimeZone(String value){
		TimeZone.sendKeys(value);
	}

		public void ClickUpdateSettings(){
			UpdateSettings.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}

}
