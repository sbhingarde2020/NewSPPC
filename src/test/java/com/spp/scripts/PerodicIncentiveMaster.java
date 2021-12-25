package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.CheckPeriodicIncMstrcanbeEdited;
import com.spp.pages.CreatePeriodicIncMstrwithClubbInSal;
import com.spp.pages.CreatePerodicIncMstrwithoutClubbInSalHead;
import com.spp.pages.DeleteInsuranceMaster;
import com.spp.pages.DeletePeriodicIncetive;

import junit.framework.Assert;

public class PerodicIncentiveMaster extends BaseTest{

	@Test(priority=0)
	public void CreatePerodicIncMstrwithoutClubbInSalHead_SC_24() throws Exception {
		CreatePerodicIncMstrwithoutClubbInSalHead cs=new CreatePerodicIncMstrwithoutClubbInSalHead(driver);
		cs.navigatemasterlink();
		cs.clickPeriodicIncentiveMaster();
		cs.clickAddPeriodicIncentive();
		cs.clickName("PerodicIncentiveMaster"+Utility.getRandNum(1, 10));
		cs.uncheckclubinsal();
		cs.clickCreateButton();
		String d=cs.getMessage();
		Assert.assertEquals(d, "Periodic Incentive successfully created");	
		String a = cs.PeriodicCheckNo();
		Assert.assertEquals(a, "No");
		cs.clickdelete();
		cs.switchToPopUpAndAccept(driver);
	}
	
	@Test(priority=1)
	public void CreatePeriodicIncMstrwithClubbInSal_SC_25() throws Exception{
		CreatePeriodicIncMstrwithClubbInSal ci=new CreatePeriodicIncMstrwithClubbInSal(driver);
		ci.navigateMaster();
		ci.selectPeriodicIncentive();
		ci.clickAddPeriodicIncentive();
		ci.enterPeriodicIncentiveName("PerodicIncentiveMaster"+Utility.getRandNum(1, 10));
		ci.clickCreatePeriodicIncentive();
		String d=ci.getMessage();
		Assert.assertEquals(d, "Periodic Incentive successfully created");
		String a = ci.PeriodicCheckYes();
		Assert.assertEquals(a, "Yes");	
	}
		
	@Test(priority=2)
	public void CheckPeriodicIncMstrcanbeEdited_SC_26() throws Exception{
		CheckPeriodicIncMstrcanbeEdited ci=new CheckPeriodicIncMstrcanbeEdited(driver);
		ci.navigateMaster();
		ci.selectPeriodicIncentive();
		ci.clickonedit();
		ci.enterPeriodicIncentiveName("PerodicIncentiveMaster"+Utility.getRandNum(1, 10));
		ci.updateperiodicincentive();
		Thread.sleep(2000);
		String d=ci.getMessage();
		Assert.assertEquals(d, "Periodic Incentive successfully updated");	
	}
	
	@Test(priority=3)
	public void DeletePeriodicIncetive_SC_27() throws Exception{
		DeletePeriodicIncetive pi=new DeletePeriodicIncetive(driver);
		pi.navigateMaster();
		pi.selectPeriodicIncentive();
		pi.clickDeletePeriodicIncentive();
		Thread.sleep(5000);
		pi.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		pi.clickDeletePeriodicIncentive();
		Thread.sleep(5000);
		pi.switchToPopUpAndAccept(driver);
		String abc=pi.getMessage();
		Assert.assertEquals(abc, "Periodic Incentive successfully deleted");
		boolean abcd =  pi.CheckIfPresent();
		//System.out.println(abcd);
		Assert.assertEquals(false,abcd);
	}
}