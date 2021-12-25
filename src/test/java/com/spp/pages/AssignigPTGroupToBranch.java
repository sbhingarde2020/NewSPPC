package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AssignigPTGroupToBranch extends BasePage {
	public AssignigPTGroupToBranch(WebDriver driver) {
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
	@FindBy(xpath="//*[@id=\"main\"]/div[6]/nav/ul/li[4]/a/span")
	WebElement PTDetailTab;
	@FindBy(id="pt_detail_pt_group_id")
	WebElement PTGroup;
	@FindBy(id="pt_effective_date")
	WebElement EffectiveFrom;
	@FindBy(xpath="//*[@id=\"ptdetail_save\"]/div[2]/div[4]/input")
	WebElement CreatePTDetail;
	@FindBy(xpath="//*[@id=\"pt_result_response\"]/div/strong")
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
	public void clickPTDetailTab() throws Exception{
		PTDetailTab.click();
	}
	public void selectPTGroup(String value){
		dropDownSelect(PTGroup, value);
	}
	public void enterEffectiveFrom(String value) {
		EffectiveFrom.sendKeys(value);
	}
	public void ClickCreatePTDetail() throws Exception{
		CreatePTDetail.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	
}

