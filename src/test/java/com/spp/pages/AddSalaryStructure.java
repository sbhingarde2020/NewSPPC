package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class AddSalaryStructure extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Salary Structure']")
	WebElement salarystructurelink;
	@FindBy(xpath="//a[text()='Add New Salary Structure']")
	WebElement createsalarystructurelink;
	@FindBy(id="salary_group_salary_group_name")
	WebElement structurename;
	@FindBy(id="salary_group_based_on_gross")
	WebElement basedongross;
	@FindBy(xpath="//input[@value='Create Salary Structure']")
	WebElement createsalarystructurebutton;
	@FindBy(xpath="//strong[text()='Salary group successfully created']")
	WebElement successfullMessage;

	public AddSalaryStructure(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void clickSalaryStructureLink() throws Exception{
		salarystructurelink.click();
	}
	
	public void clickAddSalaryStructureLink() throws Exception{
		createsalarystructurelink.click();
	}
	
	public void enterSalaryStructureName(String value) throws Exception{
		structurename.sendKeys(value);
	}
	
	public void clickBasedOnGross() throws Exception{
		basedongross.click();
	}
	
	public void clickCreateButton() throws Exception{
		createsalarystructurebutton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}