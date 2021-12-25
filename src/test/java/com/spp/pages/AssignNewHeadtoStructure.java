package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AssignNewHeadtoStructure extends BasePage{
	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[2]/a")
	WebElement ClickOnSalaryStructure;
	@FindBy(xpath="//*[@id='main']/div[3]/table/tbody/tr/td[contains(text(),'Gross_Structure')]/parent::tr/td[3]/a")
	WebElement ClickOnsettings;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/span/a")
	WebElement AssignNewHead;
	@FindBy(id="salary_group_detail_salary_head_id")
	WebElement SelectSalaryHead;
	@FindBy(id="salary_group_detail_calc_type")
	WebElement SelectCalculationType;
	@FindBy(id="salary_group_detail_based_on")
	WebElement SelectBasedOn;
	@FindBy(id="salary_group_detail_pf_applicability")
	WebElement CheckPF;
	@FindBy(id="salary_group_detail_esi_applicability")
	WebElement CheckESI;
	@FindBy(id="dpMonthYear")
	WebElement SelectEffFrom;
	@FindBy(id="salary_group_detail_round_off")
	WebElement SelectRoundOff;
	@FindBy(xpath="//input[@value='Create Salary Group Detail']")
	WebElement CreateSalaryGrpdetail;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullmessage;
	
	
	
	public AssignNewHeadtoStructure(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);	
		}
	public void clickonmaster() {
		ClickOnMaster.click();
	}
	public void clickonsalarystructure() {
		ClickOnSalaryStructure.click();
	}
	public void clickonsettings() {
		ClickOnsettings.click();
	}
	public void assignnewhead() {
		AssignNewHead.click();
	}
	public void selectsalhead(String value) {
		dropDownSelect(SelectSalaryHead, value);
	}
	public void selectcalculationtype(String value) {
		dropDownSelect(SelectCalculationType, value);
	}
	public void selectbasedon(String value) {
		dropDownSelect(SelectBasedOn, value);
	}
	public void checkpf() {
		CheckPF.click();
	}
	public void checkesi() {
		CheckESI.click();
	}
	public void selectefffrommonth(String value) {
		SelectEffFrom.sendKeys(value);
		SelectEffFrom.sendKeys(Keys.TAB);
	}
	public void selectroundoff(String value) {
		dropDownSelect(SelectRoundOff, value);
	}
	public void createsalarygrpdetail() {
		CreateSalaryGrpdetail.click();
	}
	public String getMessage(){
		return successfullmessage.getText();
	}	
}