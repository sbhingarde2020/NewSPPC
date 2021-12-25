package com.spp.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreatePerodicIncMstrwithoutClubbInSalHead extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[7]/a")
	WebElement PeriodicIncentiveMaster;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[1]/span/a")
	WebElement AddPeriodicIncentive;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement Name;
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement UncheckClubInSal;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[6]/input")
	WebElement CreateButton;
	@FindBy(xpath="//strong[text()='Periodic Incentive successfully created ']")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[2]/table/tbody[2]/tr/td[1][contains(text(),'Periodic')]/parent::tr/td[4]/a[1]")
	List<WebElement> Delete;
	@FindBy(xpath="//*[@class=\"action-delete\"]")
	WebElement ClickDelete;
	@FindBy (xpath="//*[@id='standing_instr_list']/div[2]/table/tbody[2]/tr/td[contains(text(),'PerodicIncentiveMaster')]/parent::tr/td[2]")
	WebElement CheckIfNo;
	
	public CreatePerodicIncMstrwithoutClubbInSalHead(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigatemasterlink() throws Exception{
		masterlink.click();
	}
	
	public void clickPeriodicIncentiveMaster() throws Exception{
		PeriodicIncentiveMaster.click();
	}
	public void clickAddPeriodicIncentive() throws Exception{
		AddPeriodicIncentive.click();
	}
	public void uncheckclubinsal() {
		UncheckClubInSal.click();
	}
	
	public void clickCreateButton() throws Exception{
		CreateButton.click();
	}
	public void clickName(String value) throws Exception{
		Name.sendKeys(value);
	
   }
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickDelete1() throws Exception{
		Delete.get(0).click();
		switchToPopUpAndAccept(driver);
	}
	public void clickdelete() {
		ClickDelete.click();
	}
	public String PeriodicCheckNo(){
		return CheckIfNo.getText();
	}

}
