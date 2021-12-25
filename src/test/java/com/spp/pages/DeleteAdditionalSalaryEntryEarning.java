package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteAdditionalSalaryEntryEarning extends BasePage{
	@FindBy(id="salary")
	WebElement SalaryLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[2]/a")
	WebElement AdditionalSalary;
	@FindBy(id="month_year")
	WebElement PayMonth;
	@FindBy(xpath="//*[@id=\"addn_salary\"]/div[2]/div/input")
	WebElement GetValues;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[5]/a")
	WebElement Allot;
	@FindBy(xpath="//*[@id=\"additional_salary\"]/tbody/tr[1]/td[5]/a")
	WebElement Delete;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement successfullMessage;
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
	@FindBy(id="amount")
	WebElement Amount;
	@FindBy(xpath="//*[@id=\"addn_sal_form\"]/div[7]/div/input")
	WebElement AllotButton;

	public DeleteAdditionalSalaryEntryEarning(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSalaryLink(){
		SalaryLink.click();
	}
	
	public void selectAdditionalSalary(){
		AdditionalSalary.click();
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

	public void ClickDelete() throws InterruptedException{
		Delete.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
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
	public void ClickAmount(String value){
		Amount.sendKeys(value);
	}
	public void ClickAllotButton(){
		AllotButton.click();
	}
}
