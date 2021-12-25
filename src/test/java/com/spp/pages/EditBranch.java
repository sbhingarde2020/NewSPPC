package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class EditBranch extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//ul[@id='menu']//a[text()='Company']")
	WebElement companylink;
	@FindBy(xpath="//a[text()='Branch']")
	WebElement banchlink;
	@FindBy(xpath="//div[@id='branches']//tr[2]//td[5]//a[text()='Edit']")
	WebElement editBranchLink;
	@FindBy(id="branch_branch_name")
	WebElement branchname;
	@FindBy(id="branch_responsible_person")
	WebElement responsibleperson;
	@FindBy(id="branch_address")
	WebElement branchadd;
	@FindBy(xpath="//input[@value='Update Branch']")
	WebElement updatebranchbutton;
	@FindBy(xpath="//strong[text()='Branch details successfully updated.']")
	WebElement successfullMessage;
	
	public EditBranch(WebDriver driver){   
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
	
	public void clickEditBranchLink() throws Exception{
		editBranchLink.click();
	}
	
	public void enterBranchName(String value) throws Exception{
		branchname.clear();
		branchname.sendKeys(value);
	}
	public void enterReponsiblePersonName(String value) throws Exception{
		responsibleperson.clear();
		responsibleperson.sendKeys(value);
	}

	public void enterBranchAddress(String value) throws Exception{
		branchadd.clear();
		branchadd.sendKeys(value);
	}
	
	public void clickUpdateBranchButton() throws Exception{
		updatebranchbutton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
