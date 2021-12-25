package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.pages.AddFinancialInstitutions;
import com.spp.pages.AssignFinancialInstitutionandTryToDelete;
import com.spp.pages.CreateFinancialInstitutionwithIFSCCode;
import com.spp.pages.DeleteFinancialInstitutions;
import com.spp.pages.GetListAccordingtoGroupInsurance;
import com.spp.pages.GetFinancialListAccordingToAllFinancialInstituions;
import com.spp.pages.GetListAccordingToInsurance;
import com.spp.pages.GetListAccordingToLoan;
import com.spp.pages.UpdateFinancilInstitutions;

public class FinancialInstitution extends BaseTest{
	
	@Test(priority=0)
	public void verifyCreatedFinancialInstitutions_SC_72(){
		AddFinancialInstitutions a=new AddFinancialInstitutions(driver);
		a.clickMastserLink();
		a.selectFinancialInstitution();
		a.clickAddFinancialInst();
		a.selectAccoutType("Group Insurance");
		a.enterInstName("ICICIBank1");
		a.enterBranchCode("22324");
		a.enterEmail("relyon@gmail.com");
		a.enterAddress("Chennai");
		a.enterPinCode("517325");
		a.enterIFSCCode("unio0677hjo");
		a.enterMICRCode("3242335464");
		a.clickCreateButton();
		String s=a.getMessage();
		Assert.assertEquals(s, "Financial Institution successfully created");
	}
	
	@Test(priority=1)
	public void verifyUpdatedFinancialInsritution_SC_71(){
		UpdateFinancilInstitutions uf=new UpdateFinancilInstitutions(driver);
		uf.clickMastserLink();
		uf.selectFinancialInstitution();
		uf.clickEditIcon();
		uf.enterInstName("ICICIBank");
		uf.enterBranchCode("2232344");
		uf.enterEmail("relyoneffr@gmail.com");
		uf.enterAddress("Bangalore");
		uf.enterPinCode("560025");
		uf.enterIFSCCode("unio0677hjj");
		uf.enterMICRCode("3242335464");
		uf.clickUpdateButton();
		String s=uf.getMessage();
		Assert.assertEquals(s, "Financial Institution successfully updated");
	}
	@Test(priority=2)
	public void GetFinancialListAccordingToSalaryAccount_SC_343() throws Exception{
		GetFinancialListAccordingToAllFinancialInstituions ld=new GetFinancialListAccordingToAllFinancialInstituions(driver);
		ld.clickMastserLink();
		ld.clickFinancialLink();
		ld.clickAccountType("Salary Account");
		Thread.sleep(5000);
		ld.clickGetList();
	}		
	@Test(priority=3)
	public void GetListAccordingtoGroupInsurance_SC_344(){
		GetListAccordingtoGroupInsurance fi=new GetListAccordingtoGroupInsurance(driver);
		fi.clickMastserLink();
		fi.selectFinancialInstitution();
		fi.selectAccountType("Group Insurance");
		fi.clickGetListButton();
	}
	@Test(priority=4)
	public void GetListAccordingToInsurance_SC_345() throws Exception{
		GetListAccordingToInsurance ld=new GetListAccordingToInsurance(driver);
		ld.clickMastserLink();
		ld.clickFinancialLink();
		ld.clickAccountType("Insurance");
		Thread.sleep(5000);
		ld.clickGetList();
	}		
	
	@Test(priority=5)
	public void GetListAccordingToLoan_SC_346() throws Exception{
		GetListAccordingToLoan ld=new GetListAccordingToLoan(driver);
		ld.clickMastserLink();
		ld.clickFinancialLink();
		ld.clickAccountType("Loan");
		Thread.sleep(5000);
		ld.clickGetList();
	}	
	@Test(priority=6)
	public void GetFinancialListAccordingToAllFinancialInstituions_SC_347() throws Exception{
		GetFinancialListAccordingToAllFinancialInstituions ld=new GetFinancialListAccordingToAllFinancialInstituions(driver);
		ld.clickMastserLink();
		ld.clickFinancialLink();
		ld.clickAccountType("All");
		Thread.sleep(5000);
		ld.clickGetList();
	}	
	
	@Test(priority=7)
	public void verifyDeletedFinancialInstitution_SC_73(){
		DeleteFinancialInstitutions df=new DeleteFinancialInstitutions(driver);
		df.clickMastserLink();
		df.selectFinancialInstitution();
		df.clickDeleteButton();
		String s=df.getMessage();
		Assert.assertEquals(s, "Financial Institution was successfully deleted.");
	}
	
	@Test(priority=8)
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
	
	@Test(priority=9)
	public void AssignFinancialInstitutionandTryToDelete_SC_348() throws Exception{
		AssignFinancialInstitutionandTryToDelete td= new AssignFinancialInstitutionandTryToDelete(driver);
		td.clickonemployee();
		td.clickonemployeedetails();
		td.resizeWindow();
		td.clickonfilter();
		Thread.sleep(5000);
		td.clickonload();
		Thread.sleep(5000);
		td.clickonview();
		td.clickclassificationdetail();
		td.addnewclassificationdetail();
		Thread.sleep(2000);
		td.SelectBank("State Bank of India");
		td.Effectivedate();
		Thread.sleep(2000);
		td.changeyear();
		//Thread.sleep(2000);
		//td.changeyear();
		//Thread.sleep(2000);
		//td.changeyear();
		//Thread.sleep(2000);
		//td.changeyear();
		//Thread.sleep(2000);
		//td.changeyear();
		//Thread.sleep(2000);
		td.Selectdate();
		Thread.sleep(2000);
		td.enterbankaccno("98765");
		Thread.sleep(2000);
		td.createclassdetail();
		String s=td.getMessage();
		Assert.assertEquals(s, "Employee detail was successfully created.");
		td.clickMastserLink();
		td.selectFinancialInstitution();	
		td.deletefinancialinsti();
		Thread.sleep(2000);
		td.clickonemployee();
		td.clickonemployeedetails();
		td.clickonfilter();
		Thread.sleep(5000);
		td.clickonload();
		Thread.sleep(5000);
		td.clickonview();
		td.clickclassificationdetail();
		td.deleteclassdetail();
		Thread.sleep(2000);
		td.clickMastserLink();
		td.selectFinancialInstitution();	
		td.deletefinancialinsti();
		td.exitFullscreen();
		Thread.sleep(2000);
	}
}