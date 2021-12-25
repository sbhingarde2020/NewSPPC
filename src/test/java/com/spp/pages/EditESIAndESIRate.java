package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditESIAndESIRate extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Company Statutories']")
	WebElement companystatutorylink;
	@FindBy(xpath="//a[text()='ESI Group']")
	WebElement esilink;
	@FindBy(xpath="//*[@id='dt_esi_groups']/tbody/tr[2]/td[4]/span[1]")
	WebElement editESIicon;
	@FindBy(id="esi_group_id")
	WebElement esiname;
	@FindBy(id="esi_group_esi_no")
	WebElement esinumber;
	@FindBy(id="esi_group_address")
	WebElement esiaddress;
	@FindBy(id="esi_group_esi_local_office")
	WebElement esioffice;
	@FindBy(xpath="//input[@value='Update ESI Group']")
	WebElement updateESIbutton;
	@FindBy(xpath="(//span[normalize-space(text()='ESI Rate')])[6]")
	WebElement esiratelink;
	@FindBy(xpath="//*[@id='esi_grp_rate_list']/div[2]/table/tbody/tr/td[6]/a")
	WebElement editESIrateicon;
	@FindBy(id="esi_group_rate_employee_rate")
	WebElement Employeerate;
	@FindBy(id="esi_group_rate_employer_rate")
	WebElement EmployerRate;
	@FindBy(id="esi_group_rate_cut_off")
	WebElement cutoff;
	@FindBy(id="esi_group_rate_minimum_limit_dailywage")
	WebElement minimumlimit;
	@FindBy(xpath="//input[@value='Update ESI Group Rate']")
	WebElement updateESIratebutton;
	
	public EditESIAndESIRate(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickCompanayLink() throws Exception{
		companystatutorylink.click();
	}
	
	public void clickESILink() throws Exception{
		esilink.click();
	}
	
	public void clickEditESILink() throws Exception{
		editESIicon.click();
	}
	
	public void enterESIName(String value) throws Exception{
		esiname.clear();
		esiname.sendKeys(value);
	}
	
	public void enterESINumber(String value) throws Exception{
		esinumber.clear();
		esinumber.sendKeys(value);
	}
	
	public void enterESIAddress(String value) throws Exception{
		esiaddress.clear();
		esiaddress.sendKeys(value);
	}
	
	public void enterESIOffice(String value) throws Exception{
		esioffice.clear();
		esioffice.sendKeys(value);
	}
	
	public void clickupdateESIButton() throws Exception{
		updateESIbutton.click();
	}
	
	public void clickESIRateLink() throws Exception{
		esiratelink.click();
	}
	
	public void clickEditESIRateIcon() throws Exception{
		editESIrateicon.click();
	}
	
	public void enterEmployeeRate(String value) throws Exception{
		Employeerate.clear();
		Employeerate.sendKeys(value);
	}
	
	public void enterEmployerRate(String value) throws Exception{
		EmployerRate.clear();
		EmployerRate.sendKeys(value);
	}
	
	public void enterCutOff(String value) throws Exception{
		cutoff.clear();
		cutoff.sendKeys(value);
	}
	
	public void enterMinimumLimit(String value) throws Exception{
		minimumlimit.clear();
		minimumlimit.sendKeys(value);
	}
	
	public void clickUpdateESIRateButton() throws Exception{
		updateESIratebutton.click();
	}
}
