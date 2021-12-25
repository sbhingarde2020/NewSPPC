package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AssignFinancialInstitutionandTryToDelete;
import com.spp.pages.CreateFinancialInstitutionwithIFSCCode;
import com.spp.pages.GetFinancialListAccordingToAllFinancialInstituions;
import com.spp.pages.GetListAccordingToInsurance;
import com.spp.pages.GetListAccordingToLoan;



public class FinancialInstitutionBank extends BaseTest{
	@Test(priority=0)
	public void GetFinancialListAccordingToSalaryAccount_SC_343() throws Exception{
		GetFinancialListAccordingToAllFinancialInstituions ld=new GetFinancialListAccordingToAllFinancialInstituions(driver);
		
		ld.clickMastserLink();
		ld.clickFinancialLink();
		ld.clickAccountType("Salary Account");
		Thread.sleep(5000);
		ld.clickGetList();
		Thread.sleep(2000);
	}		
	@Test(priority=1)
	public void GetListAccordingToInsurance_SC_345() throws Exception{
		GetListAccordingToInsurance ld=new GetListAccordingToInsurance(driver);
		
		ld.clickMastserLink();
		ld.clickFinancialLink();
		ld.clickAccountType("Insurance");
		Thread.sleep(5000);
		ld.clickGetList();
		Thread.sleep(2000);
	}			
	
	@Test(priority=2)
	public void GetListAccordingToLoan_SC_346() throws Exception{
		GetListAccordingToLoan ld=new GetListAccordingToLoan(driver);
		
		ld.clickMastserLink();
		ld.clickFinancialLink();
		ld.clickAccountType("Loan");
		Thread.sleep(5000);
		ld.clickGetList();
		Thread.sleep(2000);
	}	
	@Test(priority=3)
	public void GetFinancialListAccordingToSalaryAccount_SC_347() throws Exception{
		GetFinancialListAccordingToAllFinancialInstituions ld=new GetFinancialListAccordingToAllFinancialInstituions(driver);
		
		ld.clickMastserLink();
		ld.clickFinancialLink();
		ld.clickAccountType("All");
		Thread.sleep(5000);
		ld.clickGetList();
		Thread.sleep(2000);
	}	
	@Test(priority=4)
	public void CreateFinancialInstitutionwithIFSCCode_SC_450() throws Exception{
		CreateFinancialInstitutionwithIFSCCode ld=new CreateFinancialInstitutionwithIFSCCode(driver);
		
		ld.clickMastserLink();
		ld.selectFinancialInstitution();
		ld.clickAddFinancialInst();
		ld.selectAccoutType("Salary Account");
		ld.enterInstName("State Bank of India");
		ld.enterBranchCode("1");
		ld.enterEmail("info@sbi.com");
		ld.enterAddress("#125,19th Block,ESI 3rd Block,Rajaji Nagar,Bangalore");
		ld.enterPinCode("560001");
		ld.enterIFSCCode("SBIN0000539");
		ld.enterMICRCode("400002002");
		ld.clickCreateButton();
		String s=ld.getMessage();
		Assert.assertEquals(s, "Financial Institution successfully created");
		
	}
	@Test(priority=5)
	public void AssignFinancialInstitutionandTryToDelete_SC_348() throws Exception{
		AssignFinancialInstitutionandTryToDelete td= new AssignFinancialInstitutionandTryToDelete(driver);
		td.clickonemployee();
		td.clickonemployeedetails();
		td.clickonfilter();
		Thread.sleep(2000);
		td.clickonload();
		Thread.sleep(3000);
		td.clickonview();
		td.clickclassificationdetail();
		td.addnewclassificationdetail();
		Thread.sleep(2000);
		td.SelectBank("State Bank of India");
		td.Effectivedate();
		td.Selectdate();
		Thread.sleep(2000);
		td.enterbankaccno("98765");
		td.createclassdetail();
		String s=td.getMessage();
		Assert.assertEquals(s, "Employee detail was successfully created.");
		Thread.sleep(2000);
		td.clickMastserLink();
		td.selectFinancialInstitution();
		td.deletefinancialinsti();
	}
	
	
	
	
}
