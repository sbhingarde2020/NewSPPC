package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AllotSalaryViaExcel extends BasePage {

	public AllotSalaryViaExcel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="emp_detail")
	WebElement employeeLink;	
	@FindBy(linkText="Salary Rate Details")
	WebElement SalaryRateDetails;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/li[2]/a")
	WebElement SalaryRateTemplate;	

	@FindBy(id="paymonth")
	WebElement MonthYear;
	@FindBy(id="salary_group_id")
	WebElement SalaryStructure;
	@FindBy(id="af_filter")
	WebElement GetClick;
	@FindBy(xpath="//*[@id='bf_form']/div[10]/button[1]")
	WebElement LoadButton;
	@FindBy(id="salary_rate_employees")
	WebElement GenerateFileButton;
	@FindBy(xpath="//*[@id='ui-accordion-accordion-panel-0']/li[1]/a")
	WebElement UploadSalaryRates;
	@FindBy(id="excel_file")
	WebElement ChooseFile;
	@FindBy(xpath="//*[@id=\"main\"]/div[4]/div/div/form/fieldset/div[3]/input")
	WebElement ExcelTemplateUpload;
	@FindBy(xpath="//span[contains(text(),'Listing Employee (Salary allotted)')]")
	WebElement SalaryAlloted;
	@FindBy(xpath="//*[@id='alloted']/tbody/tr/td[contains(text(),'Tina')]/parent::tr/td/a")
	WebElement Edit;
	@FindBy(id="month_year")
	WebElement EffectiveFrom;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/form/fieldset/div[1]/div/input[1]")
	WebElement GetRate;
	@FindBy(id="gross_sal_formula")
	WebElement GrossSal;
	@FindBy(xpath="//*[@id=\"sal_allotment\"]/table/tbody/tr[2]/td[4]/input")
	WebElement EarningsSalAllot;
	@FindBy(xpath="//input[@value='Save']")
	WebElement SaveButton;
	
public void clickEmployeeLink() {
	   employeeLink.click();
}
public void selectSalaryRateDetails(){
	SalaryRateDetails.click();
}
public void selectSalaryRateTemplate() {
	SalaryRateTemplate.click();
}	
public void selectMonthYear(String value){
		dropDownSelect(MonthYear, value);
}
public void selectSalaryStructure(String value){
	dropDownSelect(SalaryStructure, value);
}
public void selectGetClick() {
	GetClick.click();
}

public void ClickSalaryAlloted() {
    SalaryAlloted.click();
}

public void selectLoadButton() {
	LoadButton.click();
}
public void selectGenerateFileButton() {
	GenerateFileButton.click();
}
public void clickExcelTemplateUpload() {
	ExcelTemplateUpload.click();
}
public void clickUploadSalaryRates() {
	UploadSalaryRates.click();
}
public void clickChooseFile(String value) throws Exception{
	ChooseFile.sendKeys(value);
}
public void ClickEdit() {
	Edit.click();
}
public void selectEffectiveFrom(String value){
	dropDownSelect(EffectiveFrom, value);
}
public void selectGetRate() {
	GetRate.click();
}
public void enterGrossSal(String value) {
	 GrossSal.clear();
	 GrossSal.sendKeys(value);
}

public void SalAllotEarnings(String value) throws Exception {
	EarningsSalAllot.clear();
	EarningsSalAllot.sendKeys(value);
}
public void SelectSaveButton() {
	
	SaveButton.click();
}

}