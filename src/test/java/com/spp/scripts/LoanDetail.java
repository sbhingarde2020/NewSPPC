package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddNewLoanMaster;
import com.spp.pages.CheckLoanDetailsRedirectsToMaster;
import com.spp.pages.CheckLoanDetailsRedirectsToReports;
import com.spp.pages.CheckifSalaryAdvanceGeneralLinksEmployeeMasterredirectstoEmployee;
import com.spp.pages.CheckifSalaryLoanGeneralLinksEmployeeMasterredirectstoEmployee;
import com.spp.pages.CreateLoanAmountInterestAmountNoOfInstallmentsHigher10rupeeNoRecovery;
import com.spp.pages.CreateLoanAmountInterestAmountNoOfInstallmentsHigher1rupeeNoRecovery;
import com.spp.pages.CreateLoanAmountInterestAmountNoOfInstallmentsHigher50rupeeNoRecovery;
import com.spp.pages.CreateLoanAmountLumpsumNoRecovery;
import com.spp.pages.CreateLoanAmountNoOfInstallmentsHigher10rupee;
import com.spp.pages.CreateLoanAmountNoOfInstallmentsHigher10rupeeNoRecovery;
import com.spp.pages.CreateLoanAmountNoOfInstallmentsHigher1rupee;
import com.spp.pages.CreateLoanAmountNoOfInstallmentsHigher1rupeeNoRecovery;
import com.spp.pages.CreateLoanAmountNoOfInstallmentsHigher50rupee;
import com.spp.pages.CreateLoanAmountNoOfInstallmentsHigher50rupeeNoRecovery;
import com.spp.pages.CreateSIReceiptInAdvanceDetail;
import com.spp.pages.CreateSIReceiptInLoanDetail;
import com.spp.pages.DeleteEMIDetailsInLoanDetail;
import com.spp.pages.DeleteLoanDetail;
import com.spp.pages.DeleteSiReceiptInAdvanceDetail;
import com.spp.pages.DeleteSiReceiptInLoanDetail;
import com.spp.pages.EditEMIDetailsInLoanDetail;
import com.spp.pages.SalaryLoanDetailMultiAllotment;
import com.spp.pages.SalaryLoanDetailSingleAllotment;
import com.spp.pages.UpdateSiReceiptInAdvanceDetail;
import com.spp.pages.UpdateSiReceiptInLoanDetail;

import junit.framework.Assert;

public class LoanDetail extends BaseTest{

	@Test(priority=0)
	public void AddNewLoanMaster_SC_297() throws Exception{
		AddNewLoanMaster lm=new AddNewLoanMaster(driver);
		Thread.sleep(5000);
		lm.navigateMaster();
		lm.clickLoanMaster();
		lm.clickAddLoanMaster();
		lm.enterLoanName("Bike loan_"+Utility.getRandNum(1, 1000));
		lm.enterMaximumAmount("20000");
		lm.clickCreateLoan();
		String s=lm.getMessage();
		Assert.assertEquals(s, "Loan successfully created");
		lm.clickDeleteButton();
	}
	 @Test(priority=1)
		public void SalaryLoanDetailSingleAllotment_SC_298() throws Exception{
		 SalaryLoanDetailSingleAllotment am=new SalaryLoanDetailSingleAllotment(driver);
		 am.navigatesalary();
		 am.clickLoanDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.clickAddNewLoan();
		 am.clickLoanName("Bike loan");
		 am.selectLoanDate("01 April 2018");
		 am.selectInstitutionName("nwr hg-12345");
		 am.clickLoanAccountNo("656");
		 am.clickAmount("500");
		 am.clickInstallmentAmount("100");
		 am.clickRecoverDate("May/2018");
		 am.clickCreateButton();
		 String s=am.getMessage();
		 Assert.assertEquals(s, "Loan successfully created");
		 am.clickDeleteButton();
		 
}
	 @Test(priority=2)
		public void SalaryLoanDetailMultiAllotment_SC_317() throws Exception{
		 SalaryLoanDetailMultiAllotment am=new SalaryLoanDetailMultiAllotment(driver);
		 am.navigatesalary();
		 am.clickLoanDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickMultiAllotment();
		 am.clickLoanName("Bike loan");
		 am.selectLoanDate("01 April 2018");
		 am.selectInstitutionName("nwr hg-12345");
		 am.clickLoanAccountNo("656");
		 am.clickAmount("500");
		 am.clickInstallmentAmount("100");
		 am.clickRecoverDate("May/2018");
		 am.clickCreateButton();
		 am.clickProceed();
		 String s=am.getMessage();
		 Assert.assertEquals(s, "Loan successfully created");
		 
}
	 @Test(priority=3)
		public void CreateSIReceiptInLoanDetail_SC_399() throws Exception{
		 CreateSIReceiptInLoanDetail am=new CreateSIReceiptInLoanDetail(driver);
		 am.navigatesalary();
		 am.clickLoanDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.ClickDetail();
		 am.ClickReceiptDetail();
		 am.clickDate("24 May 2018");
		 am.clickAmount("500");
		 am.clickconfirmButton();
		 am.clickYesButton();
		 am.clickYesButton();
		 String s=am.getMessage();
		 Assert.assertEquals(s, "Receipt Successfully Saved.");
}	 
	 @Test(priority=4)
		public void UpdateSiReceiptInLoanDetail_SC_400() throws Exception{
		 UpdateSiReceiptInLoanDetail am=new UpdateSiReceiptInLoanDetail(driver);
		 am.navigatesalary();
		 am.clickLoanDetails();
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
		 am.clickUpdateButton();
		 am.clickYesButton();
		 am.clickYesButton();
		 String s=am.getMessage();
		 Assert.assertEquals(s, "Receipt Successfully Updated.");
}
	 @Test(priority=5)
		public void DeleteSiReceiptInLoanDetail_SC_401() throws Exception{
		 DeleteSiReceiptInLoanDetail am=new DeleteSiReceiptInLoanDetail(driver);
		 am.navigatesalary();
		 am.clickLoanDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.ClickDetail();
		 am.ClickReceiptDetail();
		 am.clickDelete();
		 am.clickYesButton();
		 String s=am.getMessage();
		 Assert.assertEquals(s, "Receipt Successfully Deleted");
}
	 @Test(priority=6)
		public void DeleteLoanDetail_SC_609() throws Exception{
		 DeleteLoanDetail am=new DeleteLoanDetail(driver);
		 am.navigatesalary();
		 am.clickLoanDetails();
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
		 Assert.assertEquals(s, "Loan successfully deleted");
}
	/* @Test(priority=7)
		public void CheckLoanDetailsRedirectsToReports_SC_610() throws Exception{
		 CheckLoanDetailsRedirectsToReports am=new CheckLoanDetailsRedirectsToReports(driver);
		 am.navigatesalary();
		 am.clickLoanDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(4000);
		 am.clickReports();
		 am.clickStandingInstructions();
		 am.ClickSIType("Loan");
		 am.ClickReportType("EMI Report");
		 am.ClickSIFrom("Nov/2017");
		 am.ClickSIToe("Jul/2018");
		 am.ClickGetEmployees();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 String s=am.getMessage();
		 Assert.assertEquals(s, "Employees Successfully Loaded.");
		// am.clickEmployee();
		 am.clickGenerateReport();
		 
}*/
	 @Test(priority=8)
		public void CheckLoanDetailsRedirectsToMaster_SC_611() throws Exception{
		 CheckLoanDetailsRedirectsToMaster am=new CheckLoanDetailsRedirectsToMaster(driver);
		 am.navigatesalary();
		 am.clickLoanDetails();
		 am.clickGeneralLink();
		 am.clickLoanMasterl();
		 am.clickAddNewLoanMaster();
		 am.clickLoanName("master_"+Utility.getRandNum(10, 10000));
		 Thread.sleep(2000);
		 am.ClickMaxAmount("5000");
		 //ld.clickClubbedinSalaryBox();
		 am.clickCreateButton();
		 String d=am.getMessage();
		 Assert.assertEquals(d, "Loan successfully created");
}
	 @Test(priority=9)
		public void EditEMIDetailsInLoanDetail_SC_613() throws Exception{
		 EditEMIDetailsInLoanDetail am=new EditEMIDetailsInLoanDetail(driver);
		 am.navigatesalary();
		 am.clickLoanDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.ClickDetail();
		 am.clickEdit();
		 Thread.sleep(3000);
		 am.clickAmount("600");
		 am.clickUpdateButton();
		 am.clickYesButton();
		// am.clickYesButton();
		 String s=am.getMessage();
		 Assert.assertEquals(s, "EMI Details Successfully updated.");
}
	 @Test(priority=10)
	 public void DeleteEMIDetailsInLoanDetail_SC_614() throws Exception{
		 DeleteEMIDetailsInLoanDetail am=new DeleteEMIDetailsInLoanDetail(driver);
		 am.navigatesalary();
		 am.clickLoanDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.ClickDetail();
		 am.ClickDelete();
		 am.clickYesButton();
		 String s=am.getMessage();
		 Assert.assertEquals(s, "EMI Details Successfully Deleted");
}
	 
	 
	 @Test(priority=11)
		public void CheckifSalaryLoanGeneralLinksEmployeeMasterredirectstoEmployee_SC_612() throws Exception{
		 CheckifSalaryLoanGeneralLinksEmployeeMasterredirectstoEmployee si=new CheckifSalaryLoanGeneralLinksEmployeeMasterredirectstoEmployee(driver);
			si.clickonsalary();
			si.clickonloandetail();
			si.clickongenerallinks();
			Thread.sleep(2000);
			si.clickonemployeemaster();
			si.addnewemployee();
			si.enterEmployeeid("mno12345");
			si.enterEmployeeref("12345mno");
			si.enterEmployeename("Ajay");
			si.enterEmployeefather("Harish");
			si.selectDateofBirth("06 June 1995");
			si.selectGender("Male");
			si.selectMaritalStatus("Single");
			si.selectDateofJoining("06 July 2018");
			Thread.sleep(500);
			si.clickPresentAddress();
			si.selectState("Maharashtra");
			si.selectclassificationdetail();
			si.selectsalstructure("Structure");
			si.selectbranch("Chennai");
			si.selectattendancestructure("Karnataka");
			si.selectbank("CASH");
			si.selectleavepolicy("PolicyNo1");
			si.createemployee();
			String s=si.getMessage();
	 		Assert.assertEquals(s, "Employee successfully created");
		}
	@Test(priority=12)
	public void CreateLoanAmountLumpsumNoRecovery_SC_596() throws Exception{
		CreateLoanAmountLumpsumNoRecovery si=new CreateLoanAmountLumpsumNoRecovery(driver);
		si.navigateMaster();
		si.selectloanmaster();
		si.addnewloanmaster();
		si.enterloanName("Bike_Loan");
		Thread.sleep(2000);
		si.createloanmaster();
		Thread.sleep(3000);
		si.navigateMaster();
		si.selectFinancialInst();
		si.addnewfinanInsti();
		si.selectAccoutType("Loan");
		si.enterInstName("HDFC Bank");
		si.enterBranchCode("FORT MUMBAI");
		si.enterEmail("hdfc@gmail.com");
		si.enterAddress("FORT MUMBAI");
		si.enterPinCode("400085");
		si.enterIFSCCode("HDFC0000060");
		si.createfinanceinsti();
		Thread.sleep(5000);
		si.clickonsalary();
		si.clickonloandetail();
		 si.clickAddEmployee();
		 Thread.sleep(3000);
		 si.clickLoad();
		 Thread.sleep(3000);
		 si.clickView();
		 si.clickAddNewLoan();
		 si.clickLoanName("Bike_Loan");
		 si.selectLoanDate("01 April 2013");
		 si.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		 si.clickLoanAccountNo("656");
		 si.clickAmount("500");
		 si.clickInstallmentAmount("100");
		 si.clickRecoverDate("May/2013");
		 si.norecovery();
		 si.clickCreateButton();
		 String s=si.getMessage();
		 Assert.assertEquals(s, "Loan successfully created");
		 si.clickDeleteButton();
		
	}
	@Test(priority=13)
	public void CreateLoanAmountNoOfInstallmentsHigher1rupeeNoRecovery_SC_597() throws Exception{
		CreateLoanAmountNoOfInstallmentsHigher1rupeeNoRecovery si=new CreateLoanAmountNoOfInstallmentsHigher1rupeeNoRecovery(driver);
		si.clickonsalary();
		si.clickonloandetail();
		 si.clickAddEmployee();
		 Thread.sleep(3000);
		 si.clickLoad();
		 Thread.sleep(3000);
		 si.clickView();
		 si.clickAddNewLoan();
		 si.clickLoanName("Bike_Loan");
		 si.selectLoanDate("01 April 2013");
		 si.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		 si.clickLoanAccountNo("656");
		 si.clickAmount("5000");
		 si.noofinstallments();
		 si.enternoofinstallments("5");
		// si.clickInstallmentAmount("500");
		 si.clickRecoverDate("May/2013");
		 si.norecovery();
		 si.roundoffhighestrupee();
		 si.clickCreateButton();
		 String s=si.getMessage();
		 Assert.assertEquals(s, "Loan successfully created");
		 si.clickDeleteButton();
	}
	@Test(priority=14)
	public void CreateLoanAmountNoOfInstallmentsHigher10rupeeNoRecovery_SC_598() throws Exception{
		CreateLoanAmountNoOfInstallmentsHigher10rupeeNoRecovery si=new CreateLoanAmountNoOfInstallmentsHigher10rupeeNoRecovery(driver);
		si.clickonsalary();
		si.clickonloandetail();
		 si.clickAddEmployee();
		 Thread.sleep(3000);
		 si.clickLoad();
		 Thread.sleep(3000);
		 si.clickView();
		 si.clickAddNewLoan();
		 si.clickLoanName("Bike_Loan");
		 si.selectLoanDate("01 April 2013");
		 si.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		 si.clickLoanAccountNo("656");
		 si.clickAmount("5000");
		 si.noofinstallments();
		 si.enternoofinstallments("5");
		// si.clickInstallmentAmount("500");
		 si.clickRecoverDate("May/2013");
		 si.norecovery();
		 si.roundoffhighestrupee();
		 
		 si.clickCreateButton();
		 String s=si.getMessage();
		 Assert.assertEquals(s, "Loan successfully created");
		 si.clickDeleteButton();
	}
	@Test(priority=15)
	public void CreateLoanAmountNoOfInstallmentsHigher50rupeeNoRecovery_SC_599() throws Exception{
		CreateLoanAmountNoOfInstallmentsHigher50rupeeNoRecovery si=new CreateLoanAmountNoOfInstallmentsHigher50rupeeNoRecovery(driver);
		si.clickonsalary();
		si.clickonloandetail();
		 si.clickAddEmployee();
		 Thread.sleep(3000);
		 si.clickLoad();
		 Thread.sleep(3000);
		 si.clickView();
		 si.clickAddNewLoan();
		 si.clickLoanName("Bike_Loan");
		 si.selectLoanDate("01 April 2013");
		 si.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		 si.clickLoanAccountNo("656");
		 si.clickAmount("5000");
		 si.noofinstallments();
		 si.enternoofinstallments("5");
		// si.clickInstallmentAmount("500");
		 si.clickRecoverDate("May/2013");
		 si.roundoffhighestrupee();
		 si.norecovery();
		 si.clickCreateButton();
		 String s=si.getMessage();
		 Assert.assertEquals(s, "Loan successfully created");
		 si.clickDeleteButton();
	}
	@Test(priority=16)
	public void CreateLoanAmountNoOfInstallmentsHigher1rupee_SC_600() throws Exception{
		CreateLoanAmountNoOfInstallmentsHigher1rupee si=new CreateLoanAmountNoOfInstallmentsHigher1rupee(driver);
		si.clickonsalary();
		si.clickonloandetail();
		 si.clickAddEmployee();
		 Thread.sleep(3000);
		 si.clickLoad();
		 Thread.sleep(3000);
		 si.clickView();
		 si.clickAddNewLoan();
		 si.clickLoanName("Bike_Loan");
		 si.selectLoanDate("01 April 2013");
		 si.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		 si.clickLoanAccountNo("656");
		 si.clickAmount("5000");
		 si.noofinstallments();
		 si.enternoofinstallments("5");
		// si.clickInstallmentAmount("500");
		 si.clickRecoverDate("May/2013");
		 si.roundoffhighestrupee();
		 si.clickCreateButton();
		 String s=si.getMessage();
		 Assert.assertEquals(s, "Loan successfully created");
		 si.clickDeleteButton();
	}
	@Test(priority=17)
	public void CreateLoanAmountNoOfInstallmentsHigher10rupee_SC_601() throws Exception{
		CreateLoanAmountNoOfInstallmentsHigher10rupee si=new CreateLoanAmountNoOfInstallmentsHigher10rupee(driver);
		si.clickonsalary();
		si.clickonloandetail();
		 si.clickAddEmployee();
		 Thread.sleep(3000);
		 si.clickLoad();
		 Thread.sleep(3000);
		 si.clickView();
		 si.clickAddNewLoan();
		 si.clickLoanName("Bike_Loan");
		 si.selectLoanDate("01 April 2013");
		 si.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		 si.clickLoanAccountNo("656");
		 si.clickAmount("5000");
		 si.noofinstallments();
		 si.enternoofinstallments("5");
		// si.clickInstallmentAmount("500");
		 si.clickRecoverDate("May/2013");
		 si.roundoffhighestrupee();
		 si.clickCreateButton();
		 String s=si.getMessage();
		 Assert.assertEquals(s, "Loan successfully created");
		 si.clickDeleteButton();
	}
	@Test(priority=18)
	public void CreateLoanAmountNoOfInstallmentsHigher50rupee_SC_602() throws Exception{
		CreateLoanAmountNoOfInstallmentsHigher50rupee si=new CreateLoanAmountNoOfInstallmentsHigher50rupee(driver);
		si.clickonsalary();
		si.clickonloandetail();
		 si.clickAddEmployee();
		 Thread.sleep(3000);
		 si.clickLoad();
		 Thread.sleep(3000);
		 si.clickView();
		 si.clickAddNewLoan();
		 si.clickLoanName("Bike_Loan");
		 si.selectLoanDate("01 April 2013");
		 si.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		 si.clickLoanAccountNo("656");
		 si.clickAmount("5000");
		 si.noofinstallments();
		 si.enternoofinstallments("5");
		// si.clickInstallmentAmount("500");
		 si.clickRecoverDate("May/2013");
		 si.roundoffhighestrupee();
		 si.clickCreateButton();
		 String s=si.getMessage();
		 Assert.assertEquals(s, "Loan successfully created");
		 si.clickDeleteButton();
	}
	@Test(priority=19)
	public void CreateLoanAmountInterestAmountNoOfInstallmentsHigher1rupeeNoRecovery_SC_604() throws Exception{
		CreateLoanAmountInterestAmountNoOfInstallmentsHigher1rupeeNoRecovery si=new CreateLoanAmountInterestAmountNoOfInstallmentsHigher1rupeeNoRecovery(driver);
		si.clickonsalary();
		si.clickonloandetail();
		 si.clickAddEmployee();
		 Thread.sleep(3000);
		 si.clickLoad();
		 Thread.sleep(3000);
		 si.clickView();
		 si.clickAddNewLoan();
		 si.clickLoanName("Bike_Loan");
		 si.selectLoanDate("01 April 2013");
		 si.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		 si.clickLoanAccountNo("656");
		 si.clickAmount("5000");
		 si.enterinterestamount("1000");
		 si.checknoofinstallments();
		 si.noofinstallments("5");
		 si.clickRecoverDate("May/2013");
		 si.roundoffhighestrupee();
		 si.norecovery();
		 si.clickCreateButton();
		 String s=si.getMessage();
		 Assert.assertEquals(s, "Loan successfully created");
		 si.clickDeleteButton();
	}
	@Test(priority=20)
	public void CreateLoanAmountInterestAmountNoOfInstallmentsHigher10rupeeNoRecovery_SC_603() throws Exception{
		CreateLoanAmountInterestAmountNoOfInstallmentsHigher10rupeeNoRecovery si=new CreateLoanAmountInterestAmountNoOfInstallmentsHigher10rupeeNoRecovery(driver);
		si.clickonsalary();
		si.clickonloandetail();
		 si.clickAddEmployee();
		 Thread.sleep(3000);
		 si.clickLoad();
		 Thread.sleep(3000);
		 si.clickView();
		 si.clickAddNewLoan();
		 si.clickLoanName("Bike_Loan");
		 si.selectLoanDate("01 April 2013");
		 si.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		 si.clickLoanAccountNo("656");
		 si.clickAmount("5000");
		 si.enterinterestamount("1000");
		 si.checknoofinstallments();
		 si.noofinstallments("5");
		 si.clickRecoverDate("May/2013");
		 si.roundoffhighestrupee();
		 si.norecovery();
		 si.clickCreateButton();
		 String s=si.getMessage();
		 Assert.assertEquals(s, "Loan successfully created");
		 si.clickDeleteButton();
	}
	@Test(priority=21)
	public void CreateLoanAmountInterestAmountNoOfInstallmentsHigher50rupeeNoRecovery_SC_605() throws Exception{
		CreateLoanAmountInterestAmountNoOfInstallmentsHigher50rupeeNoRecovery si=new CreateLoanAmountInterestAmountNoOfInstallmentsHigher50rupeeNoRecovery(driver);
		si.clickonsalary();
		si.clickonloandetail();
		 si.clickAddEmployee();
		 Thread.sleep(3000);
		 si.clickLoad();
		 Thread.sleep(3000);
		 si.clickView();
		 si.clickAddNewLoan();
		 si.clickLoanName("Bike_Loan");
		 si.selectLoanDate("01 April 2013");
		 si.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		 si.clickLoanAccountNo("656");
		 si.clickAmount("5000");
		 si.enterinterestamount("1000");
		 si.checknoofinstallments();
		 si.noofinstallments("5");
		 si.clickRecoverDate("May/2013");
		 si.roundoffhighestrupee();
		 si.norecovery();
		 si.clickCreateButton();
		 String s=si.getMessage();
		 Assert.assertEquals(s, "Loan successfully created");
		 si.clickDeleteButton();
	}
	@Test(priority=22)
	public void CreateLoanAmountInterestAmountNoOfInstallmentsHigher1rupee_SC_606() throws Exception{
		CreateLoanAmountInterestAmountNoOfInstallmentsHigher1rupeeNoRecovery si=new CreateLoanAmountInterestAmountNoOfInstallmentsHigher1rupeeNoRecovery(driver);
		si.clickonsalary();
		si.clickonloandetail();
		 si.clickAddEmployee();
		 Thread.sleep(3000);
		 si.clickLoad();
		 Thread.sleep(3000);
		 si.clickView();
		 si.clickAddNewLoan();
		 si.clickLoanName("Bike_Loan");
		 si.selectLoanDate("01 April 2013");
		 si.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		 si.clickLoanAccountNo("656");
		 si.clickAmount("5000");
		 si.enterinterestamount("1000");
		 si.checknoofinstallments();
		 si.noofinstallments("5");
		 si.clickRecoverDate("May/2013");
		 si.roundoffhighestrupee();
		 si.clickCreateButton();
		 String s=si.getMessage();
		 Assert.assertEquals(s, "Loan successfully created");
		 si.clickDeleteButton();
	}
	@Test(priority=23)
	public void CreateLoanAmountInterestAmountNoOfInstallmentsHigher10rupee_SC_607() throws Exception{
		CreateLoanAmountInterestAmountNoOfInstallmentsHigher10rupeeNoRecovery si=new CreateLoanAmountInterestAmountNoOfInstallmentsHigher10rupeeNoRecovery(driver);
		si.clickonsalary();
		si.clickonloandetail();
		 si.clickAddEmployee();
		 Thread.sleep(3000);
		 si.clickLoad();
		 Thread.sleep(3000);
		 si.clickView();
		 si.clickAddNewLoan();
		 si.clickLoanName("Bike_Loan");
		 si.selectLoanDate("01 April 2013");
		 si.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		 si.clickLoanAccountNo("656");
		 si.clickAmount("5000");
		 si.enterinterestamount("1000");
		 si.checknoofinstallments();
		 si.noofinstallments("5");
		 si.clickRecoverDate("May/2013");
		 si.roundoffhighestrupee();
		 si.clickCreateButton();
		 String s=si.getMessage();
		 Assert.assertEquals(s, "Loan successfully created");
		 si.clickDeleteButton();
	}
	@Test(priority=24)
	public void CreateLoanAmountInterestAmountNoOfInstallmentsHigher50rupee_SC_608() throws Exception{
		CreateLoanAmountInterestAmountNoOfInstallmentsHigher50rupeeNoRecovery si=new CreateLoanAmountInterestAmountNoOfInstallmentsHigher50rupeeNoRecovery(driver);
		si.clickonsalary();
		si.clickonloandetail();
		 si.clickAddEmployee();
		 Thread.sleep(3000);
		 si.clickLoad();
		 Thread.sleep(3000);
		 si.clickView();
		 si.clickAddNewLoan();
		 si.clickLoanName("Bike_Loan");
		 si.selectLoanDate("01 April 2013");
		 si.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		 si.clickLoanAccountNo("656");
		 si.clickAmount("5000");
		 si.enterinterestamount("1000");
		 si.checknoofinstallments();
		 si.noofinstallments("5");
		 si.clickRecoverDate("May/2013");
		 si.roundoffhighestrupee();
		 si.clickCreateButton();
		 String s=si.getMessage();
		 Assert.assertEquals(s, "Loan successfully created");
		 si.clickDeleteButton();
		 Thread.sleep(3000);
		 si.navigateMaster();
		 si.selectloanmaster();
		 si.deleteloanmaster();
		 Thread.sleep(3000);
		 si.navigateMaster();
		 si.selectFinancialInst();
		 si.deletefinancialinsti();
		 
	}
}
