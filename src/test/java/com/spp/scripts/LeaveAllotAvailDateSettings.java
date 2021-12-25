package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.CheckifEmployeeLeaveAllotAvailDateSettingsGeneralLinkredirectstoEmployeeMaster;
import com.spp.pages.TocheckEmployeeswithDOJ01AprilareloadedintheAllotAvailDateConfigurations;
import com.spp.pages.ToupdateLeaveAllotAvailDateSettingsviaExcelUpload;
import com.spp.pages.UpdateLeaveAllotAvailDateSettingsInBulk;

public class LeaveAllotAvailDateSettings extends BaseTest {
	
	/*@Test(priority=0)
	public void UpdateLeaveAllotAvailDateSettingsInBulk_SC_107() throws Exception{
	UpdateLeaveAllotAvailDateSettingsInBulk af=new UpdateLeaveAllotAvailDateSettingsInBulk(driver);
		af.selectEmployee();
		af.selectLeaveAllotAvail();
		af.selectLeaveType("Leave (L)");
		af.resizeWindow();
		af.selectGetEmployee();
		Thread.sleep(5000);
		af.selectLoadButton();
		af.selectMoreLink();
		Thread.sleep(3000);
		af.selectAllotFrom("16 May 2019");
		af.selectAvailFrom("25 May 2019");
		Thread.sleep(4000);
		af.selectUpdateButton();
		Thread.sleep(5000);
		String s=af.getMessage();
 		Assert.assertEquals(s, "Leave Allot/Avail Date configuration successfully updated.");
 		af.selectMoreLink1();
 		af.exitFullscreen();
		}
		
	@Test(priority=1)
	public void CheckifEmployeeLeaveAllotAvailDateSettingsGeneralLinkredirectstoEmployeeMaster_SC_473() throws Exception{
		CheckifEmployeeLeaveAllotAvailDateSettingsGeneralLinkredirectstoEmployeeMaster la=new CheckifEmployeeLeaveAllotAvailDateSettingsGeneralLinkredirectstoEmployeeMaster(driver);
		la.clickonemployee();
		la.clickonleaveallotdetails();
		la.clickongenerallinks();
		Thread.sleep(2000);
		la.clickonemployeemaster();
		Thread.sleep(2000);
		la.addnewemployee();
		la.enterEmployeeid("ABC123");
		la.enterEmployeeref("1234569786");
		la.enterEmployeename("Pooja");
		la.enterEmployeefather("Harish");
		la.selectDateofBirth("06 June 1995");
		la.selectGender("Female");
		la.selectMaritalStatus("Single");
		la.selectDateofJoining("06 June 2018");
		Thread.sleep(500);
		la.clickPresentAddress();
		la.selectState("Maharashtra");
		la.selectclassificationdetail();
		la.selectsalstructure("Structure");
		Thread.sleep(2000);
		la.selectbranch("default");
		Thread.sleep(2000);
		la.selectattendancestructure("Karnataka");
		la.selectbank("CASH");
		la.selectleavepolicy("ClonePolicy");
		la.createemployee();
		String s=la.getMessage();
 		Assert.assertEquals(s, "Employee successfully created");
	}
	
	@Test(priority=2)
	public void ToupdateLeaveAllotAvailDateSettingsviaExcelUpload_SC_108() throws Exception{
	ToupdateLeaveAllotAvailDateSettingsviaExcelUpload laads = new ToupdateLeaveAllotAvailDateSettingsviaExcelUpload(driver);
		laads.clickonemployee();
		laads.clickonleaveallotdetails();
		laads.clickonGenerateSample();
		Thread.sleep(3000);
		laads.selectLeaveType("Leave (L)");
		Thread.sleep(3000);
		laads.clickGenerateSampleExcelTemplate();
		Thread.sleep(3000);
		laads.clickonemployee();
		Thread.sleep(3000);
		laads.clickonleaveallotdetails();
		Thread.sleep(3000);
		laads.clickExcelTemplateUpload();
		Thread.sleep(3000);
		laads.clickChooseFile("C:\\Users\\Administrator\\Downloads\\AllotAvailFromDateSetting20190415-6447-5giaiu.xlsx");
		Thread.sleep(3000);
		laads.clickUploadLink();
		Thread.sleep(3000);
		laads.selectLeaveType("Leave (L)");
		laads.resizeWindow();
		laads.selectGetEmployee();
		Thread.sleep(5000);
		laads.selectLoadButton();
		Thread.sleep(3000);
		laads.selectMoreLink();
		Thread.sleep(3000);
		laads.exitFullscreen();
	}*/
	
	@Test(priority=3)
	public void TocheckEmployeeswithDOJ01AprilareloadedintheAllotAvailDateConfigurations_SC_1633() throws Exception{
	TocheckEmployeeswithDOJ01AprilareloadedintheAllotAvailDateConfigurations lad = new TocheckEmployeeswithDOJ01AprilareloadedintheAllotAvailDateConfigurations(driver);
		/*lad.navigateEmployee();
		lad.clickEmployeeDetails();
		lad.clickAddNewEmployee();
		Thread.sleep(1000);
		lad.enterEmployeeId("ID001");
		lad.enterEmployeeRefNo("Ref-"+Utility.getRandNum(10, 100));
		lad.enterEmployeeName("Nandita");
		lad.enterFathername("Anand");
		lad.enterdob("14 June 1980");
		lad.selectGender("Female");
		lad.selectMaritalStatus("Single");
		lad.enterdoj("01 November 2018");
		lad.entersaldate("01 November 2018");
		Thread.sleep(1000);
		lad.selectPresentadd();
		lad.selectstate("Maharashtra");
		Thread.sleep(1000);
		lad.selectstatdetails();
		lad.checkTDS();
		lad.selectpanoption("ADD PAN");
		lad.enterpanno("PRAPM"+Utility.getRandNum(4441, 4966)+"P");
		lad.entereffectivedatePAN("01 November 2018");
		Thread.sleep(1000);
		lad.selectclassificationdetail();
		lad.selectsalstructure("Structure");
		lad.selectbranch("default");
		lad.selectattendancestructure("Karnataka");
		lad.selectbank("CASH");
		lad.selectleavepolicy("Default");
		Thread.sleep(2000);
		lad.selectdesignation("Tester");
		Thread.sleep(2000);
		lad.createemployee();
		String s=lad.getMessage();
		Assert.assertEquals(s, "Employee successfully created");*/
		lad.navigateEmployee();
		lad.clickonleaveallotdetails();
		Thread.sleep(2000);
		lad.LeaveTypeDropdownSelect("Casual Leave (CL)");
		lad.clickGetEmployeesBtn();
		lad.resizeWindow();
		Thread.sleep(5000);
		lad.clickAdvanceFilter();
		Thread.sleep(2000);
		lad.checkDOJCheckbox();
		lad.writeDOJFrom("01 Apr, 2018");
		Thread.sleep(2000);
		lad.writeDOJTo("01 Apr, 2018");
		Thread.sleep(2000);
		lad.checkResignedCheckbox();
		lad.clickViewBtn();
		Thread.sleep(5000);
		lad.clickAFLoadBtn();
		Thread.sleep(5000);
		Assert.assertEquals(lad.ifexists(), false);
		lad.clickGetEmployeesBtn();
		Thread.sleep(5000);
		lad.clickAdvanceFilter();
		Thread.sleep(2000);
		lad.writeDOJFrom("01 Apr, 2018");
		Thread.sleep(2000);
		lad.writeDOJTo("02 Apr, 2018");
		Thread.sleep(2000);
		lad.clickViewBtn();
		Thread.sleep(5000);
		lad.clickAFLoadBtn();
		Thread.sleep(5000);
		Assert.assertEquals(lad.ifexists1(), true);
		Thread.sleep(2000);
		lad.exitFullscreen();
	}
}