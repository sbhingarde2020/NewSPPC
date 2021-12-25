package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditAssignedPFGroupInBranch extends BasePage {
	public EditAssignedPFGroupInBranch(WebDriver driver) {
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
	@FindBy(xpath="//*[@id=\"main\"]/div[6]/nav/ul/li[2]/a")
	WebElement PFDetailTab;
	@FindBy(xpath="//*[@id=\"pf_group_list\"]/div[2]/table/tbody/tr/td[4]/a")
	WebElement EditPFGroup;
	@FindBy(id="pf_effective_date")
	WebElement EditEffectiveDate;
	@FindBy(xpath="//*[@id=\"pfgroup_save\"]/div[2]/div[4]/input")
	WebElement UpdatePFDetail;
	@FindBy(xpath="//strong[text()='PF detail successfully updated.']")
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
	public void clickPFDetailTab() throws Exception{
		PFDetailTab.click();
	}
	public void clickEditPFGroup() {
		EditPFGroup.click();
	}
	public void editeffectivedate(String value) {
		EditEffectiveDate.sendKeys(value);
	}
	public void updatepfdetail(){
		UpdatePFDetail.click();
	}
	

	public String getMessage() {
		return successfullmessage.getText();
	}
}
