package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class GenerateReportWriterGroupByPaymonthandDepartmentandOccupation extends BasePage{
	@FindBy(id="report")
	WebElement Report;
	@FindBy(xpath="//*[@id='menu']/li[8]/div/div[3]/ul/li[2]/a")
	WebElement ReportWriter;
	@FindBy(xpath="//span[normalize-space()='Pay Month']")
	WebElement PayMonth;
	@FindBy(xpath="//*[@id='paymonths_salary']/table/tbody/tr/td[normalize-space()='Dec/2018']/parent::tr/td/input")
	WebElement PayMonthCheckbox;
	@FindBy(xpath="//span[normalize-space()='Classification Details']")
	WebElement ClassificationDetails;
	@FindBy(xpath="//*[@id='content_wrapper']/table/tbody/tr/td[normalize-space()='Designation']/parent::tr/td/input")
	WebElement ClassificationDetailDesignation;
	@FindBy(xpath="//*[@id='content_wrapper']/table/tbody/tr/td[normalize-space()='Department']/parent::tr/td/input")
	WebElement ClassificationDetailDepartment;
	@FindBy(xpath="//span[normalize-space()='Additional Information']")
	WebElement AdditionalInformation;
	@FindBy(xpath="//*[@id='content_wrapper']/table/tbody/tr/td[normalize-space()='Date of Joining']/parent::tr/td/input")
	WebElement DateofJoining;
	@FindBy(xpath="//span[normalize-space()='Employees']")
	WebElement Employees;
	@FindBy(id="filter_head")
	WebElement ClickOnFilter;
	@FindBy(xpath="//*[@id='bf_form']/div[10]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id='report_writer_employee_list']/tbody/tr/td[normalize-space()='Ashish']/parent::tr/td/input")
	WebElement EmployeeSelectionCheckbox;
	@FindBy(id="first_group_by")
	WebElement GroupBy1;
	@FindBy(id="second_group_by")
	WebElement GroupBy2;
	@FindBy(id="third_group_by")
	WebElement GroupBy3;
	@FindBy(xpath="//*[@id='classification_details']/div/div[4]/input")
	WebElement GenerateExcelTemplateBtn;
	
	public GenerateReportWriterGroupByPaymonthandDepartmentandOccupation(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void clickReport(){
		Report.click();
	}
	public void clickReportWriter(){
		ReportWriter.click();
	}
	public void clickPayMonth() {
		PayMonth.click();
	}
	public void tickPayMonthCheckbox() {
		PayMonthCheckbox.click();
	}
	public void clickClassificationDetails() {
		ClassificationDetails.click();
	}
	public void clickDesignationCheckbox() {
		ClassificationDetailDesignation.click();
	}
	public void clickDepartmentCheckbox() {
		ClassificationDetailDepartment.click();
	}
	public void clickAdditionalInformation() {
		AdditionalInformation.click();
	}
	public void clickDateofJoining() {
		DateofJoining.click();
	}
	public void clickEmployees() {
		Employees.click();
	}
	public void clickonfilter() {
		ClickOnFilter.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void selectEmployee() {
		EmployeeSelectionCheckbox.click();
	}
	public void selectGrouping1(String value){
		dropDownSelect(GroupBy1, value);	
	}
	public void selectGrouping2(String value){
		dropDownSelect(GroupBy2, value);	
	}
	public void selectGrouping3(String value){
		dropDownSelect(GroupBy3, value);	
	}
	public void clickonGenerate() {
		GenerateExcelTemplateBtn.click();
	}
}