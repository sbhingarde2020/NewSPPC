package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class TosetLeaveOpeningBalanceviaExcelUpload extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(id="excel_file")
	WebElement ChooseFile;
	@FindBy(xpath="//input[@value='Upload File']")
	WebElement UploadLink;
	@FindBy(xpath="//*[@id='bf_form']/div[10]/button[1]")
	WebElement LoadButton;
	@FindBy(xpath="//*[@id='ui-accordion-accordion-panel-0']/li/a[contains(text(),'Generate Opening Balance Template')]")
	WebElement ClickGenerateSample;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[10]/a")
	WebElement SetOpeningBalance;
	@FindBy(id="leave_definition_id")
	WebElement LeaveType1;
	@FindBy(id="sel_leave_type")
	WebElement LeaveType;
	@FindBy(xpath="//*[@id='leave_type_selection_opening']/fieldset/div[2]/input")
	WebElement GenerateSampleTemplate;
	@FindBy(xpath="//*[@id='ui-accordion-accordion-panel-0']/li/a[contains(text(),'ExcelTemplate Upload')]")
	WebElement ExcelTemplateUpload;
	@FindBy(id="filter")
	WebElement GetEmployee;
	@FindBy(xpath="//*[@id=\"leave_op_bal\"]/tbody/tr/td[5]/span")
	WebElement MoreLink;
	
	public TosetLeaveOpeningBalanceviaExcelUpload(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void selectSetOpeningBalance() {
		SetOpeningBalance.click();
	}
	public void selectLoadButton() {
		LoadButton.click();
	}
	public void selectLeaveType(String value) {
		dropDownSelect(LeaveType1, value);
	}
	public void selectLeaveType1(String value) {
		dropDownSelect(LeaveType, value);
	}
	public void clickonGenerateSample() {
		ClickGenerateSample.click();
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
	public void selectMoreLink() {
		 MoreLink.click();
	}
}
