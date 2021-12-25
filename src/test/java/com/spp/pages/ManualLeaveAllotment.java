package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class ManualLeaveAllotment extends BasePage{

	public ManualLeaveAllotment(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="emp_detail")
    WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[11]/a")
	WebElement ManualLeaveAllotment;
	@FindBy(id="select_paymonth")
	WebElement PayMonth;
	@FindBy(id="leave_policy")
	WebElement LeavePolicy;
	@FindBy(id="leave_type")
	WebElement LeaveType;
	@FindBy(id="filter")
	WebElement GetEmployee;
	@FindBy(xpath="//*[@id='bf_form']/div[10]/button[1]")
	WebElement LoadButton;
	
	@FindBy(id="leave_allotment_value_1457_val")
	WebElement AllotedBox;
	@FindBy(xpath="//*[@id='main']/div[6]/div/form/div[4]/button")
	WebElement UpdateLeaveAllotmentButton;
	@FindBy(xpath="//*[@id='show_message']/div/strong")
	WebElement SuccessfulMessage;
	
	public void selectEmployee() {
		Employee.click();
	}
	public void selectManualLeaveAllotment() {
		ManualLeaveAllotment.click();
	}
	public void selectPayMonth(String value){
		dropDownSelect(PayMonth, value);
	}
	public void selectLeavePolicy(String value){
		dropDownSelect(LeavePolicy, value);
	}
	public void selectLeaveType(String value){
		dropDownSelect(LeaveType, value);
	}
	
	public void selectGetEmployee() {
		GetEmployee.click();
	}
	public void selectLoadButton() {
		LoadButton.click();
	}

public void selectAllotedBox(String value) {
	AllotedBox.clear();
	AllotedBox.sendKeys(value);
}


public void selectUpdateLeaveAllotmentButton() {
	UpdateLeaveAllotmentButton.click();
}
 public String 	getMessage() {
	 return SuccessfulMessage.getText();
 }
	
	
}
