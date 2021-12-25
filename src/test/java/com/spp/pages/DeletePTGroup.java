package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class DeletePTGroup extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Company Statutories']")
	WebElement companystatutorylink;
	@FindBy(xpath="//a[text()='PT Group']")
	WebElement ptlink;
	@FindBy(xpath="//table[@id='dt_pt_groups']//tr[2]//td[4]//a[text()='edit']")
	WebElement editPTGroupIcon;
	@FindBy(xpath="(//span[normalize-space(text()='PT Rate')])[7]")
	WebElement ptratelink;
	@FindBy(xpath="//a[text()='Settings']")
	WebElement settingslink;
	@FindBy(xpath="//*[@id='dt_pt_groups']/tbody/tr/td[contains(text(),'PT-1')]/parent::tr/td[4]/span[2]/a")
	WebElement DeleteFirstPT;
	@FindBy(xpath="//a[text()='delete']")
	WebElement deleteSettings;
	@FindBy(xpath="(//a[text()='delete'])[2]")
	WebElement deletePTGroupButton;
	@FindBy(xpath="//strong[text()='PT Group was successfully deleted.']")
	WebElement successfullMessage;
	@FindBy (xpath="//*[@id=\"ptrate_list\"]/div[2]/table/tbody/tr/td[4]/a[@class='action-delete']")
	WebElement deletePTratelist;
	@FindBy(xpath="  //*[@id=\"ui-accordion-accordion-panel-0\"]/li[3]/a")
	WebElement ptlinkrate;
	
	public DeletePTGroup(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickCompanayLink() throws Exception{
		companystatutorylink.click();
	}

	public void clickPTLink() throws Exception{
		ptlink.click();
	}

	public void clickEditPTGroup() throws Exception{
		editPTGroupIcon.click();
	}
	
	public void clickPTRate() {
		ptratelink.click();	}
	
	public void clickSettingsLink(){
		settingslink.click();
	}
	
	public void clickDeleteFirstPT() {
		DeleteFirstPT.click();
		
	}
	
	public void clickDeleteSixthPT() {
		DeleteFirstPT.click();
		
	}
	
	public void clickDeleteSettings() throws Exception{
		deleteSettings.click();
		switchToPopUpAndAccept(driver);
	}
	
	public void clickDeletePTGroupButton() throws Exception{
		deletePTGroupButton.click();
		switchToPopUpAndAccept(driver);
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
	public void clickDeletePTratelist() {
		deletePTratelist.click();	
		switchToPopUpAndAccept(driver);
	}
	public void clickPTlinkRate() {
		ptlinkrate.click();	}
	
}