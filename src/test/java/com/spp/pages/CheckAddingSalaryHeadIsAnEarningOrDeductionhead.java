package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckAddingSalaryHeadIsAnEarningOrDeductionhead extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Salary Heads']")
	WebElement salaryheads;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/span/a")
	WebElement AddNewSalaryHead1;
	@FindBy(xpath="//*[@id=\"main\"]/div[4]/span/a")
	WebElement AddNewSalaryHead2;
	@FindBy(id="salary_head_head_name")
	WebElement HeadName;
	@FindBy(id="salary_head_short_name")
	WebElement ShortName;
	@FindBy(id="salary_head_salary_type_earnings")
	WebElement Earnings;
	@FindBy(xpath="//input[@value='Create Salary Head']")
	WebElement createSalaryHeadButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement SuccessfulMessage;
	@FindBy(id="salary_head_salary_type_deductions")
	WebElement DeductionBox;
	@FindBy(xpath="//span[contains(text(),'Deduction')]/parent::a")
	WebElement DeductionTab;
	@FindBy(xpath="//*[@id=\"earning_heads\"]/tbody/tr/td[1][contains(text(),'head')]/parent::tr/td[5]/a[2]")
	WebElement DeleteButton1;
	@FindBy(xpath="//*[@id=\"deduction_heads\"]/tbody/tr/td[1][contains(text(),'Cab')]/parent::tr/td[5]/a[2]")
	WebElement DeleteButton2;
	
	
	
	
	public CheckAddingSalaryHeadIsAnEarningOrDeductionhead(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickSalaryHeads() throws Exception{
		salaryheads.click();
	}

	public void clickAddNewSalaryHead1() throws Exception{
		AddNewSalaryHead1.click();
	}
	public void clickAddNewSalaryHead2() throws Exception{
		AddNewSalaryHead2.click();
	}
	public void clickHeadName(String value) throws Exception{
		HeadName.sendKeys(value);
	}
	public void clickShortName(String value) throws Exception{
		ShortName.sendKeys(value);
	}
	public void clickEarnings() throws Exception{
		Earnings.click();
	}
	public void clickcreateSalaryHeadButton() throws Exception{
		createSalaryHeadButton.click();
	}
	
	public String getMessage() throws Exception{
		return SuccessfulMessage.getText();
	}
	
	public void clickDeductionBox() throws Exception{
		DeductionBox.click();
	}
	public void clickDeductionTab() throws Exception{
		DeductionTab.click();
	}
	
	public void clickDeleteButton1() throws Exception{
		DeleteButton1.click();
		switchToPopUpAndAccept(driver);
	}
	public void clickDeleteButton2() throws Exception{
		DeleteButton2.click();
		switchToPopUpAndAccept(driver);
	}
}
