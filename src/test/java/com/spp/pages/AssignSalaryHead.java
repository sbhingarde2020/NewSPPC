package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class AssignSalaryHead extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Salary Structure']")
	WebElement salarystructurelink;
	@FindBy(xpath="//*[@id='main']/div/table/tbody/tr/td[contains(text(),'SALARYSTRUCTURE')]/parent::tr/td[3]/a")
	WebElement settingslink;
	@FindBy(xpath="//a[text()='Assign New Head to Structure']")
	WebElement assignedheadlink;
	@FindBy(id="salary_group_detail_salary_head_id")
	WebElement slaryheaddropdown;
	@FindBy(id="salary_group_detail_calc_type")
	WebElement calculationtype;
	@FindBy(id="salary_group_detail_formula_id")
	WebElement formula;
	@FindBy(id="salary_group_detail_based_on")
	WebElement basedon;
	@FindBy(id="dpMonthYear")
	WebElement effectivedate;
	@FindBy(id="salary_group_detail_round_off")
	WebElement roundoff;
	@FindBy(id="salary_group_detail_pf_applicability")
	WebElement pfapplicability;
	@FindBy(id="salary_group_detail_esi_applicability")
	WebElement esiapplicability;
	@FindBy(xpath="//input[@value='Create Salary Group Detail']")
	WebElement createslarygroup;
	@FindBy(xpath="//strong[text()='Salary structure detail successfully created']")
	WebElement successfullMessage;

	public AssignSalaryHead(WebDriver driver){
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

	public void clickAssignedHeadLink() throws Exception{
		assignedheadlink.click();
	}

	public void selectSalaryHead(String value) throws Exception{
	    dropDownSelect(slaryheaddropdown, value);
	}

	public void selectCalculationType(String value) throws Exception{
		dropDownSelect(calculationtype, value);
	}

	public void selectFormula(String value) throws Exception{
		dropDownSelect(formula, value);
	}

	public void selectBasedOn(String value) throws Exception{
		selectValue(basedon, value);
	}

	public void enterEffectiveDate(String value) throws Exception{
		effectivedate.sendKeys(value);
	}

	public void selectRoundOff(String value) throws Exception{
		roundoff.sendKeys(value);
	}

	public void clickPFApplicabilty() throws Exception{
		pfapplicability.click();
	}

	public void clickESIApplicabilty() throws Exception{
		esiapplicability.click();
	}
	
	public void clickCreateSalaryGroupDetailButton() throws Exception{
		createslarygroup.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
