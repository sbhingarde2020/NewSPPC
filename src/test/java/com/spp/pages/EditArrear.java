package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditArrear extends BasePage{
	@FindBy(id="salary") 
	WebElement SalaryLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[3]/a")
	WebElement Arrears;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/table/tbody/tr[1]/td[5]/a")
	WebElement EditArrear;
	@FindBy(id="arrear_arrear_name")
	WebElement ArrearName;
	@FindBy(id="arrear_arrear_from_month")
	WebElement ArrearFrom;
	@FindBy(css="input[type=submit]")
	WebElement UpdateButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/table/tbody/tr[3]/td[6]/a")
	WebElement DeleteButton;
	
//@FindBy(xpath="//*[@id=\"main\"]/div[2]/table/tbody/tr/td[1][contains(text(),'new')]/parent::tr/td[6]/a/img")
//List<WebElement> xyz;
	
public EditArrear(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSalaryLink(){
		SalaryLink.click();
	}
	
	public void selectArrears(){
		Arrears.click();
	}
	public void selectEditArrear(){
		EditArrear.click();
	}
	public void EnterArrearName(String value){
		ArrearName.clear();
		ArrearName.sendKeys(value);
	}
	public void selectArrearFrom(String value){
		dropDownSelect(ArrearFrom, value);
	}
		public void ClickUpdateButton(){
		UpdateButton.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}

	
  	public void selectDeleteButton(){
    DeleteButton.click();
//		xyz.get(0).click();
//		System.out.println(xyz.size());
//		System.out.println("dgfjgfj");
  	}
}
