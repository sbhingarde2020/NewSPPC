package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.pages.CreateState;
import com.spp.pages.DeleteState;
import com.spp.pages.UpdateState;

public class States extends BaseTest{

	@Test(priority=0)
	public void verifyCreatedState_SC_61(){
		CreateState cs=new CreateState(driver);
		cs.clickMastserLink();
		cs.selectState();
		cs.enterStateName("Arunachal Pradesh Original");
		cs.clickCreateButton();
		String s=cs.getMessage();
		Assert.assertEquals(s, "State was created successfully.");
	}

	@Test(priority=1)
	public void verifyUpdatedState_SC_324() throws Exception{
		UpdateState us=new UpdateState(driver);
		us.clickMastserLink();
		us.selectState();
		us.clickEditIcon();
		Thread.sleep(4000);
		us.enterStateName("Arunachal Pradesh");
		us.clickUpdateButton();
		String s=us.getMessage();
		Assert.assertEquals(s, "State was successfully updated.");
	}

	@Test(priority=2)
	public void verifyDeletedState_SC_325(){
		DeleteState ds=new DeleteState(driver);
		ds.clickMastserLink();
		ds.selectState();
		ds.clickDeleteButton();
		String s=ds.getMessage();
		Assert.assertEquals(s, "State was successfully deleted.");
	}
}