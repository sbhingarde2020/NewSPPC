package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteAdvanceMaster extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Advance Master']")
	WebElement advanceMaster;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[2]/table/tbody/tr/td[contains(text(),'Advance_Master')]/parent::tr/td[5]/a")
	WebElement Deletebutton;
	@FindBy(xpath="//strong[text()='Advance successfully deleted']")
	WebElement successfullMessage;

	public DeleteAdvanceMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void  clickAdvanceMaster() throws Exception{
		advanceMaster.click();
	}

	public void  clickDeleteAdvanceMaster() throws Exception{
		Deletebutton.click();
		
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}

}
