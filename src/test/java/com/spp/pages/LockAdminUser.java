package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class LockAdminUser extends BasePage{
	@FindBy(xpath="/html/body/div/div[4]/div/div[2]/ul/li/a/span[1]")
	WebElement Superuser;
	@FindBy(xpath="/html/body/div/div[4]/div/div[2]/ul/li/ul/li[5]/a")
	WebElement ClickOnUserManagement;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/nav/ul/li[4]/a/span")
	WebElement SelectOnLockAdminUser;
	@FindBy(id="lock_admin_User_check_box")
	WebElement SelectEmployee;
	@FindBy(id="lock_admin_users")
	WebElement ClickOnlockAdminUser;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement successfullmessage;
	public LockAdminUser(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
		public void clickonsuperuser() {
			Superuser.click();
		}
		public void clickonusermanagement() {
			ClickOnUserManagement.click();
		}
		public void selectLockadminuser() {
			SelectOnLockAdminUser.click();
		}
		public void checkemployee() {
			SelectEmployee.click();
		}
		public void clickonlockadminuser() {
			ClickOnlockAdminUser.click();
		}
		public String getMessage() {
			return successfullmessage.getText();
		}

}
