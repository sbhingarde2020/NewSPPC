package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateDeductionHead extends BasePage{
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[2]/ul/li[2]/a")
	WebElement ClickOnFNF;
	@FindBy(xpath="//*[@id=\"employees\"]/tbody/tr/td[5]/a")
	WebElement ClickOnDetails;
	@FindBy(xpath="//*[@id=\"main\"]/section/div[3]/nav/ul/li[2]/a/span")
	WebElement ClickOnDeductionTab;
	@FindBy(xpath="//*[@id=\"ffs_deduction_button_id\"]/input")
	WebElement CreateNewDeduction;
	@FindBy(id="new_head_name")
	WebElement EnterDescription;
	@FindBy(id="new_head_amount")
	WebElement EnterAmount;
	@FindBy(id="new_head_update")
	WebElement CreateHead;
	@FindBy(xpath="//strong[text()='Head was successfully created']")
	WebElement SuccessMessage;
	@FindBy(xpath="//*[@id=\"main\"]/section/div[2]/nav/ul/li[2]/a/span")
	WebElement SelectTheoreticalTab;
	
	
	public CreateDeductionHead(WebDriver driver) {
		super(driver);
		PageFactory.initElements( driver, this);
	}
	
	public void clickonsalary() {
		ClickOnSalary.click();
	}
	public void clickonFNF() {
		ClickOnFNF.click();
	}
	public void clickdetails() {
		ClickOnDetails.click();
	}
	public void clickondeductiontab() {
		ClickOnDeductionTab.click();
	}
	public void createnewdeduction() {
		CreateNewDeduction.click();
	}
public void EnterDescription(String value) {
		
		EnterDescription.sendKeys(value);
	}
	public void EnterAmount(String value) {
		EnterAmount.sendKeys(value);
	}
	public void createhead() {
		CreateHead.click();
	}
public String getmessage() {
		
		return SuccessMessage.getText();
	}
public void selecttheoreticaltab() {
	SelectTheoreticalTab.click();
}
}
