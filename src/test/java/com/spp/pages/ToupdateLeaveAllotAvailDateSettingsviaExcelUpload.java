package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class ToupdateLeaveAllotAvailDateSettingsviaExcelUpload extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[9]/a")
	WebElement ClickOnLeaveAllotDate;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/li/a[contains(text(),'Generate Sample Template')]")
	WebElement ClickGenerateSample;
	@FindBy(id="leave_definition_id")
	WebElement SelectLeaveType;
	@FindBy(xpath="//*[@id='leave_type_selection_form']/div[2]/fieldset/div[2]/input")
	WebElement GenerateSampleTemplate;
	@FindBy(xpath="//*[@id='ui-accordion-accordion-panel-0']/li/a[contains(text(),'ExcelTemplate Upload')]")
	WebElement ExcelTemplateUpload;
	@FindBy(id="excel_file")
	WebElement ChooseFile;
	@FindBy(xpath="//input[@value='Upload File']")
	WebElement UploadLink;
	@FindBy(id="filter")
	WebElement GetEmployee;
	@FindBy(xpath="//*[@id='bf_form']/div[10]/button[1]")
	WebElement LoadButton;
	@FindBy(xpath="//*[@id='leave_allot_config']/tbody/tr[1]/td[4]/span")
	WebElement MoreLink;

	public ToupdateLeaveAllotAvailDateSettingsviaExcelUpload(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonleaveallotdetails() {
		ClickOnLeaveAllotDate.click();
	}
	public void clickonGenerateSample() {
		ClickGenerateSample.click();
	}
	public void selectLeaveType(String value){
		dropDownSelect(SelectLeaveType, value);
	}
	public void clickGenerateSampleExcelTemplate() {
		GenerateSampleTemplate.click();
	}
	public void clickExcelTemplateUpload() {
		ExcelTemplateUpload.click();
	}
	public void clickChooseFile(String value) throws Exception{
		ChooseFile.sendKeys(value);
	}
	public void clickUploadLink() throws Exception{
		UploadLink.click();
	}
	public void selectGetEmployee() {
		GetEmployee.click();
	}
	public void selectLoadButton() {
		LoadButton.click();
	}
	public void selectMoreLink() {
	   MoreLink.click();
	}
}