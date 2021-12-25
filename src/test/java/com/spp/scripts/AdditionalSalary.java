package com.spp.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddNewAdditionalSalary;
import com.spp.pages.AddNewAdditionalSalaryDeductionHead;
import com.spp.pages.AllotSalaryToAdditionalSalaryDeductionHeadFormula;
import com.spp.pages.AllotSalaryToAdditionalSalaryDeductionHeadLumpsum;
import com.spp.pages.AllotSalaryToAdditionalSalaryEarningHeadFormula;
import com.spp.pages.AllotSalaryToAdditionalSalaryEarningHeadLumpsum;
import com.spp.pages.CheckifSalaryAdditionalSalaryGeneralLinkAdditionalSalaryReportredirectstoReport;
import com.spp.pages.DeleteADDITIONALSALARYDEDUCTIONHeading;
import com.spp.pages.DeleteADDITIONALSALARYEARNINGHeading;
import com.spp.pages.DeleteAdditionalSalaryEntryDeduction;
import com.spp.pages.DeleteAdditionalSalaryEntryEarning;
import com.spp.pages.EditAdditionalSalaryDeductionHead;
import com.spp.pages.EditAdditionalSalaryEarningHead;
import com.spp.pages.EditAdditionalSalaryEntryADDITIONALSALARYDEDUCTION;
import com.spp.pages.EditAdditionalSalaryEntryADDITIONALSALARYEARNING;

public class AdditionalSalary extends BaseTest {
	
	@Test(priority=0)
	public void AddNewAdditionalSalary_SC_125() throws InterruptedException{
		AddNewAdditionalSalary cc=new AddNewAdditionalSalary(driver);
		cc.clickSalaryLink();
		cc.selectAdditionalSalary();
		cc.selectAddNewSalaryHeading();
		cc.ClickPayMonths("Apr/2013");
		cc.SelectSalaryType("Special Earning");
		cc.enterAdditionalHeadingName("Gift1");
		cc.clickCreateButton();
		String f=cc.getMessage();
		Assert.assertEquals(f, "Additional salary head successfully created");
	}
	
	@Test(priority=1)
	public void EditAdditionalSalaryEarningHead_SC_495() throws Exception{
		EditAdditionalSalaryEarningHead cc=new EditAdditionalSalaryEarningHead(driver);
		cc.clickSalaryLink();
		cc.selectAdditionalSalary();
		cc.ClickPayMonths("Apr/2013");
		cc.selectGetValues();
		Thread.sleep(2000);
		cc.clickedit();
		Thread.sleep(5000);
		cc.enterAdditionalHeadingName("Gift");
		Thread.sleep(5000);
		cc.updatebutton();
		String d=cc.getmessage();
		Assert.assertEquals(d, "Additional salary head successfully updated");
	}
	
	
	@Test(priority=2)
	public void AllotSalaryToAdditionalSalaryEarningHeadFormula_SC_127() throws InterruptedException{
		AllotSalaryToAdditionalSalaryEarningHeadFormula cc=new AllotSalaryToAdditionalSalaryEarningHeadFormula(driver);
		cc.clickSalaryLink();
		cc.selectAdditionalSalary();
		cc.selectPaymonth("Apr/2013");
		cc.selectGetValues();
		Thread.sleep(2000);
		cc.ClickAllot1();
		cc.ClickAddEmployee();
		cc.ClickAdvanceFilter();
		Thread.sleep(4000);
		cc.ClickLoad();
		Thread.sleep(3000);
		cc.ClickSelectAllBoxs();
		cc.ClickEmployeeBox();
		cc.ClickSelectAllBoxs();
		cc.ClickFormula();
		cc.ClickFormulaDropDown("formula_da");
		Thread.sleep(2000);
		cc.ClickAllot2();
		String d=cc.getMessage();
		Assert.assertEquals(d, "Amount alloted successfully");
}
	
	@Test(priority=3)
	public void AllotSalaryToAdditionalSalaryEarningHeadLumpsum_SC_126() throws InterruptedException{
		AllotSalaryToAdditionalSalaryEarningHeadLumpsum cc=new AllotSalaryToAdditionalSalaryEarningHeadLumpsum(driver);
		cc.clickSalaryLink();
		cc.selectAdditionalSalary();
		cc.selectPaymonth("Apr/2013");
		cc.selectGetValues();
		Thread.sleep(2000);
		cc.ClickAllot();
		cc.ClickAddEmployee();
		cc.ClickAdvanceFilter();
		Thread.sleep(4000);
		cc.ClickLoad();
		Thread.sleep(3000);
		cc.ClickSelectAllBoxs();
		cc.ClickEmployeeBox();
		cc.ClickSelectAllBoxs();
		cc.ClickAmount("500");
		Thread.sleep(2000);
		cc.ClickAllotButton();
		String d=cc.getMessage();
		Assert.assertEquals(d, "Amount alloted successfully");
	
		
}
	
	


	@Test(priority=4)
	public void EditAdditionalSalaryEntryADDITIONALSALARYEARNING_SC_127() throws InterruptedException{
		EditAdditionalSalaryEntryADDITIONALSALARYEARNING cc=new EditAdditionalSalaryEntryADDITIONALSALARYEARNING(driver);
		cc.clickSalaryLink();
		cc.selectAdditionalSalary();
		cc.selectPaymonth("Apr/2013");
		cc.selectGetValues();
		Thread.sleep(2000);
		cc.ClickAllot();
		Thread.sleep(3000);
		cc.clickedit();
		Thread.sleep(2000);
		cc.enteramount("200");
		cc.updatebutton();
		String d=cc.getmessage();
		Assert.assertEquals(d, "Additional salary succesfully updated");
}

	
	@Test(priority=5)
	public void DeleteAdditionalSalaryEntryEarning_SC_368() throws InterruptedException{
		DeleteAdditionalSalaryEntryEarning cc=new DeleteAdditionalSalaryEntryEarning(driver);
		cc.clickSalaryLink();
		cc.selectAdditionalSalary();
		Thread.sleep(2000);
		cc.ClickAllot();
		cc.ClickAddEmployee();
		cc.ClickAdvanceFilter();
		Thread.sleep(4000);
		cc.ClickLoad();
		Thread.sleep(3000);
		cc.ClickSelectAllBoxs();
		cc.ClickEmployeeBox();
		cc.ClickSelectAllBoxs();
		cc.ClickAmount("500");
		cc.ClickAllotButton();
		Thread.sleep(3000);
		cc.ClickDelete();
		Thread.sleep(3000);
		cc.switchToPopUpAndDismiss(driver);
		cc.ClickDelete();
		Thread.sleep(3000);
		cc.switchToPopUpAndAccept(driver);
		String d=cc.getMessage();
		Assert.assertEquals(d, "Additional Salary Entry is successfully deleted");
		
}
	@Test(priority=6)
	public void DeleteADDITIONALSALARYEARNINGHeading_SC_366() throws InterruptedException{
		DeleteADDITIONALSALARYEARNINGHeading cc=new DeleteADDITIONALSALARYEARNINGHeading(driver);
		cc.clickSalaryLink();
		cc.selectAdditionalSalary();
		cc.selectPaymonth("Apr/2013");
		cc.selectGetValues();
		Thread.sleep(4000);
		cc.ClickDeleteButton();
		Thread.sleep(3000);
		cc.switchToPopUpAndDismiss(driver);
		cc.ClickDeleteButton();
		Thread.sleep(3000);
		cc.switchToPopUpAndAccept(driver);
		String d=cc.getMessage();
		Assert.assertEquals(d, "Additional salary head successfully deleted");	
	}
	
	
	
	@Test(priority=7)
	public void AddNewAdditionalSalaryDeductionHead_SC_128() throws InterruptedException{
		AddNewAdditionalSalaryDeductionHead cc=new AddNewAdditionalSalaryDeductionHead(driver);
		cc.clickSalaryLink();
		cc.selectAdditionalSalary();
		cc.selectAddNewSalaryHeading();
		cc.ClickPayMonths("Apr/2013");
		cc.SelectSalaryType("Special Deduction");
		cc.enterAdditionalHeadingName("Lunch1");
		cc.clickCreateButton();
		String f=cc.getMessage();
		Assert.assertEquals(f, "Additional salary head successfully created");
}

@Test(priority=8)
	public void EditAdditionalSalaryDeductionHead_SC_496() throws Exception{
		EditAdditionalSalaryDeductionHead cc=new EditAdditionalSalaryDeductionHead(driver);
		cc.clickSalaryLink();
		cc.selectAdditionalSalary();
		cc.ClickPayMonths("Apr/2013");
		cc.selectGetValues();
		Thread.sleep(2000);
		cc.selectDeductionTab();
		cc.clickedit();
		Thread.sleep(5000);
		cc.enterAdditionalHeadingName("Lunch");
		Thread.sleep(5000);
		cc.updatebutton();
		String d=cc.getmessage();
		Assert.assertEquals(d, "Additional salary head successfully updated");
	}

	@Test(priority=9)
public void AllotSalaryToAdditionalSalaryDeductionHeadFormula_SC_130() throws InterruptedException{
	AllotSalaryToAdditionalSalaryDeductionHeadFormula cc=new AllotSalaryToAdditionalSalaryDeductionHeadFormula(driver);
	cc.clickSalaryLink();
	cc.selectAdditionalSalary();
	cc.selectPaymonth("Apr/2013");
	cc.selectGetValues();
	cc.selectDeductionTab();
	cc.ClickAllot();
	cc.ClickAddEmployee();
	cc.ClickAdvanceFilter();
	Thread.sleep(4000);
	cc.ClickLoad();
	Thread.sleep(3000);
	cc.ClickSelectAllBoxs();
	cc.ClickEmployeeBox();
	cc.ClickSelectAllBoxs();
	cc.ClickFormula();
	cc.ClickFormulaDropDown("formula_da");
	cc.ClickAllotButton();
	String d=cc.getMessage();
	Assert.assertEquals(d, "Amount alloted successfully");
}

	@Test(priority=10)
	public void AllotSalaryToAdditionalSalaryDeductionHeadLumpsum_SC_129() throws InterruptedException{
		AllotSalaryToAdditionalSalaryDeductionHeadLumpsum cc=new AllotSalaryToAdditionalSalaryDeductionHeadLumpsum(driver);
		cc.clickSalaryLink();
		cc.selectAdditionalSalary();
		cc.selectPaymonth("Apr/2013");
		cc.selectGetValues();
		cc.selectDeductionTab();
		cc.ClickAllot();
		cc.ClickAddEmployee();
		cc.ClickAdvanceFilter();
		Thread.sleep(4000);
		cc.ClickLoad();
		Thread.sleep(3000);
		cc.ClickSelectAllBoxs();
		cc.ClickEmployeeBox();
		cc.ClickSelectAllBoxs();
		cc.ClickAmount("500");
		cc.ClickAllotButton();
		String d=cc.getMessage();
		Assert.assertEquals(d, "Amount alloted successfully");
}
	

@Test(priority=11)
	public void EditAdditionalSalaryEntryADDITIONALSALARYDEDUCTION_SC_127() throws InterruptedException{
		EditAdditionalSalaryEntryADDITIONALSALARYDEDUCTION cc=new EditAdditionalSalaryEntryADDITIONALSALARYDEDUCTION(driver);
		cc.clickSalaryLink();
		cc.selectAdditionalSalary();
		cc.selectPaymonth("Apr/2013");
		cc.selectGetValues();
		cc.selectDeductionTab();
		Thread.sleep(2000);
		cc.ClickAllot();
		Thread.sleep(2000);
		cc.clickedit();
		Thread.sleep(2000);
		cc.enteramount("200");
		cc.updatebutton();
		String d=cc.getmessage();
		Assert.assertEquals(d, "Additional salary succesfully updated");
}



	@Test(priority=12)
	public void DeleteAdditionalSalaryEntryDeduction_SC_369() throws InterruptedException{
		DeleteAdditionalSalaryEntryDeduction cc=new DeleteAdditionalSalaryEntryDeduction(driver);
		cc.clickSalaryLink();
		cc.selectAdditionalSalary();
		cc.selectPaymonth("Apr/2013");
		cc.selectGetValues();
		cc.selectDeductionTab();
		cc.ClickAllot();
		cc.ClickDelete();
		Thread.sleep(3000);
		cc.switchToPopUpAndDismiss(driver);
		cc.ClickDelete();
		Thread.sleep(3000);
		cc.switchToPopUpAndAccept(driver);
		String d=cc.getMessage();
		Assert.assertEquals(d, "Additional Salary Entry is successfully deleted");	
		
}

@Test(priority=13)
	public void DeleteADDITIONALSALARYDEDUCTIONHeading_SC_367() throws InterruptedException{
		DeleteADDITIONALSALARYDEDUCTIONHeading cc=new DeleteADDITIONALSALARYDEDUCTIONHeading(driver);
		cc.clickSalaryLink();
		cc.selectAdditionalSalary();
		cc.selectPaymonth("Apr/2013");
		cc.selectGetValues();
		cc.selectDeductionTab();
		Thread.sleep(4000);
		cc.ClickDeleteButton();
		Thread.sleep(3000);
		cc.switchToPopUpAndDismiss(driver);
		cc.ClickDeleteButton();
		Thread.sleep(3000);
		cc.switchToPopUpAndAccept(driver);
		String d=cc.getMessage();
		Assert.assertEquals(d, "Additional salary head successfully deleted");	
	
}
/*	@Test(priority=14)
	public void CheckifSalaryAdditionalSalaryGeneralLinkAdditionalSalaryReportredirectstoReport_SC_499() throws InterruptedException {
		CheckifSalaryAdditionalSalaryGeneralLinkAdditionalSalaryReportredirectstoReport cc=new CheckifSalaryAdditionalSalaryGeneralLinkAdditionalSalaryReportredirectstoReport(driver);
		cc.clickSalaryLink();
		cc.selectAdditionalSalary();
		Thread.sleep(2000);
		cc.selectadditionalsalaryreport();
		Thread.sleep(3000);
		cc.selectPaymonth("Apr/2013");
		cc.getemployees();
		Thread.sleep(5000);
		cc.ClickAdvanceFilter();
		Thread.sleep(4000);
		cc.ClickLoad();
		Thread.sleep(3000);
		cc.getexcelreport();
	
	}*/
}