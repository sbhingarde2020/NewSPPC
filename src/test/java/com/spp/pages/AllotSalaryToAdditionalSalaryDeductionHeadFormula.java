package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AllotSalaryToAdditionalSalaryDeductionHeadFormula extends BasePage {
	@FindBy(id="salary")
	WebElement SalaryLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[2]/a")
	WebElement AdditionalSalary;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/div[2]/nav/ul/li[2]/a/span")
	WebElement DeductionTab;
	@FindBy(id="month_year")
	WebElement PayMonth;
	@FindBy(xpath="//*[@id=\"addn_salary\"]/div[2]/div/input")
	WebElement GetValues;
	@FindBy(xpath="//*[@id=\"tabs-4\"]/div[2]/table/tbody/tr/td[5]/a")
	WebElement Allot;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/span/a")
	WebElement AddEmployees;
	@FindBy(id="filter_head")
	WebElement AdvanceFilter;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	@FindBy(id="select_all_employee")
	WebElement SelectAllBox;
	@FindBy(xpath="//*[@id=\"add_employees\"]/tbody/tr[1]/td[1]/input")
	WebElement EmployeeBox;
	@FindBy(id="formula_multi")
	WebElement Formula;
	@FindBy(id="formula_id")
	WebElement FormulaDropDown;
	@FindBy(xpath="//*[@id=\"addn_sal_form\"]/div[7]/div/input")
	WebElement AllotButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id=\"tabs-3\"]/div[2]/table/tbody/tr/td[6]/a")
	WebElement DeleteButton;
	public AllotSalaryToAdditionalSalaryDeductionHeadFormula(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSalaryLink(){
		SalaryLink.click();
	}
	
	public void selectAdditionalSalary(){
		AdditionalSalary.click();
	}
	
	public void selectDeductionTab(){
		DeductionTab.click();
	}
	public void selectPaymonth(String value){
		dropDownSelect(PayMonth, value);
	}

	public void selectGetValues(){
		GetValues.click();
	}

	public void ClickAllot(){
		Allot.click();
	}

	public void ClickAddEmployee(){
		AddEmployees.click();
	}
	public void ClickAdvanceFilter(){
		AdvanceFilter.click();
	}
	public void ClickLoad(){
		Load.click();
	}
	public void ClickSelectAllBoxs(){
		SelectAllBox.click();
	}
	public void ClickEmployeeBox(){
		EmployeeBox.click();
	}
	public void ClickFormula(){
		Formula.click();
	}
	public void ClickFormulaDropDown(String value){
		dropDownSelect(FormulaDropDown, value);
	}
	public void ClickAllotButton(){
		AllotButton.click();
	}
		
	public String getMessage(){
		return successfullMessage.getText();
	}
	public void selectDeleteButton(){
		DeleteButton.click();
	}

}
