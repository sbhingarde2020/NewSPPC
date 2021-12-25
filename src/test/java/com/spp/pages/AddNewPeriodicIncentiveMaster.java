package com.spp.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddNewPeriodicIncentiveMaster extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[7]/a")
	WebElement PeriodicIncentiveMaster;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[1]/span/a")
	WebElement AddPeriodicIncentive;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement Name;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[6]/input")
	WebElement CreateButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[2]/table/tbody[2]/tr/td[1][contains(text(),'Periodic')]/parent::tr/td[4]/a[1]")
	List<WebElement> Delete;
	
	public AddNewPeriodicIncentiveMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigatemasterlink() throws Exception{
		masterlink.click();
	}
	
	public void clickPeriodicIncentiveMaster() throws Exception{
		PeriodicIncentiveMaster.click();
	}
	public void clickAddPeriodicIncentive() throws Exception{
		AddPeriodicIncentive.click();
	}
	
	public void clickCreateButton() throws Exception{
		CreateButton.click();
	}
	public void clickName(String value) throws Exception{
		Name.sendKeys(value);
	
   }
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickDelete() throws Exception{
		Delete.get(0).click();
		switchToPopUpAndAccept(driver);
	}
	
	

}
