package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.ChangePassword;
import com.spp.pages.LockAdminUser;
import com.spp.pages.SecurityPolicy;
import com.spp.pages.UnlockUser;
import com.spp.pages.VerifyLockUser;
import com.spp.pages.VerifyUnlockAdminUser;

public class UserSettings extends BaseTest{
	

	@Test(priority=0)
	public void ChangePassword_SC_141() throws Exception{
		ChangePassword lm=new ChangePassword(driver);
		lm.navigateSuperuser();
		lm.clickChangePassword();
		lm.clickCurrentPassword("default@123456");
		lm.clickNewPassword("default@123456");
		lm.clickConfirmPassword("default@123456");
		lm.clickUpdateButton();
		String r=lm.getMessage();
		Assert.assertEquals(r, "Password was successfully updated");
	}	
	
/*	@Test(priority=1)
		public void SecurityPolicy_SC_142() throws Exception{
			SecurityPolicy sp=new SecurityPolicy(driver);
			sp.navigateSuperuser1();
			sp.clickSecurityPolicy();
			sp.selectpasswordstrength( "Alpha Numeric");
			sp.enterPasswordExpiryDay("50");
			sp.enterPasswordExpiryReminder("5");
			sp.enterMinimumPasswordLength("6");
			sp.selectLoginType();
			sp.clickSessionManager();
			sp.clickupdatebutton();
			String r=sp.getMessage();
			Assert.assertEquals(r, "General Security Policy Is Updated.");
			}
	@Test(priority=2)
	public void UnlockUser_SC_144() throws Exception{
		UnlockUser us=new UnlockUser(driver);
		us.clickonsuperuser();
		Thread.sleep(500);
		us.clickonusermanagement();
		Thread.sleep(2000);
		us.selectunlockuser();
		Thread.sleep(2000);
		us.selectemployee();
		Thread.sleep(2000);
		us.clickonunlockuser();
		String r=us.getMessage();
		Assert.assertEquals(r, "Unlocked selected users.");
	}
	/*@Test(priority=3)
	public void LockUser_SC_145() throws Exception{
		VerifyLockUser us=new VerifyLockUser(driver);
		us.clickonsuperuser();
		Thread.sleep(500);
		us.clickonusermanagement();
		Thread.sleep(2000);
		us.selectLockuser();
		Thread.sleep(2000);
		us.selectemployee();
		Thread.sleep(2000);
		us.clickonlockuser();
		String r=us.getMessage();
		Assert.assertEquals(r, "Locked selected users.");
	
	}
	@Test(priority=4)
	public void VerifyUnlockAdminUser_SC_146() throws Exception{
		VerifyUnlockAdminUser us=new VerifyUnlockAdminUser(driver);
		us.clickonsuperuser();
		Thread.sleep(500);
		us.clickonusermanagement();
		Thread.sleep(2000);
		us.selectunLockadminuser();
		Thread.sleep(1000);
		us.selectemployee();
		Thread.sleep(2000);
		us.clickonunlockadminuser();
		String r=us.getMessage();
		Assert.assertEquals(r, "Unlocked selected users.");
	
	}
	@Test(priority=5)
	public void VerifyLockAdminUser_SC_147() throws Exception{
		LockAdminUser us=new LockAdminUser(driver);
		us.clickonsuperuser();
		Thread.sleep(500);
		us.clickonusermanagement();
		Thread.sleep(2000);
		us.selectLockadminuser();
		Thread.sleep(1000);
		us.checkemployee();
		Thread.sleep(2000);
		us.clickonlockadminuser();
		Thread.sleep(1000);
		String r=us.getMessage();
		Assert.assertEquals(r, "Locked selected users.");
	
	}*/
}
