package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteLeave extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
	 @FindBy(xpath="//*[@id=\"leave-policy-master-list\"]/table/tbody/tr/td[contains(text(),'LeavePolicyMaster')]/parent::tr/td[4]/a")
	WebElement addLeaves;
    @FindBy(xpath="//img[@title='Delete']")
    WebElement deleteButton;
    @FindBy(xpath="//strong[text()='Leave deleted successfully.']")
    WebElement successfullMessage;
	@FindBy(id="non_saved_leaves")
	WebElement leaveType;
    @FindBy(xpath="//input[@value='Add']")
    WebElement addButton;

	public DeleteLeave(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectLeavePolicy(){
		leavePolicy.click();
	}
	
	public void clickAddLeaves(){
		addLeaves.click();
	}
	
	public void clickDeleteButton() throws InterruptedException{
		deleteButton.click();
		switchToPopUpAndDismiss();
		Thread.sleep(2000);
		deleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
	public void selectLeaveType(String value){
		dropDownSelect(leaveType, value);
	}

	public void clickAddButton(){
		addButton.click();	
	}
}
