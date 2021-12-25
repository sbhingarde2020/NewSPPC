package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateEmployeeviaExcelImport extends BasePage {
	
	
	public CreateEmployeeviaExcelImport(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
//	@FindBy(id="emp_detail")
//	WebElement employeeLink;	
//	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
//	WebElement EmployeeDetails;
//	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
//	WebElement ImportExportLink;
//	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-1\"]/ul/li[3]/a")
//	WebElement SampleTemplate;
//	
//
//
//
//public void clickEmployeeLink() {
//	   employeeLink.click();
//}
// public void selectEmployeeDetails(){
// 	EmployeeDetails.click();
//}
//public void selectImportExportLink() {
//	ImportExportLink.click();
//}
//public void selectSampleTemplate() {
//	SampleTemplate.click();
//}

	@FindBy(id="emp_detail")
	WebElement EmployeeTab;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement EmployeeDetailsLink;
	@FindBy(xpath="//div[@id='accordion']/div[3]/h3")
	WebElement ImportExportEmployees;
	@FindBy(linkText="ExcelTemplate Upload")
	WebElement ExcelUploadButton;
	@FindBy(id="excel_file")
	WebElement ChooseFileField;
	@FindBy(id="classbutton")
	WebElement UploadFileButton;
	@FindBy(id="notification_img")
	WebElement NotificationIcon;
	@FindBy(xpath="//*[@id='menu']/li[10]/div/div/ul/li[1]/a")
	WebElement ImportBackgroundJobsLink;
	@FindBy(xpath="//*[@id=\"listing_background_process_wrapper\"]/div[3]/div[1]/div/table/thead/tr/th[5]")
	WebElement CompletedAtTab;
	@FindBy(xpath="//*[@id=\"listing_background_process\"]/tbody/tr[1]/td[9]")
	WebElement UploadStatusMessage;
	
	
	public void clickEmployeeTab(){
		EmployeeTab.click();
	}
	
	public void clickEmployeeDetailsLink(){
		EmployeeDetailsLink.click();
	}
	
	public void clickImportExportTab(){
		ImportExportEmployees.click();
	}
	
	public void clickExcelTemplateUpload(){
		ExcelUploadButton.click();
	}
	
	public void enterExcelFilePath(String value){
		ChooseFileField.sendKeys(value);
	}
	
	public void clickUpload(){
		UploadFileButton.click();
	}
	
	public void clickNotificationIcon(){
		
		NotificationIcon.click();
	}
	
public void importBackgroundJobs(){
		
	ImportBackgroundJobsLink.click();
	
	}
	
public void sortByLatestJob(){
	
	CompletedAtTab.click();
	
	}

public String getSuccessmessage(){
	
	return UploadStatusMessage.getText();
	
	}



}