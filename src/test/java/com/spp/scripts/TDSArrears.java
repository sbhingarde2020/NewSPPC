package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddNewEmployee;
import com.spp.pages.AddNewEmployeeTDS;
import com.spp.pages.AddNewSalaryAllotment;
import com.spp.pages.ComputeArrear;
import com.spp.pages.CreateArrear;
import com.spp.pages.TDSComputation;


public class TDSArrears extends BaseTest {

	
	@Test(priority=0)
	public void AddNewEmployee_SC_326() throws Exception{
		AddNewEmployeeTDS at=new AddNewEmployeeTDS(driver);
		at.navigateEmployee();
		at.clickEmployeeDetails();
		at.clickAddNewEmployee();
		Thread.sleep(1000);
		at.enterEmployeeId("TATA15623656");
		at.enterEmployeeRefNo("TATA34978666");
		at.enterEmployeeName("Sheetal");
		at.enterFathername("Anil");
		at.enterdob("14 June 1980");
		at.selectGender("Female");
		at.selectMaritalStatus("Single");
		at.enterdoj("01 January 2013");
		at.entersaldate("01 February 2013");
		Thread.sleep(1000);
		at.selectPresentadd();
		at.selectstate("Maharashtra");
		Thread.sleep(1000);
		at.selectstatdetails();
		at.checkTDS();
		at.selectpanoption("ADD PAN");
		at.enterpanno("PRAPM8888P");
		at.entereffectivedatePAN("01 January 2013");
		Thread.sleep(1000);
		at.selectclassificationdetail();
		at.selectsalstructure("Structure");
		at.selectbranch("default");
		at.selectattendancestructure("Karnataka");
		at.selectbank("CASH");
		at.selectleavepolicy("Default");
		Thread.sleep(2000);
		at.selectdesignation("Tester");
		Thread.sleep(2000);
		at.createemployee();
		String s=at.getMessage();
		Assert.assertEquals(s, "Employee successfully created");
	}
	
	/*	@Test(priority=1)
	public void CreateArrear_SC_331() throws InterruptedException{
		CreateArrear cc=new CreateArrear(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("new_"+Utility.getRandNum(2000, 3000));
		cc.selectArrearFrom("Mar/2017");
		cc.selectArrearTo("May/2017");
		Thread.sleep(3000);
		cc.selectArrearRefMonth("May/2017");
		cc.selectPaymonth("May/2017");
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
}
	@Test(priority=2)
	public void ComputeArrear_SC_332() throws InterruptedException{
		ComputeArrear ca=new ComputeArrear(driver);
		ca.clickSalaryLink();
		ca.selectArrears();
		ca.selectComputation();
		ca.EnterAddEmployee();
		Thread.sleep(4000);
		ca.ClickLoad();
		Thread.sleep(3000);
		ca.ClickSave();
		String y=ca.getMessage();
		Assert.assertEquals(y, "Employees Added Successfully.");
		} 	
	@Test(priority=3)
	public void TDSComputation_SC_333() throws Exception{
		TDSComputation tc=new TDSComputation(driver);
		tc.clickontds();
		tc.clickoncomputation();
		tc.selectfinancialyear("2017/2018");
		tc.clickonfilter();
	}
	@Test(priority=4)
	public void AddNewSalaryAllotment_SC_327() throws Exception{
		AddNewSalaryAllotment ad=new AddNewSalaryAllotment(driver);
		ad.clickonemployee();
		ad.clickonsalaryratedetails();
		ad.clickonlistingemployee();
		ad.clickonfilter();
		Thread.sleep(2000);
		ad.clickonload();
		Thread.sleep(2000);
		ad.selectpagetwo();
		ad.clickonallotsalary();
		Thread.sleep(1000);
		ad.selectmonthyear("Jul/2018");
		Thread.sleep(3000);
		ad.entergrosssal("28000");
		ad.clickonsave();
		String y=ad.getMessage();
		Assert.assertEquals(y, "Salary Allotted successfully");
		
		
	}*/
}
