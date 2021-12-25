package com.spp.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditEmployeeDOL extends BasePage{
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
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/nav/ul/li[6]/a/span")
	WebElement SeparationInfo;
	@FindBy(id="dol")
	WebElement DateOfLeaving;
	@FindBy(id="employee_leaving_reason")
	WebElement ReasonForLeaving;
	@FindBy(xpath="//*[@id=\"tabs-7\"]/div/form/div[4]/input")   
	WebElement UpdateButton;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement successfullMessage;
	
	public EditEmployeeDOL(WebDriver driver){
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
public void selectSeparationInfo(){
	SeparationInfo.click();
}
public void selectDateOfLeaving(String value){
	DateOfLeaving.clear();
	DateOfLeaving.sendKeys(value);
	DateOfLeaving.sendKeys(Keys.TAB);
}	
public void selectReasonForLeaving(String value) throws InterruptedException{
	dropDownSelect(ReasonForLeaving,value);
	
//   ReasonForLeaving.sendKeys(Keys.TAB);
//   Thread.sleep(4000);
//	ReasonForLeaving.sendKeys(Keys.TAB);
//	Thread.sleep(4000);
//	ReasonForLeaving.sendKeys(Keys.TAB);
//	Thread.sleep(4000);
//	ReasonForLeaving.sendKeys(Keys.TAB);
 	//WebDriver driver = new ChromeDriver();
	JavascriptExecutor ReasonForLeaving = (JavascriptExecutor)driver;
	ReasonForLeaving.executeScript("window.scrollBy(0,250)", "");
}
public void clickUpdateButton(){
	UpdateButton.click();
}
public String getMessage(){
return successfullMessage.getText();
}

}
