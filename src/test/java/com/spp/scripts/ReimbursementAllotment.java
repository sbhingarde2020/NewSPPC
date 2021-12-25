package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.CreateReimbursementMaster;
import com.spp.pages.DeleteReimbursementAllotment;
import com.spp.pages.UpdateReimbursementAllotment;
import com.spp.pages.AddNewReimbursementAllotment;
import com.spp.pages.BulkAllotment;
import com.spp.pages.BulkDelete;
import com.spp.pages.BulkReimbursementErrorLog;
import com.spp.pages.CheckForAllotmentInRM;
import com.spp.pages.CheckForMonthlyAllotmentInRM;
import com.spp.pages.CheckForNoAllotmentInRM;
import com.spp.pages.CheckifEmployeeReimbursementAllotmentGeneralLinkReimbursementClaimredirectstoMaster;
import com.spp.pages.CheckifEmployeeReimbursementAllotmentGeneralLinkReimbursementMasterredirectstoMaster;
import com.spp.pages.CheckifEmployeeReimbursementAllotmentReportsredirectstoReportmodule;
import com.spp.pages.CreateReimbursementAllotment;
import com.spp.pages.ExportToExcelBulkReimbursementErrorLog;
public class ReimbursementAllotment extends BaseTest{
	
	/*@Test(priority=0)
	public void CreateReimMaster_SC_387() throws Exception{
		CreateReimbursementMaster rm = new CreateReimbursementMaster(driver);
		Thread.sleep(6000);
		rm.clickMastserLink();
		rm.clickReimbursementMaster();
		rm.clickAddReimbursementMaster();
		Thread.sleep(2000);
		rm.enterReimbursementName("ReimMaster");
		rm.selectReimbursementType("LTA");
		rm.selectModeOfPayment("Bank Advise");
		rm.selectAllotmentType();
		rm.selectTDSRef("Basic");
		Thread.sleep(2000);
		rm.clickCreateReimbursementMaster();
		String s=rm.getMessage();
		Assert.assertEquals(s, "Reimbursement Master is successfully created.");
		}
	
	@Test(priority=1)
	public void AddNewReimbursementAllotmentr_SC_388() throws Exception{
		AddNewReimbursementAllotment rt = new AddNewReimbursementAllotment(driver);
		rt.selectEmployee();
		rt.selectReimbursementAllotment();
		rt.selectNewReimbursement();
		rt.selectAddEmployee();
		rt.selectAllotButton();
		rt.selectName("Reim. LTA (LTA)");
		rt.selectBlockPeriod("2018/2021");
		Thread.sleep(2000);
		rt.selectAllotmentDate("01 December 2018");
		rt.selectFinancialYear("2018/2019");
		rt.ClickOnFunctionKey();
		Thread.sleep(5000);
		rt.EnterSumAmount("3000");
		Thread.sleep(5000);
		rt.selectCreateReimbursementButton();
		String s=rt.getMessage();
		Assert.assertEquals(s, "Reimbursement Allotment was successfully created");
		}
	
	@Test(priority=2)
	public void UpdateReimbursementAllotment_SC_389() throws Exception{
		UpdateReimbursementAllotment rt = new UpdateReimbursementAllotment(driver);
		rt.selectEmployee();
		rt.selectReimbursementAllotment();
		rt.selectEdit();
		Thread.sleep(5000);
		rt.selectAmount("4000");
		Thread.sleep(3000);
		rt.selectUpdateButton();		
		String s=rt.getMessage();
		Assert.assertEquals(s, "Reimbursement Allotment was successfully updated");
		}
	
	@Test(priority=3)
	public void DeleteReimbursementAllotment_SC_390() throws Exception{
		DeleteReimbursementAllotment ss = new DeleteReimbursementAllotment(driver);
		ss.selectEmployee();
		ss.selectReimbursementAllotment();
		ss.selectDeleteButton();
		String s=ss.getMessage();
		Assert.assertEquals(s, "Reimbursement Allotment was successfully deleted.");
		}  
	
	@Test(priority=4)
	public void BulkAllotment_SC_391() throws Exception{
		BulkAllotment ss = new BulkAllotment(driver);
		ss.selectEmployee();
		ss.selectReimbursementAllotment();
		ss.selectBulkAllotmentButton();
		ss.selectName("Reim. LTA (LTA)");
		Thread.sleep(2000);
		ss.selectFinancialYear("2018/2019");
		ss.selectAllotmentDate("01 December 2018");
		Thread.sleep(2000);
		ss.selectBlockPeriod("2018/2021");
		ss.selectAmount("4000");
		ss.selectAmountFor();
		ss.getemployees();
		ss.resizeWindow();
		Thread.sleep(5000);
		//ss.selectCreateReimbursementButton();
		//Thread.sleep(3000);
		ss.selectLoadButton();
		Thread.sleep(5000);
		ss.EmployeeBulkAllotmentButton();
		Thread.sleep(8000);
		ss.selectAllotReimbursementButton();
		Thread.sleep(5000);
		ss.exitFullscreen();
		//String t=ss.getMessage();
		//Assert.assertEquals(t, "Reimbursement Allotments were successfully created");
		}
	
	@Test(priority=5)
	public void BulkDelete_SC_392() throws Exception{
		BulkDelete ty = new BulkDelete(driver);
		ty.selectEmployee();
		ty.selectReimbursementAllotment();
		ty.selectBulkDeleteLink();
		ty.BulkDelete();
		ty.selectDeleteReimbursementAllotmentsButton();
		String d=ty.getMessage();
		Assert.assertEquals(d, "Reimbursement Allotments were successfully deleted");
		}
		
	@Test(priority=6)
	public void CheckForNoAllotmentInRM_SC_264() throws Exception{
	CheckForNoAllotmentInRM rt=new CheckForNoAllotmentInRM(driver);
	    rt.clickMastserLink();
		rt.clickReimbursementMaster();
		rt.clickAddReimbursementMaster();
		rt.enterReimbursementName("ReimMaster");
		rt.selectReimbursementType("Other Reimbursement");
		rt.selectModeOfPayment("Cash");
		//rt.selectAllotmentType();
		Thread.sleep(5000);
		rt.selectTDSRef("Basic");
		rt.clickCreateReimbursementMaster();
		Thread.sleep(5000);
		rt.selectEmployee();
		rt.selectReimbursementAllotment();
		rt.selectNewReimbursement();
		rt.selectAddEmployee();
		rt.selectAllotButton();
		rt.selectName("ReimMaster (Other Reimbursement)");
		Thread.sleep(5000);
		rt.clickMastserLink();
		rt.clickReimbursementMaster();
		rt.clickDeleteButton();
		}
	
	@Test(priority=7)
	public void CheckForAllotmentInRM_SC_265() throws Exception{
	CheckForAllotmentInRM rt=new CheckForAllotmentInRM(driver);
		rt.clickMastserLink();
		rt.clickReimbursementMaster();
		rt.clickAddReimbursementMaster();
		rt.enterReimbursementName("ReimMaster");
		rt.selectReimbursementType("Other Reimbursement");
		rt.selectModeOfPayment("Paid in Salary");
		rt.selectAllotmentType();
		rt.selectMonthlyAllotmentType();
		rt.selectTDSRef("Basic");
		Thread.sleep(5000);
		rt.clickCreateReimbursementMaster();
		Thread.sleep(5000);
		rt.selectEmployee();
		rt.selectReimbursementAllotment();
		rt.selectNewReimbursement();
		rt.selectAddEmployee();
		rt.selectAllotButton();
		rt.selectName("ReimMaster (Other Reimbursement)");
		Thread.sleep(3000);
		rt.selectFinancialYear("2018/2019");
		Thread.sleep(3000);
		rt.selectAllotmentDate("01 December 2018");
		Thread.sleep(3000);
		rt.ClickOnFunctionKey();
		}
	 
	@Test(priority=8)
	public void CheckForMonthlyAllotmentInRM_SC_266() throws Exception{
	CheckForMonthlyAllotmentInRM rt=new CheckForMonthlyAllotmentInRM(driver);
		Thread.sleep(5000);
		rt.selectEmployee();
		rt.selectReimbursementAllotment();
		rt.selectNewReimbursement();
		rt.selectAddEmployee();
		rt.selectAllotButton();
		rt.selectName("ReimMaster (Other Reimbursement)");
		Thread.sleep(3000);
		rt.selectFinancialYear("2018/2019");
		Thread.sleep(3000);
		rt.selectAllotmentDate("01 December 2018");
		Thread.sleep(3000);
		rt.ClickOnFunctionKey();
		//rt.selectAmountSideButton();
		Thread.sleep(5000);
		rt.clickMastserLink();
		rt.clickReimbursementMaster();
		rt.clickDeleteButton();
		}
	
	@Test(priority=9)
	public void BulkReimbursementErrorLog_SC_393() throws Exception{
		BulkReimbursementErrorLog ty = new BulkReimbursementErrorLog(driver);
		ty.selectEmployee();
		ty.selectReimbursementAllotment();
		ty.selectErrorLogLink();
		ty.selectReimbursementModuleType("Reimbursement allotments");
		ty.selectLogDate("15 February 2019");
		ty.selectGetErrorButton();
		}
	
	@Test(priority=10)
	public void ExportToExcelBulkReimbursementErrorLog_SC_394() throws Exception{
		ExportToExcelBulkReimbursementErrorLog ty = new ExportToExcelBulkReimbursementErrorLog(driver);
		ty.selectEmployee();
		ty.selectReimbursementAllotment();
		ty.selectErrorLogLink();
		ty.selectReimbursementModuleType("Reimbursement allotments");
		ty.selectLogDate("31 March 2019");
		ty.selectExportToExcelButton();				
		}*/
	
	/*@Test(priority=11)
	public void CreateReimbursementAllotment_SC_289() throws Exception{
	CreateReimbursementAllotment rt = new CreateReimbursementAllotment(driver);
		rt.clickMastserLink();		
		rt.clickReimbursementMaster();
		rt.clickAddReimbursementMaster();
		rt.selectReimbursementType("Other Reimbursement");
		rt.selectModeOfPayment("Paid in Salary");
		rt.selectLumpsumType();
		Thread.sleep(5000);
		rt.enterReimbursementName("ReimMaster");
		Thread.sleep(3000);
		rt.clickCreateReimbursementMaster();
		Thread.sleep(5000);
		rt.selectEmployee();
		rt.selectReimbursementAllotment();
		rt.selectNewReimbursement();
		rt.selectAddEmployee();
		rt.selectAllotButton();
		rt.selectName("ReimMaster (Other Reimbursement)");
		Thread.sleep(2000);
		rt.selectFinancialYear("2013/2014");
		rt.selectAllotmentDate("15 April 2013");
		rt.ClickOnFunctionKey();
		Thread.sleep(5000);
		rt.EnterSumAmount("3000");
		Thread.sleep(5000);
		rt.selectCreateReimbursementButton();
		String e=rt.getMessage();
		Assert.assertEquals(e, "Reimbursement Allotment was successfully created");
		Thread.sleep(2000);
		//rt.clickPagechange();
		rt.clickDeleteButton();
		rt.clickMastserLink();
		rt.clickReimbursementMaster();
		rt.clickDeleteMasterButton();	
		}*/	
			
	@Test(priority=13)
	public void CheckifEmployeeReimbursementAllotmentGeneralLinkReimMasterredirectstoMaster_SC_471() throws Exception{
		CheckifEmployeeReimbursementAllotmentGeneralLinkReimbursementMasterredirectstoMaster am=new CheckifEmployeeReimbursementAllotmentGeneralLinkReimbursementMasterredirectstoMaster(driver);
		am.clickonemployee();
		am.clickonreimbursement();
		am.clickongenrallinks();
		Thread.sleep(2000);
		am.clickonreimbursemstr();
		Thread.sleep(1000);
		am.addnewreimbursement();
		Thread.sleep(1000);
		am.selectReimbursementType("Other Reimbursement");
		Thread.sleep(1000);
		am.selectModeOfPayment("Cash");
		am.selectTDSRef("Basic");
		Thread.sleep(1000);
		am.selectAllotmentType();
		Thread.sleep(1000);
		am.enterReimbursementName("MedicinalReimbursement");
		//am.clickClubbedSalaryHead();
		am.clickCreateReimbursementMaster();
		String s=am.getMessage();
		Assert.assertEquals(s, "Reimbursement Master is successfully created.");
		Thread.sleep(5000);
		//am.clickDeleteMasterButton();
	}
	
	@Test(priority=14)
	public void CheckifEmployeeReimbursementAllotmentGeneralLinkReimbursementClaimredirectstoMaster_SC_472() throws Exception{
		CheckifEmployeeReimbursementAllotmentGeneralLinkReimbursementClaimredirectstoMaster cm=new CheckifEmployeeReimbursementAllotmentGeneralLinkReimbursementClaimredirectstoMaster(driver);
		cm.selectEmployee();
		cm.selectReimbursementAllotment();
		cm.selectNewReimbursement();
		cm.selectAddEmployee();
		cm.selectAllotButton();
		Thread.sleep(2000);
		//cm.selectAllotmentName("ReimMaster (Other Reimbursement)");
		//Thread.sleep(2000);
		cm.selectAllotmentDate("03 December 2018");
		cm.selectFinancialAllotmentYear("2018/2019");
		cm.ClickOnFunctionKey();
		Thread.sleep(5000);
		cm.EnterSumAmount("3000");
		Thread.sleep(7000);
		cm.selectCreateReimbursementAllotmentButton();
		Thread.sleep(5000);
		cm.clickonemployee();
		cm.clickonreimbursement();
		cm.clickongenrallinks();
		Thread.sleep(2000);
		cm.clickonreimbursclaim();
		Thread.sleep(1000);
		cm.addnewreimbursement();
		Thread.sleep(5000);
		cm.selectemployee();
		cm.claimreimbursement();
		//cm.enterReimbursementNameinClaim("ReimMaster (Other Reimbursement)");
		//cm.selectFinancialYear("2013/2014");
		//cm.selectPaymentMode("Paid in Salary");
		//cm.selectPaidMonth("Apr/2013");
		cm.selectClaimDate("18 March 2019");
		Thread.sleep(5000);
		cm.selectPaidDate("19 March 2019");
		Thread.sleep(5000);
		cm.selectAmount("3000");
		cm.selectCreateReimbursementButton();
		String t=cm.getMessage();
		Assert.assertEquals(t, "Reimbursement Claim was successfully created");
		Thread.sleep(2000);
		cm.DeleteClaim();
		Thread.sleep(2000);
		cm.clickonemployee();
		cm.selectReimbursementAllotment();
		cm.clickDeleteAllotmentButton();
		Thread.sleep(3000);
		cm.clickMastserLink();
		cm.clickReimbursementMaster();
		cm.clickDeleteMasterButton();
	}
	
	/*@Test(priority=12)
	public void CheckifEmployeeReimbursementAllotmentReportsredirectstoReportmodule_SC_470() throws Exception{
		CheckifEmployeeReimbursementAllotmentReportsredirectstoReportmodule rd=new CheckifEmployeeReimbursementAllotmentReportsredirectstoReportmodule(driver);
	}*/
}