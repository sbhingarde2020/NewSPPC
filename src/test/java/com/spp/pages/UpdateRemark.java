package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateRemark extends BasePage{
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[2]/ul/li[2]/a")
	WebElement ClickOnFNF;
	@FindBy(xpath="//*[@id=\"employees\"]/tbody/tr/td[5]/a")
	WebElement ClickOnDetails;
	@FindBy(xpath="//*[@id=\"main\"]/section/div[3]/nav/ul/li[3]/a/span")
	WebElement SelectRemarkTab;
	@FindBy(id="remarks_in_text")
	WebElement EnterRemark;
	@FindBy(id="update_remark")
	WebElement UpdateRemark;
	@FindBy(xpath="//*[@id=\"main\"]/section/div[2]/nav/ul/li[2]/a/span")
	WebElement SelectTheoreticalTab;
	@FindBy(xpath="//strong[text()='Remark was successfully updated.']")
	WebElement SuccessMessage;
	
	
	
	
	
	
	
	
	
	public UpdateRemark(WebDriver driver) {
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
	public void selectremarktab() {
		SelectRemarkTab.click();
	}
	public void eneterremark(String value) {
		EnterRemark.clear();
		EnterRemark.sendKeys(value);
	}
	public void updateremark() {
		UpdateRemark.click();
	}
public String getmessage() {
		
		return SuccessMessage.getText();
	}
public void selecttheoreticaltab() {
	SelectTheoreticalTab.click();
}

}
