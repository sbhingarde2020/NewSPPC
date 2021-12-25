package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddNewPeriodicIncentiveDetailPremiumPaymentHalfYearly;
import com.spp.pages.AddNewPeriodicIncentiveDetailPremiumPaymentYearly;
import com.spp.pages.AddNewPeriodicIncentiveDetailStatutoryDeductionPTYearly;
import com.spp.pages.AddNewPeriodicIncentiveDetailStatutoryDeductionYearly;
import com.spp.pages.AddNewPeriodicIncentiveESIMonthly;
import com.spp.pages.AddNewPeriodicIncentiveESIQuarterly;
import com.spp.pages.AddNewPeriodicIncentivePFMonthly;
import com.spp.pages.AddNewPeriodicIncentivePFPTESIHalfYearly;
import com.spp.pages.AddNewPeriodicIncentivePFPTESIMonthly;
import com.spp.pages.AddNewPeriodicIncentivePFPTESIQuarterly;
import com.spp.pages.AddNewPeriodicIncentivePFPTESIYearly;
import com.spp.pages.AddNewPeriodicIncentivePFQuarterly;
import com.spp.pages.AddNewPeriodicIncentivePTMonthly;
import com.spp.pages.AddNewPeriodicIncentivePTQuarterly;
import com.spp.pages.AddNewPeriodicIncentiveStatutoryDeductionHalfYearly;
import com.spp.pages.CheckLoanDetailsRedirectsToMaster;
import com.spp.pages.CheckPeriodicIncentiveRedirectsToMaster;
import com.spp.pages.CheckifSalaryLoanGeneralLinksEmployeeMasterredirectstoEmployee;
import com.spp.pages.CheckifSalaryPerodicIncentiveGeneralLinksEmployeeMasterredirectstoEmployee;
import com.spp.pages.CreatePerodicIncMstrwithoutClubbInSalHead;
import com.spp.pages.DeleteEMIDetailInPeriodicIncentive;
import com.spp.pages.DeletePeriodicIncentiveDetail;
import com.spp.pages.EditEMIDetailInPeriodicIncentive;
import com.spp.pages.GeneratePeriodicIncentiveDetailReport;
import com.spp.pages.GroupInsuranceDetailMultiAllotment;
import com.spp.pages.GroupInsuranceDetailSingleAllotment;
import com.spp.pages.PeriodicIncentiveDetailInSingleAllotment;
import com.spp.pages.PeriodicIncentiveDetailMultiAllotment;

import junit.framework.Assert;

public class PeriodicIncentiveDetail extends BaseTest{

	
	@Test(priority=0)
	public void AddNewPeriodicIncentiveMaster_SC_312() throws Exception {
		CreatePerodicIncMstrwithoutClubbInSalHead cs=new CreatePerodicIncMstrwithoutClubbInSalHead(driver);
		cs.navigatemasterlink();
		cs.clickPeriodicIncentiveMaster();
		cs.clickAddPeriodicIncentive();
		cs.clickName("Default");
		cs.clickCreateButton();
		String d=cs.getMessage();
		Assert.assertEquals(d, "Periodic Incentive successfully created");	
	}
	
	@Test(priority=1)
	public void PeriodicIncentiveDetailInSingleAllotment_SC_313() throws Exception{
		PeriodicIncentiveDetailInSingleAllotment pi=new PeriodicIncentiveDetailInSingleAllotment(driver);
		pi.navigatesalary();
		pi.clickPeriodicInsuranceDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);
		pi.clickView();
		pi.clickAddNewGroup();
		pi.clickPeriodicInsuranceName("Default");
		pi.clickStartMonth("Apr/2013");
		pi.clickEndMonth("Apr/2013");
		pi.clickAmount("300");
		pi.clickRemark("sdfdsf");
		pi.clickCreateButton();
		String r=pi.getMessage();
		Assert.assertEquals(r, "Periodic Incentive successfully created");
		Thread.sleep(3000);
		pi.clickDeleteButton();
		}	
	@Test(priority=2)
	public void PeriodicIncentiveDetailMultiAllotment_SC_314() throws Exception{
		PeriodicIncentiveDetailMultiAllotment pi=new PeriodicIncentiveDetailMultiAllotment(driver);
		pi.navigatesalary();
		pi.clickPeriodicInsuranceDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);
		pi.clickUnTick();
		pi.clickTick1();
		pi.clickMultiAllotmentButton();
		pi.clickPeriodicInsuranceName("Default");
		pi.clickStartMonth("Apr/2013");
		pi.clickEndMonth("Apr/2013");
		pi.clickAmount("300");
		pi.clickRemark("sdfdsf");
		pi.clickCreateButton();
		Thread.sleep(5000);
		pi.clickProceed();
		String r=pi.getMessage();
		Assert.assertEquals(r, "Periodic Incentive successfully created");
		
		}	
	 @Test(priority=3)
		public void EditEMIDetailInPeriodicIncentive_SC_507() throws Exception{
		 EditEMIDetailInPeriodicIncentive am=new EditEMIDetailInPeriodicIncentive(driver);
		 am.navigatesalary();
		 am.clickPeriodicIncentiveDetails();
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
		 String s=am.getMessage();
		 Assert.assertEquals(s, "Details Successfully updated");
}	
	 @Test(priority=4)
		public void DeleteEMIDetailInPeriodicIncentive_SC_564() throws Exception{
		 DeleteEMIDetailInPeriodicIncentive am=new DeleteEMIDetailInPeriodicIncentive(driver);
		 am.navigatesalary();
		 am.clickPeriodicIncentiveDetails();
		 am.clickAddEmployee();
		 Thread.sleep(3000);
		 am.clickLoad();
		 Thread.sleep(3000);
		 am.clickView();
		 am.ClickDetail();
		 Thread.sleep(1000);
		 am.ClickDelete();
		 Thread.sleep(2000);
		 am.clickNo();
		 Thread.sleep(2000);
		 am.ClickDelete();
		 Thread.sleep(2000);
		 am.clickYes();
		 String r=am.getMessage();
		 Assert.assertEquals(r, "Details Successfully Deleted.");

	}
	 @Test(priority=5)
		public void DeletePeriodicIncentiveDetail_SC_375() throws Exception{
			DeletePeriodicIncentiveDetail pi=new DeletePeriodicIncentiveDetail(driver);
			pi.navigatesalary();
			pi.clickPeriodicInsuranceDetails();
			pi.clickAddEmployee();
			Thread.sleep(5000);
			pi.clickLoad();
			Thread.sleep(5000);
			pi.clickView();
			pi.clickDeleteButton1();
			Thread.sleep(4000);
			pi.clickDeleteButton2();
	}
	 @Test(priority=6)
		public void AddNewPeriodicIncentivePFPTESIMonthly_SC_565() throws Exception{
			AddNewPeriodicIncentivePFPTESIMonthly pi=new AddNewPeriodicIncentivePFPTESIMonthly(driver);
			pi.navigatesalary();
			pi.clickPeriodicIncentiveDetails();
			pi.clickAddEmployee();
			Thread.sleep(5000);
			pi.clickLoad();
			Thread.sleep(5000);	
			pi.clickView();
			pi.clickAddPeriodicIncentive();
			pi.clickPeriodicIncentiveName("Default");
			pi.clickAmount("4444");
			pi.clickStartMonth("Apr/2013");
			pi.clickEndMonth("Apr/2013");
			pi.clickPF();
			pi.clickPT();
			pi.clickESI();
			pi.clickMonthly();
			pi.clickCreateButton();
			String r=pi.getMessage();
			Assert.assertEquals(r, "Periodic Incentive successfully created");
			Thread.sleep(3000);
			pi.clickDeleteButton();
		}
		@Test(priority=7)
		public void AddNewPeriodicIncentivePFPTESIQuarterly_SC_566() throws Exception{
			AddNewPeriodicIncentivePFPTESIQuarterly pi=new AddNewPeriodicIncentivePFPTESIQuarterly(driver);
			pi.navigatesalary();
			pi.clickPeriodicIncentiveDetails();
			pi.clickAddEmployee();
			Thread.sleep(5000);
			pi.clickLoad();
			Thread.sleep(5000);	
			pi.clickView();
			pi.clickAddPeriodicIncentive();
			pi.clickPeriodicIncentiveName("Default");
			pi.clickAmount("4444");
			pi.clickStartMonth("Apr/2013");
			pi.clickEndMonth("Apr/2013");
			pi.clickPF();
			pi.clickPT();
			pi.clickESI();
			pi.clickQuarterly();
			pi.clickCreateButton();
			String r=pi.getMessage();
			Assert.assertEquals(r, "Periodic Incentive successfully created");
			Thread.sleep(3000);
			pi.clickDeleteButton();
		}
		@Test(priority=8)
		public void AddNewPeriodicIncentivePFPTESIHalfYearly_SC_567() throws Exception{
			AddNewPeriodicIncentivePFPTESIHalfYearly pi=new AddNewPeriodicIncentivePFPTESIHalfYearly(driver);
			pi.navigatesalary();
			pi.clickPeriodicIncentiveDetails();
			pi.clickAddEmployee();
			Thread.sleep(5000);
			pi.clickLoad();
			Thread.sleep(5000);	
			pi.clickView();
			pi.clickAddPeriodicIncentive();
			pi.clickPeriodicIncentiveName("Default");
			pi.clickAmount("4444");
			pi.clickStartMonth("Apr/2013");
			pi.clickEndMonth("Apr/2013");
			pi.clickPF();
			pi.clickPT();
			pi.clickESI();
			pi.clickHalfYearly();
			pi.clickCreateButton();
			String r=pi.getMessage();
			Assert.assertEquals(r, "Periodic Incentive successfully created");
			Thread.sleep(3000);
			pi.clickDeleteButton();
		}
		@Test(priority=9)
		public void AddNewPeriodicIncentivePFPTESIYearly_SC_568() throws Exception{
			AddNewPeriodicIncentivePFPTESIYearly pi=new AddNewPeriodicIncentivePFPTESIYearly(driver);
			pi.navigatesalary();
			pi.clickPeriodicIncentiveDetails();
			pi.clickAddEmployee();
			Thread.sleep(5000);
			pi.clickLoad();
			Thread.sleep(5000);	
			pi.clickView();
			pi.clickAddPeriodicIncentive();
			pi.clickPeriodicIncentiveName("Default");
			pi.clickAmount("4444");
			pi.clickStartMonth("Apr/2013");
			pi.clickEndMonth("Apr/2013");
			pi.clickPF();
			pi.clickPT();
			pi.clickESI();
			pi.clickYearly();
			pi.clickCreateButton();
			String r=pi.getMessage();
			Assert.assertEquals(r, "Periodic Incentive successfully created");
			Thread.sleep(3000);
			pi.clickDeleteButton();
			Thread.sleep(3000);
			pi.navigatemasterlink();
			pi.clickPeriodicIncentiveMaster();
			pi.clickdelete();
			
		}
	 @Test(priority=10)
		public void CheckifSalaryPerodicIncentiveGeneralLinksEmployeeMasterredirectstoEmployee_SC_563() throws Exception{
		 CheckifSalaryPerodicIncentiveGeneralLinksEmployeeMasterredirectstoEmployee si=new CheckifSalaryPerodicIncentiveGeneralLinksEmployeeMasterredirectstoEmployee(driver);
			si.clickonsalary();
			si.clickonperodicincentivedetail();
			si.clickongenerallinks();
			Thread.sleep(2000);
			si.clickonemployeemaster();
			si.addnewemployee();
			si.enterEmployeeid("ABC12345");
			si.enterEmployeeref("12345");
			si.enterEmployeename("Aditya");
			si.enterEmployeefather("Harish");
			si.selectDateofBirth("06 June 1995");
			si.selectGender("Female");
			si.selectMaritalStatus("Single");
			si.selectDateofJoining("06 April 2013");
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
	 		si.clickonemployee();
	 		si.clickonemployeedetails();
	 		si.clickonfilter();
	 		Thread.sleep(3000);
	 		si.clickonload();
	 		Thread.sleep(3000);
	 		si.deleteemployee();
		}
	
	@Test(priority=11)
	public void CheckPeriodicIncentiveRedirectsToMaster_SC_508() throws Exception{
	CheckPeriodicIncentiveRedirectsToMaster am=new CheckPeriodicIncentiveRedirectsToMaster(driver);
	 am.navigatesalary();
	 am.clickPeriodicIncentiveDetails();
	 am.clickGeneralLink();
	 am.clickPeriodicMaster();
	 am.clickAddNewPeriodicMaster();
	 am.clickPeriodicName("Perodic_Incentive");
	 am.clickCreateButton();
	 String r=am.getMessage();
	 Assert.assertEquals(r, "Periodic Incentive successfully created");
	 Thread.sleep(2000);
	 am.clickdelete();
	}
	
	
@Test(priority=12)
	public void AddNewPeriodicIncentivePFMonthly_SC_569() throws Exception{
		AddNewPeriodicIncentivePFMonthly pi=new AddNewPeriodicIncentivePFMonthly(driver);
		pi.navigatemasterlink();
		pi.clickPeriodicIncentiveMaster();
		pi.clickAddPeriodicIncentiveMaster();
		pi.clickName("Default");
		pi.clickCreatePeriodicIncentiveMaster();
		Thread.sleep(2000);
		pi.navigatesalary();
		pi.clickPeriodicIncentiveDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);	
		pi.clickView();
		pi.clickAddPeriodicIncentive();
		pi.clickPeriodicIncentiveName("Default");
		pi.clickAmount("4444");
		pi.clickStartMonth("Apr/2013");
		pi.clickEndMonth("Apr/2013");
		pi.clickPF();
		pi.clickMonthly();
		pi.clickCreateButton();
		String r=pi.getMessage();
		Assert.assertEquals(r, "Periodic Incentive successfully created");
		Thread.sleep(5000);
		pi.clickDeleteButton();
	}
	@Test(priority=13)
	public void AddNewPeriodicIncentivePTMonthly_SC_570() throws Exception{
		AddNewPeriodicIncentivePTMonthly pi=new AddNewPeriodicIncentivePTMonthly(driver);
		pi.navigatesalary();
		pi.clickPeriodicIncentiveDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);	
		pi.clickView();
		pi.clickAddPeriodicIncentive();
		pi.clickPeriodicIncentiveName("Default");
		pi.clickAmount("4444");
		pi.clickStartMonth("Apr/2013");
		pi.clickEndMonth("Apr/2013");
		pi.clickPT();
		pi.clickMonthly();
		pi.clickCreateButton();
		String r=pi.getMessage();
		Assert.assertEquals(r, "Periodic Incentive successfully created");
		Thread.sleep(5000);
		pi.clickDeleteButton();
	}
	@Test(priority=14)
	public void AddNewPeriodicIncentiveESIMonthly_SC_571() throws Exception{
		AddNewPeriodicIncentiveESIMonthly pi=new AddNewPeriodicIncentiveESIMonthly(driver);
		pi.navigatesalary();
		pi.clickPeriodicIncentiveDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);	
		pi.clickView();
		pi.clickAddPeriodicIncentive();
		pi.clickPeriodicIncentiveName("Default");
		pi.clickAmount("4444");
		pi.clickStartMonth("Apr/2013");
		pi.clickEndMonth("Apr/2013");
		pi.clickESI();
		pi.clickMonthly();
		pi.clickCreateButton();
		String r=pi.getMessage();
		Assert.assertEquals(r, "Periodic Incentive successfully created");
		Thread.sleep(5000);
		pi.clickDeleteButton();
	}
	@Test(priority=15)
	public void AddNewPeriodicIncentivePFQuarterly_SC_572() throws Exception{
		AddNewPeriodicIncentivePFQuarterly pi=new AddNewPeriodicIncentivePFQuarterly(driver);
		pi.navigatesalary();
		pi.clickPeriodicIncentiveDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);	
		pi.clickView();
		pi.clickAddPeriodicIncentive();
		pi.clickPeriodicIncentiveName("Default");
		pi.clickAmount("4444");
		pi.clickStartMonth("Apr/2013");
		pi.clickEndMonth("Apr/2013");
		pi.clickPF();
		pi.clickQuarterly();
		pi.clickCreateButton();
		String r=pi.getMessage();
		Assert.assertEquals(r, "Periodic Incentive successfully created");
		Thread.sleep(5000);
		pi.clickDeleteButton();
	}
	@Test(priority=16)
	public void AddNewPeriodicIncentivePTQuarterly_SC_573() throws Exception{
		AddNewPeriodicIncentivePTQuarterly pi=new AddNewPeriodicIncentivePTQuarterly(driver);
		pi.navigatesalary();
		pi.clickPeriodicIncentiveDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);	
		pi.clickView();
		pi.clickAddPeriodicIncentive();
		pi.clickPeriodicIncentiveName("Default");
		pi.clickAmount("4444");
		pi.clickStartMonth("Apr/2013");
		pi.clickEndMonth("Apr/2013");
		pi.clickPT();
		pi.clickQuarterly();
		pi.clickCreateButton();
		String r=pi.getMessage();
		Assert.assertEquals(r, "Periodic Incentive successfully created");
		Thread.sleep(5000);
		pi.clickDeleteButton();
	}
	@Test(priority=17)
	public void AddNewPeriodicIncentiveESIQuarterly_SC_574() throws Exception{
		AddNewPeriodicIncentiveESIQuarterly pi=new AddNewPeriodicIncentiveESIQuarterly(driver);
		pi.navigatesalary();
		pi.clickPeriodicIncentiveDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);	
		pi.clickView();
		pi.clickAddPeriodicIncentive();
		pi.clickPeriodicIncentiveName("Default");
		pi.clickAmount("4444");
		pi.clickStartMonth("Apr/2013");
		pi.clickEndMonth("Apr/2013");
		pi.clickESI();
		pi.clickQuarterly();
		pi.clickCreateButton();
		String r=pi.getMessage();
		Assert.assertEquals(r, "Periodic Incentive successfully created");
		Thread.sleep(5000);
		pi.clickDeleteButton();
}
	@Test(priority=18)
	public void AddNewPeriodicIncentivePremiumPaymentQuarterly_SC_575() throws Exception{
		AddNewPeriodicIncentiveESIQuarterly pi=new AddNewPeriodicIncentiveESIQuarterly(driver);
		pi.navigatesalary();
		pi.clickPeriodicIncentiveDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);	
		pi.clickView();
		pi.clickAddPeriodicIncentive();
		pi.clickPeriodicIncentiveName("Default");
		pi.clickAmount("4444");
		pi.clickStartMonth("Apr/2013");
		pi.clickEndMonth("Apr/2013");
		pi.addpremiumpaymentquarterly();
		pi.clickCreateButton();
		String r=pi.getMessage();
		Assert.assertEquals(r, "Periodic Incentive successfully created");
		Thread.sleep(5000);
		pi.clickDeleteButton();
}
	@Test(priority=19)
	public void AddNewPeriodicIncentiveDetailPremiumPaymentHalfYearly_SC_628() throws Exception{
	   AddNewPeriodicIncentiveDetailPremiumPaymentHalfYearly pi=new AddNewPeriodicIncentiveDetailPremiumPaymentHalfYearly(driver);
	   pi.navigatesalary();
	   pi.clickPeriodicIncentiveDetails();
	   pi.clickAddEmployee();
	   Thread.sleep(5000);
	   pi.clickLoad();
	   Thread.sleep(5000);	
	   pi.clickView();
	   pi.clickAddPeriodicIncentive();
	   pi.clickPeriodicIncentiveName("Default");
	   pi.clickAmount("4444");
	   pi.clickStartMonth("Apr/2013");
	   pi.clickEndMonth("Apr/2013");
	   pi.selectpremiumpaymenthalfyearly();
	   pi.clickCreateButton();
	   String r=pi.getMessage();
	   Assert.assertEquals(r, "Periodic Incentive successfully created");
	   Thread.sleep(3000);
	   pi.clickDeleteButton();
	}
	
	@Test(priority=20)
	public void AddNewPeriodicIncentiveStatutoryDeductionPFHalfYearly_SC_629() throws Exception{
		AddNewPeriodicIncentiveStatutoryDeductionHalfYearly pi=new AddNewPeriodicIncentiveStatutoryDeductionHalfYearly(driver);
		pi.navigatesalary();
		pi.clickPeriodicIncentiveDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);	
		pi.clickView();
		pi.clickAddPeriodicIncentive();
		pi.clickPeriodicIncentiveName("Default");
		pi.clickAmount("4444");
		pi.clickStartMonth("Apr/2013");
		pi.clickEndMonth("Apr/2013");
		pi.clickPF();
		pi.selectpremiumpaymenthalfyearly();
		pi.clickCreateButton();
		String r=pi.getMessage();
		Assert.assertEquals(r, "Periodic Incentive successfully created");
		Thread.sleep(5000);
		pi.clickDeleteButton();
	}
	
	
	@Test(priority=21)
	public void AddNewPeriodicIncentiveDetailPremiumPaymentYearly_SC_630() throws Exception{
	   AddNewPeriodicIncentiveDetailPremiumPaymentYearly pi=new AddNewPeriodicIncentiveDetailPremiumPaymentYearly(driver);
	   pi.navigatesalary();
	   pi.clickPeriodicIncentiveDetails();
	   pi.clickAddEmployee();
	   Thread.sleep(5000);
	   pi.clickLoad();
	   Thread.sleep(5000);	
	   pi.clickView();
	   pi.clickAddPeriodicIncentive();
	   pi.clickPeriodicIncentiveName("Default");
	   pi.clickAmount("4444");
	   pi.clickStartMonth("Apr/2013");
	   pi.clickEndMonth("Apr/2013");
	   pi.selectpremiumpaymentyearly();
	   pi.clickCreateButton();
	   String r=pi.getMessage();
	   Assert.assertEquals(r, "Periodic Incentive successfully created");
	   Thread.sleep(3000);
	   pi.clickDeleteButton();
	}
	
	@Test(priority=22)
	public void AddNewPeriodicIncentiveDetailStatutoryDeductionPTYearly_SC_631() throws Exception{
		AddNewPeriodicIncentiveDetailStatutoryDeductionPTYearly pi=new AddNewPeriodicIncentiveDetailStatutoryDeductionPTYearly(driver);
	   pi.navigatesalary();
	   pi.clickPeriodicIncentiveDetails();
	   pi.clickAddEmployee();
	   Thread.sleep(5000);
	   pi.clickLoad();
	   Thread.sleep(5000);	
	   pi.clickView();
	   pi.clickAddPeriodicIncentive();
	   pi.clickPeriodicIncentiveName("Default");
	   pi.clickAmount("4444");
	   pi.clickStartMonth("Apr/2013");
	   pi.clickEndMonth("Apr/2013");
	   pi.clickPT();
	   pi.selectpremiumpaymentyearly();
	   pi.clickCreateButton();
	   String r=pi.getMessage();
	   Assert.assertEquals(r, "Periodic Incentive successfully created");
	   Thread.sleep(3000);
	   pi.clickDeleteButton();
	}
	
	@Test(priority=23)
	public void AddNewPeriodicIncentiveDetailStatutoryDeductionESIHalfYearly_SC_632() throws Exception{
		AddNewPeriodicIncentiveStatutoryDeductionHalfYearly pi=new AddNewPeriodicIncentiveStatutoryDeductionHalfYearly(driver);
	   pi.navigatesalary();
	   pi.clickPeriodicIncentiveDetails();
	   pi.clickAddEmployee();
	   Thread.sleep(5000);
	   pi.clickLoad();
	   Thread.sleep(5000);	
	   pi.clickView();
	   pi.clickAddPeriodicIncentive();
	   pi.clickPeriodicIncentiveName("Default");
	   pi.clickAmount("4444");
	   pi.clickStartMonth("Apr/2013");
	   pi.clickEndMonth("Apr/2013");
	   pi.clickESI();
	   pi.selectpremiumpaymenthalfyearly();
	   pi.clickCreateButton();
	   String r=pi.getMessage();
	   Assert.assertEquals(r, "Periodic Incentive successfully created");
	   Thread.sleep(3000);
	   pi.clickDeleteButton();
	}
	
	@Test(priority=24)
	public void AddNewPeriodicIncentiveDetailStatutoryPFDeductionYearly_SC_633() throws Exception{
		AddNewPeriodicIncentiveDetailStatutoryDeductionYearly pi=new AddNewPeriodicIncentiveDetailStatutoryDeductionYearly(driver);
	   pi.navigatesalary();
	   pi.clickPeriodicIncentiveDetails();
	   pi.clickAddEmployee();
	   Thread.sleep(5000);
	   pi.clickLoad();
	   Thread.sleep(5000);	
	   pi.clickView();
	   pi.clickAddPeriodicIncentive();
	   pi.clickPeriodicIncentiveName("Default");
	   pi.clickAmount("4444");
	   pi.clickStartMonth("Apr/2013");
	   pi.clickEndMonth("Apr/2013");
	   pi.clickPF();
	   pi.selectpremiumpaymentyearly();
	   pi.clickCreateButton();
	   String r=pi.getMessage();
	   Assert.assertEquals(r, "Periodic Incentive successfully created");
	   Thread.sleep(3000);
	   pi.clickDeleteButton();
	}
	
	@Test(priority=25)
	public void AddNewPeriodicIncentiveDetailStatutoryESIDeductionYearly_SC_634() throws Exception{
	   AddNewPeriodicIncentiveDetailStatutoryDeductionYearly pi=new AddNewPeriodicIncentiveDetailStatutoryDeductionYearly(driver);
	   pi.navigatesalary();
	   pi.clickPeriodicIncentiveDetails();
	   pi.clickAddEmployee();
	   Thread.sleep(5000);
	   pi.clickLoad();
	   Thread.sleep(5000);	
	   pi.clickView();
	   pi.clickAddPeriodicIncentive();
	   pi.clickPeriodicIncentiveName("Default");
	   pi.clickAmount("4444");
	   pi.clickStartMonth("Apr/2013");
	   pi.clickEndMonth("Apr/2013");
	   pi.clickESI();
	   pi.selectpremiumpaymentyearly();
	   pi.clickCreateButton();
	   String r=pi.getMessage();
	   Assert.assertEquals(r, "Periodic Incentive successfully created");
	   Thread.sleep(3000);
	   pi.clickDeleteButton();
	}
	@Test(priority=26)
	public void AddNewPeriodicIncentiveDetailStatutoryDeductionYearly_SC_635() throws Exception{
		AddNewPeriodicIncentiveStatutoryDeductionHalfYearly pi=new AddNewPeriodicIncentiveStatutoryDeductionHalfYearly(driver);
	   pi.navigatesalary();
	   pi.clickPeriodicIncentiveDetails();
	   pi.clickAddEmployee();
	   Thread.sleep(5000);
	   pi.clickLoad();
	   Thread.sleep(5000);	
	   pi.clickView();
	   pi.clickAddPeriodicIncentive();
	   pi.clickPeriodicIncentiveName("Default");
	   pi.clickAmount("4444");
	   pi.clickStartMonth("Apr/2013");
	   pi.clickEndMonth("Apr/2013");
	   pi.clickPT();
	   pi.selectpremiumpaymenthalfyearly();
	   pi.clickCreateButton();
	   String r=pi.getMessage();
	   Assert.assertEquals(r, "Periodic Incentive successfully created");
	   Thread.sleep(3000);
	   pi.clickDeleteButton();
	   Thread.sleep(3000);
	   pi.navigatemasterlink();
	   pi.clickPeriodicIncentiveMaster();
	   pi.clickdeletemaster();
	   
	}
	
	
	
	
	
	
	
	 /*	@Test(priority=0)
		public void GeneratePeriodicIncentiveDetailReport_SC_374() throws Exception{
			GeneratePeriodicIncentiveDetailReport pi=new GeneratePeriodicIncentiveDetailReport(driver);
			pi.navigatesalary();
			pi.clickPeriodicIncentiveDetails();
			Thread.sleep(4000);
			pi.clickReport();
			pi.clickStandingInstructionDetailReport();
			pi.clickSIType("Periodic Incentive");
			pi.clickReports("Detailed Report");
			pi.clickFrom("Apr/2013");
			pi.clickTo("Apr/2013");
			pi.ClickGetEmployees();
			Thread.sleep(3000);
			pi.clickLoad();
			Thread.sleep(3000);
			String s=pi.getMessage();
			Assert.assertEquals(s, "Employees Successfully Loaded.");
			//pi.clickEmployee();
			 pi.clickGenerateReport();
	}*/
}