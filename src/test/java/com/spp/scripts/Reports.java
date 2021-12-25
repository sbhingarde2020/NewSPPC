package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.PTChallanMaharashtraNewFormatPreconditions;
import com.spp.pages.PTChallanMaharashtraNewFormatVerifyingslbsinreport;
import com.spp.pages.PTChallanMaharashtraNewFormatVerifyingtheamount;

import junit.framework.Assert;

public class Reports extends BaseTest {
	
	@Test(priority=0)
	public void PTChallanMaharashtraNewFormatPreconditions_SC_172() throws Exception{
		PTChallanMaharashtraNewFormatPreconditions pt=new PTChallanMaharashtraNewFormatPreconditions(driver);
		pt.navigateMaster();
		pt.clickCompanayStatLink();
		pt.clickPTLink();
		pt.clickAddPTLink();
		pt.enterPTGroupName("PTGroup5434");
		pt.selectState("mah");
		pt.enterPTAddress("maha");
		pt.enterPTOCircleNumber("123");
		pt.enterPTCertificateNumber("RE1234");
		pt.selectReturnType("Half Yearly");
		pt.clickCreatePT();
		Thread.sleep(3000);
		pt.clickPTRate();
		pt.selectEffectiveFrom("Apr/2017");
		pt.clickPTGroupRateButton();
		Thread.sleep(3000);
		pt.clickSettingsLink();
		pt.clickFillDefaultButton();	
		String s=pt.getMessage();
		Assert.assertEquals(s, "Default PT Slab Successfully Created.");
		pt.navigateMaster();
		pt.companylink();
		Thread.sleep(2000);
		pt.clickBranchLink();
		Thread.sleep(2000);
		pt.clickAddBranchLink();
		pt.enterBranchName("Aurangabad");
		pt.enterReponsiblePersonName("Kavitha");
		Thread.sleep(3000);
		pt.enterBranchAddress("Chennai4");
		pt.enterBranchState("Tamilnadu");
		pt.clickCreateBranchButton();
		String r=pt.getBranchMessage();
		Assert.assertEquals(r, "Branch was successfully created");
		Thread.sleep(5000);
		pt.clickPTDetail();
		Thread.sleep(2000);
		pt.selectPTGroup("PTGroup5434");
		pt.enterPTEffectiveDate("May/2016");
		pt.clickCreatePTDetail();
		String s3=pt.getPTMessage();
		Assert.assertEquals(s3, "PT detail successfully created.");
		Thread.sleep(5000);
		pt.navigateEmployee();
		pt.clickEmployeeDetails();
		pt.clickAddNewEmployee();
		Thread.sleep(1000);
		pt.enterEmployeeId("REF12458");
		pt.enterEmployeeRefNo("REF265961");
		pt.enterEmployeeName("Shalini");
		pt.enterFathername("Anil");
		pt.enterdob("14 June 1991");
		pt.selectGender("Female");
		pt.selectMaritalStatus("Single");
		pt.enterdoj("09 June 2018");
		pt.entersaldate("01 July 2018");
		Thread.sleep(1000);
		pt.selectPresentadd();
		pt.selectstate("Maharashtra");
		Thread.sleep(1000);
		pt.selectclassificationdetail();
		pt.selectsalstructure("Structure");
		pt.selectbranch("Aurangabad");
		pt.selectattendancestructure("Hyderabad");
		pt.selectbank("CASH");
		pt.selectleavepolicy("PolicyNo1");
		Thread.sleep(2000);
		pt.selectdesignation("Junior Tester");
		Thread.sleep(2000);
		pt.createemployee();
		String t=pt.getMessageforemployee();
		Assert.assertEquals(t, "Employee successfully created");
	}
	/*@Test(priority=1)
	public void PTChallanMaharashtraNewFormatVerifyingslbsinreport_SC_175() throws Exception{
		PTChallanMaharashtraNewFormatVerifyingslbsinreport pt=new PTChallanMaharashtraNewFormatVerifyingslbsinreport(driver);
		pt.clickonreport();
		pt.clickonptreport();
		pt.selectreporttype("Statutory Report");
		pt.selectstate("Maharashtra");
		pt.selectptgroup("PTGroup5434");
		pt.selectmonthyear("Jul/2018");
		pt.selectyear("");
		pt.selectreportname("");
		pt.getpreview();
		Thread.sleep(3000);
		pt.clickonreport();
		pt.clickonptreport();
		pt.selectreporttype("Detailed Report");
		pt.selectstate("Maharashtra");
		pt.selectptgroup("PTGroup5434");
		pt.selectmonthyear("Jul/2018");
		pt.selectformat("excel");
		pt.selectgroupby("slabwise");
		pt.selectorderby("Employee Name");
		pt.getpreview();
		
	}
	@Test(priority=2)
	public void PTChallanMaharashtraNewFormatVerifyingtheamount_SC_176() throws Exception{
		PTChallanMaharashtraNewFormatVerifyingtheamount pt=new PTChallanMaharashtraNewFormatVerifyingtheamount(driver);
		pt.clickonreport();
		pt.clickonptreport();
		pt.selectreporttype("Statutory Report");
		Thread.sleep(500);
		pt.selectstate("Maharashtra");
		Thread.sleep(500);
		pt.selectptgroup("PTGroup5434");
		Thread.sleep(500);
		pt.selectmonthyear("Jul/2018");
		Thread.sleep(500);
		pt.selectyear("2018/2019");
		Thread.sleep(500);
		pt.printbranchname();
		Thread.sleep(500);
		pt.enterinterestamount("50");
		Thread.sleep(500);
		pt.enterptpaid("2000");
		Thread.sleep(500);
		pt.enterlessexcesspaid("20");
		Thread.sleep(500);
		pt.clickonpreview();
	}*/
}
