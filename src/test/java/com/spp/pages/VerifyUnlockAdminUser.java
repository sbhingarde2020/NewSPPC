package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class VerifyUnlockAdminUser extends BasePage{
	@FindBy(xpath="/html/body/div/div[4]/div/div[2]/ul/li/a/span[1]")
	WebElement Superuser;
	@FindBy(xpath="/html/body/div/div[4]/div/div[2]/ul/li/ul/li[5]/a")
	WebElement ClickOnUserManagement;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/nav/ul/li[3]/a")
	WebElement SelectOnUnlockAdminUser;
	@FindBy(id="Unlock_admin_User_check_box")
	WebElement SelectEmployee;
	@FindBy(id="unlock_admin_users")
	WebElement ClickOnUnlockAdminUser;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement successfullmessage;
	public VerifyUnlockAdminUser(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
		public void clickonsuperuser() {
			Superuser.click();
		}
		public void clickonusermanagement() {
			ClickOnUserManagement.click();
		}
		public void selectunLockadminuser() {
			SelectOnUnlockAdminUser.click();
		}
		public void selectemployee() {
			SelectEmployee.click();
		}
		public void clickonunlockadminuser() {
			ClickOnUnlockAdminUser.click();
		}
		public String getMessage() {
			return successfullmessage.getText();
		}

}
