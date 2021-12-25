package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateIMwithoutClubbedInSal extends BasePage{
	
	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[5]/a")
	WebElement ClickOnInsuranceMaster;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[1]/span/a")
	WebElement AddNewInsuranceMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement EnterInsuranceName;
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement UncheckClubbedinSalHead;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[6]/input")
	WebElement CreateInsurance;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfulmessage;
	@FindBy(xpath="//*[@class=\"action-delete\"]")
	WebElement ClickDelete;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[2]/table/tbody[2]/tr/td[contains(text(),'Insurance_Master')]/parent::tr/td[2]")
	WebElement ClubbedInSalNo;
	
	public CreateIMwithoutClubbedInSal(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickonmaster() {
		ClickOnMaster.click();
	}
	public void clickoninsurancemaster() {
		ClickOnInsuranceMaster.click();
	}
	public void addnewinsurancemaster() {
		AddNewInsuranceMaster.click();
	}
	public void enterinsurancename(String value) throws Exception {
		EnterInsuranceName.sendKeys(value);
	}
	public void uncheckclubbinsalhead() {
		UncheckClubbedinSalHead.click();
	}
	public void createinsurance() {
		CreateInsurance.click();
	}
	public String getMessage() {
		return successfulmessage.getText();
	}	
	public void clickdelete() {
		ClickDelete.click();
	}
	public String CheckNoBtn(){
		return ClubbedInSalNo.getText();
	}
}
