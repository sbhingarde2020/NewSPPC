package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class GetBulkReimbursementErrorLogExcel extends BasePage{
	public GetBulkReimbursementErrorLogExcel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[4]/a")
	WebElement ReimbursementClaim;
	@FindBy(xpath="//a[text()='Bulk Reimbursement Error Log']")
	WebElement BulkReimbursementErrorLog;
	@FindBy(id="reimbursement_errors_reimb_module_type")
	WebElement ReimbursementModuleType;
	@FindBy(id="reimbursement_errors_date")
	WebElement LogDate;
	@FindBy(xpath="//input[@value='Export To Excel']")
	WebElement ExportToExcel;
	
	
	public void selectSalary() {
		Salary.click();
	}
	public void selectReimbursementClaim() {
		ReimbursementClaim.click();
	}
	public void selectBulkReimbursementErrorLog() {
		BulkReimbursementErrorLog.click();
	}
	public void selectReimbursementModuleType(String value){
		dropDownSelect(ReimbursementModuleType, value);
	}
	
	public void selectLogDate(String Value) {
		LogDate.sendKeys(Value);
	}
	public void selectExportToExcel() {
		ExportToExcel.click();
	}
}
