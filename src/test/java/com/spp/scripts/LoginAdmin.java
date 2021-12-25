package com.spp.scripts;

import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Excel;
import com.spp.pages.LoginPage;

public class LoginAdmin extends BaseTest {

	public LoginAdmin(){
		loginRequired=true;
		logoutRequired=true;
	}

	@Test
	public void loginAdmin() throws InterruptedException {
		String un=Excel.getCellValue(INPUT_PATH, "VerifyAdminLoginLogout",0,0);
		String pw=Excel.getCellValue(INPUT_PATH, "VerifyAdminLoginLogout",0,1);
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName(un);
		loginPage.setPassword(pw);
		loginPage.clickLogin();
	}

}
