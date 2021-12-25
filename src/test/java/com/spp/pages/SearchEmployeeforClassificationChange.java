package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class SearchEmployeeforClassificationChange extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[7]/a")
	WebElement ClickOnBulkClassificationChange;
	@FindBy(id="pay_month")
	WebElement SelectMonth;
	@FindBy(id="salary_grp")
	WebElement CheckSalaryCheckBox;
	@FindBy(id="sal_grp_from")
	WebElement SelectSalaryGroupFrom;
	@FindBy(id="search_field")
	WebElement SearchEmployee;
	@FindBy(xpath="//*[@id=\"main\"]/div[4]/table/tbody/tr/td[2]/table[1]/tbody/tr[1]/td/input[2]")
	WebElement ClickOnSearch;
	@FindBy(xpath="//*[@id='emps']/table/tbody/tr[2]/td[1]/input")
	WebElement SelectEmployee;
	@FindBy(id="sal_grp_to")
	WebElement SelectSalaryGroupTo;
	@FindBy(xpath="//*[@id=\"change_classification\"]/button")
	WebElement ClickOnChange;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement successfullmessage;
	
	public SearchEmployeeforClassificationChange(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonbulkclassification() {
		ClickOnBulkClassificationChange.click();
	}
	public void selectmonth(String value) {
		dropDownSelect(SelectMonth,value);
	}
	public void checksalarycheckbox() {
		CheckSalaryCheckBox.click();
	}
	public void selectsalarygroupfrom(String value) {
		dropDownSelect(SelectSalaryGroupFrom, value);
	}
	public void searchemployee(String value) {
		SearchEmployee.clear();
		SearchEmployee.sendKeys(value);
	}
	public void clickonsearch() {
		ClickOnSearch.click();
	}
	public void selectemployee() {
		SelectEmployee.click();
	}
	public void selectsalarygroupto(String value) {
		dropDownSelect(SelectSalaryGroupTo, value);
	}
	public void clickonchange() {
		ClickOnChange.click();
	}
	public String getMessage(){
		return successfullmessage.getText();
	}
	
}
