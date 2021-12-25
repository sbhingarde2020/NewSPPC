package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifSalaryArrearsGeneralLinkPaymonthsredirectstoCreateNewPaymonthpage extends BasePage{
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[3]/a")
	WebElement Arrears;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
	WebElement ClickonGeneralLinks;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-1\"]/li[1]/a")
	WebElement ClickOnPaymonths;
	@FindBy(css="input[type=submit]")
	WebElement CreatePaymonth;
	@FindBy(xpath="//*[@id=\"paymonth-lists\"]/form/div[3]/table/tbody/tr[1]/td[8]/a/img")
	WebElement ClickDelete;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/div/div/fieldset/div[2]/form/div/input[2]")
	WebElement DeleteConfirm;
	public CheckifSalaryArrearsGeneralLinkPaymonthsredirectstoCreateNewPaymonthpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	
	public void clickonsalary() {
		ClickOnSalary.click();
	}
	public void selectArrears(){
		Arrears.click();
	}
	public void clickongenerallinks() {
		ClickonGeneralLinks.click();
	}
	public void clickonpaymonths() {
		ClickOnPaymonths.click();
	}
	public void createpaymonth() {
		CreatePaymonth.click();
	}	
	public void ClickDelete() throws Exception{
		ClickDelete.click();
		
	}
	public void DeleteConfirm() {
		DeleteConfirm.click();
	}
}
