package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteHrCategoryDetailsofEmployee extends BasePage {
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement ClickOnEmployeeDetails;
	@FindBy(id="filter_head")
	WebElement ClickonFilter;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id='employees_dtable']/tbody/tr/td[contains(text(),'Anil')]/parent::tr/td[6]/a[1]")
	WebElement ClickonView;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
	WebElement ClickonHRCategory;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-1\"]/li[3]/a")
	WebElement ClickonPersonal;
	@FindBy(xpath="//*[@id='hr_category']/div/table/thead/tr/td[7]/a")
	WebElement DeleteHRCategory;
	@FindBy(xpath="//*[@id=\"hr_masters_index\"]/div/strong")
	WebElement successfulmessage;
	
	public DeleteHrCategoryDetailsofEmployee(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonemployeedetails() {
		ClickOnEmployeeDetails.click();
	}
	public void clickonfilter() {
		ClickonFilter.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonview() {
		ClickonView.click();
	}
	public void clickonhrcategory() {
		ClickonHRCategory.click();
	}
	public void clickonpersonal() {
		ClickonPersonal.click();
	}
	public void deletehrcategory() {
		DeleteHRCategory.click();
	}
	public String getMessage(){
		return successfulmessage.getText();
	}
}
