package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.CheckifLeaveMonthlyAttendanceGeneralLinkEmployeeMasterredirectstoEmployeeMaster;
import com.spp.pages.EnterLeaveDetailsforanEmployeewithMonthlyAttendance;
import com.spp.pages.ExcelTemplateUploadMonthlyAttendance;
import com.spp.pages.GenerateMonthlyAttendanceTemplate;

public class MonthlyAttendance extends BaseTest{
	
	@Test(priority=0)
	public void EnterLeaveDetailsforanEmployeewithMonthlyAttendance_SC_120() throws Exception{
		EnterLeaveDetailsforanEmployeewithMonthlyAttendance de = new EnterLeaveDetailsforanEmployeewithMonthlyAttendance(driver);
		de.clickonleave();
		de.clickonmonthlyattendance();
		de.selectpaymonth("Feb/2019");
		Thread.sleep(2000);
		de.selectleavepolicy("Policy_Leave");
		Thread.sleep(2000);
		de.clickongetemployees();
		Thread.sleep(2000);
		de.resizeWindow();
		Thread.sleep(2000);
		de.clickonload();
		Thread.sleep(2000);
		de.clickonmakeleaveentry();
		Thread.sleep(2000);
		de.entercompwork("1");
		de.clickonupdatevalues();
		String s=de.getMessage();
 		Assert.assertEquals(s, "Monthly attendance saved successfully");
 		Thread.sleep(3000);
 		de.clickonleave();
		de.clickonmonthlyattendance();
		de.selectpaymonth("Feb/2019");
		Thread.sleep(2000);
		de.selectleavepolicy("Policy_Leave");
		de.clickongetemployees();
		Thread.sleep(2000);
		de.clickonload();
		Thread.sleep(2000);
		de.clickonmakeleaveentry();
		Thread.sleep(2000);
		de.entercompwork("0");
		de.clickonupdatevalues();
		String r = de.getMessage();
 		Assert.assertEquals(r, "Monthly attendance saved successfully");
 		de.exitFullscreen();
 		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	public void GenerateMonthlyAttendanceTemplate_SC_487() throws Exception{
		GenerateMonthlyAttendanceTemplate de=new GenerateMonthlyAttendanceTemplate(driver);
		de.clickonleave();
		de.clickonmonthlyattendance();
		de.selectmonthlyattendance();
		Thread.sleep(2000);
		de.generatemonthlyattendance();
		Thread.sleep(2000);
		de.selectpaymonth("Jan/2019");
		de.selectleavepolicy("Policy_Leave");
		de.generatetemplate();
	}
	
	@Test(priority=2)
	public void ExcelTemplateUploadMonthlyAttendance_SC_488() throws Exception{
		ExcelTemplateUploadMonthlyAttendance upl = new ExcelTemplateUploadMonthlyAttendance(driver);
		upl.clickonleave();
		upl.clickonmonthlyattendance();
		Thread.sleep(2000);
		upl.selectmonthlyattendance();
		Thread.sleep(2000);
		upl.uploadmonthlyattendance();
		Thread.sleep(2000);
		upl.UploadExcelFile("C:\\Users\\alfalabs\\Downloads\\MonthlyAttendance.xlsx");
		Thread.sleep(2000);
		upl.clickUploadFile();
		String s = upl.getMessage();
 		Assert.assertEquals(s, "Monthly Attendance has been successfully uploaded.");
 		upl.clickonleave();
		upl.clickonmonthlyattendance();
		Thread.sleep(2000);
		upl.selectpaymonth("Jan/2019");
		Thread.sleep(2000);
		upl.selectleavepolicy("Policy_Leave");
		Thread.sleep(2000);
		upl.clickongetemployees();
		Thread.sleep(2000);
		upl.resizeWindow();
		Thread.sleep(2000);
		upl.clickonload();
		Thread.sleep(2000);
		upl.clickonmakeleaveentry();
		Thread.sleep(2000);
		upl.entercompwork("0");
		upl.clickonupdatevalues();
		Thread.sleep(3000);
		String r = upl.getMessage();
 		Assert.assertEquals(r, "Monthly attendance saved successfully");
 		Thread.sleep(3000);
 		upl.exitFullscreen();
 		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void CheckifLeaveMonthlyAttendanceGeneralLinkEmployeeMasterredirectstoEmployeeMaster_SC_489() throws Exception{
		CheckifLeaveMonthlyAttendanceGeneralLinkEmployeeMasterredirectstoEmployeeMaster la=new CheckifLeaveMonthlyAttendanceGeneralLinkEmployeeMasterredirectstoEmployeeMaster(driver);
		la.clickonleave();
		la.clickonmonthlyattendance();
		//la.clickongenerallinks();
		la.clickonemployeemaster();
		Thread.sleep(2000);
		la.addnewemployee();
		la.enterEmployeeid("ABC12983NVM");
		la.enterEmployeeref("Ref-"+Utility.getRandNum(100, 200));
		la.enterEmployeename("Reena");
		la.enterEmployeefather("Suresh");
		la.selectDateofBirth("06 June 1995");
		la.selectGender("Female");
		la.selectMaritalStatus("Single");
		la.selectDateofJoining("06 June 2018");
		Thread.sleep(2000);
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
 		Thread.sleep(2000);
 		la.resizeWindow();
 		la.clickfilteremployee();
 		Thread.sleep(2000);
 		la.clickonload();
		Thread.sleep(2000);
 		la.clickdelete();
 		la.switchToPopUpAndAccept(driver);
 		la.exitFullscreen();
	}
}