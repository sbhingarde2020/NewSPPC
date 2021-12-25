package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class GenerateSalarySheetReportCalculationTypeNotApplicable extends BasePage {
	public GenerateSalarySheetReportCalculationTypeNotApplicable(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="report")
	WebElement Reports;
	@FindBy(xpath="//*[@id=\"menu\"]/li[8]/div/div[2]/ul/li[2]/a")
	WebElement SalarySheet;
	@FindBy(id="sal_report_type")
	WebElement report;
	@FindBy(id="month_year")
	WebElement PayMonth;
	@FindBy(id="xls_format")
	WebElement Excel;
	@FindBy(id="salary_sheet_filter")
	WebElement GetEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")  //
	WebElement SuccessfulMessage;
	@FindBy(id="salary_sheet_submit")
	WebElement GenerateReport;

	
	public void selectReports() {
		Reports.click();
	}
	public void selectSalarySheet() {
		SalarySheet.click();
	}
	
	public void selectreport(String value){
		dropDownSelect(report, value);
	}
	public void selectPayMonth(String value){
		dropDownSelect(PayMonth, value);
	}
	public void selectExcel() {
		Excel.click();
	}
	
	public void selectGetEmployee() {
		GetEmployee.click();
	}
	public void selectLoad() {
		Load.click();
	}
	public void selectGenerateReport() {
		GenerateReport.click();
	}
	
	public String getMessage() {
		return SuccessfulMessage.getText();
	}


}
