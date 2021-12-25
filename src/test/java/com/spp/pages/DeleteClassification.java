package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteClassification extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Classifications']")
	WebElement classifications;
    @FindBy(xpath="//*[@id=\"list_classification_headings\"]/div[2]/table/tbody/tr[8]/td[contains(text(),'Classification10')]/parent::tr/td[5]/a")
    WebElement deleteButton;
    @FindBy(xpath="//strong[text()='Classification heading was successfully deleted.']")
    WebElement successfullMessage;
	
	public DeleteClassification(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectClassifications(){
		classifications.click();
	}
	
	public void clickDeleteButton(){
		deleteButton.click();
		switchToPopUpAndAccept(driver);	
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}

}
