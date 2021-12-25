package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;


public class BulkSalaryRateAllot extends BasePage {
	public BulkSalaryRateAllot(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="emp_detail")
	WebElement employeeLink;	
	@FindBy(xpath="//*[@id='menu']/li[4]/div/div/ul/li[5]/a")
	WebElement BulkSalaryRateDetails;
	@FindBy(id="month_year")
	WebElement PayMonth;
	@FindBy(id="sal_group")
	WebElement SalaryStructure;
	@FindBy(id="get_bulk_salary")
	WebElement GetEmployees;
	@FindBy(xpath="//*[@id='bf_form']/div[10]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id='salary_alotments']/tbody/tr/td[contains(text(),'Tina')]/parent::tr/td/span")
	WebElement MoreButton;
	@FindBy(xpath="//*[@id=\"allotment_form\"]/div[2]/div[2]/div[1]/div/input")
	WebElement Basic;
	@FindBy(id="populate")
	WebElement PopulateButton;
	@FindBy(xpath="//*[@id='show_message']/div/strong")
	WebElement SuccessfullMessage0;
	@FindBy(id="save")
	WebElement SaveValues;
	@FindBy(xpath="//*[@id='show_message']/div/strong")
	WebElement SuccessfullMessage1 ;
	@FindBy(xpath="//*[@id=\"allotment_form\"]/div[2]/div[1]/img")
	WebElement CloseButton ;
	@FindBy(xpath="//*[@id=\"salary_alotments\"]/tbody/tr[2]/td[6]/span")
	WebElement MoreButton2;
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id='menu']/li[6]/div/div[3]/ul/li[1]")
	WebElement SalaryEditor;
	@FindBy(xpath="//*[@id='ui-accordion-accordion-panel-0']/li/a[2]")
	WebElement ProcessSalaryList;
	
	
	
	public void clickEmployeeLink() {
		   employeeLink.click();
	}
	public void selectBulkSalaryRateDetails(){
		BulkSalaryRateDetails.click();
	}

	public void selectPayMonth(String value){
		dropDownSelect(PayMonth, value);
	}
	public void selectSalaryStructure(String value){
		dropDownSelect(SalaryStructure, value);
	}
	public void selectGetEmployees(){
		GetEmployees.click();
	}
	public void selectLoad(){
		Load.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();	
		}
	public void selectMoreButton(){
		MoreButton.click();
	}
	public void enterBasic(String value){
		Basic.clear();
		Basic.sendKeys(value);
	}
	public void selectPopulateButton() {
		PopulateButton.click();
	}
	
	public String getMessage0() {
	return SuccessfullMessage0.getText();	
	}
	public void selectSaveValues() {
		SaveValues.click();
	}
	public String getMessage1() {
		return SuccessfullMessage1.getText();	
		}
	public void selectCloseButton() {
		CloseButton.click();
	}
	public void selectMoreButton2(){
		MoreButton2.click();
	}
	public void selectSalary(){
		Salary.click();
	}
	public void selectProcessSalaryList(){
		ProcessSalaryList.click();
	}
	public void selectSalaryEditor(){
		SalaryEditor.click();
	}
}