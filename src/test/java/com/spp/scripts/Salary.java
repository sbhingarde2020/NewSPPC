package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AddReimbursementClaim;



public class Salary extends BaseTest {
	@Test(priority=5)
	public void AddReimbursementClaim_SC_276() throws Exception{
		AddReimbursementClaim lb=new AddReimbursementClaim(driver);
		lb.navigateSalary();
		lb.clickReimbursementClaim();
		lb.ClickAddReimbursement();
		lb.SelectAddEmployee();
		lb.selectClaimButton();
		lb.selectName("Reim. LTA (LTA)");
		lb.selectFinancialYear("2018/2019");
		lb.selectPaymentMode("Paid in Salary");
		lb.selectPaidMonth("April/2018");
		
		lb.selectClaimDate("04 April 2018");
		lb.selectPaidDate("14 April 2018");
		lb.selectAmount("2000");
		lb.selectCreateReimbursementButton();
//		String e=lb.getMessage();
//		Assert.assertTrue(e.contains("Reimbursement Claim was successfully"));
}
	
	
}