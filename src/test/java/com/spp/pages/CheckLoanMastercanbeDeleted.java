package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckLoanMastercanbeDeleted extends BasePage{

	
	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[4]/a")
	WebElement SelectLoanMaster;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[2]/table/tbody/tr/td[5]/a")
	WebElement ClickonDelete;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfulMessage;
	
	public CheckLoanMastercanbeDeleted(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickonMaster() {
		ClickOnMaster.click();
	}
	public void selectloanmaster() {
		SelectLoanMaster.click();
	}
	public void clickondelete() {
		ClickonDelete.click();
	}
	public String getMessage() {
    	return successfulMessage.getText();
    }
}
