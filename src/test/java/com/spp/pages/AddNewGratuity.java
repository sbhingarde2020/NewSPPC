package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddNewGratuity extends BasePage{

	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//a[text()='Gratuity']")
	WebElement ClickOnGratuity;
	@FindBy(xpath="//a[text()='Add New Gratuity']")
	WebElement AddNewGratuity;
	@FindBy(id="gratuity_employee_id")
	WebElement SelectEmployee;
	@FindBy(id="gratuity_payment_mode")
	WebElement SelectMOP;
	@FindBy(id="gratuity_salary_considered_earned")
	WebElement SalaryConsidered;
	@FindBy(id="gratuity_date_of_payment")
	WebElement DateofPayment;
	
	public AddNewGratuity(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonsalary() {
		ClickOnSalary.click();
	}
	public void clickongratutiy() {
		ClickOnGratuity.click();
	}
	public void addnewgratuity() {
		AddNewGratuity.click();
	}
	public void selectEmployee(String value) {
		dropDownSelect(SelectEmployee, value);
	}
	public void selectmodeofPayment(String value) {
		dropDownSelect(SelectMOP, value);
	}
	public void selectSalaryConsidered() {
		if(!SalaryConsidered.isSelected()) {
			SalaryConsidered.click();
		}
	}
	public void enterdateofpayment(String value) {
		DateofPayment.sendKeys(value);
		}
		
	
	
	

}
