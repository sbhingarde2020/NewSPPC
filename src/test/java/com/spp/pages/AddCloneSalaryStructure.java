package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class AddCloneSalaryStructure extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Salary Structure']")
	WebElement salarystructurelink;
	@FindBy(xpath="//a[text()='Clone Salary Structure']")
	WebElement clonestructure;
	@FindBy(id="salary_group_salary_group_name")
	WebElement groupname;
	@FindBy(xpath="//select[@id='old_salary_structure']")
	WebElement cloneofDropdown;
	@FindBy(xpath="//option[text()='SALARYSTRUCTURE']")
	WebElement selectstructure;
	@FindBy(xpath="//input[@value='Create Salary Structure']")
	WebElement CreateSalaryStructureButton;
	@FindBy(xpath="//strong[text()='Salary Structure clone has been successfully created']")
	WebElement successfullMessage;
	
	public AddCloneSalaryStructure(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickSalaryStructureLink() throws Exception{
		salarystructurelink.click();
	}
	
	public void clickCloneSalaryStructure() throws Exception{
		clonestructure.click();
	}
	
	public void enterSalaryStructureName(String value) throws Exception{
		groupname.sendKeys(value);
	}
	
	public void clickCloneOfDropDown() throws Exception{
		cloneofDropdown.click();
	}
	
	public void selectCloneOfDropDown() throws Exception{
		selectstructure.click();
	}
	
	public void clickCreateSalaryStructure() throws Exception{
		CreateSalaryStructureButton.click();
	}

	public String getMessage(){
		return successfullMessage.getText();
	}
	//public void selectGrouping1(String value){
	//	dropDownSelect(GroupBy1, value);	
	//}
}