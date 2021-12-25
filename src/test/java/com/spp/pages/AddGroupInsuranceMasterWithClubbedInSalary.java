package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddGroupInsuranceMasterWithClubbedInSalary extends BasePage {
	
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(linkText="Group Insurance Master")
	WebElement GroupInsuranceMaster;
	//@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[2]/table/tbody[2]/tr[1]/td")
	//WebElement SelectedGroupInsuranceMaster;
	@FindBy(linkText="Add New Group Insurance Master")
	WebElement NewGroupInsuranceMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement GroupInsuranceName;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[6]/input")
	WebElement CreateGroupinsurance; 
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[2]/table/tbody[2]/tr/td[1][contains(text(),'GIMaster')]/parent::tr/td[4]/a")
	WebElement DeleteButton;
	
	
	public AddGroupInsuranceMasterWithClubbedInSalary(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void clickGroupInsuranceMaster() throws Exception{
		GroupInsuranceMaster.click();
	}
	
	
//	public String getSelectedGroupInsuranceMaster() {
//		return SelectedGroupInsuranceMaster.getText();
//	}
	public void clickNewGroupInsuranceMaster() throws Exception{
		NewGroupInsuranceMaster.click();
	}
	public void clickGroupInsuranceName(String value) throws Exception{
		GroupInsuranceName.sendKeys(value);
	}
		
	public void clickCreateGroupinsurance() throws Exception{
		CreateGroupinsurance.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
}
