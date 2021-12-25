package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DownloadUploadedDocument extends BasePage{
	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[1]/ul/li[1]/a")
	WebElement ClickOnCompany;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/li[3]/a")
	WebElement ClickOnDocuments;
	@FindBy(xpath="//*[@id='main']/div[2]/table/thead/tr[2]/td[contains(text(),'Upload file')]/parent::tr/td[5]/a")
	WebElement DownloadFile;
	
	public DownloadUploadedDocument(WebDriver driver) {
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
	public void clickondownload() {
		DownloadFile.click();
	}
}
