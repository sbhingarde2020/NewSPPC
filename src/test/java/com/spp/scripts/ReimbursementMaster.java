package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddNewReimbursement;
import com.spp.pages.AddReimbursementMaster;
import com.spp.pages.CheckForQuarterlyAllotmenInRM;
import com.spp.pages.CheckforReimbursementMasterForLumpsumAllotment;
import com.spp.pages.CreateReimbursementMasterForTypeAllotment;
import com.spp.pages.CreateReimbursementMasterForTypeLumpsum;
import com.spp.pages.CheckforReimbursementMasterForYearlyAllotment;
import com.spp.pages.DeleteReimbursement;
import com.spp.pages.UpdateReimbursement;
import com.spp.pages.UpdateReimbursementMstrbyConsideringRestrictClaimAmt;
import com.spp.pages.UpdateReimbursementMstrbyConsideringSalCalcAndDOL;
import com.spp.pages.UpdateReimbursementMstrwithConsiderClaimAmtOnPayDays;
import com.spp.pages.UpdateReimbursementMstrwithConsiderClaimAmtOnPresentDays;

public class ReimbursementMaster extends BaseTest {
	
	@Test(priority=0)
	public void UpdateReimbursementMstrwithConsiderClaimAmtOnPayDays_SC_443() throws Exception{
		UpdateReimbursementMstrwithConsiderClaimAmtOnPayDays rm=new UpdateReimbursementMstrwithConsiderClaimAmtOnPayDays(driver);
		rm.clickonmaster();
		rm.clickonreimbursement();
		rm.clickAddReimbursementMaster();
		rm.selectReimbursementType("Other Reimbursement");
		rm.selectModeOfPayment("Paid in Salary");
		rm.selectTDSRef("Basic");
		rm.selectLumpsumType();
		rm.enterReimbursementName("Transportation"+Utility.getRandNum(1000, 1010));
		rm.clickCreateReimbursementMaster();
		Thread.sleep(1000);
		rm.clickonedit();
		//rm.editreimbursementname("master_1234");
		rm.selectallotment();
		Thread.sleep(3000);
		rm.selectallotmenttype();
		Thread.sleep(2000);
		rm.selectclaimamt();
		rm.updatereimbursement();
		Thread.sleep(2000);
		String s=rm.getMessage();
		Assert.assertEquals(s, "Reimbursement Master is successfully updated.");
	}
	@Test(priority=1)
	public void UpdateReimbursementMstrwithConsiderClaimAmtOnPresentDays_SC_444() throws Exception{
		UpdateReimbursementMstrwithConsiderClaimAmtOnPresentDays rm=new UpdateReimbursementMstrwithConsiderClaimAmtOnPresentDays(driver);
		rm.clickonmaster();
		rm.clickonreimbursement();
		rm.clickonedit();
		Thread.sleep(2000);
		//rm.editreimbursementname("master_1234");
		rm.selectallotment();
		Thread.sleep(3000);
		rm.selectallotmenttype();
		Thread.sleep(2000);
		rm.selectclaimamt();
		rm.updatereimbursement();
		Thread.sleep(2000);
		String s=rm.getMessage();
		Assert.assertEquals(s, "Reimbursement Master is successfully updated.");
	}
	@Test(priority=2)
	public void UpdateReimbursementMstrbyConsideringSalCalcAndDOL_SC_445() throws Exception{
		UpdateReimbursementMstrbyConsideringSalCalcAndDOL rm=new UpdateReimbursementMstrbyConsideringSalCalcAndDOL(driver);
		rm.clickonmaster();
		rm.clickonreimbursement();
		rm.clickonedit();
		Thread.sleep(2000);
		rm.selectallotment();
		Thread.sleep(3000);
		rm.selectallotmenttype();
		Thread.sleep(2000);
		rm.considersal();
		rm.selectclaimamt();
		rm.updatereimbursement();
		Thread.sleep(2000);
		String s=rm.getMessage();
		Assert.assertEquals(s, "Reimbursement Master is successfully updated.");
	}
	@Test(priority=3)
	public void UpdateReimbursementMstrbyConsideringRestrictClaimAmt_SC_446() throws Exception{
		UpdateReimbursementMstrbyConsideringRestrictClaimAmt rm=new UpdateReimbursementMstrbyConsideringRestrictClaimAmt(driver);
		rm.clickonmaster();
		rm.clickonreimbursement();
		rm.clickonedit();
		Thread.sleep(2000);
		rm.selectallotment();
		Thread.sleep(3000);
		rm.selectallotmenttype();
		Thread.sleep(2000);
		rm.considersal();
		rm.selectrestrictclaimamt();
		rm.updatereimbursement();
		Thread.sleep(2000);
		String s=rm.getMessage();
		Assert.assertEquals(s, "Reimbursement Master is successfully updated.");
	}
	@Test(priority=4)
	public void CheckForQuarterlyAllotmenInRM_SC_267() throws Exception{
		CheckForQuarterlyAllotmenInRM ur=new CheckForQuarterlyAllotmenInRM(driver);
		Thread.sleep(5000);	
		ur.clickMastserLink();
		ur.clickReimbursementMaster();
		Thread.sleep(5000);		
		ur.clickEditButton();
		Thread.sleep(4000);
		ur.clickAllotmentcheckBox();
		ur.clickQuarterly();
		ur.clickUpdateReimbursement();
		String s=ur.getMessage();
		Assert.assertEquals(s, "Reimbursement Master is successfully updated.");
		Thread.sleep(5000);
		ur.selectEmployee();
		ur.selectReimbursementAllotment();
		ur.selectNewReimbursement();
		ur.selectAddEmployee();
		ur.selectAllotButton();
		ur.selectName("Reimbursement_39455 (Other Reimbursement)");
		Thread.sleep(3000);
		ur.selectFinancialYear("2012/2013");
		ur.selectAllotmentDate("07 March 2013");
		ur.clickonfunctionbutton();
		Thread.sleep(2000);
	}   
	@Test(priority=5)
	public void CheckforReimbursementMasterForYearlyAllotment_SC_268() throws Exception{
		CheckforReimbursementMasterForYearlyAllotment ur=new CheckforReimbursementMasterForYearlyAllotment(driver);
		Thread.sleep(5000);	
		ur.clickMastserLink();
		ur.clickReimbursementMaster();
		 String ReimbusementMaster=ur.getSelectedReimbursementMaster();
		Thread.sleep(5000);		
		ur.clickEditButton();
		Thread.sleep(7000);
		ur.clickAllotmentcheckBox();
		Thread.sleep(5000);
		ur.clickYearly();
		ur.clickUpdateReimbursement();
		String s=ur.getMessage();
		Assert.assertEquals(s, "Reimbursement Master is successfully updated.");
		Thread.sleep(5000);
		ur.selectEmployee();
		ur.selectReimbursementAllotment();
		ur.selectNewReimbursement();
		ur.selectAddEmployee();
		ur.selectAllotButton();
		ur.selectName(ReimbusementMaster);
		Thread.sleep(3000);
		ur.selectFinancialYear("2012/2013");
		ur.selectAllotmentDate("07 March 2013");
		ur.selectAmountSideButton();
		Thread.sleep(6000);
	}
	@Test(priority=6)
	public void CheckforReimbursementMasterForLumpsum_SC_269() throws Exception{
		CheckforReimbursementMasterForLumpsumAllotment ur=new CheckforReimbursementMasterForLumpsumAllotment(driver);
		Thread.sleep(5000);	
		ur.clickMastserLink();
		ur.clickReimbursementMaster();
		 String ReimbusementMaster=ur.getSelectedReimbursementMaster();
		Thread.sleep(5000);		
		ur.clickEditButton();
		Thread.sleep(7000);
		ur.clickLumpsumcheckBox();
		ur.clickUpdateReimbursement();
		String s=ur.getMessage();
		Assert.assertEquals(s, "Reimbursement Master is successfully updated.");
		Thread.sleep(5000);
		ur.selectEmployee();
		ur.selectReimbursementAllotment();
		ur.selectNewReimbursement();
		ur.selectAddEmployee();
		ur.selectAllotButton();
		ur.selectName(ReimbusementMaster);
		Thread.sleep(6000);
		}
	@Test(priority=7)
	public void verifyAddNewReimbursementr_SC_287() throws Exception{
		AddNewReimbursement rm=new AddNewReimbursement(driver);
		Thread.sleep(5000);
		rm.clickMastserLink();
		rm.clickReimbursementMaster();
		rm.clickDeleteButton();
		Thread.sleep(2000);
		rm.clickAddReimbursementMaster();
		rm.selectReimbursementType("Other Reimbursement");
		rm.selectModeOfPayment("Bank Advise");
		rm.selectTDSRef("Basic");
		rm.selectLumpsumType();
		Thread.sleep(5000);
		rm.enterReimbursementName("Meals"+Utility.getRandNum(1011, 1020));
		rm.clickCreateReimbursementMaster();
		String s=rm.getMessage();
		Assert.assertEquals(s, "Reimbursement Master is successfully created.");
		//rm.clickPagechange();
		rm.clickDeleteButton();	
		}
	@Test(priority=8)
	public void verifyAddReimbursementMaster_SC_58() throws Exception{
		AddReimbursementMaster rm=new AddReimbursementMaster(driver);
		Thread.sleep(5000);
		rm.clickMastserLink();
		rm.clickReimbursementMaster();
		rm.clickAddReimbursementMaster();
		rm.selectReimbursementType("Other Reimbursement");
		rm.selectModeOfPayment("Cash");
		rm.selectTDSRef("Basic");
		rm.selectAllotmentType();
		Thread.sleep(5000);
		rm.enterReimbursementName("Canteen"+Utility.getRandNum(1021 , 1030));
		rm.clickCreateReimbursementMaster();
		String s = rm.getMessage();
		Assert.assertEquals(s, "Reimbursement Master is successfully created.");
		rm.clickDeleteButton();
	}
	@Test(priority=9)
	public void CreateReimbursementMasterForTypeAllotment_SC_59() throws Exception{
		CreateReimbursementMasterForTypeAllotment rm=new CreateReimbursementMasterForTypeAllotment(driver);
		Thread.sleep(5000);
		rm.clickMastserLink();
		rm.clickReimbursementMaster();
		rm.clickAddReimbursementMaster();
		rm.enterReimbursementName("Stationary"+Utility.getRandNum(1031,1040));
		rm.selectReimbursementType("Other Reimbursement");
		rm.selectModeOfPayment("Paid in Salary");
		rm.selectTDSRef("Basic");
		rm.selectAllotmentType();
		rm.selectMonthlyAllotmentType();
		Thread.sleep(5000);
		rm.clickCreateReimbursementMaster();
		String s=rm.getMessage();
		Assert.assertEquals(s, "Reimbursement Master is successfully created.");
		rm.clickDeleteButton();
	}
	@Test(priority=10)
	public void CreateReimbursementMasterForTypeLumpsum_SC_60() throws Exception{
		CreateReimbursementMasterForTypeLumpsum rm=new CreateReimbursementMasterForTypeLumpsum(driver);
		Thread.sleep(5000);
		rm.clickMastserLink();
		rm.clickReimbursementMaster();
		rm.clickAddReimbursementMaster();
		rm.selectReimbursementType("Other Reimbursement");
		rm.selectModeOfPayment("Paid in Salary");
		rm.selectTDSRef("Basic");
		rm.selectLumpsumType();
		Thread.sleep(5000);
		rm.enterReimbursementName("Electronics"+Utility.getRandNum(1061, 1070));
		Thread.sleep(3000);
		rm.clickCreateReimbursementMaster();
		String s=rm.getMessage();
		Assert.assertEquals(s, "Reimbursement Master is successfully created.");
	}
	@Test(priority=11)
	public void verifyUpdatedReimbursementMaster_SC_262() throws Exception{
		UpdateReimbursement ur=new UpdateReimbursement(driver);
		Thread.sleep(5000);	
		ur.clickMastserLink();
		ur.clickReimbursementMaster();
		Thread.sleep(5000);		
		ur.clickEditButton();
		ur.selectModeOfPayment("Bank Advise");
		ur.clickLumpusum();
		ur.clickConsiderTDS();
		ur.enterReimbursementName("Arrears"+Utility.getRandNum(1051, 1060));
		ur.clickUpdateReimbursement();
		String s=ur.getMessage();
		Assert.assertEquals(s, "Reimbursement Master is successfully updated.");
	}
	@Test(priority=12)
	public void verifyDeletedReimbursement_SC_263() throws Exception{
		DeleteReimbursement dr=new DeleteReimbursement(driver);
		Thread.sleep(5000);
		dr.clickMastserLink();
		dr.clickReimbursementMaster();
		dr.clickDeleteReimbursement();
		String s=dr.getMessage();
		Assert.assertEquals(s, "Reimbursement Master is successfully deleted");
	}
}