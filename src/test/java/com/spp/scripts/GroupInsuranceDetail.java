package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddNewGroupInsuranceMaster;
import com.spp.pages.CheckInstitutionNameInGroupInsurance;
import com.spp.pages.CheckifSalaryGroupInsuranceGeneralLinksEmployeeMasterredirectstoEmployee;
import com.spp.pages.CheckifSalaryGroupInsuranceGeneralLinksInsuranceMasterredirectstoMaster;
import com.spp.pages.CreateGroupInsurancePremiumPaymentHalfYearly;
import com.spp.pages.CreateGroupInsurancePremiumPaymentQuarterly;
import com.spp.pages.CreateGroupInsurancePremiumPaymentYearly;
import com.spp.pages.DeleteEMIDetailInGroupInsuranceDetail;
import com.spp.pages.DeleteGroupInsuranceDetail;
import com.spp.pages.EditEMIDetailInsuranceDetails;
import com.spp.pages.EditEMIDetailsGroupInsuranceDetails;
import com.spp.pages.GroupInsuranceDetailMultiAllotment;
import com.spp.pages.GroupInsuranceDetailSingleAllotment;
import com.spp.pages.SalaryGroupInsuranceReportsStandingInsDetailReportredirectstoReport;

public class GroupInsuranceDetail extends BaseTest{
	
	@Test(priority=0)
	public void AddNewGroupInsuranceMaster_SC_304() throws Exception{
		AddNewGroupInsuranceMaster pi=new AddNewGroupInsuranceMaster(driver);
		pi.navigateMaster();
		pi.clickGroupInsurance();
		pi.clickAddNewMaster();
		pi.clickName("Group_Insurance");
		pi.clickCreateButton();
		String f=pi.getMessage();
		Assert.assertEquals(f, "Group Insurance successfully created");
		
	
}
	
	@Test(priority=1)
	public void GroupInsuranceDetailSingleAllotment_SC_311() throws Exception{
		GroupInsuranceDetailSingleAllotment pi=new GroupInsuranceDetailSingleAllotment(driver);
		pi.navigateMaster();
		pi.selectFinancialInst();
		pi.addnewfinanInsti();
		pi.selectAccoutType("Group Insurance");
		pi.enterInstName("HDFC Bank");
		pi.enterBranchCode("FORT MUMBAI");
		pi.enterEmail("hdfc@gmail.com");
		pi.enterAddress("FORT MUMBAI");
		pi.enterPinCode("400085");
		pi.enterIFSCCode("HDFC0000060");
		pi.createfinanceinsti();
		Thread.sleep(5000);
		pi.navigatesalary();
		pi.clickGroupInsuranceDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);
		pi.clickView();
		pi.clickAddNewGroup();
		pi.clickGroupInsuranceName("Group_Insurance");
		pi.clickInsuranceNo(Utility.getRandNum(1, 100));
		pi.clickStartMonth("Apr/2013");
		pi.clickEndMonth("Apr/2013");
		pi.clickAmount("300");
		pi.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		pi.clickRemark("sdfdsf");
		pi.clickCreateButton();
		String r=pi.getMessage();
		Assert.assertEquals(r, "Group Insurance successfully created");
		pi.clickDeleteButton();
}
	
	@Test(priority=2)
	public void GroupInsuranceDetailMultiAllotment_SC_318() throws Exception{
		GroupInsuranceDetailMultiAllotment pi=new GroupInsuranceDetailMultiAllotment(driver);
		pi.navigatesalary();
		pi.clickGroupInsuranceDetails();
		pi.clickAddEmployee();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(5000);	
		pi.selectall();
		Thread.sleep(2000);
		pi.selectall();
		pi.clickMultiAllotmentButton();
		Thread.sleep(5000);
		pi.clickGroupInsuranceName("Group_Insurance");
		pi.clickAmount("4444");
		pi.clickStartMonth("Apr/2013");
		pi.clickEndMonth("Apr/2013");
		pi.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		pi.clickAccountNumber("8555");
		pi.clickRemark("dsfdgf");
		pi.clickMonthly();
		pi.clickCreateButton();
		Thread.sleep(5000);
		pi.clickProceed();
		String r=pi.getMessage();
		Assert.assertEquals(r, "Group Insurance successfully created");
		
		

}
		@Test(priority=3)
	public void CheckInstitutionNameInGroupInsurance_SC_323() throws Exception{
		CheckInstitutionNameInGroupInsurance pi=new CheckInstitutionNameInGroupInsurance(driver);
		pi.navigatesalary();
		pi.clickGroupInsuranceDetails();
		pi.clickAddEmployee();
		Thread.sleep(3000);
		pi.clickLoad();
		Thread.sleep(3000);	
		pi.clickMultiAllotmentButton();
		Thread.sleep(5000);
		pi.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		System.out.println("Institution Name is displayed");
}
	
		@Test(priority=4)
	public void EditEMIDetail_SC_380() throws Exception{
		EditEMIDetailsGroupInsuranceDetails pi=new EditEMIDetailsGroupInsuranceDetails(driver);
		pi.navigatesalary();
		pi.clickgroupInsuranceDetails();
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
@Test(priority=5)
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
		@Test(priority=6)
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
	
	
		@Test(priority=7)
		public void CreateGroupInsurancePremiumPaymentQuarterly_SC_625() throws Exception{
			CreateGroupInsurancePremiumPaymentQuarterly pi=new CreateGroupInsurancePremiumPaymentQuarterly(driver);
			pi.clickonsalary();	
			pi.clickongroupinsurancedetail();
			pi.clickaddemployees();
			Thread.sleep(3000);
			pi.clickonload();
			Thread.sleep(3000);
			pi.clickonview();
			Thread.sleep(2000);
			pi.clickAddNewInsuranceDetails();
			pi.selectGroupInsuranceName("Group_Insurance");
			pi.clickGroupInsuranceNo("56776");
			pi.clickStartMonth("Apr/2013");
			pi.clickEndMonth("Apr/2013");
			pi.clickAmount("5000");
			pi.selectInstitutionName("HDFC Bank-FORT MUMBAI");
			pi.clickRemark("fgfhgjhgh");
			pi.clickquarterly();
			pi.clickCreateGroupInsurancebutton();
			String c=pi.getMessage();
			Assert.assertEquals(c, "Group Insurance successfully created");
			pi.clickdelete();
		}
		@Test(priority=8)
		public void CreateGroupInsurancePremiumPaymentHalfYearly_SC_626() throws Exception{
			CreateGroupInsurancePremiumPaymentHalfYearly pi=new CreateGroupInsurancePremiumPaymentHalfYearly(driver);
			pi.clickonsalary();	
			pi.clickongroupinsurancedetail();
			pi.clickaddemployees();
			Thread.sleep(3000);
			pi.clickonload();
			Thread.sleep(3000);
			pi.clickonview();
			Thread.sleep(2000);
			pi.clickAddNewInsuranceDetails();
			pi.selectGroupInsuranceName("Group_Insurance");
			pi.clickGroupInsuranceNo("56776");
			pi.clickStartMonth("Apr/2013");
			pi.clickEndMonth("Apr/2013");
			pi.clickAmount("5000");
			pi.selectInstitutionName("HDFC Bank-FORT MUMBAI");
			pi.clickRemark("fgfhgjhgh");
			pi.clickhalfyearly();
			pi.clickCreateGroupInsurancebutton();
			String c=pi.getMessage();
			Assert.assertEquals(c, "Group Insurance successfully created");
			pi.clickdelete();
		}
		@Test(priority=9)
		public void CreateGroupInsurancePremiumPaymentYearly_SC_627() throws Exception{
			CreateGroupInsurancePremiumPaymentYearly pi=new CreateGroupInsurancePremiumPaymentYearly(driver);
			pi.clickonsalary();	
			pi.clickongroupinsurancedetail();
			pi.clickaddemployees();
			Thread.sleep(3000);
			pi.clickonload();
			Thread.sleep(3000);
			pi.clickonview();
			Thread.sleep(2000);
			pi.clickAddNewInsuranceDetails();
			pi.selectGroupInsuranceName("Group_Insurance");
			pi.clickGroupInsuranceNo("56776");
			pi.clickStartMonth("Apr/2013");
			pi.clickEndMonth("Apr/2013");
			pi.clickAmount("5000");
			pi.selectInstitutionName("HDFC Bank-FORT MUMBAI");
			pi.clickRemark("fgfhgjhgh");
			pi.clickyearly();
			pi.clickCreateGroupInsurancebutton();
			String c=pi.getMessage();
			Assert.assertEquals(c, "Group Insurance successfully created");
			pi.clickdelete();
		}
	
	@Test(priority=11)
	public void CheckifSalaryGroupInsuranceGeneralLinksInsuranceMasterredirectstoMaster_SC_623() throws Exception{
		CheckifSalaryGroupInsuranceGeneralLinksInsuranceMasterredirectstoMaster si=new CheckifSalaryGroupInsuranceGeneralLinksInsuranceMasterredirectstoMaster(driver);
		si.clickonsalary();
		si.clickongroupinsurancedetail();
		si.clickongenerallinks();
		Thread.sleep(1000);
		si.clickoninsurancemaster();
		Thread.sleep(2000);
		si.addnewinsurancemaster();
		si.enterinsurancename("Insurance_Master");
		si.clickoncreateinsurance();
		String d=si.getMessage();
		Assert.assertEquals(d, "Group Insurance successfully created");
		Thread.sleep(3000);
		si.deletemaster();
		si.switchToPopUpAndAccept(driver);
		Thread.sleep(5000);
		si.clickMastserLink();
		si.selectFinancialInstitution();
		si.deletefinancialinsti();
	}
	
	
	
	
	@Test(priority=10)
	public void CheckifSalaryGroupInsuranceGeneralLinksEmployeeMasterredirectstoEmployee_SC_624() throws Exception {
		CheckifSalaryGroupInsuranceGeneralLinksEmployeeMasterredirectstoEmployee si=new CheckifSalaryGroupInsuranceGeneralLinksEmployeeMasterredirectstoEmployee(driver);
		si.clickonsalary();
		si.clickongroupinsurancedetail();
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
 		si.clickonsalary();
 		si.clickongroupinsurancedetail();
		si.clickongenerallinks();
		Thread.sleep(2000);
		si.clickonemployee();
		si.clickonemployeedetails();
		si.clickonfilter();
		Thread.sleep(2000);
		si.clickonload();
		Thread.sleep(2000);
		si.deleteemployee();
		Thread.sleep(2000);
		si.navigateMaster();
		si.clickGroupInsurance();
		si.deletemaster();
		si.switchToPopUpAndAccept(driver);
	}
	
	/*@Test(priority=12)
	public void CheckifSalaryGroupInsuranceReportsStandingInsDetailReportredirectstoReport_SC_622() throws Exception{
		SalaryGroupInsuranceReportsStandingInsDetailReportredirectstoReport si=new SalaryGroupInsuranceReportsStandingInsDetailReportredirectstoReport(driver);
		si.clickonsalary();
		si.clickongroupinsurancedetail();
		si.clickonstandInsdetailrpt();
		Thread.sleep(1000);
		si.selectsitype("Insurance");
		si.selectreporttype("Detailed Report");
		si.selectmonthfrom("Apr/2013");
		si.selectmonthto("Apr/2013");
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
	}*/
	
}
