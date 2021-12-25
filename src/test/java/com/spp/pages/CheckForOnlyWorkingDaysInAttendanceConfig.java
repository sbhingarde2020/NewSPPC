package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckForOnlyWorkingDaysInAttendanceConfig extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Attendance Configuration']")
	WebElement attendanceConfiguration;
	@FindBy(xpath="//tr[2]/td[5]/a[@class='action-edit']")
	WebElement editIcon;
	@FindBy(id="attendance_configuration_salary_calendar_days_only_working_days")
    WebElement salaryCalender;
	@FindBy(xpath="//input[@value='Update Attendance Configuration']")
	WebElement updateButton;
	@FindBy(xpath="//div[text()='Attendance Configuration was Successfully updated']")
	WebElement successfullMessage;
	@FindBy(id="salary")
	WebElement SalaryLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[1]/a")
	WebElement SalaryEditor;
	@FindBy(id="month_year")
	WebElement PayMonth;
	@FindBy(id="salary_structure")
	WebElement SalaryStructure;
	@FindBy(id="get_salary")
	WebElement GetValues;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"salaries\"]/thead/tr/th[1]/input")
	WebElement SelectAllBox;
	@FindBy(xpath="//*[@id=\"salaries\"]/tbody/tr[1]/td[1]/input")
	WebElement Employee;
	@FindBy(xpath="//*[@id=\"salary_editor_form\"]/table/tbody/tr[2]/td/div/div/div[1]/input")
	WebElement ProcessSalaryButton;
	@FindBy(xpath="//*[@id=\"salary_review\"]/tbody/tr[1]/td[7]/a")
	WebElement Edit;
	@FindBy(xpath="//*[@id=\"salary_detail\"]/tbody/tr/td[3]")
	WebElement GetPayDays;
	@FindBy(xpath="//*[@id='main']/div[2]/nav/ul/li[2]/a/span")
	WebElement DetailView;
	public CheckForOnlyWorkingDaysInAttendanceConfig(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectAttendanceConfiguration(){
		attendanceConfiguration.click();
	}
	
	public void clickEditIcon(){
		editIcon.click();
	}
	public void clickDetailView(){
		DetailView.click();
	}
	
	
	public void clickSalaryCalender(){
		if(salaryCalender.isSelected()) {
		System.out.println("Already Selected");
		}
		else {
			salaryCalender.click();
		}
	}
	
		
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
	public void clickSalaryLink(){
		SalaryLink.click();
	}
	public void clickSalaryEditor(){
		SalaryEditor.click();
	}
	public void clickPayMonth(String value){
		dropDownSelect(PayMonth, value);
	}
	public void clickSalaryStructure(String value){
		dropDownSelect(SalaryStructure, value);
	}
	public void clickGetValues(){
		GetValues.click();
	}
	public void clickLoad(){
		Load.click();
	}
	public String getMessage1(){
		return SuccessfulMessage.getText();
	}
	public void clickSelectAllBox(){
		SelectAllBox.click();
	}
	public void clickEmployee(){
		Employee.click();
	}
	public void clickProcessSalaryButton(){
		ProcessSalaryButton.click();
	}
	public void clickEdit(){
		Edit.click();
	}
	public String getPayDays() {
		return GetPayDays.getText();
	}

}
