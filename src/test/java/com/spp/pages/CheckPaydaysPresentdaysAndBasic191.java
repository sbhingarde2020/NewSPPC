package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckPaydaysPresentdaysAndBasic191 extends BasePage{
	public CheckPaydaysPresentdaysAndBasic191(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[4]/a")
	WebElement PublishedSalary;
	@FindBy(id="month_year")
	WebElement PayMonth;
	@FindBy(id="sd_salary_group_id")
	WebElement SalaryStructure;
	@FindBy(id="af_filter")
	WebElement GetEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	
	public void selectSalary() {
		Salary.click();
	}
	public void selectPublishedSalary() {
		PublishedSalary.click();
	}
	
	public void selectPayMonth(String value){
		dropDownSelect(PayMonth, value);
	}
	public void selectSalaryStructure(String value){
		dropDownSelect(SalaryStructure, value);
	}
	public void selectGetEmployee() {
		GetEmployee.click();
	}
	public void selectLoad() {
		Load.click();
	}

}
