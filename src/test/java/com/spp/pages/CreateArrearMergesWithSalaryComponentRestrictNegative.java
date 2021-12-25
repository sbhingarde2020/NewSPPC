package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateArrearMergesWithSalaryComponentRestrictNegative extends BasePage{
	@FindBy(id="salary") 
	WebElement SalaryLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[3]/a")
	WebElement Arrears;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/span/a[2]")
	WebElement CreateArrear;
	@FindBy(id="arrear_arrear_name")
	WebElement ArrearName;
	@FindBy(id="arrear_arrear_description")
	WebElement ArrearDescription;
	@FindBy(xpath="//*[@id=\"tabs-3\"]/div/table/tbody/tr[2]/td/fieldset/table/tbody/tr/td[1]/table/tbody/tr/td[1]/input")
	WebElement AutomationCheckBox;
	@FindBy(id="arrear_days")
	WebElement Number;
	@FindBy(id="dummy_difference")
	WebElement Difference;
	@FindBy(id="arrear_arrear_from_month")
	WebElement ArrearFrom;
	@FindBy(id="to_month")
	WebElement ArrearTo;
	@FindBy(id="ref_month")
	WebElement RefMonth;
	@FindBy(id="arrear_arrear_paymonth")
	WebElement Paymonth;
	@FindBy(id="arrear_salary_component_0")
	WebElement MergedWithSalary;
	@FindBy(id="arrear_restrict_negative")
	WebElement RestrictNegative;
	@FindBy(xpath="//*[@id=\"new_arrear\"]/div[3]/nav/ul/li[2]/a/span")
	WebElement AdvancedSettingsTab;
	@FindBy(id="arrear_pf")
	WebElement Statutory;
	@FindBy(xpath="//*[@id=\"new_arrear\"]/div[4]/div[2]/input")
	WebElement CreateButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/table/tbody/tr[1]/td[6]/a")
	WebElement DeleteButton;
	
//@FindBy(xpath="//*[@id=\"main\"]/div[2]/table/tbody/tr/td[1][contains(text(),'new')]/parent::tr/td[6]/a/img")
//List<WebElement> xyz;
	
public CreateArrearMergesWithSalaryComponentRestrictNegative(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSalaryLink(){
		SalaryLink.click();
	}
	
	public void selectArrears(){
		Arrears.click();
	}
	public void selectCreateArrear(){
		CreateArrear.click();
	}
	public void EnterArrearName(String value){
		ArrearName.sendKeys(value);
	}
	public void EnterArrearDescription(String value){
		ArrearDescription.sendKeys(value);
	}

	public void ClickAutomationCheckBox(){
		AutomationCheckBox.click();
	}
	
	public void ClickNumber(String value){
		Number.sendKeys(value);
	}
	public void ClickDifference(){
		Difference.click();
	}
	public void selectArrearFrom(String value){
		dropDownSelect(ArrearFrom, value);
	}
	public void selectArrearTo(String value){
		dropDownSelect(ArrearTo, value);
	}
	public void selectRefMonth(String value){
		dropDownSelect(RefMonth, value);
	}
	public void selectPaymonth(String value){
		dropDownSelect(Paymonth, value);
	}
	public void ClickRestrictNegative(){
		RestrictNegative.click();
	}
	public void ClickMergedWithSalary(){
		MergedWithSalary.click();
	}
	

	public void ClickAdvancedSettingsTab(){
		AdvancedSettingsTab.click();
	}

	public void ClickStatutory(){
		Statutory.click();
	}
	public void ClickCreateButton(){
		CreateButton.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}

	
	public void selectDeleteButton() throws InterruptedException{
	    DeleteButton.click();
	    Thread.sleep(2000);
	    switchToPopUpAndAccept(driver);

	}
}
