package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckLoanDetailsRedirectsToReports extends BasePage{
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(linkText="Loan Detail")
	WebElement LoanDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	@FindBy(id="report")
	WebElement Reports;
	@FindBy(xpath="//*[@id=\"menu\"]/li[8]/div/div[3]/ul/li[7]/a")
	WebElement StandingInstructions;
	@FindBy(id="si_type")
	WebElement SIType;
	@FindBy(id="report_type")
	WebElement ReportType;
	@FindBy(id="si_from_month")
	WebElement SIFrom;
	@FindBy(id="si_to_month")
	WebElement SITo;
	@FindBy(id="filter")
	WebElement GetEmployees;
	
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[1]/td[1]/input")
	WebElement Employee;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_instruction_form\"]/div[5]/input")
	WebElement GenerateReport;
	public CheckLoanDetailsRedirectsToReports(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickLoanDetails() throws Exception{
		LoanDetails.click();
	}
	public void clickAddEmployee() throws Exception{
		AddEmployee.click();	
	}
	public void clickLoad() throws Exception{
		Load.click();
	}
	public void clickReports() throws Exception{
		Reports.click();
	}
	public void clickStandingInstructions() throws Exception{
		StandingInstructions.click();
	}
	public void ClickSIType(String value) throws Exception{
		dropDownSelect(SIType ,value);
	}
	public void ClickReportType(String value) throws Exception{
		dropDownSelect(ReportType ,value);
	}
	public void ClickSIFrom(String value) throws Exception{
		dropDownSelect(SIFrom ,value);
	}
	public void ClickSIToe(String value) throws Exception{
		dropDownSelect(SITo ,value);
	}
	public void ClickGetEmployees() throws Exception{
		GetEmployees.click();
	}
	public void clickEmployee() throws Exception{
		Employee.click();
	}
		
	public void clickGenerateReport() throws Exception{
		GenerateReport.click();
		}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}

}
