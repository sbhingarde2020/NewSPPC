package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddNewPeriodicIncentivePFMonthly extends BasePage{
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(linkText="Periodic Incentive Detail")
	WebElement PeriodicIncentiveDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[1]/td[6]/a")
	WebElement View;
	@FindBy(linkText="Add New Periodic Incentive Detail")
	WebElement AddPeriodicIncentive;
	@FindBy(id="standing_instruction_detail_standing_instruction_master_id")
	WebElement PeriodicIncentiveName;
	@FindBy(id="standing_instruction_detail_actual_amount")
	WebElement Amount ;
	@FindBy(id="dpMonthYear1")
	WebElement StartMonth;
	@FindBy(id="dpMonthYear")
	WebElement EndMonth;
	@FindBy(id="standing_instruction_detail_pf")
	WebElement PF;
	@FindBy(id="standing_instruction_detail_pt")
	WebElement PT;
	@FindBy(id="standing_instruction_detail_esi")
	WebElement ESI;
	@FindBy(id="p_payment_1")
	WebElement Monthly;
	@FindBy(id="update_save")
	WebElement CreateButton;	
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr[1]/td[8]/a")
	WebElement DeleteButton;
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[7]/a")
	WebElement PeriodicIncentiveMaster;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[1]/span/a")
	WebElement AddPeriodicIncentiveMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement Name;
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement UncheckClubInSal;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[6]/input")
	WebElement CreateButtonMaster;
	public AddNewPeriodicIncentivePFMonthly(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickPeriodicIncentiveDetails() throws Exception{
		PeriodicIncentiveDetails.click();
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
	public void clickAddPeriodicIncentive() throws Exception{
		AddPeriodicIncentive.click();
	}
	public void clickPeriodicIncentiveName(String value) throws Exception{
		dropDownSelect(PeriodicIncentiveName,value);
		
	}
	public void clickAmount(String value) throws Exception{
			Amount.sendKeys(value);
	}
	
	public void clickStartMonth(String value) throws Exception{
		StartMonth.sendKeys(value);
	}
	public void clickEndMonth(String value) throws Exception{
		EndMonth.sendKeys(value);
	}
	public void clickPF() throws Exception{
		PF.click();
	}
	public void clickPT() throws Exception{
		PT.click();
	}
	public void clickESI() throws Exception{
		ESI.click();
	}
	public void clickMonthly() throws Exception{
		Monthly.click();
	}
	public void clickCreateButton() throws Exception{
		CreateButton.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		Thread.sleep(2000);
		switchToPopUpAndAccept(driver);
	}
	public void navigatemasterlink() throws Exception{
		masterlink.click();
	}
	
	public void clickPeriodicIncentiveMaster() throws Exception{
		PeriodicIncentiveMaster.click();
	}
	public void clickAddPeriodicIncentiveMaster() throws Exception{
		AddPeriodicIncentiveMaster.click();
	}
	public void uncheckclubinsal() {
		UncheckClubInSal.click();
	}
	
	public void clickCreatePeriodicIncentiveMaster() throws Exception{
		CreateButtonMaster.click();
	}
	public void clickName(String value) throws Exception{
		Name.sendKeys(value);
	
   }
}
