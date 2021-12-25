package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.CheckifEmployeeLeaveAllotAvailDateSettingsGeneralLinkredirectstoEmployeeMaster;
import com.spp.pages.CheckifEmployeeSetLeaveOpeningBalanceGeneralLinkEmployeeMasterredirectstoEmployeeMastertoAddNewEmployee;
import com.spp.pages.SetOpeningBalanceForEmployee;
import com.spp.pages.TosetLeaveOpeningBalanceviaExcelUpload;

import org.testng.Assert;

public class SetLeaveOpeningBalance extends BaseTest{
	
	/*@Test(priority=0)
	public void SetOpeningBalanceForEmployee_SC_104() throws Exception{
	SetOpeningBalanceForEmployee ty = new SetOpeningBalanceForEmployee(driver);
		ty.selectEmployee();
		ty.selectSetOpeningBalance();
		ty.selectLeaveType("Leave (L)");
		ty.selectGetEmployeeButtone();
		ty.resizeWindow();
		Thread.sleep(4000);
		ty.selectLoadButton();
		ty.selectMoreButton();
		Thread.sleep(2000);
		ty.selectOpeningBalance("2000");
		ty.selectUpdate();
		String d=ty.getMessage();
		Assert.assertEquals(d, "Leave Opening Balance successfully created.");
		ty.exitFullscreen();
		}
		
	@Test(priority=1)
	public void CheckifEmployeeSetLeaveOpeningBalanceGeneralLinkEmployeeMasterredirectstoEmployeeMastertoAddNewEmployee_SC_474() throws Exception{
	CheckifEmployeeSetLeaveOpeningBalanceGeneralLinkEmployeeMasterredirectstoEmployeeMastertoAddNewEmployee la=new CheckifEmployeeSetLeaveOpeningBalanceGeneralLinkEmployeeMasterredirectstoEmployeeMastertoAddNewEmployee(driver);
		la.clickonemployee();
		la.clickonsetleaveopeningbalance();
		la.clickongenerallinks();
		Thread.sleep(2000);
		la.clickonemployeemaster();
		Thread.sleep(2000);
		la.addnewemployee();
		la.enterEmployeeid("ABC1234");
		la.enterEmployeeref("123456ABC");
		la.enterEmployeename("Preeti");
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
		}*/
	
	@Test(priority=2)
	public void TosetLeaveOpeningBalanceviaExcelUpload_SC_105() throws Exception{
	TosetLeaveOpeningBalanceviaExcelUpload obj = new TosetLeaveOpeningBalanceviaExcelUpload(driver);
		obj.clickonemployee();
		obj.selectSetOpeningBalance();
		obj.clickonGenerateSample();
		Thread.sleep(3000);
		obj.selectLeaveType("Leave (L)");
		Thread.sleep(3000);
		obj.clickGenerateSampleExcelTemplate();
		Thread.sleep(3000);
		obj.clickonemployee();
		Thread.sleep(3000);
		obj.selectSetOpeningBalance();
		Thread.sleep(3000);
		obj.clickExcelTemplateUpload();
		Thread.sleep(3000);
		obj.clickChooseFile("C:\\Users\\alfalabs\\Downloads\\LeaveOpeningBalanceUploadExcel20190415-6447-1hjlvu8.xlsx");
		Thread.sleep(3000);
		obj.clickUploadLink();
		Thread.sleep(3000);
		obj.selectLeaveType1("Leave (L)");
		obj.resizeWindow();
		obj.selectGetEmployee();
		Thread.sleep(5000);
		obj.selectLoadButton();
		Thread.sleep(3000);
		obj.selectMoreLink();
		Thread.sleep(3000);
		obj.exitFullscreen();
	}
}