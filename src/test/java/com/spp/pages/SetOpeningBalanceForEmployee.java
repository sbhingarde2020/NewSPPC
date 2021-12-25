package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class SetOpeningBalanceForEmployee extends BasePage {
	public SetOpeningBalanceForEmployee(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="emp_detail")
    WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[10]/a")
	WebElement SetOpeningBalance;
	@FindBy(id="sel_leave_type")
	WebElement LeaveType;
	@FindBy(id="filter")
	WebElement GetEmployeeButtone;
	@FindBy(xpath="//*[@id='bf_form']/div[10]/button[1]")
	WebElement LoadButton;
	@FindBy(xpath="//*[@id='leave_op_bal']/tbody/tr/td[contains(text(),'Anil')]/parent::tr/td/span")
	WebElement MoreButton;
	@FindBy(id="opening_balance_value_195_val")
	WebElement OpeningBalance;
	@FindBy(id="populate")
	WebElement Update;
	@FindBy(xpath="//*[@id='leave_op_bal_response']/div/strong")
	WebElement successfullMessage;	
	
	public void selectEmployee() {
		Employee.click();
	}
	public void selectSetOpeningBalance() {
		SetOpeningBalance.click();
	}
	public void selectLeaveType(String value) {
		dropDownSelect(LeaveType, value);
	}
	public void selectGetEmployeeButtone() {
		GetEmployeeButtone.click();
	}
	public void selectLoadButton() {
		LoadButton.click();
	}
	public void selectMoreButton() {
		MoreButton.click();
	}
	public void selectOpeningBalance(String Value) {
		OpeningBalance.clear();
		OpeningBalance.sendKeys(Value);
	}
	public void selectUpdate() {
		Update.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}
}
