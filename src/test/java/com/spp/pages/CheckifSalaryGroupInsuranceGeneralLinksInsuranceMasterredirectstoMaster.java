package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifSalaryGroupInsuranceGeneralLinksInsuranceMasterredirectstoMaster extends BasePage {

	 
		@FindBy(id="salary")
		WebElement ClickOnSalary;
		@FindBy(xpath="//a[text()='Group Insurance Detail']")
		WebElement ClickOnGroupInsuranceDetail;
		@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
		WebElement ClickonGeneralLinks;
		@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-1\"]/li[1]/a")
		WebElement ClickOnInsuranceMaster;
		@FindBy(xpath="//a[text()='Add New Group Insurance Master']")
		WebElement AddNewInsuranceMaster;
		@FindBy(id="standing_instruction_master_si_name")
		WebElement InsuranceName;
		@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[6]/input")
		WebElement CreateInsurance;
		@FindBy(xpath="//strong[text()='Group Insurance successfully created ']")
		WebElement successfullMessage;
		@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[2]/table/tbody/tr/td[4]/a")
		WebElement DeleteMaster;
		@FindBy(id="master")
		WebElement masterLink;
		@FindBy(xpath="//a[text()='Financial Institution (Bank)']")
		WebElement financialInstitution;
		@FindBy(xpath="//*[@class=\"action-delete\"]")
		WebElement DeleteFinancialInstitution;
		
		
		public CheckifSalaryGroupInsuranceGeneralLinksInsuranceMasterredirectstoMaster(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
		}
		public void clickonsalary() {
			ClickOnSalary.click();
		}
		public void clickongroupinsurancedetail() {
			ClickOnGroupInsuranceDetail.click();
		}
		public void clickongenerallinks() {
			ClickonGeneralLinks.click();
		}
		public void clickoninsurancemaster() {
			ClickOnInsuranceMaster.click();
		}
		public void addnewinsurancemaster() {
			AddNewInsuranceMaster.click();
		}
		public void enterinsurancename(String value) {
			InsuranceName.sendKeys(value);
		}
		public void clickoncreateinsurance() {
			CreateInsurance.click();	
		}
		public String getMessage() {
			return successfullMessage.getText();
		}
		public void deletemaster() {
			DeleteMaster.click();
		}
		public void clickMastserLink(){
			masterLink.click();
		}

		public void selectFinancialInstitution(){
			financialInstitution.click();
		}
		public void deletefinancialinsti() {
			DeleteFinancialInstitution.click();
			switchToPopUpAndAccept(driver);
		}

}
