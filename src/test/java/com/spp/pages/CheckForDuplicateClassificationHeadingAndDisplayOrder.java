package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckForDuplicateClassificationHeadingAndDisplayOrder extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Classifications']")
	WebElement classifications;
	@FindBy(id="classification_heading_classification_heading_name")
	WebElement classificationName;
	@FindBy(id="classification_heading_display_order")
	WebElement displayOrder;
	@FindBy(xpath="//input[@value='Create Classification Heading']")
	WebElement createButton;
	@FindBy(xpath="//strong[text()='Classification Heading created successfully.']")
	WebElement successfullMessage1;
	@FindBy(xpath="//*[@id=\"classification_heading_result_response\"]/div/li[1]")
	WebElement successfullMessage2;
	@FindBy(xpath="//*[@id=\"classification_heading_result_response\"]/div/li[2]")
	WebElement successfullMessage3;
	@FindBy(xpath="//*[@id=\"list_classification_headings\"]/div[2]/table/tbody/tr/td[1][contains(text(),'Heading')]/parent::tr/td[5]/a")
	WebElement DeleteButton;
	public CheckForDuplicateClassificationHeadingAndDisplayOrder(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectClassifications(){
		classifications.click();
	}

	public void enterClassificationName(String value){
		classificationName.sendKeys(value);
	}
	
	public void enterDisplayOrder(String value){
		displayOrder.sendKeys(value);
	}
	
	public void clickCreateButton(){
		createButton.click();
	}
	
	public String getMessage1(){
		return successfullMessage1.getText();
	}
	public String getMessage2(){
		return successfullMessage2.getText();
	}
	public String getMessage3(){
		return successfullMessage3.getText();
	}
	public void clickDeleteButton(){
		DeleteButton.click();
	}
}
