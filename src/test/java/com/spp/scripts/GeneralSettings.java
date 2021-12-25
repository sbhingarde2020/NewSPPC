package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.ModuleSelectionInSettings;
import com.spp.pages.UpdateCountrySettings;
import com.spp.pages.UpdateDashboardSettings;
import com.spp.pages.UpdateDateFormat;
import com.spp.pages.UpdateGeneralSettingsPaymonth;
import com.spp.pages.UpdatePayslipLegendsInSettings;

import junit.framework.Assert;

public class GeneralSettings extends BaseTest{
	@Test(priority=0)
 	public void UpdateGeneralSettingsPaymonth_SC_86() throws Exception{
		UpdateGeneralSettingsPaymonth sh=new UpdateGeneralSettingsPaymonth(driver);
		sh.clickSettings();
		sh.selectOptionSettings();
		sh.selectHoldSalary();
		sh.selectPTOnGross();
		sh.selectVoluntaryPF();
		sh.ClickUpdateSettings();
		String e=sh.getMessage();
		Assert.assertEquals(e, "Option Setting was successfully updated.");
		Thread.sleep(5000);
		sh.clickSettings();
		sh.selectOptionSettings();

}
	@Test(priority=1)
	public void ModuleSelectionInSettings_SC_87() throws Exception{
	ModuleSelectionInSettings sh=new ModuleSelectionInSettings(driver);
	sh.clickSettings();
	sh.selectOptionSettings();
	sh.selectModuleSelection();
	sh.selectRemibursementModule();
	sh.clickUpdateModule();
	String e=sh.getMessage();
	Assert.assertEquals(e, "Option Setting was successfully updated.");
}
		@Test(priority=2)
	public void UpdateCountrySettings_SC_88() throws Exception{
		UpdateCountrySettings sh=new UpdateCountrySettings(driver);
	sh.clickSettings();
	sh.selectOptionSettings();
	sh.selectCountrySettings();
	sh.selectCountry("India");
	sh.selectTimeZone("(GMT+05:30) Kolkata");
	sh.ClickUpdateSettings();
	String e=sh.getMessage();
	Assert.assertEquals(e, "Option Setting was successfully updated.");
}
		@Test(priority=3)
	public void UpdateDateFormat_SC_89() throws Exception{
		UpdateDateFormat sh=new UpdateDateFormat(driver);
	sh.clickSettings();
	sh.selectOptionSettings();
	sh.selectDateFormatSettings();
	sh.selectDateFormat("d MM Y");
	sh.ClickUpdateSettings();
	String e=sh.getMessage();
	Assert.assertEquals(e, "Option Setting was successfully updated.");
}
		@Test(priority=4)
	public void UpdatePayslipLegendsInSettings_SC_90() throws Exception{
		UpdatePayslipLegendsInSettings sh=new UpdatePayslipLegendsInSettings(driver);
	    sh.clickSettings();
	    sh.selectPaySlipLegends();
	    sh.selectall();
	    Thread.sleep(5000);
	    sh.clickUpdatePayslip();
	    String e=sh.getMessage();
		Assert.assertEquals(e, "Payslip Legends saved successfully.");
	
}
		@Test(priority=5)
	public void UpdateDashboardSettings_SC_91() throws Exception{
		UpdateDashboardSettings sh=new UpdateDashboardSettings(driver);
	    sh.clickSettings();
	    sh.selectDashboardSettings();
	    sh.selectNewEmployee();
	    sh.selectClassificationNotAssigned();
	    sh.clickUpdateDashboard();
	    String e=sh.getMessage();
		Assert.assertEquals(e, "Dashboard setting was successfully updated.");
		Thread.sleep(5000);
		sh.clickSPPIcon();
}
}
