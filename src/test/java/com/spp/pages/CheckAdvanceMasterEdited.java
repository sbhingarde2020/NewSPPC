package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckAdvanceMasterEdited extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[3]/a")
	WebElement AdvanceMaster;
	
	@FindBy(id="standing_instruction_master_si_name")
	WebElement AdvanceName;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[8]/input")
	WebElement UpdateButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfulMessage;
	@FindBy(xpath="//*[@id='standing_instr_list']/div/table/tbody/tr/td[contains(text(),'Advance_Master')]/parent::tr/td[3]/a")
	WebElement EditButton;
	
	public CheckAdvanceMasterEdited(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){

		masterLink.click();
	}
	public void clickAdvanceMaster(){
		AdvanceMaster.click();
	}
	public void clickEdit(){
		EditButton.click();	
	}
	public void EditAdvanceName(String value){
		AdvanceName.clear();
		AdvanceName.sendKeys(value);
	}

	public void clickUpdateButton(){
		UpdateButton.click();
	}
    public String getMessage() {
    	return successfulMessage.getText();
    }
}