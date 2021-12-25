package com.spp.scripts;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount;
import com.spp.pages.CreateDeductionHead;
import com.spp.pages.CreateNewEarning;
import com.spp.pages.DeleteEarningHead;
import com.spp.pages.UpdateEarningHead;
import com.spp.pages.UpdateRemark;

public class FullandFinalSettlement extends BaseTest{

	
/*	@Test(priority=0)
	public void AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount_SC_972() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includeheldsalamount();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=1)
	public void AddNewFullandFinalSettlementwithIncludePendingAdvanceAmount_SC_973() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includependingadvanceamount();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=2)
	public void AddNewFullandFinalSettlementwithIncludelastmonthSalarySalarySummary_SC_974() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includelastsalamount();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=3)
	public void AddNewFullandFinalSettlementwithIncludeOpenComponent_SC_975() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includeopencomponent();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	
	@Test(priority=4)
	public void AddNewFullandFinalSettlementwithIncludeHeldSalaryAmountIncludePendingAdvanceAmount_SC_978() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includeheldsalamount();
		ad.includependingadvanceamount();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=5)
	public void AddNewFullandFinalSettlementwithIncludeHeldSalaryAmountDetailedSalary_SC_979() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includeheldsalamount();
		ad.includelastsalamount();
		ad.includedetailsalamount();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=6)
	public void AddNewFullandFinalSettlementwithIncludeHeldSalaryAmountSalarySummary_SC_980() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includeheldsalamount();
		ad.includelastsalamount();
		ad.includesalsummaryamount();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=7)
	public void AddNewFullandFinalSettlementwithDetailedSalaryIncludeOpenComponent_SC_987() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includelastsalamount();
		ad.includedetailsalamount();
		ad.includeopencomponent();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	
	
	@Test(priority=9)
	public void AddNewFullandFinalSettlementwithIncludeHeldSalaryAmountIncludeOpenComponent_SC_981() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includeheldsalamount();
		ad.includeopencomponent();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	
	@Test(priority=10)
	public void AddNewFullandFinalSettlementwithIncludePendingAdvanceAmountDetailedSalary_SC_983() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includependingadvanceamount();
		ad.includelastsalamount();
		ad.includedetailsalamount();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=11)
	public void AddNewFullandFinalSettlementwithIncludePendingAdvanceAmountSalarySummary_SC_984() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includependingadvanceamount();
		ad.includelastsalamount();
		ad.includesalsummaryamount();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}*/
	@Test(priority=12)
	public void AddNewFullandFinalSettlementwithIncludePendingAdvanceAmountIncludeOpenComponent_SC_985() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includependingadvanceamount();
		ad.includeopencomponent();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	
	/*@Test(priority=13)
	public void AddNewFullandFinalSettlementwithSalarySummaryIncludeOpenComponent_SC_988() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includelastsalamount();
		ad.includesalsummaryamount();
		ad.includeopencomponent();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=14)
	public void AddNewFullandFinalSettlementwithIncludePendingLoanAmount_SC_976() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includependingloanamount();
		Thread.sleep(2000);
		ad.selectloan();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=15)
	public void AddNewFullandFinalSettlementwithIncludeHeldSalaryAmountIncludePendingLoanAmount_SC_982() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includeheldsalamount();
		ad.includependingloanamount();
		Thread.sleep(2000);
		ad.selectloan();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	
	@Test(priority=16)
	public void AddNewFullandFinalSettlementwithIncludePendingAdvanceAmountIncludePendingLoanAmount_SC_986() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includependingadvanceamount();
		ad.includependingloanamount();
		Thread.sleep(2000);
		ad.selectloan();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	
	@Test(priority=17)
	public void AddNewFullandFinalSettlementwithDetailedSalaryIncludePendingLoanAmount_SC_989() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includelastsalamount();
		ad.includedetailsalamount();
		ad.includependingloanamount();
		Thread.sleep(2000);
		ad.selectloan();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
		
	}
	@Test(priority=18)
	public void AddNewFullandFinalSettlementwithSalarySummaryIncludePendingLoanAmount_SC_990() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includelastsalamount();
		ad.includesalsummaryamount();
		ad.includependingloanamount();
		Thread.sleep(2000);
		ad.selectloan();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=19)
	public void AddNewFullandFinalSettlementwithIncludeOpenComponentIncludePendingLoanAmount_SC_991() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includeopencomponent();
		ad.includependingloanamount();
		Thread.sleep(2000);
		ad.selectloan();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=20)
	public void AddNewFullandFinalSettlementwithIncludeOpenComponentSelectHeadsIncludePendinLoanAmount_SC_992() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includeopencomponent();
		Thread.sleep(2000);
		ad.selecthead();
		ad.includependingloanamount();
		Thread.sleep(2000);
		ad.selectloan();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=21)
	public void AddNewFullandFinalSettlementwithIncludeOpenComponentSelectParticularHeads_SC_993() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includeopencomponent();
		Thread.sleep(2000);
		ad.selecthead();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=22)
	public void AddFullandFinalSettlementwithIncludeHeldSalaryAmountIncludeOpenComponentSelectHeads_SC_994() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includeheldsalamount();
		ad.includeopencomponent();
		Thread.sleep(2000);
		ad.selecthead();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=23)
	public void AddNewFullandFinalSettlementwithIncludePendingAdvanceAmountOpenComponentSelectHeads_SC_995() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includependingadvanceamount();
		ad.includeopencomponent();
		Thread.sleep(2000);
		ad.selecthead();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	
	@Test(priority=24)
	public void AddNewFullandFinalSettlement_SC_351() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includelastsalamount();
		ad.createfnf();
		
	}
	 
	@Test(priority=25)
	public void CreateNewEarning_SC_408() throws Exception {
		CreateNewEarning ad = new CreateNewEarning(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.clickdetails();
		ad.createnewearning();
		ad.EnterDescription("Basic1");
		ad.EnterAmount("10000");
		ad.createhead();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Head was successfully created");
	}
	@Test(priority=26)
	public void UpdateEarningHead_SC_960() throws Exception {
		UpdateEarningHead ad = new UpdateEarningHead(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.clickdetails();
		ad.clickonedit();
		ad.EnterAmount("5000");
		ad.updatehead();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Head was successfully updated");
		
	}
	@Test(priority=27)
	public void DeleteEarningHead_SC_961() throws Exception {
		DeleteEarningHead ad = new DeleteEarningHead(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.clickdetails();
		ad.clickondelete();
		Thread.sleep(2000);
		ad.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		ad.clickondelete();
		Thread.sleep(2000);
		ad.switchToPopUpAndAccept(driver);
		String e=ad.getmessage();
		Assert.assertEquals(e, "Head was successfully deleted");	
	}
	
	@Test(priority=28)
	public void CreateDeductionHead_SC_409() throws Exception {
		CreateDeductionHead ad=new CreateDeductionHead(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.clickdetails();
		ad.clickondeductiontab();
		ad.createnewdeduction();
		ad.EnterDescription("Basic");
		ad.EnterAmount("1000");
		ad.createhead();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Head was successfully created");
	}
	@Test(priority=29)
	public void UpdateDeductionHead_SC_962() throws Exception {
		UpdateEarningHead ad = new UpdateEarningHead(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.clickdetails();
		ad.clickondeductiontab();
		Thread.sleep(2000);
		ad.clickoneditdeductionhead();
		ad.EnterAmount("5000");
		Thread.sleep(2000);
		ad.updatehead();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Head was successfully updated");
	}
	@Test(priority=30)
	public void DeleteDeductionHead_SC_963() throws Exception {
		DeleteEarningHead ad = new DeleteEarningHead(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.clickdetails();
		Thread.sleep(2000);
		ad.clickondeductiontab();
		Thread.sleep(2000);
		ad.clickondeletedeductionhead();
		Thread.sleep(2000);
		ad.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		ad.clickondeletedeductionhead();
		Thread.sleep(2000);
		ad.switchToPopUpAndAccept(driver);
		String e=ad.getmessage();
		Assert.assertEquals(e, "Head was successfully deleted");
		
	}
	@Test(priority=31)
	public void UpdateRemark_SC_968() throws Exception {
		UpdateRemark up = new UpdateRemark(driver);
		up.clickonsalary();
		up.clickonFNF();
		up.clickdetails();
		up.selectremarktab();
		up.eneterremark("Done");
		up.updateremark();
		String e=up.getmessage();
		Assert.assertEquals(e, "Remark was successfully updated.");
		
	}
	@Test(priority=32)
	public void CreateNewEarningTheoretical_SC_964() throws Exception {
		CreateNewEarning ad = new CreateNewEarning(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.clickdetails();
		ad.selecttheoreticaltab();
		ad.createnewearning();
		ad.EnterDescription("Basic1");
		ad.EnterAmount("10000");
		ad.createhead();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Head was successfully created");
	}
	@Test(priority=33)
	public void UpdateEarningHeadTheoretical_SC_966() throws Exception {
		UpdateEarningHead ad = new UpdateEarningHead(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.clickdetails();
		ad.selecttheoreticaltab();
		Thread.sleep(2000);
		ad.edittheoreticalhead();
		ad.EnterAmount("5000");
		Thread.sleep(2000);
		ad.updatehead();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Head was successfully updated");
	}
	@Test(priority=34)
	public void DeleteEarningHeadTheoretical_SC_967() throws Exception {
		DeleteEarningHead ad = new DeleteEarningHead(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.clickdetails();
		Thread.sleep(2000);
		ad.selecttheoreticaltab();
		Thread.sleep(2000);
		ad.deletetheoreticalearninghead();
		Thread.sleep(2000);
		ad.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		ad.deletetheoreticalearninghead();
		Thread.sleep(2000);
		ad.switchToPopUpAndAccept(driver);
		String e=ad.getmessage();
		Assert.assertEquals(e, "Head was successfully deleted");
	}
	
	@Test(priority=35)
	public void CreateNewDeductionTHEORETICAL_SC_965() throws Exception {
		CreateDeductionHead ad=new CreateDeductionHead(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.clickdetails();
		ad.selecttheoreticaltab();
		ad.clickondeductiontab();
		ad.createnewdeduction();
		ad.EnterDescription("Basic");
		ad.EnterAmount("1000");
		ad.createhead();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Head was successfully created");
	}
	@Test(priority=36)
	public void UpdateDeductionHeadTheoretical_SC_970() throws Exception {
		UpdateEarningHead ad = new UpdateEarningHead(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.clickdetails();
		ad.selecttheoreticaltab();
		ad.clickondeductiontab();
		Thread.sleep(2000);
		ad.editdeductionheadtheoretical();
		ad.EnterAmount("5000");
		Thread.sleep(2000);
		ad.updatehead();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Head was successfully updated");
}
	@Test(priority=37)
	public void DeleteDeductionHeadTheoretical_SC_971() throws Exception {
		DeleteEarningHead ad = new DeleteEarningHead(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.clickdetails();
		Thread.sleep(2000);
		ad.selecttheoreticaltab();
		ad.clickondeductiontab();
		Thread.sleep(2000);
		ad.clickondeletedeductionheadtheoretical();
		Thread.sleep(2000);
		ad.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		ad.clickondeletedeductionheadtheoretical();
		Thread.sleep(2000);
		ad.switchToPopUpAndAccept(driver);
		String e=ad.getmessage();
		Assert.assertEquals(e, "Head was successfully deleted");
		
	}
	
	@Test(priority=38)
	public void UpdateRemarkTheoretical_SC_969() throws Exception {
		UpdateRemark up = new UpdateRemark(driver);
		up.clickonsalary();
		up.clickonFNF();
		up.clickdetails();
		up.selecttheoreticaltab();
		up.selectremarktab();
		up.eneterremark("Done");
		up.updateremark();
		String e=up.getmessage();
		Assert.assertEquals(e, "Remark was successfully updated.");
		
	}
	
	@Test(priority=39)
	public void DeleteFullandFinalSettlement_SC_977() throws Exception {
	AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.clickdelete1();
		Thread.sleep(2000);
		ad.switchToPopUpAndDismiss();
		ad.clickdelete1();
		Thread.sleep(2000);
		ad.switchToPopUpAndAccept(driver);
		//String e=ad.deleteMessage();
		//Assert.assertEquals(e, "Full And Final Settlement successfully deleted");
	}

	
	@Test(priority=40)
	public void AddNewFullandFinalSettlementwithSalarySummaryIncludeOpenComponentSelectHeads_SC_995() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includelastsalamount();
		ad.includesalsummaryamount();
		ad.includeopencomponent();
		Thread.sleep(2000);
		ad.selecthead();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}*/
	
	

	
}
