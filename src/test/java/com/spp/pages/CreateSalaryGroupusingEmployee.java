package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateSalaryGroupusingEmployee extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[4]/a")
	WebElement ClickOnSalaryRateDetails;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
	WebElement ClickonGeneralLinks;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-1\"]/li[2]/a")
	WebElement ClickOnSalaryStructure;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/span/a")
	WebElement CreateNewSalStructure;
	@FindBy(id="salary_group_salary_group_name")
	WebElement EnterSalStructureName;
	@FindBy(id="salary_group_based_on_gross")
	WebElement CheckBasedOnGross;
	@FindBy(xpath="//*[@id=\"salary_group\"]/div[3]/input")
	WebElement CreateSalStructure;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullmessage;
	@FindBy(xpath="//*[@id='main']/div/table/tbody/tr/td[contains(text(),'HRA STRUCTURE')]/parent::tr/td[5]/a")
	WebElement deleteicon;
	
	public CreateSalaryGroupusingEmployee(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);	
		}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonsalaryratedetails() {
		ClickOnSalaryRateDetails.click();
	}
	public void clickongenerallink() {
		ClickonGeneralLinks.click();
	}
	public void clickonsalarystructure() {
		ClickOnSalaryStructure.click();
	}
	public void createnewsalstructure() {
		CreateNewSalStructure.click();
	}
	public void entersalstructurename(String value) {
		EnterSalStructureName.sendKeys(value);
	}
	public void checkbasedongross() {
		CheckBasedOnGross.click();
	}
	public void createsalstructure() {
		CreateSalStructure.click();
	}
	public String getMessage(){
		return successfullmessage.getText();
	}
	public void clickDeleteSalaryStructure() throws Exception{
		deleteicon.click();
	}

}