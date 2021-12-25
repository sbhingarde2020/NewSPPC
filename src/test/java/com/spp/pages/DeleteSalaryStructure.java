package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class DeleteSalaryStructure extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Salary Structure']")
	WebElement salarystructurelink;
	@FindBy(xpath="//*[@id=\"main\"]/div[4]/a[2]")
	WebElement NextPage;
	@FindBy(xpath="//*[@id='main']/div/table/tbody/tr/td[contains(text(),'SALARYSTRUCTURE')]/parent::tr/td[5]/a")
	WebElement deleteicon;
	@FindBy(xpath="//*[@id='main']/div/table/tbody/tr/td[contains(text(),'Clone')]/parent::tr/td[5]/a")
	WebElement deleteicon1;
	@FindBy(xpath="//strong[text()='Salary structure detail successfully destroyed']")
	WebElement successfullMessage;
    @FindBy(xpath="//*[@id='main']/div/table/tbody/tr/td[contains(text(),'SALARYSTRUCTURE')]/parent::tr/td[3]/a")
	WebElement settingslink;
	//@FindBy(xpath="//*[@id='main']/div[3]/table/tbody/tr[1]/td[7]/a")
    @FindBy(xpath="//*[@id='main']/div[3]/table/tbody/tr/td[7]/a")
	WebElement editbutton;
	@FindBy(xpath="//img[@title='Delete Salary Group']")
	WebElement deletebutton;
	@FindBy(id="salary_group_detail_calc_type")
	WebElement calculationtype;
	@FindBy(xpath="//input[@value='Update Salary Group Detail']")
	WebElement updatesalarygroupdetail;
	@FindBy(xpath="//*[@id='main']/section/p/a")
	WebElement structure;
	@FindBy(xpath="//*[@id='main']/div[2]/strong")
	WebElement SalaryGroupDeleted;
	public DeleteSalaryStructure(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	public void clickSalaryStructureLink() throws Exception{
		salarystructurelink.click();
	}
	public void clickDeleteSalaryStructure() throws Exception{
		deleteicon.click();
		switchToPopUpAndAccept(driver);
	}
	public void clickDeleteSalaryStructure1() throws Exception{
		deleteicon1.click();
		switchToPopUpAndAccept(driver);
	}
	public void selectNextPage() throws Exception{
		NextPage.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}
	public void clickSettingsLink() throws Exception{
		settingslink.click();
	}
	public void clickDeleteSalaryHead() throws Exception{
		deletebutton.click();
	    switchToPopUpAndAccept(driver);
	}
	public void clickEditIconLink()  {
	editbutton.click();
    }
	public void selectCalculationType(String value) throws Exception{
		dropDownSelect(calculationtype, value);
		//selectValue(calculationtype, value);
	}	
	public void clickUpdateSalaryGroupDetail() throws Exception{
		updatesalarygroupdetail.click(); }
	
	public void clickstructure()  {
		structure.click();
	    }
	public String salarygroupdelete(){
		return SalaryGroupDeleted.getText();
	}
}