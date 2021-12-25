package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateBonusDefinitionMaxBonusCalculateModeofPaymentDDPTonBonusRespectiveMonth extends BasePage{
	@FindBy(id="salary") 
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[11]/a")
	WebElement Bonus;
	@FindBy(xpath="//*[@id=\"bonus_definition_list\"]/div[1]/span/a")
	WebElement AddNewBonus;
	@FindBy(id="bonusHeadName")
	WebElement BonusHead;
	@FindBy(id="bonus_exgratia_definition_formula_id")
	WebElement SelectFormula;
	@FindBy(id="bonus_exgratia_definition_max_amount")
	WebElement MaxBonus;
	@FindBy(id="bonus_exgratia_definition_from_month")
	WebElement FromMonth;
	@FindBy(id="bonus_exgratia_definition_to_month")
	WebElement ToMonth;
	@FindBy(id="bonus_exgratia_definition_paymonth")
	WebElement Paymonth;
	@FindBy(id="bonus_exgratia_definition_mode_of_payment")
	WebElement SelectModeofPayment;
	@FindBy(id="bonus_exgratia_definition_min_working_days")
	WebElement EmployeeswithMinWorkingDays;
	@FindBy(id="bonus_exgratia_definition_salary_independent")
	WebElement CheckSalaryIndependent;
	@FindBy(id="bonus_exgratia_definition_calculate_on_percent")
	WebElement CheckCalculate;
	@FindBy(id="bonus_exgratia_definition_pt_on_bonus_exgratia")
	WebElement SelectPTOnBonus;
	@FindBy(id="bonus_exgratia_definition_pt_consider_month_current_month")
	WebElement SelectCurrentMonth;
	@FindBy(id="bonus_exgratia_definition_pt_consider_month_respective_month")
	WebElement SelectRespectiveMonth;
	@FindBy(id="bonus_exgratia_definition_round_off_nearest_rupee")
	WebElement CheckNearestrupee;
	@FindBy(id="create_heading_name")
	WebElement CreateBonus;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id='bonus_or_exgratia']/div/table/tbody/tr[1]/td[4]/a")
	WebElement DeleteButton;
	
	public CreateBonusDefinitionMaxBonusCalculateModeofPaymentDDPTonBonusRespectiveMonth(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSalary(){
		Salary.click();
	}
	
	public void selectBonus(){
		Bonus.click();
	}
	public void clickAddNewBonus(){
		AddNewBonus.click();
	}
	public void EnterBonusHead(String value){
		BonusHead.sendKeys(value);
	}
	public void selectformula(String value){
		dropDownSelect(SelectFormula, value);
	}
	public void EnterMaxBonus(String value){
		MaxBonus.sendKeys(value);
	}
	public void SelectFromMonth(String value){
		dropDownSelect(FromMonth, value);
	}

	public void SelectToMonth(String value){
		dropDownSelect(ToMonth, value);
	}

	public void SelectPaymonth(String value){
		dropDownSelect(Paymonth, value);
	}
	public void SelectModeofPayment(String value) {
		dropDownSelect(SelectModeofPayment, value);
	}
	public void consideremployeeswithMinWorkingdays() {
		EmployeeswithMinWorkingDays.click();
	}
	public void checksalaryindependent() {
		CheckSalaryIndependent.click();
	}
	public void checkcalculate() {
		CheckCalculate.click();
	}
	public void selectptonbonus() {
		SelectPTOnBonus.click();
	}
	public void selectcurrentmonth() {
		SelectCurrentMonth.click();
	}
	public void selectrespectivemonthandconsiderpreviousyear() {
		SelectRespectiveMonth.click();
	}
	public void checknearestrupee() {
		CheckNearestrupee.click();
	}
	public void clickCreateBonus(){
		CreateBonus.click();
	}
	public String getMessage(){
		return SuccessfulMessage.getText();
	}
	public void clickDeleteButton(){
		DeleteButton.click();
	}
}
