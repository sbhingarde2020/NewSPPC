package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckAdvanceDetailsRedirectsToMaster extends BasePage{
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[6]/a")
	WebElement AdvanceDetails;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
	WebElement GeneralLink;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-1\"]/li[1]/a")
	WebElement AdvanceDetail;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[1]/span/a")
	WebElement AddNewAdvanceMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement AdvanceName;
	@FindBy(id="standing_instruction_master_max_amount")
	WebElement MaxAmount;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[8]/input")
	WebElement CreateButton;
	@FindBy(xpath="//*[@id='main']/div[2]/strong")
	WebElement successfulMessage;
	
	public CheckAdvanceDetailsRedirectsToMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickAdvanceDetails() throws Exception{
		AdvanceDetails.click();
	}
	public void clickGeneralLink() throws Exception{
		GeneralLink.click();	
	}
	public void clickAdvanceDetail() throws Exception{
		AdvanceDetail.click();
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
    
    public String getMessage() {
    	return successfulMessage.getText();
}
}
