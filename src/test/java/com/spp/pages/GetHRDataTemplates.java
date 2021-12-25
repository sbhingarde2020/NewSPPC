package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class GetHRDataTemplates extends BasePage {
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement ClickOnEmployeeDetails;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
	WebElement ClickonImportExport;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-1\"]/ul/li[6]/a")
	WebElement ClickonHRDataTemplate;
	@FindBy(id="hr_category")
	WebElement SelectHRCategory;
	@FindBy(id="hr_excel_filter")
	WebElement GetEmployees;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(id="hr_excel_submit")
	WebElement GetDataTemplate;
	
	public GetHRDataTemplates(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonemployeedetails() {
		ClickOnEmployeeDetails.click();
	}
	public void clickonimportexport() {
		ClickonImportExport.click();
	}
	public void clickonhrdatatemplate() {
		ClickonHRDataTemplate.click();
	}
	public void selecthrcategory(String value) {
		dropDownSelect(SelectHRCategory, value);
	}
	public void getemployees() {
		GetEmployees.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void getdatatemplate() {
		GetDataTemplate.click();
	}
}
