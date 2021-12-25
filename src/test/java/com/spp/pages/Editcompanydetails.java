package com.spp.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class Editcompanydetails extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//ul[@id='menu']//a[text()='Company']")
	WebElement companylink;
	@FindBy(xpath="//a[text()='Edit Details']")
	WebElement editcompanylink;
	@FindBy(id="company_companyname")
	WebElement companyname;
	@FindBy(id="company_responsible_person")  
	WebElement responsibleperson;
	@FindBy(id="company_dateofestablishment")
	WebElement establishmentdate;
	@FindBy(id="company_phonenumber1")
	WebElement phonumber1;
	@FindBy(id="company_address")
	WebElement address1;
	@FindBy(id="company_phonenumber2")
	WebElement phonenumber2;
	@FindBy(id="company_email")
	WebElement emailtext;
	@FindBy(id="company_address2")
	WebElement address2;
	@FindBy(id="company_address3")
	WebElement address3;
	@FindBy(id="company_website")
	WebElement website;
	@FindBy(id="company_tan_option")
	WebElement tanstaus;
	@FindBy(id="company_type")
	WebElement cmpstaus;
	@FindBy(id="company_tan")
	WebElement addtan;
	@FindBy(xpath="//input[@value='Update Company']")
	WebElement updatebutton;
	@FindBy(id="company_photo")
	WebElement cmplogo;
	@FindBy(xpath="//strong[text()='Company was successfully updated.']")
	WebElement updatedmessage;
	
	public Editcompanydetails(WebDriver driver){
	    super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void clickCompanayLink() throws Exception{
		companylink.click();
	}
	
	public void clickEditCompany() throws Exception{
		editcompanylink.click();
	}
	
	public void enterCompanyName(String value)throws Exception{  
		companyname.clear();
		companyname.sendKeys(value);

	}
	
	public void enterResponsiblePerson(String value) throws Exception{
		responsibleperson.clear();
		responsibleperson.sendKeys(value);
	}
	
	public void enterEstablishmentDate(String value) throws Exception{
		establishmentdate.clear();
		establishmentdate.sendKeys(value);
	}
	
	public void enterPhoneNo1(String value) throws Exception{
		phonumber1.clear();
		phonumber1.sendKeys(value);
	}
	
	public void enterAddress1(String value) throws Exception{
		address1.clear();
		address1.sendKeys(value);
	}
	
	public void enterPhoneNo2(String value) throws Exception{
		phonenumber2.clear();
		phonenumber2.sendKeys(value);
	}
	
	public void enterEmail(String value) throws Exception{
		emailtext.clear();
		emailtext.sendKeys(value); 
	}
	
	public void enterAddress2(String value) throws Exception{
		address2.clear();
		address2.sendKeys(value);
	}
	
	public void enterAddress3(String value) throws Exception{
		address3.clear();
	    address3.sendKeys(value);
	}
	
	public void enterWebsite(String value) throws Exception{
		website.clear();
		website.sendKeys(value);
	}
	
	public void selectTAN(String value) throws Exception{
		dropDownSelect(tanstaus, value);
	}
	
	public void selectCompanyType(String value) throws Exception{
	   dropDownSelect(cmpstaus, value);
	}
	
	public void enterTANNumber(String value) throws Exception{
		addtan.clear();
		addtan.sendKeys(value);
	}
	
	public void updateCompanyButton() throws Exception{
		updatebutton.click();
	}
	
	public void updateCompanyLogo(String value) throws Exception{
		cmplogo.sendKeys(value);
	}
	
	public String getMessage(){
		return updatedmessage.getText();
	}
	
}
