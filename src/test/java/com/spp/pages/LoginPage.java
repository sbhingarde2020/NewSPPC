package com.spp.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;


public class LoginPage extends BasePage{
	@FindBy(id="user_username")
	//@FindBy(xpath="//*[@id='user_username']")
	WebElement txtUsername;
	
	@FindBy(id="user_password")
    WebElement txtPassword;
	
	@FindBy(id="sign_in")
	WebElement btnLogin; 
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String un){
		txtUsername.sendKeys(un);
	}

	public void setPassword(String pw){
		txtPassword.sendKeys(pw);
	}
	
	public void clickLogin(){
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", btnLogin);
	}
	
	
}
