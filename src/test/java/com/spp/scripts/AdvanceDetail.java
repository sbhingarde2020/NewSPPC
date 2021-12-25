package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddNewAdvanceMaster;
import com.spp.pages.CheckAdvanceDetailsRedirectsToEmployee;
import com.spp.pages.CheckAdvanceDetailsRedirectsToMaster;
import com.spp.pages.CheckAdvanceDetailsRedirectsToReports;
import com.spp.pages.CheckAdvanceMasterCreatedWithoutClubbedInSalary;
import com.spp.pages.CheckifSalaryAdvanceGeneralLinksEmployeeMasterredirectstoEmployee;
import com.spp.pages.CreateADInterestamountNOIHigher10Rupee;
import com.spp.pages.CreateADInterestamountNOIHigher10RupeeNoRecovery;
import com.spp.pages.CreateADInterestamountNOIHigher1Rupee;
import com.spp.pages.CreateADInterestamountNOIHigher1RupeeNoRecovery;
import com.spp.pages.CreateADInterestamountNOIHigher50Rupee;
import com.spp.pages.CreateADInterestamountNOIHigher50RupeeNoRecovery;
import com.spp.pages.CreateADNoOfInstallmentsHigher10Rupee;
import com.spp.pages.CreateADNoOfInstallmentsHigher10RupeeNoRecovery;
import com.spp.pages.CreateADNoOfInstallmentsHigher1RupeeNoRecovery;
import com.spp.pages.CreateADNoOfInstallmentsHigher50Rupee;
import com.spp.pages.CreateADNoOfInstallmentsHigher50RupeeNoRecovery;
import com.spp.pages.CreateAdvanceAmountLumpsum;
import com.spp.pages.CreateAdvanceDetailLumpsumNoRecovery;
import com.spp.pages.CreateSIReceiptInAdvanceDetail;
import com.spp.pages.DeleteAdvanceDetail;
import com.spp.pages.DeleteEMIDetailsInAdvanceDetail;
import com.spp.pages.DeleteSiReceiptInAdvanceDetail;
import com.spp.pages.EditEMIDetailsInAdvanceDetail;
import com.spp.pages.SalaryAdvanceDetailMultiAllotment;
import com.spp.pages.SalaryAdvanceDetailSingleAllotment;
import com.spp.pages.UpdateAdvanceMaster;
import com.spp.pages.UpdateSiReceiptInAdvanceDetail;

import junit.framework.Assert;

public class AdvanceDetail extends BaseTest {
	
	@Test(priority=0)
	public void AddNewAdvanceMaster_SC_295() throws Exception{
		AddNewAdvanceMaster ld=new AddNewAdvanceMaster(driver);
		ld.clickMastserLink();
		ld.clickAdvanceMaster();
		ld.clickAddNewAdvanceMaster();
		ld.clickAdvanceName("Default");
		Thread.sleep(2000);
		ld.ClickMaxAmount("15000");
		ld.enterinterestrate("15");
		ld.emirecovery("1");
		ld.clickCreateButton();
		String d=ld.getMessage();
		Assert.assertEquals(d, "Advance successfully created");
}

	@Test(priority=1)
		public void SalaryAdvanceDetailSingleAllotment_SC_296() throws Exception{
		 SalaryAdvanceDetailSingleAllotment am=new SalaryAdvanceDetailSingleAllotment(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.AddNewAdvanceDetails();
		 am.clickAdvanceName("Default");
		 am.clickSAdvanceDate("24 April 2013");
		 Thread.sleep(2000);
		 am.clickAmount("500");
		 am.clickNoOfInstallments();
		// am.clickNoInstallment("1");
		 am.clickRecoverFrom("May/2013");
		 am.clickCreateButton();
		 String d=am.getMessage();
		 Assert.assertEquals(d, "Advance successfully created");
		 Thread.sleep(4000);
		 am.clickDeleteButton();
	 
}
	 @Test(priority=2)
		public void SalaryAdvanceDetailMultiAllotment_SC_316() throws Exception{
		 SalaryAdvanceDetailMultiAllotment am=new SalaryAdvanceDetailMultiAllotment(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickMultiAllotment();
//		 am.clickView();
//		 am.AddNewAdvanceDetails();
		 am.clickAdvanceName("Default");
		 am.clickSAdvanceDate("24 March 2013");
		 Thread.sleep(2000);
		 am.clickAmount("500");
		//am.clickNoOfInstallments();
	//	am.clickInstallmentAmount("100");
		 am.clickRecoverFrom("Apr/2013");
		 am.clickCreateButton();
		 am.clickProceed();
		 String d=am.getMessage();
		 Assert.assertEquals(d, "Advance successfully created");
		
	 }
	@Test(priority=3)
		public void CreateSIReceiptInAdvanceDetail_SC_396() throws Exception{
		 CreateSIReceiptInAdvanceDetail am=new CreateSIReceiptInAdvanceDetail(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.ClickDetail();
		 am.ClickReceiptDetail();
		 am.clickDate("24 March 2013");
		 am.clickAmount("500");
		 am.clickconfirmButton();
		 am.clickYesButton();
		 am.clickYesButton();
		 String s=am.getMessage();
		 Assert.assertEquals(s, "Receipt Successfully Saved.");
}
		@Test(priority=4)
		public void UpdateSiReceiptInAdvanceDetail_SC_397() throws Exception{
		 UpdateSiReceiptInAdvanceDetail am=new UpdateSiReceiptInAdvanceDetail(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.ClickDetail();
		 am.ClickReceiptDetail();
		 am.clickEdit();
		 Thread.sleep(3000);
		 am.clickAmount("600");
		 Thread.sleep(5000);
		 am.clickUpdateButton();
		 am.clickYesButton();
		 am.clickYesButton();
		 String s=am.getMessage();
		 Assert.assertEquals(s, "Receipt Successfully Updated.");
}
	 @Test(priority=5)
		public void DeleteSiReceiptInAdvanceDetail_SC_398() throws Exception{
		 DeleteSiReceiptInAdvanceDetail am=new DeleteSiReceiptInAdvanceDetail(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.ClickDetail();
		 am.ClickReceiptDetail();
		 am.clickDelete();
		 Thread.sleep(10000);
		 am.clickYesButton();
		 String s=am.getMessage();
		 Assert.assertEquals(s, "Receipt Successfully Deleted");
}
	
	@Test(priority=6)
	public void EditEMIDetailsInAdvanceDetail_SC_577() throws Exception{
	 EditEMIDetailsInAdvanceDetail am=new EditEMIDetailsInAdvanceDetail(driver);
	 am.navigatesalary();
	 am.clickAdvanceDetails();
	 am.clickAddEmployee();
	 Thread.sleep(3000);
	 am.clickLoad();
	 Thread.sleep(3000);
	 am.clickView();
	 am.ClickDetail();
	 am.clickEdit();
	 Thread.sleep(3000);
	 am.clickAmount("600");
	 Thread.sleep(5000);
	 am.clickUpdateButton();
	 am.clickYesButton();
	// am.clickYesButton();
	 String s=am.getMessage();
	 Assert.assertEquals(s, "EMI Details Successfully updated.");
}
	
	 @Test(priority=7)
	 public void DeleteEMIDetailsInAdvanceDetail_SC_579() throws Exception{
		 DeleteEMIDetailsInAdvanceDetail am=new DeleteEMIDetailsInAdvanceDetail(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 Thread.sleep(3000);
		 am.ClickDetail();
		 am.ClickDelete();
		 am.clickYesButton();
		 String s=am.getMessage();
		 Assert.assertEquals(s, "EMI Details Successfully Deleted");
}

	 @Test(priority=8)
	public void DeleteAdvanceDetail_SC_576() throws Exception{
	 DeleteAdvanceDetail am=new DeleteAdvanceDetail(driver);
	 am.navigatesalary();
	 am.clickAdvanceDetails();
	 am.clickAddEmployee();
	 Thread.sleep(3000);
	 am.clickLoad();
	 Thread.sleep(3000);
	 am.clickView();
	 am.clickDelete();
	 am.switchToPopUpAndDismiss(driver);
	 am.clickDelete();
	 am.switchToPopUpAndAccept(driver);
	 String s=am.getMessage();
	 Assert.assertEquals(s, "Advance successfully deleted");
	 Thread.sleep(3000);
	 am.clickMastserLink();
	 am.clickAdvanceMaster();
	 am.deleteadvancemaster();
}


@Test(priority=10)
		public void CheckifSalaryAdvanceGeneralLinksEmployeeMasterredirectstoEmployee_SC_562() throws Exception{
		 CheckifSalaryAdvanceGeneralLinksEmployeeMasterredirectstoEmployee si=new CheckifSalaryAdvanceGeneralLinksEmployeeMasterredirectstoEmployee(driver);
			si.clickonsalary();
			si.clickonadvancedetail();
			si.clickongenerallinks();
			Thread.sleep(2000);
			si.clickonemployeemaster();
			si.addnewemployee();
			si.enterEmployeeid("xyz12345");
			si.enterEmployeeref("12345xyz");
			si.enterEmployeename("Aman");
			si.enterEmployeefather("Harish");
			si.selectDateofBirth("06 June 1995");
			si.selectGender("Male");
			si.selectMaritalStatus("Single");
			si.selectDateofJoining("02 April 2013");
			Thread.sleep(500);
			si.clickPresentAddress();
			si.selectState("Maharashtra");
			si.selectclassificationdetail();
			si.selectsalstructure("Structure");
			si.selectbranch("default");
			si.selectattendancestructure("Karnataka");
			si.selectbank("CASH");
			si.selectleavepolicy("Default");
			si.createemployee();
			String s=si.getMessage();
	 		Assert.assertEquals(s, "Employee successfully created");
	 		Thread.sleep(5000);
	 		si.clickemployee();
	 		si.selectemployeedetails();
	 		si.clickonfilterhead();
	 		Thread.sleep(3000);
	 		si.clickLoad();
	 		Thread.sleep(3000);
	 		si.deleteemployee();
		}
		
		@Test(priority=11)
		public void CheckAdvanceDetailsRedirectsToMaster_SC_561() throws Exception{
		 CheckAdvanceDetailsRedirectsToMaster am=new CheckAdvanceDetailsRedirectsToMaster(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickGeneralLink();	
		 am.clickAdvanceDetail();
		 am.clickAddNewAdvanceMaster();
		 am.clickAdvanceName("Default");
		 Thread.sleep(2000);
		 am.ClickMaxAmount("5000");
		 //ld.clickClubbedinSalaryBox();
		 am.clickCreateButton();
		 String d=am.getMessage();
		 Assert.assertEquals(d, "Advance successfully created");
}
	 
	 	 @Test(priority=12)
		public void CreateAdvanceAmountLumpsum_SC_578() throws Exception{
		 CreateAdvanceAmountLumpsum am=new CreateAdvanceAmountLumpsum(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.AddNewAdvanceDetails();
		 am.clickAdvanceName("Default");
		 am.clickSAdvanceDate("24 April 2013");
		 Thread.sleep(2000);
		 am.clickAmount("2000");
		 am.clickInstallmentAmount("500");
		//am.clickNoInstallment("10");
		 am.clickRecoverFrom("May/2013");
		 am.clickCreateButton();
		 String d=am.getMessage();
		 Assert.assertEquals(d, "Advance successfully created");
		 Thread.sleep(4000);
		 am.clickDeleteButton();
	 
}


	/* @Test(priority=9)
		public void CheckAdvanceDetailsRedirectsToReports_SC_560() throws Exception{
		 CheckAdvanceDetailsRedirectsToReports am=new CheckAdvanceDetailsRedirectsToReports(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(4000);
		 am.clickReports();
		 am.clickStandingInstructions();
		 am.ClickSIType("Advance");
		 am.ClickReportType("Detailed Report");
		 am.ClickSIFrom("Nov/2017");
		 am.ClickSIToe("Jul/2013");
		 am.ClickGetEmployees();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 String s=am.getMessage();
		 Assert.assertEquals(s, "Employees Successfully Loaded.");
		 am.clickEmployee();
		 am.clickGenerateReport();
		 
}*/
	 @Test(priority=13)
		public void CreateAdvanceDetailLumpsumNoRecovery_SC_580() throws Exception{
		 CreateAdvanceDetailLumpsumNoRecovery am=new CreateAdvanceDetailLumpsumNoRecovery(driver);
		 am.clickMastserLink();
		 am.clickAdvanceMaster();
		 am.clickAddNewAdvanceMaster();
		 am.enterAdvanceName("Default");
		 am.clickCreateAdvanceButton();
		 Thread.sleep(3000);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.AddNewAdvanceDetails();
		 am.clickAdvanceName("Default");
		 am.clickSAdvanceDate("24 April 2013");
		 Thread.sleep(2000);
		 am.clickAmount("2000");
		 am.clickInstallmentAmount("500");
		 am.clickRecoverFrom("May/2013");
		 am.clickNoRecovery();
		 am.clickCreateButton();
		 String d=am.getMessage();
		 Assert.assertEquals(d, "Advance successfully created");
		 Thread.sleep(4000);
		 am.clickDeleteButton();
		 	 
}
	 @Test(priority=14)
		public void CreateADNoOfInstallmentsHigher1RupeeNoRecovery_SC_581() throws Exception{
		 CreateADNoOfInstallmentsHigher1RupeeNoRecovery am=new CreateADNoOfInstallmentsHigher1RupeeNoRecovery(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.AddNewAdvanceDetails();
		 am.clickAdvanceName("Default");
		 am.clickSAdvanceDate("24 April 2013");
		 Thread.sleep(2000);
		 am.clickAmount("500");
		 am.clickNoOfInstallments();
		 am.clickNoInstallment("10");
		 am.clickRecoverFrom("May/2013");
		 am.clickHigher1Rupee();
		 am.clickCreateButton();
		 String d=am.getMessage();
		 Assert.assertEquals(d, "Advance successfully created");
		 Thread.sleep(4000);
		 am.clickDeleteButton();
		 	 
}
	 @Test(priority=15)
		public void CreateADNoOfInstallmentsHigher10RupeeNoRecovery_SC_582() throws Exception{
		 CreateADNoOfInstallmentsHigher10RupeeNoRecovery am=new CreateADNoOfInstallmentsHigher10RupeeNoRecovery(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.AddNewAdvanceDetails();
		 am.clickAdvanceName("Default");
		 am.clickSAdvanceDate("24 April 2013");
		 Thread.sleep(2000);
		 am.clickAmount("500");
		 am.clickNoOfInstallments();
		 am.clickNoInstallment("10");
		 am.clickRecoverFrom("May/2013");
		 am.clickHigher10Rupee();
		 am.clickCreateButton();
		 String d=am.getMessage();
		 Assert.assertEquals(d, "Advance successfully created");
		 Thread.sleep(4000);
		 am.clickDeleteButton();
	 
}
	 @Test(priority=16)
		public void CreateADNoOfInstallmentsHigher50RupeeNoRecovery_SC_583() throws Exception{
		 CreateADNoOfInstallmentsHigher50RupeeNoRecovery am=new CreateADNoOfInstallmentsHigher50RupeeNoRecovery(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.AddNewAdvanceDetails();
		 am.clickAdvanceName("Default");
		 am.clickSAdvanceDate("24 April 2013");
		 Thread.sleep(2000);
		 am.clickAmount("500");
		 am.clickNoOfInstallments();
		 am.clickNoInstallment("10");
		 am.clickRecoverFrom("May/2013");
		 am.clickNoRecovery();
		 am.clickHigher50Rupee();
		 am.clickCreateButton();
		 String d=am.getMessage();
		 Assert.assertEquals(d, "Advance successfully created");
		 Thread.sleep(4000);
		 am.clickDeleteButton();
	 
}
	 @Test(priority=17)
		public void CreateADInterestamountNOIHigher1RupeeNoRecovery_SC_584() throws Exception{
		 CreateADInterestamountNOIHigher1RupeeNoRecovery am=new CreateADInterestamountNOIHigher1RupeeNoRecovery(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.AddNewAdvanceDetails();
		 am.clickAdvanceName("Default");
		 am.clickSAdvanceDate("24 April 2013");
		 Thread.sleep(2000);
		 am.clickAmount("500");
		 am.clickInterestAmount("100");
		 am.clickNoOfInstallments();
		 am.clickNoInstallment("10");
		 am.clickRecoverFrom("May/2013");
		 am.clickNoRecovery();
		 am.clickHigher1Rupee();
		 am.clickCreateButton();
		 String d=am.getMessage();
		 Assert.assertEquals(d, "Advance successfully created");
		 Thread.sleep(4000);
		 am.clickDeleteButton();
	}
	 @Test(priority=18)
		public void CreateADInterestamountNOIHigher10RupeeNoRecovery_SC_585() throws Exception{
		 CreateADInterestamountNOIHigher10RupeeNoRecovery am=new CreateADInterestamountNOIHigher10RupeeNoRecovery(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.AddNewAdvanceDetails();
		 am.clickAdvanceName("Default");
		 am.clickSAdvanceDate("24 April 2013");
		 Thread.sleep(2000);
		 am.clickAmount("500");
		 am.clickInterestAmount("100");
		 am.clickNoOfInstallments();
		 am.clickNoInstallment("10");
		 am.clickRecoverFrom("May/2013");
		 am.clickNoRecovery();
		 am.clickHigher10Rupee();
		 am.clickCreateButton();
		 String d=am.getMessage();
		 Assert.assertEquals(d, "Advance successfully created");
		 Thread.sleep(4000);
		 am.clickDeleteButton();
	 
}
	 @Test(priority=19)
		public void CreateADInterestamountNOIHigher50RupeeNoRecovery_SC_586() throws Exception{
		 CreateADInterestamountNOIHigher50RupeeNoRecovery am=new CreateADInterestamountNOIHigher50RupeeNoRecovery(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.AddNewAdvanceDetails();
		 am.clickAdvanceName("Default");
		 am.clickSAdvanceDate("24 April 2013");
		 Thread.sleep(2000);
		 am.clickAmount("500");
		 am.clickInterestAmount("100");
		 am.clickNoOfInstallments();
		 am.clickNoInstallment("10");
		 am.clickRecoverFrom("May/2013");
		 am.clickNoRecovery();
		 am.clickHigher50Rupee();
		 am.clickCreateButton();
		 String d=am.getMessage();
		 Assert.assertEquals(d, "Advance successfully created");
		 Thread.sleep(4000);
		 am.clickDeleteButton();
	 
}
	 @Test(priority=20)
		public void CreateADNoOfInstallmentsHigher10Rupee_SC_587() throws Exception{
		 CreateADNoOfInstallmentsHigher10Rupee am=new CreateADNoOfInstallmentsHigher10Rupee(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.AddNewAdvanceDetails();
		 am.clickAdvanceName("Default");
		 am.clickSAdvanceDate("24 April 2013");
		 Thread.sleep(2000);
		 am.clickAmount("500");
		 am.clickNoOfInstallments();
		 am.clickNoInstallment("10");
		 am.clickRecoverFrom("May/2013");
		 am.clickHigher10Rupee();
		 am.clickCreateButton();
		 String d=am.getMessage();
		 Assert.assertEquals(d, "Advance successfully created");
		 Thread.sleep(4000);
		 am.clickDeleteButton();
		 	 
}
	 @Test(priority=21)
		public void CreateADNoOfInstallmentsHigher50Rupee_SC_588() throws Exception{
		 CreateADNoOfInstallmentsHigher50Rupee am=new CreateADNoOfInstallmentsHigher50Rupee(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.AddNewAdvanceDetails();
		 am.clickAdvanceName("Default");
		 am.clickSAdvanceDate("24 April 2013");
		 Thread.sleep(2000);
		 am.clickAmount("500");
		 am.clickNoOfInstallments();
		 am.clickNoInstallment("10");
		 am.clickRecoverFrom("May/2013");
		 am.clickHigher50Rupee();
		 am.clickCreateButton();
		 String d=am.getMessage();
		 Assert.assertEquals(d, "Advance successfully created");
		 Thread.sleep(4000);
		 am.clickDeleteButton();
	 
}
	 @Test(priority=22)
		public void CreateADInterestamountNOIHigher1Rupee_SC_589() throws Exception{
		 CreateADInterestamountNOIHigher1Rupee am=new CreateADInterestamountNOIHigher1Rupee(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.AddNewAdvanceDetails();
		 am.clickAdvanceName("Default");
		 am.clickSAdvanceDate("24 April 2013");
		 Thread.sleep(2000);
		 am.clickAmount("500");
		 am.clickInterestAmount("100");
		 am.clickNoOfInstallments();
		 am.clickNoInstallment("10");
		 am.clickRecoverFrom("May/2013");
		 am.clickHigher1Rupee();
		 am.clickCreateButton();
		 String d=am.getMessage();
		 Assert.assertEquals(d, "Advance successfully created");
		 Thread.sleep(4000);
		 am.clickDeleteButton();
	 
}
	 @Test(priority=23)
		public void CreateADInterestamountNOIHigher10Rupee_SC_590() throws Exception{
		 CreateADInterestamountNOIHigher10Rupee am=new CreateADInterestamountNOIHigher10Rupee(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.AddNewAdvanceDetails();
		 am.clickAdvanceName("Default");
		 am.clickSAdvanceDate("24 April 2013");
		 Thread.sleep(2000);
		 am.clickAmount("500");
		 am.clickInterestAmount("100");
		 am.clickNoOfInstallments();
		 am.clickNoInstallment("10");
		 am.clickRecoverFrom("May/2013");
		 am.clickHigher10Rupee();
		 am.clickCreateButton();
		 String d=am.getMessage();
		 Assert.assertEquals(d, "Advance successfully created");
		 Thread.sleep(4000);
		 am.clickDeleteButton();
	 
}
	 @Test(priority=24)
		public void CreateADInterestamountNOIHigher50Rupee_SC_591() throws Exception{
		 CreateADInterestamountNOIHigher50Rupee am=new CreateADInterestamountNOIHigher50Rupee(driver);
		 am.navigatesalary();
		 am.clickAdvanceDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.AddNewAdvanceDetails();
		 am.clickAdvanceName("Default");
		 am.clickSAdvanceDate("24 April 2013");
		 Thread.sleep(2000);
		 am.clickAmount("500");
		 am.clickInterestAmount("100");
		 am.clickNoOfInstallments();
		 am.clickNoInstallment("10");
		 am.clickRecoverFrom("May/2013");
		 am.clickHigher50Rupee();
		 am.clickCreateButton();
		 String d=am.getMessage();
		 Assert.assertEquals(d, "Advance successfully created");
		 Thread.sleep(4000);
		 am.clickDeleteButton();
		 Thread.sleep(3000);
		 am.clickMastserLink();
		 am.clickAdvanceMaster();
		 am.clickDeleteAdvanceButton();
	 
}
	 
	
}