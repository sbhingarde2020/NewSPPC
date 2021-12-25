package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AddNewAttendanceIntegrationConfiguration;
import com.spp.pages.DeleteAttendanceIntegrationConfiguration;
import com.spp.pages.EditAttendanceIntegrationConfiguration;
import com.spp.pages.UpdatedefaultFormatAttendanceIntegrationConfiguration;

import junit.framework.Assert;

public class AttendanceIntegration extends BaseTest{
	
	@Test(priority = 0)
	public void AddNewAttendanceIntegrationConfiguration_SC_490() throws Exception{
		AddNewAttendanceIntegrationConfiguration agm = new AddNewAttendanceIntegrationConfiguration(driver);
		agm.clickonleave();
		agm.clickonAttendanceIntegration();
		Thread.sleep(2000);
		agm.clickonAddNewAttendanceIntegration();
		Thread.sleep(2000);
		agm.writeFormatName("Attendance Format123");
		Thread.sleep(2000);
		agm.changeFileType();
		Thread.sleep(2000);
		agm.addSampleFile("C:\\Users\\alfalabs\\Desktop\\AttendanceIntegration.txt");
		Thread.sleep(2000);
		agm.writeStartingrow("1");
		agm.clickNext();
		Thread.sleep(2000);
		agm.checkConsiderLeaveAbbreviation();
		Thread.sleep(2000);
		agm.clickSave();
		Thread.sleep(2000);
		String s = agm.getMessage();
 		Assert.assertEquals(s, "Attendance Format was successfully created.");
 		Thread.sleep(2000);
 		agm.clickonleave();
 		Thread.sleep(2000);
		agm.clickonAttendanceIntegration();
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void EditAttendanceIntegrationConfiguration_SC_491() throws Exception{
		EditAttendanceIntegrationConfiguration anmm = new EditAttendanceIntegrationConfiguration(driver);
		anmm.clickonleave();
		anmm.clickonAttendanceIntegration();
		Thread.sleep(2000);
		anmm.editAttendanceFormat();
		Thread.sleep(2000);
		anmm.writeFormatName("Attendance Format1234");
		Thread.sleep(2000);
		anmm.writeStartingrow("2");
		Thread.sleep(2000);
		anmm.clickNext();
		Thread.sleep(2000);
		anmm.clickUpdate();
		Thread.sleep(2000);
		String s = anmm.getMessage();
 		Assert.assertEquals(s, "Attendance Format was successfully updated");
 		Thread.sleep(2000);
 		anmm.clickonleave();
 		Thread.sleep(2000);
		anmm.clickonAttendanceIntegration();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void UpdatedefaultFormatAttendanceIntegrationConfiguration_SC_493() throws Exception{
		UpdatedefaultFormatAttendanceIntegrationConfiguration anmm = new UpdatedefaultFormatAttendanceIntegrationConfiguration(driver);
		anmm.clickonleave();
		anmm.clickonAttendanceIntegration();
		Thread.sleep(2000);
		anmm.clickondefaultbtn();
		Thread.sleep(2000);
		anmm.clickonUpdatebtn();
		String s = anmm.getMessage();
 		Assert.assertEquals(s, "Default Format was successfully updated.");
 		Thread.sleep(2000);
 		anmm.clickonleave();
 		Thread.sleep(2000);
		anmm.clickonAttendanceIntegration();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void DeleteAttendanceIntegrationConfiguration_SC_492() throws Exception{
		DeleteAttendanceIntegrationConfiguration asd = new DeleteAttendanceIntegrationConfiguration(driver); 
		asd.clickonleave();
		asd.clickonAttendanceIntegration();
		Thread.sleep(2000);
		asd.deleteAttendanceFormat();
		Thread.sleep(2000);
		String s = asd.getMessage();
 		Assert.assertEquals(s, "Attendance Format was successfully deleted");
 		Thread.sleep(2000);
	}
}