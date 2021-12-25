package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UnlockUser extends BasePage{
@FindBy(xpath="/html/body/div/div[4]/div/div[2]/ul/li/a/span[1]")
WebElement Superuser;
@FindBy(xpath="/html/body/div/div[4]/div/div[2]/ul/li/ul/li[5]/a")
WebElement ClickOnUserManagement;
@FindBy(xpath="//*[@id=\"main\"]/div[2]/nav/ul/li[1]/a")
WebElement SelectOnUnlockUser;
@FindBy(xpath="//*[@id=\"user_roles_unlock\"]/tbody/tr/td[contains(text(),'Ankit')]/parent::tr/td/input")
WebElement SelectEmployee;
@FindBy(id="user_management")
WebElement ClickOnUnlockUser;
@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
WebElement successfullmessage;
public UnlockUser(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver, this);
}
	public void clickonsuperuser() {
		Superuser.click();
	}
	public void clickonusermanagement() {
		ClickOnUserManagement.click();
	}
	public void selectunlockuser() {
		SelectOnUnlockUser.click();
	}
	public void selectemployee() {
		SelectEmployee.click();
	}
	public void clickonunlockuser() {
		ClickOnUnlockUser.click();
	}
	public String getMessage() {
		return successfullmessage.getText();
	}
}
