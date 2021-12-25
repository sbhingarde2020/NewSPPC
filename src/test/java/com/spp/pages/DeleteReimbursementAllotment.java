package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.spp.common.BasePage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteReimbursementAllotment extends BasePage{


	public DeleteReimbursementAllotment(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="emp_detail")
    WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[8]/a")
	WebElement ReimbursementAllotment;
	@FindBy(xpath="//*[@id='reimbursement_allotments']/tbody/tr/td[contains(text(),'Anil')]/parent::tr/td/a[2]")
	WebElement DeleteButton;
	@FindBy(xpath="//*[@id=\"reimbursement_allotment_result_response\"]/div/strong")
	WebElement successfullMessage;
	
	public void selectEmployee() {
		Employee.click();
	}
	public void selectReimbursementAllotment() {
		ReimbursementAllotment.click();
	}
	public void selectDeleteButton() {
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	public String getMessage(){
		return successfullMessage.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
