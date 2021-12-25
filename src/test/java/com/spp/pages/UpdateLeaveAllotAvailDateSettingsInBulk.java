package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateLeaveAllotAvailDateSettingsInBulk extends BasePage{

	
	
	public UpdateLeaveAllotAvailDateSettingsInBulk(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="emp_detail")
    WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[9]/a")
	WebElement LeaveAllotAvail;
	@FindBy(id="leave_definition_id")
	WebElement LeaveType;
	@FindBy(id="filter")
	WebElement GetEmployee;
	
	@FindBy(xpath="//*[@id='bf_form']/div[10]/button[1]")
	WebElement LoadButton;
	@FindBy(xpath="//*[@id='leave_allot_config']/tbody/tr[1]/td[4]/span")
	WebElement MoreLink;
	@FindBy(xpath="//*[@id=\"main\"]/div[5]/form/div[4]/div[1]/div[2]/div/div/input")
	WebElement AllotFrom;
	@FindBy(xpath="//*[@id=\"main\"]/div[5]/form/div[4]/div[1]/div[3]/div/div/input")
	WebElement AvailFrom;
	@FindBy(id="populate")
	WebElement UpdateButton;
	@FindBy(xpath="//*[@id=\"leave_allot_config_response\"]/div/strong")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id='leave_allot_config']/tbody/tr[1]/td[4]/span")
	WebElement MoreLink1;
	
	public void selectEmployee() {
		Employee.click();
	}
	public void selectLeaveAllotAvail() {
		LeaveAllotAvail.click();
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
   public void selectMoreLink() {
	   MoreLink.click();
   }
   public void selectAllotFrom(String value) {
	   AllotFrom.clear();
	   AllotFrom.sendKeys(value);  
	  //AllotFrom.sendKeys(Keys.TAB);
	 }
   public void selectAvailFrom(String value) {
	   AvailFrom.clear();
	   AvailFrom.sendKeys(value);
	   AvailFrom.sendKeys(Keys.TAB);
	 }
   
   
   public void selectUpdateButton() {
	   UpdateButton.click();
   }
   public String getMessage(){
		return successfullMessage.getText();
	}
   public void selectMoreLink1() {
	   MoreLink1.click();
   }
}
