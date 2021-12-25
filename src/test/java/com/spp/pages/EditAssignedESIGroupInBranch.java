package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditAssignedESIGroupInBranch extends BasePage{
	public EditAssignedESIGroupInBranch(WebDriver driver) {
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
	@FindBy(xpath="//*[@id=\"main\"]/div[6]/nav/ul/li[3]/a/span")
	WebElement ESIDetailTab;
	@FindBy(xpath="//*[@id=\"esi_group_list\"]/div[2]/table/tbody/tr/td[4]/a/img")
	WebElement EditESIGroup;
	@FindBy(id="esi_effective_date")
	WebElement EditEffectiveDate;
	@FindBy(xpath="//*[@id=\"esi_save\"]/div[2]/div[4]/input")
	WebElement UpdateESIDetail;
	@FindBy(xpath="//strong[text()='ESI detail successfully updated.']")
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
	public void clickESIDetailTab() throws Exception{
		ESIDetailTab.click();
	}
	public void clickEditESIGroup() {
		EditESIGroup.click();
	}
	public void editeffectivedate(String value) {
		EditEffectiveDate.sendKeys(value);
	}
	public void updateESIdetail(){
		UpdateESIDetail.click();
	}
	public String getMessage() {
		return successfullmessage.getText();	
	}
}


