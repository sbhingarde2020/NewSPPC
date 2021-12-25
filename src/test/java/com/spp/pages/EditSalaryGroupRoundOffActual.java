package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditSalaryGroupRoundOffActual extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Salary Structure']")
	WebElement salarystructurelink;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/table/tbody/tr[2]/td[3]/a")
	WebElement settingslink;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/table/tbody/tr/td[7]/a")
	WebElement editlink;
	@FindBy(id="salary_group_detail_calc_type")
	WebElement calculationtype;
	@FindBy(id="salary_group_detail_based_on")
	WebElement basedon;
	@FindBy(id="salary_group_detail_round_off")
	WebElement roundoff;
	@FindBy(id="salary_group_detail_pf_applicability")
	WebElement pfapplicability;
	@FindBy(id="salary_group_detail_esi_applicability")
	WebElement esiapplicability;
	@FindBy(xpath="//input[@value='Update Salary Group Detail']")
	WebElement updatesalarygroupdetail;
	@FindBy(xpath="//strong[text()='Salary structure detail succesfully updated']")
	WebElement successfullMessage;
	
	public EditSalaryGroupRoundOffActual(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickSalaryStructureLink() throws Exception{
		salarystructurelink.click();
	}

	public void clickSettingsLink() throws Exception{
		settingslink.click();
	}
	
	public void clickEditLink() throws Exception{
		editlink.click();
	}
	
	public void selectCalculationType(String value) throws Exception{
		selectValue(calculationtype, value);
	}
 
	public void selectBasedOn(String value) throws Exception{
		selectValue(basedon, value);
	}
	
	public void selectRoundOff(String value) throws Exception{
		selectValue(roundoff, value);
	}

	public void clickPFApplicabilty() throws Exception{
		pfapplicability.click();
	}

	public void clickESIApplicabilty() throws Exception{
		esiapplicability.click();
	}
	
	public void clickUpdateSalaryGroupDetail() throws Exception{
		updatesalarygroupdetail.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
