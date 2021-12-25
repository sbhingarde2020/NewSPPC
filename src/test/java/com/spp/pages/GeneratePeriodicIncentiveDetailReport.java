package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class GeneratePeriodicIncentiveDetailReport extends BasePage{
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[5]/a")
	WebElement PeriodicIncentiveDetails;
	@FindBy(xpath="//*[@id=\"menu\"]/li[8]/a")
	WebElement Report;
	@FindBy(xpath="//*[@id=\"menu\"]/li[8]/div/div[3]/ul/li[7]/a")
	WebElement StandingInstructionDetailReport;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[1]/td[6]/a")
	WebElement SIType;
	@FindBy(id="report_type")
	WebElement Reports;
	@FindBy(id="si_from_month")
	WebElement From;
	@FindBy(id="si_to_month")
	WebElement To;
	@FindBy(id="dpMonthYear1")
	WebElement StartMonth;
	@FindBy(id="dpMonthYear")
	WebElement EndMonth;
	@FindBy(id="standing_instruction_detail_actual_amount")
	WebElement Amount;
	@FindBy(id="standing_instruction_detail_financial_institution_id")
	WebElement InstitutionName;
	@FindBy(id="standing_instruction_detail_remarks")
	WebElement Remark;
	@FindBy(xpath="//*[@id=\"new_standing_instruction_detail\"]/div[4]/table/tbody/tr/td[2]/label/input")
	WebElement Monthly;
	@FindBy(id="update_save")
	WebElement CreateButton;	
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr/td[2][contains(text(),'Periodic_12')]/parent::tr/td[8]/a")
	WebElement DeleteButton;
	public GeneratePeriodicIncentiveDetailReport(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickPeriodicIncentiveDetails() throws Exception{
		PeriodicIncentiveDetails.click();
	}
	public void clickReport() throws Exception{
		Report.click();
	}
	public void clickStandingInstructionDetailReport() throws Exception{
		StandingInstructionDetailReport.click();
	}
	public void clickSIType(String value) throws Exception{
		dropDownSelect(SIType,value);
	}
	public void clickReports(String value) throws Exception{
		dropDownSelect(Reports,value);
	}
	public void clickFrom(String value) throws Exception{
		dropDownSelect(From,value);
		
	}
/*	public void clickTo(String value) throws Exception{
			dropDownSelect(To,value);
	}
	
	public void clickGroupBy(String value) throws Exception{
		dropDownSelect(GroupBy,value);
   }
	public void clickTo(String value) throws Exception{
		dropDownSelect(To,value);
   }*/
	public void clickAmount(String value) throws Exception{
		Amount.sendKeys(value);
	}
	public void selectInstitutionName(String value){
		dropDownSelect(InstitutionName, value);
	}
	public void clickRemark(String value) throws Exception{
		Remark.sendKeys(value);
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
		switchToPopUpAndAccept(driver);
	}


}
