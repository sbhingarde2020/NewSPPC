package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.ChangeDefaultPaymonthOptionOfPaymonth;
import com.spp.pages.CheckifSalaryPaymonthsProcessBackgroundJobsredirectstoNotification;
import com.spp.pages.CreatePaymonth;
import com.spp.pages.DeletePaymonth;
import com.spp.pages.LockPaymonth;

import junit.framework.Assert;

public class Paymonths extends BaseTest{

	@Test(priority=0)
	public void CreatePaymonth_SC_121() throws InterruptedException{
		CreatePaymonth cc=new CreatePaymonth(driver);
		cc.clickSalaryLink();
		cc.selectPaymonthsLink();
		//cc.enterMonthName("Oct/2018");
		cc.ClickCreateButton();
		String s=cc.getMessage();
		Assert.assertEquals(s, "Paymonth created successfully");
		Thread.sleep(4000);
		cc.clickDeleteButton();
		cc.clickDeletePaymonth();
		Thread.sleep(4000);

}
	@Test(priority=1)
	public void ChangeDefaultPaymonthOptionOfPaymonth_SC_122() throws InterruptedException{
		ChangeDefaultPaymonthOptionOfPaymonth cc=new ChangeDefaultPaymonthOptionOfPaymonth(driver);
		cc.clickSalaryLink();
		cc.selectPaymonthsLink();
		cc.selectDefaultMonth();
		cc.ClickUpdateButton();
		String s=cc.getMessage();
		Assert.assertEquals(s, "Paymonth updated successfully");
		Thread.sleep(5000);
		cc.selectDefaultMonth1();
		cc.ClickUpdateButton();
}
	@Test(priority=2)
	public void DeletePaymonth_SC_123() throws InterruptedException{
		DeletePaymonth cc=new DeletePaymonth(driver);
		cc.clickSalaryLink();
		cc.selectPaymonthsLink();
		cc.clickDeleteButton();
		cc.clickDeletePaymonth();
//		String s=cc.getMessage();
//		Assert.assertEquals(s, "Paymonth successfully deleted");
		Thread.sleep(4000);
		cc.enterMonthName("Jun/2013");
		cc.ClickCreateButton();
}
	@Test(priority=3)
	public void LockPaymonth_SC_124() throws InterruptedException{
		LockPaymonth cc=new LockPaymonth(driver);
		cc.clickSalaryLink();
		cc.selectPaymonthsLink();
		cc.selectLockMonth();
		cc.ClickUpdateButton();
		String s=cc.getMessage();
		Assert.assertEquals(s, "Paymonth updated successfully");
		Thread.sleep(5000);
		cc.selectLockMonth();
		cc.ClickUpdateButton();
		Thread.sleep(3000);
		cc.clickDeleteButton();
}
	@Test(priority=4)
	public void CheckifSalaryPaymonthsProcessBackgroundJobsredirectstoNotification_SC_494() throws InterruptedException{
		CheckifSalaryPaymonthsProcessBackgroundJobsredirectstoNotification cc=new CheckifSalaryPaymonthsProcessBackgroundJobsredirectstoNotification(driver);	
		cc.clickonsalary();
		cc.clickonPayMonth();
		cc.clickprocessbackgroundjobs();
	}
	}