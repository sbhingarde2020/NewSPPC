package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class PTChallanMaharashtraNewFormatPreconditions extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Company Statutories']")
	WebElement companystatutorylink;
	@FindBy(xpath="//a[text()='PT Group']")
	WebElement ptlink;
	@FindBy(xpath="//a[text()='Add New PT Group']")
	WebElement addptlink;
	@FindBy(id="pt_group_id")
	WebElement ptgroupname;
	@FindBy(id="pt_group_state_id")
	WebElement state;
	@FindBy(id="pt_group_address")
	WebElement ptaddress;
	@FindBy(id="pt_group_pto_circle_no")
	WebElement ptocirclenum;
	@FindBy(id="pt_group_certificate_no")
	WebElement certificatenum;
	@FindBy(id="pt_group_return_period")
	WebElement returnperiod;
	@FindBy(xpath="//input[@value='Create PT Group']")
	WebElement creatept;
	@FindBy(xpath="(//span[normalize-space(text()='PT Rate')])[6]")
	WebElement ptratelink;
	@FindBy(id="pt_group_rate_paymonth_id")
	WebElement effectivefrom;
	@FindBy(xpath="//input[@value='Create PT Group Rate']")
	WebElement createptgrouprate;
	@FindBy(xpath="//a[text()='Settings']")
	WebElement settingslink;
	@FindBy(xpath="//button[text()='Fill Default']")
	WebElement filldefaultbutton;
	@FindBy(xpath="//strong[text()='Default PT Slab Successfully Created.']")
	WebElement successfullMessage1;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/li[2]/a")
	WebElement banchlink;
	@FindBy(xpath="//a[text()='Add New Branch']")
	WebElement addbranchlink;
	@FindBy(id="branch_branch_name")
	WebElement branchname;
	@FindBy(id="branch_responsible_person")
	WebElement responsibleperson;
	@FindBy(id="branch_address")
	WebElement branchadd;
	@FindBy(id="branch_state_id")
	WebElement branchstate;
	@FindBy(xpath="//input[@value='Create Branch']")
	WebElement createbranch;
	@FindBy(xpath="(//span[normalize-space(text()='PT Detail')])[8]")
	WebElement ptdetail;
	@FindBy(id="pt_detail_pt_group_id")
	WebElement ptgroupdropdown;
	@FindBy(id="pt_effective_date")
	WebElement pteffdate;
	@FindBy(xpath="//input[@value='Create PT Detail']")
	WebElement createptdetail;
	@FindBy(xpath="//strong[text()='PT detail successfully created.']")
	WebElement successfullPTMessage;
	@FindBy(xpath="//strong[text()='Branch was successfully created']")
	WebElement successfullBranchMessage;
	@FindBy(id="emp_detail")
	WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement EmployeeDetails;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/ul/li[1]/a")
	WebElement AddNewEmployee;
	@FindBy(id="employee_emp_id")
	WebElement EnterEmployeeId;
	@FindBy(id="employee_refno")
	WebElement EnterEmployeeRefNo;
	@FindBy(id="employee_empname")
	WebElement EnterEmployeeName;
	@FindBy(id="employee_father_name")
	WebElement EnterFatherName;
	@FindBy(id="dob")
	WebElement EnterDOB;
	@FindBy(id="employee_gender")
	WebElement Gender;
	@FindBy(id="marital_status")
	WebElement MaritalStatus;
	@FindBy(id="doj")
	WebElement EnterDOJ;
	@FindBy(id="sal_date")
	WebElement EnterSalDate;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/nav/ul/li[1]/a/span")
	WebElement clickPresentAdd;
	@FindBy(id="employee_present_state_id")
	WebElement SelectState;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/nav/ul/li[7]/a/span")
	WebElement SelectClassficationDetail;
	@FindBy(id="employee_detail_salary_group_id")
	WebElement SelectSalaryGroup;
	@FindBy(id="employee_detail_branch_id")
	WebElement SelectBranch;
	@FindBy(id="employee_detail_attendance_configuration_id")
	WebElement SelectAttendanceConfigId;
	@FindBy(id="employee_detail_leave_policy_master_id")
	WebElement SelectLeavyPolicyId;
	@FindBy(id="employee_detail_financial_institution_id")
	WebElement SelectFinanacialInstitution;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/div/div[8]/input")
	WebElement CreateEmployee;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullMessageforEmployee;
	@FindBy(id="employee_detail_classification_1")
	WebElement SelectDesignation;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[1]/ul/li[1]/a")
	WebElement CompanyLink;
	public PTChallanMaharashtraNewFormatPreconditions(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void navigateMaster() throws Exception{
	    masterlink.click();
	}
	
	public void clickCompanayStatLink() throws Exception{
		companystatutorylink.click();
	}
	public void companylink() {
		CompanyLink.click();
	}
	public void clickPTLink() throws Exception{
		ptlink.click();
	}
	
	public void clickAddPTLink() throws Exception{
		addptlink.click();
	}
	
	public void enterPTGroupName(String value) throws Exception{
		ptgroupname.sendKeys(value);
	}
	
	public void selectState(String value) throws Exception{
		state.sendKeys(value);
	}
	
	public void enterPTAddress(String value) throws Exception{
		ptaddress.sendKeys(value);
	}
	
	public void enterPTOCircleNumber(String value) throws Exception{
		ptocirclenum.sendKeys(value);
	}
	
	public void enterPTCertificateNumber(String value) throws Exception{
		certificatenum.sendKeys(value);
	}
	
	public void selectReturnType(String value) throws Exception{
		returnperiod.sendKeys(value);
	}
	
	public void clickCreatePT() throws Exception{
		creatept.click();
	}
	
	public void clickPTRate() throws Exception{
		ptratelink.click();
	}
	
	public void selectEffectiveFrom(String value) throws Exception{
		effectivefrom.sendKeys(value);
	}
	
	public void clickPTGroupRateButton() throws Exception{
		createptgrouprate.click();
	}
	
	public void clickSettingsLink() throws Exception{
		settingslink.click();
	}
	
	public void clickFillDefaultButton() throws Exception{
		filldefaultbutton.click();
		switchToPopUpAndAccept(driver);
	}
	
	public String getMessage(){
		return successfullMessage1.getText();
	}
	public void clickBranchLink() throws Exception{
		banchlink.click();
	}
	public void clickAddBranchLink() throws Exception{ 
		addbranchlink.click();
	}

	public void enterBranchName(String value) throws Exception{
		branchname.sendKeys(value);
	}
	public void enterReponsiblePersonName(String value) throws Exception{
		responsibleperson.sendKeys(value);
	}

	public void enterBranchAddress(String value) throws Exception{
		branchadd.sendKeys(value);
	}

	public void enterBranchState(String value) throws Exception{
		branchstate.sendKeys(value);
	}

	public void clickCreateBranchButton() throws Exception{
		createbranch.click();
	}
	public void clickPTDetail() throws Exception{
		ptdetail.click();
	}

	public void selectPTGroup(String value) throws Exception{
		ptgroupdropdown.sendKeys(value);
	}

	public void enterPTEffectiveDate(String value) throws Exception{
		pteffdate.sendKeys(value);
	}

	public void clickCreatePTDetail() throws Exception{
		createptdetail.click();
	}
	public String getPTMessage(){
		return successfullPTMessage.getText();
	}
	public String getBranchMessage(){
		return successfullBranchMessage.getText();
	}

	public void navigateEmployee() throws Exception{
		Employee.click();
	}
	public void clickEmployeeDetails() throws Exception{
		EmployeeDetails.click();
	}
	public void clickAddNewEmployee() throws Exception{
		AddNewEmployee.click();
	}
	public void enterEmployeeId(String value) throws Exception{
		EnterEmployeeId.sendKeys(value);
	}
	public void enterEmployeeRefNo(String value) throws Exception{
		EnterEmployeeRefNo.sendKeys(value);
	}
	public void enterEmployeeName(String value) throws Exception{
		EnterEmployeeName.sendKeys(value);
	}
	public void enterFathername(String value) throws Exception{
		EnterFatherName.sendKeys(value);
	}
	public void selectGender(String value){
		dropDownSelect(Gender, value);
}
	public void selectMaritalStatus(String value){
		dropDownSelect(MaritalStatus, value);
}
	public void enterdob(String value) throws Exception{
		EnterDOB.sendKeys(value);
	}
	
	public void enterdoj(String value) throws Exception{
		EnterDOJ.sendKeys(value);
	}
	
	public void selectPresentadd() throws Exception{
		clickPresentAdd.click();
	}
	public void selectstate(String value) throws Exception{
		dropDownSelect(SelectState, value);
	}
	 public void selectclassificationdetail(){
	    	SelectClassficationDetail.click();
	    }
	    public void selectsalstructure(String value) {
	    	dropDownSelect(SelectSalaryGroup, value);
	    }
	    public void selectbranch(String value) {
	    	dropDownSelect(SelectBranch, value);
	    }
	    public void selectattendancestructure(String value) {
	    	dropDownSelect(SelectAttendanceConfigId, value);
	    }
	    public void selectbank(String value) {
	    	dropDownSelect(SelectFinanacialInstitution, value);
	    }
	    public void selectleavepolicy(String value) {
	    	dropDownSelect(SelectLeavyPolicyId, value);
	    }
	    public void selectdesignation(String value) {
	    	dropDownSelect(SelectDesignation, value);
	    }
	    public void entersaldate(String value) throws Exception{
			EnterSalDate.clear();
	    	EnterSalDate.sendKeys(value);
		}
	    public void createemployee() {
	    	CreateEmployee.click();
	    }
	    public String getMessageforemployee(){
	    	return successfullMessageforEmployee.getText();
	    }
}
