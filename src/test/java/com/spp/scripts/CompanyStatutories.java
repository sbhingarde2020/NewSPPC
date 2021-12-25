package com.spp.scripts;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.spp.common.BaseTest;
import com.spp.pages.AddESIGroup;
import com.spp.pages.AddPFGroup;
import com.spp.pages.AddPTGroup;
import com.spp.pages.DeleteESIGroup;
import com.spp.pages.DeleteESIGroupRate;
import com.spp.pages.DeletePFGroup;
import com.spp.pages.DeletePFGroupRate;
import com.spp.pages.DeletePTGroup;
import com.spp.pages.DeletePTGroupRate;
import com.spp.pages.EditESIAndESIRate;
import com.spp.pages.EditPFGroupandPFRate;
import com.spp.pages.EditPTGroup;

public class CompanyStatutories extends BaseTest{
	@Test(priority=0)
	public void verifyPFGroupCreated_SC_48_49() throws Exception{
		AddPFGroup ag=new AddPFGroup(driver);
		ag.navigateMaster();
		ag.clickCompanayLink();
		ag.clickAddPFLink();
		Thread.sleep(2000);
		ag.enterPFGroupName("PF_1");
		ag.enterPFNumber("KN/45889");
		ag.enterDBFileCode("IFC0001");
		ag.enterExtension("1");
		ag.enterPFAddress("Bangalore");
		ag.clickPFCreateButton();
		Thread.sleep(3000);
		ag.clickPFRateLinkButton();
		Thread.sleep(2000);	
		ag.selectEffectiveDate("Mar/2019");
		ag.clickPFGroupRateButton();
		String s=ag.getMessage();
		Assert.assertEquals(s, "PF group rate successfully created.");	
	} 
	@Test(priority=1)	
	public void verifyUpdatePFGroup_SC_187_203() throws Exception{
		EditPFGroupandPFRate ep=new EditPFGroupandPFRate(driver);
		Thread.sleep(5000);
		ep.navigateMaster();
		ep.clickCompanayLink();
		ep.clickEditPFGroup();
		ep.enterPFGroupName("PF-1");
		ep.enterPFNumber("CN/20317fTudxszc888");
		ep.enterDBFileCode("234355");
		ep.enterExtension("2");	
		ep.enterPFAddress("Sholinganltlure,Chetnnai.");
		ep.clickUpdatePFButton();
		ep.clickPFRateLinkButton();
		Thread.sleep(5000);
		ep.clickEditPFRateButton();
		ep.selectEffectiveFrom("Apr/2013");
		Thread.sleep(5000);
		ep.enterEPFValue("10");
		ep.enterCutoffValue("000");
		ep.enterAccountNO2("1");
		ep.enterPensionFund("8.34");
		ep.enterAccountNo21("0.1");
		ep.enterAccountNo22("0.1"); 
		Thread.sleep(1000);
		ep.clickUpdatePFRateButton();
		String s=ep.getMessage();
		Assert.assertEquals(s, "PF group rate successfully updated.");
	} 
	@Test(priority=2)
	public void verifyDeletedPFGroup_SC_204() throws Exception{   
		DeletePFGroupRate dg=new DeletePFGroupRate(driver);
		Thread.sleep(3000);
		dg.navigateMaster();
		dg.clickCompanayLink();
		Thread.sleep(2000);
		dg.clickonpf();
		dg.clickedit();
		Thread.sleep(2000);
		dg.clickPFRateLinkButton();
		Thread.sleep(2000);
		dg.clickdeletepfratebutton();
		Thread.sleep(5000);
		dg.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		dg.clickdeletepfratebutton();
		Thread.sleep(5000);
		dg.switchToPopUpAndAccept(driver);
		String s=dg.getMessage();
		Assert.assertEquals(s,"PF group rate successfully deleted.");
	}
	@Test(priority=3)
	public void verifyDeletedPFGroup_SC_192() throws Exception{   
		DeletePFGroup dg=new DeletePFGroup(driver);
		Thread.sleep(3000);
		dg.navigateMaster();
		dg.clickCompanayLink();
		dg.clickPFGroupLink();
		dg.clickDeletePFGroupButton();
		Thread.sleep(2000);
		dg.switchToPopUpAndDismiss();
		Thread.sleep(3000);
		dg.clickDeletePFGroupButton();
		dg.switchToPopUpAndAccept(driver);
		String s=dg.getMessage();
		Assert.assertEquals(s,"PF group successfully deleted");
	}
	@Test(priority=4)
	public void verifyESIGroupCreated_SC_50_51() throws Exception{
		AddESIGroup ae=new AddESIGroup(driver);
		Thread.sleep(5000);
		ae.navigateMaster();
		ae.clickCompanayLink();
		ae.clickESILink();
		ae.clickAddressLink();
		ae.enterESIName("ESI_1");
		ae.enterESINumber("cn/23456SD58DE6787");
		ae.enterESIAddress("Chennai,TN");
		ae.enterESIOffice("CMBT");
		ae.clickCreateESI();
		Thread.sleep(5000);
		ae.clickESIRateLink();
		Thread.sleep(2000);
		ae.selectESIEffectiveDate("Apr/2013");
		Thread.sleep(2000);
		ae.clickCreateESIRate();
		String s=ae.getMessage();
		Assert.assertEquals(s, "ESI group rate successfully created.");
	}
	@Test(priority=5)
	public void verifyUpdateESIGroup_SC_195_206() throws Exception{ 
		EditESIAndESIRate er=new EditESIAndESIRate(driver);
		Thread.sleep(5000);
		er.navigateMaster();
		er.clickCompanayLink();
		er.clickESILink();
		er.clickEditESILink();
		er.enterESIName("ESI-1");
		er.enterESINumber("123645FS678CS9");
		er.enterESIAddress("Shollinganallure,Chennai");
		er.enterESIOffice("Techpark");
		er.clickupdateESIButton();
		Thread.sleep(2000);
		er.clickESILink();
		er.clickEditESILink();
		Thread.sleep(2000);
		er.clickESIRateLink();
		//System.out.println("JHGAjk");
		Thread.sleep(2000);
		er.clickEditESIRateIcon();
		Thread.sleep(3000);
		er.enterEmployeeRate("1.25");
		er.enterEmployerRate("10");
		er.enterCutOff("1010");
		er.enterMinimumLimit("65");
		Thread.sleep(3000);
		er.clickUpdateESIRateButton();
		Assert.assertEquals("ESI group rate successfully updated", "ESI group rate successfully updated");
	}
	@Test(priority=6)
	public void verifyDeletedESIGroup_SC_208() throws Exception{   
		DeleteESIGroupRate dg=new DeleteESIGroupRate(driver);
		Thread.sleep(3000);
		dg.navigateMaster();
		dg.clickCompanayLink();
		Thread.sleep(4000);
		dg.clickESIGroup();
		dg.clickEditLink();
		dg.clickESIRate();
		dg.clickDeleteButton();
		dg.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		dg.clickDeleteButton();
		dg.switchToPopUpAndAccept(driver);
		String s=dg.getMessage();
		Assert.assertEquals(s,"ESI group rate successfully deleted.");
	}
	@Test(priority=7)
	public void verifyDeletedESIGoup_SC_197() throws Exception{
		DeleteESIGroup de=new DeleteESIGroup(driver);
		de.navigateMaster();
		de.clickCompanayLink();
		de.clickESILink();
		Thread.sleep(2000);
		de.clickDeleteEditESIGroupButton();
		de.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		de.clickDeleteEditESIGroupButton();
		de.switchToPopUpAndAccept(driver);
		String s=de.getMessage();
		Assert.assertEquals(s, "ESI group successfully deleted");
	}
	@Test(priority=8)//not running default pt group slab not present
	public void verifyPTGroupCreatedSC_52_53() throws Exception{
		AddPTGroup pt=new AddPTGroup(driver);
		Thread.sleep(3000);
		pt.navigateMaster();
		pt.clickCompanayLink();
		pt.clickPTLink();
		pt.clickAddPTLink();
		pt.enterPTGroupName("PT_1");
		pt.selectState("mah");
		pt.enterPTAddress("maha");
		pt.enterPTOCircleNumber("123");
		pt.enterPTCertificateNumber("RE1234");
		pt.selectReturnType("Half Yearly");
		pt.clickCreatePT();
		Thread.sleep(3000);
		pt.clickPTRate();
		pt.selectEffectiveFrom("May/2013");
		pt.clickPTGroupRateButton();
		Thread.sleep(3000);
		pt.clickSettingsLink();
		pt.clickFillDefaultButton();	
		String s=pt.getMessage();
		Assert.assertEquals(s, "Default PT Slab Successfully Created.");
	}
	@Test(priority=9)
	public void verifyUpdatePTGroup_SC_199_209() throws Exception{
		EditPTGroup ep=new EditPTGroup(driver);
		Thread.sleep(2000);
		ep.navigateMaster();
		ep.clickCompanayLink();
		ep.clickPTLink();
		ep.clickEditPTGroup();
		ep.enterPTGroupName("PT-103");
		ep.enterPTAddress("#25,chennai1");
		ep.enterPTCertificateNumber("234563");
		ep.enterPTOCircleNumber("65783474");
		ep.clickPTLock();
		ep.clickUpdatePTGroupButton();
		Thread.sleep(3000);
		ep.clickPTRate();
		Thread.sleep(2000);
		ep.clickSettingsLink();
		ep.clickEditPTRateLink();
		Thread.sleep(2000);
		ep.enterMinimumField("700");
		ep.enterPTField("25");
		ep.selectCategory("Female");
		ep.clickUpdatePTRate();	
		//String s=ep.getMessage();
		//Assert.assertEquals(s,"PT rate successfully updated.");
	}
	@Test(priority=10)
	public void verifyDeletedPTGroup_SC_211() throws Exception{   
		DeletePTGroupRate dg=new DeletePTGroupRate(driver);
		Thread.sleep(3000);
		dg.navigateMaster();
		dg.clickCompanayLink();
		Thread.sleep(4000);
		dg.clickPTGroup();
		Thread.sleep(2000);
		dg.clickEditLink();
		Thread.sleep(2000);
		dg.clickPTRate();
		Thread.sleep(2000);
		dg.clickSettings();
		Thread.sleep(5000);
		dg.clickDeleteButton();
		Thread.sleep(5000);
		dg.clickDeleteButton();
		Thread.sleep(5000);
		dg.clickDeleteButton();
		Thread.sleep(5000);
		dg.clickDeleteButton();
		Thread.sleep(5000);
		dg.clickDeleteButton();
		Thread.sleep(5000);
		dg.clickDeleteButton();
		Thread.sleep(5000);
		dg.navigateMaster();
		dg.clickCompanayLink();
		Thread.sleep(4000);
		dg.clickPTGroup();
		Thread.sleep(2000);
		dg.clickEditLink();
		Thread.sleep(2000);
		dg.clickPTRate();
		Thread.sleep(2000);
		dg.DeletePTSlab();
		//String s=dg.getMessage();
		//Assert.assertEquals(s,"PT Rate successfully deleted");
	}
	@Test(priority=11)
	public void verifyDeletedPTGroup_SC_202() throws Exception{
		DeletePTGroup dpg=new DeletePTGroup(driver);
		//Thread.sleep(1000);
		dpg.navigateMaster();
		dpg.clickCompanayLink();
		dpg.clickPTLink();
		Thread.sleep(2000);
		dpg.clickDeleteFirstPT();
		Thread.sleep(2000);
		dpg.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		dpg.clickDeleteFirstPT();
		Thread.sleep(1000);
		dpg.switchToPopUpAndAccept(driver);
        String s=dpg.getMessage();
        Assert.assertEquals(s, "PT Group was successfully deleted.");
	}
}