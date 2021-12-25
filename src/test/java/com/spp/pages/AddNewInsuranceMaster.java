package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddNewInsuranceMaster extends BasePage {
	
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(linkText="Insurance Master")
	WebElement InsuranceMaster;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[2]/table/tbody[2]/tr[1]/td[1]")
	WebElement SelectedInsuranceMaster;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[1]/span/a")
	WebElement NewInsuranceMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement InsuranceName;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[6]/input")
	WebElement Createinsurance; 
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[2]/table/tbody[2]/tr[1]/td[4]/a")
	WebElement DeleteButton;
	
	
	public AddNewInsuranceMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void clickInsuranceMaster() throws Exception{
		InsuranceMaster.click();
	}
	
	
	public String getInsuranceMaster() {
		return SelectedInsuranceMaster.getText();
	}
	public void clickNewInsuranceMaster() throws Exception{
		NewInsuranceMaster.click();
	}
	public void clickInsuranceName(String value) throws Exception{
		InsuranceName.sendKeys(value);
	}
		
	public void clickCreateinsurance() throws Exception{
		Createinsurance.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickDeleteButton(String InsuranceMaster) throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}

}
