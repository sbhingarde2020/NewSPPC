package com.spp.scripts;

import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.CheckLMcanbecreatedwithClubbSalandRedBal;
import com.spp.pages.CheckLMcanbecreatedwithReducingBal;
import com.spp.pages.CheckLMcanbecreatedwithoutClubbSalandRedBal;
import com.spp.pages.CheckLMcanbecreatedwithoutReducingBal;
import com.spp.pages.CheckLoanMastercanbeDeleted;
import com.spp.pages.CheckLoanMastercanbeEdited;
import com.spp.pages.CheckforInterestRateinLM;
import com.spp.pages.CheckforMaxInstallmentinLM;
import com.spp.pages.CheckforMaximumAllowedinLM;
import com.spp.pages.CheckforMaximumAmountInLM;
import com.spp.pages.CreateLoanMasterwithClubbedInSalary;
import com.spp.pages.CreateLoanMasterwithoutClubbedInSalary;

import junit.framework.Assert;

public class LoanMaster extends BaseTest{

	@Test(priority=0)
	public void CreateLoanMasterwithoutClubbedInSalary_SC_9() throws Exception {
		CreateLoanMasterwithoutClubbedInSalary lm=new CreateLoanMasterwithoutClubbedInSalary(driver);
		lm.clickonMaster();
		lm.selectloanmaster();
		Thread.sleep(2000);
		lm.addnewloanmaster();
		lm.enterloanName("LoanMaster");
		Thread.sleep(2000);
		lm.uncheckclubbedInsalary();
		lm.createloanmaster();
		String d=lm.getMessage();
		Assert.assertEquals(d, "Loan successfully created");	
		Thread.sleep(2000);
		lm.clickDeleteButton();
		lm.switchToPopUpAndAccept(driver);
	}
	@Test(priority=1)
	public void CreateLoanMasterwithClubbedInSalary_SC_11() throws Exception{
		CreateLoanMasterwithClubbedInSalary cs=new CreateLoanMasterwithClubbedInSalary(driver);
		cs.clickonMaster();
		cs.selectloanmaster();
		cs.addnewloanmaster();
		cs.enterloanName("LoanMaster");
		Thread.sleep(2000);
		cs.createloanmaster();
		String d=cs.getMessage();
		Assert.assertEquals(d, "Loan successfully created");
	
	}
	@Test(priority=2)
	public void CheckLoanMastercanbeEdited_SC_12() throws Exception{
		CheckLoanMastercanbeEdited me=new CheckLoanMastercanbeEdited(driver);
		me.clickonMaster();
		me.selectloanmaster();
		me.clickonedit();
		me.editloanmastername("LoanMaster1");
		me.updateloanmaster();
		String d=me.getMessage();
		Assert.assertEquals(d, "Loan successfully updated");
	}
	
	@Test(priority=3)
	public void CheckLoanMastercanbeDeleted_SC_14() throws Exception{
		CheckLoanMastercanbeDeleted md=new CheckLoanMastercanbeDeleted(driver);
		md.clickonMaster();
		md.selectloanmaster();
		Thread.sleep(1000);
		md.clickondelete();
		Thread.sleep(1000);
		md.switchToPopUpAndDismiss();
		Thread.sleep(3000);
		md.clickondelete();
		Thread.sleep(1000);
		md.switchToPopUpAndAccept(driver);
		String d=md.getMessage();
		Assert.assertEquals(d, "Loan successfully deleted");
	}
	
	@Test(priority=4)
	public void CheckLMcanbecreatedwithReducingBal_SC_435() throws Exception {
		CheckLMcanbecreatedwithReducingBal lm=new CheckLMcanbecreatedwithReducingBal(driver);
		lm.clickonMaster();
		lm.selectloanmaster();
		lm.addnewloanmaster();
		lm.enterloanName("LoanMaster");
		lm.enterinterestrate("3");
		Thread.sleep(2000);
		lm.uncheckclubbedInsalary();
		lm.checkreducingbal();
		lm.createloanmaster();
		String d=lm.getMessage();
		Assert.assertEquals(d, "Loan successfully created");	
		Thread.sleep(1000);
		lm.clickDeleteButton();
		lm.switchToPopUpAndAccept(driver);
	}
	
	@Test(priority=5)
	public void CheckLMcanbecreatedwithoutReducingBal_SC_436() throws Exception {
		CheckLMcanbecreatedwithoutReducingBal rd=new CheckLMcanbecreatedwithoutReducingBal(driver);
		rd.clickonMaster();
		rd.selectloanmaster();
		rd.addnewloanmaster();
		rd.enterloanName("LoanMaster");
		rd.enterinterestrate("3");
		rd.createloanmaster();
		String d=rd.getMessage();
		Assert.assertEquals(d, "Loan successfully created");	
		Thread.sleep(1000);
		rd.clickDeleteButton();
		rd.switchToPopUpAndAccept(driver);
	}
	
	@Test(priority=6)
	public void CheckLMcanbecreatedwithClubbSalandRedBal_SC_437() throws Exception {
		CheckLMcanbecreatedwithClubbSalandRedBal wcr=new CheckLMcanbecreatedwithClubbSalandRedBal(driver);
		wcr.clickonMaster();
		wcr.selectloanmaster();
		wcr.addnewloanmaster();
		wcr.enterloanName("LoanMaster");
		Thread.sleep(1000);
		wcr.enterinterestrate("3");
		wcr.checkreducingbal();
		wcr.createloanmaster();
		Thread.sleep(2000);
		String d=wcr.getMessage();
		Assert.assertEquals(d, "Loan successfully created");	
		Thread.sleep(1000);
		wcr.clickDeleteButton();
		wcr.switchToPopUpAndAccept(driver);
	}
	@Test(priority=7)
	public void CheckLMcanbecreatedwithoutClubbSalandRedBal_SC_438() throws Exception {
		CheckLMcanbecreatedwithoutClubbSalandRedBal ocr=new CheckLMcanbecreatedwithoutClubbSalandRedBal(driver);
		ocr.clickonMaster();
		ocr.selectloanmaster();
		ocr.addnewloanmaster();
		ocr.enterloanName("LoanMaster");
		Thread.sleep(2000);
		ocr.enterinterestrate("3");
		ocr.uncheckclubbedInsalary();
		ocr.createloanmaster();
		Thread.sleep(2000);
		String d=ocr.getMessage();
		Assert.assertEquals(d, "Loan successfully created");	
		Thread.sleep(1000);
		ocr.clickDeleteButton();
		ocr.switchToPopUpAndAccept(driver);
	}
	@Test(priority=8)
	public void CheckforMaximumAmount_SC_259() throws Exception{
		CheckforMaximumAmountInLM ma=new CheckforMaximumAmountInLM(driver);
		ma.clickonMaster();
		ma.selectFinancialInst();
		ma.addnewfinanInsti();
		ma.selectAccoutType("Loan");
		ma.enterInstName("HDFC Bank");
		ma.enterBranchCode("FORT MUMBAI");
		ma.enterEmail("hdfc@gmail.com");
		ma.enterAddress("FORT MUMBAI");
		ma.enterPinCode("400085");
		ma.enterIFSCCode("HDFC0000060");
		ma.createfinanceinsti();
		Thread.sleep(5000);
		ma.clickonMaster();
		ma.selectloanmaster();
		ma.addnewloanmaster();
		ma.enterloanName("Default");
		ma.createloanmaster();
		Thread.sleep(3000);
		ma.clickonMaster();
		ma.selectloanmaster();
		ma.clickonedit();
		ma.entermaxamount("10000");
		Thread.sleep(2000);
		ma.updateloanmaster();
		String d=ma.getMessage();
		Assert.assertEquals(d, "Loan successfully updated");
		Thread.sleep(2000);
		ma.clickonsalary();
		ma.clickonloandetail();
		ma.addemployees();
		Thread.sleep(4000);
		ma.clickonload();
		Thread.sleep(2000);
		ma.clickonview();
		ma.addnewloandetail();
		ma.selectloanname("Default");
		ma.enterloanamount("15000");
		Thread.sleep(5000);
		ma.createloan();
		String abc = ma.getAlertText();
		System.out.println(abc);
		Assert.assertEquals(abc, "Amount can not be greater than 10000");
		ma.switchToPopUpAndAccept(driver);
	}
	
	@Test(priority=9)
	public void CheckforMaxInstallmentinLM_SC_260() throws Exception{
		CheckforMaxInstallmentinLM mi=new CheckforMaxInstallmentinLM(driver);
		mi.clickonMaster();
		mi.selectloanmaster();
		mi.clickonedit();
		mi.enteremirecovery("17");
		Thread.sleep(2000);
		mi.updateloanmaster();
		String d=mi.getMessage();
		Assert.assertEquals(d, "Loan successfully updated");
		Thread.sleep(2000);
		mi.clickonsalary();
		mi.clickonloandetail();
		mi.addemployees();
		Thread.sleep(5000);
		mi.clickonload();
		Thread.sleep(5000);
		mi.clickonview();
		mi.addnewloandetail();
		Thread.sleep(2000);
		mi.selectloanname("Default");
		Thread.sleep(2000);
		System.out.println("No of Installments accepted EMI Recovery value successfully");
		
	}
	@Test(priority=11)
	public void CheckforInterestRateinLM_SC_257() throws Exception{
	CheckforInterestRateinLM ir=new CheckforInterestRateinLM(driver);
	ir.clickonMaster();
	ir.selectloanmaster();
	ir.clickonedit();
	Thread.sleep(2000);
	ir.enterinterestrate("3");
	Thread.sleep(2000);
	ir.updateloanmaster();
	String d=ir.getMessage();
	Assert.assertEquals(d, "Loan successfully updated");
	Thread.sleep(2000);
	ir.clickonsalary();
	ir.clickonloandetail();
	ir.addemployees();
	Thread.sleep(4000);
	ir.clickonload();
	Thread.sleep(5000);
	ir.clickonview();
	Thread.sleep(2000);
	ir.addnewloandetail();
	ir.enterloanname("Default");
	ir.enterloanamount("3000");
	Thread.sleep(5000);
	System.out.println("Interest Amount is calculated successfully according to the given value in  Master->Loan Master");
	ir.clickonMaster();
	ir.selectloanmaster();
	ir.clickdelete();
	ir.switchToPopUpAndAccept(driver);
		}
	
	@Test(priority=10)
	public void CheckforMaximumAllowedinLM_SC_261() throws Exception{
		CheckforMaximumAllowedinLM ma=new CheckforMaximumAllowedinLM(driver);
		ma.clickonMaster();
		ma.selectloanmaster();
		ma.clickonedit();
		Thread.sleep(2000);
		ma.entermaxallowed("1");
		Thread.sleep(2000);
		ma.updateloanmaster();
		String d=ma.getMessage();
		Assert.assertEquals(d, "Loan successfully updated");
		Thread.sleep(2000);
		ma.clickonsalary();
		ma.clickonloandetail();
		ma.addemployees();
		Thread.sleep(5000);
		ma.clickonload();
		Thread.sleep(5000);
		ma.clickonview();
		ma.addnewloandetail();
		Thread.sleep(2000);
		ma.enterloanname("Default");
		Thread.sleep(3000);
		ma.enterloandate("01 April 2018");
		Thread.sleep(3000);
		ma.enterinstitutionname("HDFC Bank-FORT MUMBAI");
		Thread.sleep(2000);
		ma.enterloanaccno("122345");
		ma.enterloanamount("10000");
		ma.clicklumpsum();
		ma.enterinstallmentamt("1000");
		ma.enterrecoverfrom("May/2018");
		ma.createloan();
		Thread.sleep(3000);
		ma.addnewloandetail();
		Thread.sleep(2000);
		ma.enterloanname("Default");
		ma.enterloandate("01 April 2018");
		Thread.sleep(3000);
		ma.enterinstitutionname("HDFC Bank-FORT MUMBAI");
		Thread.sleep(2000);
		ma.enterloanaccno("122345890");
		ma.enterloanamount("10000");
		ma.clicklumpsum();
		ma.enterinstallmentamt("1000");
		ma.enterrecoverfrom("May/2018");
		ma.createloan();
		Thread.sleep(2000);
		String abc = ma.getAlertMessage1();
		System.out.println(abc);
		Assert.assertEquals(abc, "Default can be given only 1 times in this service");
		ma.switchToPopUpAndAccept(driver);
		ma.clickonsalary();
		ma.clickonloandetail();
		ma.addemployees();
		Thread.sleep(5000);
		ma.clickonload();
		Thread.sleep(5000);
		ma.clickonview();
		Thread.sleep(2000);
		ma.clickdelete();
		ma.switchToPopUpAndAccept(driver);
		 Thread.sleep(3000);
		 ma.clickonMaster();
		 ma.selectFinancialInst();
		 ma.deletefinancialinsti();
	}
	
	
}
