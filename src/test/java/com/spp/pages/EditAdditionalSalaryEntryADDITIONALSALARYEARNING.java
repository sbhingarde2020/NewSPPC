package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditAdditionalSalaryEntryADDITIONALSALARYEARNING extends BasePage{
	@FindBy(id="salary")
	WebElement SalaryLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[2]/a")
	WebElement AdditionalSalary;
	@FindBy(id="month_year")
	WebElement PayMonth;
	@FindBy(xpath="//*[@id=\"addn_salary\"]/div[2]/div/input")
	WebElement GetValues;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/div[2]/nav/ul/li[2]/a/span")
	WebElement DeductionTab;
	@FindBy(xpath="//*[@id='main']/div[2]/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[5]/a")
	WebElement Allot;
	@FindBy(xpath="//*[@id=\"additional_salary\"]/tbody/tr/td[4]/a")
	WebElement ClickEdit;
	@FindBy(id="additional_salary_entry_amount")
	WebElement EnterAmount;
	@FindBy(xpath="//input[@value='Update']")
	WebElement UpdateButton;
	@FindBy(xpath="//strong[text()='Additional salary succesfully updated']")
	WebElement successfullmessage;
public EditAdditionalSalaryEntryADDITIONALSALARYEARNING(WebDriver driver) {
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
public void clickedit() {
	ClickEdit.click();
}
public void enteramount(String value) {
	EnterAmount.sendKeys(value);
}
public void updatebutton() {
	UpdateButton.click();
}
public String getmessage() {
	return successfullmessage.getText();
}

}