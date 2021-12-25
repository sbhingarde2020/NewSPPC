package com.spp.scripts;


import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddAdvanceMaster;
import com.spp.pages.AddNewAdvanceMaster;
import com.spp.pages.CheckAdvanceMasterCreatedWithClubbedInSalary;
import com.spp.pages.CheckAdvanceMasterCreatedWithoutClubbedInSalary;
import com.spp.pages.CheckAdvanceMasterDeleted;
import com.spp.pages.CheckAdvanceMasterEdited;
import com.spp.pages.CheckAdvanceMstrwithReducingBal;
import com.spp.pages.CheckAdvanceMstrwithoutReducingBalance;
import com.spp.pages.CheckAdvancemstrwithRedBalandClubbedInSal;
import com.spp.pages.CheckAdvancemstrwithoutRedBalandClubbedInSal;
import com.spp.pages.CheckForInterestRateInAdvanceMaster;
import com.spp.pages.CheckForMaximumAmountInAM;
import com.spp.pages.CheckMaximumAllowedInAM;
import com.spp.pages.CheckNoOfInstallmentsInAM;
import com.spp.pages.DeleteAdvanceMaster;
import com.spp.pages.UpdateAdvanceMaster;

import junit.framework.Assert;


public class AdvanceMaster extends BaseTest {

	@Test(priority=0)
	public void CheckAdvanceMasterCreatedWithoutClubbedInSalary_SC_5() throws Exception{
		CheckAdvanceMasterCreatedWithoutClubbedInSalary ld=new CheckAdvanceMasterCreatedWithoutClubbedInSalary(driver);
		ld.clickMastserLink();
		ld.clickAdvanceMaster();
		ld.clickAddNewAdvanceMaster();
		ld.clickAdvanceName("Advance_Master"+Utility.getRandNum(10, 20));
		Thread.sleep(2000);
		ld.clickClubbedinSalaryBox();
		ld.clickCreateButton();
		String d=ld.getMessage();
		Assert.assertEquals(d, "Advance successfully created");
		ld.clickDeleteButton();
		ld.switchToPopUpAndAccept(driver);
	}
	@Test(priority=1)
	public void CheckAdvanceMasterCreatedWithClubbedInSalary_SC_6() throws Exception{
		CheckAdvanceMasterCreatedWithClubbedInSalary ld=new CheckAdvanceMasterCreatedWithClubbedInSalary(driver);
		ld.clickMastserLink();
		ld.clickAdvanceMaster();
		ld.clickAddNewAdvanceMaster();
		ld.clickAdvanceName("Advance_Master"+Utility.getRandNum(21, 30));
		Thread.sleep(2000);
		ld.clickCreateButton();
		String d=ld.getMessage();
		Assert.assertEquals(d, "Advance successfully created");
	}
	@Test(priority=2)
	public void CheckAdvanceMasterEdited_SC_7() throws Exception{
		CheckAdvanceMasterEdited ld=new CheckAdvanceMasterEdited(driver);
		ld.clickMastserLink();
		ld.clickAdvanceMaster();
		ld.clickEdit();
		ld.EditAdvanceName("Advance_Master"+Utility.getRandNum(31, 40));
		ld.clickUpdateButton();
		String d=ld.getMessage();
		Assert.assertEquals(d, "Advance successfully updated");
	}
	@Test(priority=3)
	public void CheckAdvanceMasterDeleted_SC_8() throws Exception{
		CheckAdvanceMasterDeleted ld=new CheckAdvanceMasterDeleted(driver);
		ld.clickMastserLink();
		ld.clickAdvanceMaster();
		ld.clickDeleteButton();
		ld.switchToPopUpAndDismiss();
		Thread.sleep(3000);
		ld.clickDeleteButton();
		ld.switchToPopUpAndAccept(driver);
		String d=ld.getMessage();
		Assert.assertEquals(d, "Advance successfully deleted");
	}
	@Test(priority=4)
	public void AddNewAdvanceMaster_SC_140() throws Exception{
		AddNewAdvanceMaster ld=new AddNewAdvanceMaster(driver);
		ld.clickMastserLink();
		ld.clickAdvanceMaster();
		ld.clickAddNewAdvanceMaster();
		ld.clickAdvanceName("Advance_Master"+Utility.getRandNum(41, 50));
		Thread.sleep(2000);
		ld.enterinterestrate("2");
		ld.ClickMaxAmount("5000");
		ld.emirecovery("17");
		ld.uncheckclubbedinsal();
		ld.checkreducingbal();
		ld.clickCreateButton();
		String d=ld.getMessage();
		Assert.assertEquals(d, "Advance successfully created");
	}
	/*@Test(priority=5)
	public void UpdateAdvanceMaster_SC_148() throws Exception{
		UpdateAdvanceMaster am=new UpdateAdvanceMaster(driver);
		am.navigateMaster();
		am.clickAdvanceMaster();
		am.clickEditAdvanceMaster();
		am.enterAdvanceName("Advance_Master"+Utility.getRandNum(41, 50));
		am.enterInterestRate("5");
		am.enterMaximumAmount("5000");
		am.enterMaximumAllowed("10000");
		am.enterEMIRecovery("5");
		am.clickUpdateAdvanceMaster();
		String d=am.getMessage();
		Assert.assertEquals(d, "Advance successfully updated");
	}
	@Test(priority=6)
	public void DeleteAdvanceMaster_SC_149() throws Exception{
		DeleteAdvanceMaster dm=new DeleteAdvanceMaster(driver);
		dm.navigateMaster();
		dm.clickAdvanceMaster();
		dm.clickDeleteAdvanceMaster();
		dm.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		dm.clickDeleteAdvanceMaster();
		dm.switchToPopUpAndAccept(driver);
		String d=dm.getMessage();
		Assert.assertEquals(d, "Advance successfully deleted");
	}
	@Test(priority=7)
	public void CheckAdvanceMstrwithReducingBalance_SC_431() throws Exception{
		CheckAdvanceMstrwithReducingBal rb=new CheckAdvanceMstrwithReducingBal(driver);
		rb.navigateMaster();
		rb.clickAdvanceMaster();
		rb.clickAddAdvancMaster();
		rb.enterAdvanceName("Advance_Master"+Utility.getRandNum(100, 105));
		rb.enterInterestRate("5");
		rb.uncheckclubbedinsal();
		rb.checkreducingbal();
		rb.clickCreateAdvanceButton();
		String d= rb.getMessage();
		Assert.assertEquals(d, "Advance successfully created");
		String e= rb.checkifYesButton();
		Assert.assertEquals(e, "Yes");
		rb.clickDeleteAdvanceMaster();
		rb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=8)
	public void CheckAdvanceMstrwithoutReducingBalance_SC_432() throws Exception{
		CheckAdvanceMstrwithoutReducingBalance wr=new CheckAdvanceMstrwithoutReducingBalance(driver);
		wr.navigateMaster();
		wr.clickAdvanceMaster();
		wr.clickAddAdvancMaster();
		wr.enterAdvanceName("Advance_Master"+Utility.getRandNum(51, 60));
		wr.enterInterestRate("5");
		wr.enterMaximumAmount("10000");
		wr.clickCreateAdvanceButton();
		String d=wr.getMessage();
		Assert.assertEquals(d, "Advance successfully created");
		String e= wr.checkifYesButton();
		Assert.assertEquals(e, "No");
		wr.clickDeleteAdvanceMaster();
		wr.switchToPopUpAndAccept(driver);
		}
	@Test(priority=9)
	public void CheckAdvancemstrwithRedBalandClubbedInSal_SC_433() throws Exception{
		CheckAdvancemstrwithRedBalandClubbedInSal wrc=new CheckAdvancemstrwithRedBalandClubbedInSal(driver);
		wrc.navigateMaster();
		wrc.clickAdvanceMaster();
		wrc.clickAddAdvancMaster();
		wrc.enterAdvanceName("Advance_Master"+Utility.getRandNum(61, 70));
		wrc.enterInterestRate("2");
		wrc.enterMaximumAmount("10000");
		wrc.clickReducingBalance();	
		wrc.clickCreateAdvanceButton();
		String d=wrc.getMessage();
		Assert.assertEquals(d, "Advance successfully created");
		String e= wrc.checkifYesButton();
		Assert.assertEquals(e, "Yes");
		String f= wrc.checkifYesNoButton();
		Assert.assertEquals(f, "Yes");
		wrc.clickDeleteAdvanceMaster();
		wrc.switchToPopUpAndAccept(driver);
	}
	@Test(priority=10)
	public void CheckAdvancemstrwithoutRedBalandClubbedInSal_SC_434() throws Exception{
		CheckAdvancemstrwithoutRedBalandClubbedInSal worc=new CheckAdvancemstrwithoutRedBalandClubbedInSal(driver);
		worc.navigateMaster();
		worc.clickAdvanceMaster();
		worc.clickAddAdvancMaster();
		worc.enterAdvanceName("Advance_Master"+Utility.getRandNum(71, 80));
		worc.uncheckclubbedinsal();
		worc.enterInterestRate("5");
		worc.enterMaximumAmount("10000");
		worc.clickCreateAdvanceButton();
		String d=worc.getMessage();
		Assert.assertEquals(d, "Advance successfully created");
		String e= worc.checkifYesButton();
		Assert.assertEquals(e, "No");
		String f= worc.checkifYesNoButton();
		Assert.assertEquals(f, "No");
		worc.clickDeleteAdvanceMaster();
		worc.switchToPopUpAndAccept(driver);
	}
	@Test(priority=11)  
	public void CheckForInterestRateInAdvanceMaster_SC_253() throws Exception{
		CheckForInterestRateInAdvanceMaster ld=new CheckForInterestRateInAdvanceMaster(driver);
		ld.clickMastserLink();
		ld.clickAdvancemaster();
		ld.clickAddAdvancMaster();
		ld.enterAdvanceName("Advance_Master"+Utility.getRandNum(71, 80));
		ld.clickCreateAdvanceButton();
		Thread.sleep(5000);
		ld.clickMastserLink();
		ld.clickAdvancemaster();
		String AdvanceMaster=ld.getAdvanceMaster();
		ld.clickEdit();
		ld.clickInterestRate("3");
		ld.clickUpdateButton();
		String d=ld.getMessage1();
		Assert.assertEquals(d, "Advance successfully updated");
		ld.clickSalary();
		ld.clickAdvanceDetailsLink();
		ld.clickAddEmployee();
		Thread.sleep(4000);
		ld.clickLoad();
		Thread.sleep(4000);
		ld.clickViewLink();
		ld.clickAddNewAdvanceLink();
		Thread.sleep(3000);
		ld.clickAdvanceName(AdvanceMaster);
		ld.clickAdvanceDate("31 March 2018");
		ld.clickAmount("5000");
		Thread.sleep(2000);
		ld.clicklumpsum();
		ld.enterinstallmentamount("5");
		ld.clickRecoveryDate("Mar/2018");
		ld.clickCreateAdvance();
		String e=ld.getMessage2();
		Assert.assertEquals(e, "Advance successfully created");
		Thread.sleep(7000);
		ld.deleteadvancedetails(AdvanceMaster);
		ld.switchToPopUpAndAccept(driver);
		Thread.sleep(5000);
		ld.clickMastserLink();
		ld.clickAdvancemaster();	
	}  
	@Test(priority=12)
	public void CheckForMaximumAmountInAM_SC_254() throws Exception{
		CheckForMaximumAmountInAM ld=new CheckForMaximumAmountInAM(driver);
		ld.clickMastserLink();
		ld.clickAdvanceMaster();
	    String AdvanceMaster=ld.getAdvanceMaster();
	    ld.clickEdit();
		ld.clickMaxAmount("10000");
		ld.clickUpdateButton();
		String d=ld.getMessage1();
		Assert.assertEquals(d, "Advance successfully updated");
		ld.clickSalary();
		ld.clickAdvanceDetailsLink();
		ld.clickAddEmployee();
		Thread.sleep(4000);
		ld.clickLoad();
		Thread.sleep(4000);
		ld.clickViewLink();
		ld.clickAddNewAdvanceLink();
		Thread.sleep(3000);
		ld.clickAdvanceName(AdvanceMaster);
		ld.clickAmount("15000");
	    Thread.sleep(2000);
		ld.clickNoOfInstallments();
		ld.clickInstallments("5");
		Thread.sleep(1000);
		ld.clickAdvanceDate("01 April 2013");
		ld.clickRecoveryDate("Apr/2013");
		ld.clickCreateAdvance();
		String e= ld.getAlertMessage1();
	    Assert.assertEquals(e, "Amount can not be greater than 10000");
	    ld.switchToPopUpAndAccept(driver);
	   // ld.selectPreviouslistpage();
		//Thread.sleep(5000);
	//	ld.deleteadvancedetails(AdvanceMaster);
	//	ld.switchToPopUpAndAccept(driver);	    
	}
	@Test(priority=13)
	public void CheckNoOfInstallmentsInAM_SC_255() throws Exception{
		CheckNoOfInstallmentsInAM ld=new CheckNoOfInstallmentsInAM(driver);
		ld.clickMastserLink();
		ld.clickAdvanceMaster();
	    String AdvanceMaster=ld.getAdvanceMaster();
	    ld.clickEdit();
		ld.clickEMIRecovery("17");
		ld.clickUpdateButton();
		String d=ld.getMessage1();
		Assert.assertEquals(d, "Advance successfully updated");
		ld.clickSalary();
		ld.clickAdvanceDetailsLink();
		ld.clickAddEmployee();
		Thread.sleep(4000);
		ld.clickLoad();
		Thread.sleep(4000);
		ld.clickViewLink();
		ld.clickAddNewAdvanceLink();
		Thread.sleep(3000);
		ld.clickAdvanceName(AdvanceMaster);
		ld.clickAmount("5000");
		Thread.sleep(2000);
		ld.clickInstallments("5");
		Thread.sleep(1000);
		ld.clickAdvanceDate("01 April 2013");
		ld.clickRecoveryDate("Apr/2013");
		ld.clickCreateAdvance();
		Thread.sleep(1000);
		String t=ld.getMessage();
		System.out.println(":"+t+":");
	//	Assert.assertEquals(t, "Advance successfully created");
		Assert.assertTrue(t.contains("Advance successfully"));
		ld.deleteadvancedetails(AdvanceMaster);
		ld.switchToPopUpAndAccept(driver);
	}  
	@Test(priority=14)
	public void CheckMaximumAllowedInAM_SC_256() throws Exception {
		CheckMaximumAllowedInAM ld=new CheckMaximumAllowedInAM(driver);
		ld.clickMastserLink();
		ld.clickAdvanceMaster();
	    String AdvanceMaster=ld.getAdvanceMaster();
	    ld.clickEdit();
		ld.clickMaxAllowed("1");
		ld.clickUpdateButton();
		String d=ld.getMessage1();
		Assert.assertEquals(d, "Advance successfully updated");
		ld.clickSalary();
		ld.clickAdvanceDetailsLink();
		ld.clickAddEmployee();
		Thread.sleep(4000);
		ld.clickLoad();
		Thread.sleep(4000);
		ld.clickViewLink();
		ld.clickAddNewAdvanceLink();
		Thread.sleep(3000);
		ld.clickAdvanceName(AdvanceMaster);
		ld.clickAmount("5000");
		Thread.sleep(2000);
		ld.clicklumpsum();
		ld.clickInstallments("5");
		Thread.sleep(1000);
		ld.clickAdvanceDate("01 April 2013");
		ld.clickRecoveryDate("Apr/2013");
		ld.clickCreateAdvance();
		Thread.sleep(1000);
		String t=ld.getMessage();
		System.out.println(":"+t+":");
	//	Assert.assertEquals(t, "Advance successfully created");
		Assert.assertTrue(t.contains("Advance successfully"));
		Thread.sleep(5000);
		ld.clickAddNewAdvanceLink();
		Thread.sleep(3000);
		ld.clickAdvanceName(AdvanceMaster);
		ld.clickAmount("5000");
		Thread.sleep(2000);
		ld.clicklumpsum();
		ld.clickInstallments("5");
		Thread.sleep(1000);
		ld.clickAdvanceDate("01 April 2013");
		ld.clickRecoveryDate("Apr/2013");
		ld.clickCreateAdvance();
		Thread.sleep(5000);
		ld.switchToPopUpAndAccept(driver);
		ld.selectPreviouslistpage();
		Thread.sleep(5000);
		ld.deleteadvancedetails(AdvanceMaster);
		ld.switchToPopUpAndAccept(driver);
		Thread.sleep(10000);
		ld.clickMastserLink();
		ld.clickAdvanceMaster();
		ld.clickdelete();
		ld.switchToPopUpAndAccept(driver);
	}*/  	
}