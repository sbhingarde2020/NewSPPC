package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditClasssificationDetails extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Classifications']")
	WebElement classifications;
	@FindBy(xpath="//*[@id=\"list_classification_headings\"]/div[2]/table/tbody/tr/td[1][text()='Classification10']/parent::tr/td[3]/a")
	WebElement detailsLink;
	@FindBy(xpath="//*[@id=\"classifications_list\"]/div[2]/table/tbody/tr[1]/td[2]/a")
	WebElement editIcon;
	@FindBy(id="classification_classification_name")
	WebElement classificationDetailName;
	@FindBy(xpath="//input[@class='btn2 btn-bglightblue']")
	WebElement updateButton;
	@FindBy(xpath="//strong[text()='Classification successfully updated.']")
	WebElement successfullMessage;

	public EditClasssificationDetails(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectClassifications(){
		classifications.click();
	}
	
	public void clickDetailsLink(){
		detailsLink.click();
	}
	
	public void clickEditIcon(){
		editIcon.click();
	}
	
	public void enterClassificationDetailName(String value){
		classificationDetailName.clear();
		classificationDetailName.sendKeys(value);
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
