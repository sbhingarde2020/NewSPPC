package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteClassificationDetails extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Classifications']")
	WebElement classifications;
	@FindBy(xpath="//*[@id=\"list_classification_headings\"]/div[2]/table/tbody/tr/td[1][text()='Classification10']/parent::tr/td[3]/a")
	WebElement detailsLink;
	@FindBy(xpath="//*[@id=\"classifications_list\"]/div[2]/table/tbody/tr/td[3]/a")
	WebElement deleteButton;
	@FindBy(xpath="//strong[text()='Classification was successfully deleted.']")
	WebElement successfullMessage;

	public DeleteClassificationDetails(WebDriver driver) {
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
	
	public void clickDeleteButton(){
		deleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
