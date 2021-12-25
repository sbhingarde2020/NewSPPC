package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class GeneralLinkPolicy extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
	@FindBy(xpath="//div[@id='ui-accordion-accordion-header-1']//h3")
	WebElement generaLink;
	@FindBy(xpath="//ul[@id='ui-accordion-accordion-panel-1']//a[text()='Leave Definitions']")
	WebElement leaveDefinitionLink;
	@FindBy(xpath="//div[@id='main']//p")
	WebElement successfullMessage;
	
	public GeneralLinkPolicy(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectLeavePolicy(){
		leavePolicy.click();
	}
	
	public void  clickGeneraLink(){
		generaLink.click();
	}
	
	public void clickLeaveDefinitionLink(){
		leaveDefinitionLink.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
