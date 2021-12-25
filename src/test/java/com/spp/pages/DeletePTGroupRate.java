package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeletePTGroupRate extends BasePage{
	
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Company Statutories']")
	WebElement companystatutorylink;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/li[3]/a")
	WebElement PTGroup;
	@FindBy(xpath="//*[@id='dt_pt_groups']/tbody/tr/td[contains(text(),'PT-1')]/parent::tr/td[4]/span[1]/a")
	WebElement EditLink;
	@FindBy(xpath="//*[@id='main']/div[3]/nav/ul/li[2]/a/span")
	WebElement PTRate;
	@FindBy(xpath="//*[@id='ptrate_list']/div[2]/table/tbody/tr/td[4]/a[1]")
	WebElement Settings;
	@FindBy(xpath="//*[@id='pt_rate_list']/div[2]/table/tbody/tr[1]/td[9]/a")
	WebElement DeleteButton;
	@FindBy(xpath="//*[@id='pt_rate_result']/div/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id='ptrate_list']/div[2]/table/tbody/tr/td[4]/a[2]")
	WebElement DeleteSlab;
	
	public DeletePTGroupRate(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickCompanayLink() throws Exception{
		companystatutorylink.click();
	}
	
	public void clickPTGroup() throws Exception{
		PTGroup.click();
	}
	public void clickEditLink() throws Exception{
		EditLink.click();

    }
	public void clickPTRate() throws Exception{
		PTRate.click();
	}

	public void clickSettings() throws Exception{
		Settings.click();
	}
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndDismiss();
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	public String getMessage(){
		return SuccessfulMessage.getText();
	}
	public void DeletePTSlab() {
		DeleteSlab.click();
		switchToPopUpAndAccept(driver);
	}
}