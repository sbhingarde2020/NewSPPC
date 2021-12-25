package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteAssignedPFGroupinBranch extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[1]/ul/li[1]/a")
	WebElement ClickOnCompany;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/li[2]/a")
	WebElement ClickOnBranch;
	@FindBy(xpath="//*[@id=\"branches\"]/div/table/tbody/tr[2]/td[5]/a")
	WebElement ClickOnEdit;
	@FindBy(xpath="//*[@id=\"main\"]/div[6]/nav/ul/li[2]/a")
	WebElement ClickOnPFDetail;
	@FindBy(xpath="//*[@id='pf_group_list']/div[2]/table/tbody/tr[1]/td[5]/a")
	WebElement ClickOnDelete;
	@FindBy(xpath="//*[@id=\"pf_result_response\"]/div/strong")
	WebElement successfullmessage;
	
	public DeleteAssignedPFGroupinBranch(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	public void clickoncompany() throws Exception{
		ClickOnCompany.click();
	}
	public void clickonbranch() {
		ClickOnBranch.click();
	}
	public void clickonedit() {
		ClickOnEdit.click();
	}
	public void clickonpfdetail() {
		ClickOnPFDetail.click();
	}
	public void clickondelete() {
		ClickOnDelete.click();
	}
	public String getMessage() {
		return successfullmessage.getText();
	}
}
