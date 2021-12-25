package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.CreateNewReportingAuthority;
import com.spp.pages.LinkEmployee;
import com.spp.pages.UnlinkEmployee;

public class ReportingAuthority extends BaseTest {

	@Test(priority=0)
	public void CreateNewReportingAuthority_SC_377() throws Exception{
		CreateNewReportingAuthority rt = new CreateNewReportingAuthority(driver);
		rt.selectEmployee();
		rt.selectReportingAuth();
		rt.selectCreateNewAuthority();
		rt.selectReportTo("Employee Name");
		rt.enterName("Anil (Ref-120)");
		rt.selectGetEmployeeButton();
		rt.resizeWindow();
		Thread.sleep(5000);
		rt.selectLoadButton();
		Thread.sleep(5000);
		String a=rt.getMessage();
		Assert.assertEquals(a, "Employees Successfully Loaded.");
		rt.selectCreateButton();
		String c=rt.getMessage1();
		Assert.assertEquals(c, "Employees Workflow created successfully");
		Thread.sleep(5000);
		rt.selectReportingAuthorityPage();
		rt.exitFullscreen();
}
	/*@Test(priority=1)
	public void UnlinkEmployee_SC_378() throws Exception{
		UnlinkEmployee rt = new UnlinkEmployee(driver);
		rt.selectEmployee();
		rt.selectReportingAuth();
		rt.selectUnlink();
		Thread.sleep(4000);
		rt.selectCheckBox();
		rt.selectUnlinkEmployeeButton();
		String w=rt.getMessage();
		Assert.assertEquals(w, "Employees unlinked successfully.");
	}	
	
	@Test(priority=2)
	public void LinkEmployee_SC_379() throws Exception{
		LinkEmployee rt = new LinkEmployee(driver);
		rt.selectEmployee();
		rt.selectReportingAuth();
		rt.selectLink();
		rt.selectGetEmployee();
		Thread.sleep(5000);
		rt.selectLoadButton();
		String w=rt.getMessage();
		Assert.assertEquals(w, "Employees Successfully Loaded.");
		rt.selectUncheck();
		rt.selectcheckBox();
		rt.selectLinkEmployee();
		String y=rt.getMessage1();
		Assert.assertEquals(y, "Employees linked successfully.");
	}*/		
}