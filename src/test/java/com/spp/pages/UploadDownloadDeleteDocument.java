package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class UploadDownloadDeleteDocument extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//ul[@id='menu']//a[text()='Company']")
	WebElement companylink;
	@FindBy(xpath="//a[text()='Documents']")
	WebElement documentlink;
	@FindBy(xpath="//a[text()='Add New Document']")
	WebElement adddocumentlink;
	@FindBy(id="company_document_file_path")
	WebElement filepath;
	@FindBy(id="company_document_remarks")
	WebElement remarks;
	@FindBy(xpath="//input[@value='Upload New Document']")
	WebElement uploadfilebutton;
	@FindBy(xpath="(//div[@id='main']//a[@class='action-download'])[2]")
	WebElement downloadfile;
	@FindBy(xpath="(//a[text()='delete'])[2]")
	WebElement deletebutton;
	
	public UploadDownloadDeleteDocument(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void clickCompanayLink() throws Exception{
		companylink.click();
	}
	
	public void clickDocumentLink() throws Exception{
		documentlink.click();
	}
	
	public void clickAddDocumentLink() throws Exception{
		adddocumentlink.click();
	}
	
	public void enterFilepath(String value) throws Exception{
		filepath.sendKeys(value);
	}
	
	public void enterRemarks(String value) throws Exception{
		remarks.sendKeys(value);
	}
	
	public void clickUploadButton() throws Exception{
		uploadfilebutton.click();
	}
	
	public void clickDownloadButton() throws Exception{
		downloadfile.click();
	}
	
	public void clickDeleteButton() throws Exception{
		deletebutton.click();
		switchToPopUpAndAccept(driver);
	}
}
