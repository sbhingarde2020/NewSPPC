package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddNewGroupInsuranceMaster extends BasePage{
	

	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[6]/a")
	WebElement GroupInsurance;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[1]/span/a")
	WebElement AddNewMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement Name;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[6]/input")
	WebElement CreateButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[2]/table/tbody[2]/tr/td[1][contains(text(),'Group')]/parent::tr/td[4]/a")
	WebElement Delete;
	public AddNewGroupInsuranceMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void clickGroupInsurance() throws Exception{
		GroupInsurance.click();
	}
	public void clickAddNewMaster() throws Exception{
		AddNewMaster.click();
	}
	public void clickName(String value) throws Exception{
		Name.sendKeys(value);
	}
	public void clickCreateButton() throws Exception{
		CreateButton.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickDelete() throws Exception{
		Delete.click();
		switchToPopUpAndAccept(driver);
	}
}
