package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckAdvanceMasterDeleted extends BasePage {
	
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[3]/a")
	WebElement AdvanceMaster;
	@FindBy(xpath="//*[@id='standing_instr_list']/div/table/tbody/tr/td[contains(text(),'Advance_Master')]/parent::tr/td[4]/a")
	WebElement Deletebutton;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfulMessage;
	
	public CheckAdvanceMasterDeleted(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){

		masterLink.click();
	}

	public void clickAdvanceMaster(){
		AdvanceMaster.click();
	}
	public void clickDeleteButton(){
		Deletebutton.click();
	}
	    
    public String getMessage() {
    	return successfulMessage.getText();
    }
}
