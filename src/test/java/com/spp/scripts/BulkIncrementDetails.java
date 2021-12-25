package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.BulkIncrementUpdate;
import com.spp.pages.BulkSalaryRateAllot;
import com.spp.pages.CheckifEmployeeBulkIncrementsDetailsGeneralLinksSalaryHeadsredirectstoMastermodule;
import com.spp.pages.CheckifEmployeeBulkSalaryRateDetailsGeneralLinksSalaryHeadsredirectstoMastermodule;
public class BulkIncrementDetails extends BaseTest {


	/*@Test(priority=0)
	public void BulkIncrementUpdate_SC_102() throws Exception { 
	BulkIncrementUpdate aa=new BulkIncrementUpdate(driver);
	aa.clickEmployeeLink();
	aa.selectBulkIncrementDetails();
	aa.selectPayMonth("Mar/2019");
	aa.selectSalaryStructure("Structure");
	Thread.sleep(2000);
	aa.selectSalaryHead("Basic");
	aa.selectGetValues();
	aa.resizeWindow();
	Thread.sleep(5000);
	aa.selectLoad();
	Thread.sleep(2000);
	aa.uncheckCheckbox();
	aa.enterByAmount("2000");
	aa.selectIncrementButton();
	Thread.sleep(2000);
	aa.selectSaveValues();
	Thread.sleep(2000);
	String s=aa.getMessage();
	Assert.assertEquals(s, "Employees Salary Successfully Updated.");
	aa.exitFullscreen();
	}
	
	@Test(priority=1)
	public void CheckifEmployeeBulkIncrementsDetailsGeneralLinksSalaryHeadsredirectstoMastermodule_SC_468() throws Exception { 
	CheckifEmployeeBulkIncrementsDetailsGeneralLinksSalaryHeadsredirectstoMastermodule be=new CheckifEmployeeBulkIncrementsDetailsGeneralLinksSalaryHeadsredirectstoMastermodule(driver);
		be.clickonemployee();
		be.clickonbulkincrementdetails();
		Thread.sleep(2000);
		//be.clickongenerallink();
		//Thread.sleep(2000);
		be.clickonsalaryhead();
		Thread.sleep(2000);
		be.addnewsalhead();
		be.enterheadname("Gross Salary");
		be.entershortname("GROSSS");
		be.createsalaryhead();
		String message = be.getMessage();
		Assert.assertEquals(message, "Salary head successfully created");
		Thread.sleep(3000);
		be.ClickDelete();
		}*/

	@Test(priority=2)
	public void CheckifEmployeeBulkSalaryRateDetailsGeneralLinksSalaryHeadsredirectstoMastermodule_SC_467() throws Exception { 
	CheckifEmployeeBulkSalaryRateDetailsGeneralLinksSalaryHeadsredirectstoMastermodule be=new CheckifEmployeeBulkSalaryRateDetailsGeneralLinksSalaryHeadsredirectstoMastermodule(driver);
		be.clickonemployee();
		be.clickonbulksalaryratedetails();
		Thread.sleep(2000);
		//be.clickongenerallink();
		//Thread.sleep(2000);
		be.clickonsalaryhead();
		Thread.sleep(2000);
		be.addnewsalhead();
		be.enterheadname("Gross_Salary");
		be.entershortname("GROSSS");
		be.createsalaryhead();
		String message = be.getMessage();
		Assert.assertEquals(message, "Salary head successfully created");
		Thread.sleep(3000);
		be.ClickDelete();
		}
	
	@Test(priority=3)
	public void BulkSalaryRateAllot_SC_101() throws Exception { 
	BulkSalaryRateAllot bb=new BulkSalaryRateAllot(driver);
		bb.clickEmployeeLink();
		bb.selectBulkSalaryRateDetails();
		bb.selectPayMonth("Mar/2019");
		bb.selectSalaryStructure("Structure");
		bb.resizeWindow();
		Thread.sleep(2000);
		bb.selectGetEmployees();
		Thread.sleep(2000);
		bb.selectLoad();
		String i=bb.getMessage();
		Assert.assertEquals(i, "Employees Successfully Loaded.");
		Thread.sleep(10000);
		bb.selectMoreButton();
		bb.enterBasic("9000");
		bb.selectPopulateButton();
		Thread.sleep(5000);
		String q=bb.getMessage();
		Assert.assertEquals(q, "Employees Salary successfully Populated.");
		Thread.sleep(3000);
		bb.selectSaveValues();
		Thread.sleep(2000);
		String r=bb.getMessage();
		Assert.assertEquals(r, "Employees Salary successfully Updated.");
		Thread.sleep(3000);
		bb.selectCloseButton();
		bb.exitFullscreen();
		}
}