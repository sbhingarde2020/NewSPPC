package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

//import com.spp.UpdateBonus;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.*;

public class Bonus extends BaseTest{
	@Test(priority=0)
	public void AddNewBonusDefinitionForFormula_SC_340() throws Exception{
		AddNewBonusDefinitionForFormula cb=new AddNewBonusDefinitionForFormula(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Holi");
		cb.EnterMaxBonus("5000");
		cb.SelectFormula("Bonus");
		cb.SelectFromMonth("Mar/2019");
		cb.SelectToMonth("Mar/2019");
		cb.SelectPaymonth("Mar/2019");
		cb.checksalarydependent();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
	//	cb.clickDeleteButton();
	//	cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=1)
 	public void ComputeBonus_SC_341() throws Exception{
		ComputeBonus sh=new ComputeBonus(driver);
		sh.clickSalary();
		sh.selectBonus();
		sh.clickCompute();
		Thread.sleep(2000);
		sh.resizeWindow();
		Thread.sleep(2000);
		sh.clickonfilter();
		Thread.sleep(2000);
		sh.clickonload();
		Thread.sleep(2000);
		sh.exitFullscreen();
		Thread.sleep(2000);
		//sh.clickonedit();
		//sh.enterbonusamount("2000");
		//sh.clickonupdatebutton();		
	}
	@Test(priority=2)
 	public void CheckBonusInGeneratedReport_SC_349() throws Exception{
		CheckBonusInGeneratedReport sh=new CheckBonusInGeneratedReport(driver);
		sh.clickReport();
		sh.selectBonusReport();
		sh.clickReports("Bonus Details");
		sh.clickMonthYear("Mar/2019");
		sh.clickGetEmployee();
		Thread.sleep(2000);
		sh.resizeWindow();
		Thread.sleep(2000);
		sh.clickGetLoad();
		Thread.sleep(3000);
		sh.clickOnCheckbox();
		sh.clickGetGenerateReport();
		sh.exitFullscreen();
		Thread.sleep(2000);
}
	@Test(priority=3)
 	public void UpdateBonus_SC_402() throws Exception{
		UpdateBonus sh=new UpdateBonus(driver);
		sh.clickSalary();
		sh.selectBonus();
		sh.resizeWindow();
		Thread.sleep(2000);
		sh.clickCompute();
		sh.clickonedit();
		sh.enterbonusamount("2000");
		sh.clickonupdatebutton();
		sh.exitFullscreen();
		Thread.sleep(2000);
		}
	@Test(priority=4)
 	public void DeleteBonus_SC_403() throws Exception{
		DeleteBonus sh=new DeleteBonus(driver);
		sh.clickSalary();
		sh.selectBonus();
		sh.resizeWindow();
		Thread.sleep(2000);
		sh.clickCompute();
//		sh.selectAddEmployee();
//		Thread.sleep(3000);
//		sh.clickLoad();
//		Thread.sleep(3000);
		sh.clickDelete1();
		sh.switchToPopUpAndAccept(driver);
		sh.clickDelete();
		sh.switchToPopUpAndDismiss(driver);
		sh.clickDelete();
		sh.switchToPopUpAndAccept(driver);
		sh.exitFullscreen();
		Thread.sleep(2000);
	}
	@Test(priority=5)
	public void EditBonusDefinition_SC_636() throws Exception{
		EditBonusDefinition ed=new EditBonusDefinition(driver);
		ed.clickSalary();
		ed.selectBonus();
		ed.resizeWindow();
		Thread.sleep(2000);
		ed.clickonedit();
		ed.editmaxbonusamt("5000");
		ed.updatebonus();
		String t=ed.getmessage();
		Assert.assertEquals(t, "Bonus successfully updated");
		ed.exitFullscreen();
		Thread.sleep(2000);
	}
	@Test(priority=6)
	public void DeleteBonusDefinition_SC_637() throws Exception{
		DeleteBonusDefinition de=new DeleteBonusDefinition(driver);
		de.clickSalary();
		de.selectBonus();
		de.resizeWindow();
		Thread.sleep(2000);
		de.clickondelete();
		de.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		de.clickondelete();
		de.switchToPopUpAndAccept(driver);
		String t=de.getmessage();
		Assert.assertEquals(t, "Bonus successfully deleted");
		de.exitFullscreen();
		Thread.sleep(2000);
	}
	/*@Test(priority=7)
 	public void AddNewBonusDefinition_SC_638() throws Exception{
		AddNewBonusDefinition sh=new AddNewBonusDefinition(driver);
		sh.clickSalary();
		sh.selectBonus();
		sh.clickAddNewBonus();
		sh.EnterBonusHead("Holi");
		sh.clickManual();
		sh.EnterMaxBonus("1000");
		sh.SelectFromMonth("Mar/2013");
		sh.SelectToMonth("Apr/2013");
		sh.SelectPaymonth("Apr/2013");
		sh.clickCreateBonus();
		String t=sh.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		sh.clickDeleteButton();
		sh.switchToPopUpAndAccept(driver);
	}*/
	/*@Test(priority=8)
	public void AddNewBonusDefinitionMaxBonus_SC_639() throws Exception{
		AddNewBonusDefinitionMaxBonus cb=new AddNewBonusDefinitionMaxBonus(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Holi");
		cb.EnterMaxBonus("10000");
		cb.SelectFormula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalarydependent();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=9)
	public void CreateBonusDefinitionMaxBonusFormulaConsideremployeeswithminimumworking_SC_640() throws Exception{
		CreateBonusDefinitionMaxBonusFormulaConsideremployeeswithminimumworking cb=new CreateBonusDefinitionMaxBonusFormulaConsideremployeeswithminimumworking(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Holi");
		cb.EnterMaxBonus("10000");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalarydependent();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=10)
	public void CreateBonusDefinitionFormulaConsideremployeeswithminimumworking_SC_641() throws Exception{
		CreateBonusDefinitionFormulaConsideremployeeswithminimumworking cb=new CreateBonusDefinitionFormulaConsideremployeeswithminimumworking(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Holi");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalarydependent();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=11)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingConsideremployeeswithminimumworking_SC_642() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingConsideremployeeswithminimumworking cb=new CreateBonusDefinitionMaxBonusAllowManualEditingConsideremployeeswithminimumworking(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Holi");
		cb.clickManual();
		cb.EnterMaxBonus("5000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalarydependent();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}*/
	/*@Test(priority=12)
	public void CreateBonusDefinitionConsideremployeeswithminimumworking_SC_643() throws Exception{
		CreateBonusDefinitionConsideremployeeswithminimumworking cb=new CreateBonusDefinitionConsideremployeeswithminimumworking(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Holi");
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalarydependent();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		
	}
	@Test(priority=13)
	public void CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingCalculate_SC_644() throws Exception{
		CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingCalculate cb=new CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingCalculate(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Holi");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.checksalarydependent();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	
	@Test(priority=14)
	public void CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingCalculate_SC_645() throws Exception{
		CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingCalculate cb=new CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingCalculate(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Holi");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.checksalarydependent();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	
	@Test(priority=15)
	public void CreateBonusDefinitionFormulaCalculate_SC_647() throws Exception{
		CreateBonusDefinitionFormulaCalculate cb=new CreateBonusDefinitionFormulaCalculate(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Holi");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checkcalculate();
		cb.checksalarydependent();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}*/
	/*@Test(priority=16)
	public void CreateBonusDefinitionFormulaMaxBonusCalculate_SC_648() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculate cb=new CreateBonusDefinitionFormulaMaxBonusCalculate(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Holi");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checkcalculate();
		cb.checksalarydependent();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	
	@Test(priority=17)
	public void AddNewBonusDefinitionFormulaModeofPaymentCash_SC_649() throws Exception{
		AddNewBonusDefinitionFormulaModeofPaymentCash cb=new AddNewBonusDefinitionFormulaModeofPaymentCash(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Holi");
		cb.selectformula("Test Formula");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checkcalculate();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	
	@Test(priority=18)
	public void AddNewBonusDefinitionAllowManualEditingModeofPaymentCash_SC_650() throws Exception{
		AddNewBonusDefinitionAllowManualEditingModeofPaymentCash cb=new AddNewBonusDefinitionAllowManualEditingModeofPaymentCash(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Holi");
		cb.EnterMaxBonus("5000");
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
}
@Test(priority=19)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentCash_SC_651() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentCash cb=new CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentCash(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Holi");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		Thread.sleep(2000);
		cb.checkcalculate();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=20)
	public void CreateBonusDefinitionFormulaCalculateModeofPaymentCash_SC_652() throws Exception{
		CreateBonusDefinitionFormulaCalculateModeofPaymentCash cb=new CreateBonusDefinitionFormulaCalculateModeofPaymentCash(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Holi");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		Thread.sleep(2000);
		cb.checkcalculate();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=21)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentCash_SC_653() throws Exception{
		CreateBonusDefinitionMaxBonusCalculateModeofPaymentCash cb=new CreateBonusDefinitionMaxBonusCalculateModeofPaymentCash(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Holi");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.SelectModeofPayment("CASH");
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=22)
	public void CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingModeofPaymentCash_SC_654() throws Exception{
		CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingModeofPaymentCash cb=new CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingModeofPaymentCash(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Holi");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.SelectModeofPayment("CASH");
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=23)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentCash_SC_655() throws Exception{
		CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentCash cb=new CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentCash(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Navratri");
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=24)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentCash_SC_656() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentCash cb=new CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentCash(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Navratri");
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithminwork();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=25)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentCash_SC_657() throws Exception{
		CreateBonusDefinitionwithminimumworkingModeofPaymentCash cb=new CreateBonusDefinitionwithminimumworkingModeofPaymentCash(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Navratri");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=26)
	public void CreateBonusDefinitionMaxBonusFormulaConsideremployeeswithminimumworkingModeofPaymentCash_SC_658() throws Exception{
		CreateBonusDefinitionMaxBonusFormulaConsideremployeeswithminimumworkingModeofPaymentCash cb=new CreateBonusDefinitionMaxBonusFormulaConsideremployeeswithminimumworkingModeofPaymentCash(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Navratri");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=27)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentCash_SC_659() throws Exception{
		AddNewBonusDefinitionMaxBonusModeofPaymentCash ad=new AddNewBonusDefinitionMaxBonusModeofPaymentCash(driver);
		ad.clickSalary();
		ad.selectBonus();
		ad.clickAddNewBonus();
		ad.EnterBonusHead("Navratri");
		ad.selectformula("Bonus");
		ad.EnterMaxBonus("10000");
		ad.SelectFromMonth("Apr/2013");
		ad.SelectToMonth("Apr/2013");
		ad.SelectPaymonth("Apr/2013");
		ad.checksalaryindependent();
		ad.SelectModeofPayment("CASH");
		ad.checknearestrupee();
		ad.clickCreateBonus();
		String t=ad.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		ad.clickDeleteButton();
		ad.switchToPopUpAndAccept(driver);
	}
	
	@Test(priority=28)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentBankAdvise_SC_660() throws Exception{
		AddNewBonusDefinitionMaxBonusModeofPaymentBankAdvise ad=new AddNewBonusDefinitionMaxBonusModeofPaymentBankAdvise(driver);
		ad.clickSalary();
		ad.selectBonus();
		ad.clickAddNewBonus();
		ad.EnterBonusHead("Navratri");
		ad.selectformula("Bonus");
		ad.EnterMaxBonus("10000");
		ad.SelectFromMonth("Apr/2013");
		ad.SelectToMonth("Apr/2013");
		ad.SelectPaymonth("Apr/2013");
		ad.checksalaryindependent();
		ad.SelectModeofPayment("Bank Advise");
		ad.checknearestrupee();
		ad.clickCreateBonus();
		String t=ad.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		ad.clickDeleteButton();
		ad.switchToPopUpAndAccept(driver);
	}
	@Test(priority=29)
	public void AddNewBonusDefinitionFormulaModeofPaymentBankAdvise_SC_661() throws Exception{
		AddNewBonusDefinitionFormulaModeofPaymentBankAdvise ad=new AddNewBonusDefinitionFormulaModeofPaymentBankAdvise(driver);
		ad.clickSalary();
		ad.selectBonus();
		ad.clickAddNewBonus();
		ad.EnterBonusHead("Navratri");
		ad.selectformula("Bonus");
		ad.SelectFromMonth("Apr/2013");
		ad.SelectToMonth("Apr/2013");
		ad.SelectPaymonth("Apr/2013");
		ad.checksalaryindependent();
		ad.SelectModeofPayment("Bank Advise");
		ad.checknearestrupee();
		ad.clickCreateBonus();
		String t=ad.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		ad.clickDeleteButton();
		ad.switchToPopUpAndAccept(driver);
	}
	@Test(priority=30)
	public void CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingModeofPaymentBankAdvise_SC_662() throws Exception{
		CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingModeofPaymentBankAdvise ad=new CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingModeofPaymentBankAdvise(driver);
		ad.clickSalary();
		ad.selectBonus();
		ad.clickAddNewBonus();
		ad.EnterBonusHead("Navratri");
		ad.selectformula("Bonus");
		ad.EnterMaxBonus("10000");
		ad.SelectFromMonth("Apr/2013");
		ad.SelectToMonth("Apr/2013");
		ad.SelectPaymonth("Apr/2013");
		ad.checksalaryindependent();
		ad.SelectModeofPayment("Bank Advise");
		ad.consideremployeeswithMinWorkingdays();
		ad.checknearestrupee();
		ad.clickCreateBonus();
		String t=ad.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		ad.clickDeleteButton();
		ad.switchToPopUpAndAccept(driver);
	}
	@Test(priority=31)
	public void AddNewBonusDefinitionAllowManualEditingModeofPaymentBankAdvise_SC_663() throws Exception{
		AddNewBonusDefinitionAllowManualEditingModeofPaymentBankAdvise ad=new AddNewBonusDefinitionAllowManualEditingModeofPaymentBankAdvise(driver);
		ad.clickSalary();
		ad.selectBonus();
		ad.clickAddNewBonus();
		ad.EnterBonusHead("Navratri");
		ad.clickManual();
		ad.EnterMaxBonus("10000");
		ad.SelectFromMonth("Apr/2013");
		ad.SelectToMonth("Apr/2013");
		ad.SelectPaymonth("Apr/2013");
		ad.checksalaryindependent();
		ad.SelectModeofPayment("Bank Advise");
		ad.checknearestrupee();
		ad.clickCreateBonus();
		String t=ad.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		ad.clickDeleteButton();
		ad.switchToPopUpAndAccept(driver);
	}
	@Test(priority=32)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentBankAdvise_SC_664() throws Exception{
		CreateBonusDefinitionwithminimumworkingModeofPaymentBankAdvise ad=new CreateBonusDefinitionwithminimumworkingModeofPaymentBankAdvise(driver);
		ad.clickSalary();
		ad.selectBonus();
		ad.clickAddNewBonus();
		ad.EnterBonusHead("Navratri");
		ad.selectformula("Bonus");
		ad.SelectFromMonth("Apr/2013");
		ad.SelectToMonth("Apr/2013");
		ad.SelectPaymonth("Apr/2013");
		ad.checksalaryindependent();
		ad.SelectModeofPayment("Bank Advise");
		ad.consideremployeeswithMinWorkingdays();
		ad.checknearestrupee();
		ad.clickCreateBonus();
		String t=ad.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		ad.clickDeleteButton();
		ad.switchToPopUpAndAccept(driver);
	}
	@Test(priority=33)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentBankAdvise_SC_665() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentBankAdvise ad=new CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentBankAdvise(driver);
		ad.clickSalary();
		ad.selectBonus();
		ad.clickAddNewBonus();
		ad.EnterBonusHead("Navratri");
		ad.selectformula("Bonus");
		ad.EnterMaxBonus("10000");
		ad.SelectFromMonth("Apr/2013");
		ad.SelectToMonth("Apr/2013");
		ad.SelectPaymonth("Apr/2013");
		ad.checksalaryindependent();
		ad.SelectModeofPayment("Bank Advise");
		ad.checkcalculate();
		ad.checknearestrupee();
		ad.clickCreateBonus();
		String t=ad.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		ad.clickDeleteButton();
		ad.switchToPopUpAndAccept(driver);
	}
	@Test(priority=34)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentBankAdvise_SC_666() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentBankAdvise ad=new CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentBankAdvise(driver);
		ad.clickSalary();
		ad.selectBonus();
		ad.clickAddNewBonus();
		ad.EnterBonusHead("Navratri");
		ad.clickManual();
		ad.EnterMaxBonus("10000");
		ad.SelectFromMonth("Apr/2013");
		ad.SelectToMonth("Apr/2013");
		ad.SelectPaymonth("Apr/2013");
		ad.checksalaryindependent();
		ad.SelectModeofPayment("Bank Advise");
		ad.consideremployeeswithminwork();
		ad.checknearestrupee();
		ad.clickCreateBonus();
		String t=ad.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		ad.clickDeleteButton();
		ad.switchToPopUpAndAccept(driver);
	}
	@Test(priority=35)
	public void CreateBonusDefinitionFormulaCalculateModeofPaymentBankAdvise_SC_667() throws Exception{
		CreateBonusDefinitionFormulaCalculateModeofPaymentBankAdvise ad=new CreateBonusDefinitionFormulaCalculateModeofPaymentBankAdvise(driver);
		ad.clickSalary();
		ad.selectBonus();
		ad.clickAddNewBonus();
		ad.EnterBonusHead("Navratri");
		ad.selectformula("Bonus");
		ad.SelectFromMonth("Apr/2013");
		ad.SelectToMonth("Apr/2013");
		ad.SelectPaymonth("Apr/2013");
		ad.checksalaryindependent();
		ad.SelectModeofPayment("Bank Advise");
		ad.checkcalculate();
		ad.checknearestrupee();
		ad.clickCreateBonus();
		String t=ad.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		ad.clickDeleteButton();
		ad.switchToPopUpAndAccept(driver);
	}
	@Test(priority=36)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentBankAdvise_SC_668() throws Exception{
		CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentBankAdvise ad=new CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentBankAdvise(driver);
		ad.clickSalary();
		ad.selectBonus();
		ad.clickAddNewBonus();
		ad.EnterBonusHead("Navratri");
		ad.clickManual();
		ad.SelectFromMonth("Apr/2013");
		ad.SelectToMonth("Apr/2013");
		ad.SelectPaymonth("Apr/2013");
		ad.checksalaryindependent();
		ad.SelectModeofPayment("Bank Advise");
		ad.consideremployeeswithminwork();
		ad.checknearestrupee();
		ad.clickCreateBonus();
		String t=ad.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		ad.clickDeleteButton();
		ad.switchToPopUpAndAccept(driver);
	}
	@Test(priority=37)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentBankAdvise_SC_669() throws Exception{
		CreateBonusDefinitionMaxBonusCalculateModeofPaymentBankAdvise ad=new CreateBonusDefinitionMaxBonusCalculateModeofPaymentBankAdvise(driver);
		ad.clickSalary();
		ad.selectBonus();
		ad.clickAddNewBonus();
		ad.EnterBonusHead("Navratri");
		ad.selectformula("Bonus");
		ad.EnterMaxBonus("10000");
		ad.SelectFromMonth("Apr/2013");
		ad.SelectToMonth("Apr/2013");
		ad.SelectPaymonth("Apr/2013");
		ad.checksalaryindependent();
		ad.SelectModeofPayment("Bank Advise");
		ad.consideremployeeswithMinWorkingdays();
		ad.checkcalculate();
		ad.checknearestrupee();
		ad.clickCreateBonus();
		String t=ad.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		ad.clickDeleteButton();
		ad.switchToPopUpAndAccept(driver);
	}
	@Test(priority=38)
	public void CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingModeofPaymentBankAdvise_SC_670() throws Exception{
		CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingModeofPaymentBankAdvise ad=new CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingModeofPaymentBankAdvise(driver);
		ad.clickSalary();
		ad.selectBonus();
		ad.clickAddNewBonus();
		ad.EnterBonusHead("Navratri");
		ad.selectformula("Bonus");
		ad.SelectFromMonth("Apr/2013");
		ad.SelectToMonth("Apr/2013");
		ad.SelectPaymonth("Apr/2013");
		ad.checksalaryindependent();
		ad.SelectModeofPayment("Bank Advise");
		ad.consideremployeeswithMinWorkingdays();
		ad.checkcalculate();
		ad.checknearestrupee();
		ad.clickCreateBonus();
		String t=ad.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		ad.clickDeleteButton();
		ad.switchToPopUpAndAccept(driver);
	}
	@Test(priority=39)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentCheque_SC_671() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentCheque ad=new CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentCheque(driver);
		ad.clickSalary();
		ad.selectBonus();
		ad.clickAddNewBonus();
		ad.EnterBonusHead("Navratri");
		ad.selectformula("Bonus");
		ad.EnterMaxBonus("10000");
		ad.SelectFromMonth("Apr/2013");
		ad.SelectToMonth("Apr/2013");
		ad.SelectPaymonth("Apr/2013");
		ad.checksalaryindependent();
		ad.SelectModeofPayment("Cheque");
		ad.checkcalculate();
		ad.checknearestrupee();
		ad.clickCreateBonus();
		String t=ad.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		ad.clickDeleteButton();
		ad.switchToPopUpAndAccept(driver);
	}
	@Test(priority=40)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentCheque_SC_672() throws Exception{
		CreateBonusDefinitionwithminimumworkingModeofPaymentCheque ad=new CreateBonusDefinitionwithminimumworkingModeofPaymentCheque(driver);
		ad.clickSalary();
		ad.selectBonus();
		ad.clickAddNewBonus();
		ad.EnterBonusHead("Navratri");
		ad.selectformula("Bonus");
		ad.SelectFromMonth("Apr/2013");
		ad.SelectToMonth("Apr/2013");
		ad.SelectPaymonth("Apr/2013");
		ad.checksalaryindependent();
		ad.SelectModeofPayment("Cheque");
		ad.consideremployeeswithMinWorkingdays();
		ad.checknearestrupee();
		ad.clickCreateBonus();
		String t=ad.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		ad.clickDeleteButton();
		ad.switchToPopUpAndAccept(driver);
	}
	@Test(priority=41)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentCheque_SC_673() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentCheque ad=new CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentCheque(driver);
		ad.clickSalary();
		ad.selectBonus();
		ad.clickAddNewBonus();
		ad.EnterBonusHead("Navratri");
		ad.clickManual();	
		ad.EnterMaxBonus("10000");
		ad.SelectFromMonth("Apr/2013");
		ad.SelectToMonth("Apr/2013");
		ad.SelectPaymonth("Apr/2013");
		ad.checksalaryindependent();
		ad.SelectModeofPayment("Cheque");
		ad.consideremployeeswithminwork();
		ad.checknearestrupee();
		ad.clickCreateBonus();
		String t=ad.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		ad.clickDeleteButton();
		ad.switchToPopUpAndAccept(driver);
	}
	@Test(priority=42)
	public void AddNewBonusDefinitionAllowManualEditingModeofPaymentCheque_SC_674() throws Exception{
		AddNewBonusDefinitionAllowManualEditingModeofPaymentCheque ad=new AddNewBonusDefinitionAllowManualEditingModeofPaymentCheque(driver);
		ad.clickSalary();
		ad.selectBonus();
		ad.clickAddNewBonus();
		ad.EnterBonusHead("Navratri");
		ad.clickManual();	
		ad.EnterMaxBonus("10000");
		ad.SelectFromMonth("Apr/2013");
		ad.SelectToMonth("Apr/2013");
		ad.SelectPaymonth("Apr/2013");
		ad.checksalaryindependent();
		ad.SelectModeofPayment("Cheque");	
		ad.checknearestrupee();
		ad.clickCreateBonus();
		String t=ad.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		ad.clickDeleteButton();
		ad.switchToPopUpAndAccept(driver);
	}
	@Test(priority=43)
	public void CreateBonusDefinitionFormulaCalculateModeofPaymentCheque_SC_675() throws Exception{
		CreateBonusDefinitionFormulaCalculateModeofPaymentCheque ad=new CreateBonusDefinitionFormulaCalculateModeofPaymentCheque(driver);
		ad.clickSalary();
		ad.selectBonus();
		ad.clickAddNewBonus();
		ad.EnterBonusHead("Navratri");
		ad.selectformula("Bonus");
		ad.SelectFromMonth("Apr/2013");
		ad.SelectToMonth("Apr/2013");
		ad.SelectPaymonth("Apr/2013");
		ad.checksalaryindependent();
		ad.SelectModeofPayment("Cheque");	
		ad.checkcalculate();
		ad.checknearestrupee();
		ad.clickCreateBonus();
		String t=ad.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		ad.clickDeleteButton();
		ad.switchToPopUpAndAccept(driver);
	}
	@Test(priority=44)
	public void CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingModeofPaymentCheque_SC_676() throws Exception{
		CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingModeofPaymentCheque cb=new CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingModeofPaymentCheque(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali12");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithMinWorkingdays();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=45)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentCheque_SC_677() throws Exception{
		CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentCheque cb=new CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentCheque(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali13");
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithminwork();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=46)
	public void AddNewBonusDefinitionFormulaModeofPaymentCheque_SC_678() throws Exception{
		AddNewBonusDefinitionFormulaModeofPaymentCheque cb=new AddNewBonusDefinitionFormulaModeofPaymentCheque(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali14");
		cb.selectformula("Test Formula");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	
	@Test(priority=47)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentCheque_SC_679() throws Exception{
		CreateBonusDefinitionMaxBonusCalculateModeofPaymentCheque cb=new CreateBonusDefinitionMaxBonusCalculateModeofPaymentCheque(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali15");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=48)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentCheque_SC_680() throws Exception{
		AddNewBonusDefinitionMaxBonusModeofPaymentCheque cb=new AddNewBonusDefinitionMaxBonusModeofPaymentCheque(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali16");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=49)
	public void CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingModeofPaymentCheque_SC_681() throws Exception{
		CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingModeofPaymentCheque cb=new CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingModeofPaymentCheque(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali17");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=50)
	public void CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingModeofPaymentDD_SC_682() throws Exception{
		CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingModeofPaymentDD cb=new CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingModeofPaymentDD(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali18");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithMinWorkingdays();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=51)
	public void CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingModeofPaymentDD_SC_683() throws Exception{
		CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingModeofPaymentDD cb=new CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingModeofPaymentDD(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali19");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=52)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentDD_SC_684() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentDD cb=new CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentDD(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali20");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.checkcalculate();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=53)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentDD_SC_685() throws Exception{
		CreateBonusDefinitionwithminimumworkingModeofPaymentDD cb=new CreateBonusDefinitionwithminimumworkingModeofPaymentDD(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali21");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithMinWorkingdays();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=54)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentDD_SC_686() throws Exception{
		AddNewBonusDefinitionMaxBonusModeofPaymentDD cb=new AddNewBonusDefinitionMaxBonusModeofPaymentDD(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali22");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=55)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentDD_SC_687() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentDD cb=new CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentDD(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali23");
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithminwork();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=56)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentDD_SC_688() throws Exception{
		CreateBonusDefinitionMaxBonusCalculateModeofPaymentDD cb=new CreateBonusDefinitionMaxBonusCalculateModeofPaymentDD(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali24");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}*/
	/*@Test(priority=57)
	public void AddNewBonusDefinitionAllowManualEditingModeofPaymentDD_SC_689() throws Exception{
		AddNewBonusDefinitionAllowManualEditingModeofPaymentDD cb=new AddNewBonusDefinitionAllowManualEditingModeofPaymentDD(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali25");
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=58)
	public void AddNewBonusDefinitionFormulaModeofPaymentDD_SC_690() throws Exception{
		AddNewBonusDefinitionFormulaModeofPaymentDD cb=new AddNewBonusDefinitionFormulaModeofPaymentDD(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali26");
		cb.selectformula("Test Formula");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=59)
	public void CreateBonusDefinitionFormulaCalculateModeofPaymentDD_SC_691() throws Exception{
		CreateBonusDefinitionFormulaCalculateModeofPaymentDD cb=new CreateBonusDefinitionFormulaCalculateModeofPaymentDD(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali42");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.checkcalculate();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=60)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentDD_SC_692() throws Exception{
		CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentDD cb=new CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentDD(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali154");
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithminwork();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=61)
	public void AddNewBonusDefinitionAllowManualEditingModeofPaymentCashPTonBonusCurrentMonth_SC_693() throws Exception{
		AddNewBonusDefinitionAllowManualEditingModeofPaymentCashPTonBonusCurrentMonth cb=new AddNewBonusDefinitionAllowManualEditingModeofPaymentCashPTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali145");
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=62)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentDDCurrentMonth_SC_694() throws Exception{
		CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentDDCurrentMonth cb=new CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentDDCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali145");
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=63)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentCashPTonBonusCurrentMonth_SC_695() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentCashPTonBonusCurrentMonth cb=new CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentCashPTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali15");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=64)
	public void CreateBonusDefinitionFormulaCalculateModeofPaymentDDPTonBonusCurrentMonth_SC_696() throws Exception{
		CreateBonusDefinitionFormulaCalculateModeofPaymentDDPTonBonusCurrentMonth cb=new CreateBonusDefinitionFormulaCalculateModeofPaymentDDPTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali15");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=65)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentCashPTonBonusCurrentMonth_SC_697() throws Exception{
		CreateBonusDefinitionMaxBonusCalculateModeofPaymentCashPTonBonusCurrentMonth cb=new CreateBonusDefinitionMaxBonusCalculateModeofPaymentCashPTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali16");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=66)
	public void AddNewBonusDefinitionFormulaModeofPaymentDDPTonBonusCurrentMonth_SC_698() throws Exception{
		AddNewBonusDefinitionFormulaModeofPaymentDDPTonBonusCurrentMonth cb=new AddNewBonusDefinitionFormulaModeofPaymentDDPTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali14");
		cb.selectformula("Test Formula");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=67)
	public void CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingPTonBonusCurrentMonth_SC_699() throws Exception{
		CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingPTonBonusCurrentMonth cb=new CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingPTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=68)
	public void AddNewBonusDefinitionAllowManualEditingModeofPaymentDDPTonBonusCurrentMonth_SC_700() throws Exception{
		AddNewBonusDefinitionAllowManualEditingModeofPaymentDDPTonBonusCurrentMonth cb=new AddNewBonusDefinitionAllowManualEditingModeofPaymentDDPTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=69)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentCashCurrentMonth_SC_701() throws Exception{
		CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentCashCurrentMonth cb=new CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentCashCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=70)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentDDPTonBonusCurrentMonth_SC_702() throws Exception{
		CreateBonusDefinitionMaxBonusCalculateModeofPaymentDDPTonBonusCurrentMonth cb=new CreateBonusDefinitionMaxBonusCalculateModeofPaymentDDPTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=71)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentBankAdviseRespectiveMonth_SC_703() throws Exception{
		CreateBonusDefinitionMaxBonusCalculateModeofPaymentBankAdviseRespectiveMonth cb=new CreateBonusDefinitionMaxBonusCalculateModeofPaymentBankAdviseRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=72)
	public void CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingPTonBonusCurrentMonth_SC_704() throws Exception{
		CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingPTonBonusCurrentMonth cb=new CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingPTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=73)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentChequeCurrentMonth_SC_705() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentChequeCurrentMonth cb=new CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentChequeCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=74)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentCashCurrentMonth_SC_706() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentCashCurrentMonth cb=new CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentCashCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=75)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingPTonBonusCurrentMonth_SC_707() throws Exception{
		CreateBonusDefinitionConsideremployeeswithminimumworkingPTonBonusCurrentMonth cb=new CreateBonusDefinitionConsideremployeeswithminimumworkingPTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=76)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentDDPTonBonusCurrentMonth_SC_708() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentDDPTonBonusCurrentMonth cb=new CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentDDPTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=77)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentBankAdvisePTonBonusCurrentMonth_SC_709() throws Exception{
		CreateBonusDefinitionwithminimumworkingModeofPaymentBankAdvisePTonBonusCurrentMonth cb=new CreateBonusDefinitionwithminimumworkingModeofPaymentBankAdvisePTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=78)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentDDPTonBonusCurrentMonth_SC_710() throws Exception{
		AddNewBonusDefinitionMaxBonusModeofPaymentDDPTonBonusCurrentMonth cb=new AddNewBonusDefinitionMaxBonusModeofPaymentDDPTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=79)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentDDPTonBonusCurrentMonth_SC_711() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentDDPTonBonusCurrentMonth cb=new CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentDDPTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=80)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentCashPTonBonusCurrentMonth_SC_712() throws Exception{
		CreateBonusDefinitionwithminimumworkingModeofPaymentCashPTonBonusCurrentMonth cb=new CreateBonusDefinitionwithminimumworkingModeofPaymentCashPTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=81)
	public void CreateBonusDefinitionModeofPaymentBankAdvisePTonBonusCurrentMonth_SC_713() throws Exception{
		CreateBonusDefinitionModeofPaymentBankAdvisePTonBonusCurrentMonth cb=new CreateBonusDefinitionModeofPaymentBankAdvisePTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.clickmanual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=82)
	public void CreateBonusDefinitionMaxBonusFormulaConsideremployeeswithminimumworkingCurrentMonth_SC_714() throws Exception{
		CreateBonusDefinitionMaxBonusFormulaConsideremployeeswithminimumworkingCurrentMonth cb=new CreateBonusDefinitionMaxBonusFormulaConsideremployeeswithminimumworkingCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=83)
	public void CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingCurrentMonth_SC_715() throws Exception{
		CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingCurrentMonth cb=new CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=84)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentCashPTonBonusCurrentMonth_SC_716() throws Exception{
		AddNewBonusDefinitionMaxBonusModeofPaymentCashPTonBonusCurrentMonth cb=new AddNewBonusDefinitionMaxBonusModeofPaymentCashPTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=85)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentDDPTonBonusCurrentMonth_SC_717() throws Exception{
		CreateBonusDefinitionwithminimumworkingModeofPaymentDDPTonBonusCurrentMonth cb=new CreateBonusDefinitionwithminimumworkingModeofPaymentDDPTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=86)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentBankAdvisePTonBonusCurrentMonth_SC_718() throws Exception{
		AddNewBonusDefinitionMaxBonusModeofPaymentBankAdvisePTonBonusCurrentMonth cb=new AddNewBonusDefinitionMaxBonusModeofPaymentBankAdvisePTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=87)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentChequePTonBonusCurrentMonth_SC_719() throws Exception{
		CreateBonusDefinitionwithminimumworkingModeofPaymentChequePTonBonusCurrentMonth cb=new CreateBonusDefinitionwithminimumworkingModeofPaymentChequePTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=88)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingFormulaPTonBonusCurrentMonth_SC_720() throws Exception{
		CreateBonusDefinitionConsideremployeeswithminimumworkingFormulaPTonBonusCurrentMonth cb=new CreateBonusDefinitionConsideremployeeswithminimumworkingFormulaPTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=89)
	public void AddNewBonusDefinitionFormulaModeofPaymentBankAdvisePTonBonusCurrentMonth_SC_721() throws Exception{
		AddNewBonusDefinitionFormulaModeofPaymentBankAdvisePTonBonusCurrentMonth cb=new AddNewBonusDefinitionFormulaModeofPaymentBankAdvisePTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Test Formula");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=90)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentChequeCurrentMonth_SC_722() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentChequeCurrentMonth cb=new CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentChequeCurrentMonth(driver);
			cb.clickSalary();
			cb.selectBonus();
			cb.clickAddNewBonus();
			cb.EnterBonusHead("Diwali1");
			cb.clickManual();
			cb.EnterMaxBonus("10000");
			cb.SelectFromMonth("Mar/2013");
			cb.SelectToMonth("Apr/2013");
			cb.SelectPaymonth("Apr/2013");
			cb.checksalaryindependent();
			cb.SelectModeofPayment("Cheque");
			cb.consideremployeeswithminwork();
			cb.selectptonbonus();
			cb.selectcurrentmonth();
			cb.checknearestrupee();
			cb.clickCreateBonus();
			String t=cb.getMessage();
			Assert.assertEquals(t, "Bonus successfully created");
			cb.clickDeleteButton();
			cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=91)
	public void AddNewBonusDefinitionFormulaModeofPaymentChequePTonBonusCurrentMonth_SC_723() throws Exception{
		AddNewBonusDefinitionFormulaModeofPaymentChequePTonBonusCurrentMonth cb=new AddNewBonusDefinitionFormulaModeofPaymentChequePTonBonusCurrentMonth(driver);
			cb.clickSalary();
			cb.selectBonus();
			cb.clickAddNewBonus();
			cb.EnterBonusHead("Diwali1");
			cb.selectformula("Test Formula");
			cb.SelectFromMonth("Mar/2013");
			cb.SelectToMonth("Apr/2013");
			cb.SelectPaymonth("Apr/2013");
			cb.checksalaryindependent();
			cb.SelectModeofPayment("Cheque");
			cb.selectptonbonus();
			cb.selectcurrentmonth();
			cb.checknearestrupee();
			cb.clickCreateBonus();
			String t=cb.getMessage();
			Assert.assertEquals(t, "Bonus successfully created");
			cb.clickDeleteButton();
			cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=92)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentBankAdviseCurrentMonth_SC_724() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentBankAdviseCurrentMonth cb=new CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentBankAdviseCurrentMonth(driver);
			cb.clickSalary();
			cb.selectBonus();
			cb.clickAddNewBonus();
			cb.EnterBonusHead("Diwali1");
			cb.selectformula("Bonus");
			cb.EnterMaxBonus("10000");
			cb.SelectFromMonth("Mar/2013");
			cb.SelectToMonth("Apr/2013");
			cb.SelectPaymonth("Apr/2013");
			cb.checksalaryindependent();
			cb.SelectModeofPayment("Bank Advise");
			cb.checkcalculate();
			cb.selectptonbonus();
			cb.selectcurrentmonth();
			cb.checknearestrupee();
			cb.clickCreateBonus();
			String t=cb.getMessage();
			Assert.assertEquals(t, "Bonus successfully created");
			cb.clickDeleteButton();
			cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=93)
	public void CreateBonusDefinitionCalculateModeofPaymentChequePTonBonusCurrentMonth_SC_725() throws Exception{
		CreateBonusDefinitionCalculateModeofPaymentChequePTonBonusCurrentMonth cb=new CreateBonusDefinitionCalculateModeofPaymentChequePTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=94)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentBankAdviseCurrentMonth_SC_726() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentBankAdviseCurrentMonth cb=new CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentBankAdviseCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=95)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentChequePTonBonusCurrentMonth_SC_727() throws Exception{
		CreateBonusDefinitionMaxBonusCalculateModeofPaymentChequePTonBonusCurrentMonth cb=new CreateBonusDefinitionMaxBonusCalculateModeofPaymentChequePTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=96)
	public void AddNewBonusDefinitionAllowManualEditingModeofPaymentChequePTonBonusCurrentMonth_SC_728() throws Exception{
		AddNewBonusDefinitionAllowManualEditingModeofPaymentChequePTonBonusCurrentMonth cb=new AddNewBonusDefinitionAllowManualEditingModeofPaymentChequePTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");	
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=97)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingMaxBonusCurrentMonth_SC_729() throws Exception{
		CreateBonusDefinitionConsideremployeeswithminimumworkingMaxBonusCurrentMonth cb=new CreateBonusDefinitionConsideremployeeswithminimumworkingMaxBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");	
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=98)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentChequePTonBonusCurrentMonth_SC_730() throws Exception{
		AddNewBonusDefinitionMaxBonusModeofPaymentChequePTonBonusCurrentMonth cb=new AddNewBonusDefinitionMaxBonusModeofPaymentChequePTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");	
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=99)
	public void CreateBonusDefinitionFormulaCalculateModeofPaymentChequePTonBonusCurrentMonth_SC_731() throws Exception{
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequePTonBonusCurrentMonth cb=new CreateBonusDefinitionFormulaCalculateModeofPaymentChequePTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");	
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=100)
	public void AddNewBonusDefinitionAllowManualEditingModeofPaymentBankAdviseCurrentMonth_SC_732() throws Exception{
		AddNewBonusDefinitionAllowManualEditingModeofPaymentBankAdviseCurrentMonth cb=new AddNewBonusDefinitionAllowManualEditingModeofPaymentBankAdviseCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");	
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=101)
	public void CreateBonusDefinitionFormulaCalculateModeofPaymentBankAdvisePTonBonusCurrentMonth_SC_733() throws Exception{
		CreateBonusDefinitionFormulaCalculateModeofPaymentBankAdvisePTonBonusCurrentMonth cb=new CreateBonusDefinitionFormulaCalculateModeofPaymentBankAdvisePTonBonusCurrentMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");	
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=102)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentDDPTonBonusRespectiveMonth_SC_734() throws Exception{
		AddNewBonusDefinitionMaxBonusModeofPaymentDDPTonBonusRespectiveMonth cb=new AddNewBonusDefinitionMaxBonusModeofPaymentDDPTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");	
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonthandpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=103)
	public void CreateBonusDefinitionFormulaCalculateModeofPaymentBankAdvisePTonBonusRespectiveMonth_SC_735() throws Exception{
		CreateBonusDefinitionFormulaCalculateModeofPaymentBankAdvisePTonBonusRespectiveMonth cb=new  CreateBonusDefinitionFormulaCalculateModeofPaymentBankAdvisePTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");	
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonthandpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=104)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentBankAdviseRespectiveMonth_SC_736() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentBankAdviseRespectiveMonth cb=new CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentBankAdviseRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=105)
	public void AddNewBonusDefinitionAllowManualEditingModeofPaymentCashPTonBonusRespectiveMonth_SC_737() throws Exception{
		AddNewBonusDefinitionAllowManualEditingModeofPaymentCashPTonBonusRespectiveMonth cb=new AddNewBonusDefinitionAllowManualEditingModeofPaymentCashPTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=106)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentDDRespectiveMonth_SC_738() throws Exception{
		CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentDDRespectiveMonth cb=new CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentDDRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=107)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentBankAdviseRespectiveMonth_SC_739() throws Exception{
		CreateBonusDefinitionwithminimumworkingModeofPaymentBankAdviseRespectiveMonth cb=new CreateBonusDefinitionwithminimumworkingModeofPaymentBankAdviseRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=108)
	public void CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingRespectiveMonth_SC_740() throws Exception{
		CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingRespectiveMonth cb=new CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=109)
	public void AddNewBonusDefinitionFormulaModeofPaymentChequePTonBonusRespectiveMonth_SC_741() throws Exception{
		AddNewBonusDefinitionFormulaModeofPaymentChequePTonBonusRespectiveMonth cb=new AddNewBonusDefinitionFormulaModeofPaymentChequePTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Test Formula");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=110)
	public void AddNewBonusDefinitionAllowManualEditingModeofPaymentDDPTonBonusRespectiveMonth_SC_742() throws Exception{
		AddNewBonusDefinitionAllowManualEditingModeofPaymentDDPTonBonusRespectiveMonth cb=new AddNewBonusDefinitionAllowManualEditingModeofPaymentDDPTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);		
	}
	@Test(priority=111)
	public void AddNewBonusDefinitionAllowManualEditingModeofPaymentBankAdviseRespectiveMonth_SC_743() throws Exception{
		AddNewBonusDefinitionAllowManualEditingModeofPaymentBankAdviseRespectiveMonth cb=new AddNewBonusDefinitionAllowManualEditingModeofPaymentBankAdviseRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=112)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentChequeRespectiveMonth_SC_744() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentChequeRespectiveMonth cb=new CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentChequeRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=113)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentCashRespectiveMonth_SC_745() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentCashRespectiveMonth cb=new CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentCashRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=114)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentDDPTonBonusRespectiveMonth_SC_746() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentDDPTonBonusRespectiveMonth cb=new CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentDDPTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=115)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentCashPTonBonusRespectiveMonth_SC_747() throws Exception{
		CreateBonusDefinitionwithminimumworkingModeofPaymentCashPTonBonusRespectiveMonth cb=new CreateBonusDefinitionwithminimumworkingModeofPaymentCashPTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=116)
	public void AddNewBonusDefinitionFormulaModeofPaymentBankAdvisePTonBonusRespectiveMonth_SC_748() throws Exception{
		AddNewBonusDefinitionFormulaModeofPaymentBankAdvisePTonBonusRespectiveMonth cb=new AddNewBonusDefinitionFormulaModeofPaymentBankAdvisePTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("1");		
		cb.selectformula("Test Formula");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=117)
	public void CreateBonusDefinitionFormulaCalculateModeofPaymentChequePTonBonusRespectiveMonth_SC_749() throws Exception{
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequePTonBonusRespectiveMonth cb=new CreateBonusDefinitionFormulaCalculateModeofPaymentChequePTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=118)
	public void CreateBonusDefinitionFormulaCalculateModeofPaymentDDPTonBonusRespectiveMonth_SC_750() throws Exception{
		CreateBonusDefinitionFormulaCalculateModeofPaymentDDPTonBonusRespectiveMonth cb=new CreateBonusDefinitionFormulaCalculateModeofPaymentDDPTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=119)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingPTonBonusRespectiveMonth_SC_751() throws Exception{
		CreateBonusDefinitionConsideremployeeswithminimumworkingPTonBonusRespectiveMonth cb=new CreateBonusDefinitionConsideremployeeswithminimumworkingPTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=120)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentChequeRespectiveMonth_SC_752() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentChequeRespectiveMonth cb=new CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentChequeRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterBonusHead("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=121)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentCashRespectiveMonth_SC_753() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentCashRespectiveMonth cb=new CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentCashRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterBonusHead("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		}
	@Test(priority=122)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentChequeRespectiveMonthConsiderPreviousYear_SC_756() throws Exception{
		AddNewBonusDefinitionMaxBonusModeofPaymentChequeRespectiveMonthConsiderPreviousYear cb=new AddNewBonusDefinitionMaxBonusModeofPaymentChequeRespectiveMonthConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterBonusHead("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=123)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentChequePTonBonusRespectiveMonth_SC_757() throws Exception{
		CreateBonusDefinitionwithminimumworkingModeofPaymentChequePTonBonusRespectiveMonth cb=new CreateBonusDefinitionwithminimumworkingModeofPaymentChequePTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=124)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentDDPTonBonusRespectiveMonth_SC_758() throws Exception{
		CreateBonusDefinitionMaxBonusCalculateModeofPaymentDDPTonBonusRespectiveMonth cb=new CreateBonusDefinitionMaxBonusCalculateModeofPaymentDDPTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=125)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentCashPTonBonusRespectiveMonth_SC_759() throws Exception{
		CreateBonusDefinitionMaxBonusCalculateModeofPaymentCashPTonBonusRespectiveMonth cb=new CreateBonusDefinitionMaxBonusCalculateModeofPaymentCashPTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=126)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingRespectiveMonth_SC_760() throws Exception{
		CreateBonusDefinitionConsideremployeeswithminimumworkingRespectiveMonth cb=new CreateBonusDefinitionConsideremployeeswithminimumworkingRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=127)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentDDRespectiveMonth_SC_761() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentDDRespectiveMonth cb=new CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentDDRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=128)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentBankAdvisePTonBonusRespectiveMonth_SC_762() throws Exception{
		AddNewBonusDefinitionMaxBonusModeofPaymentBankAdvisePTonBonusRespectiveMonth cb=new AddNewBonusDefinitionMaxBonusModeofPaymentBankAdvisePTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=129)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentDDPTonBonusRespectiveMonth_SC_763() throws Exception{
		CreateBonusDefinitionwithminimumworkingModeofPaymentDDPTonBonusRespectiveMonth cb=new CreateBonusDefinitionwithminimumworkingModeofPaymentDDPTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=130)
	public void CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingRespectiveMonth_SC_764() throws Exception{
		CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingRespectiveMonth cb=new CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=131)
	public void CreateBonusDefinitionModeofPaymentBankAdvisePTonBonusRespectiveMonth_SC_765() throws Exception{
		CreateBonusDefinitionModeofPaymentBankAdvisePTonBonusRespectiveMonth cb=new CreateBonusDefinitionModeofPaymentBankAdvisePTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=132)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingMaxBonusRespectiveMonth_SC_766() throws Exception{
		CreateBonusDefinitionConsideremployeeswithminimumworkingMaxBonusRespectiveMonth cb=new CreateBonusDefinitionConsideremployeeswithminimumworkingMaxBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=133)
	public void CreateBonusDefinitionMaxBonusFormulaConsideremployeeswithminimumworkingRespectiveMonth_SC_767() throws Exception{
		CreateBonusDefinitionMaxBonusFormulaConsideremployeeswithminimumworkingRespectiveMonth cb=new CreateBonusDefinitionMaxBonusFormulaConsideremployeeswithminimumworkingRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=134)
	public void AddNewBonusDefinitionAllowManualEditingModeofPaymentChequeRespectiveMonth_SC_768() throws Exception{
		AddNewBonusDefinitionAllowManualEditingModeofPaymentChequeRespectiveMonth cb=new AddNewBonusDefinitionAllowManualEditingModeofPaymentChequeRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");	
		cb.EnterMaxBonus("1000");
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=135)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentCashPTonBonusRespectiveMonth_SC_769()throws Exception{
		AddNewBonusDefinitionMaxBonusModeofPaymentCashPTonBonusRespectiveMonth cb=new AddNewBonusDefinitionMaxBonusModeofPaymentCashPTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=136)
	public void CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingPTonBonusRespectiveMonth_SC_770() throws Exception{
		CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingPTonBonusRespectiveMonth cb=new CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingPTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
	}
	@Test(priority=137)
	public void AddNewBonusDefinitionFormulaModeofPaymentDDPTonBonusRespectiveMonth_SC_771() throws Exception{
		AddNewBonusDefinitionFormulaModeofPaymentDDPTonBonusRespectiveMonth cb=new AddNewBonusDefinitionFormulaModeofPaymentDDPTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Test Formula");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
	}
	@Test(priority=138)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentChequePTonBonusRespectiveMonth_SC_772() throws Exception{
		CreateBonusDefinitionMaxBonusCalculateModeofPaymentChequePTonBonusRespectiveMonth cb=new CreateBonusDefinitionMaxBonusCalculateModeofPaymentChequePTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
	}
	@Test(priority=139)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentBankAdviseRespectiveMonth_SC_773() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentBankAdviseRespectiveMonth cb=new CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentBankAdviseRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");	
		cb.EnterMaxBonus("1000");
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
	}
	@Test(priority=140)
	public void CreateBonusDefinitionCalculateModeofPaymentChequePTonBonusRespectiveMonth_SC_774() throws Exception{
		CreateBonusDefinitionCalculateModeofPaymentChequePTonBonusRespectiveMonth cb=new CreateBonusDefinitionCalculateModeofPaymentChequePTonBonusRespectiveMonth(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonthandconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		}
	@Test(priority=141)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateDoNotConsiderPreviousYear_SC_775() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculateDoNotConsiderPreviousYear cb=new CreateBonusDefinitionFormulaMaxBonusCalculateDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("1000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
	}
	@Test(priority=142)
	public void AddNewBonusDefinitionFormulaModeofPaymentChequeDoNotConsiderPreviousYear_SC_776() throws Exception{
		AddNewBonusDefinitionFormulaModeofPaymentChequeDoNotConsiderPreviousYear cb=new AddNewBonusDefinitionFormulaModeofPaymentChequeDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Test Formula");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
	}
	@Test(priority=143)
	public void CreateBonusDefinitionCalculateModeofPaymentChequeDoNotConsiderPreviousYear_SC_777() throws Exception{
		CreateBonusDefinitionCalculateModeofPaymentChequeDoNotConsiderPreviousYear cb=new CreateBonusDefinitionCalculateModeofPaymentChequeDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
	}
	@Test(priority=144)
	public void CreateBonusDefinitionMaxBonusFormulaPTonBonusRespectiveMonthDoNotConsiderPreviousYear_SC_778() throws Exception{
		CreateBonusDefinitionMaxBonusFormulaPTonBonusRespectiveMonthDoNotConsiderPreviousYear cb=new CreateBonusDefinitionMaxBonusFormulaPTonBonusRespectiveMonthDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("CASH");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
	}
	@Test(priority=145)
	public void CreateBonusDefinitionAllowManualEditingModeofPaymentCashDoNotConsiderPreviousYear_SC_779() throws Exception{
		CreateBonusDefinitionAllowManualEditingModeofPaymentCashDoNotConsiderPreviousYear cb=new CreateBonusDefinitionAllowManualEditingModeofPaymentCashDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		
	}
	@Test(priority=146)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentDDDoNotConsiderPreviousYear_SC_780() throws Exception{
		AddNewBonusDefinitionMaxBonusModeofPaymentDDDoNotConsiderPreviousYear cb=new AddNewBonusDefinitionMaxBonusModeofPaymentDDDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		
	}
	@Test(priority=147)
	public void CreateBonusDefinitionFormulaPTonBonusRespectiveMonthDoNotConsiderPreviousYear_SC_781() throws Exception{
		CreateBonusDefinitionFormulaPTonBonusRespectiveMonthDoNotConsiderPreviousYear cb=new CreateBonusDefinitionFormulaPTonBonusRespectiveMonthDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Bank Advise");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
	
	}
	@Test(priority=148)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentCashDoNotConsiderPreviousYear_SC_782() throws Exception{
		CreateBonusDefinitionwithminimumworkingModeofPaymentCashDoNotConsiderPreviousYear cb=new CreateBonusDefinitionwithminimumworkingModeofPaymentCashDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("CASH");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=149)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentChequeDoNotConsiderPreviousYear_SC_783() throws Exception{
		AddNewBonusDefinitionMaxBonusModeofPaymentChequeDoNotConsiderPreviousYear cb=new AddNewBonusDefinitionMaxBonusModeofPaymentChequeDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=150)
	public void CreateBonusDefinitionFormulaCalculatePTonBonusRespectiveMonthDoNotConsiderPreviousYear_SC_784() throws Exception{
		CreateBonusDefinitionFormulaCalculatePTonBonusRespectiveMonthDoNotConsiderPreviousYear cb=new CreateBonusDefinitionFormulaCalculatePTonBonusRespectiveMonthDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Bank Advise");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=151)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentDDDoNotConsiderPreviousYear_SC_785() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentDDDoNotConsiderPreviousYear cb=new CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentDDDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=152)
	public void AddNewBonusDefinitionAllowManualEditingPTonBonusDoNotConsiderPreviousYear_SC_786() throws Exception{
		AddNewBonusDefinitionAllowManualEditingPTonBonusDoNotConsiderPreviousYear cb=new AddNewBonusDefinitionAllowManualEditingPTonBonusDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=153)
	public void AddNewBonusDefinitionAllowManualEditingPTonBonusDoNotConsiderPreviousYear_SC_787() throws Exception{
		AddNewBonusDefinitionAllowManualEditingPTonBonusDoNotConsiderPreviousYear cb=new AddNewBonusDefinitionAllowManualEditingPTonBonusDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=154)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentChequeDoNotConsiderPreviousYear_SC_788() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentChequeDoNotConsiderPreviousYear cb=new CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentChequeDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=155)
	public void CreateBonusDefinitionFormulaMaxBonusCalculatePTonBonusDoNotConsiderPreviousYear_SC_789() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculatePTonBonusDoNotConsiderPreviousYear cb=new CreateBonusDefinitionFormulaMaxBonusCalculatePTonBonusDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Bank Advise");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=156)
	public void CreateBonusDefinitionwithminimumworkingPTonBonusDoNotConsiderPreviousYear_SC_790() throws Exception{
		CreateBonusDefinitionwithminimumworkingPTonBonusDoNotConsiderPreviousYear cb=new CreateBonusDefinitionwithminimumworkingPTonBonusDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");		
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Bank Advise");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		Thread.sleep(3000);
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=157)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingRespectiveMonthDoNotConsiderPreviousYear_SC_791() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingRespectiveMonthDoNotConsiderPreviousYear cb=new CreateBonusDefinitionMaxBonusAllowManualEditingRespectiveMonthDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Bank Advise");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		Thread.sleep(3000);
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=158)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentChequeDoNotConsiderPreviousYear_SC_792() throws Exception{
		CreateBonusDefinitionMaxBonusCalculateModeofPaymentChequeDoNotConsiderPreviousYear cb=new CreateBonusDefinitionMaxBonusCalculateModeofPaymentChequeDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		Thread.sleep(3000);
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=159)
	public void CreateBonusDefinitionMaxBonusCalculateDoNotConsiderPreviousYear_SC_793() throws Exception{
		CreateBonusDefinitionMaxBonusCalculateDoNotConsiderPreviousYear cb=new CreateBonusDefinitionMaxBonusCalculateDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		Thread.sleep(3000);
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=160)
	public void CreateBonusDefinitionModeofPaymentDDPTonBonusRespectiveMonthDoNotConsiderPreviousYear_SC_794() throws Exception{
		CreateBonusDefinitionModeofPaymentDDPTonBonusRespectiveMonthDoNotConsiderPreviousYear cb=new CreateBonusDefinitionModeofPaymentDDPTonBonusRespectiveMonthDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=161)
	public void AddNewBonusDefinitionMaxBonusPTonBonusRespectiveMonthDoNotConsiderPreviousYear_SC_795() throws Exception{
		AddNewBonusDefinitionMaxBonusPTonBonusRespectiveMonthDoNotConsiderPreviousYear cb=new AddNewBonusDefinitionMaxBonusPTonBonusRespectiveMonthDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("CASH");
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=162)
	public void CreateBonusDefinitionPTonBonusRespectiveMonthDoNotConsiderPreviousYear_SC_796() throws Exception{
		CreateBonusDefinitionPTonBonusRespectiveMonthDoNotConsiderPreviousYear cb=new CreateBonusDefinitionPTonBonusRespectiveMonthDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=163)
	public void AddNewBonusDefinitionFormulaModeofPaymentDDDoNotConsiderPreviousYear_SC_797() throws Exception{
		AddNewBonusDefinitionFormulaModeofPaymentDDDoNotConsiderPreviousYear cb=new AddNewBonusDefinitionFormulaModeofPaymentDDDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Test Formula");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=164)
	public void AddNewBonusDefinitionFormulaModeofPaymentBankAdviseDoNotConsiderPreviousYear_SC_798() throws Exception{
		AddNewBonusDefinitionFormulaModeofPaymentBankAdviseDoNotConsiderPreviousYear cb=new AddNewBonusDefinitionFormulaModeofPaymentBankAdviseDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Test Formula");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=165)
	public void CreateBonusDefinitionFormulaCalculateModeofPaymentChequeDoNotConsiderPreviousYear_SC_799() throws Exception{
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeDoNotConsiderPreviousYear cb=new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=166)
	public void AddNewBonusDefinitionAllowManualEditingModeofPaymentCashDoNotConsiderPreviousYear_SC_800() throws Exception{
		AddNewBonusDefinitionAllowManualEditingModeofPaymentCashDoNotConsiderPreviousYear cb=new AddNewBonusDefinitionAllowManualEditingModeofPaymentCashDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("CASH");
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=167)
	public void CreateBonusDefinitionFormulaCalculateModeofPaymentDDDoNotConsiderPreviousYear_SC_801() throws Exception{
		CreateBonusDefinitionFormulaCalculateModeofPaymentDDDoNotConsiderPreviousYear cb=new CreateBonusDefinitionFormulaCalculateModeofPaymentDDDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=168)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentChequeDoNotConsiderPreviousYear_SC_802() throws Exception{
		CreateBonusDefinitionwithminimumworkingModeofPaymentChequeDoNotConsiderPreviousYear cb=new CreateBonusDefinitionwithminimumworkingModeofPaymentChequeDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=169)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentDDDoNotConsiderPreviousYear_SC_803() throws Exception{
		CreateBonusDefinitionMaxBonusCalculateModeofPaymentDDDoNotConsiderPreviousYear cb=new CreateBonusDefinitionMaxBonusCalculateModeofPaymentDDDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=170)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentCashDoNotConsiderPreviousYear_SC_804() throws Exception{
		CreateBonusDefinitionMaxBonusCalculateModeofPaymentCashDoNotConsiderPreviousYear cb=new CreateBonusDefinitionMaxBonusCalculateModeofPaymentCashDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("CASH");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=171)
	public void CreateBonusDefinitionModeofPaymentChequePTonBonusDoNotConsiderPreviousYear_SC_805() throws Exception{
		CreateBonusDefinitionModeofPaymentChequePTonBonusDoNotConsiderPreviousYear cb=new CreateBonusDefinitionModeofPaymentChequePTonBonusDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=172)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentDDDoNotConsiderPreviousYear_SC_806() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentDDDoNotConsiderPreviousYear cb=new CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentDDDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=173)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentBankAdviseDoNotConsiderPreviousYear_SC_807() throws Exception{
		AddNewBonusDefinitionMaxBonusModeofPaymentBankAdviseDoNotConsiderPreviousYear cb=new AddNewBonusDefinitionMaxBonusModeofPaymentBankAdviseDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=174)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentDDDoNotConsiderPreviousYear_SC_808() throws Exception{
		CreateBonusDefinitionwithminimumworkingModeofPaymentDDDoNotConsiderPreviousYear cb=new CreateBonusDefinitionwithminimumworkingModeofPaymentDDDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectrespectivemonth();	
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=175)
	public void CreateBonusDefinitionMaxBonusPTonBonusRespectiveMonthDoNotConsiderPreviousYear_SC_809() throws Exception{
		CreateBonusDefinitionMaxBonusPTonBonusRespectiveMonthDoNotConsiderPreviousYear cb=new CreateBonusDefinitionMaxBonusPTonBonusRespectiveMonthDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectrespectivemonth();	
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=176)
	public void CreateBonusDefinitionModeofPaymentBankAdvisePTonBonusDoNotConsiderPreviousYear_SC_810() throws Exception{
		CreateBonusDefinitionModeofPaymentBankAdvisePTonBonusDoNotConsiderPreviousYear cb=new CreateBonusDefinitionModeofPaymentBankAdvisePTonBonusDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Bank Advise");
		cb.consideremployeeswithminwork();
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=177)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentBankadviseDoNotConsiderPreviousYear_SC_811() throws Exception{
		CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentBankadviseDoNotConsiderPreviousYear cb=new CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentBankadviseDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Bank Advise");
		cb.consideremployeeswithMinWorkingdays();
		cb.selectptonbonus();
		cb.selectrespectivemonth();	
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=178)
	public void AddNewBonusDefinitionAllowManualEditingModeofPaymentDDDoNotConsiderPreviousYear_SC_812() throws Exception{
		AddNewBonusDefinitionAllowManualEditingModeofPaymentDDDoNotConsiderPreviousYear cb=new AddNewBonusDefinitionAllowManualEditingModeofPaymentDDDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectrespectivemonth();
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=179)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateRespectiveMonthDoNotConsiderPreviousYear_SC_813() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculateRespectiveMonthDoNotConsiderPreviousYear cb=new CreateBonusDefinitionFormulaMaxBonusCalculateRespectiveMonthDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("CASH");
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonth();	
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=180)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentCashDoNotConsiderPreviousYear_SC_814() throws Exception{
		CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentCashDoNotConsiderPreviousYear cb=new CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentCashDoNotConsiderPreviousYear(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("CASH");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.selectptonbonus();
		cb.selectrespectivemonth();	
		cb.selectdonotconsiderpreviousyear();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=181)
	public void AddNewBonusDefinitionAllowManualEditingNearest10Rupee_SC_815() throws Exception{
		AddNewBonusDefinitionAllowManualEditingNearest10Rupee cb=new AddNewBonusDefinitionAllowManualEditingNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalarydependent();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=182)
	public void AddNewBonusDefinitionMaxBonusNearest10Rupee_SC_816() throws Exception{
		AddNewBonusDefinitionMaxBonusNearest10Rupee cb=new AddNewBonusDefinitionMaxBonusNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalarydependent();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=183)
	public void CreateBonusDefinitionMaxBonusFormulaConsideremployeeswithminimumworkingNearest10Rupee_SC_817() throws Exception{
		CreateBonusDefinitionMaxBonusFormulaConsideremployeeswithminimumworkingNearest10Rupee cb=new CreateBonusDefinitionMaxBonusFormulaConsideremployeeswithminimumworkingNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithminwork();
		cb.checksalarydependent();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=184)
	public void CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingNearest10Rupee_SC_818() throws Exception{
		CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingNearest10Rupee cb = new CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithminwork();
		cb.checksalarydependent();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=185)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingNearest10Rupee_SC_819() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingNearest10Rupee cb = new CreateBonusDefinitionMaxBonusAllowManualEditingNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithminwork();
		cb.checksalarydependent();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=186)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingNearest10Rupee_SC_820() throws Exception{
		CreateBonusDefinitionConsideremployeeswithminimumworkingNearest10Rupee cb = new CreateBonusDefinitionConsideremployeeswithminimumworkingNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithminwork();
		cb.checksalarydependent();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}*/
	/*@Test(priority=187)
	public void CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingCalculateNearest10Rupee_SC_821() throws Exception{
		CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingCalculateNearest10Rupee cb = new CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingCalculateNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.checksalarydependent();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=188)
	public void CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingCalculateNearest10Rupee_SC_822() throws Exception{
		CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingCalculateNearest10Rupee cb = new CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingCalculateNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.checksalarydependent();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=189)
	public void CreateBonusDefinitionFormulaCalculateNearest10Rupee_SC_823() throws Exception{
		CreateBonusDefinitionFormulaCalculateNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checkcalculate();
		cb.checksalarydependent();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=190)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateNearest10Rupee_SC_824() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculateNearest10Rupee cb = new CreateBonusDefinitionFormulaMaxBonusCalculateNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checkcalculate();
		cb.checksalarydependent();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=191)
	public void AddNewBonusDefinitionFormulaModeofPaymentCashNearest10Rupee_SC_825() throws Exception{
		AddNewBonusDefinitionFormulaModeofPaymentCashNearest10Rupee cb = new AddNewBonusDefinitionFormulaModeofPaymentCashNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();	
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");			
		cb.selectformula("Test Formula");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=192)
	public void AddNewBonusDefinitionAllowManualEditingModeofPaymentCashNearest10Rupee_SC_826() throws Exception{
		AddNewBonusDefinitionAllowManualEditingModeofPaymentCashNearest10Rupee cb = new AddNewBonusDefinitionAllowManualEditingModeofPaymentCashNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=193)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentCashNearest10Rupee_SC_827() throws Exception{
		CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentCashNearest10Rupee cb = new CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentCashNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checkcalculate();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=194)
	public void CreateBonusDefinitionFormulaCalculateModeofPaymentCashNearest10Rupee_SC_828() throws Exception{
		CreateBonusDefinitionFormulaCalculateModeofPaymentCashNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentCashNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checkcalculate();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=195)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentCashNearest10Rupee_SC_829() throws Exception{
		CreateBonusDefinitionMaxBonusCalculateModeofPaymentCashNearest10Rupee cb = new CreateBonusDefinitionMaxBonusCalculateModeofPaymentCashNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=196)
	public void CreateBonusDefinitionFormulaModeofPaymentCashNearest10Rupee_SC_830() throws Exception{
		CreateBonusDefinitionFormulaModeofPaymentCashNearest10Rupee cb =new CreateBonusDefinitionFormulaModeofPaymentCashNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=197)
	public void CreateBonusDefinitionModeofPaymentCashNearest10Rupee_SC_831() throws Exception{
		CreateBonusDefinitionModeofPaymentCashNearest10Rupee cb = new CreateBonusDefinitionModeofPaymentCashNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=198)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentCashNearest10Rupee_SC_832() throws Exception{
		CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentCashNearest10Rupee cb = new CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentCashNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
		
	}
	@Test(priority=199)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentCashNearest10Rupee_SC_833() throws Exception {
		CreateBonusDefinitionwithminimumworkingModeofPaymentCashNearest10Rupee cb = new CreateBonusDefinitionwithminimumworkingModeofPaymentCashNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=200)
	public void CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingNearest10Rupee_SC_834() throws Exception {
		CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingNearest10Rupee cb = new CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=201)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentCashNearest10Rupee_SC_835() throws Exception {
		AddNewBonusDefinitionMaxBonusModeofPaymentCashNearest10Rupee cb = new AddNewBonusDefinitionMaxBonusModeofPaymentCashNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	 @Test(priority=202)
	 public void AddNewBonusDefinitionMaxBonusModeofPaymentBankAdviseNearest10Rupee_SC_836() throws Exception {
		 AddNewBonusDefinitionMaxBonusModeofPaymentBankAdviseNearest10Rupee cb = new AddNewBonusDefinitionMaxBonusModeofPaymentBankAdviseNearest10Rupee(driver);
		 	cb.clickSalary();
			cb.selectBonus();
			cb.clickAddNewBonus();
			cb.EnterBonusHead("Diwali1");		
			cb.selectformula("Bonus");
			cb.EnterMaxBonus("10000");
			cb.SelectFromMonth("Mar/2013");
			cb.SelectToMonth("Apr/2013");
			cb.SelectPaymonth("Apr/2013");
			cb.checksalaryindependent();
			cb.SelectModeofPayment("Bank Advise");
			cb.checknearest10rupee();
			cb.clickCreateBonus();
			String t=cb.getMessage();
			Assert.assertEquals(t, "Bonus successfully created");
			cb.clickDeleteButton();
			cb.switchToPopUpAndAccept(driver);
	 }
	 @Test(priority=203)
	 public void AddNewBonusDefinitionFormulaModeofPaymentBankAdviseNearest10Rupee_SC_837() throws Exception {
		 AddNewBonusDefinitionFormulaModeofPaymentBankAdviseNearest10Rupee cb = new AddNewBonusDefinitionFormulaModeofPaymentBankAdviseNearest10Rupee(driver);
		 	cb.clickSalary();
			cb.selectBonus();
			cb.clickAddNewBonus();
			cb.EnterBonusHead("Diwali1");		
			cb.selectformula("Test Formula");
			cb.SelectFromMonth("Mar/2013");
			cb.SelectToMonth("Apr/2013");
			cb.SelectPaymonth("Apr/2013");
			cb.checksalaryindependent();
			cb.SelectModeofPayment("Bank Advise");
			cb.checknearest10rupee();
			cb.clickCreateBonus();
			String t=cb.getMessage();
			Assert.assertEquals(t, "Bonus successfully created");
			cb.clickDeleteButton();
			cb.switchToPopUpAndAccept(driver);
	 }
	 @Test(priority=204)
	 public void CreateBonusDefinitionConsideremployeeswithminimumworkingBankAdviseNearest10Rupee_SC_838() throws Exception {
		 CreateBonusDefinitionConsideremployeeswithminimumworkingBankAdviseNearest10Rupee cb = new CreateBonusDefinitionConsideremployeeswithminimumworkingBankAdviseNearest10Rupee(driver);
		 	cb.clickSalary();
			cb.selectBonus();
			cb.clickAddNewBonus();
			cb.EnterBonusHead("Diwali1");		
			cb.selectformula("Bonus");
			cb.EnterMaxBonus("10000");
			cb.SelectFromMonth("Mar/2013");
			cb.SelectToMonth("Apr/2013");
			cb.SelectPaymonth("Apr/2013");
			cb.consideremployeeswithMinWorkingdays();
			cb.checksalaryindependent();
			cb.SelectModeofPayment("Bank Advise");
			cb.checknearest10rupee();
			cb.clickCreateBonus();
			String t=cb.getMessage();
			Assert.assertEquals(t, "Bonus successfully created");
			cb.clickDeleteButton();
			cb.switchToPopUpAndAccept(driver);
	 }
	 @Test(priority=205)
	 public void AddNewBonusDefinitionAllowManualEditingModeofPaymentBankAdviseNearest10Rupee_SC_839() throws Exception {
		 AddNewBonusDefinitionAllowManualEditingModeofPaymentBankAdviseNearest10Rupee cb = new AddNewBonusDefinitionAllowManualEditingModeofPaymentBankAdviseNearest10Rupee(driver);
		 	cb.clickSalary();
			cb.selectBonus();
			cb.clickAddNewBonus();
			cb.EnterBonusHead("Diwali1");		
			cb.clickManual();
			cb.EnterMaxBonus("10000");
			cb.SelectFromMonth("Mar/2013");
			cb.SelectToMonth("Apr/2013");
			cb.SelectPaymonth("Apr/2013");
			cb.checksalaryindependent();
			cb.SelectModeofPayment("Bank Advise");
			cb.checknearest10rupee();
			cb.clickCreateBonus();
			String t=cb.getMessage();
			Assert.assertEquals(t, "Bonus successfully created");
			cb.clickDeleteButton();
			cb.switchToPopUpAndAccept(driver);
	 }
	 @Test(priority=206)
	 public void CreateBonusDefinitionwithminimumworkingModeofPaymentBankAdviseNearest10Rupee_SC_840() throws Exception {
		 CreateBonusDefinitionwithminimumworkingModeofPaymentBankAdviseNearest10Rupee cb = new CreateBonusDefinitionwithminimumworkingModeofPaymentBankAdviseNearest10Rupee(driver);
		 	cb.clickSalary();
			cb.selectBonus();
			cb.clickAddNewBonus();
			cb.EnterBonusHead("Diwali1");		
			cb.selectformula("Bonus");
			cb.SelectFromMonth("Mar/2013");
			cb.SelectToMonth("Apr/2013");
			cb.SelectPaymonth("Apr/2013");
			cb.consideremployeeswithMinWorkingdays();
			cb.checksalaryindependent();
			cb.SelectModeofPayment("Bank Advise");
			cb.checknearest10rupee();
			cb.clickCreateBonus();
			String t=cb.getMessage();
			Assert.assertEquals(t, "Bonus successfully created");
			cb.clickDeleteButton();
			cb.switchToPopUpAndAccept(driver);
	 }	 
	 @Test(priority=207)
	 public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentBankAdviseNearest10Rupee_SC_841() throws Exception {
		 CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentBankAdviseNearest10Rupee cb = new CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentBankAdviseNearest10Rupee(driver);
		 	cb.clickSalary();
			cb.selectBonus();
			cb.clickAddNewBonus();
			cb.EnterBonusHead("Diwali1");		
			cb.selectformula("Bonus");
			cb.EnterMaxBonus("10000");
			cb.SelectFromMonth("Mar/2013");
			cb.SelectToMonth("Apr/2013");
			cb.SelectPaymonth("Apr/2013");
			cb.checkcalculate();
			cb.checksalaryindependent();
			cb.SelectModeofPayment("Bank Advise");
			cb.checknearest10rupee();
			cb.clickCreateBonus();
			String t=cb.getMessage();
			Assert.assertEquals(t, "Bonus successfully created");
			cb.clickDeleteButton();
			cb.switchToPopUpAndAccept(driver);
	 }
	@Test(priority=208)
	public void CreateBonusDefinitionFormulaCalculateModeofPaymentBankAdviseNearest10Rupee_SC_842() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentBankAdviseNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentBankAdviseNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checkcalculate();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=209)
	public void CreateBonusDefinitionModeofPaymentBankAdviseNearest10Rupee_SC_843() throws Exception { 
		CreateBonusDefinitionModeofPaymentBankAdviseNearest10Rupee cb = new CreateBonusDefinitionModeofPaymentBankAdviseNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=210)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentBankAdviseNearest10Rupee_SC_844() throws Exception {
		CreateBonusDefinitionMaxBonusCalculateModeofPaymentBankAdviseNearest10Rupee cb = new CreateBonusDefinitionMaxBonusCalculateModeofPaymentBankAdviseNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=211)
	public void CreateBonusDefinitionFormulaModeofPaymentBankAdviseNearest10Rupee_SC_845() throws Exception {
		CreateBonusDefinitionFormulaModeofPaymentBankAdviseNearest10Rupee cb = new CreateBonusDefinitionFormulaModeofPaymentBankAdviseNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Bank Advise");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=212)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentChequeNearest10Rupee_SC_846() throws Exception {
		CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checkcalculate();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=213)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentChequeNearest10Rupee_SC_847() throws Exception {
		CreateBonusDefinitionwithminimumworkingModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionwithminimumworkingModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=214)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentChequeNearest10Rupee_SC_848() throws Exception {
		CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=215)
	public void AddNewBonusDefinitionAllowManualEditingModeofPaymentChequeNearest10Rupee_SC_849() throws Exception {
		AddNewBonusDefinitionAllowManualEditingModeofPaymentChequeNearest10Rupee cb = new AddNewBonusDefinitionAllowManualEditingModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=216)
	public void CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee_SC_850() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.checkcalculate();
		cb.SelectModeofPayment("Cheque");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=217)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingMaxBonusNearest10Rupee_SC_851() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=218)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingChequeNearest10Rupee_SC_852() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=219)
	public void AddNewBonusDefinitionFormulaModeofPaymentChequeNearest10Rupee_SC_853() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Test Formula");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=220)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentChequeNearest10Rupee_SC_854() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=221)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentChequeNearest10Rupee_SC_855() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=222)
	public void CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingChequeNearest10Rupee_SC_856() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checkcalculate();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("Cheque");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=223)
	public void CreateBonusDefinitionMaxBonusConsideremployeeswithminimumworkingDDNearest10Rupee_SC_857() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=224)
	public void CreateBonusDefinitionFormulaConsideremployeeswithminimumworkingDDNearest10Rupee_SC_858() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.checkcalculate();
		cb.SelectModeofPayment("DD");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=225)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentDDNearest10Rupee_SC_859() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.checksalaryindependent();
		cb.checkcalculate();
		cb.SelectModeofPayment("DD");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=226)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentDDNearest10Rupee_SC_860() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=227)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentDDNearest10Rupee_SC_861() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=228)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingModeofPaymentDDNearest10Rupee_SC_862() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=229)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentDDNearest10Rupee_SC_863() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.checkcalculate();
		cb.SelectModeofPayment("DD");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=230)
	public void AddNewBonusDefinitionAllowManualEditingModeofPaymentDDNearest10Rupee_SC_864() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=231)
	public void AddNewBonusDefinitionFormulaModeofPaymentDDNearest10Rupee_SC_865() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Test Formula");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=232)
	public void CreateBonusDefinitionFormulaCalculateModeofPaymentDDNearest10Rupee_SC_866() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.checksalaryindependent();
		cb.checkcalculate();
		cb.SelectModeofPayment("DD");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=233)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingModeofPaymentDDNearest10Rupee_SC_867() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb =new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=234)
	public void AddNewBonusDefinitionAllowManualEditingCashPTonBonusCurrentMonthNearest10Rupee_SC_868() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb =new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");		
		cb.checksalaryindependent();
		cb.SelectModeofPayment("CASH");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=235)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingDDNearest10Rupee_SC_869() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb =new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=236)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentCashNearest10Rupee_SC_870() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.checkcalculate();
		cb.SelectModeofPayment("CASH");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=237)
	public void CreateBonusDefinitionFormulaCalculateDDNearest10Rupee_SC_871() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();
		cb.checkcalculate();
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=238)
	public void CreateBonusDefinitionMaxBonusCalculatePTonBonusCurrentMonthNearest10Rupee_SC_872() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();
		cb.checkcalculate();
		cb.SelectModeofPayment("CASH");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=239)
	public void AddNewBonusDefinitionFormulaModeofPaymentNearest10Rupee_SC_873() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Test Formula");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=240)
	public void CreateBonusDefinitionFormulaPTonBonusCurrentMonthNearest10Rupee_SC_874() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();	
		cb.checkcalculate();
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=241)
	public void AddNewBonusDefinitionAllowManualEditingDDPTonBonusCurrentMonthNearest10Rupee_SC_875() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=242)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingCurrentMonthNearest10Rupee_SC_876() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("CASH");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=243)
	public void CreateBonusDefinitionMaxBonusCalculateModeofPaymentDDCurrentMonthNearest10Rupee_SC_877() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();	
		cb.checkcalculate();
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=244)
	public void CreateBonusDefinitionMaxBonusCalculateRespectiveMonthNearest10Rupee_SC_878() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();	
		cb.checkcalculate();
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectrespectivemonthconsiderpreviousyear();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);		
	}
	@Test(priority=245)
	public void CreateBonusDefinitionMaxBonusPTonBonusCurrentMonthNearest10Rupee_SC_879() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);		
	}
	@Test(priority=246)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateChequeCurrentMonthNearest10Rupee_SC_880() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.checkcalculate();
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);		
	}
	@Test(priority=247)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingCashNearest10Rupee_SC_881() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();	
		cb.checkcalculate();
		cb.SelectModeofPayment("CASH");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);		
	}
	@Test(priority=248)
	public void CreateBonusDefinitionPTonBonusCurrentMonthNearest10Rupee_SC_882() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);		
	}
	@Test(priority=249)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingDDNearest10Rupee_SC_883() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=250)
	public void CreateBonusDefinitionwithminimumworkingBankAdviseNearest10Rupee_SC_884() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=251)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentDDPTonBonusCurrentMonthNearest10Rupee_SC_885() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=252)
	public void CreateBonusDefinitionFormulaMaxBonusCalculateModeofPaymentDDNearest10Rupee_SC_886() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.checksalaryindependent();	
		cb.checkcalculate();
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=253)
	public void CreateBonusDefinitionwithminimumworkingModeofPaymentCashCurrentMonthNearest10Rupee_SC_887() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();	
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("CASH");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=254)
	public void CreateBonusDefinitionModeofPaymentBankAdvisePTonBonusCurrentMonthNearest10Rupee_SC_888() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();	
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=255)
	public void CreateBonusDefinitionMaxBonusFormulaCurrentMonthNearest10Rupee_SC_889() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();	
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("CASH");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=256)
	public void CreateBonusDefinitionFormulaCurrentMonthNearest10Rupee_SC_890() throws Exception{
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");
		cb.consideremployeeswithMinWorkingdays();	
		cb.checksalaryindependent();	
		cb.checkcalculate();
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=257)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentCashCurrentMonthNearest10Rupee_SC_891() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("CASH");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=258)
	public void CreateBonusDefinitionModeofPaymentDDPTonBonusCurrentMonthNearest10Rupee_SC_892() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=259)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentBankAdviseCurrentMonthNearest10Rupee_SC_893() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");		
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=260)
	public void CreateBonusDefinitionwithminimumworkingChequeCurrentMonthNearest10Rupee_SC_894() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=261)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingFormulaNearest10Rupee_SC_895() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=262)
	public void AddNewBonusDefinitionFormulaModeofPaymentBankAdviseCurrentMonthNearest10Rupee_SC_896() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Test Formula");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=263)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingChequeNearest10Rupee_SC_897() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=264)
	public void AddNewBonusDefinitionFormulaModeofPaymentChequeCurrentMonthNearest10Rupee_SC_898() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Test Formula");	
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=265)
	public void CreateBonusDefinitionFormulaMaxBonusModeofPaymentBankAdviseNearest10Rupee_SC_899() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");	
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.checksalaryindependent();	
		cb.checkcalculate();
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=266)
	public void CreateBonusDefinitionCalculateModeofPaymentChequeCurrentMonthNearest10Rupee_SC_900() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.selectformula("Bonus");	
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();	
		cb.checkcalculate();
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=267)
	public void CreateBonusDefinitionMaxBonusAllowManualEditingBankAdviseNearest10Rupee_SC_901() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");		
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=268)
	public void CreateBonusDefinitionMaxBonusCalculateModeNearest10Rupee_SC_902() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();	
		cb.checkcalculate();
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearestrupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=269)
	public void AddNewBonusDefinitionAllowManualEditingChequeNearest10Rupee_SC_903() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=270)
	public void CreateBonusDefinitionConsideremployeeswithminimumworkingBankAdviseNearest10Rupee_SC_904() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.consideremployeeswithMinWorkingdays();
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=271)
	public void AddNewBonusDefinitionMaxBonusChequeNearest10Rupee_SC_905() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=272)
	public void CreateBonusDefinitionFormulaCalculateChequeNearest10Rupee_SC_906() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.checksalaryindependent();	
		cb.checkcalculate();
		cb.SelectModeofPayment("Cheque");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=273)
	public void AddNewBonusDefinitionAllowManualEditingBankAdviseCurrentMonthNearest10Rupee_SC_907() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.clickManual();
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.checksalaryindependent();	
		cb.checkcalculate();
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}
	@Test(priority=274)
	public void CreateBonusDefinitionFormulaCalculateBankAdviseNearest10Rupee_SC_908() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.checksalaryindependent();	
		cb.checkcalculate();
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectcurrentmonth();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=275)
	public void AddNewBonusDefinitionMaxBonusModeofPaymentDDRespectiveMonthNearest10Rupee_SC_917() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.EnterMaxBonus("10000");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.checksalaryindependent();	
		cb.SelectModeofPayment("DD");
		cb.selectptonbonus();
		cb.selectrespectivemonthconsiderpreviousyear();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);	
	}
	@Test(priority=276)
	public void CreateBonusDefinitionFormulaCalculateBankAdviseRespectiveMonthNearest10Rupee_SC_918() throws Exception {
		CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee cb = new CreateBonusDefinitionFormulaCalculateModeofPaymentChequeNearest10Rupee(driver);
		cb.clickSalary();
		cb.selectBonus();
		cb.clickAddNewBonus();
		cb.EnterBonusHead("Diwali1");
		cb.selectformula("Bonus");
		cb.SelectFromMonth("Mar/2013");
		cb.SelectToMonth("Apr/2013");
		cb.SelectPaymonth("Apr/2013");	
		cb.checksalaryindependent();	
		cb.checkcalculate();
		cb.SelectModeofPayment("Bank Advise");
		cb.selectptonbonus();
		cb.selectrespectivemonthconsiderpreviousyear();
		cb.checknearest10rupee();
		cb.clickCreateBonus();
		String t=cb.getMessage();
		Assert.assertEquals(t, "Bonus successfully created");
		cb.clickDeleteButton();
		cb.switchToPopUpAndAccept(driver);
	}*/
	}