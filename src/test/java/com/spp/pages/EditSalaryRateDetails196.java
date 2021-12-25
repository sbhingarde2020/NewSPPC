package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditSalaryRateDetails196 extends BasePage{
	public EditSalaryRateDetails196(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="emp_detail")
	WebElement employeeLink;	
	@FindBy(linkText="Salary Rate Details")
	WebElement SalaryRateDetails;
	@FindBy(id="filter_head")
	WebElement AdvancedFilterIcon;
	@FindBy(xpath="//*[@id='bf_form']/div[9]/button[1]")
	WebElement LoadButton;
	@FindBy(xpath="//*[@id=\"notalloted\"]/tbody/tr[2]/td[4]/a")
	WebElement AllotSalaryButton;
	@FindBy(id="month_year")
	WebElement EffectiveFrom;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/form/fieldset/div[1]/div/input[1]")
	WebElement GetRate;
	@FindBy(id="gross_sal_formula")
	WebElement GrossSal;
	@FindBy(xpath="//*[@id=\"sal_allotment\"]/table/tbody/tr[2]/td[4]/input")
	WebElement Basic;
	@FindBy(xpath="//*[@id=\"sal_allotment\"]/table/tbody/tr[4]/td[4]/input")
	WebElement Mess;
	
//	@FindBy(xpath="//*[@id=\"sal_allotment\"]/table/tbody/tr[7]/td/input")
//	WebElement PopulateButton;
	@FindBy(xpath="//*[@id=\"sal_allotment\"]/table/tbody/tr[4]/td/input[1]")
	WebElement SaveButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement successfullMessage;
	@FindBy(xpath="//span[contains(text(),'Listing Employee (Salary allotted)')]")
	WebElement SalaryAlloted;
	@FindBy(xpath="//*[@id=\"alloted\"]/tbody/tr[1]/td[4]/a")
	WebElement Edit;
	public void clickEmployeeLink() {
		   employeeLink.click();
	}
	public void selectSalaryRateDetails(){
		SalaryRateDetails.click();
	}
	public void selectAdvancedFilterIcon() {
		AdvancedFilterIcon.click();
	}
	public void selectLoadButton() {
		LoadButton.click();
	}
	public void selectAllotSalaryButton() {
		AllotSalaryButton.click();
	}
	public void selectEffectiveFrom(String value){
		dropDownSelect(EffectiveFrom, value);
	}

	public void selectGetRate() {
		GetRate.click();
	}

	 public void enterGrossSal(String value) {
		 GrossSal.clear();
		 GrossSal.sendKeys(value);
	}

	public void enterBasic(String value) throws Exception {
		Basic.sendKeys(value);
	}
	public void enterMess(String value) {
	Mess.sendKeys(value);
	}
	//public void selectPopulateButton() {
//		PopulateButton.click();
	//}
	public void SelectSaveButton() {
		SaveButton.click();
	}

	public String getMessage(){
		return successfullMessage.getText();
	}
	public void ClickSalaryAlloted() {
	    SalaryAlloted.click();
	}
	public void ClickEdit() {
		Edit.click();
	}

}
