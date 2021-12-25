package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class ChangePassword extends BasePage{
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div[2]/ul/li/a/span[1]")
	WebElement Superuser;
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div[2]/ul/li/ul/li[1]/a")
	WebElement ChangePassword;
	@FindBy(id="user_current_password")
	WebElement CurrentPassword;
	@FindBy(id="user_password")
	WebElement NewPassword;
	@FindBy(id="user_password_confirmation")
	WebElement ConfirmPassword;
	@FindBy(xpath="//*[@id=\"change_password_form\"]/fieldset/div[4]/div/input")
	WebElement UpdateButton;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement successfullMessage;

	public ChangePassword(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateSuperuser() throws Exception{
		Superuser.click();
	}

	public void clickChangePassword() throws Exception{
		ChangePassword.click();
	}

	public void clickCurrentPassword(String value) throws Exception{
		CurrentPassword.sendKeys(value);
	}

	public void clickNewPassword(String value) throws Exception{
		NewPassword.sendKeys(value);
	}

	public void clickConfirmPassword(String value) throws Exception{
		ConfirmPassword.sendKeys(value);
	}
	
	public void clickUpdateButton() throws Exception{
		UpdateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
