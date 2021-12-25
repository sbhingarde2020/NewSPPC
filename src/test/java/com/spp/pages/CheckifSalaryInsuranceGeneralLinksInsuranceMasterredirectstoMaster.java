package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifSalaryInsuranceGeneralLinksInsuranceMasterredirectstoMaster extends BasePage{
	
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(linkText="Insurance Master")
	WebElement InsuranceMaster;
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//a[text()='Insurance Detail']")
	WebElement ClickOnInsuranceDetail;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
	WebElement ClickonGeneralLinks;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-1\"]/li[1]/a")
	WebElement ClickOnInsuranceMaster;
	@FindBy(xpath="//a[text()='Add New Insurance Master']")
	WebElement AddNewInsuranceMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement InsuranceName;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[6]/input")
	WebElement CreateInsurance;
	@FindBy(xpath="//strong[text()='Insurance successfully created ']")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[2]/table/tbody/tr/td[4]/a")
	WebElement ClickDeleteInsuranceMaster;
	@FindBy(id="add_employees")
	WebElement ClickAddEmployees;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr/td[contains(text(),'Akshay')]/parent::tr/td[6]/a")
	WebElement ClickOnView;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr/td[9]/a")
	WebElement Delete;
	@FindBy(xpath="//button[text()='LOAD']")
	WebElement ClickOnLoad;
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Financial Institution (Bank)']")
	WebElement financialInstitution;
	@FindBy(xpath="//*[@class=\"action-delete\"]")
	WebElement DeleteFinancialInstitution;
	@FindBy(xpath="//*[@id=\"employees_dtable\"]/tbody/tr/td[contains(text(),'Aditya')]/parent::tr/td[6]/a[2]")
	WebElement DeleteEmployee;
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement ClickOnEmployDetails;
	@FindBy(id="filter_head")
	WebElement ClickOnFilterHead;
	
	public CheckifSalaryInsuranceGeneralLinksInsuranceMasterredirectstoMaster(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void clickInsuranceMaster() throws Exception{
		InsuranceMaster.click();
	}
	
	public void clickonsalary() {
		ClickOnSalary.click();
	}
	public void clickoninsurancedetail() {
		ClickOnInsuranceDetail.click();
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
	public void clickdelete() {
		Delete.click();
		switchToPopUpAndAccept(driver);
	}
	public void clickaddemployees() {
		ClickAddEmployees.click();
	}
	public void clickonview() {
		ClickOnView.click();
	}
	public void clickdeleteInsuranceMaster() {
		ClickDeleteInsuranceMaster.click();
		switchToPopUpAndAccept(driver);
	}
	public void clickonload() {
		ClickOnLoad.click();
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
	public void deleteemployee() {
    	DeleteEmployee.click();
    	switchToPopUpAndAccept(driver);
    }
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonemployeedetails() {
		ClickOnEmployDetails.click();
	}
	public void clickonfilter() {
		ClickOnFilterHead.click();
	}
	
}
