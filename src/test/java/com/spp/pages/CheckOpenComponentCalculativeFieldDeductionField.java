package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckOpenComponentCalculativeFieldDeductionField extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Salary Heads']")
	WebElement salaryheads;
	@FindBy(xpath="//*[@id='main']/div[5]/nav/ul/li[2]/a/span")
	WebElement ClickOnDeductionTab;
	@FindBy(xpath="//*[@id='main']/div[5]/nav/ul/li[2]/a/span")
	WebElement ClickOnDeductionTab1;
	@FindBy(xpath="//*[@id='deduction_heads']/tbody/tr/td[contains(text(),'Deduction1')]/parent::tr/td/a[text()='Edit']")
	WebElement Edit;
	@FindBy(id="salary_head_open_component")
	WebElement OpenComponent;
	@FindBy(id="salary_head_calculative_field")
	WebElement CalculativeField;
	@FindBy(xpath="//input[@value='Update Salary Head']")
	WebElement UpdateSalaryHeadButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement SuccessfulMesssage;
	@FindBy(xpath="//*[@id='deduction_heads']/tbody/tr/td[normalize-space()='Deduction1']/parent::tr/td[3]")
	WebElement CheckYesNo;
	@FindBy(xpath="//*[@id='deduction_heads']/tbody/tr/td[normalize-space()='Deduction1']/parent::tr/td[4]")
	WebElement CheckYesNo1;
	@FindBy(xpath="//*[@id='earning_heads']/tbody/tr/td[contains(text(),'EA1')]/parent::tr/td/a[text()='Delete']")
	WebElement DeleteEarningHead;
	@FindBy(xpath="//*[@id='deduction_heads']/tbody/tr/td[contains(text(),'DE1')]/parent::tr/td/a[text()='Delete']")
	WebElement DeleteDeductionHead;
	
	public CheckOpenComponentCalculativeFieldDeductionField(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	public void clickSalaryHeads() throws Exception{
		salaryheads.click();
	}
	public void clickOnDeductionTab() {
		ClickOnDeductionTab.click();
	}
	public void clickOnDeductionTab1() {
		ClickOnDeductionTab1.click();
	}
	public void clickEdit() throws Exception{
		Edit.click();
	}
	public void clickOpenComponent() throws Exception{
		OpenComponent.click();
	}
	public void clickCalculativeField() throws Exception{
		CalculativeField.click();
	}
	public void clickUpdateSalaryHeadButton() throws Exception{
		UpdateSalaryHeadButton.click();
	}
	public String getMessage() {
		return SuccessfulMesssage.getText();
	}
	public String deduction1CheckYesOpenComponent(){
		return CheckYesNo.getText();
	}
	public String deduction1CheckYesCalculativeField(){
		return CheckYesNo1.getText();
	}
	public void deductionSalaryHeadDelete() throws Exception{
		DeleteDeductionHead.click();
	}
	public void earningSalaryHeadDelete() throws Exception{
		DeleteEarningHead.click();
	}
}