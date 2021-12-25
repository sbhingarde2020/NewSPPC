package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class LinkEmployee extends BasePage{
	public LinkEmployee(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="emp_detail")
    WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[2]/a")
	WebElement ReportingAuth;
	
	@FindBy(xpath="//*[@id=\"ew_list_table\"]/tbody/tr/td[4]/a[2]")
	WebElement Link;
	@FindBy(id="filter_employee_workflows_1")
	WebElement GetEmployee;
	
	@FindBy(xpath="//*[@id='bf_form']/div[9]/button[1]")
	WebElement LoadButton;
	
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement SuccessfulMessage;
	@FindBy(id="select_all_emp5")
	WebElement Uncheck;
	@FindBy(id="select_all_emp5")
	WebElement checkBox;
	@FindBy(id="submit_link_employees_workflow")
	WebElement LinkEmployee;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement SuccessfulMessage1;

	
	public void selectEmployee() {
		Employee.click();
	}
	public void selectReportingAuth() {
		ReportingAuth.click();
	}
	public void selectLink() {
	    Link.click();
	}
	public void selectGetEmployee() {
		GetEmployee.click();
	}
	public void selectLoadButton() {
		LoadButton.click();
	}
	
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void selectUncheck() {
		Uncheck.click();
	}
	public void selectcheckBox() {
		checkBox.click();
	}
	public void selectLinkEmployee() {
		LinkEmployee.click();
	}
	public String getMessage1() {
		return SuccessfulMessage1.getText();
	}
	
	
	
	
}
