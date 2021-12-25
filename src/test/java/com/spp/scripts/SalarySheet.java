package com.spp.scripts;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.GenerateSalarySheet;

public class SalarySheet extends BaseTest{
	
	@Test(priority=0)
	public void GenerateSalarySheet_SC_1320() throws Exception{
		GenerateSalarySheet gs = new GenerateSalarySheet(driver);
		gs.selectReports();
		gs.selectSalarySheet();
		gs.selectPayMonth("Dec/2018");
		gs.selectGetEmployee();
		Thread.sleep(5000);
		gs.selectLoad();
		gs.selectemployee();
		gs.selectgroupby("Attendance");
		gs.selectorderby("Employee Name");
		gs.selectGenerateReport();
		Thread.sleep(5000);
		System.out.println("Report downloaded");
	}
	@Test(priority=1)
	public void GenerateSalarySheetSalarySheetReportTypeExcel_SC_1321() throws Exception {
		GenerateSalarySheet gs = new GenerateSalarySheet(driver);
		gs.selectReports();
		gs.selectSalarySheet();
		gs.selectPayMonth("Dec/2018");
		gs.selectExcel();
		gs.selectGetEmployee();
		Thread.sleep(5000);
		gs.selectLoad();
		gs.selectemployee();
		gs.selectgroupby("Attendance");
		gs.selectorderby("Employee Name");
		gs.selectGenerateReport();
		Thread.sleep(5000);
		System.out.println("Report downloaded");
	}
	@Test(priority=2)
	public void GenerateSalarySheetHoldSalary_SC_1322() throws Exception {
		GenerateSalarySheet gs = new GenerateSalarySheet(driver);
		gs.selectReports();
		gs.selectSalarySheet();
		gs.selectreport("Hold Salary");
		gs.selectPayMonth("Jan/2019");
		gs.selectpdf();
		gs.selectGetEmployee();
		Thread.sleep(5000);
		gs.selectLoad();
		gs.selectemployee();
		gs.selectgroupby("Attendance");
		gs.selectorderby("Employee Name");
		gs.selectGenerateReport();
		Thread.sleep(5000);
		System.out.println("Report downloaded");
		
	}
	@Test(priority=3)
	public void GenerateSalarySheetHoldSalaryReporttypeExcel_SC_1323() throws Exception {
		GenerateSalarySheet gs = new GenerateSalarySheet(driver);
		gs.selectReports();
		gs.selectSalarySheet();
		gs.selectreport("Hold Salary");
		gs.selectPayMonth("Jan/2019");
		gs.selectExcel();
		gs.selectGetEmployee();
		Thread.sleep(5000);
		gs.selectLoad();
		gs.selectemployee();
		gs.selectgroupby("Attendance");
		gs.selectorderby("Employee Name");
		gs.selectGenerateReport();
		Thread.sleep(5000);
		System.out.println("Report downloaded");
	}
	@Test(priority=4)
	public void GenerateSalarySheetReleaseSalary_SC_1324() throws Exception {
		GenerateSalarySheet gs = new GenerateSalarySheet(driver);
		gs.selectReports();
		gs.selectSalarySheet();
		gs.selectreport("Release Salary");
		gs.selectPayMonth("Oct/2018");
		gs.selectGetEmployee();
		Thread.sleep(5000);
		gs.selectLoad();
		gs.selectemployee();
		gs.selectgroupby("Attendance");
		gs.selectorderby("Employee Name");
		gs.selectGenerateReport();
		Thread.sleep(5000);
		System.out.println("Report downloaded");
	}
	@Test(priority=5)
	public void GenerateSalarySheetReleaseSalaryReportTypeExcel_SC_1325() throws Exception {
		GenerateSalarySheet gs = new GenerateSalarySheet(driver);
		gs.selectReports();
		gs.selectSalarySheet();
		gs.selectreport("Release Salary");
		gs.selectPayMonth("Oct/2018");
		gs.selectExcel();
		gs.selectGetEmployee();
		Thread.sleep(5000);
		gs.selectLoad();
		gs.selectemployee();
		gs.selectgroupby("Attendance");
		gs.selectorderby("Employee Name");
		gs.selectGenerateReport();
		Thread.sleep(5000);
		System.out.println("Report downloaded");
	}
	@Test(priority=6)
	public void GenerateSalarySheetAllComponentsReportTypeExcel_SC_1326() throws Exception {
		GenerateSalarySheet gs = new GenerateSalarySheet(driver);
		gs.selectReports();
		gs.selectSalarySheet();
		gs.selectreport("All Components");
		gs.selectPayMonth("Dec/2018");
		gs.selectExcel();
		gs.selectGetEmployee();
		Thread.sleep(5000);
		gs.selectLoad();
		gs.selectemployee();
		gs.selectgroupby("Attendance");
		gs.selectorderby("Employee Name");
		gs.selectGenerateReport();
		Thread.sleep(5000);
		System.out.println("Report downloaded");
	}
	@Test(priority=7)
	public void GenerateSalarySheetFlatSalaryReportTypeExcel_SC_1327() throws Exception {
		GenerateSalarySheet gs = new GenerateSalarySheet(driver);
		gs.selectReports();
		gs.selectSalarySheet();
		gs.selectreport("Flat Salary");
		gs.selectPayMonth("Dec/2018");
		gs.selectExcel();
		gs.selectGetEmployee();
		Thread.sleep(5000);
		gs.selectLoad();
		gs.selectemployee();
		gs.selectgroupby("Attendance");
		gs.selectorderby("Employee Name");
		gs.selectGenerateReport();
		Thread.sleep(5000);
		System.out.println("Report downloaded");
	}
	@Test(priority=8)
	public void GenerateSalarySheetTheoreticalSalaryReportTypeExcel_SC_1328() throws Exception {
		GenerateSalarySheet gs = new GenerateSalarySheet(driver);
		gs.selectReports();
		gs.selectSalarySheet();
		gs.selectreport("Theoretical Salary");
		gs.selectPayMonth("Dec/2018");
		gs.selectExcel();
		gs.selectGetEmployee();
		Thread.sleep(5000);
		gs.selectLoad();
		gs.selectemployee();
		gs.selectgroupby("Attendance");
		gs.selectorderby("Employee Name");
		gs.selectGenerateReport();
		Thread.sleep(5000);
		System.out.println("Report downloaded");
	}
}
