package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.BulkClassificationChange1;
import com.spp.pages.SearchEmployeeforClassificationChange;

import junit.framework.Assert;

public class BulkClassificationChange extends BaseTest {
	
	@Test(priority=0)
	public void BulkClassificationChange1_SC_103() throws Exception{
		BulkClassificationChange1 af=new BulkClassificationChange1(driver);
		af.navigateMaster();
		af.clickSalaryStructureLink();
		af.AddNewSalaryStructure();
		af.entergroupname("Gross_Structure");
		af.ClickBasedOnGross();
		af.createsalarystructure();
		Thread.sleep(5000);
		af.selectEmployee();
		af.selectBulkClassification();
		af.selectMonth("Mar/2019");
		Thread.sleep(2000);
		af.selectSalaryCheckBox();
		Thread.sleep(2000);
		af.selectSalaryFrom("Structure");
		Thread.sleep(2000);
		af.selectEmployeeCheckBox();
		Thread.sleep(2000);
		af.selectSalaryTo("Gross_Structure");
		af.clickChangeButton();
		Thread.sleep(2000);
		String t=af.getMessage();
		Assert.assertEquals(t, "Successfully Updated");
		Thread.sleep(4000);
		af.selectSalaryFrom1("Gross_Structure");
		Thread.sleep(2000);
		af.selectEmployeeCheckBox();
		Thread.sleep(2000);
		af.selectSalaryTo1("Structure");
		af.clickChangeButton();
		//af.switchToPopUpAndAccept(driver);
		Thread.sleep(5000);
		//af.navigateMaster();
		//af.clickSalaryStructureLink();
		//af.selectDeleteButton();
	}
	
	@Test(priority=1)
	public void SearchEmployeeforClassificationChange_SC_469() throws Exception{
		SearchEmployeeforClassificationChange ec=new SearchEmployeeforClassificationChange(driver);
				ec.clickonemployee();
				ec.clickonbulkclassification();
				Thread.sleep(2000);
				ec.selectmonth("Mar/2019");
				Thread.sleep(2000);
				ec.checksalarycheckbox();
				Thread.sleep(2000);
				ec.selectsalarygroupfrom("Structure");
				Thread.sleep(2000);
				ec.searchemployee("Anil");
				Thread.sleep(2000);
				ec.clickonsearch();
				Thread.sleep(3000);
				ec.selectemployee();
				Thread.sleep(2000);
				ec.selectsalarygroupto("Gross_Structure");
				ec.clickonchange();
				ec.switchToPopUpAndDismiss();
				Thread.sleep(2000);
				ec.clickonchange();
				ec.switchToPopUpAndAccept(driver);
				Thread.sleep(1000);
				String t=ec.getMessage();
				Assert.assertEquals(t, "Successfully Updated");
				Thread.sleep(5000);
				ec.clickonemployee();
				ec.clickonbulkclassification();
				Thread.sleep(2000);
				ec.selectmonth("Mar/2019");
				Thread.sleep(3000);
				ec.checksalarycheckbox();
				//Thread.sleep(2000);
				//ec.searchemployee("");
				Thread.sleep(3000);
				ec.selectsalarygroupfrom("Gross_Structure");
				Thread.sleep(2000);
				ec.selectsalarygroupto("Structure");
				Thread.sleep(2000);
				ec.selectemployee();
				Thread.sleep(2000);
				ec.clickonchange();
				ec.switchToPopUpAndAccept(driver);
	}
}