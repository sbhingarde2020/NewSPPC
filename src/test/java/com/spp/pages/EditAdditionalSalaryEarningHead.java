package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditAdditionalSalaryEarningHead extends BasePage{
	@FindBy(id="salary")
	WebElement SalaryLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[2]/a")
	WebElement AdditionalSalary;
	@FindBy(id="month_year")
	WebElement PayMonths;
	@FindBy(xpath="//*[@id=\"addn_salary\"]/div[2]/div/input")
	WebElement GetValues;
	@FindBy(xpath="//*[@id=\"tabs-3\"]/div[2]/table/tbody/tr/td[4]/a")
	WebElement ClickEdit;
	@FindBy(id="additional_salary_definition_heading_name")
	WebElement AdditionalHeadingName;
	@FindBy(xpath="//input[@value='Update']")
	WebElement UpdateButton;
	@FindBy(xpath="//strong[text()='Additional salary head successfully updated']")
	WebElement successfullmessage;
	
	
public EditAdditionalSalaryEarningHead(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver,this);
}

public void clickSalaryLink(){
	SalaryLink.click();
}

public void selectAdditionalSalary(){
	AdditionalSalary.click();
}

public void ClickPayMonths(String value){
	dropDownSelect(PayMonths, value);
}
public void selectGetValues(){
	GetValues.click();
}
public void clickedit() {
	ClickEdit.click();
}
public void enterAdditionalHeadingName(String value){
	AdditionalHeadingName.clear();
	AdditionalHeadingName.sendKeys(value);
}
public void updatebutton() {
	UpdateButton.click();
}
public String getmessage() {
	return successfullmessage.getText();
}
}