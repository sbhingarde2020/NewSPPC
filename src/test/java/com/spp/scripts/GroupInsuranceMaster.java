package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.CheckGrpIncMstrcanbeEdited;
import com.spp.pages.CheckPeriodicIncMstrcanbeEdited;
import com.spp.pages.CreateGrpInsrnceMstrwithoutClubbInSal;
import com.spp.pages.CreateGrpInsunceMstrwithClubbInSal;
import com.spp.pages.DeleteGroupInsuranceMaster;

import junit.framework.Assert;

public class GroupInsuranceMaster extends BaseTest{

	@Test(priority=0)
	public void CreateGrpInsrnceMstrwithoutClubbInSal_SC_19() throws Exception {
		CreateGrpInsrnceMstrwithoutClubbInSal cs=new CreateGrpInsrnceMstrwithoutClubbInSal(driver);
		cs.navigateMaster();
		cs.selectGroupInsurance();
		cs.clickaddGroupInsurance();
		cs.enterGroupInsurance("Group_Insurance_Master"+Utility.getRandNum(1, 10));
		cs.uncheckclubbinsalhead();
		cs.clickCreateGroupInsurance();
		String a = cs.GroupCheckNo();
		Assert.assertEquals(a, "No");
		String d=cs.getMessage();
		Assert.assertEquals(d, "Group Insurance successfully created");
		cs.clickdelete();
		cs.switchToPopUpAndAccept(driver);
	}
	
	@Test(priority=1)
	public void CreateGrpInsunceMstrwithClubbInSal_SC_20() throws Exception {
		CreateGrpInsunceMstrwithClubbInSal gc=new CreateGrpInsunceMstrwithClubbInSal(driver);
		gc.navigateMaster();
		gc.clickGroupInsuranceMaster();
		gc.clickNewGroupInsuranceMaster();
		gc.clickGroupInsuranceName("Group_Insurance_Master"+Utility.getRandNum(1, 10));
		gc.clickCreateGroupinsurance();
		String a = gc.GroupCheckYes();
		Assert.assertEquals(a, "Yes");
		String d=gc.getMessage();
		Assert.assertEquals(d, "Group Insurance successfully created");
	}
	
	@Test(priority=2)
	public void CheckGrpIncMstrcanbeEdited_SC_21() throws Exception{
	CheckGrpIncMstrcanbeEdited gi=new CheckGrpIncMstrcanbeEdited(driver);
		gi.navigateMaster();
		gi.selectGroupInsurance();
		gi.clickonedit();
		gi.enterGroupInsurance("Group_Insurance_Master"+Utility.getRandNum(1, 10));
		gi.updategrpinsurnce();
		String d=gi.getMessage();
		Assert.assertEquals(d, "Group Insurance successfully updated");	
	}
	
	
	@Test(priority=3)
	public void DeleteGroupInsuranceMaster_SC_22() throws Exception{
		DeleteGroupInsuranceMaster dg=new DeleteGroupInsuranceMaster(driver);
		dg.navigateMaster();
		dg.selectGroupInsurance();
		dg.clickDeleteGroupInsurance();
		Thread.sleep(5000);
		dg.switchToPopUpAndDismiss();
		dg.clickDeleteGroupInsurance();
		Thread.sleep(5000);
		dg.switchToPopUpAndAccept(driver);
		Thread.sleep(5000);
		String abc=dg.getMessage();
		Assert.assertEquals(abc, "Group Insurance successfully deleted");
		boolean abcd =  dg.CheckIfPresent();
		//System.out.println(abcd);
		Assert.assertEquals(false,abcd);
		//System.out.println("Completed");
	}
}