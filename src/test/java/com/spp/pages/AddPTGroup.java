package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class AddPTGroup extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Company Statutories']")
	WebElement companystatutorylink;
	@FindBy(xpath="//a[text()='PT Group']")
	WebElement ptlink;
	@FindBy(xpath="//a[text()='Add New PT Group']")
	WebElement addptlink;
	@FindBy(id="pt_group_id")
	WebElement ptgroupname;
	@FindBy(id="pt_group_state_id")
	WebElement state;
	@FindBy(id="pt_group_address")
	WebElement ptaddress;
	@FindBy(id="pt_group_pto_circle_no")
	WebElement ptocirclenum;
	@FindBy(id="pt_group_certificate_no")
	WebElement certificatenum;
	@FindBy(id="pt_group_return_period")
	WebElement returnperiod;
	@FindBy(xpath="//input[@value='Create PT Group']")
	WebElement creatept;
	@FindBy(xpath="(//span[normalize-space(text()='PT Rate')])[6]")
	WebElement ptratelink;
	@FindBy(id="pt_group_rate_paymonth_id")
	WebElement effectivefrom;
	@FindBy(xpath="//input[@value='Create PT Group Rate']")
	WebElement createptgruoprate;
	@FindBy(xpath="//a[text()='Settings']")
	WebElement settingslink;
	@FindBy(xpath="//button[text()='Fill Default']")
	WebElement filldefaultbutton;
	@FindBy(xpath="//strong[text()='Default PT Slab Successfully Created.']")
	WebElement successfullMessage;

	public AddPTGroup(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void navigateMaster() throws Exception{
	    masterlink.click();
	}
	
	public void clickCompanayLink() throws Exception{
		companystatutorylink.click();
	}
	
	public void clickPTLink() throws Exception{
		ptlink.click();
	}
	
	public void clickAddPTLink() throws Exception{
		addptlink.click();
	}
	
	public void enterPTGroupName(String value) throws Exception{
		ptgroupname.sendKeys(value);
	}
	
	public void selectState(String value) throws Exception{
		state.sendKeys(value);
	}
	
	public void enterPTAddress(String value) throws Exception{
		ptaddress.sendKeys(value);
	}
	
	public void enterPTOCircleNumber(String value) throws Exception{
		ptocirclenum.sendKeys(value);
	}
	
	public void enterPTCertificateNumber(String value) throws Exception{
		certificatenum.sendKeys(value);
	}
	
	public void selectReturnType(String value) throws Exception{
		returnperiod.sendKeys(value);
	}
	
	public void clickCreatePT() throws Exception{
		creatept.click();
	}
	
	public void clickPTRate() throws Exception{
		ptratelink.click();
	}
	
	public void selectEffectiveFrom(String value) throws Exception{
		effectivefrom.sendKeys(value);
	}
	
	public void clickPTGroupRateButton() throws Exception{
		createptgruoprate.click();
	}
	
	public void clickSettingsLink() throws Exception{
		settingslink.click();
	}
	
	public void clickFillDefaultButton() throws Exception{
		filldefaultbutton.click();
		switchToPopUpAndAccept(driver);
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
