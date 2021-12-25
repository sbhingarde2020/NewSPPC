package com.spp.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class AddESIGroup extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Company Statutories']")
	WebElement companystatutorylink;
	@FindBy(xpath="//a[text()='ESI Group']")
	WebElement esilink;
	@FindBy(xpath="//a[text()='Add New ESI Group']")
	WebElement addesilink;
	@FindBy(id="esi_group_id")
	WebElement esiname;
	@FindBy(id="esi_group_esi_no")
	WebElement esinumber;
	@FindBy(id="esi_group_address")
	WebElement esiaddress;
	@FindBy(id="esi_group_esi_local_office")
	WebElement esioffice;
	@FindBy(xpath="//input[@value='Create ESI Group']")
	WebElement createesibutton;
	@FindBy(xpath="(//span[normalize-space(text()='ESI Rate')])[6]")
	WebElement esiratelink;
	@FindBy(id="esi_group_rate_paymonth_id")
	WebElement effdate;
	@FindBy(xpath="//*[@id=\"new_esi_group_rate\"]/div[2]/div[9]/input")
	WebElement createesirate;
	@FindBy(xpath="//strong[text()='ESI group rate successfully created.']")
	WebElement successfulmsg;

	public AddESIGroup(WebDriver driver){
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
	
	public void clickAddressLink() throws Exception{
		addesilink.click();
	}
	
	public void enterESIName(String value) throws Exception{
	     esiname.sendKeys(value);
	}
	
	public void enterESINumber(String value) throws Exception{
		esinumber.sendKeys(value);
	}
	
	public void enterESIAddress(String value) throws Exception{
		esiaddress.sendKeys(value);
	}
	
	public void enterESIOffice(String value) throws Exception{
		esioffice.sendKeys(value);
	}
	
	public void clickCreateESI() throws Exception{
		createesibutton.click();
	}
	
	public void clickESIRateLink() throws Exception{
		esiratelink.click();
	}
	
	public void selectESIEffectiveDate(String value) throws Exception{
		dropDownSelect(effdate, value);
	}
	
	public void clickCreateESIRate() throws Exception{
		createesirate.click();
	}
	public String getMessage(){
		return successfulmsg.getText();
	}
}
