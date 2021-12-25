package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class DeleteBranch extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//ul[@id='menu']//a[text()='Company']")
	WebElement companylink;
	@FindBy(xpath="//a[text()='Branch']")
	WebElement banchlink;
	@FindBy(xpath="//div[@id='branches']//tr[2]//td[6]//a[text()='Delete']")
	WebElement deletebranchbutton;
	@FindBy(xpath="//strong[text()='Branch is successfully destroyed.']")
	WebElement successfullMessage;

	public DeleteBranch(WebDriver driver){   
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickCompanayLink() throws Exception{
		companylink.click();
	}

	public void clickBranchLink() throws Exception{
		banchlink.click();
	}

	public void clickDeleteBranchButton() throws Exception{
		deletebranchbutton.click();
		
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
