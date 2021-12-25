package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifSalaryAdvanceGeneralLinksAdvanceMasterredirectstoMaster extends BasePage{
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//a[text()='Advance Detail']")
	WebElement ClickOnAdvanceDetail;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
	WebElement ClickonGeneralLinks;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-1\"]/li[1]/a")
	WebElement ClickOnAdvanceMaster;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[1]/span/a")
	WebElement AddNewAdvanceMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement AdvanceName;
	@FindBy(id="standing_instruction_master_max_amount")
	WebElement MaxAmount;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[8]/input")
	WebElement CreateButton;
	@FindBy(xpath="//strong[text()='Advance successfully created ']")
	WebElement successfulMessage;
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement ClubbedInSal;
	
	public CheckifSalaryAdvanceGeneralLinksAdvanceMasterredirectstoMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void navigatesalary() throws Exception{
		ClickOnSalary.click();
	}
	
	public void clickAdvanceDetails() throws Exception{
		ClickOnAdvanceDetail.click();
	}
	public void clickGeneralLink() throws Exception{
		ClickonGeneralLinks.click();	
	}
	public void clickonadvancemaster() {
		ClickOnAdvanceMaster.click();
	}
	public void clickAddNewAdvanceMaster(){
		AddNewAdvanceMaster.click();	
	}
	public void clickAdvanceName(String value){
		AdvanceName.sendKeys(value);
	}

	public void ClickMaxAmount(String value){
		MaxAmount.sendKeys(value);
	}	

    public void clickCreateButton(){
	    CreateButton.click();
    }	
    public void uncheckclubbedinsal() {
    	ClubbedInSal.click();
    }
    public String getMessage() {
    	return successfulMessage.getText();
}

}
