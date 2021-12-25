package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class EditSalaryStructure extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Salary Structure']")
	WebElement salarystructurelink;
	@FindBy(xpath="//*[@id='main']/div/table/tbody/tr/td[contains(text(),'SALARYSTRUCTURE')]/parent::tr/td[4]/a")
	WebElement editsalarystructure;
	@FindBy(id="salary_group_salary_group_name")
	WebElement structurename;
	@FindBy(id="salary_group_based_on_gross")
	WebElement basedongross;
	@FindBy(xpath="//input[@value='Update Salary Structure']")
	WebElement updatesalarystucturebutton;
	@FindBy(xpath="//strong[text()='Salary group succesfully updated']")
	WebElement successfullMessage;
	
	public EditSalaryStructure(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void clickSalaryStructureLink() throws Exception{
		salarystructurelink.click();
	}
	
	public void clickEditSalaryStructureLink() throws Exception{
		editsalarystructure.click();
	}
	
	public void enterSalaryStructureName(String value) throws Exception{
		structurename.clear();
		structurename.sendKeys(value);
	}
	
	public void clickBasedOnGross() throws Exception{
		basedongross.click();
	}
	
	public void clickUpdateSalaryStructureButton() throws Exception{
	  updatesalarystucturebutton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
	
}
