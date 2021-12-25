package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckInsuranceMastercanbeEdited extends BasePage{
	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[5]/a")
	WebElement ClickOnInsuranceMaster;
	@FindBy(xpath="//a[text()='Add New Insurance Master']")
	WebElement AddNewInsuranceMaster;
	@FindBy(xpath="//*[@class=\"action-edit\"]")
	WebElement ClickOnEdit;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement EnterInsuranceName;
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement UncheckClubbedinSalHead;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[6]/input")
	WebElement UpdateInsurance;
	@FindBy(xpath="//strong[text()='Insurance successfully updated']")
	WebElement successfulmessage;
	
	public CheckInsuranceMastercanbeEdited(WebDriver driver) {
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
	public void clickonedit() {
		ClickOnEdit.click();
	}
	public void enterinsurancename(String value) throws Exception {
		EnterInsuranceName.clear();
		EnterInsuranceName.sendKeys(value);
	}
	public void uncheckclubbinsalhead() {
		UncheckClubbedinSalHead.click();
	}
	public void updateinsurance() {
		UpdateInsurance.click();
	}
	public String getMessage() {
		return successfulmessage.getText();
	}	
	
}
