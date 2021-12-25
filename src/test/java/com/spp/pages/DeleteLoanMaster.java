package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteLoanMaster extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Loan Master']")
	WebElement loanMaster;
	@FindBy(xpath="(//a[text()='Delete'])[2]")
	WebElement deleteLoan;
	@FindBy(xpath="//strong[text()='Loan successfully deleted']")
	WebElement successfullMessage;
	
	public DeleteLoanMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void clickLoanMaster() throws Exception{
		loanMaster.click();
	}
	
	public void clickDeleteLoanMaster() throws Exception{
		deleteLoan.click();
		switchToPopUpAndAccept(driver);
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
