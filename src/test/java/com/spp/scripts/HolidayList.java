package com.spp.scripts;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.ExcelUtil;
//import com.spp.common.ExcelUtil;
import com.spp.generics.Utility;
import com.spp.pages.CreateHolidayList;
import com.spp.pages.CreateHolidayUnderBranch;
import com.spp.pages.DeleteHoliday;
import com.spp.pages.DisablingEnablingHolidayFromBranch;
import com.spp.pages.ExcelUploadforHolidays;
import com.spp.pages.UpdateHolidayList;

public class HolidayList extends BaseTest {
	
	private static final String SheetName = null;
	private static String excelFile  = "C:\\Users\\Administrator\\Downloads\\HolidayMaster.xlsx";
	private static ExcelUtil newEx = null;

	@Test(priority=0)
	public void verifyCreatedHoliday_SC_40(){
		CreateHolidayList hl=new CreateHolidayList(driver);
		hl.clickMastserLink();
		hl.selectHolidayList();
		hl.clickView();
		hl.clickAddHoliday();
		hl.enterDate("25 February 2018");
		hl.enterDescription("MahaShivaratri");
		hl.clickCreateButton();
		String s=hl.getMessage();
		Assert.assertEquals(s, "Holiday Master List successfully created");
		}
	
   @Test(priority=1)
   public void verifyUpdatedHolidayList_SC_42(){
	   UpdateHolidayList uh=new UpdateHolidayList(driver);
	   uh.clickMastserLink();
	   uh.selectHolidayList();
	   uh.clickView();
	   uh.clickEditLink();
	   uh.enterDate("25 February 2018");
	   uh.enterDescription("Shivaratri");
	   uh.clickUpdateHoliday();
	   String s=uh.getMessage();
	   Assert.assertEquals(s, "Holiday Master List successfully updated");
	   }

   @Test(priority=2)
   public void verifyDisablingEnablingHolidayFromBranch_SC_44() throws InterruptedException{
	   DisablingEnablingHolidayFromBranch hl=new DisablingEnablingHolidayFromBranch(driver);
	   hl.clickMastserLink();
	   hl.selectHolidayList();
	   hl.clickView();
	   hl.clickFirstDisable();
	   String s=hl.getMessage();
	   Assert.assertEquals(s, "Holiday Was successfully updated.");
	   }
 
   @Test(priority=3)
   public void verifyDeletedHolidayList_SC_43() throws InterruptedException{
	   DeleteHoliday dh=new DeleteHoliday(driver);  
	   dh.clickMastserLink();
	   dh.selectHolidayList();
	   dh.clickView();
	   dh.clickDeleteButton();
	   String s=dh.getMessage();
	   Assert.assertEquals(s, "Master holiday successfully deleted.");
	   }
   
   @Test(priority=4)
   public void verifyCreateHolidayUnderBranch_SC_41() throws InterruptedException{
	    CreateHolidayUnderBranch hl=new CreateHolidayUnderBranch(driver);
		hl.clickMastserLink();
		hl.selectHolidayList();
		hl.clickView();
		hl.clickAddHoliday();
		Thread.sleep(5000);
		hl.enterDate("25 December 2018");
		//hl.enterDate(Utility.getRandNum(1, 28)+" "+Utility.getRandLongMon()+" "+Utility.getRandNum(2015, 2017)); 
		Thread.sleep(4000);
		hl.enterDescription("holiday1");
		hl.clickCreateButton();
		String s=hl.getMessage();
		Assert.assertEquals(s, "Holiday Was successfully created");
		Thread.sleep(6000);
		hl.clickDeleteButton();
		} 
   
   @Test(priority=5)
   public void verifyExcelUploadforHolidays_SC_45() throws Exception{
	   ExcelUploadforHolidays uh=new ExcelUploadforHolidays(driver);
	   uh.clickonmaster();
	   uh.clickonholidaylists();
	   uh.clickonview();
	   uh.generatesampletemplate();
	   //Thread.sleep(20000);
	   //ExcelUtil ex=new ExcelUtil(excelFile, "Holiday Master List");
	   //ex.setCellValueExistingExcel(2, 0, "20/8/2018");
	   //ex.setCellValueExistingExcel(2, 1, "Rakshabandhan");
	   //ex.setCellValueExistingExcel(2, 2, "Yes");
	   //ArrayList<String> s=new ArrayList(); 
	   //s.add("abcd");
	   //ex.appendInColumn("A", s);
	   Thread.sleep(2000);
	   uh.exceluploadforholidays();
	   Thread.sleep(2000);
	   uh.choosefile("C:\\Users\\alfalabs\\Downloads\\HolidayMaster.xlsx");
	   uh.uploadfile();
	   Thread.sleep(5000);
	   uh.deleteHoliday();
	   }
}