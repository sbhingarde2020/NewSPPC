package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class DeleteReimbursement extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Reimbursement Master']")
	WebElement reimbursemnetLink;
	@FindBy(xpath="(//a[text()='Delete'])[1]")
	WebElement deleteReimbursement;
	@FindBy(xpath="//strong[text()='Reimbursement Master is successfully deleted']")
	WebElement successfullyMessage;
	
	public DeleteReimbursement(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickMastserLink(){
		masterLink.click();
	}

	public void clickReimbursementMaster(){
		reimbursemnetLink.click();
	}
	
	public void clickDeleteReimbursement(){
		deleteReimbursement.click();
		switchToPopUpAndAccept(driver);
	}
	
	public String getMessage(){
		return successfullyMessage.getText();
	}
}

//package com.spp.pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import com.spp.common.BasePage;
//
//public class DeleteReimbursementAllotment BasePage {
//	
//	public DeleteReimbursementAllotment(WebDriver driver) {
//		super(driver);
//		PageFactory.initElements(driver, this);
//	}
//	
//	
//	@FindBy(id="emp_detail")
//	WebElement Employee;
//	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[8]/a")
//	WebElement ReimbursementAllotment;
//	@FindBy(xpath="//*[@id=\"reimbursement_allotments\"]/tbody/tr[1]/td[8]/a")
//	WebElement DeleteButton;
//	@FindBy(xpath="//*[@id=\"reimbursement_allotment_result_response\"]/div/strong")
//	WebElement successfullMessage;
//
//	
//	public void selectEmployee() {
//		Employee.click();
//	}
//	public void selectReimbursementAllotment() {
//		ReimbursementAllotment.click();
//	}
//	public void selectDeleteButton() {
//		DeleteButton.click();
//		switchToPopUpAndAccept(driver);
//	}
//	public String getMessage(){
//		return successfullMessage.getText();
//	}
//}
