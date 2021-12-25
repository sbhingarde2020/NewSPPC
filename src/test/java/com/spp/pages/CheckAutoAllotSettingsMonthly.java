package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckAutoAllotSettingsMonthly extends BasePage {

	@FindBy(xpath="//*[@id=\"menu\"]/li[8]/a")
	WebElement Report;
	@FindBy(xpath="//*[@id=\"menu\"]/li[8]/div/div[1]/ul/li[7]/a")
	WebElement AdvanceLeaveReport;
	@FindBy(id="leave_report_type")
	WebElement LeaveReport;
	@FindBy(id="leave_policy")
	WebElement LeavePolicy;
	
	@FindBy(id="from_date")
	WebElement FromDate;
	@FindBy(id="to_date")
	WebElement ToDate;
	@FindBy(xpath="//*[@id=\"leave_type_radio\"]/div[4]/input")
	WebElement CasualLeave;
	@FindBy(id="leave_report_employees")
	WebElement GetEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
    WebElement Load;
	@FindBy(xpath="//*[@id=\"leave_report_table\"]/tbody/tr[1]/td[1]/input")
	WebElement Employee1;
	@FindBy(xpath="//*[@id=\"leave_report_table\"]/tbody/tr[2]/td[1]/input")
	WebElement Employee2;
	@FindBy(id="leave_report_submit")
	WebElement GenerateReport;
	
	public CheckAutoAllotSettingsMonthly(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	
	public void clickReport(){
		Report.click();
	}
	public void clickAdvanceLeaveReport(){
		AdvanceLeaveReport.click();
	}
	public void selectLeaveReport(String value) {
		dropDownSelect(LeaveReport, value);
	}
	public void selectLeavePolicy(String value) {
		dropDownSelect(LeavePolicy, value);
	}
	public void clickFromDate(String value){
		FromDate.clear();
		FromDate.sendKeys(value);
	}
	public void clickToDate(String value){
		ToDate.clear();
		ToDate.sendKeys(value);
	}
	public void clickSelectCasualLeave(){
		CasualLeave.click();
	}
	public void clickGetEmployee(){
		GetEmployee.click();
	}
	public void clickLoad(){
		Load.click();
	}
	
	public void clickEmployee1(){
		Employee1.click();
	}
	
	public void clickEmployee2(){
		Employee2.click();
	}
	public void clickGenerateReport(){
		GenerateReport.click();
	}
}
