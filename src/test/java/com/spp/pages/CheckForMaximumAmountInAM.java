package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckForMaximumAmountInAM extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[3]/a")
	WebElement AdvanceMaster;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[2]/table/tbody/tr/td[contains(text(),'Advance_Master')]/parent::tr/td[4]/a")
	WebElement Edit;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[2]/table/tbody/tr/td[contains(text(),'Advance_Master')]/parent::tr/td[1]")
	WebElement SelectedAdvanceMaster;
	@FindBy(id="standing_instruction_master_max_amount")
	WebElement MaxAmount;
	@FindBy(xpath="//*[@id='standing_instruction_master_form']/div[8]/input")
	WebElement UpdateButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfulMessage;
	
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id='menu']/li[6]/div/div[1]/ul/li[7]/a")
	WebElement AdvanceDetailsLink;
	@FindBy(id="add_employees")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id='si_detail_employees']/tbody/tr[2]/td[contains(text(),'Tina')]/parent::tr/td[6]/a")
	WebElement ViewLink;
	@FindBy(xpath="//*[@id='standing_detail_list']/div[1]/span/a")
	WebElement AddNewAdvanceLink;
	
	@FindBy(id="standing_instruction_detail_standing_instruction_master_id")
	WebElement AdvanceName;
	@FindBy(id="standing_instruction_detail_actual_amount")
	WebElement Amount;
	@FindBy(id="sal_date")
	WebElement AdvanceDate;
	@FindBy(id="inst")
	WebElement NoOfInstallments;
	@FindBy(id="standing_instruction_detail_no_of_instalment")
	WebElement Installments;
	
	@FindBy(id="dpMonthYear")
	WebElement RecoveryDate;
	@FindBy(id="update_save")
	WebElement CreateAdvance;
	@FindBy(xpath="//*[@id=\"main\"]/section/p/a[2]")
	WebElement Previouslistpage;
	@FindBy(xpath="//*[@id='standing_detail_list']/div[2]/table/tbody/tr[1]/td[8]/a")
	WebElement deleteadvancedetails;
	
	
	public CheckForMaximumAmountInAM(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){

		masterLink.click();
	}

	public void clickAdvanceMaster(){
		AdvanceMaster.click();
	}
	public void clickEdit(){
		Edit.click();	
	}
	public String getAdvanceMaster() {
		return SelectedAdvanceMaster.getText();
	}
	
	public void clickMaxAmount(String value){
		MaxAmount.clear();
		MaxAmount.sendKeys(value);
	}

	public void clickUpdateButton(){
		UpdateButton.click();
	}	
    
    public String getMessage1() {
    	return successfulMessage.getText();
	}	
    public void clickSalary(){
		Salary.click();
	}
    public void clickAdvanceDetailsLink(){
    	AdvanceDetailsLink.click();
	}
    public void clickAddEmployee(){
    	AddEmployee.click();
	}
    public void clickLoad(){
		Load.click();
	}
    public void clickViewLink(){
    	ViewLink.click();
	}
    public void clickAddNewAdvanceLink(){
    	AddNewAdvanceLink.click();
	}
    public void clickAdvanceName(String value){
		dropDownSelect(AdvanceName,value);
	}
    public void clickAmount(String value){
		Amount.clear();
		Amount.sendKeys(value);
	}
    public void clickAdvanceDate(String value) throws InterruptedException{
		AdvanceDate.sendKeys(value);
		Thread.sleep(1000);
		AdvanceDate.sendKeys(Keys.TAB);
}
    public void clickRecoveryDate(String value) throws InterruptedException{
    	RecoveryDate.sendKeys(value);
		Thread.sleep(1000);
	  RecoveryDate.sendKeys(Keys.TAB);
}
    public void clickNoOfInstallments(){
    	NoOfInstallments.click();
	} 
    
    public void clickInstallments(String value){
		Installments.clear();
		Installments.sendKeys(value);
	}
   
    public void clickCreateAdvance(){

		CreateAdvance.click();
	}
    public String getAlertMessage1() {
    	return switchToPopUpAndgetText(driver);

}
    public void selectPreviouslistpage() {
    	Previouslistpage.click();
    }

	public void deleteadvancedetails(String advanceMaster) {
		// TODO Auto-generated method stub
		deleteadvancedetails.click();
	}
	public String getAlertMessage() {
    	return switchToPopUpAndgetText(driver);

}

}

	

