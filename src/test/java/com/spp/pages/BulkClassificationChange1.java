package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class BulkClassificationChange1 extends BasePage {

	public BulkClassificationChange1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Salary Structure']")
	WebElement salarystructurelink;
	@FindBy(xpath="//a[text()=\"Add New Salary Structure\"]")
	WebElement AddNewSalaryStructure;
	@FindBy(id="salary_group_salary_group_name")
	WebElement EnterGroupName;
	@FindBy(id="emp_detail")
    WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[7]/a")
	WebElement BulkClassification;	
	@FindBy(id="pay_month")
    WebElement Month;
	@FindBy(id="salary_grp")
    WebElement SalaryCheckBox;
	@FindBy(id="sal_grp_from")
    WebElement SalaryFrom;
	@FindBy(xpath="//*[@id='emps']/table/tbody/tr[2]/td[1]/input")
    WebElement EmployeeCheckBox;
	@FindBy(id="sal_grp_to")
    WebElement SalaryTo;
	@FindBy(xpath="//*[@id=\"change_classification\"]/button")
    WebElement ChangeButton;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement successfullMessage;
	@FindBy(id="sal_grp_from")
    WebElement SalaryFrom1;
	@FindBy(id="sal_grp_to")
    WebElement SalaryTo1;
	@FindBy(id="salary_group_based_on_gross")
	WebElement BasedOnGross;
	@FindBy(xpath="//input[@value='Create Salary Structure']")
	WebElement CreateSalaryStructure;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/table/tbody/tr/td[contains(text(),'Gross_Structure')]/parent::tr/td[5]/a")
	WebElement ClickDelete;
	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickSalaryStructureLink() throws Exception{
		salarystructurelink.click();
	}
	public void AddNewSalaryStructure() {
		AddNewSalaryStructure.click();
	}

	public void selectEmployee() {
		Employee.click();
	}
	public void selectBulkClassification() {
		BulkClassification.click();
	}
	public void selectMonth(String value){
		dropDownSelect(Month, value);
	}
	public void selectSalaryCheckBox() {
		SalaryCheckBox.click();
	}
	public void selectSalaryFrom(String value){
		dropDownSelect(SalaryFrom, value);
	}
	public void selectEmployeeCheckBox() {
		EmployeeCheckBox.click();
	}
	public void selectSalaryTo(String value){
		dropDownSelect(SalaryTo, value);
	}
	
	public void  clickChangeButton() throws Exception{
		ChangeButton.click();
		switchToPopUpAndAccept(driver);
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
	public void selectSalaryFrom1(String value){
		dropDownSelect(SalaryFrom1, value);
	}
	public void selectSalaryTo1(String value){
		dropDownSelect(SalaryTo1, value);
	}
	public void entergroupname(String value) {
		EnterGroupName.sendKeys(value);
	}
	public void ClickBasedOnGross() {
		BasedOnGross.click();
	}
	public void createsalarystructure() {
		CreateSalaryStructure.click();
	}
	public void selectDeleteButton() throws InterruptedException{
		ClickDelete.click();
	    Thread.sleep(2000);
	    switchToPopUpAndAccept(driver);

	  	}
}
