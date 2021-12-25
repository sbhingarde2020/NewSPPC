package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateEarningHead extends BasePage{
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[2]/ul/li[2]/a")
	WebElement ClickOnFNF;
	@FindBy(xpath="//*[@id=\"employees\"]/tbody/tr/td[5]/a")
	WebElement ClickOnDetails;
	@FindBy(xpath="//*[@id=\"ffs_earning_button_id\"]/input")
	WebElement CreateNewEarning;
	@FindBy(id="new_head_name")
	WebElement EnterDescription;
	@FindBy(id="to_modify_amount")
	WebElement EnterAmount;
	@FindBy(xpath="//*[@id=\"modified_earnings\"]/table/tbody/tr[7]/td[4]/table/tbody/tr/td[1]/button")
	WebElement ClickOnEdit;
	@FindBy(xpath="//*[@id=\"modified_deductions\"]/table/tbody/tr[15]/td[4]/table/tbody/tr/td[1]/button")
	WebElement ClickOnEditDeductionHead;
	@FindBy(id="earn_ded_udpate")
	WebElement UpdateHead;
	@FindBy(xpath="//strong[text()='Head was successfully updated']")
	WebElement SuccessMessage;
	@FindBy(xpath="//*[@id=\"main\"]/section/div[3]/nav/ul/li[2]/a/span")
	WebElement ClickOnDeductionTab;
	@FindBy(xpath="//*[@id=\"main\"]/section/div[2]/nav/ul/li[2]/a/span")
	WebElement SelectTheoreticalTab;
	@FindBy(xpath="//*[@id=\"modified_earnings\"]/table/tbody/tr[7]/td[4]/table/tbody/tr/td[1]/button")
	WebElement EditTheoreticalHead;
	@FindBy(xpath="//*[@id=\"modified_deductions\"]/table/tbody/tr[15]/td[4]/table/tbody/tr/td[1]/button")
	WebElement EditDeductionHeadTheoretical;
	public UpdateEarningHead(WebDriver driver) {
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
public void EnterDescription(String value) {
		
		EnterDescription.sendKeys(value);
	}
	public void EnterAmount(String value) {
		EnterAmount.clear();
		EnterAmount.sendKeys(value);
	}
	public void clickonedit() {
		ClickOnEdit.click();
	}
	public void clickoneditdeductionhead() {
		ClickOnEditDeductionHead.click();
	}
	public void editdeductionheadtheoretical() {
		EditDeductionHeadTheoretical.click();
	}
	public void edittheoreticalhead() {
		EditTheoreticalHead.click();
	}
	public void updatehead() {
		UpdateHead.click();
	}
public String getmessage() {
		
		return SuccessMessage.getText();
	}
public void clickondeductiontab() {
	ClickOnDeductionTab.click();
}
public void selecttheoreticaltab() {
	SelectTheoreticalTab.click();
}

}
