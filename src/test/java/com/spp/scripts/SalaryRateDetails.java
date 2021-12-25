package com.spp.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.spp.common.BaseTest;
import com.spp.pages.AllotSalaryNotOnGross;
import com.spp.pages.AllotSalaryToEmployee;
import com.spp.pages.AllotSalaryViaExcel;
import com.spp.pages.AllotSalarytoanemployeeAfterchangingSalaryStructure;
import com.spp.pages.AssignNewHeadtoStructure;
import com.spp.pages.CheckIfSalHeadisAssignInSalStructure;
import com.spp.pages.CreateSalaryGroupusingEmployee;
import com.spp.pages.CreateSalaryHeadusingEmployee;
import com.spp.pages.EditClassificationDetailsChangeSalaryStructureofanemployee;

public class SalaryRateDetails extends BaseTest {

	/*@Test(priority=0)
	public void verifyAllotSalaryToEmployee_SC_98() throws Exception {
	AllotSalaryToEmployee rr= new AllotSalaryToEmployee(driver);
		rr.clickEmployeeLink();
		rr.selectSalaryRateDetails();
		rr.resizeWindow();
		rr.selectAdvancedFilterIcon();
		Thread.sleep(3000);
		rr.selectLoadButton();
		Thread.sleep(3000);
		rr.selectAllotSalaryButton();
		Thread.sleep(3000);
		rr.selectEffectiveFrom("Feb/2019");
		rr.selectGetRate();
		Thread.sleep(3000);
		rr.enterGrossSal("40000");
		Thread.sleep(3000);
		rr.SalAllotEarnings("20000");
		Thread.sleep(3000);
		//rr.enterMess("2000");
		//rr.selectPopulateButton();
		rr.SelectSaveButton();
 		String s=rr.getMessage();
 		Assert.assertEquals(s, "Salary Allotted successfully");
		Thread.sleep(3000);
		rr.ClickSalaryAlloted();
		rr.ClickEdit();
		Thread.sleep(3000);
		rr.selectEffectiveFrom("Feb/2019");
		rr.selectGetRate();
		Thread.sleep(3000);
		rr.enterGrossSal("0.00");
		Thread.sleep(3000);
		rr.SalAllotEarnings("0.00");
		Thread.sleep(3000);
		rr.SelectSaveButton();
		rr.exitFullscreen();
		}
	
	@Test(priority=1)
	public void verifyAllotSalaryNotOnGross_SC_99() throws Exception {
		AllotSalaryNotOnGross rr= new AllotSalaryNotOnGross(driver);
		rr.clickEmployeeLink();
		rr.selectSalaryRateDetails();
		rr.resizeWindow();
		rr.selectAdvancedFilterIcon();
		Thread.sleep(3000);
		rr.selectLoadButton();
		Thread.sleep(2000);
		rr.selectAllotSalaryButton();
		Thread.sleep(3000);
		rr.selectEffectiveFrom("Mar/2019");
		rr.selectGetRate();
		Thread.sleep(3000);
		rr.enterGrossSal("40000");
		Thread.sleep(3000);
		rr.SalAllotEarnings("20000");
		Thread.sleep(3000);
		rr.SelectSaveButton();
 		String s=rr.getMessage();
 		Assert.assertEquals(s, "Salary Allotted successfully");
 		Thread.sleep(3000);
		rr.ClickSalaryAlloted();
		rr.ClickEdit();
		Thread.sleep(3000);
		rr.selectEffectiveFrom("Mar/2019");
		rr.selectGetRate();
		Thread.sleep(3000);
		rr.enterGrossSal("0.00");
		Thread.sleep(3000);
		rr.SalAllotEarnings("0.00");
		Thread.sleep(3000);
		rr.SelectSaveButton();
		rr.exitFullscreen();
	}
	
	@Test(priority=2)
	public void verifyAllotSalaryViaExcel_SC_100() throws Exception {
		AllotSalaryViaExcel aa= new AllotSalaryViaExcel(driver);
		aa.clickEmployeeLink();
		aa.selectSalaryRateDetails();
		aa.selectSalaryRateTemplate();
		aa.selectMonthYear("Mar/2019");
		aa.selectSalaryStructure("Structure");
		aa.selectGetClick();
		aa.resizeWindow();
		Thread.sleep(2000);
		aa.selectLoadButton();
		Thread.sleep(2000);
		aa.uncheckCheckbox();
		Thread.sleep(2000);
		aa.selectGenerateFileButton();
		Thread.sleep(2000);
		aa.clickEmployeeLink();
		aa.selectSalaryRateDetails();
		aa.clickUploadSalaryRates();
		aa.selectMonthYear("Mar/2019");
		aa.clickChooseFile("C:\\Users\\Administrator\\Downloads\\SalaryAllotment.xlsx");
		Thread.sleep(3000);
		aa.clickExcelTemplateUpload();
		Thread.sleep(3000);
		aa.clickEmployeeLink();
		aa.selectSalaryRateDetails();
		Thread.sleep(3000);
		aa.ClickSalaryAlloted();
		aa.ClickEdit();
		Thread.sleep(3000);
		aa.selectEffectiveFrom("Mar/2019");
		aa.selectGetRate();
		Thread.sleep(3000);
		aa.enterGrossSal("0.00");
		Thread.sleep(3000);
		aa.SalAllotEarnings("0.00");
		Thread.sleep(3000);
		aa.SelectSaveButton();
		aa.exitFullscreen();
	}*/
	
	@Test(priority=3)
	public void EditClassificationDetailsChangeSalaryStructureofanemployee_SC_410() throws Exception{
	EditClassificationDetailsChangeSalaryStructureofanemployee dw= new EditClassificationDetailsChangeSalaryStructureofanemployee(driver);
		dw.clickonemployee();
		dw.clickonemployeedetails();
		dw.resizeWindow();
		dw.clickonfilter();
		Thread.sleep(2000);
		dw.clickonload();
		Thread.sleep(2000);
		dw.clickonview();
		Thread.sleep(2000);
		dw.clickonclassificationdetails();
		Thread.sleep(1000);
		dw.clickonedit();
		dw.selectsalarystructure("Gross_Structure");
		dw.updateclassificationdetails();
		Thread.sleep(2000);
		dw.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		dw.updateclassificationdetails();
		Thread.sleep(2000);
		dw.switchToPopUpAndAccept(driver);
		String message = dw.getMessage();
		Assert.assertEquals(message, "Employee detail was successfully updated.");
		dw.exitFullscreen();
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void AllotSalarytoanemployeeAfterchangingSalaryStructure_SC_411() throws Exception{
		AllotSalarytoanemployeeAfterchangingSalaryStructure dw= new AllotSalarytoanemployeeAfterchangingSalaryStructure(driver);
		dw.clickonemployee();
		dw.clickonsalaryratedetails();
		dw.selectsalaryallotedtab();
		dw.resizeWindow();
		dw.clickonfilter();
		Thread.sleep(2000);
		dw.clickonload();
		Thread.sleep(2000);
		dw.clickonedit();
		Thread.sleep(2000);
		dw.selectefffrom("Dec/2018");
		dw.clickongetrate();
		Thread.sleep(2000);
		dw.entergrosssalary("25000");
		dw.clickonsave();
		String message = dw.getMessage();
		Assert.assertEquals(message, "Salary Allotted successfully");
		dw.exitFullscreen();
	}
	
	@Test(priority=5)
	public void AssignNewHeadtoStructure_SC_412() throws Exception{
		AssignNewHeadtoStructure hs= new AssignNewHeadtoStructure(driver);
		hs.clickonmaster();
		hs.clickonsalarystructure();
		hs.clickonsettings();
		hs.assignnewhead();
		hs.selectsalhead("basic1");
		hs.selectcalculationtype("Every Month");
		hs.selectbasedon("Present Days");
		hs.checkpf();
		hs.checkesi();
		hs.selectefffrommonth("Feb/2019");
		hs.selectroundoff("Higher Rupee");
		hs.createsalarygrpdetail();
		String message = hs.getMessage();
		Assert.assertEquals(message, "Salary structure detail successfully created");
	}
	
	@Test(priority=6)
	public void CheckIfSalHeadisAssignInSalStructure_SC_413() throws Exception{
		CheckIfSalHeadisAssignInSalStructure ss=new CheckIfSalHeadisAssignInSalStructure(driver);
		ss.clickonemployee();
		ss.clickonsalaryratedetails();
		ss.selectsalaryallotedtab();
		Thread.sleep(2000);
		ss.resizeWindow();
		Thread.sleep(2000);
		ss.clickonfilter();
		Thread.sleep(2000);
		ss.clickonload();
		Thread.sleep(2000);
		ss.clickonedit();
		Thread.sleep(1000);
		System.out.println("Salary Head is Displayed");
		Thread.sleep(2000);
		ss.exitFullscreen();
		Thread.sleep(2000);
	}
	
	@Test(priority=7)
	public void CreateSalaryHeadusingEmployee_SC_465() throws Exception{
		CreateSalaryHeadusingEmployee he=new CreateSalaryHeadusingEmployee(driver);
		he.clickonemployee();
		he.clickonsalaryratedetails();
		he.clickongenerallink();
		Thread.sleep(2000);
		he.clickonsalaryhead();
		Thread.sleep(2000);
		he.addnewsalhead();
		Thread.sleep(2000);
		he.enterheadname("HRA");
		Thread.sleep(2000);
		he.entershortname("HRARA");
		Thread.sleep(2000);
		he.createsalaryhead();
		Thread.sleep(2000);
		String message = he.getMessage();
		Assert.assertEquals(message, "Salary head successfully created");
		Thread.sleep(2000);
		he.clickDeleteSalaryHeadsButton();
		Thread.sleep(2000);
		he.switchToPopUpAndAccept(driver);
		Thread.sleep(2000);
	}
	
	@Test(priority=8)
	public void CreateSalaryGroupusingEmployee_SC_466() throws Exception{
		CreateSalaryGroupusingEmployee ge=new CreateSalaryGroupusingEmployee(driver);
		ge.clickonemployee();
		ge.clickonsalaryratedetails();
		ge.clickongenerallink();
		Thread.sleep(2000);
		ge.clickonsalarystructure();
		Thread.sleep(2000);
		ge.createnewsalstructure();
		Thread.sleep(2000);
		ge.entersalstructurename("HRA STRUCTURE");
		Thread.sleep(2000);
		ge.checkbasedongross();
		Thread.sleep(2000);
		ge.createsalstructure();
		Thread.sleep(2000);
		String message = ge.getMessage();
		Assert.assertEquals(message, "Salary group successfully created");
		Thread.sleep(2000);
		ge.clickDeleteSalaryStructure();
		Thread.sleep(2000);
		ge.switchToPopUpAndAccept(driver);
		Thread.sleep(2000);
	}
}