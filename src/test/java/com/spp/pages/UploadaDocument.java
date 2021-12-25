package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UploadaDocument extends BasePage{

	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[1]/ul/li[1]/a")
	WebElement ClickOnCompany;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/li[3]/a")
	WebElement ClickOnDocuments;
	@FindBy(xpath="//*[@id='main']/div[1]/span/a")
	WebElement AddNewDocument;
	@FindBy(id="company_document_file_path")
	WebElement UploadFile;
	@FindBy(id="company_document_remarks")
	WebElement EnterRemarks;
	@FindBy(xpath="//*[@id=\"company_document_save\"]/fieldset/div[3]/input")
	WebElement UploadNewDocument;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement successfullmessage;
	public UploadaDocument(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonmaster() {
		ClickOnMaster.click();
	}
	public void clickoncompany() {
		ClickOnCompany.click();
	}
	public void clickondocument() {
		ClickOnDocuments.click();
	}
	public void addnewdocument() {
		AddNewDocument.click();
	}
	public void uploadfile(String value) {
		UploadFile.sendKeys(value);
	}
	public void enterremarks(String value) {
		EnterRemarks.sendKeys(value);
	}
	public void uploadnewdocument() {
		UploadNewDocument.click();
	}
	public String getMessage() {
		return successfullmessage.getText();
	}
}