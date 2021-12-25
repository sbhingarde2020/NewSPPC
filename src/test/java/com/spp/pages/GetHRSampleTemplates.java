package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class GetHRSampleTemplates extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement ClickOnEmployeeDetails;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
	WebElement ClickonImportExport;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-1\"]/ul/li[5]/a")
	WebElement ClickonHRSampleTemplate;
	@FindBy(id="select_category")
	WebElement SelectHRCategory;
	@FindBy(id="get_template")
	WebElement GetTemplate;
	
	public GetHRSampleTemplates(WebDriver driver) {
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
	public void clickonhrsampletemplate() {
		ClickonHRSampleTemplate.click();
	}
	public void selecthrcategory(String value) {
		dropDownSelect(SelectHRCategory, value);
	}
	public void gettemplate() {
		GetTemplate.click();
	}
}
