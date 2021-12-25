package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.CheckInsuranceMastercanbeEdited;
import com.spp.pages.CreateIMwithClubbedInSal;
import com.spp.pages.CreateIMwithoutClubbedInSal;
import com.spp.pages.DeleteInsuranceMaster;

import junit.framework.Assert;

public class InsuranceMaster extends BaseTest{

	@Test(priority=0)
	public void CreateIMwithoutClubbedInSal_SC_15() throws Exception {
		CreateIMwithoutClubbedInSal lm=new CreateIMwithoutClubbedInSal(driver);
		lm.clickonmaster();
		lm.clickoninsurancemaster();
		lm.addnewinsurancemaster();
		lm.enterinsurancename("Insurance_Master"+Utility.getRandNum(1, 10));
		lm.uncheckclubbinsalhead();
		Thread.sleep(2000);
		lm.createinsurance();
		Thread.sleep(2000);
		String d=lm.getMessage();
		Assert.assertEquals(d, "Insurance successfully created");
		String a = lm.CheckNoBtn();
		Assert.assertEquals(a, "No");
		lm.clickdelete();
		lm.switchToPopUpAndAccept(driver);
	}
	@Test(priority=1)
	public void CreateIMwithClubbedInSal_SC_16() throws Exception {
		CreateIMwithClubbedInSal cs=new CreateIMwithClubbedInSal(driver);
		cs.clickonmaster();
		cs.clickoninsurancemaster();
		cs.addnewinsurancemaster();
		cs.enterinsurancename("Insurance_Master"+Utility.getRandNum(1, 10));
		Thread.sleep(2000);
		cs.createinsurance();
		Thread.sleep(2000);
		String a = cs.CheckYesBtn();
		Assert.assertEquals(a, "Yes");
		String d=cs.getMessage();
		Assert.assertEquals(d, "Insurance successfully created");	
	}
	@Test(priority=2)
	public void CheckInsuranceMastercanbeEdited_SC_17() throws Exception {
		CheckInsuranceMastercanbeEdited cs=new CheckInsuranceMastercanbeEdited(driver);
		cs.clickonmaster();
		cs.clickoninsurancemaster();
		cs.clickonedit();
		cs.enterinsurancename("Insurance_Master"+Utility.getRandNum(1, 10));
		Thread.sleep(2000);
		cs.updateinsurance();
		Thread.sleep(2000);
		String d=cs.getMessage();
		Assert.assertEquals(d, "Insurance successfully updated");	
	}
	@Test(priority=3)
	public void DeleteInsuranceMaster_SC_18() throws Exception{
		DeleteInsuranceMaster di=new DeleteInsuranceMaster(driver);
		di.navigateMaster();
		di.clickInsuranceMaster();
		di.clickDeleteInsuranceMaster();
		Thread.sleep(2000);
		di.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		di.clickDeleteInsuranceMaster();
		Thread.sleep(2000);
		di.switchToPopUpAndAccept(driver);
		String abc=di.getMessage();
		Assert.assertEquals(abc, "Insurance successfully deleted");
		boolean abcd =  di.CIfPresent();
		Assert.assertEquals(false,abcd);
	}	
}