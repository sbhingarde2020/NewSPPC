package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UnlinkEmployee extends BasePage {
	public UnlinkEmployee(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="emp_detail")
    WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[2]/a")
	WebElement ReportingAuth;
	
	@FindBy(xpath="//*[@id=\"ew_list_table\"]/tbody/tr/td[4]/a[1]")
	WebElement Unlink;

	@FindBy(xpath="//*[@id='employee_workflow_generate_excel']/tbody/tr[1]/td[1]/input")
	WebElement CheckBox;
	@FindBy(id="submit_unlink_employees_workflow")
	WebElement UnlinkEmployeeButton;
	
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement SuccessfulMessage;
	
	
	
	
	public void selectEmployee() {
		Employee.click();
	}
	public void selectReportingAuth() {
		ReportingAuth.click();
	}
	public void selectUnlink() {
		Unlink.click();
	}
	
	public void selectCheckBox() {
		CheckBox.click();
	}
	public void selectUnlinkEmployeeButton() {
		UnlinkEmployeeButton.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	
	
	
	
	
	
	
	
	
}
