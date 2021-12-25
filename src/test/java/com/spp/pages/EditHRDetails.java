package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditHRDetails extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='HR Category']")
	WebElement hrCategory;
	@FindBy(xpath="//div[@id='hr_category_list']//div[3]//a[1]")
	WebElement nextButton;
	@FindBy(xpath="//div[@id='hr_category_list']//div[2]//tr//td[2]//a[text()='Details']")
	WebElement detailsLink;
	@FindBy(xpath="//div[@id='hr_category_details_list']//div[2]//td[3]//a[text()='Edit']")
	WebElement editIcon;
	@FindBy(id="hr_category_detail_name")
	WebElement labelName;
	@FindBy(id="hr_category_detail_required")
	WebElement requiredBox;
	@FindBy(xpath="//input[@value='Update HR Category Detail']")
	WebElement updateButton;
	@FindBy(xpath="//strong[text()='HR Category Detail updated successfully.']")
	WebElement successfullMessage;

	public EditHRDetails(WebDriver driver) {
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

	public void clickEditIcon(){
		editIcon.click();
	}
	
	public void enterLabelName(String value){
		labelName.clear();
		labelName.sendKeys(value);
	}
	
	public void clickRequiredBox(){
		requiredBox.click();
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
