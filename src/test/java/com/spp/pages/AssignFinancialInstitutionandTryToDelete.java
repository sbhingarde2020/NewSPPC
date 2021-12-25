package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AssignFinancialInstitutionandTryToDelete extends BasePage{
	
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement ClickOnEmployDetails;
	@FindBy(id="filter_head")
	WebElement ClickOnFilterHead;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id='employees_dtable']/tbody/tr[1]/td/a[1]")
	WebElement ClickOnView; 
	@FindBy(xpath="//*[@id=\"classification_details\"]/a")
	WebElement ClickClassificationDetail;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/span/a")
	WebElement AddNewClassificationDetail;
	@FindBy(id="employee_detail_financial_institution_id")
	WebElement SelectBank;
	@FindBy(id="sed")
	WebElement EffectiveDate;
	@FindBy(xpath="//*[@id='CalendarControl']/table/tbody/tr[5]/td[3]/a")
	WebElement SelectDate;
	@FindBy(xpath="//*[@id=\"CalendarControl\"]/table/tbody/tr[1]/td[1]/a")
	WebElement ChangeYear;
	@FindBy(id="bank_ac")
	WebElement BankAccountNo;
	@FindBy(xpath="//*[@class='btn2 btn-bglightblue']")
	WebElement CreateClassificationDetail;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfulmessage;
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Financial Institution (Bank)']")
	WebElement financialInstitution;
	@FindBy(xpath="//*[@id=\"financial_institutions\"]/tbody/tr/td[contains(text(),'State Bank')]/parent::tr/td[9]/a")
	WebElement DeleteFinancialInstitution;
	@FindBy(xpath="//*[@id='main']/div[4]/table/tbody/tr/td[7]/a")
	WebElement DeleteClassDetail;
	
	public AssignFinancialInstitutionandTryToDelete(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
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
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonview() {
		ClickOnView.click();
	}
	public void clickclassificationdetail() {
		ClickClassificationDetail.click();
	}
	public void addnewclassificationdetail() {
		AddNewClassificationDetail.click();
	}
	public void SelectBank(String value) {
		dropDownSelect(SelectBank, value);
	}
	public void Effectivedate() {
		EffectiveDate.click();
	}
	public void Selectdate() {
		SelectDate.click();
	}
	public void enterbankaccno(String value) {
		BankAccountNo.sendKeys(value);
	}
	public void createclassdetail() {
		CreateClassificationDetail.click();
	}
	public void changeyear() {
		ChangeYear.click();
	}
	public String getMessage(){
		return successfulmessage.getText();
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
	public void deleteclassdetail() {
		DeleteClassDetail.click();
		switchToPopUpAndAccept(driver);
	}
}
