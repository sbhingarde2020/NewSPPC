package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdatePayslipLegendsInSettings extends BasePage{
	@FindBy(id="setting") 
	WebElement Settings;
	@FindBy(xpath="//*[@id=\"menu\"]/li[9]/div/div/ul/li[2]/a")
	WebElement PaySlipLegends;
	@FindBy(xpath="//*[@id='add_all_things']/tbody/tr[1]/td[1]/span/input")
	WebElement RefNo;
	@FindBy(xpath="//*[@id='add_all_things']/tbody/tr[1]/td[2]/span/input")
	WebElement EmployeeName;
	@FindBy(xpath="//*[@id=\"main\"]/form/div[3]/div[17]/input")
	WebElement UpdatePayslip;
	@FindBy(id="select_all_checkboxes")
	WebElement SelectAll;
	@FindBy(xpath="//*[@id='main']/div[2]/strong")
	WebElement successfullMessage;
	
	public UpdatePayslipLegendsInSettings(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSettings(){
		Settings.click();
	}
	
	public void selectPaySlipLegends(){
		PaySlipLegends.click();
	}
	public void selectRefNo(){
		if(!RefNo.isSelected()) {
		RefNo.click();
		}
	}
	public void selectEmployeeName(){
		EmployeeName.click();
	}
	public void clickUpdatePayslip(){
		UpdatePayslip.click();
	}

		
	public String getMessage(){
		return successfullMessage.getText();
	}
	public void selectall() {
		if(!SelectAll.isSelected()) {
		SelectAll.click();
		}
	}

}
