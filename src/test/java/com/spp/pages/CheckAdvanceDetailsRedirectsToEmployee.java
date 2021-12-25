package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckAdvanceDetailsRedirectsToEmployee extends BasePage{
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[6]/a")
	WebElement AdvanceDetails;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
	WebElement GeneralLink;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-1\"]/li[2]/a")
	WebElement EmployeeMaster;
	@FindBy(xpath="//*[@id='ui-accordion-accordion-panel-0']/ul/li[1]/a")
	WebElement AddNewEmployee;
	@FindBy(id="employee_emp_id")
	WebElement employeeid;
	@FindBy(id="employee_refno")
	WebElement employeeref;
	@FindBy(id="employee_empname")
	WebElement employeename;
	@FindBy(id="employee_father_name")
	WebElement employeefather;
	@FindBy(id="dob")
	WebElement DateofBirth;
	@FindBy(id="employee_gender")
	WebElement Gender;
	@FindBy(id="marital_status")
	WebElement MaritalStatus;
	@FindBy(id="doj")
	WebElement DateofJoining;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/nav/ul/li[1]/a")
	WebElement PresentAddress;
	@FindBy(id="employee_present_state_id")
	WebElement State;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/nav/ul/li[5]/a")
	WebElement StatutoryTab;
	@FindBy(id="employee_statutory_pf_number")
	WebElement employeePfNumber;
	@FindBy(id="pf_ed")
	WebElement PfEffective;
	@FindBy(id="employee_statutory_uan")
	WebElement Uan;
	@FindBy(id="employee_statutory_esi_number")
	WebElement ESINo;	
	@FindBy(id="esi_ed")
	WebElement EffectiveESIDate;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/div/div[8]/input")
	WebElement CreateEmployeeButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullMessage;
	@FindBy(id="emp_detail")
	WebElement ClickEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement SelectEmployeeDetails;
	@FindBy(id="filter_head")
	WebElement ClickOnFilterHead;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"employees_dtable\"]/tbody/tr/td[contains(text(),'Krishna')]/parent::tr/td[6]/a[2]")
	WebElement DeleteEmployee;
	
	public CheckAdvanceDetailsRedirectsToEmployee(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickAdvanceDetails() throws Exception{
		AdvanceDetails.click();
	}
	public void clickGeneralLink() throws Exception{
		GeneralLink.click();	
	}
	public void clickEmployeeMaster() throws Exception{
		EmployeeMaster.click();
	}
	 public void selectAddNewEmployee() {
	    	AddNewEmployee.click();
	}

	      public void enterEmployeeid(String value) throws Exception{
	    	employeeid.sendKeys(value);
	}
	    
	    public void enterEmployeeref(String value) throws Exception{
	    	employeeref.sendKeys(value);
	} 
	    public void enterEmployeename(String value) throws Exception {
	    	employeename.sendKeys(value);
	}
	    public void enterEmployeefather(String value) throws Exception{
	    	employeefather.sendKeys(value);
	}
	    public void selectDateofBirth(String value) throws Exception {
	    	DateofBirth.sendKeys(value);
	}
		public void selectGender(String value){
			dropDownSelect(Gender, value);
	}
		public void selectMaritalStatus(String value){
			dropDownSelect(MaritalStatus, value);
	}
		public void selectDateofJoining(String value) throws Exception {
			DateofJoining.sendKeys(value);
	}	
		public void clickPresentAddress(){
			PresentAddress.click();
	}
		public void selectState(String value){
			dropDownSelect(State, value);
	}		
		public void clickStatutoryTab(){
			StatutoryTab.click();
	}	
		
		public void enteremployeePfNumber(String value) throws Exception {
			employeePfNumber.sendKeys(value);
	}	    
		public void selectPfEffective(String value) throws Exception {
				PfEffective.sendKeys(value);
	}	
		public void enterUan(String value) throws Exception {
			Uan.sendKeys(value);
	}
		public void enterESINo(String value) throws Exception {
			ESINo.sendKeys(value);
	}	
	    public void selectEffectiveESIDate(String value) throws Exception {
	    	EffectiveESIDate.sendKeys(value);
	}		
		public void clickCreateEmployeeButton(){
			CreateEmployeeButton.click();
	}
	    public String getMessage(){
		return successfullMessage.getText();
	}
	    public void clickemployee() {
	    	ClickEmployee.click();
	    }
	    public void selectemployeedetails() {
	    	SelectEmployeeDetails.click();
	    }
	    public void clickonfilterhead() {
	    	ClickOnFilterHead.click();
	    }
	    public void clickLoad() throws Exception{
	    	Load.click();
	    }
	    public void deleteemployee() {
	    	DeleteEmployee.click();
	    	switchToPopUpAndAccept(driver);
	    }
}

