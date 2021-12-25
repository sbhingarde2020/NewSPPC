package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class BulkDelete extends BasePage {
	
	public BulkDelete(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="emp_detail")
    WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[8]/a")
	WebElement ReimbursementAllotment;		
	@FindBy(xpath="//*[@id=\"bulk_reimbursement_delete\"]/a")
    WebElement BulkDeleteLink;
	@FindBy(xpath="//*[@id=\"employees_table\"]/tbody/tr[1]/td[1]/input")
    WebElement EmployeeSelection;
	@FindBy(id="bulk_delete_select_all")
	WebElement BulkDelete;
	@FindBy(xpath="//*[@id='bulk_delete_allotment']/div[4]/input")
    WebElement DeleteReimbursementAllotmentsButton;
	@FindBy(xpath="//*[@id=\"reimbursement_allotment_result_response\"]/div/strong")
	WebElement successfullMessage;	
	
	
	public void selectEmployee() {
		Employee.click();
	}
	public void selectReimbursementAllotment() {
		ReimbursementAllotment.click();
	}
	public void selectBulkDeleteLink() {
		BulkDeleteLink.click();
	}
	public void selectEmployeeSelection() {
		EmployeeSelection.click();
	}
	public void selectDeleteReimbursementAllotmentsButton() {
		DeleteReimbursementAllotmentsButton.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}
	public void BulkDelete() {
		BulkDelete.click();
	}

}
