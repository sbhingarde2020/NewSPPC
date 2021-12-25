package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateEmployeeESIContributionApplicability extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement ClickOnEmployDetails;
	@FindBy(id="filter_head")
	WebElement ClickOnFilterHead;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"employees_dtable\"]/tbody/tr/td[contains(text(),'Anil')]/parent::tr/td[6]/a[1]")
	WebElement ClickonView;
	@FindBy(xpath="//*[@id=\"employee_esi_contribution_restrict\"]/a")
	WebElement ClickonESIContri;
	@FindBy(id="fr_date")
	WebElement EffectiveDate;
	@FindBy(xpath="//*[@id=\"employee_esi_contribution_restrict_form\"]/div[5]/input")
	WebElement CreateESI;
	@FindBy(xpath="//*[@id=\"esi_applicability_result_response\"]/div/strong")
	WebElement successfulmessage;
	
	
	
	
	public CreateEmployeeESIContributionApplicability(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonemployeedetails() {
		ClickOnEmployDetails.click();
	}
	public void clickonfilter() {
		ClickOnFilterHead.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonview() {
		ClickonView.click();
	}
	public void clickonESICon() {
		ClickonESIContri.click();
	}
	public void selecteffdate(String value) {
		EffectiveDate.sendKeys(value);
	}
	public void createesi() {
		CreateESI.click();
	}
	public String getMessage(){
		return successfulmessage.getText();
	}
	
	
}
