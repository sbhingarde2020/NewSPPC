package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckIfSalHeadisAssignInSalStructure extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[4]/a")
	WebElement ClickOnSalaryRateDetails;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/nav/ul/li[2]/a")
	WebElement SelectSalaryAllotedTab;	
	@FindBy(id="filter_head")
	WebElement ClickonFilter;
	@FindBy(xpath="//*[@id='bf_form']/div[10]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"alloted\"]/tbody/tr/td[contains(text(),'JOHN')]/parent::tr/td[4]/a")
	WebElement ClickOnEdit;
	
	
	public CheckIfSalHeadisAssignInSalStructure(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);	
		}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonsalaryratedetails() {
		ClickOnSalaryRateDetails.click();
	}
	public void selectsalaryallotedtab() {
		SelectSalaryAllotedTab.click();
	}
	public void clickonfilter() {
		ClickonFilter.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonedit() {
		ClickOnEdit.click();
	}
}
