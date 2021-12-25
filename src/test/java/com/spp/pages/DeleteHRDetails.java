package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteHRDetails extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='HR Category']")
	WebElement hrCategory;
	@FindBy(xpath="//div[@id='hr_category_list']//div[3]//a[1]")
	WebElement nextButton;
	@FindBy(xpath="//div[@id='hr_category_list']//div[2]//tr//td[2]//a[text()='Details']")
	WebElement detailsLink;
	@FindBy(xpath="//div[@id='hr_category_details_list']//div[2]//td[4]//a[text()='Delete']")
	WebElement deleteButton;
	@FindBy(xpath="//strong[text()='HR Category Detail was successfully deleted.']")
	WebElement successfullMessage;

	public DeleteHRDetails(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectHRCategory(){
		hrCategory.click();
	}
	
	public void clickNextButton(){
		nextButton.click();
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
