package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddClassificationviaExcelUpload extends BasePage{

	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[4]/ul/li[2]/a")
	WebElement ClickOnClassification;
	@FindBy(xpath="//*[@id=\"list_classification_headings\"]/div[2]/table/tbody/tr/td[contains(text(),'Division')]/parent::tr/td[3]/a")
	WebElement ClickonDetails;
	@FindBy(xpath="//a[text()='Generate Sample Template']")
	WebElement GenerateTemplate;
	@FindBy(xpath="//a[text()='Excel Template Upload Classification']")
	WebElement ExcelUploadClassification;
	@FindBy(id="excel_file")
	WebElement ChooseFile;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/fieldset/form/div[4]/input")
	WebElement UploadFile;
	@FindBy(xpath = "//*[@id='classifications_list']/div/table/tbody/tr/td[contains(text(),'Testing1')]/parent::tr/td[3]/a")
	WebElement DeleteButton;
	
	
	public AddClassificationviaExcelUpload(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void clickonmaster() {
		ClickOnMaster.click();
	}
	public void clickonclassification() {
		ClickOnClassification.click();
	}
	public void clickondetails() {
		ClickonDetails.click();
	}
	public void generatetemplate() {
		GenerateTemplate.click();
	}
	public void clickonexceluploadforclassification() {
		ExcelUploadClassification.click();
	}
	public void choosefile(String value) {
		ChooseFile.sendKeys(value);
	}
	public void uploadfile() {
		UploadFile.click();
	}
	public void deleteClassification() {
		DeleteButton.click();	
	}
}