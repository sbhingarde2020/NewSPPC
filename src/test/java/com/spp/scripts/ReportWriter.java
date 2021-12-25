package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.*;

public class ReportWriter extends BaseTest{
	@Test(priority=0)
	public void GenerateReportWriterGroupByPaymonthandDepartmentandAttendance_SC_1476() throws Exception{
		GenerateReportWriterGroupByPaymonthandDepartmentandAttendance ab = new GenerateReportWriterGroupByPaymonthandDepartmentandAttendance(driver);
		ab.resizeWindow();
		Thread.sleep(2000);
		ab.clickReport();
		ab.clickReportWriter();
		ab.clickPayMonth();
		ab.tickPayMonthCheckbox();
		ab.clickClassificationDetails();
		Thread.sleep(2000);
		ab.clickAttendanceCheckbox();
		Thread.sleep(2000);
		ab.clickDepartmentCheckbox();
		Thread.sleep(2000);
		ab.clickAdditionalInformation();
		ab.clickDateofJoining();
		ab.clickEmployees();
		ab.clickonfilter();
		Thread.sleep(2000);
		ab.clickonload();
		Thread.sleep(2000);
		ab.selectEmployee();
		ab.selectGrouping1("Paymonth");
		Thread.sleep(2000);
		ab.selectGrouping2("Department");
		Thread.sleep(2000);
		ab.selectGrouping3("Attendance");
		Thread.sleep(2000);
		ab.clickonGenerate();
		Thread.sleep(2000);
		ab.exitFullscreen();
		Thread.sleep(2000);
		}
	@Test(priority=1)
	public void GenerateReportWriterGroupByPaymonthandDepartmentandBankName_SC_1477() throws Exception{
		GenerateReportWriterGroupByPaymonthandDepartmentandBankName ac = new GenerateReportWriterGroupByPaymonthandDepartmentandBankName(driver);
		ac.resizeWindow();
		Thread.sleep(2000);
		ac.clickReport();
		ac.clickReportWriter();
		ac.clickPayMonth();
		ac.tickPayMonthCheckbox();
		ac.clickClassificationDetails();
		Thread.sleep(2000);
		ac.clickBankNameCheckbox();
		Thread.sleep(2000);
		ac.clickDepartmentCheckbox();
		Thread.sleep(2000);
		ac.clickAdditionalInformation();
		ac.clickDateofJoining();
		ac.clickEmployees();
		ac.clickonfilter();
		Thread.sleep(2000);
		ac.clickonload();
		Thread.sleep(2000);
		ac.selectEmployee();
		ac.selectGrouping1("Paymonth");
		Thread.sleep(2000);
		ac.selectGrouping2("Department");
		Thread.sleep(2000);
		ac.selectGrouping3("Bank Name");
		Thread.sleep(2000);
		ac.clickonGenerate();
		Thread.sleep(2000);
		ac.exitFullscreen();
		Thread.sleep(2000);
		}
	@Test(priority=2)
	public void GenerateReportWriterGroupByPaymonthandDepartmentandBranch_SC_1478() throws Exception{
		GenerateReportWriterGroupByPaymonthandDepartmentandBranch ad = new GenerateReportWriterGroupByPaymonthandDepartmentandBranch(driver);
		ad.resizeWindow();
		Thread.sleep(2000);
		ad.clickReport();
		ad.clickReportWriter();
		ad.clickPayMonth();
		ad.tickPayMonthCheckbox();
		ad.clickClassificationDetails();
		Thread.sleep(2000);
		ad.clickBranchCheckbox();
		Thread.sleep(2000);
		ad.clickDepartmentCheckbox();
		Thread.sleep(2000);
		ad.clickAdditionalInformation();
		ad.clickDateofJoining();
		ad.clickEmployees();
		ad.clickonfilter();
		Thread.sleep(2000);
		ad.clickonload();
		Thread.sleep(2000);
		ad.selectEmployee();
		ad.selectGrouping1("Paymonth");
		Thread.sleep(2000);
		ad.selectGrouping2("Department");
		Thread.sleep(2000);
		ad.selectGrouping3("Branch");
		Thread.sleep(2000);
		ad.clickonGenerate();
		Thread.sleep(2000);
		ad.exitFullscreen();
		Thread.sleep(2000);
		}
	@Test(priority=3)
	public void GenerateReportWriterGroupByPaymonthandDepartmentandSalStructure_SC_1479() throws Exception{
		GenerateReportWriterGroupByPaymonthandDepartmentandSalStructure ae = new GenerateReportWriterGroupByPaymonthandDepartmentandSalStructure(driver);
		ae.resizeWindow();
		Thread.sleep(2000);
		ae.clickReport();
		ae.clickReportWriter();
		ae.clickPayMonth();
		ae.tickPayMonthCheckbox();
		ae.clickClassificationDetails();
		Thread.sleep(2000);
		ae.clickSalStructureCheckbox();
		Thread.sleep(2000);
		ae.clickDepartmentCheckbox();
		Thread.sleep(2000);
		ae.clickAdditionalInformation();
		ae.clickDateofJoining();
		ae.clickEmployees();
		ae.clickonfilter();
		Thread.sleep(2000);
		ae.clickonload();
		Thread.sleep(2000);
		ae.selectEmployee();
		ae.selectGrouping1("Paymonth");
		Thread.sleep(2000);
		ae.selectGrouping2("Department");
		Thread.sleep(2000);
		ae.selectGrouping3("Sal Structure");
		Thread.sleep(2000);
		ae.clickonGenerate();
		Thread.sleep(2000);
		ae.exitFullscreen();
		Thread.sleep(2000);
		}
	@Test(priority=4)
	public void GenerateReportWriterGroupByPaymonthandDepartmentandDesignation_SC_1480() throws Exception{
		GenerateReportWriterGroupByPaymonthandDepartmentandDesignation af = new GenerateReportWriterGroupByPaymonthandDepartmentandDesignation(driver);
		af.resizeWindow();
		Thread.sleep(2000);
		af.clickReport();
		af.clickReportWriter();
		af.clickPayMonth();
		af.tickPayMonthCheckbox();
		af.clickClassificationDetails();
		Thread.sleep(2000);
		af.clickDesignationCheckbox();
		Thread.sleep(2000);
		af.clickDepartmentCheckbox();
		Thread.sleep(2000);
		af.clickAdditionalInformation();
		af.clickDateofJoining();
		af.clickEmployees();
		af.clickonfilter();
		Thread.sleep(2000);
		af.clickonload();
		Thread.sleep(2000);
		af.selectEmployee();
		af.selectGrouping1("Paymonth");
		Thread.sleep(2000);
		af.selectGrouping2("Department");
		Thread.sleep(2000);
		af.selectGrouping3("Designation");
		Thread.sleep(2000);
		af.clickonGenerate();
		Thread.sleep(2000);
		af.exitFullscreen();
		Thread.sleep(2000);
		}
	@Test(priority=5)
	public void GenerateReportWriterGroupByPaymonthandDepartmentandOccupation_SC_1481() throws Exception{
		GenerateReportWriterGroupByPaymonthandDepartmentandOccupation ag = new GenerateReportWriterGroupByPaymonthandDepartmentandOccupation(driver);
		ag.resizeWindow();
		Thread.sleep(2000);
		ag.clickReport();
		ag.clickReportWriter();
		ag.clickPayMonth();
		ag.tickPayMonthCheckbox();
		ag.clickClassificationDetails();
		Thread.sleep(2000);
		ag.clickDesignationCheckbox();
		Thread.sleep(2000);
		ag.clickDepartmentCheckbox();
		Thread.sleep(2000);
		ag.clickAdditionalInformation();
		ag.clickDateofJoining();
		ag.clickEmployees();
		ag.clickonfilter();
		Thread.sleep(2000);
		ag.clickonload();
		Thread.sleep(2000);
		ag.selectEmployee();
		ag.selectGrouping1("Paymonth");
		Thread.sleep(2000);
		ag.selectGrouping2("Department");
		Thread.sleep(2000);
		ag.selectGrouping3("Designation");
		Thread.sleep(2000);
		ag.clickonGenerate();
		Thread.sleep(2000);
		ag.exitFullscreen();
		Thread.sleep(2000);
		}
}