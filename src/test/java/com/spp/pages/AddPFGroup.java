package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddPFGroup extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Company Statutories']")
	WebElement companystatutorylink;
	@FindBy(xpath="//a[text()='Add New PF Group']")
	WebElement addpf;
	@FindBy(id="pf_group_id")
	WebElement pfgruopname;
	@FindBy(id="pf_group_pf_number")
	WebElement pfnumber;
	@FindBy(id="pf_group_db_file_code")
	WebElement pfdbfilecode;
	@FindBy(id="pf_group_extension")
	WebElement pfextension;
	@FindBy(id="pf_group_address")
	WebElement pfaddress;
	@FindBy(xpath="//input[@value='Create PF Group']")
	WebElement pfcreatebutton;
	@FindBy(xpath="(//span[normalize-space(text()='PF Rate')])[6]")
	WebElement pfratelink;
	@FindBy(id="pf_group_rate_paymonth_id")
	WebElement effectivedate;
	@FindBy(xpath="//input[@value='Create PF Group Rate']")
	WebElement pfratebutton;
	@FindBy(xpath="//strong[text()='PF group rate successfully created.']")
	WebElement successfullMessage;
	
	public AddPFGroup(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void clickCompanayLink() throws Exception{
		companystatutorylink.click();
	}
	
	public void clickAddPFLink() throws Exception{
		addpf.click();
	}
	
	public void enterPFGroupName(String value) throws Exception{
		pfgruopname.sendKeys(value);
	}
	
	public void enterPFNumber(String value) throws Exception{
		pfnumber.sendKeys(value);
	}
	
	public void enterDBFileCode(String value) throws Exception{
		pfdbfilecode.sendKeys(value);
	}
	
	public void enterExtension(String value) throws Exception{
		pfextension.sendKeys(value);
	}
	
	public void enterPFAddress(String value) throws Exception{
		pfaddress.sendKeys(value);
	}
	
	public void clickPFCreateButton() throws Exception{
		pfcreatebutton.click();
	}
	
	public void clickPFRateLinkButton() throws Exception{
		pfratelink.click();
	}
	
	public void selectEffectiveDate(String value) throws Exception{
		effectivedate.sendKeys(value);
	}
	
	public void clickPFGroupRateButton() throws Exception{
		pfratebutton.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}
}
