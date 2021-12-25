package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class ChangeDefaultPaymonthOptionOfPaymonth extends BasePage{
	@FindBy(id="salary")
	WebElement SalaryLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[1]/a")
	WebElement PaymonthsLink;
	@FindBy(xpath="//*[@id=\"paymonth-lists\"]/form/div[3]/table/tbody/tr[2]/td[6]/input")
	WebElement DefaultMonth;
	@FindBy(xpath="//*[@id=\"paymonth-lists\"]/form/div[5]/input")
	WebElement UpdateButton;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id=\"paymonth-lists\"]/form/div[3]/table/tbody/tr[1]/td[8]/a")
	WebElement DeleteButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/div/div/fieldset/div[2]/form/div/input[2]")
	WebElement DeletePaymonth;
	@FindBy(xpath="//*[@id=\"paymonth-lists\"]/form/div[3]/table/tbody/tr[1]/td[6]/input")
	WebElement DefaultMonth1;
	public ChangeDefaultPaymonthOptionOfPaymonth(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSalaryLink(){
		SalaryLink.click();
	}
	
	public void selectPaymonthsLink(){
		PaymonthsLink.click();
	}

	public void selectDefaultMonth(){
		DefaultMonth.click();
	}
	
	public void ClickUpdateButton(){
		UpdateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
	public void clickDeleteButton(){
		DeleteButton.click();
	}
	public void clickDeletePaymonth(){
		DeletePaymonth.click();
	}
	public void selectDefaultMonth1(){
		DefaultMonth1.click();
	}
}
