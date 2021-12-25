package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateAdvanceDetailLumpsumNoRecovery extends BasePage{
	
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[3]/a")
	WebElement AdvanceMaster;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[1]/span/a")
	WebElement AddNewAdvanceMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement EnterAdvanceName;
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement ClubbedinSalaryBox;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[8]/input")
	WebElement CreateAdvanceButton;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[2]/table/tbody/tr/td[contains(text(),'Advance_Master')]/parent::tr/td[5]/a")
	WebElement DeleteAdvancebutton;
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[6]/a")
	WebElement AdvanceDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[1]/td[6]/a")
	WebElement View;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[1]/span/a")
	WebElement AddNewAdvanceDetails;
	@FindBy(id="standing_instruction_detail_standing_instruction_master_id")
	WebElement AdvanceName;
	@FindBy(id="standing_instruction_detail_actual_amount")
	WebElement Amount;
	@FindBy(id="standing_instruction_detail_lumpsum_amount")
	WebElement InstallmentAmount;
	@FindBy(id="sal_date")
	WebElement AdvanceDate;
	@FindBy(id="standing_instruction_detail_no_of_instalment")
	WebElement NoInstallment;
	@FindBy(id="dpMonthYear")
	WebElement RecoverFrom;
	@FindBy(id="standing_instruction_detail_no_recovery")
	WebElement NoRecovery;
	@FindBy(id="update_save")
	WebElement CreateButton;
	
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr[1]/td[8]/a")
	WebElement DeleteButton;
	public CreateAdvanceDetailLumpsumNoRecovery(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickMastserLink(){

		masterLink.click();
	}

	public void clickAdvanceMaster(){
		AdvanceMaster.click();
	}
	public void clickAddNewAdvanceMaster(){
		AddNewAdvanceMaster.click();	
	}
	public void enterAdvanceName(String value){
		EnterAdvanceName.sendKeys(value);
	}

	public void clickClubbedinSalaryBox(){
		ClubbedinSalaryBox.click();
	}	

    public void clickCreateAdvanceButton(){
	    CreateAdvanceButton.click();
    }	
    public void clickDeleteAdvanceButton() {
    	DeleteAdvancebutton.click();
    }
    
    
	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickAdvanceDetails() throws Exception{
		AdvanceDetails.click();
	}
	public void clickAddEmployee() throws Exception{
		AddEmployee.click();	
	}
	public void clickLoad() throws Exception{
		Load.click();
	}
	public void clickView() throws Exception{
		View.click();
	}
	public void AddNewAdvanceDetails() throws Exception{
		AddNewAdvanceDetails.click();
	}
	public void clickAdvanceName(String value) throws Exception{
		dropDownSelect(AdvanceName,value);
		
	}
	public void clickAmount(String value) throws Exception{
			Amount.sendKeys(value);
	}
	public void clickInstallmentAmount(String value) throws Exception{
		InstallmentAmount.clear();
		InstallmentAmount.sendKeys(value);
	}
	public void clickSAdvanceDate(String value) throws Exception{
		AdvanceDate.sendKeys(value);
		AdvanceDate.sendKeys(Keys.TAB);
	}
	public void clickNoInstallment(String value) throws Exception{
		NoInstallment.sendKeys(value);
	}
	public void clickRecoverFrom(String value) throws Exception{
		RecoverFrom.sendKeys(value);
	}
	public void clickNoRecovery() throws Exception{
		NoRecovery.click();
	}
		public void clickCreateButton() throws Exception{
		CreateButton.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
}
