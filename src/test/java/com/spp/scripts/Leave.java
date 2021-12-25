package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.CreateaNewLeaveDefinitionoftypeNonLeave;
import com.spp.pages.AddLeaveDefinitions;
import com.spp.pages.CreateNewLeaveDefinitionOfTypeLeave;
import com.spp.pages.CreateNewLeaveDefinitionofTypeNonLeave;
import com.spp.pages.CreateNewLeavewithoutAffectSalandAllot;
import com.spp.pages.DeleteLeaveDefinition;
import com.spp.pages.UpdateLeaveDefinition;

public class Leave extends BaseTest {

/*@Test(priority=0)
	public void verifyAddLeaveDefinitions_SC_33() throws Exception{
		AddLeaveDefinitions ld=new AddLeaveDefinitions(driver);
		ld.clickMastserLink();
		ld.selectLeaveDefinitions();
		ld.enterLeaveName("newleave");
		ld.enterShortName("nw");
		ld.clickCreateDefinition();
		String s=ld.getTextMessage();
		Assert.assertEquals(s, "Leave definition successfully created.");
	} 

	@Test(priority=1)
	public void verifyUpdatedLeaveDefinitions_SC_32() throws Exception{
		UpdateLeaveDefinition ld=new UpdateLeaveDefinition(driver);
		Thread.sleep(5000);
		ld.clickMastserLink();
		ld.selectLeaveDefinitions();
		ld.clickEditLeaveDefinition();
		Thread.sleep(2000);
		ld.enterLeaveName("pune1");
		ld.enterShortName("n11");
		Thread.sleep(2000);
		ld.clickConsiderForLeaveSettings();
		ld.clickUpdateButton();
		String s=ld.getMessage();
		Assert.assertEquals(s, "Leave definition successfully updated.");
	}	
	
		@Test(priority=2)
	public void verifyDeletedLeaveDefinition_SC_34() throws Exception{
		DeleteLeaveDefinition ld=new DeleteLeaveDefinition(driver);
		Thread.sleep(5000);
		ld.clickMastserLink();
		ld.selectLeaveDefinitions();
		ld.clickDeleteLeaveDefinitions();
		String s=ld.getmessage();
		Assert.assertEquals(s, "Leave definition successfully deleted.");
	}
		@Test(priority=3)
	public void CreateNewLeaveDefinitionofTypeNonLeave_SC_31() throws Exception{
		CreateNewLeaveDefinitionofTypeNonLeave ld=new CreateNewLeaveDefinitionofTypeNonLeave(driver);
		ld.clickonmaster();
		ld.clickleavedefinitions();
		ld.enterleavename("Non Leave");
		ld.entershortname("NL");
		ld.uncheckLeave();
		ld.createleave();
		String s=ld.getTextMessage();
		Assert.assertEquals(s, "Leave definition successfully created.");
		ld.clickdelete();
		
	}
	@Test(priority=4)
	public void CreateNewLeavewithoutAffectSalandAllot_SC_447() throws Exception{
		CreateNewLeavewithoutAffectSalandAllot ld=new CreateNewLeavewithoutAffectSalandAllot(driver);
		ld.clickonmaster();
		ld.clickleavedefinitions();
		ld.enterleavename("Paid Leave");
		ld.entershortname("PL");
		ld.uncheckallot();
		ld.createleave();
		String s=ld.getTextMessage();
		Assert.assertEquals(s, "Leave definition successfully created.");
		ld.clickdelete();
	}*/
	
}