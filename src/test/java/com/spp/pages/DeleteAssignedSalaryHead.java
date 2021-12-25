package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class DeleteAssignedSalaryHead extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Salary Structure']")
	WebElement salarystructurelink;
	@FindBy(xpath="//*[@id='main']/div/table/tbody/tr/td[contains(text(),'Clone')]/parent::tr/td[3]/a")
	WebElement settingslink;
	@FindBy(xpath="//img[@title='Delete Salary Group']")
	WebElement deletebutton;
	@FindBy(xpath="//*[@id='main']/div[2]/li")
	WebElement SalaryHeadcanbeDeleted;
	@FindBy(xpath="//strong[text()='Salary structure detail successfully destroyed']")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id='main']/div[4]/table/tbody/tr[1]/td[7]/a")
	WebElement editbutton;
	@FindBy(id="salary_group_detail_calc_type")
	WebElement calculationtype;
	@FindBy(xpath="//input[@value='Update Salary Group Detail']")
	WebElement updatesalarygroupdetail;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SalaryHeadUpdated;
	@FindBy(xpath="//*[@id='main']/div[3]/table/tbody/tr/td[7]/a")
	WebElement EditAddGroup;
	@FindBy(xpath="//*[@value=\"Update Salary Group Detail\"]")
	WebElement UpdateGroup;
	public DeleteAssignedSalaryHead(WebDriver driver){
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
	
	public void edittoaddgroup() throws Exception {
		EditAddGroup.click();
	}
	public void updatesalarygroup() throws Exception {
		UpdateGroup.click();
	}
	
	public void clickDeleteSalaryHead() throws Exception{
		deletebutton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}

	public void clickEditIconLink()  {
	editbutton.click();
    }
	public void selectCalculationType(String value) throws Exception{
		 dropDownSelect(calculationtype, value);
	}	
	public void clickUpdateSalaryGroupDetail() throws Exception{
		updatesalarygroupdetail.click();
	}
	public String salaryheadcantbedeleted() {
		return SalaryHeadcanbeDeleted.getText();
	}
	public String salaryheadupdated() {
		return SalaryHeadUpdated.getText();
	}
}
