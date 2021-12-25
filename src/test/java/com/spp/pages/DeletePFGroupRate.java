package com.spp.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeletePFGroupRate extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Company Statutories']")
	WebElement companystatutorylink;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/li[1]/a")
	WebElement ClickonPF;
	@FindBy(xpath="//*[@id=\"dt_pf_groups\"]/tbody/tr[2]/td[4]/span[1]")
	WebElement ClickOnEdit;
	@FindBy(xpath="//span[contains(text(), 'PF Rate')]")
	WebElement pfratelink;
	@FindBy(xpath="//*[@id=\"pf_grprate_list\"]/div[2]/table/tbody/tr[1]/td[6]/a/img")
	WebElement deletepfratebutton;
	@FindBy(xpath="//a[text()='PF Group']")
	WebElement PfGrouplink;
	@FindBy(xpath="//table[@id='dt_pf_groups']//tr[4]//td[5]//a[text()='delete']")
	WebElement deletepfgroupbutton;
	@FindBy(xpath="//*[@id=\"pf_grprt_res_rsp\"]/div/strong")
	WebElement successfullMessage;
	
	public DeletePFGroupRate(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickCompanayLink() throws Exception{
		companystatutorylink.click();
	}
	public void clickonpf() {
		ClickonPF.click();
	}
	
	public void clickedit() throws Exception{
		ClickOnEdit.click();
	}

	public void clickPFRateLinkButton() throws Exception{
		pfratelink.click();
	}
	
	public void clickdeletepfratebutton() throws Exception{
		deletepfratebutton.click();
		
		
	}
//	public void clickPFGroupLink() throws Exception{
//		PfGrouplink.click();
//	}
//	
//	public void clickDeletePFGroupButton() throws Exception{
//		deletepfgroupbutton.click();
//		switchToPopUpAndAccept(driver);
//	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}

}
