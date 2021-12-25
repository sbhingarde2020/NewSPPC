package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateSalaryHeadusingEmployee extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[4]/a")
	WebElement ClickOnSalaryRateDetails;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
	WebElement ClickonGeneralLinks;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-1\"]/li[1]/a")
	WebElement ClickOnSalaryHead;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/span/a")
	WebElement AddNewSalaryHead;
	@FindBy(id="salary_head_head_name")
	WebElement EnterHeadName;
	@FindBy(id="salary_head_short_name")
	WebElement EnterShortName;
	@FindBy(xpath="//*[@id=\"salary_head_form\"]/div[2]/input")
	WebElement CreateSalaryHead;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement successfullmessage;
	@FindBy(xpath="//*[@id='earning_heads']/tbody/tr/td[contains(text(),'HRA')]/parent::tr/td/a[text()='Delete']")	
	WebElement deletebutton;
	
	public CreateSalaryHeadusingEmployee(WebDriver driver) {
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
	public void clickonsalaryhead() {
		ClickOnSalaryHead.click();
	}
	public void addnewsalhead() {
		AddNewSalaryHead.click();
	}
	public void enterheadname(String value) {
		EnterHeadName.sendKeys(value);
	}
	public void entershortname(String value) {
		EnterShortName.sendKeys(value);
	}
	public void createsalaryhead() {
		CreateSalaryHead.click();
	}
	public String getMessage(){
		return successfullmessage.getText();
	}
	public void clickDeleteSalaryHeadsButton() throws Exception{
		deletebutton.click();
	}
	
}
