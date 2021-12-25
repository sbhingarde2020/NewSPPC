package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AssignPFGroupToBranch extends BasePage {
	
	public AssignPFGroupToBranch(WebDriver driver) {
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
	@FindBy(xpath="//*[@id=\"branches\"]/div/table/tbody/tr[1]/td[5]/a")
	WebElement Editlink;
	@FindBy(xpath="//*[@id=\"main\"]/div[6]/nav/ul/li[2]/a/span")
	WebElement PFDetailTab;
	@FindBy(id="pf_detail_pf_group_id")
	WebElement PFGroup;
	@FindBy(id="pf_effective_date")
	WebElement EffectiveFrom;
	@FindBy(xpath="//*[@id=\"pfgroup_save\"]/div[2]/div[4]/input")
	WebElement CreatePfDetails;
	@FindBy(xpath="//*[@id=\"pf_result_response\"]/div/strong")
	WebElement SuccessfulMessage;
	
	
	
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
	public void selectPFGroup(String value){
		dropDownSelect(PFGroup, value);
	}
	public void enterEffectiveFrom(String value) {
		EffectiveFrom.sendKeys(value);
	}
	public void ClickCreatePfDetails() throws Exception{
		CreatePfDetails.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	
}
