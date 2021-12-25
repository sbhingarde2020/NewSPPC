package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class BulkIncrementUpdate extends BasePage {

	public BulkIncrementUpdate(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="emp_detail")
	WebElement employeeLink;	
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[6]/a")
	WebElement BulkIncrementDetails;
	@FindBy(id="month_year")
	WebElement PayMonth;
	@FindBy(xpath="//*[@id='dt_bulk_increment']/tbody/tr[1]/td[1]/input")
	WebElement AshishCheckbox;
	@FindBy(xpath="//*[@id='dt_bulk_increment']/tbody/tr[2]/td[1]/input")
	WebElement AnilCheckbox;
	@FindBy(id="bi_salary_group")
	WebElement SalaryStructure;
	@FindBy(id="bi_salary_head_id")
	WebElement SalaryHead;
	@FindBy(id="get_increment_values")
	WebElement GetValues;
	@FindBy(xpath="//*[@id='bf_form']/div[10]/button[1]")
	WebElement Load;
	@FindBy(id="amount")
	WebElement ByAmount;
	@FindBy(xpath="//*[@id=\"Increment_content\"]/fieldset/table/tbody/tr/td[4]/div/div/button")
	WebElement IncrementButton;
	@FindBy(xpath="//*[@id=\"table_wrappper\"]/div[2]/input")
	WebElement SaveValues;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement successfullMessage;
	
	public void clickEmployeeLink() {
		   employeeLink.click();
	}
	public void selectBulkIncrementDetails(){
		BulkIncrementDetails.click();
	}
	public void selectPayMonth(String value){
		dropDownSelect(PayMonth, value);
	}
	public void selectSalaryStructure(String value){
		dropDownSelect(SalaryStructure, value);
	}
	public void selectSalaryHead(String value){
		dropDownSelect(SalaryHead, value);
	}
	public void selectGetValues(){
		GetValues.click();
	}
	public void selectLoad(){
		Load.click();
	}
	public void uncheckCheckbox() throws InterruptedException{
		AshishCheckbox.click();
		Thread.sleep(2000);
		AnilCheckbox.click();
		Thread.sleep(2000);
	}
	public void enterByAmount(String value) throws Exception {
		ByAmount.sendKeys(value);
    }
	public void selectIncrementButton(){
		IncrementButton.click();
	}
	public void selectSaveValues(){
		SaveValues.click();
    }
	public String getMessage(){
		return successfullMessage.getText();
   	}

}