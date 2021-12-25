package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AddHRDetails;
import com.spp.pages.CreateHRCategory;
import com.spp.pages.CreateHRCategorywithoutRequired;
import com.spp.pages.DeleteHRCategory;
import com.spp.pages.DeleteHRDetails;
import com.spp.pages.EditHRCategory;
import com.spp.pages.EditHRDetails;

public class HRCategory extends BaseTest{

	@Test(priority=0)
	public void verifyCreatedHRCategory_SC_67(){
		CreateHRCategory ch=new CreateHRCategory(driver);
		ch.clickMastserLink();
		ch.selectHRCategory();
		ch.enterHRName("ContactAddress13");
		ch.clickCreateButton();
		String s=ch.getMessage();
		Assert.assertEquals(s, "HR Category created successfully.");
	}

	@Test(priority=1)
	public void verifyUpdatedHRCategory_SC_70() throws Exception{
		EditHRCategory eh=new EditHRCategory(driver);
		eh.clickMastserLink();
		eh.selectHRCategory();
		eh.clickNextButton();
		Thread.sleep(5000);
		eh.clickEditIcon();
		Thread.sleep(5000);
		eh.enterHRName("Contanct Phone number");
		eh.clickUpdateButton();
		String s=eh.getMessage();
		Assert.assertEquals(s, "HR Category updated successfully.");
	}

	@Test(priority=2)
	public void verifyCreatedHRDetails_SC_69(){
		AddHRDetails ad=new AddHRDetails(driver);
		ad.clickMastserLink();
		ad.selectHRCategory();
		ad.clickNextButton();
		ad.clickDetailsLink();
		ad.enterLabelName("address3");
		ad.clickRequiredBox();
		ad.clickCreateButton();
		String s=ad.getMessage();
		Assert.assertEquals(s, "HR Category Detail created successfully.");
	}

	@Test(priority=3)
	public void verifyUpdatedHRDetails_SC_354() throws InterruptedException{
		EditHRDetails eh=new EditHRDetails(driver);
		eh.clickMastserLink();
		eh.selectHRCategory();
		eh.clickNextButton();
		eh.clickDetailsLink();
		eh.clickEditIcon();
		Thread.sleep(5000);
		eh.enterLabelName("address81");
		Thread.sleep(5000);
		eh.clickRequiredBox();
		eh.clickUpdateButton();
		String s=eh.getMessage();
		Assert.assertEquals(s, "HR Category Detail updated successfully.");
	}

		@Test(priority=4)
	public void verifyDeletedHRDetails_SC_355(){
		DeleteHRDetails ah=new DeleteHRDetails(driver);
		ah.clickMastserLink();
		ah.selectHRCategory();
		ah.clickNextButton();
		ah.clickDetailsLink();
		ah.clickDeleteButton();
		String s=ah.getMessage();
		Assert.assertEquals(s, "HR Category Detail was successfully deleted.");
	}

		@Test(priority=5)
	public void verifyDeletedHRCategory_SC_68(){
		DeleteHRCategory dh=new DeleteHRCategory(driver);
		dh.clickMastserLink();
		dh.selectHRCategory();
		dh.clickNextButton();
		dh.clickDeleteButton();
		String s=dh.getMessage();
		Assert.assertEquals(s, "HR Category was successfully deleted.");
	} 
	
		@Test(priority=6)
	public void CreateHRCategorywithoutRequired_SC_451() throws Exception{
		CreateHRCategorywithoutRequired cr=new CreateHRCategorywithoutRequired(driver);
		cr.clickMastserLink();
		cr.selectHRCategory();
		cr.clickondetails();
		cr.enterlabel("Driving License No");
		cr.clickCreateButton();
		String s=cr.getMessage();
		Assert.assertEquals(s, "HR Category Detail created successfully.");
		cr.deletedetail();
		Thread.sleep(5000);
	}
}