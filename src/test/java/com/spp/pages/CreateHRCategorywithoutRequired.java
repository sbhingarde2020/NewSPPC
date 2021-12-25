package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateHRCategorywithoutRequired extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='HR Category']")
	WebElement hrCategory;
	@FindBy(xpath="//*[@id=\"hr_category_list\"]/div[2]/table/tbody/tr/td[contains(text(),'Personal')]/parent::tr/td[2]/a")
	WebElement ClickOnDetails;
	@FindBy(id="hr_category_detail_name")
	WebElement EnterLabelName;
	@FindBy(id="hr_category_category_name")
	WebElement hrName;
	@FindBy(xpath="//*[@id=\"new_hr_category_details\"]/div[2]/div[2]/input")
	WebElement createhrcategorydetail;
	@FindBy(xpath="//*[@id=\"hr_category_details_result_response\"]/div/strong")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id=\"hr_category_details_list\"]/div[2]/table/tbody/tr/td[contains(text(),'Driving License No')]/parent::tr/td[4]/a")
	WebElement DeleteDetail;

	public CreateHRCategorywithoutRequired(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectHRCategory(){
		hrCategory.click();
	}
	public void clickondetails() {
		ClickOnDetails.click();
	}
	public void enterlabel(String value) throws Exception{
		EnterLabelName.sendKeys(value);
	}
	public void enterHRName(String value){
		hrName.sendKeys(value);
	}
	
	public void clickCreateButton(){
		createhrcategorydetail.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
	public void deletedetail() {
		DeleteDetail.click();
		switchToPopUpAndAccept(driver);
	}
}
