package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.ArrearsManualLumpsumAsSalaryComponent;
import com.spp.pages.ArrearsManualSalaryHeadWiseAsSalaryComponent;
import com.spp.pages.CheckArrearsRedirectToMasterModule;
import com.spp.pages.CheckArrearsSalaryStructureRedirectToMasterModule;
import com.spp.pages.CheckTheArrearCreated;
import com.spp.pages.CheckifSalaryArrearsGeneralLinkPaymonthsredirectstoCreateNewPaymonthpage;
import com.spp.pages.CheckifSalaryArrearsReportsArrearsReportredirectstoReportsmodule;
import com.spp.pages.ComputationDetailsToAnArrear;
import com.spp.pages.ComputationDetailsToArrear;
import com.spp.pages.ComputationDetailsToArrearWithLumpsumType;
import com.spp.pages.ComputeArrear;
import com.spp.pages.CreateArrear;
import com.spp.pages.CreateArrearAsSalaryComponent;
import com.spp.pages.CreateArrearAsSalaryComponentInPayPart;
import com.spp.pages.CreateArrearAsSalaryComponentRestrictNegative;
import com.spp.pages.CreateArrearAsSalaryComponentRestrictNegativePayPart;
import com.spp.pages.CreateArrearBankAdvicePayPart;
import com.spp.pages.CreateArrearBankAdviceRestrictNegativePayPart;
import com.spp.pages.CreateArrearCashPayPart;
import com.spp.pages.CreateArrearIndependentOfSalaryBankAdvice;
import com.spp.pages.CreateArrearIndependentOfSalaryBankAdviceRestrictNegative;
import com.spp.pages.CreateArrearIndependentOfSalaryCash;
import com.spp.pages.CreateArrearIndependentOfSalaryCashRestrictNegative;
import com.spp.pages.CreateArrearIndependentOfSalaryCashRestrictNegativePayPart;
import com.spp.pages.CreateArrearIndependentOfSalaryInstruments;
import com.spp.pages.CreateArrearIndependentOfSalaryInstrumentsRestrictNegative;
import com.spp.pages.CreateArrearInstrumentsPayPart;
import com.spp.pages.CreateArrearInstrumentsRestrictNegativePayPart;
import com.spp.pages.CreateArrearMergedWithSalaryComponent;
import com.spp.pages.CreateArrearMergedWithSalaryComponentInPayPart;
import com.spp.pages.CreateArrearMergesWithSalaryComponentRestrictNegative;
import com.spp.pages.CreateArrearMergesWithSalaryComponentRestrictNegativePayPart;
import com.spp.pages.CreateArrearNoOfDaysAsSalaryComponent;
import com.spp.pages.CreateArrearNoOfDaysBankAdvice;
import com.spp.pages.CreateArrearNoOfDaysCash;
import com.spp.pages.CreateArrearNoOfDaysDifferenceAsSalaryComponent;
import com.spp.pages.CreateArrearNoOfDaysDifferenceBankAdvice;
import com.spp.pages.CreateArrearNoOfDaysDifferenceCash;
import com.spp.pages.CreateArrearNoOfDaysDifferenceInstruments;
import com.spp.pages.CreateArrearNoOfDaysDifferenceMergedWithSalaryComponent;
import com.spp.pages.CreateArrearNoOfDaysInstruments;
import com.spp.pages.CreateArrearNoOfDaysMergedWithSalaryComponent;
import com.spp.pages.CreateArrearsManualLumpsumBankAdvice;
import com.spp.pages.CreateArrearsManualLumpsumCash;
import com.spp.pages.CreateArrearsManualLumpsumInstruments;
import com.spp.pages.CreateArrearsManualSalaryHeadWisInstruments;
import com.spp.pages.CreateArrearsManualSalaryHeadWiseBankAdvice;
import com.spp.pages.CreateArrearsManualSalaryHeadWiseCash;
import com.spp.pages.CreateArrearsManualSalaryHeadWiseMergedWithSalaryComponent;
import com.spp.pages.DeleteArrear;
import com.spp.pages.DeleteComputationDetails;
import com.spp.pages.EditArrear;


public class Arrears extends BaseTest{

	@Test(priority=0)
	public void ArrearsManualSalaryHeadWiseAsSalaryComponent_SC_132() throws InterruptedException{
		ArrearsManualSalaryHeadWiseAsSalaryComponent cc=new ArrearsManualSalaryHeadWiseAsSalaryComponent(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary Arrears");
		cc.ClickManualCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectPaymonth("Apr/2013");
		cc.ClickAdvancedSettingsTab();
		cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		cc.selectDeleteButton();
		
}
	@Test(priority=1)
	public void ArrearsManualLumpsumAsSalaryComponent_SC_134() throws InterruptedException{
		ArrearsManualLumpsumAsSalaryComponent cc=new ArrearsManualLumpsumAsSalaryComponent(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		cc.EnterArrearDescription("Salary Arrears");
		cc.ClickManualCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectPaymonth("Apr/2013");
		cc.ClickAdvancedSettingsTab();
		cc.ClickStatutory();
		cc.ClickConsiderforCalc();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		cc.selectDeleteButton();
}
	
	

 @Test(priority=2)
	public void CreateArrearAsSalaryComponent_SC_509() throws InterruptedException{
		CreateArrearAsSalaryComponent cc=new CreateArrearAsSalaryComponent(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickAdvancedSettingsTab();
		cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		cc.selectDeleteButton();
		
  	}
  @Test(priority=3)
 	public void CreateArrearMergedWithSalaryComponent_SC_510() throws InterruptedException{
	  CreateArrearMergedWithSalaryComponent cc=new CreateArrearMergedWithSalaryComponent(driver);
 		cc.clickSalaryLink();
 		cc.selectArrears();
 		cc.selectCreateArrear();
 		cc.EnterArrearName("Salary_Arrear");
 		//cc.EnterArrearName("new_"+num);
 		cc.EnterArrearDescription("Salary_Arrear");
 		cc.ClickAutomationCheckBox();
 		cc.selectArrearFrom("Apr/2013");
 		cc.selectArrearTo("Apr/2013");
 		Thread.sleep(3000);
 		cc.selectRefMonth("Apr/2013");
 		cc.selectPaymonth("Apr/2013");
 		cc.ClickMergedWithSalary();
 		cc.ClickAdvancedSettingsTab();
 		Thread.sleep(2000);
 		//cc.ClickStatutory();
 		cc.ClickCreateButton();
 		String t=cc.getMessage();
 		Assert.assertEquals(t, "Arrear was successfully created.");
 		cc.selectDeleteButton();

  } 
  @Test(priority=4)
	public void CreateArrearIndependentOfSalaryCash_SC_511() throws InterruptedException{
	  CreateArrearIndependentOfSalaryCash cc=new CreateArrearIndependentOfSalaryCash(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickIndependentOfSalary();
		cc.ClickCash();
		cc.ClickAdvancedSettingsTab();
		cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		cc.selectDeleteButton();

}
  
  @Test(priority=5)
	public void CreateArrearIndependentOfSalaryInstruments_SC_512() throws InterruptedException{
	  CreateArrearIndependentOfSalaryInstruments cc=new CreateArrearIndependentOfSalaryInstruments(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickIndependentOfSalary();
		cc.ClickInstruments();
		cc.ClickAdvancedSettingsTab();
		cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		cc.selectDeleteButton();
  
}
		@Test(priority=6)
public void CreateArrearIndependentOfSalaryBankAdvice_SC_513() throws InterruptedException{
	  CreateArrearIndependentOfSalaryBankAdvice cc=new CreateArrearIndependentOfSalaryBankAdvice(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickIndependentOfSalary();
		cc.ClickBankAdvice();
		cc.ClickAdvancedSettingsTab();
		cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		cc.selectDeleteButton();
}  
@Test(priority=7)
public void CreateArrearNoOfDaysAsSalaryComponent_SC_514() throws InterruptedException{
	  CreateArrearNoOfDaysAsSalaryComponent cc=new CreateArrearNoOfDaysAsSalaryComponent(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.ClickNoOfDays();
		cc.ClickNumber("5");
		cc.selectArrearFrom("Apr/2013");
		//cc.selectArrearTo("Apr/2013");
		//Thread.sleep(3000);
		//cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickAdvancedSettingsTab();
		cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		cc.selectDeleteButton();
} 
	@Test(priority=8)
	public void CreateArrearNoOfDaysMergedWithSalaryComponent_SC_515() throws InterruptedException{
		CreateArrearNoOfDaysMergedWithSalaryComponent cc=new CreateArrearNoOfDaysMergedWithSalaryComponent(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.ClickNoOfDays();
		cc.ClickNumber("10");
		cc.selectArrearFrom("Apr/2013");
		//cc.selectArrearTo("Apr/2013");
		//Thread.sleep(3000);
		//cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickMergedWithSalary();
		cc.ClickAdvancedSettingsTab();
		Thread.sleep(2000);
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		cc.selectDeleteButton();
}
	@Test(priority=9)
	public void CreateArrearNoOfDaysDifferenceAsSalaryComponent_SC_516() throws InterruptedException{
		CreateArrearNoOfDaysDifferenceAsSalaryComponent cc=new CreateArrearNoOfDaysDifferenceAsSalaryComponent(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.ClickNoOfDays();
		cc.ClickNumber("10");
		cc.selectArrearFrom("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickAdvancedSettingsTab();
		Thread.sleep(2000);
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		cc.selectDeleteButton();
}
	@Test(priority=10)
	public void CreateArrearNoOfDaysDifferenceMergedWithSalaryComponent_SC_517() throws InterruptedException{
		CreateArrearNoOfDaysDifferenceMergedWithSalaryComponent cc=new CreateArrearNoOfDaysDifferenceMergedWithSalaryComponent(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickMergedWithSalary();
		cc.ClickAdvancedSettingsTab();
		Thread.sleep(2000);
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		cc.selectDeleteButton();
}

	@Test(priority=11)
	public void CreateArrearAsSalaryComponentRestrictNegative_SC_518() throws InterruptedException{
		CreateArrearAsSalaryComponentRestrictNegative cc=new CreateArrearAsSalaryComponentRestrictNegative(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickRestrictNegative();
		cc.ClickAdvancedSettingsTab();
		Thread.sleep(2000);
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		cc.selectDeleteButton();
}
	@Test(priority=12)
	public void CreateArrearMergesWithSalaryComponentRestrictNegative_SC_519() throws InterruptedException{
		CreateArrearMergesWithSalaryComponentRestrictNegative cc=new CreateArrearMergesWithSalaryComponentRestrictNegative(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickMergedWithSalary();
		cc.ClickRestrictNegative();
		cc.ClickAdvancedSettingsTab();
		Thread.sleep(2000);
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		cc.selectDeleteButton();
}

	@Test(priority=13)
	public void CreateArrearAsSalaryComponentInPayPart_SC_520() throws InterruptedException{
		CreateArrearAsSalaryComponentInPayPart cc=new CreateArrearAsSalaryComponentInPayPart(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickPayPart();
		cc.ClickNumber("2");
		cc.ClickAdvancedSettingsTab();
		Thread.sleep(2000);
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		cc.selectDeleteButton();
}
	@Test(priority=14)
	public void CreateArrearMergedWithSalaryComponentInPayPart_SC_521() throws InterruptedException{
		CreateArrearMergedWithSalaryComponentInPayPart cc=new CreateArrearMergedWithSalaryComponentInPayPart(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickMergedWithSalary();
		cc.ClickPayPart();
		cc.ClickNumber("2");
		cc.ClickAdvancedSettingsTab();
		Thread.sleep(2000);
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		cc.selectDeleteButton();

	}
	@Test(priority=15)
	public void CreateArrearAsSalaryComponentRestrictNegativePayPart_SC_522() throws InterruptedException{
		CreateArrearAsSalaryComponentRestrictNegativePayPart cc=new CreateArrearAsSalaryComponentRestrictNegativePayPart(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickRestrictNegative();
		cc.ClickPayPart();
		cc.EnterNumber("2");
		cc.ClickAdvancedSettingsTab();
		Thread.sleep(2000);
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}		
	@Test(priority=16)
public void CreateArrearMergesWithSalaryComponentRestrictNegativePayPart_SC_523() throws InterruptedException{
	CreateArrearMergesWithSalaryComponentRestrictNegativePayPart cc=new CreateArrearMergesWithSalaryComponentRestrictNegativePayPart(driver);
	cc.clickSalaryLink();
	cc.selectArrears();
	cc.selectCreateArrear();
	cc.EnterArrearName("Salary_Arrear");
	//cc.EnterArrearName("new_"+num);
	cc.EnterArrearDescription("Salary_Arrear");
	cc.ClickAutomationCheckBox();
	cc.selectArrearFrom("Apr/2013");
	cc.selectArrearTo("Apr/2013");
	Thread.sleep(3000);
	cc.selectRefMonth("Apr/2013");
	cc.selectPaymonth("Apr/2013");
	cc.ClickMergedWithSalary();
	cc.ClickRestrictNegative();
	cc.ClickPayPart();
	cc.ClickNumber("2");
	cc.ClickAdvancedSettingsTab();
	Thread.sleep(2000);
	//cc.ClickStatutory();
	cc.ClickCreateButton();
	String t=cc.getMessage();
	Assert.assertEquals(t, "Arrear was successfully created.");
	Thread.sleep(3000);
	cc.selectDeleteButton();
}
	@Test(priority=17)
	public void CreateArrearIndependentOfSalaryCashRestrictNegative_SC_524() throws InterruptedException{
	  CreateArrearIndependentOfSalaryCashRestrictNegative cc=new CreateArrearIndependentOfSalaryCashRestrictNegative(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickRestrictNegative();
		cc.ClickIndependentOfSalary();
		cc.ClickCash();
		cc.ClickAdvancedSettingsTab();
		cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}	
	
	@Test(priority=18)
	public void CreateArrearIndependentOfSalaryInstrumentsRestrictNegative_SC_525() throws InterruptedException{
	  CreateArrearIndependentOfSalaryInstrumentsRestrictNegative cc=new CreateArrearIndependentOfSalaryInstrumentsRestrictNegative(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickRestrictNegative();
		cc.ClickIndependentOfSalary();
		cc.ClickInstruments();
		cc.ClickAdvancedSettingsTab();
		cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
  }
	
	@Test(priority=19)
	public void CreateArrearIndependentOfSalaryBankAdviceRestrictNegative_SC_526() throws InterruptedException{
		  CreateArrearIndependentOfSalaryBankAdviceRestrictNegative cc=new CreateArrearIndependentOfSalaryBankAdviceRestrictNegative(driver);
			cc.clickSalaryLink();
			cc.selectArrears();
			cc.selectCreateArrear();
			cc.EnterArrearName("Salary_Arrear");
			//cc.EnterArrearName("new_"+num);
			cc.EnterArrearDescription("Salary_Arrear");
			cc.ClickAutomationCheckBox();
			cc.selectArrearFrom("Apr/2013");
			cc.selectArrearTo("Apr/2013");
			Thread.sleep(3000);
			cc.selectRefMonth("Apr/2013");
			cc.selectPaymonth("Apr/2013");
			cc.ClickRestrictNegative();
			cc.ClickIndependentOfSalary();
			cc.ClickBankAdvice();
			cc.ClickAdvancedSettingsTab();
			cc.ClickStatutory();
			cc.ClickCreateButton();
			String t=cc.getMessage();
			Assert.assertEquals(t, "Arrear was successfully created.");
			Thread.sleep(3000);
			cc.selectDeleteButton();
	}  	
	
	@Test(priority=20)
	public void CreateArrearCashPayPart_SC_527() throws InterruptedException{
		CreateArrearCashPayPart cc=new CreateArrearCashPayPart(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickPayPart();
		cc.ClickNumber("2");
		cc.ClickIndependentOfSalary();
		cc.ClickCash();
		cc.ClickAdvancedSettingsTab();
		Thread.sleep(2000);
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}
	
	@Test(priority=21)
	public void CreateArrearInstrumentsPayPart_SC_528() throws InterruptedException{
		CreateArrearInstrumentsPayPart cc=new CreateArrearInstrumentsPayPart(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickPayPart();
		cc.ClickNumber("2");
		cc.ClickIndependentOfSalary();
		cc.ClickInstruments();
		cc.ClickAdvancedSettingsTab();
		Thread.sleep(2000);
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}
	
	@Test(priority=22)
	public void CreateArrearBankAdvicePayPart_SC_529() throws InterruptedException{
		CreateArrearBankAdvicePayPart cc=new CreateArrearBankAdvicePayPart(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickPayPart();
		cc.ClickNumber("2");
		cc.ClickIndependentOfSalary();
		cc.ClickBankAdvice();
		cc.ClickAdvancedSettingsTab();
		Thread.sleep(2000);
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}	
	@Test(priority=23)
	public void CreateArrearIndependentOfSalaryCashRestrictNegativePayPart_SC_530() throws InterruptedException{
	  CreateArrearIndependentOfSalaryCashRestrictNegativePayPart cc=new CreateArrearIndependentOfSalaryCashRestrictNegativePayPart(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickRestrictNegative();
		cc.ClickPayPart();
		cc.ClickNumber("2");
		cc.ClickIndependentOfSalary();
		cc.ClickCash();
		cc.ClickAdvancedSettingsTab();
		cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}	
	@Test(priority=24)
	public void CreateArrearInstrumentsRestrictNegativePayPart_SC_531() throws InterruptedException{
	  CreateArrearInstrumentsRestrictNegativePayPart cc=new CreateArrearInstrumentsRestrictNegativePayPart(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickRestrictNegative();
		cc.ClickPayPart();
		cc.ClickNumber("2");
		cc.ClickIndependentOfSalary();
		cc.ClickInstruments();
		cc.ClickAdvancedSettingsTab();
		cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
  }	
	@Test(priority=25)
	public void CreateArrearBankAdviceRestrictNegativePayPart_SC_532() throws InterruptedException{
		  CreateArrearBankAdviceRestrictNegativePayPart cc=new CreateArrearBankAdviceRestrictNegativePayPart(driver);
			cc.clickSalaryLink();
			cc.selectArrears();
			cc.selectCreateArrear();
			cc.EnterArrearName("Salary_Arrear");
			//cc.EnterArrearName("new_"+num);
			cc.EnterArrearDescription("Salary_Arrear");
			cc.ClickAutomationCheckBox();
			cc.selectArrearFrom("Apr/2013");
			cc.selectArrearTo("Apr/2013");
			Thread.sleep(3000);
			cc.selectRefMonth("Apr/2013");
			cc.selectPaymonth("Apr/2013");
			cc.ClickRestrictNegative();
			cc.ClickPayPart();
			cc.ClickNumber("2");
			cc.ClickIndependentOfSalary();
			cc.ClickBankAdvice();
			cc.ClickAdvancedSettingsTab();
			cc.ClickStatutory();
			cc.ClickCreateButton();
			String t=cc.getMessage();
			Assert.assertEquals(t, "Arrear was successfully created.");
			Thread.sleep(3000);
			cc.selectDeleteButton();
	}
	@Test(priority=26)
	public void CreateArrearNoOfDaysCashSC_533() throws InterruptedException{
		CreateArrearNoOfDaysCash cc=new CreateArrearNoOfDaysCash(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.ClickNoOfDays();
		cc.ClickNumber("10");
		cc.selectArrearFrom("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickIndependentOfSalary();
		cc.ClickCash();
		cc.ClickAdvancedSettingsTab();
		Thread.sleep(2000);
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}
	@Test(priority=27)
	public void CreateArrearNoOfDaysInstruments_534() throws InterruptedException{
		CreateArrearNoOfDaysInstruments cc=new CreateArrearNoOfDaysInstruments(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.ClickNoOfDays();
		cc.ClickNumber("10");
		cc.selectArrearFrom("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickIndependentOfSalary();
		cc.ClickInstruments();
		cc.ClickAdvancedSettingsTab();
		Thread.sleep(2000);
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}		
	@Test(priority=28)
	public void CreateArrearNoOfDaysBankAdvice_535() throws InterruptedException{
		CreateArrearNoOfDaysBankAdvice cc=new CreateArrearNoOfDaysBankAdvice(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.ClickNoOfDays();
		cc.ClickNumber("10");
		cc.selectArrearFrom("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickIndependentOfSalary();
		cc.ClickBankAdvice();
		cc.ClickAdvancedSettingsTab();
		Thread.sleep(2000);
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}
	@Test(priority=29)
	public void CreateArrearNoOfDaysDifferenceCash_SC_536() throws InterruptedException{
		CreateArrearNoOfDaysDifferenceCash cc=new CreateArrearNoOfDaysDifferenceCash(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.ClickNoOfDays();
		cc.ClickNumber("10");
		cc.ClickDifference();
		cc.selectArrearFrom("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.selectRefMonth("Apr/2013");
		cc.ClickIndependentOfSalary();
		cc.ClickCash();
		cc.ClickAdvancedSettingsTab();
		Thread.sleep(2000);
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}
	@Test(priority=30)
	public void CreateArrearNoOfDaysDifferenceInstruments_537() throws InterruptedException{
		CreateArrearNoOfDaysDifferenceInstruments cc=new CreateArrearNoOfDaysDifferenceInstruments(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.ClickNoOfDays();
		cc.ClickNumber("10");
		cc.ClickDifference();
		cc.selectArrearFrom("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.selectRefMonth("Apr/2013");
		cc.ClickIndependentOfSalary();
		cc.ClickInstruments();
		cc.ClickAdvancedSettingsTab();
		Thread.sleep(2000);
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}		
	@Test(priority=31)
	public void CreateArrearNoOfDaysDifferenceBankAdvice_538() throws InterruptedException{
		CreateArrearNoOfDaysDifferenceBankAdvice cc=new CreateArrearNoOfDaysDifferenceBankAdvice(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickAutomationCheckBox();
		cc.ClickNoOfDays();
		cc.ClickNumber("10");
		cc.ClickDifference();
		cc.selectArrearFrom("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.selectRefMonth("Apr/2013");
		cc.ClickIndependentOfSalary();
		cc.ClickBankAdvice();
		cc.ClickAdvancedSettingsTab();
		Thread.sleep(2000);
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}
	@Test(priority=32)
	public void CreateArrearsManualSalaryHeadWiseMergedWithSalaryComponent_SC_539() throws InterruptedException{
		CreateArrearsManualSalaryHeadWiseMergedWithSalaryComponent cc=new CreateArrearsManualSalaryHeadWiseMergedWithSalaryComponent(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickManualCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectPaymonth("Apr/2013");
		cc.ClickMergedWithSalary();
		cc.ClickAdvancedSettingsTab();
		//cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}
	@Test(priority=33)
	public void CreateArrearsManualSalaryHeadWiseCash_SC_540() throws InterruptedException{
		CreateArrearsManualSalaryHeadWiseCash cc=new CreateArrearsManualSalaryHeadWiseCash(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickManualCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectPaymonth("Apr/2013");
		cc.ClickIndependentOfSalary();
		cc.ClickCash();
		cc.ClickAdvancedSettingsTab();
		cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}
	@Test(priority=34)
	public void CreateArrearsManualSalaryHeadWisInstruments_SC_541() throws InterruptedException{
		CreateArrearsManualSalaryHeadWisInstruments cc=new CreateArrearsManualSalaryHeadWisInstruments(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickManualCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectPaymonth("Apr/2013");
		cc.ClickIndependentOfSalary();
		cc.ClickInstruments();
		cc.ClickAdvancedSettingsTab();
		cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}
	@Test(priority=35)
	public void CreateArrearsManualSalaryHeadWiseBankAdvice_SC_542() throws InterruptedException{
		CreateArrearsManualSalaryHeadWiseBankAdvice cc=new CreateArrearsManualSalaryHeadWiseBankAdvice(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickManualCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectPaymonth("Apr/2013");
		cc.ClickIndependentOfSalary();
		cc.ClickBankAdvice();
		cc.ClickAdvancedSettingsTab();
		cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}
	@Test(priority=36)
	public void CreateArrearsManualLumpsumCash_SC_543() throws InterruptedException{
		CreateArrearsManualLumpsumCash cc=new CreateArrearsManualLumpsumCash(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickManualCheckBox();
		cc.ClickLumpsum();		
		cc.selectArrearFrom("Apr/2013");
		Thread.sleep(3000);
		cc.selectPaymonth("Apr/2013");
		cc.ClickIndependentOfSalary();
		cc.ClickCash();
		cc.ClickAdvancedSettingsTab();
		cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}
	@Test(priority=37)
	public void CreateArrearsManualLumpsumInstruments_SC_544() throws InterruptedException{
		CreateArrearsManualLumpsumInstruments cc=new CreateArrearsManualLumpsumInstruments(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickManualCheckBox();
		cc.ClickLumpsum();		
		cc.selectArrearFrom("Apr/2013");
		Thread.sleep(3000);
		cc.selectPaymonth("Apr/2013");
		cc.ClickIndependentOfSalary();
		cc.ClickInstruments();
		cc.ClickAdvancedSettingsTab();
		cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}
	@Test(priority=38)
	public void CreateArrearsManualLumpsumBankAdvice_SC_545() throws InterruptedException{
		CreateArrearsManualLumpsumBankAdvice cc=new CreateArrearsManualLumpsumBankAdvice(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear");
		//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		cc.ClickManualCheckBox();
		cc.ClickLumpsum();		
		cc.selectArrearFrom("Apr/2013");
		Thread.sleep(3000);
		cc.selectPaymonth("Apr/2013");
		cc.ClickIndependentOfSalary();
		cc.ClickBankAdvice();
		cc.ClickAdvancedSettingsTab();
		cc.ClickStatutory();
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
		Thread.sleep(3000);
		cc.selectDeleteButton();
}

	@Test(priority=39)
	public void CreateArrear_SC_335() throws InterruptedException{
		CreateArrear cc=new CreateArrear(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("Salary_Arrear1");
	//cc.EnterArrearName("new_"+num);
		cc.EnterArrearDescription("Salary_Arrear");
		//cc.ClickManualCheckBox();
		cc.selectArrearFrom("Apr/2013");
		cc.selectArrearTo("Apr/2013");
		Thread.sleep(3000);
		cc.selectArrearRefMonth("Apr/2013");
		cc.selectPaymonth("Apr/2013");
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
}

	@Test(priority=40)
	public void EditArrear_SC_546() throws InterruptedException{
		EditArrear cc=new EditArrear(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectEditArrear();
		cc.EnterArrearName("Salary_Arrear");
		cc.ClickUpdateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully updated.");
}
	@Test(priority=41)
	public void DeleteArrear_SC_547() throws InterruptedException{
		DeleteArrear cc=new DeleteArrear(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectDelete();
		cc.switchToPopUpAndDismiss();
		Thread.sleep(1000);
		cc.selectDelete();
		cc.switchToPopUpAndAccept(driver);
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear deleted successfully");
}
	
	@Test(priority=42)
	public void CheckArrearsRedirectToMasterModule_SC_502() throws InterruptedException{
	CheckArrearsRedirectToMasterModule cc=new CheckArrearsRedirectToMasterModule(driver);
	cc.clickSalaryLink();
	cc.selectArrears();
	cc.selectGeneralLink();
	Thread.sleep(2000);
	cc.EnterSalaryHead();
	cc.ClickAddNewSalaryHead();
	cc.EnterHeadName("Work");
	cc.EnterShortName("W");
	cc.ClickCreateButton();
	String y=cc.getMessage();
	Assert.assertEquals(y, "Salary head successfully created");
	cc.ClickDelete();
	}
	@Test(priority=43)
	public void CheckArrearsSalaryStructureRedirectToMasterModule_SC_503() throws Exception{
	CheckArrearsSalaryStructureRedirectToMasterModule cc=new CheckArrearsSalaryStructureRedirectToMasterModule(driver);
	cc.clickSalaryLink();
	cc.selectArrears();
	cc.selectGeneralLink();
	Thread.sleep(2000);
	cc.EnterSalaryStructure();
	cc.ClickNewSalaryStructure();
	cc.EnterStructureName("Structure1");
	cc.ClickCreateButton();
	String y=cc.getMessage();
	Assert.assertEquals(y, "Salary group successfully created");
	Thread.sleep(3000);
	cc.navigateMaster();
	cc.clickSalaryStructureLink();
	Thread.sleep(2000);
	cc.ClickDelete();
	
}
	

/*	@Test(priority=44)
	public void CheckifSalaryArrearsGeneralLinkPaymonthsredirectstoCreateNewPaymonthpage_SC_501() throws Exception {
		CheckifSalaryArrearsGeneralLinkPaymonthsredirectstoCreateNewPaymonthpage lp=new CheckifSalaryArrearsGeneralLinkPaymonthsredirectstoCreateNewPaymonthpage(driver);
		lp.clickonsalary();
		lp.selectArrears();
		lp.clickongenerallinks();
		Thread.sleep(2000);
		lp.clickonpaymonths();	
		lp.createpaymonth();
		Thread.sleep(2000);
		lp.ClickDelete();
		Thread.sleep(2000);
		lp.DeleteConfirm();
	}*/
	
	
	/*@Test(priority=47)  
	public void DeleteComputationDetails_SC_555() throws InterruptedException{
		DeleteComputationDetails cc=new DeleteComputationDetails(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectComputation();   //take data according to SC-540
		Thread.sleep(3000);
		cc.SelectAddEmployee();
		Thread.sleep(3000);
		cc.ClickLoad();
		Thread.sleep(3000);
		String t=cc.getMessage1();
		Assert.assertEquals(t, "Employees Added Successfully.");
		cc.ClickSelectAll();
		Thread.sleep(2000);
		cc.ClickEmployee();
		cc.ClickSave();
		cc.ClickDelete();
		cc.switchToPopUpAndDismiss(driver);
		cc.ClickDelete();
		cc.switchToPopUpAndAccept(driver);
		
}
	@Test(priority=0)
	public void ComputationDetailsToAnArrearSC539_SC_548() throws InterruptedException{
		ComputationDetailsToAnArrear cc=new ComputationDetailsToAnArrear(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectComputation();  //take data according to SC-539
		Thread.sleep(3000);
		cc.SelectAddEmployee();
		Thread.sleep(3000);
		cc.ClickLoad();
		Thread.sleep(3000);
//		String t=cc.getMessage1();
//		Assert.assertEquals(t, "Employees Added Successfully.");
//		cc.ClickSelectAll();
//		Thread.sleep(2000);
//		cc.ClickEmployee();
		cc.ClickSave();
		Thread.sleep(2000);
		cc.ClickMore();
		Thread.sleep(2000);
		cc.selectBasic("1000");
		cc.selectLeave("200");
		cc.ClickUpdate();
		Thread.sleep(3000);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectComputation();
		
}
@Test(priority=1)  
	public void ComputationDetailsToAnArrearSC540_SC_549() throws InterruptedException{
		ComputationDetailsToAnArrear cc=new ComputationDetailsToAnArrear(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectComputation();   //take data according to SC-540
		Thread.sleep(3000);
		cc.SelectAddEmployee();
		Thread.sleep(3000);
		cc.ClickLoad();
		Thread.sleep(3000);
//		String t=cc.getMessage1();
//		Assert.assertEquals(t, "Employees Added Successfully.");
//		cc.ClickSelectAll();
//		Thread.sleep(2000);
//		cc.ClickEmployee();
		cc.ClickSave();
		Thread.sleep(3000);
		cc.ClickMore();
		Thread.sleep(2000);
		cc.selectBasic("1000");
		cc.selectLeave("200");
		cc.ClickUpdate();
		Thread.sleep(3000);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectComputation();
		
}
/*	@Test(priority=1)  
	public void CheckTheArrearCreated_SC_337() throws InterruptedException{
		CheckTheArrearCreated cc=new CheckTheArrearCreated(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectComputation(); 
}
	@Test(priority=1) 
	public void CheckifSalaryArrearsReportsArrearsReportredirectstoReportsmodule_SC_500() throws InterruptedException {
		CheckifSalaryArrearsReportsArrearsReportredirectstoReportsmodule cs=new CheckifSalaryArrearsReportsArrearsReportredirectstoReportsmodule(driver);
		cs.clickonsalary();
		cs.selectArrears();
		Thread.sleep(2000);
		cs.clickonreports();
		cs.clickonarrearreport();
		Thread.sleep(2000);
		cs.selectreporttype("Arrear Salary Report");
		cs.selectpaymonth("Apr/2013");
		cs.getemployees();
		Thread.sleep(3000);
		cs.clickonload();
		Thread.sleep(3000);
		cs.selectemployee();
		cs.generatereport();
	}
	
	/*@Test(priority=2)
	public void ComputationDetailsToArrear_SC_133() throws InterruptedException{
		ComputationDetailsToArrear cc=new ComputationDetailsToArrear(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectComputaion();
		cc.EnterAddEmployee();
		Thread.sleep(4000);
		cc.ClickLoad();
		Thread.sleep(3000);
		String y=cc.getMessage();
		Assert.assertEquals(y, "Employees Added Successfully.");
		Thread.sleep(4000);
		cc.ClickSave();
		cc.ClickMoreLink();
		cc.EnterBasic("200");
		Thread.sleep(3000);
		cc.EnterDearnessAllowance("100");
		cc.UpdateButton();
		Thread.sleep(4000);
		cc.ClickEmployee();
		
}
		@Test(priority=3)
	public void ComputationDetailsToArrearWithLumpsumType_SC_135() throws InterruptedException{
		ComputationDetailsToArrearWithLumpsumType cc=new ComputationDetailsToArrearWithLumpsumType(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectComputaion();
		cc.EnterAddEmployee();
		Thread.sleep(4000);
		cc.ClickLoad();
		Thread.sleep(3000);
		String y=cc.getMessage();
		Assert.assertEquals(y, "Employees Added Successfully.");
		Thread.sleep(4000);
		cc.ClickSave();
		cc.ClickMoreLink();
		cc.EnterBasic("200");
		Thread.sleep(3000);
		cc.EnterDearnessAllowance("100");
		cc.UpdateButton();
		Thread.sleep(4000);
		cc.ClickEmployee();
}
	
	@Test(priority=5)
	public void ComputeArrear_SC_336() throws InterruptedException{
	ComputeArrear cc=new ComputeArrear(driver);
	cc.clickSalaryLink();
	cc.selectArrears();
	cc.selectComputation();
	cc.EnterAddEmployee();
	Thread.sleep(4000);
	cc.ClickLoad();
	Thread.sleep(3000);
	cc.ClickSave();
	String y=cc.getMessage();
	Assert.assertEquals(y, "Employees Added Successfully.");
} 
	*/
	
}