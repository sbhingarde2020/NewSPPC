package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateBonus extends BasePage{
	@FindBy(id="salary") 
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[11]/a")
	WebElement Bonus;
	@FindBy(xpath="//*[@id=\"bonus_or_exgratia\"]/div/table/tbody/tr[1]/td[3]/a")
	WebElement Compute;
	@FindBy(id="filter_head")
	WebElement ClickOnFilter;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id='bec_employees']/tbody/tr/td[normalize-space()='Anil']/parent::tr/td[7]/a")
	WebElement ClickOnEdit;
	@FindBy(id="bonus_exgratia_calculation_amount_given")
	WebElement EnterBonusAmount;
	@FindBy(css="input[type=submit]")
	WebElement ClickOnUpdate;
	public UpdateBonus(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSalary(){
		Salary.click();
	}
	
	public void selectBonus(){
		Bonus.click();
	}
	public void clickCompute(){
		Compute.click();
	}
	public void clickonfilter() {
		ClickOnFilter.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonedit() {
		ClickOnEdit.click();
	}
	public void enterbonusamount(String value) {
		EnterBonusAmount.clear();
		EnterBonusAmount.sendKeys(value);
	}
	public void clickonupdatebutton() {
		ClickOnUpdate.click();
	}
	
}
