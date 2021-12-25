package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditEmployee6Nov extends BasePage {
	@FindBy(id="emp_detail")
	WebElement employeeLink;	
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement EmployeeDetails;
	@FindBy(id="filter_head")
	WebElement FilterHead;
	@FindBy(xpath="//input[@attr='non_classified_emp']")
	WebElement EmployeewithoutClass;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement LoadButton;
	@FindBy(xpath="//*[@id=\"employees_dtable\"]/tbody/tr[1]/td[6]/a")
	WebElement ViewButton;
	@FindBy(xpath="//*[@id=\"edit_employee\"]/a")
	WebElement EditEmployee;
	@FindBy(id="doj")
	WebElement DateOfJoining;
	@FindBy(id="sal_date")
	WebElement DateOfSalary;
	@FindBy(xpath="//*[@id=\"emp_update\"]/div[4]/input")   
	WebElement UpdateButton;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement successfullMessage;
	
	public EditEmployee6Nov(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
}


public void clickEmployeeLink() {
	   employeeLink.click();
}
public void selectEmployeeDetails(){
 	EmployeeDetails.click();
}
public void selectFilterHead(){
	FilterHead.click();
}
public void clickEmployeewithoutClass(){
	EmployeewithoutClass.click();
}
public void selectLoadButton(){
	LoadButton.click();
}
public void selectViewButton(){
	ViewButton.click();
}
public void selectEditEmployee(){
	EditEmployee.click();
}
public void selectDateOfJoining(String value){
	DateOfJoining.clear();
	switchToPopUpAndAccept(driver);
	DateOfJoining.sendKeys(value);
}	
public void selectDateOfSalary(String value){
	DateOfSalary.clear();
	switchToPopUpAndAccept(driver);
	DateOfSalary.sendKeys(value);
	
	
}
public void clickUpdateButton(){
	UpdateButton.click();
	//switchToPopUpAndAccept(driver);
	UpdateButton.click();
}
public String getMessage(){
return successfullMessage.getText();
}
}
