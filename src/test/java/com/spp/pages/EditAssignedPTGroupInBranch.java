package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditAssignedPTGroupInBranch extends BasePage {
	public EditAssignedPTGroupInBranch(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//ul[@id='menu']//a[text()='Company']")
	WebElement companylink;
	@FindBy(xpath="//a[text()='Branch']")
	WebElement banchlink;
	@FindBy(xpath="//*[@id=\"branches\"]/div/table/tbody/tr[2]/td[5]/a")
	WebElement Editlink;
	@FindBy(xpath="//*[@id=\"main\"]/div[6]/nav/ul/li[4]/a/span")
	WebElement PTDetailTab;
	@FindBy(xpath="//*[@id=\"pt_group_list\"]/div[2]/table/tbody/tr[1]/td[4]/a/img")
	WebElement EditPTGroup;
	@FindBy(id="pt_effective_date")
	WebElement EditEffectiveDate;
	@FindBy(xpath="//*[@id=\"ptdetail_save\"]/div[2]/div[4]/input")
	WebElement UpdatePTDetail;
	@FindBy(xpath="//strong[text()='PT detail successfully updated.']")
	WebElement successfullmessage;
	
	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickCompanayLink() throws Exception{
		companylink.click();
	}

	public void clickBranchLink() throws Exception{
		banchlink.click();
	}
	public void clickEditlink() throws Exception{
		Editlink.click();
	}
	public void clickPTDetailTab() throws Exception{
		PTDetailTab.click();
	}
	public void clickEditPTGroup() {
		EditPTGroup.click();
	}
	public void editeffectivedate(String value) {
		EditEffectiveDate.sendKeys(value);
	}
	public void updatepTdetail(){
		UpdatePTDetail.click();
	}
	public String getMessage() {
		return successfullmessage.getText();	
	}
}


