package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AddFormula;
import com.spp.pages.UpdateRestrictPFContributionOfAllEmployee;
import com.spp.pages.UpdateRestrictPFContributionOfEmployee;

public class RestrictPFContribution extends BaseTest{

	
	@Test(priority=0)
	public void UpdateRestrictPFContributionOfEmployee_SC_97() throws InterruptedException  	{
		UpdateRestrictPFContributionOfEmployee af=new UpdateRestrictPFContributionOfEmployee(driver);
	    af.selectEmployee();
	    af.selectPfContribution();
	    af.selectCheckBox1();
	    af.selectCheckBox2();
	    af.selectUpdateButton();
	    Thread.sleep(1000);
	    String q=af.getPFMessage();
	    Assert.assertEquals(q, "PF Contribution was successfully updated");
	}
	@Test(priority=1)
	public void UpdateRestrictPFContributionOfAllEmployee_SC_459() throws InterruptedException  	{
		UpdateRestrictPFContributionOfAllEmployee af=new UpdateRestrictPFContributionOfAllEmployee(driver);
		af.selectEmployee();
		af.selectPfContribution();
		af.selectCheckBox1();
	    af.selectCheckBox2();
	    af.selectUpdateButton();
	    Thread.sleep(1000);
		String q=af.getPFMessage();
		Assert.assertEquals(q, "PF Contribution was successfully updated");
			
	}
}