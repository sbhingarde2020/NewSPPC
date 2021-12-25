package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class HomePage extends BasePage{

	@FindBy(xpath="(//span[normalize-space(text()='superuser')])[1]")
	//@FindBy(xpath="//span[@class='profile-image']")
	private WebElement superuseraction;
	//@FindBy(xpath="//a[text()='Logout']")
	@FindBy(xpath="//*[.='Logout']")
	private WebElement logout;

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void superaction(){
		waitTillElementIsVisible(superuseraction);
		mouseActions(driver,superuseraction); 
	}

	public void clickLogout(){
		waitTillElementIsVisible(logout);
		logout.click();

	}
}



