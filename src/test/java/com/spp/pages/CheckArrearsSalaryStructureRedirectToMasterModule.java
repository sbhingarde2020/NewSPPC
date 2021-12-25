package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckArrearsSalaryStructureRedirectToMasterModule extends BasePage {
	@FindBy(id="salary")
	WebElement SalaryLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[3]/a")
	WebElement Arrears;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
	WebElement GeneralLink;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-1\"]/li[3]/a")
	WebElement SalaryStructure;
	
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/span/a")
	WebElement NewSalaryStructure;
	
	@FindBy(id="salary_group_salary_group_name")
	WebElement StructureName;
	
	
	@FindBy(xpath="//*[@id=\"salary_group\"]/div[3]/input")
	WebElement CreateButton;
	
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	
	@FindBy(xpath="//*[@id='main']/div[3]/table/tbody/tr/td[contains(text(),'Structure1')]/parent::tr/td[5]/a")
	WebElement ClickDelete;
		
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Salary Structure']")
	WebElement salarystructurelink;
	public CheckArrearsSalaryStructureRedirectToMasterModule(WebDriver driver) {
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
	public void EnterSalaryStructure(){
		SalaryStructure.click();
	}
	public void ClickNewSalaryStructure(){
		NewSalaryStructure.click();
	}
	
	
	public void EnterStructureName(String value){
		StructureName.sendKeys(value);
	}
	
	public void ClickCreateButton(){
		CreateButton.click();
	}
	public String getMessage(){
		return SuccessfulMessage.getText();
	}
	
	public void ClickDelete() throws InterruptedException {
		ClickDelete.click();
		Thread.sleep(2000);
		switchToPopUpAndAccept(driver);
	}
	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickSalaryStructureLink() throws Exception{
		salarystructurelink.click();
	}

}
