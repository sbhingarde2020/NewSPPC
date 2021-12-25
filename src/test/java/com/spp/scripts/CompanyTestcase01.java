package com.spp.scripts;
import junit.framework.Assert;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;

import com.spp.generics.Utility;
import com.spp.pages.AddESIGroup;
import com.spp.pages.AddPFGroup;
import com.spp.pages.AddPTGroup;
import com.spp.pages.AssignPFGroupToBranch;
import com.spp.pages.AssignigESIGroupToBranch;
import com.spp.pages.AssignigPTGroupToBranch;
import com.spp.pages.BranchPage;
import com.spp.pages.DeleteAssignedESIGroupInBranch;
import com.spp.pages.DeleteAssignedPFGroupinBranch;
import com.spp.pages.DeleteAssignedPTGroupInBranch;
import com.spp.pages.DeleteBranch;
import com.spp.pages.DeleteESIGroup;
import com.spp.pages.DeleteESIGroupRate;
import com.spp.pages.DeletePFGroup;
import com.spp.pages.DeletePFGroupRate;
import com.spp.pages.DeletePTGroup;
import com.spp.pages.DeletePTGroupRate;
import com.spp.pages.DeleteUploadedDocument;
import com.spp.pages.DownloadUploadedDocument;
import com.spp.pages.EditAssignedESIGroupInBranch;
import com.spp.pages.EditAssignedPFGroupInBranch;
import com.spp.pages.EditAssignedPTGroupInBranch;
import com.spp.pages.EditBranch;
import com.spp.pages.EditESIAndESIRate;
import com.spp.pages.EditPFGroupandPFRate;
import com.spp.pages.EditPTGroup;
import com.spp.pages.Editcompanydetails;
import com.spp.pages.UploadDownloadDeleteDocument;
import com.spp.pages.UploadaDocument;

public class CompanyTestcase01 extends BaseTest{

	@Test(priority=0)
	public void verifyEditCompany_SC_46C() throws Exception{  
		Editcompanydetails ed=new Editcompanydetails(driver);
		Thread.sleep(5000);
		ed.navigateMaster();
		ed.clickCompanayLink();
		ed.clickEditCompany();
		ed.enterCompanyName("Relyon soft");
		ed.enterResponsiblePerson("Krishna murthy");
		ed.enterEstablishmentDate("05 March 2000");
		ed.enterPhoneNo1("9988776655");
		ed.enterAddress1("#73, Shreelekha Complex");
		ed.enterPhoneNo2("9988776658");
		ed.enterEmail("relyonsoft@gmail.com");
		ed.enterAddress2("West of chord Road, Bengaluru");
		ed.enterAddress3("Karnataka 560086");
		ed.enterWebsite("www.relyon.com");
		ed.selectTAN("ADD TAN");
		ed.selectCompanyType("Public Sector Unit(PSU)");
		ed.enterTANNumber("DCFG12345R");
		ed.updateCompanyButton();
		String s=ed.getMessage();
		Assert.assertEquals(s,"Company was successfully updated.");
	}
	@Test(priority=1)
	public void verifyBranchPage_SC_47_54_55_56() throws Exception{
		BranchPage bp=new BranchPage(driver);
		Thread.sleep(5000);
		bp.navigateMaster();;
		bp.clickCompanayLink();
		bp.clickBranchLink();
		bp.clickAddBranchLink();
		bp.enterBranchName("Chennai");//CHANGE
		bp.enterReponsiblePersonName("Kavitha");
		Thread.sleep(3000);
		bp.enterBranchAddress("Chennai");
		bp.enterBranchState("Tamilnadu");
		bp.clickCreateBranchButton();
		String s=bp.getBranchMessage();
		Assert.assertEquals(s, "Branch was successfully created");
		Thread.sleep(3000);
		bp.clickPFDetail();
		Thread.sleep(3000);
		bp.selectPFGroup("Default");
		Thread.sleep(2000);
		bp.selectmonthoptionPF();
		Thread.sleep(2000);
		bp.selectmonth();
		bp.clickCreatePFDetail();
		String s1=bp.getPFMessage();
		Assert.assertEquals(s1, "PF detail successfully created.");
		Thread.sleep(3000);
		bp.clickESIDetail();
		bp.selectESIGroup("Default");
		Thread.sleep(2000);
		bp.selectmonthoptionESI();
		Thread.sleep(2000);
		bp.selectmonth();
		bp.clickCreateESIdetail();
		String s2=bp.getESIMessage();
		Assert.assertEquals(s2,"ESI detail successfully created.");
		Thread.sleep(5000);
		bp.clickPTDetail();
		Thread.sleep(2000);
		bp.selectPTGroup("Default");
		Thread.sleep(2000);
		bp.selectmonthoptionPT();
		Thread.sleep(2000);
		bp.selectmonth();
		bp.clickCreatePTDetail();
		String s3=bp.getPTMessage();
		Assert.assertEquals(s3, "PT detail successfully created.");
	}
	@Test(priority=2)
	public void veifyUpdatedBranch_SC_177C() throws Exception{
		EditBranch ed=new EditBranch(driver);
		ed.navigateMaster();
		ed.clickCompanayLink();
		ed.clickBranchLink();
		ed.clickEditBranchLink();
		ed.enterBranchName("Chennai");
		ed.enterReponsiblePersonName("Raju");
		ed.enterBranchAddress("#25,CMBT,Chennai");
		ed.clickUpdateBranchButton();
		String s=ed.getMessage();
		Assert.assertEquals(s, "Branch details successfully updated.");
	}
	@Test(priority=3)
	public void verifyEditAssignedPFGroupInBranch_SC_178C() throws Exception{
		EditAssignedPFGroupInBranch db=new EditAssignedPFGroupInBranch(driver);//pf group should be present
		db.navigateMaster();
		db.clickCompanayLink();
		db.clickBranchLink();
		db.clickEditlink();
		db.clickPFDetailTab();
		db.clickEditPFGroup();
		db.editeffectivedate("01 January 2019"); 
		Thread.sleep(2000);
		db.updatepfdetail();
		String s=db.getMessage();
		Assert.assertEquals(s, "PF detail successfully updated.");
	}
	@Test(priority=4)
	public void verifyEditAssignedESIGroupInBranch_SC_179C() throws Exception{
		EditAssignedESIGroupInBranch db=new EditAssignedESIGroupInBranch(driver);//esi group should be present
		db.navigateMaster();
		db.clickCompanayLink();
		db.clickBranchLink();
		db.clickEditlink();
		db.clickESIDetailTab();
		db.clickEditESIGroup();
		db.editeffectivedate("01 January 2019"); 
		Thread.sleep(2000);
		db.updateESIdetail();
		String s=db.getMessage();
		Assert.assertEquals(s, "ESI detail successfully updated.");
	}
	@Test(priority=5)
	public void verifyEditAssignedPTGroupInBranch_SC_180C() throws Exception{
		EditAssignedPTGroupInBranch db=new EditAssignedPTGroupInBranch(driver);//pt group should be present
		db.navigateMaster();
		db.clickCompanayLink();
		db.clickBranchLink();
		db.clickEditlink();
		db.clickPTDetailTab();
		db.clickEditPTGroup();
		db.editeffectivedate("01 January 2019"); 
		Thread.sleep(2000);
		db.updatepTdetail();
		String s=db.getMessage();
		Assert.assertEquals(s, "PT detail successfully updated.");
	} 
	@Test(priority=6)
	public void verifyDeleteAssignedPFGroupInBranch_SC_424() throws Exception{
		DeleteAssignedPFGroupinBranch db=new DeleteAssignedPFGroupinBranch(driver);
		db.navigateMaster();
		db.clickoncompany();
		db.clickonbranch();
		Thread.sleep(1000);
		db.clickonedit();
		Thread.sleep(1000);
		db.clickonpfdetail();
		Thread.sleep(1000);
		db.clickondelete();
		db.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		db.clickondelete();
		db.switchToPopUpAndAccept(driver);
		String s=db.getMessage();
		Assert.assertEquals(s,"PF details successfully deleted.");
	}
	@Test(priority=7)
	public void verifyDeleteAssignedESIGroupInBranch_SC_425() throws Exception{
		DeleteAssignedESIGroupInBranch db=new DeleteAssignedESIGroupInBranch(driver);
		db.navigateMaster();
		db.clickoncompany();
		db.clickonbranch();
		Thread.sleep(1000);
		db.clickonedit();
		Thread.sleep(1000);
		db.clickonESIdetail();
		Thread.sleep(1000);
		db.clickondelete();
		db.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		db.clickondelete();
		db.switchToPopUpAndAccept(driver);
		String s=db.getMessage();
		Assert.assertEquals(s,"ESI details successfully deleted.");	
	}
	@Test(priority=8)
	public void verifyDeleteAssignedPTGroupInBranch_SC_426() throws Exception{
		DeleteAssignedPTGroupInBranch db=new DeleteAssignedPTGroupInBranch(driver);
		db.navigateMaster();
		db.clickoncompany();
		db.clickonbranch();
		Thread.sleep(1000);
		db.clickonedit();
		Thread.sleep(1000);
		db.clickonPTdetail();
		Thread.sleep(1000);
		db.clickondelete();
		db.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		db.clickondelete();
		db.switchToPopUpAndAccept(driver);
		String s=db.getMessage();
		Assert.assertEquals(s,"PT details successfully deleted.");	
	}
	@Test(priority=9)
	public void verifyDeletedBranch_SC_181C() throws Exception{
		DeleteBranch db=new DeleteBranch(driver);
		db.navigateMaster();
		db.clickCompanayLink();
		db.clickBranchLink();
		db.clickDeleteBranchButton();
		db.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		db.clickDeleteBranchButton();
		db.switchToPopUpAndAccept(driver);
		String s=db.getMessage();
		Assert.assertEquals(s, "Branch is successfully destroyed.");
	} 
	@Test(priority=10)
	public void UploadDocument_SC_57() throws Exception{
		UploadaDocument up=new UploadaDocument(driver);//DELETE DOCUMENT BEFORE RUNNING
		up.clickonmaster();
		up.clickoncompany();
		Thread.sleep(2000);
		up.clickondocument();
		Thread.sleep(2000);
		up.addnewdocument();
		up.uploadfile("C:\\Users\\alfalabs\\Documents\\Document1.xlsx");
		Thread.sleep(2000);
		up.enterremarks("Upload file");
		Thread.sleep(2000);
		up.uploadnewdocument();
		String s=up.getMessage();
		Assert.assertEquals(s,"Company Document Was Successfully Uploaded");	
	}
	@Test(priority=11)
	public void DownloadUploadedDocument_SC_183() throws Exception{
		DownloadUploadedDocument du=new DownloadUploadedDocument(driver);
		du.clickonmaster();
		du.clickoncompany();
		Thread.sleep(2000);
		du.clickondocument();
		Thread.sleep(2000);
		du.clickondownload();	
	}
	@Test(priority=12)
	public void verifyDeleteUploadedDocument_SC_184C() throws Exception{
		DeleteUploadedDocument db=new DeleteUploadedDocument(driver);
		db.navigateMaster();
		db.clickCompanayLink();
		db.clickDocumentLink();
		db.clickDeleteButton();
		String f=db.getMessage();
		Assert.assertEquals(f, "Company Document Was Successfully Deleted");
	}
}