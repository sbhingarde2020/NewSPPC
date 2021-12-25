package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;
import java.text.DateFormatSymbols;
public class AssignigESIGroupToBranch extends BasePage{
	public AssignigESIGroupToBranch(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//ul[@id='menu']//a[text()='Company']")
	WebElement companylink;
	@FindBy(xpath="//a[text()='Branch']")
	WebElement branchlink;
	@FindBy(xpath="//*[@id=\"branches\"]/div/table/tbody/tr[1]/td[5]/a")
	WebElement Editlink;
	@FindBy(xpath="//*[@id=\"main\"]/div[6]/nav/ul/li[3]/a/span")
	WebElement ESIDetailTab;
	@FindBy(id="esi_detail_esi_group_id")
	WebElement ESIGroup;
	@FindBy(id="esi_effective_date")
	WebElement EffectiveFrom;
	@FindBy(xpath="//*[@id=\"esi_save\"]/div[2]/div[4]/input")
	WebElement CreateESIDetail;
	@FindBy(xpath="//*[@id=\"esi_result_response\"]/div/strong")
	WebElement SuccessfulMessage;
	
	
	
	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickCompanayLink() throws Exception{
		companylink.click();
	}

	public void clickBranchLink() throws Exception{
		branchlink.click();
	}
	public void clickEditlink() throws Exception{
		Editlink.click();
	}
	public void clickESIDetailTab() throws Exception{
		ESIDetailTab.click();
	}
	public void selectESIGroup(String value){
		dropDownSelect(ESIGroup, value);
	}
	public void enterEffectiveFrom(String value) {
		EffectiveFrom.sendKeys(value);
		
	}
	public void ClickCreateESIDetail() throws Exception{
		CreateESIDetail.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	
}
