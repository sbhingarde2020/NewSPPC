package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddAdvanceMaster;
import com.spp.pages.AddGroupInsuranceMaster;
import com.spp.pages.AddGroupInsuranceMasterWithClubbedInSalary;
import com.spp.pages.AddInsuranceMaster;
import com.spp.pages.AddInsuranceMasterWithClubbedInSalary;
import com.spp.pages.AddLoanMaster;
import com.spp.pages.AddLoanMasterWithClubbedInSalary;
import com.spp.pages.AddNewGroupInsuranceMaster;
import com.spp.pages.AddNewInsuranceMaster;
import com.spp.pages.AddNewPeriodicIncentiveMaster;
import com.spp.pages.CheckPeriodicIncMstrcanbeEdited;
import com.spp.pages.CheckifSalaryGroupInsuranceGeneralLinksEmployeeMasterredirectstoEmployee;
import com.spp.pages.CheckifSalaryGroupInsuranceGeneralLinksInsuranceMasterredirectstoMaster;
import com.spp.pages.CheckifSalaryInsuranceGeneralLinksEmployeeMasterredirectstoEmployee;
import com.spp.pages.CheckifSalaryInsuranceGeneralLinksInsuranceMasterredirectstoMaster;
import com.spp.pages.CreateGroupInsurancePremiumPaymentHalfYearly;
import com.spp.pages.CreateGroupInsurancePremiumPaymentQuarterly;
import com.spp.pages.CreateGroupInsurancePremiumPaymentYearly;
import com.spp.pages.CreateGrpInsrnceMstrwithoutClubbInSal;
import com.spp.pages.CreateGrpInsunceMstrwithClubbInSal;
import com.spp.pages.CreatePeriodicIncMstrwithClubbInSal;
import com.spp.pages.CheckForInterestRateInLoanMaster;
import com.spp.pages.CheckForMaxAllowedInLoanMaster;
import com.spp.pages.CheckForMaxAmountInLoanMaster;
import com.spp.pages.CheckForNoOfInstallmentsInLoanMaster;
import com.spp.pages.CheckGrpIncMstrcanbeEdited;
import com.spp.pages.CheckInstitutionNameInGroupInsurance;
import com.spp.pages.CreateInsuranceDetails;
import com.spp.pages.CreateInsurancePremiumPaymentHalfYearly;
import com.spp.pages.CreateInsurancePremiumPaymentQuarterly;
import com.spp.pages.CreateInsurancePremiumPaymentYearly;
import com.spp.pages.CreatePayment;
import com.spp.pages.DeleteAdvanceMaster;
import com.spp.pages.DeleteEMIDetail;
import com.spp.pages.DeleteEMIDetailInGroupInsuranceDetail;
import com.spp.pages.DeleteGroupInsuranceDetail;
import com.spp.pages.DeleteGroupInsuranceMaster;
import com.spp.pages.DeleteInsuranceDetail;
import com.spp.pages.DeleteInsuranceMaster;
import com.spp.pages.DeleteLoanMaster;
import com.spp.pages.DeletePeriodicIncentiveDetail;
import com.spp.pages.DeletePeriodicIncetive;
import com.spp.pages.EditEMIDetailInsuranceDetails;
import com.spp.pages.EditEMIDetailInGroupInsurance;
import com.spp.pages.GeneratePeriodicIncentiveDetailReport;
import com.spp.pages.GroupInsuranceDetailMultiAllotment;
import com.spp.pages.GroupInsuranceDetailSingleAllotment;
import com.spp.pages.PeriodicIncentiveDetailInSingleAllotment;
import com.spp.pages.PeriodicIncentiveDetailMultiAllotment;
import com.spp.pages.SalaryGroupInsuranceReportsStandingInsDetailReportredirectstoReport;
import com.spp.pages.SalaryInsuranceReportsStandingInsDetailReportredirectstoReport;
import com.spp.pages.UpdateAdvanceMaster;
import com.spp.pages.UpdateGroupInsurance;
import com.spp.pages.UpdateInsuranceMaster;
import com.spp.pages.UpdateLoanMaster;
import com.spp.pages.UpdatePeriodicIncentive;

public class StandingInstructionTestCase extends BaseTest{

  /*@Test(priority=0)
	public void verifyCreatedAdvanceMaster_SC_140() throws Exception{
		AddAdvanceMaster am=new AddAdvanceMaster(driver);
		Thread.sleep(5000);
		am.navigateMaster();
		am.clickAdvanceMaster();
		am.clickAddAdvancMaster();
		am.enterAdvanceName("Diwali advance");
		am.enterInterestRate("2");
		am.enterMaximumAmount("20000");
		am.enterMaximumAllowed("1");
		am.enterEMIRecovery("10");
		am.clickClubbedInSalary();
		am.clickReducingBalance();
		am.clickCreateAdvanceButton();
		String s=am.getMessage();
		Assert.assertEquals(s, "Advance successfully created");
	}
	
	@Test(priority=1)
	public void verifyUpdatedAdvanceMaster_SC_148() throws Exception{
		UpdateAdvanceMaster am=new UpdateAdvanceMaster(driver);
		Thread.sleep(1000);
		am.navigateMaster();
		am.clickAdvanceMaster();
		am.clickEditAdvanceMaster();
		am.enterAdvanceName("Diwaali advance1");
		am.enterInterestRate("3");
		am.enterMaximumAmount("25000");
		am.enterMaximumAllowed("2");
		am.enterEMIRecovery("15");
		am.clickUpdateAdvanceMaster();
		String s=am.getMessage();
		Assert.assertEquals(s, "Advance successfully updated");
	}

	@Test(priority=2)
	public void verifyDeletedAdvanceMaster_SC_149() throws Exception{
		DeleteAdvanceMaster am=new DeleteAdvanceMaster(driver);
		Thread.sleep(5000);
		am.navigateMaster();
		am.clickAdvanceMaster();
		am.clickDeleteAdvanceMaster();
		String s=am.getMessage();
		Assert.assertEquals(s, "Advance successfully deleted");
	}

	@Test(priority=3)
	public void verifyCreatedLoanMaster_SC_9() throws Exception{
		AddLoanMaster lm=new AddLoanMaster(driver);
		Thread.sleep(5000);
		lm.navigateMaster();
		lm.clickLoanMaster();
		lm.clickAddLoanMaster();
		lm.enterLoanName("Home Loan");
		lm.enterInterestRate("2");
		lm.enterMaximumAmount("20000");
		lm.enterMaximumAllowed("2");
		lm.enterEMIRecovery("10");
		lm.clickClubbedInSalary();
		lm.clickReducingBalance();
		lm.clickCreateLoan();
		String s=lm.getMessage();
		Assert.assertEquals(s, "Loan successfully created");
	}
	
	@Test(priority=4)
	public void verifyUpdatedLoanMaster_SC_12() throws Exception{
		UpdateLoanMaster lm=new UpdateLoanMaster(driver);
		Thread.sleep(5000);
		lm.navigateMaster();
		lm.clickLoanMaster();
		lm.clickEditLoanMaster();
		lm.enterLoanName("Bike loan");
		lm.enterInterestRate("3");
		lm.enterMaximumAmount("25000");
		lm.enterMaximumAllowed("2");
		lm.enterEMIRecovery("15");
		lm.clickUpdateLoanMaster();
		String s=lm.getMessage();
		Assert.assertEquals(s, "Loan successfully updated");
	}
	
	@Test(priority=5)
	public void verifyDeletedLoanMaster_SC_14() throws Exception{
		DeleteLoanMaster lm=new DeleteLoanMaster(driver);
		Thread.sleep(5000);
		lm.navigateMaster();
		lm.clickLoanMaster();
		lm.clickDeleteLoanMaster();
		String s=lm.getMessage();
		Assert.assertEquals(s, "Loan successfully deleted");
	}

	@Test(priority=6)
	public void verifyCreatedInssuranceMaster_SC_15() throws Exception{
		AddInsuranceMaster im=new AddInsuranceMaster(driver);
		Thread.sleep(5000);
		im.navigateMaster();
		im.clickInsuranceMaster();
		im.clickAddInsuranceMaster();
		im.enterInsuranceName("Group Insurance");
		im.clicCreateInsuranceMaster();
		String s=im.getMessage();
		Assert.assertEquals(s, "Insurance successfully created");
	}
	
	@Test(priority=7)
	public void verifyUpdatedInsuranceMaster_SC_17() throws Exception{
		UpdateInsuranceMaster im=new UpdateInsuranceMaster(driver);
		Thread.sleep(5000);
		im.navigateMaster();
		im.clickInsuranceMaster();
		im.clickEditInsuranceMaster();
		im.enterInsuranceName("insurance2");
		Thread.sleep(3000);
		im.clickUpdateInsuranceMaster();
		String s=im.getMessage();
		Assert.assertEquals(s, "Insurance successfully updated");
	}
	
	@Test(priority=8)
	public void verifyDeletedInsuranceMaster_SC_18() throws Exception{
		DeleteInsuranceMaster im=new DeleteInsuranceMaster(driver);
		Thread.sleep(5000);
		im.navigateMaster();
		im.clickInsuranceMaster();
		im.clickDeleteInsuranceMaster();
		String s=im.getMessage();
		Assert.assertEquals(s, "Insurance successfully deleted");
	}
	
	@Test(priority=9)
	public void CreateGrpInsrnceMstrwithoutClubbInSal_SC_19() throws Exception{
		CreateGrpInsrnceMstrwithoutClubbInSal cs=new CreateGrpInsrnceMstrwithoutClubbInSal(driver);
		cs.navigateMaster();
		cs.selectGroupInsurance();
		cs.clickaddGroupInsurance();
		cs.enterGroupInsurance("GroupInsuranceMaster"+Utility.getRandNum(10, 10000));
		cs.uncheckclubbinsalhead();
		cs.clickCreateGroupInsurance();
		String d=cs.getMessage();
		Assert.assertEquals(d, "Group Insurance successfully created");
	}
	
	@Test(priority=10)
	public void CheckGrpIncMstrcanbeEdited_SC_21() throws Exception{
		CheckGrpIncMstrcanbeEdited gi=new CheckGrpIncMstrcanbeEdited(driver);
			gi.navigateMaster();
			gi.selectGroupInsurance();
			gi.clickonedit();
			gi.enterGroupInsurance("GroupInsuranceMaster"+Utility.getRandNum(10, 10000));
			gi.updategrpinsurnce();
			String d=gi.getMessage();
			Assert.assertEquals(d, "Group Insurance successfully updated");	
	}
	
	@Test(priority=11)
	public void verifyDeletedGroupInsurance_SC_23() throws Exception{
		DeleteGroupInsuranceMaster gi=new DeleteGroupInsuranceMaster(driver);
		gi.navigateMaster();
		gi.selectGroupInsurance();
		gi.clickDeleteGroupInsurance();
		String s=gi.getMessage();
		Assert.assertEquals(s, "Group Insurance successfully deleted");
	}
	
	@Test(priority=12)
	public void verifyAddedPeriodicIncentive_SC_24() throws Exception{
		CheckPeriodicIncMstrcanbeEdited pi=new CheckPeriodicIncMstrcanbeEdited(driver);
		Thread.sleep(5000);
		pi.navigateMaster();
		pi.selectPeriodicIncentive();
		pi.clickAddPeriodicIncentive();
		pi.enterPeriodicIncentiveName("new periodic incentive");
		pi.selectUntickClubbedInSalary();
		pi.clickCreatePeriodicIncentive();
		String s=pi.getMessage();
		Assert.assertEquals(s, "Periodic Incentive successfully created");
	}
	
	
	/*@Test(priority=13)
	public void verifyUpdatedPeriodicIncentive_SC_26() throws Exception{
		UpdatePeriodicIncentive pi=new UpdatePeriodicIncentive(driver);
		Thread.sleep(5000);
		pi.navigateMaster();
		pi.selectPeriodicIncentive();
		pi.clickEditPeriodicIncentive();
		pi.enterPeriodicIncentiveName("new periodic incentive1");
		pi.clickUpdatePeriodicIncentive();
		String s=pi.getMessage();
		Assert.assertEquals(s, "Periodic Incentive successfully updated");
	}

	@Test(priority=14)
	public void verifyDeletedPeriodicIncetive_SC_27() throws Exception{
		DeletePeriodicIncetive pi=new DeletePeriodicIncetive(driver);
		Thread.sleep(5000);
		pi.navigateMaster();
		pi.selectPeriodicIncentive();
		pi.clickDeletePeriodicIncentive();
		String s=pi.getMessage();
		Assert.assertEquals(s, "Periodic Incentive successfully deleted");
	}  	
	@Test(priority=15)
	public void AddLoanMasterWithClubbedInSalary_SC_11() throws Exception{
		AddLoanMasterWithClubbedInSalary pi=new AddLoanMasterWithClubbedInSalary(driver);
		pi.navigateMaster();	
		pi.clickAdvanceMaster();
		pi.clickNewAdvanceMaster();
		pi.clickAdvanceName("ADMaster"+Utility.getRandNum(10, 1000));
		pi.clickclubbedInSalary();
		pi.clickCreateAdvance();
		String c=pi.getMessage();
		System.out.println(c);
		Assert.assertTrue(c.contains("Advance successfully"));
		//Assert.assertEquals(c, "Advance successfully created");
	    Thread.sleep(4000);
	    pi.clickDeleteButton();
}
	@Test(priority=16)
	public void CheckForMaxAmountInLoanMaster_SC_259() throws Exception{
		CheckForMaxAmountInLoanMaster pi=new CheckForMaxAmountInLoanMaster(driver);
		pi.navigateMaster();	
		pi.clickLoanMaster();
		 String LoanMaster=pi.getLoanMaster();
		pi.clickEditLink();
		pi.enterMaxAmount("10000");
		pi.clickUpdateButton();
		String s=pi.getMessage();
		Assert.assertEquals(s, "Loan successfully updated");
		pi.clicksalary();
		pi.clickLoanDetails();
		pi.clickAddEmployee();
		Thread.sleep(6000);
		pi.clickLoad();
		pi.clickView();
		pi.clickAddNewLoanDetails();
		pi.clickLoanName(LoanMaster);
		pi.clickAmount("15000");
		pi.clickCreateAdvance();
		Thread.sleep(4000);
		pi.switchToPopUpAndAccept(driver);
}  
	@Test(priority=17)
	public void CheckForNoOfInstallmentsInLoanMaster_SC_260() throws Exception{
		CheckForNoOfInstallmentsInLoanMaster pi=new CheckForNoOfInstallmentsInLoanMaster(driver);
		pi.navigateMaster();	
		pi.clickLoanMaster();
		 String LoanMaster=pi.getLoanMaster();
		pi.clickEditLink();
		pi.enterEMIRecovery("17");
		pi.clickUpdateButton();
		String s=pi.getMessage1();
		Assert.assertEquals(s, "Loan successfully updated");
		pi.clicksalary();
		pi.clickLoanDetails();
		pi.clickAddEmployee();
		Thread.sleep(6000);
		pi.clickLoad();
		pi.clickView();
		pi.clickAddNewLoanDetails();
		pi.clickLoanName(LoanMaster);
		pi.clickInstitutionName("nwr hg-12345");
		pi.clickAmount("5000");
        Thread.sleep(3000);
		pi.clicklumpsum();
		pi.clickInstallments("6");
		Thread.sleep(1000);
		pi.clickLoanDate("31 March 2018");
		pi.clickLoanAccountNo("65");
		
		pi.clickRecoveryDate("Mar/2018");
		
		pi.clickCreateAdvance();
		Thread.sleep(5000);
		String t=pi.getMessage();
		System.out.println(":"+t+":");
		Assert.assertTrue(t.contains("Loan successfully"));
		//pi.selectPreviouslistpage();
		Thread.sleep(5000);
		pi.deleteadvancedetails(LoanMaster);
		pi.switchToPopUpAndAccept(driver);
		
	}
	@Test(priority=18)
	public void CheckForInterestRateInLoanMaster_SC_257() throws Exception{
		CheckForInterestRateInLoanMaster pi=new CheckForInterestRateInLoanMaster(driver);
		pi.navigateMaster();	
		pi.clickLoanMaster();
		 String LoanMaster=pi.getLoanMaster();
		pi.clickEditLink();
		pi.enterInterestRate("3");
		pi.clickUpdateButton();
		String s=pi.getMessage1();
		Assert.assertEquals(s, "Loan successfully updated");
		pi.clicksalary();
		pi.clickLoanDetails();
		pi.clickAddEmployee();
		Thread.sleep(6000);
		pi.clickLoad();
		pi.clickView();
		pi.clickAddNewLoanDetails();
		pi.clickLoanName(LoanMaster);
		pi.clickInstitutionName("nwr hg-12345");
		pi.clickAmount("5000");
        Thread.sleep(2000);
		
//		pi.clickInstallments("5");
//		Thread.sleep(1000);
//		pi.clickLoanDate("31 March 2018");
//		pi.clickLoanAccountNo("65");
//		
//		pi.clickRecoveryDate("Mar/2018");
//		
//		pi.clickCreateAdvance();
//		Thread.sleep(5000);
//		String t=pi.getMessage();
//		System.out.println(":"+t+":");
//		Assert.assertTrue(t.contains("Loan successfully"));
//		//pi.selectPreviouslistpage();
//		Thread.sleep(5000);
//		pi.deleteadvancedetails(LoanMaster);
//		pi.switchToPopUpAndAccept(driver);
		
	}  
	@Test(priority=19)
	public void CheckForMaxAllowedInLoanMaster_SC_261() throws Exception{
		CheckForMaxAllowedInLoanMaster pi=new CheckForMaxAllowedInLoanMaster(driver);
		pi.navigateMaster();	
		pi.clickLoanMaster();
		 String LoanMaster=pi.getLoanMaster();
		pi.clickEditLink();
		pi.enterMaxAllowedValue("1");
		Thread.sleep(4000);
		pi.clickEMIRecovery();
		Thread.sleep(3000);
		pi.clickInterestRate();
		Thread.sleep(4000);
		pi.clickMaxAmount();
		pi.clickUpdateButton();
		String s=pi.getMessage1();
		Assert.assertEquals(s, "Loan successfully updated");
		pi.clicksalary();
		pi.clickLoanDetails();
		pi.clickAddEmployee();
		Thread.sleep(6000);
		pi.clickLoad();
		pi.clickView();
		pi.clickAddNewLoanDetails();
		pi.clickLoanName(LoanMaster);
		pi.clickInstitutionName("nwr hg-12345");
		pi.clickAmount("5000");
        Thread.sleep(5000);
		
		pi.clickInstallments("5");
		Thread.sleep(1000);
		pi.clickLoanDate("31 March 2018");
		pi.clickLoanAccountNo("65");
		
		pi.clickRecoveryDate("Mar/2018");
		
		pi.clickCreateAdvance();
		Thread.sleep(5000);
		String t=pi.getMessage();
		System.out.println(":"+t+":");
		Assert.assertTrue(t.contains("Loan successfully"));
		//pi.selectPreviouslistpage();
		Thread.sleep(9000);
		pi.clickAddNewLoanDetails();
		pi.clickLoanName(LoanMaster);
		pi.clickInstitutionName("nwr hg-12345");
		pi.clickAmount("5000");
        Thread.sleep(2000);
		
		pi.clickInstallments("5");
		Thread.sleep(1000);
		pi.clickLoanDate("31 March 2018");
		pi.clickLoanAccountNo("65");
		
		pi.clickRecoveryDate("Mar/2018");
		
		pi.clickCreateAdvance();
		Thread.sleep(5000);
		pi.switchToPopUpAndAccept(driver);
		pi.selectPreviouslistpage();
		Thread.sleep(4000);
		pi.deleteadvancedetails(LoanMaster);
		pi.switchToPopUpAndAccept(driver);
	
	}	
	@Test(priority=20)
	public void AddInsuranceMasterWithClubbedInSalary_SC_16() throws Exception{
		AddInsuranceMasterWithClubbedInSalary pi=new AddInsuranceMasterWithClubbedInSalary(driver);
		pi.navigateMaster();	
		pi.clickInsuranceMaster();
		String InsuranceMaster=pi.getInsuranceMaster();
		pi.clickNewInsuranceMaster();
		pi.clickInsuranceName("ADMaster"+Utility.getRandNum(10, 1000));
		pi.clickCreateinsurance();
		String c=pi.getMessage();
		System.out.println(c);
		Assert.assertTrue(c.contains("Insurance successfully"));
	    Thread.sleep(8000);
	    pi.clickDeleteButton(InsuranceMaster);
	    //pi.switchToPopUpAndAccept(driver);
}  
	
	@Test(priority=21)
	public void CreateGrpInsunceMstrwithClubbInSal_SC_20() throws Exception {
		CreateGrpInsunceMstrwithClubbInSal gc=new CreateGrpInsunceMstrwithClubbInSal(driver);
		gc.navigateMaster();
		gc.clickGroupInsuranceMaster();
		gc.clickNewGroupInsuranceMaster();
		gc.clickGroupInsuranceName("GroupInsuranceMaster"+Utility.getRandNum(10, 10000));
		gc.clickCreateGroupinsurance();
		String d=gc.getMessage();
		Assert.assertEquals(d, "Group Insurance successfully created");
	}

	@Test(priority=22)
	public void verifyAddPeriodicIncentiveWithClubbedInSalary_SC_25() throws Exception{
		CreatePeriodicIncMstrwithClubbInSal pi=new CreatePeriodicIncMstrwithClubbInSal(driver);
		Thread.sleep(5000);
		pi.navigateMaster();
		pi.selectPeriodicIncentive();
		pi.clickAddPeriodicIncentive();
		pi.enterPeriodicIncentiveName("Periodic incentive_"+Utility.getRandNum(1, 1000));
		pi.clickCreatePeriodicIncentive();
		
		String s=pi.getMessage();
		Assert.assertEquals(s, "Periodic Incentive successfully created");
		Thread.sleep(8000);
		pi.ClickDeleteButton();
		pi.switchToPopUpAndAccept(driver);
		
	}
	@Test(priority=23)
	public void AddNewInsuranceMaster_SC_302() throws Exception{
		AddNewInsuranceMaster pi=new AddNewInsuranceMaster(driver);
		pi.navigateMaster();	
		pi.clickInsuranceMaster();
		//String InsuranceMaster=pi.getInsuranceMaster();
		pi.clickNewInsuranceMaster();
		pi.clickInsuranceName("LIC"+Utility.getRandNum(10, 1000));
		pi.clickCreateinsurance();
		String c=pi.getMessage();
		System.out.println(c);
		Assert.assertTrue(c.contains("Insurance successfully"));
	   // Thread.sleep(8000);
	   // pi.clickDeleteButton(InsuranceMaster);
	    //pi.switchToPopUpAndAccept(driver);
	}
	@Test(priority=24)
	public void DeleteInsuranceDetail_SC_383() throws Exception{
		DeleteInsuranceDetail pi=new DeleteInsuranceDetail(driver);
		pi.navigateMaster();	
		pi.clickInsuranceDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(4000);
		pi.clickView();
		pi.clickDelete1();
		pi.clickDelete2();
		String c=pi.getMessage();
		System.out.println(c);
		Assert.assertTrue(c.contains("Insurance successfully"));
	
	}   
	@Test(priority=25)
	public void DeleteEMIDetail_SC_384() throws Exception{
		DeleteEMIDetail pi=new DeleteEMIDetail(driver);
		pi.navigateMaster();	
		pi.clickInsuranceDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(4000);
		pi.clickView();
		pi.clickDetails();
		pi.clickDelete1();
		pi.clickNoButton();
		Thread.sleep(4000);
		pi.clickDelete2();
		pi.clickYesButton();
		String c=pi.getMessage();
		System.out.println(c);
		Assert.assertTrue(c.contains("Details Successfully"));
}  
	@Test(priority=26)
	public void CreateInsuranceDetails_SC_303() throws Exception{
		CreateInsuranceDetails pi=new CreateInsuranceDetails(driver);
		pi.navigateMaster();	
		pi.clickInsuranceDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(4000);
		pi.clickView();
		pi.clickAddNewInsuranceDetails();
		pi.selectInsuranceName("LIC");
		pi.clickInsuranceNo("56");
		pi.clickStartMonth("Aug/2018");
		pi.clickEndMonth("Dec/2018");
		pi.clickAmount("5000");
		pi.selectInstitutionName("xyz-12344");
		pi.clickRemark("fgfhgjhgh");
		pi.clickMonthly();
		pi.clickCreateInsurancebutton();
		String c=pi.getMessage();
		Assert.assertEquals(c, "Insurance successfully created");
		pi.clickDeleteButton();
		
	}  
		@Test(priority=27)
	public void EditEMIDetail_SC_382() throws Exception{
		EditEMIDetail pi=new EditEMIDetail(driver);
		pi.navigatesalary();	
		pi.clickGroupInsuranceDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(4000);
		pi.clickView();
		pi.clickDetails();
		pi.clickEdit();
		pi.clickAmount("400");
		Thread.sleep(5000);
		pi.clickUpdate();
		String d=pi.getMessage();
		Assert.assertEquals(d, "Details Successfully updated");
}
	@Test(priority=28)
	public void AddNewGroupInsuranceMaster_SC_304() throws Exception{
		AddNewGroupInsuranceMaster pi=new AddNewGroupInsuranceMaster(driver);
		pi.navigateMaster();
		pi.clickGroupInsurance();
		pi.clickAddNewMaster();
		pi.clickName("Group_"+Utility.getRandNum(1, 5000));
		pi.clickCreateButton();
		String f=pi.getMessage();
		Assert.assertEquals(f, "Group Insurance successfully created");
		Thread.sleep(6000);
		pi.clickDelete();
	
}
    @Test(priority=29)
	public void AddNewPeriodicIncentiveMaster_SC_312() throws Exception{
		AddNewPeriodicIncentiveMaster pi=new AddNewPeriodicIncentiveMaster(driver);
		pi.navigatemasterlink();
		pi.clickPeriodicIncentiveMaster();
		pi.clickAddPeriodicIncentive();
		pi.clickName("Periodic_"+Utility.getRandNum(1, 1000));
		pi.clickCreateButton();
		String c=pi.getMessage();
		Assert.assertEquals(c, "Periodic Incentive successfully created");
		Thread.sleep(6000);
		pi.clickDelete();											

} 
	@Test(priority=30)
	public void EditEMIDetail_SC_380() throws Exception{
	EditEMIDetail pi=new EditEMIDetail(driver);
		pi.navigatesalary();
		pi.clickGroupInsuranceDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);
		pi.clickView();
		pi.clickDetails();
		Thread.sleep(5000);
		pi.clickEdit();
		Thread.sleep(5000);
		pi.clickAmount("5000");
		pi.clickUpdate();
		String t=pi.getMessage();
		Assert.assertEquals(t, "Details Successfully updated");
} 
	@Test(priority=31)
	public void GroupInsuranceDetailSingleAllotment_SC_311() throws Exception{
		GroupInsuranceDetailSingleAllotment pi=new GroupInsuranceDetailSingleAllotment(driver);
		pi.navigatesalary();
		pi.clickGroupInsuranceDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);
		pi.clickView();
		pi.clickAddNewGroup();
		pi.clickGroupInsuranceName("Group_1271");
		pi.clickInsuranceNo(Utility.getRandNum(1, 100));
		pi.clickStartMonth("May/2018");
		pi.clickEndMonth("Dec/2018");
		pi.clickAmount("300");
		pi.selectInstitutionName("Abcdef-87465");
		pi.clickRemark("sdfdsf");
		pi.clickCreateButton();
		String r=pi.getMessage();
		Assert.assertEquals(r, "Group Insurance successfully created");
}
	@Test(priority=32)
	public void GroupInsuranceDetailMultiAllotment_SC_318() throws Exception{
		GroupInsuranceDetailMultiAllotment pi=new GroupInsuranceDetailMultiAllotment(driver);
		pi.navigatesalary();
		pi.clickGroupInsuranceDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);	
		pi.clickUnTick();		
		pi.clickTick1();
		pi.clickTick2();
		pi.clickMultiAllotmentButton();
		Thread.sleep(5000);
		pi.clickGroupInsuranceName("Group_1271");
		pi.clickAmount("4444");
		pi.clickStartMonth("May/2018");
		pi.clickEndMonth("Dec/2018");
		pi.selectInstitutionName("Abcdef-87465");
		pi.clickAccountNumber("8555");
		pi.clickRemark("dsfdgf");
		pi.clickMonthly();
		pi.clickCreateButton();
		Thread.sleep(5000);
		pi.clickProceed();
		String r=pi.getMessage();
		Assert.assertEquals(r, "Group Insurance successfully created");
		

}
	@Test(priority=33)
	public void CheckInstitutionNameInGroupInsurance_SC_323() throws Exception{
		CheckInstitutionNameInGroupInsurance pi=new CheckInstitutionNameInGroupInsurance(driver);
		pi.navigatesalary();
		pi.clickGroupInsuranceDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);	
		pi.clickMultiAllotmentButton();
		Thread.sleep(5000);
		pi.selectInstitutionName("Abcdef-87465");
}
	@Test(priority=34)
	public void DeleteGroupInsuranceDetail_SC_381() throws Exception{
		DeleteGroupInsuranceDetail pi=new DeleteGroupInsuranceDetail(driver);
		pi.navigatesalary();
		pi.clickGroupInsuranceDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);
		pi.clickView();
		pi.clickDelete1();
		Thread.sleep(3000);
		pi.clickDelete2();
		
		String r=pi.getMessage();
		Assert.assertEquals(r, "Group Insurance successfully deleted");
}
	@Test(priority=35)
	public void DeleteEMIDetailInGroupInsuranceDetail_SC_385() throws Exception{
		DeleteEMIDetailInGroupInsuranceDetail pi=new DeleteEMIDetailInGroupInsuranceDetail(driver);
		pi.navigatesalary();
		pi.clickGroupInsuranceDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);
		pi.clickView();
		pi.clickDetail();
		pi.clickDelete();
		pi.clickNoButton();
		Thread.sleep(5000);
		pi.clickDelete();
		pi.clickYesButton();
		String r=pi.getMessage();
		Assert.assertEquals(r, "Details Successfully Deleted.");
} 
	@Test(priority=36)
	public void PeriodicIncentiveDetailInSingleAllotment_SC_311() throws Exception{
		PeriodicIncentiveDetailInSingleAllotment pi=new PeriodicIncentiveDetailInSingleAllotment(driver);
		pi.navigatesalary();
		pi.clickPeriodicInsuranceDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);
		pi.clickView();
		pi.clickAddNewGroup();
		pi.clickPeriodicInsuranceName("Periodic_12");
		pi.clickStartMonth("May/2018");
		pi.clickEndMonth("Dec/2018");
		pi.clickAmount("300");
		pi.clickRemark("sdfdsf");
		pi.clickCreateButton();
		String r=pi.getMessage();
		Assert.assertEquals(r, "Periodic Incentive successfully created");
		}	
	@Test(priority=37)
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
		pi.clickTick2();
		pi.clickMultiAllotmentButton();
		pi.clickPeriodicInsuranceName("Periodic_12");
		pi.clickStartMonth("May/2018");
		pi.clickEndMonth("Dec/2018");
		pi.clickAmount("300");
		pi.clickRemark("sdfdsf");
		pi.clickCreateButton();
		Thread.sleep(5000);
		pi.clickProceed();
		String r=pi.getMessage();
		Assert.assertEquals(r, "Periodic Incentive successfully created");
		
		}	
	@Test(priority=38)
	public void GeneratePeriodicIncentiveDetailReport_SC_374() throws Exception{
		GeneratePeriodicIncentiveDetailReport pi=new GeneratePeriodicIncentiveDetailReport(driver);
		pi.navigatesalary();
		pi.clickPeriodicIncentiveDetails();
		Thread.sleep(4000);
		pi.clickReport();
		pi.clickStandingInstructionDetailReport();
		pi.clickSIType("Periodic Incentive");
		pi.clickReports("Detailed Report");
		pi.clickFrom("Feb/2017");
		pi.clickTo("Jan/2018");
		pi.clickGroupBy("");
}
	@Test(priority=39)
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
	@Test(priority=40)
	public void CheckifSalaryInsuranceReportsStandingInsDetailReportredirectstoReport_SC_615() throws Exception{
		SalaryInsuranceReportsStandingInsDetailReportredirectstoReport si=new SalaryInsuranceReportsStandingInsDetailReportredirectstoReport(driver);
		si.clickonsalary();
		si.clickoninsurancedetail();
		si.clickonstandInsdetailrpt();
		Thread.sleep(1000);
		si.selectsitype("Insurance");
		si.selectreporttype("Detailed Report");
		si.selectmonthfrom("May/2018");
		si.selectmonthto("Jul/2018");
		si.selectgroupby("Employee Name");
		si.selectorderby("Insurance Name");
		si.clickgetemployees();
		Thread.sleep(3000);
		si.clickonload();
		Thread.sleep(3000);
		String s=si.getMessage();
		Assert.assertEquals(s, "Employees Successfully Loaded.");
		Thread.sleep(2000);
		si.selectemployee();
		si.clickongeneratereport();

	}
	@Test(priority=41)
	public void CheckifSalaryInsuranceGeneralLinksInsuranceMasterredirectstoMaster_SC_616() throws Exception{
		CheckifSalaryInsuranceGeneralLinksInsuranceMasterredirectstoMaster si=new CheckifSalaryInsuranceGeneralLinksInsuranceMasterredirectstoMaster(driver);
		si.clickonsalary();
		si.clickoninsurancedetail();
		si.clickongenerallinks();
		Thread.sleep(1000);
		si.clickoninsurancemaster();
		Thread.sleep(2000);
		si.addnewinsurancemaster();
		si.enterinsurancename("Insurance_Master_98");
		si.clickoncreateinsurance();
		String d=si.getMessage();
		Assert.assertEquals(d, "Insurance successfully created");
	}
	@Test(priority=42)
	public void CheckifSalaryInsuranceGeneralLinksEmployeeMasterredirectstoEmployee_SC_617() throws Exception{
		CheckifSalaryInsuranceGeneralLinksEmployeeMasterredirectstoEmployee si=new CheckifSalaryInsuranceGeneralLinksEmployeeMasterredirectstoEmployee(driver);
		si.clickonsalary();
		si.clickoninsurancedetail();
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
		si.selectDateofJoining("06 June 2018");
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
	@Test(priority=43)
	public void CreateInsurancePremiumPaymentQuarterly_SC_618() throws Exception{
		CreateInsurancePremiumPaymentQuarterly pi=new CreateInsurancePremiumPaymentQuarterly(driver);
		pi.clickonsalary();	
		pi.clickoninsurancedetail();
		pi.clickaddemployees();
		Thread.sleep(3000);
		pi.clickonload();
		Thread.sleep(3000);
		pi.clickonview();
		pi.clickAddNewInsuranceDetails();
		pi.selectInsuranceName("Insurance_Master_98");
		pi.clickInsuranceNo("567");
		pi.clickStartMonth("Aug/2018");
		pi.clickEndMonth("Dec/2018");
		pi.clickAmount("5000");
		pi.selectInstitutionName("ICICI Bank-12345");
		pi.clickRemark("fgfhgjhgh");
		pi.clickquaterly();
		pi.clickCreateInsurancebutton();
		String c=pi.getMessage();
		Assert.assertEquals(c, "Insurance successfully created");
	}
	@Test(priority=44)
	public void CreateInsurancePremiumPaymentHalfYearly_SC_619() throws Exception{
		CreateInsurancePremiumPaymentHalfYearly pi=new CreateInsurancePremiumPaymentHalfYearly(driver);
		pi.clickonsalary();	
		pi.clickoninsurancedetail();
		pi.clickaddemployees();
		Thread.sleep(3000);
		pi.clickonload();
		Thread.sleep(3000);
		pi.clickonview();
		pi.clickAddNewInsuranceDetails();
		pi.selectInsuranceName("Insurance_Master_123456");
		pi.clickInsuranceNo("5678");
		pi.clickStartMonth("Aug/2018");
		pi.clickEndMonth("Dec/2018");
		pi.clickAmount("5000");
		pi.selectInstitutionName("ICICI Bank-12345");
		pi.clickRemark("fgfhgjhgh");
		pi.clickhalfyearly();
		pi.clickCreateInsurancebutton();
		String c=pi.getMessage();
		Assert.assertEquals(c, "Insurance successfully created");
	}
	@Test(priority=44)
	public void CreateInsurancePremiumPaymentYearly_SC_620() throws Exception{
		CreateInsurancePremiumPaymentYearly pi=new CreateInsurancePremiumPaymentYearly(driver);
		pi.clickonsalary();	
		pi.clickoninsurancedetail();
		pi.clickaddemployees();
		Thread.sleep(3000);
		pi.clickonload();
		Thread.sleep(3000);
		pi.clickonview();
		pi.clickAddNewInsuranceDetails();
		pi.selectInsuranceName("Insurance_Master_123456");
		pi.clickInsuranceNo("5678");
		pi.clickStartMonth("Aug/2018");
		pi.clickEndMonth("Dec/2018");
		pi.clickAmount("5000");
		pi.selectInstitutionName("ICICI Bank-12345");
		pi.clickRemark("fgfhgjhgh");
		pi.clickyearly();
		pi.clickCreateInsurancebutton();
		String c=pi.getMessage();
		Assert.assertEquals(c, "Insurance successfully created");
	}
	@Test(priority=45)
	public void CreatePayment_SC_621() throws Exception{
		CreatePayment pi=new CreatePayment(driver);
		pi.clickonsalary();	
		pi.clickoninsurancedetail();
		pi.clickaddemployees();
		Thread.sleep(3000);
		pi.clickonload();
		Thread.sleep(3000);
		pi.clickonview();
		pi.clickondetail();
		pi.selectfrommonth("May/2018");
		pi.selecttomonth("Jul/2018");
		pi.entermodifiedamount("12000");
		pi.enterinstitutionname("ICICI Bank-12345");
		pi.enterremarks("dnjkh");
		pi.createpayment();
		String c=pi.getMessage();
		Assert.assertEquals(c, "Details Successfully created.");
	}
	@Test(priority=46)
	public void CheckifSalaryGroupInsuranceGeneralLinksEmployeeMasterredirectstoEmployee_SC_624() throws Exception {
		CheckifSalaryGroupInsuranceGeneralLinksEmployeeMasterredirectstoEmployee si=new CheckifSalaryGroupInsuranceGeneralLinksEmployeeMasterredirectstoEmployee(driver);
		si.clickonsalary();
		si.clickongroupinsurancedetail();
		si.clickongenerallinks();
		Thread.sleep(2000);
		si.clickonemployeemaster();
		si.addnewemployee();
		si.enterEmployeeid("ABC12345");
		si.enterEmployeeref("12345REF");
		si.enterEmployeename("Mohit");
		si.enterEmployeefather("Harish");
		si.selectDateofBirth("06 June 1995");
		si.selectGender("Female");
		si.selectMaritalStatus("Single");
		si.selectDateofJoining("06 June 2018");
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
	@Test(priority=47)
	public void CheckifSalaryGroupInsuranceGeneralLinksInsuranceMasterredirectstoMaster_SC_623() throws Exception{
		CheckifSalaryGroupInsuranceGeneralLinksInsuranceMasterredirectstoMaster si=new CheckifSalaryGroupInsuranceGeneralLinksInsuranceMasterredirectstoMaster(driver);
		si.clickonsalary();
		si.clickongroupinsurancedetail();
		si.clickongenerallinks();
		Thread.sleep(1000);
		si.clickoninsurancemaster();
		Thread.sleep(2000);
		si.addnewinsurancemaster();
		si.enterinsurancename("Insurance_Master_9028");
		si.clickoncreateinsurance();
		String d=si.getMessage();
		Assert.assertEquals(d, "Group Insurance successfully created");
	}
	@Test(priority=48)
	public void CheckifSalaryGroupInsuranceReportsStandingInsDetailReportredirectstoReport_SC_622() throws Exception{
		SalaryGroupInsuranceReportsStandingInsDetailReportredirectstoReport si=new SalaryGroupInsuranceReportsStandingInsDetailReportredirectstoReport(driver);
		si.clickonsalary();
		si.clickongroupinsurancedetail();
		si.clickonstandInsdetailrpt();
		Thread.sleep(1000);
		si.selectsitype("Insurance");
		si.selectreporttype("Detailed Report");
		si.selectmonthfrom("May/2018");
		si.selectmonthto("Jul/2018");
		si.selectgroupby("Employee Name");
		si.selectorderby("Insurance Name");
		si.clickgetemployees();
		Thread.sleep(3000);
		si.clickonload();
		Thread.sleep(3000);
		String s=si.getMessage();
		Assert.assertEquals(s, "Employees Successfully Loaded.");
		Thread.sleep(2000);
		si.selectemployee();
		si.clickongeneratereport();
	}
	@Test(priority=49)
	public void CreateGroupInsurancePremiumPaymentYearly_SC_627() throws Exception{
		CreateGroupInsurancePremiumPaymentYearly pi=new CreateGroupInsurancePremiumPaymentYearly(driver);
		pi.clickonsalary();	
		pi.clickongroupinsurancedetail();
		pi.clickaddemployees();
		Thread.sleep(3000);
		pi.clickonload();
		Thread.sleep(3000);
		pi.clickonview();
		pi.clickAddNewInsuranceDetails();
		pi.selectGroupInsuranceName("Insurance_Master_9028");
		pi.clickGroupInsuranceNo("56776");
		pi.clickStartMonth("Aug/2018");
		pi.clickEndMonth("Dec/2018");
		pi.clickAmount("5000");
		pi.selectInstitutionName("new InstGroup-22324");
		pi.clickRemark("fgfhgjhgh");
		pi.clickyearly();
		pi.clickCreateGroupInsurancebutton();
		String c=pi.getMessage();
		Assert.assertEquals(c, "Group Insurance successfully created");
	}
	@Test(priority=49)
	public void CreateGroupInsurancePremiumPaymentQuarterly_SC_625() throws Exception{
		CreateGroupInsurancePremiumPaymentQuarterly pi=new CreateGroupInsurancePremiumPaymentQuarterly(driver);
		pi.clickonsalary();	
		pi.clickongroupinsurancedetail();
		pi.clickaddemployees();
		Thread.sleep(3000);
		pi.clickonload();
		Thread.sleep(3000);
		pi.clickonview();
		pi.clickAddNewInsuranceDetails();
		pi.selectGroupInsuranceName("Insurance_Master_9028");
		pi.clickGroupInsuranceNo("56776");
		pi.clickStartMonth("Aug/2018");
		pi.clickEndMonth("Dec/2018");
		pi.clickAmount("5000");
		pi.selectInstitutionName("new InstGroup-22324");
		pi.clickRemark("fgfhgjhgh");
		pi.clickquarterly();
		pi.clickCreateGroupInsurancebutton();
		String c=pi.getMessage();
		Assert.assertEquals(c, "Group Insurance successfully created");
	}*/
	@Test(priority=49)
	public void CreateGroupInsurancePremiumPaymentHalfYearly_SC_626() throws Exception{
		CreateGroupInsurancePremiumPaymentHalfYearly pi=new CreateGroupInsurancePremiumPaymentHalfYearly(driver);
		pi.clickonsalary();	
		pi.clickongroupinsurancedetail();
		pi.clickaddemployees();
		Thread.sleep(3000);
		pi.clickonload();
		Thread.sleep(3000);
		pi.clickonview();
		pi.clickAddNewInsuranceDetails();
		pi.selectGroupInsuranceName("Insurance_Master_9028");
		pi.clickGroupInsuranceNo("56776");
		pi.clickStartMonth("Aug/2018");
		pi.clickEndMonth("Dec/2018");
		pi.clickAmount("5000");
		pi.selectInstitutionName("new InstGroup-22324");
		pi.clickRemark("fgfhgjhgh");
		pi.clickhalfyearly();
		pi.clickCreateGroupInsurancebutton();
		String c=pi.getMessage();
		Assert.assertEquals(c, "Group Insurance successfully created");
	}
}