package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.CreateLeaveDefinitionwithoutAffectSalaryandAllot;
import com.spp.pages.CreateNewLeaveDefinitionOfTypeLeave;
import com.spp.pages.CreateNewLeaveDefinitionofTypeNonLeave;
import com.spp.pages.DeleteLeaveDefinition;
import com.spp.pages.UpdateLeaveDefinition;

public class LeaveDefinitions extends BaseTest {

	@Test(priority=0)
	public void verifyAddLeaveDefinitions_SC_33(){
		CreateNewLeaveDefinitionofTypeNonLeave ld=new CreateNewLeaveDefinitionofTypeNonLeave(driver);
		ld.clickonmaster();
		ld.clickleavedefinitions();
		ld.enterleavename("Non Leave");
		ld.entershortname("NW");
		ld.uncheckLeave();
		ld.createleave();
		String s=ld.getTextMessage();
		Assert.assertEquals(s, "Leave definition successfully created.");
		ld.clickonmaster();
		ld.clickleavedefinitions();
		ld.clickdelete();
	}
	
	@Test(priority=1)
	public void CreateaNewLeaveDefinitionoftypeLeave_SC_31() throws Exception{
		CreateNewLeaveDefinitionOfTypeLeave ld=new CreateNewLeaveDefinitionOfTypeLeave(driver);
		ld.clickonmaster();
		ld.clickleavedefinitions();
		ld.enterleavename("Leave1");
		ld.entershortname("L1");
		ld.considerforleave();
		ld.createleave();
		String s=ld.getTextMessage();
		Assert.assertEquals(s, "Leave definition successfully created.");
	}

	@Test(priority=2)
	public void verifyUpdatedLeaveDefinitions_SC_32() throws Exception{
		UpdateLeaveDefinition ld=new UpdateLeaveDefinition(driver);
		Thread.sleep(5000);
		ld.clickMastserLink();
		ld.selectLeaveDefinitions();
		ld.clickEditLeaveDefinition();
		Thread.sleep(2000);
		ld.enterLeaveName("Leave2");
		ld.enterShortName("LE2");
		Thread.sleep(2000);
		ld.clickConsiderForLeaveSettings();
		ld.clickUpdateButton();
		String s=ld.getMessage();
		Assert.assertEquals(s, "Leave definition successfully updated.");
	}
	
	@Test(priority=3)
	public void verifyDeletedLeaveDefinition_SC_34() throws Exception{
		DeleteLeaveDefinition ld=new DeleteLeaveDefinition(driver);
		Thread.sleep(5000);
		ld.clickMastserLink();
		ld.selectLeaveDefinitions();
		ld.clickDeleteLeaveDefinitions();
		String s=ld.getmessage();
		Assert.assertEquals(s, "Leave definition successfully deleted.");
	}
	@Test(priority=4)
	public void CreateLeaveDefinitionwithoutAffectSalaryandAllot_SC_447() throws Exception{
		CreateLeaveDefinitionwithoutAffectSalaryandAllot ld=new CreateLeaveDefinitionwithoutAffectSalaryandAllot(driver);
		ld.clickonmaster();
		ld.clickleavedefinitions();
		ld.enterleavename("Casual Leave");
		ld.entershortname("CL");
		ld.uncheckallot();
		ld.createleave();
		String s=ld.getTextMessage();
		Assert.assertEquals(s, "Leave definition successfully created.");
		ld.clickonmaster();
		ld.clickleavedefinitions();
		ld.clickdelete();
	}	
}