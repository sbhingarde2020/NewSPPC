package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class EditPFGroupandPFRate extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Company Statutories']")
	WebElement companystatutorylink;
	@FindBy(xpath="//div[@id='pf_group_list']/div[2]//tr[2]//td[4]//img[@title='Edit branch']")
	WebElement editpficon;
	@FindBy(id="pf_group_id")
	WebElement pfgroupname;
	@FindBy(id="pf_group_pf_number")
	WebElement pfnumber;
	@FindBy(id="pf_group_db_file_code")
	WebElement pfdbfilecode;
	@FindBy(id="pf_group_extension")
	WebElement pfextension;
	@FindBy(id="pf_group_address")
	WebElement pfaddress;
	@FindBy(xpath="//input[@value='Update PF Group']")
	WebElement updatepfbutton;
	@FindBy(xpath="(//span[normalize-space(text()='PF Rate')])[6]")
	WebElement pfratelink;
	@FindBy(xpath="//img[@title='Edit PF Detail']")
	WebElement editePFratebutton;
	@FindBy(id="pf_group_rate_paymonth_id")
	WebElement EffectiveFrom;
	@FindBy(id="pf_group_rate_epf")
	WebElement EPF;
	@FindBy(id="pf_group_rate_cutoff")
	WebElement PFcutoff;
	@FindBy(id="pf_group_rate_account_number_02")
	WebElement accountNo2;
	@FindBy(id="pf_group_rate_pension_fund")
	WebElement pensionfund;
	@FindBy(id="pf_group_rate_account_number_21")
	WebElement accountNo21;
	@FindBy(id="pf_group_rate_account_number_22")
	WebElement accountNo22;
	@FindBy(xpath="//select[@id='pf_group_rate_round_off']")
	WebElement roundoffdropdown;
	@FindBy(xpath="//*[@id=\"pf_group_rates_form\"]/div[2]/div[15]/input")
	WebElement updatePFratebutton;
	@FindBy(xpath="//*[@id=\"pf_grprt_res_rsp\"]/div/strong")
	WebElement successfullMessage;
	
	
	public EditPFGroupandPFRate(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void clickCompanayLink() throws Exception{
		companystatutorylink.click();
	}
	public void clickEditPFGroup() throws Exception{
		editpficon.click();
	}
	
	public void enterPFGroupName(String value) throws Exception{
		pfgroupname.clear();
		pfgroupname.sendKeys(value);
	}
	
	public void enterPFNumber(String value) throws Exception{
		pfnumber.clear();
		pfnumber.sendKeys(value);
	}
	
	public void enterDBFileCode(String value) throws Exception{
		pfdbfilecode.clear();
		pfdbfilecode.sendKeys(value);
	}
	
	public void enterExtension(String value) throws Exception{
		pfextension.clear();
		pfextension.sendKeys(value);
	}
	
	public void enterPFAddress(String value) throws Exception{
		pfaddress.clear();
		pfaddress.sendKeys(value);
	}
	public void clickUpdatePFButton() throws Exception{
		updatepfbutton.click();
	}
	
	public void clickPFRateLinkButton() throws Exception{
		pfratelink.click();
	}
	
	public void clickEditPFRateButton() throws Exception{
	editePFratebutton.click();
	}
	public void selectEffectiveFrom(String value){
		dropDownSelect(EffectiveFrom, value);
	}
	
	public void enterEPFValue(String value) throws Exception{
		EPF.clear();
		EPF.sendKeys(value);
	}
	
	public void enterCutoffValue(String value) throws Exception{
		PFcutoff.clear();
		PFcutoff.sendKeys(value);
	}
	
	public void enterAccountNO2(String value) throws Exception{
		accountNo2.clear();
		accountNo2.sendKeys(value);
	}
	
	public void enterPensionFund(String value) throws Exception{
		pensionfund.clear();
		pensionfund.sendKeys(value);
	}
	
	public void enterAccountNo21(String value) throws Exception{
		accountNo21.clear();
		accountNo21.sendKeys(value);
	}
	
	public void enterAccountNo22(String value) throws Exception{
		accountNo22.clear();
		accountNo22.sendKeys(value);
	}
	
	public void selectRoundOffDropDown(String value) throws Exception{
		roundoffdropdown.clear();
		roundoffdropdown.sendKeys(value);
	}
	
	public void clickUpdatePFRateButton() throws Exception{
		updatePFratebutton.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}
}