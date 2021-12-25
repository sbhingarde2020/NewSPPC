package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.CheckifEmployeeLeaveAllotAvailDateSettingsGeneralLinkredirectstoEmployeeMaster;
import com.spp.pages.CheckifEmployeeManualLeaveAllotmentGeneralLinkredirectstoEmployeeMaster;
import com.spp.pages.ManualLeaveAllotment;

public class ManualLeaveAllotmentscript extends BaseTest {
	
	@Test(priority=0)
	public void ManualLeaveAllotment_SC_106() throws Exception{
	ManualLeaveAllotment rt = new ManualLeaveAllotment(driver);
		rt.selectEmployee();
		rt.selectManualLeaveAllotment();
		rt.selectPayMonth("Mar/2019");
		rt.selectLeavePolicy("Default");
		Thread.sleep(4000);
		rt.selectLeaveType("Leave");
		rt.selectGetEmployee();
		rt.resizeWindow();
		Thread.sleep(5000);
		rt.selectLoadButton();
		Thread.sleep(4000);
		rt.selectAllotedBox("3");
		rt.selectUpdateLeaveAllotmentButton();
		String a=rt.getMessage();
		Assert.assertEquals(a, "Leave allotment details successfully saved.");
		rt.exitFullscreen();
		}
	
	@Test(priority=1)
	public void CheckifEmployeeManualLeaveAllotmentGeneralLinkredirectstoEmployeeMaster_SC_475() throws Exception{
		CheckifEmployeeManualLeaveAllotmentGeneralLinkredirectstoEmployeeMaster la=new CheckifEmployeeManualLeaveAllotmentGeneralLinkredirectstoEmployeeMaster(driver);
		la.clickonemployee();
		la.clickonmanualleaveallot();
		Thread.sleep(2000);
		la.clickonemployeemaster();
		Thread.sleep(2000);
		la.addnewemployee();
		la.enterEmployeeid("ABC12345");
		la.enterEmployeeref("1234569786099");
		la.enterEmployeename("Prachi");
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
		la.selectbranch("default");
		la.selectattendancestructure("Karnataka");
		la.selectbank("CASH");
		la.selectleavepolicy("Default");
		la.createemployee();
		String s=la.getMessage();
 		Assert.assertEquals(s, "Employee successfully created");
 		la.clickonemployee();
 		la.clickEmployeeDetails();
 		la.clickonfilter();
 		la.resizeWindow();
		Thread.sleep(2000);
		la.clickonload();
		Thread.sleep(2000);
		la.clickDeleteUser();
		Thread.sleep(2000);
		la.switchToPopUpAndAccept(driver);
		la.exitFullscreen();
	}
}