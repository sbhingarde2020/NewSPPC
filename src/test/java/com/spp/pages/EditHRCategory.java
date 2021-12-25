package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class EditHRCategory extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='HR Category']")
	WebElement hrCategory;
	@FindBy(xpath="//div[@id='hr_category_list']//div[3]//a[1]")
	WebElement nextButton;
	@FindBy(xpath="(//div[@id='hr_category_list']//div[2]//td[3]//a[text()='Edit'])[1]")
	WebElement editIcon;
	@FindBy(id="hr_category_category_name")
	WebElement hrName;
	@FindBy(xpath="//input[@value='Update HR Category']")
	WebElement updateButton;
	@FindBy(xpath="//strong[text()='HR Category updated successfully.']")
	WebElement successfullMessage;

	public EditHRCategory(WebDriver driver) {
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
	
	public void clickEditIcon(){
		editIcon.click();
	}
	
	public void enterHRName(String value){
		hrName.clear();
		hrName.sendKeys(value);
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
