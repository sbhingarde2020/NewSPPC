package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddNewAdditionalSalary extends BasePage{
	@FindBy(id="salary")
	WebElement SalaryLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[2]/a")
	WebElement AdditionalSalary;
	@FindBy(linkText="Add New Salary Heading")
	WebElement AddNewSalaryHeading;
	@FindBy(id="additional_salary_definition_paymonth_id")
	WebElement PayMonths;
	@FindBy(id="additional_salary_definition_salary_head_id")
	WebElement SalaryType;
	@FindBy(id="additional_salary_definition_heading_name")
	WebElement AdditionalHeadingName;
	@FindBy(xpath="//*[@id=\"additional_salary_definition_form\"]/div[2]/input")
	WebElement CreateButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id=\"main\"]/div[4]/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[6]/a")
	WebElement DeleteButton;
	public AddNewAdditionalSalary(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSalaryLink(){
		SalaryLink.click();
	}
	
	public void selectAdditionalSalary(){
		AdditionalSalary.click();
	}

	public void selectAddNewSalaryHeading(){
		AddNewSalaryHeading.click();
	}
	
	public void ClickPayMonths(String value){
		dropDownSelect(PayMonths, value);
	}
	public void SelectSalaryType(String value){
		dropDownSelect(SalaryType, value);
	}
	
	
	public void enterAdditionalHeadingName(String value){
		AdditionalHeadingName.sendKeys(value);
	}
	public void clickCreateButton(){
		CreateButton.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}
	public void selectDeleteButton(){
		DeleteButton.click();
	}

}
