package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteEarningHead extends BasePage{
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[2]/ul/li[2]/a")
	WebElement ClickOnFNF;
	@FindBy(xpath="//*[@id=\"employees\"]/tbody/tr/td[5]/a")
	WebElement ClickOnDetails;
	@FindBy(xpath="//*[@id=\"modified_earnings\"]/table/tbody/tr[7]/td[4]/table/tbody/tr/td[2]/a/img")
	WebElement ClickOnDelete;
	@FindBy(xpath="//*[@id=\"modified_deductions\"]/table/tbody/tr[15]/td[4]/table/tbody/tr/td[2]/a/img")
	WebElement ClickOnDeleteDeductionHead;
	@FindBy(xpath="//*[@id=\"main\"]/section/div[3]/nav/ul/li[2]/a/span")
	WebElement ClickOnDeductionTab;
	@FindBy(xpath="//*[@id=\"main\"]/section/div[2]/nav/ul/li[2]/a/span")
	WebElement SelectTheoreticalTab;
	@FindBy(xpath="//strong[text()='Head was successfully deleted']")
	WebElement SuccessMessage;
	@FindBy(xpath="//*[@id=\"modified_earnings\"]/table/tbody/tr[7]/td[4]/table/tbody/tr/td[2]/a/img")
	WebElement DeleteTheoreticalEarningHead;
	@FindBy(xpath="//*[@id=\"modified_deductions\"]/table/tbody/tr[15]/td[4]/table/tbody/tr/td[2]/a/img")
	WebElement ClickOnDeleteDeductionHeadTheoretical;
	public DeleteEarningHead(WebDriver driver) {
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
	public void clickondelete() {
		ClickOnDelete.click();
		
	}
	public void clickondeletedeductionhead() {
		ClickOnDeleteDeductionHead.click();
	}
	public void clickondeletedeductionheadtheoretical() {
		ClickOnDeleteDeductionHeadTheoretical.click();
	}
	public void deletetheoreticalearninghead() {
		DeleteTheoreticalEarningHead.click();
	}
	public void clickondeductiontab() {
		ClickOnDeductionTab.click();
	}
public String getmessage() {
		
		return SuccessMessage.getText();
	}
public void selecttheoreticaltab() {
	SelectTheoreticalTab.click();
}
}
