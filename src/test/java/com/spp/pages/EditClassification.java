package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditClassification extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Classifications']")
	WebElement classifications;
	@FindBy(xpath="//*[@id=\"list_classification_headings\"]/div[2]/table/tbody/tr/td[1][text()='Classification10']/parent::tr/td[4]/a")
	WebElement editIcon;
	@FindBy(id="classification_heading_classification_heading_name")
	WebElement classificationName;
	@FindBy(id="classification_heading_display_order")
	WebElement displayOrder;
	@FindBy(xpath="//input[@value='Update Classification Heading']")
	WebElement updateButton;
	@FindBy(xpath="//strong[text()='Classification Heading successfully updated.']")
	WebElement successfullMessage;

	public EditClassification(WebDriver driver) {
		super(driver);
	    PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectClassifications(){
		classifications.click();
	}
	
	public void clickEditIcon(){
		editIcon.click();
	}
	
	public void enterClassificationName(String value){
		classificationName.clear();
		classificationName.sendKeys(value);
	}
	
	public void enterDisplayOrder(String value){
		displayOrder.clear();
		displayOrder.sendKeys(value);
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}