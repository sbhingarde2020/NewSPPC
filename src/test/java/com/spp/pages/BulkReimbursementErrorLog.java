package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class BulkReimbursementErrorLog extends BasePage{
	public BulkReimbursementErrorLog(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="emp_detail")
    WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[8]/a")
	WebElement ReimbursementAllotment;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/li[3]/a")
    WebElement ErrorLogLink;
	@FindBy(id="reimbursement_errors_reimb_module_type")
	WebElement ReimbursementModuleType;
	@FindBy(id="reimbursement_errors_date")
    WebElement LogDate;
	@FindBy(xpath="//*[@id=\"reimbursement_errors\"]/div/div/input[1]")
	WebElement GetErrorButton;
	
	
	
	public void selectEmployee() {
		Employee.click();
	}
	public void selectReimbursementAllotment() {
		ReimbursementAllotment.click();
	}
	public void selectErrorLogLink() {
		ErrorLogLink.click();
	}
	public void selectReimbursementModuleType(String value){
		dropDownSelect(ReimbursementModuleType, value);
	}
	public void selectLogDate(String Value) {
		LogDate.sendKeys(Value);
	}
	public void selectGetErrorButton() {
		GetErrorButton.click();
	}
	
}
