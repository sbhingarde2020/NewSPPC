package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckArrearsRedirectToMasterModule extends BasePage{
	
		@FindBy(id="salary")
		WebElement SalaryLink;
		@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[3]/a")
		WebElement Arrears;
		@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
		WebElement GeneralLink;
		@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-1\"]/li[2]/a")
		WebElement SalaryHead;
		
		@FindBy(xpath="//*[@id=\"main\"]/div[3]/span/a")
		WebElement AddNewSalaryHead;
		
		@FindBy(id="salary_head_head_name")
		WebElement HeadName;
		@FindBy(id="salary_head_short_name")
		WebElement ShortName;
		
		@FindBy(xpath="//*[@id=\"salary_head_form\"]/div[2]/input")
		WebElement CreateButton;
		
		@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
		WebElement SuccessfulMessage;
		
		@FindBy(xpath="//*[@id='earning_heads']/tbody/tr/td[contains(text(),'Work')]/parent::tr/td[5]/a[2]")
		WebElement ClickDelete;
		
			
		public CheckArrearsRedirectToMasterModule(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver,this);
		}
		public void clickSalaryLink(){
			SalaryLink.click();
		}
		public void selectArrears(){
			Arrears.click();
		}
		public void selectGeneralLink(){
			GeneralLink.click();
		}
		public void EnterSalaryHead(){
			SalaryHead.click();
		}
		public void ClickAddNewSalaryHead(){
			AddNewSalaryHead.click();
		}
		public void ClickCreateButton(){
			CreateButton.click();
		}
		public void EnterHeadName(String value){
			HeadName.sendKeys(value);
		}
		public void EnterShortName(String value){
			ShortName.sendKeys(value);
		}
		public String getMessage(){
			return SuccessfulMessage.getText();
		}
		public void ClickDelete() throws InterruptedException {
			ClickDelete.click();
			switchToPopUpAndAccept(driver);
		}
		
}
