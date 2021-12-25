package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class EditPTGroup extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Company Statutories']")
	WebElement companystatutorylink;
	@FindBy(xpath="//a[text()='PT Group']")
	WebElement ptlink;
	@FindBy(xpath="//table[@id='dt_pt_groups']//tr[2]//td[4]//a[text()='edit']")
	WebElement editPTGroupIcon;
	@FindBy(id="pt_group_id")
	WebElement ptgroupname;
	@FindBy(id="pt_group_address")
	WebElement ptaddress;
	@FindBy(id="pt_group_pto_circle_no")
	WebElement ptocirclenum;
	@FindBy(id="pt_group_certificate_no")
	WebElement certificatenum;
	@FindBy(id="pt_group_return_period")
	WebElement returnperiod;
	@FindBy(id="pt_group_pt_locked")
	WebElement PTLock;
	@FindBy(xpath="//input[@value='Update PT Group']")
	WebElement updatePTgroupButton;
	@FindBy(xpath="(//span[normalize-space(text()='PT Rate')])[6]")
	WebElement ptratelink;
	@FindBy(xpath="//a[text()='Settings']")
	WebElement settingslink;
	@FindBy(xpath="//*[@id=\"pt_rate_list\"]/div[2]/table/tbody/tr[1]/td[8]/a")
	WebElement editPTrateLink;
	@FindBy(id="pt_rate_min_sal_range")
	WebElement Minimumfield;
	@FindBy(id="pt_rate_pt")
	WebElement PTField;
	@FindBy(id="pt_rate_category")
	WebElement category;
	@FindBy(xpath="//input[@value='Update PT Rate']")
	WebElement updatePTRate;
	@FindBy(xpath="//strong[text()='PT rate successfully updated.']")
	WebElement successfullMessage;
	
	public EditPTGroup(WebDriver driver){
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

	public void clickEditPTGroup() throws Exception{
		editPTGroupIcon.click();
	}
	
	public void enterPTGroupName(String value) throws Exception{
		ptgroupname.clear();
		ptgroupname.sendKeys(value);
	}
	
	public void enterPTAddress(String value) throws Exception{
		ptaddress.clear();
		ptaddress.sendKeys(value);
	}
	
	public void enterPTOCircleNumber(String value) throws Exception{
		ptocirclenum.clear();
		ptocirclenum.sendKeys(value);
	}
	
	public void enterPTCertificateNumber(String value) throws Exception{
		certificatenum.clear();
		certificatenum.sendKeys(value);
	}
	
	public void selectReturnType(String value) throws Exception{
		returnperiod.clear();
		returnperiod.sendKeys(value);
	}
	
	public void clickPTLock() throws Exception{
		PTLock.click();
	}
	
	public void clickUpdatePTGroupButton() throws Exception{
		updatePTgroupButton.click();
	}
	
	public void clickPTRate() throws Exception{
		ptratelink.click();
	}
	
	public void clickSettingsLink() throws Exception{
		settingslink.click();
	}

	public void clickEditPTRateLink() throws Exception{
		editPTrateLink.click();
	}
	
	public void enterMinimumField(String value) throws Exception{
		Minimumfield.clear();
		Minimumfield.sendKeys(value);
	}
	
	public void enterPTField(String value) throws Exception{
		PTField.clear();
		PTField.sendKeys(value);
	}
	
	public void selectCategory(String value) throws Exception{
		dropDownSelect(category, value);
	}
	
	public void clickUpdatePTRate() throws Exception{
		updatePTRate.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}

