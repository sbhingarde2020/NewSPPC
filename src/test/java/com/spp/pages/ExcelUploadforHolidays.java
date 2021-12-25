package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;
//import com.spp.common.ExcelUtil;

public class ExcelUploadforHolidays extends BasePage{

	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[3]/ul/li[3]/a")
	WebElement ClickOnHolidayLists;
	@FindBy(xpath="//*[@id='holidays_list']/tbody/tr/td[contains(text(),'Master')]/parent::tr/td[3]/a")
	WebElement ClickOnView;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/li[1]/a")
	WebElement GenerateSampleTemplate;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/li[2]/a")
	WebElement ExcelUploadforHolidays;
	@FindBy(id="excel_file")
	WebElement ChooseFile;
	@FindBy(xpath="//*[@id=\"main\"]/form/div[3]/div/div/fieldset/div[2]/div/input")
	WebElement UploadFile;
	@FindBy(xpath="//*[@id='holidays_master_list']/tbody/tr/td[contains(text(),'Rakshabandhan')]/parent::tr/td/a[2]")
	WebElement DeleteHoliday;
	
	
	public ExcelUploadforHolidays(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonmaster() {
		ClickOnMaster.click();
	}
	public void clickonholidaylists() {
		ClickOnHolidayLists.click();
	}
	public void clickonview() {
		ClickOnView.click();
	}
	public void generatesampletemplate() {
		GenerateSampleTemplate.click();
	}
	public void exceluploadforholidays() {
		ExcelUploadforHolidays.click();
	}
	public void choosefile(String value) {
		ChooseFile.sendKeys(value);
	}
	public void uploadfile() {
		UploadFile.click();
	}
	public void deleteHoliday() {
		DeleteHoliday.click();
		switchToPopUpAndAccept(driver);
	}	
}