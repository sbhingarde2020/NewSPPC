package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddCloneSalaryStructure;
import com.spp.pages.AddSalaryHead;
import com.spp.pages.AddSalaryStructure;
import com.spp.pages.AddSalaryStructureNotBasedOnGross;
import com.spp.pages.AssignSalaryHead;
import com.spp.pages.CheckAddingSalaryHeadIsAnEarningOrDeductionhead;
import com.spp.pages.CheckOpenComponentAndCalculativeField;
import com.spp.pages.CheckOpenComponentCalculativeFieldDeductionField;
import com.spp.pages.DeleteAssignedSalaryHead;
import com.spp.pages.DeleteSalaryHead;
import com.spp.pages.DeleteSalaryStructure;
import com.spp.pages.EditAssignedSalaryHead;
import com.spp.pages.EditSalaryHead;
import com.spp.pages.EditSalaryStructure;
import com.spp.pages.SalaryHeadExcelUpload;

public class SalaryHeadTestcase extends BaseTest {
	
	@Test(priority=0)
	public void verifycreatedSalaryHead_SC_1() throws Exception{
		AddSalaryHead sh=new AddSalaryHead(driver);
		Thread.sleep(5000);
		sh.navigateMaster();
		sh.clickSalaryHeadsLink();
		sh.clickAddSalaryHeadsLink();
		sh.enterSalaryHeadName("Education Allowance");
		sh.enterSalaryHeadShortName("EA2");
		sh.clickOpenComponentRadioButton();
		sh.clickCalcultaiveFieldRadioButton();
		sh.clickConsiderForGratuity();
		sh.clickConsiderForLeaveEncahment();
		sh.clickCreateSalaryHeadButton();
		String s=sh.getMessage();
		Assert.assertEquals(s, "Salary head successfully created");
	}
	@Test(priority=1)
	public void verifyEditedSalaryHead_SC_2() throws Exception{
		EditSalaryHead es=new EditSalaryHead(driver);
		es.navigateMaster();
		es.clickSalaryHeadsLink();
		es.clickEditSalaryHeadsLink();
		es.enterSalaryHeadName("Education Allowance");
		es.enterSalaryHeadShortName("EDU2");
		es.clickOpenComponentRadioButton();
		es.clickCalcultaiveFieldRadioButton();
		es.clickConsiderForLeaveEncahment();
		es.clickConsiderForGratuity();
		es.clickUpdateButton();
		String s=es.getMessage();
		Assert.assertEquals(s, "Salary head succesfully updated");
	}
	@Test(priority=2)
	public void verifyDeletedSalaryHead_SC_3() throws Exception{
		DeleteSalaryHead ds=new DeleteSalaryHead(driver);
		ds.navigateMaster();
		ds.clickSalaryHeadsLink();
		ds.clickDeleteSalaryHeadsButton();
		ds.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		ds.clickDeleteSalaryHeadsButton();
		ds.switchToPopUpAndAccept(driver);
		Thread.sleep(2000);
		String s=ds.getMessage();
		Assert.assertEquals(s, "Salary head successfully deleted");
	}
	@Test(priority=3)
  	public void CheckAddingSalaryHeadIsAnEarningOrDeductionhead_SC_230() throws Exception{
    	CheckAddingSalaryHeadIsAnEarningOrDeductionhead sh=new CheckAddingSalaryHeadIsAnEarningOrDeductionhead(driver);
  		Thread.sleep(5000);
  		sh.navigateMaster();
  		sh.clickSalaryHeads();
  		Thread.sleep(2000);
  		sh.clickAddNewSalaryHead1();
  		sh.clickHeadName("Earning1");
  		sh.clickShortName("EA1");
  		sh.clickEarnings();
  		sh.clickcreateSalaryHeadButton();
  		String q = sh.getMessage();
  		Assert.assertEquals(q, "Salary head successfully created");
  		sh.navigateMaster();
  		//sh.navigateMaster();
  		//sh.navigateMaster();
  		sh.clickSalaryHeads();
  		sh.clickAddNewSalaryHead1();
  		sh.clickHeadName("Deduction1");
  		sh.clickShortName("DE1");
  		sh.clickDeductionBox();
  		sh.clickcreateSalaryHeadButton();
  		String s = sh.getMessage();
  		Assert.assertEquals(s, "Salary head successfully created");
  		sh.clickDeductionTab();
  		Thread.sleep(5000);
  		sh.navigateMaster();
  		sh.clickSalaryHeads();
  	}
	@Test(priority=4)
   	public void CheckOpenComponentAndCalculativeField_SC_231() throws Exception{
    	CheckOpenComponentAndCalculativeField sh=new CheckOpenComponentAndCalculativeField(driver);
   		Thread.sleep(5000);
   		sh.navigateMaster();
   		sh.clickSalaryHeads();
   		sh.clickEdit();
   		Thread.sleep(5000);
   		sh.clickOpenComponent();
   		sh.clickCalculativeField();
   		sh.clickUpdateSalaryHeadButton();
   		String a=sh.getMessage();
   		Assert.assertEquals(a, "Salary head succesfully updated");
   		String b = sh.Earning1CheckYesOpenComponent();
   		Assert.assertEquals(b, "Yes");
   		String c = sh.Earning1CheckYesCalculativeField();
   		Assert.assertEquals(c, "Yes");
	}
	@Test(priority=5)
    public void CheckOpenComponentCalculativeFieldDeductionField_SC_427() throws Exception{
    	CheckOpenComponentCalculativeFieldDeductionField sh=new CheckOpenComponentCalculativeFieldDeductionField(driver);
   		Thread.sleep(5000);
   		sh.navigateMaster();
   		sh.clickSalaryHeads();
   		sh.earningSalaryHeadDelete();
   		sh.switchToPopUpAndAccept(driver);
   		Thread.sleep(5000);
   		sh.clickOnDeductionTab();
   		sh.clickEdit();
   		Thread.sleep(3000);
   		sh.clickOpenComponent();
   		sh.clickCalculativeField();
   		sh.clickUpdateSalaryHeadButton();
   		String a=sh.getMessage();
   		Assert.assertEquals(a, "Salary head succesfully updated");
   		sh.clickOnDeductionTab1();
   		String b = sh.deduction1CheckYesOpenComponent();
   		Assert.assertEquals(b, "Yes");
   		String c = sh.deduction1CheckYesCalculativeField();
   		Assert.assertEquals(c, "Yes");
   		sh.deductionSalaryHeadDelete();
   		sh.switchToPopUpAndAccept(driver);
    }
	@Test(priority=6)
 	public void SalaryHeadExcelUpload_SC_4() throws Exception{
    	SalaryHeadExcelUpload sh=new SalaryHeadExcelUpload(driver);
 		Thread.sleep(5000);
 		sh.navigateMaster();
 		sh.clickSalaryHeads();
 		sh.clickGenerateSampleTemplate();
 		sh.clickExcelTemplateUploadLink();
 		sh.clickChooseFile("C:\\Users\\alfalabs\\Downloads\\SalaryHead.xlsx");
 		Thread.sleep(3000);
 		sh.clickUploadLink();
 		String z=sh.getMessage();
 		Assert.assertEquals(z, "Template has been uploaded successfully.");
 		Thread.sleep(8000);
 		sh.navigateMaster();
   		sh.clickSalaryHeads();
   		sh.earningSalaryHeadDelete();
   		sh.switchToPopUpAndAccept(driver);
 		sh.clickDeductionTab();
 		sh.deductionSalaryHeadDelete();          //to rerun this testcase delete previous data from salary head>earnings,deduction//	or change data in excel file. 
 		sh.switchToPopUpAndAccept(driver);
	}
	
	@Test(priority=7)
 	public void verifyCreatedSalaryStructure_SC_28() throws Exception{
 		AddSalaryStructure ss=new AddSalaryStructure(driver);
 		ss.navigateMaster();
 		ss.clickSalaryStructureLink();
 		ss.clickAddSalaryStructureLink();	
 		ss.enterSalaryStructureName("SALARYSTRUCTURE");
 		ss.clickBasedOnGross();
 		ss.clickCreateButton();
 		String s=ss.getMessage();
 		Assert.assertEquals(s, "Salary group successfully created");
	}
	@Test(priority=8)
    public void AddSalaryStructureNotBasedOnGross_SC_29() throws Exception{
  		AddSalaryStructureNotBasedOnGross ss=new AddSalaryStructureNotBasedOnGross(driver);
  		Thread.sleep(5000);
  		ss.navigateMaster();
  		ss.clickSalaryStructureLink();
  		ss.clickAddSalaryStructureLink();
  		ss.enterSalaryStructureName("New Structure_"+Utility.getRandNum(4000, 5000));  
  		ss.clickCreateButton();
  		String s=ss.getMessage();
  		Assert.assertEquals(s, "Salary group successfully created");
  		ss.clickDeleteButton();
	}
	@Test(priority=9)
	public void verifyEditedSalaryStructure_SC_428() throws Exception{
		EditSalaryStructure es=new EditSalaryStructure(driver);
		Thread.sleep(5000);
		es.navigateMaster();
		es.clickSalaryStructureLink();
		es.clickEditSalaryStructureLink();
		es.enterSalaryStructureName("SALARYSTRUCTURE");
		es.clickBasedOnGross();
		es.clickUpdateSalaryStructureButton();
		String s=es.getMessage();
		Assert.assertEquals(s, "Salary group succesfully updated");
	}
	@Test(priority=10)
	public void verifyAssignedSalaryHead_SC_30() throws Exception{
		AssignSalaryHead sh=new AssignSalaryHead(driver);
		Thread.sleep(5000);
		sh.navigateMaster();
		sh.clickSalaryStructureLink();
		sh.clickSettingsLink();
		sh.clickAssignedHeadLink();
		sh.selectSalaryHead("Basic");
		sh.selectCalculationType("Lumpsum");
		sh.selectBasedOn("Pay Days");
		sh.clickPFApplicabilty();
		sh.clickESIApplicabilty();
		sh.selectRoundOff("Actual");
		sh.enterEffectiveDate("Apr/2013");
		Thread.sleep(5000);
		sh.clickCreateSalaryGroupDetailButton();
		String s=sh.getMessage();
		Assert.assertEquals(s, "Salary structure detail successfully created");
	}
	@Test(priority=11)
  	public void verifyCloneSalaryStructure_SC_245() throws Exception{
  		AddCloneSalaryStructure cs=new AddCloneSalaryStructure(driver);
  		Thread.sleep(5000);
  		cs.navigateMaster();
  		cs.clickSalaryStructureLink();
  		Thread.sleep(5000);
  		cs.clickCloneSalaryStructure();
  		Thread.sleep(4000);
  		cs.enterSalaryStructureName("Clone 22_"+Utility.getRandNum(4000, 5000));
  		cs.clickCloneOfDropDown();
  		cs.selectCloneOfDropDown();
  		cs.clickCreateSalaryStructure();
 		String s=cs.getMessage();
		Assert.assertEquals(s, "Salary Structure clone has been successfully created");
	}
	@Test(priority=12)
  	public void verifyEditedAssignedSalaryHead_SC_429() throws Exception{
  		EditAssignedSalaryHead ea=new EditAssignedSalaryHead(driver);
  		ea.navigateMaster();
  		ea.clickSalaryStructureLink();
  		ea.clickSettingsLink();
  		ea.clickEditLink();
  		ea.selectCalculationType("Not Applicable");
  		ea.selectBasedOn("Independent Days");
  		ea.selectRoundOff("Actual");
  		ea.clickPFApplicabilty();
  		ea.clickESIApplicabilty();
  		ea.clickUpdateSalaryGroupDetail();
  		String s=ea.getMessage();
  		Assert.assertEquals(s, "Salary structure detail succesfully updated");
  	}
	@Test(priority=13)
	public void verifyDeleteAssignedHead_SC_251() throws Exception{
	 	DeleteAssignedSalaryHead da=new DeleteAssignedSalaryHead(driver);
	 	da.navigateMaster();
	 	da.clickSalaryStructureLink();
	 	da.clickSettingsLink();
		//da.edittoaddgroup();
	 	//da.updatesalarygroup();
	 	da.clickDeleteSalaryHead();
	 	da.switchToPopUpAndAccept(driver);
	 	String s=da.salaryheadcantbedeleted();
	 	Assert.assertEquals(s, "Selected salary structure detail can't be deleted.");
	 	Thread.sleep(2000);
	 	da.clickEditIconLink();
	 	da.selectCalculationType("Not Applicable");
	 	da.clickUpdateSalaryGroupDetail();
	 	Thread.sleep(2000);
	 	da.clickDeleteSalaryHead();
	 	da.switchToPopUpAndDismiss();
	 	Thread.sleep(2000);
	 	da.clickDeleteSalaryHead();
	 	da.switchToPopUpAndAccept(driver);
	 	String sa=da.getMessage();
	 	Assert.assertEquals(sa, "Salary structure detail successfully destroyed");
	}
	@Test(priority=14)
  	public void verifyDeletedSalaryStructure_SC_252() throws Exception{
  		DeleteSalaryStructure ss=new DeleteSalaryStructure(driver);
  		Thread.sleep(5000);
  		ss.navigateMaster();
  		ss.clickSalaryStructureLink();
  		ss.clickSettingsLink();
 		Thread.sleep(2000);
 		ss.clickDeleteSalaryHead();
 		Thread.sleep(2000);
  		String s=ss.getMessage();
  		Assert.assertEquals(s, "Salary structure detail successfully destroyed");
  		ss.navigateMaster();
  		ss.clickSalaryStructureLink();
  		ss.clickDeleteSalaryStructure();
  		Thread.sleep(2000);
  		ss.clickDeleteSalaryStructure1();
  		String d=ss.salarygroupdelete();
  		Assert.assertEquals(d, "Salary group succesfully deleted");
	}							  
}