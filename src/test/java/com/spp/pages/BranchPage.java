package com.spp.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class BranchPage extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//ul[@id='menu']//a[text()='Company']")
	WebElement companylink;
	@FindBy(xpath="//a[text()='Branch']")
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
	@FindBy(xpath="(//span[normalize-space(text()='PF Detail')])[6]")
	WebElement pfdetail;
	@FindBy(xpath="//select[@id='pf_detail_pf_group_id']")
	WebElement pfgroup;
	@FindBy(id="pf_effective_date")
	WebElement effectivefrom;
	@FindBy(xpath="//*[@id=\"pfgroup_save\"]/div[2]/div[2]/fieldset/div/div/img")
	WebElement MonthPickerPF;
	@FindBy(xpath="//*[@id=\"esi_save\"]/div[2]/div[2]/fieldset/div/div/img")
	WebElement MonthPickerESI;
	@FindBy(xpath="//*[@id=\"ptdetail_save\"]/div[2]/div[2]/fieldset/div/div/img")
	WebElement MonthPickerPT;
	@FindBy(xpath="//*[@id=\"CalendarControl\"]/table/tbody/tr[2]/td[1]/a")
	WebElement SelectMonth;
	@FindBy(xpath="//input[@value='Create PF Detail']")
	WebElement createpfdetail;
	@FindBy(xpath="(//span[normalize-space(text()='ESI Detail')])[7]")
	WebElement esidetail;
	@FindBy(id="esi_detail_esi_group_id")
	WebElement esigroupdropdown;
	@FindBy(id="esi_effective_date")
	WebElement esieffdate;
	@FindBy(xpath="//input[@value='Create ESI Detail']")
	WebElement createesigroup;
	@FindBy(xpath="(//span[normalize-space(text()='PT Detail')])[8]")
	WebElement ptdetail;
	@FindBy(id="pt_detail_pt_group_id")
	WebElement ptgroupdropdown;
	@FindBy(id="pt_effective_date")
	WebElement pteffdate;
	@FindBy(xpath="//input[@value='Create PT Detail']")
	WebElement createptdetail;
	@FindBy(xpath="//strong[text()='Branch was successfully created']")
	WebElement successfullBranchMessage;
	@FindBy(xpath="//strong[text()='PF detail successfully created.']")
	WebElement successfullPFMessage;
	@FindBy(xpath="//strong[text()='ESI detail successfully created.']")
	WebElement successfullESIMessage;
	@FindBy(xpath="//strong[text()='PT detail successfully created.']")
	WebElement successfullPTMessage;

	public BranchPage(WebDriver driver){   
	    super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickCompanayLink() throws Exception{
		companylink.click();
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

	public void clickPFDetail() throws Exception{
		pfdetail.click();
	}

	public void selectPFGroup(String value) throws Exception{
		pfgroup.sendKeys(value);
	}

	public void enterEffectiveDate(String value) throws Exception{
		effectivefrom.sendKeys(value);
	}

	public void clickCreatePFDetail() throws Exception{
		createpfdetail.click();
	}

	public void clickESIDetail() throws Exception{
		esidetail.click();
	}

	public void selectESIGroup(String value) throws Exception{
		esigroupdropdown.sendKeys(value);
	}

	public void enterESIEffetiveDate(String value) throws Exception{
		esieffdate.sendKeys(value);
	}

	public void clickCreateESIdetail() throws Exception{
		createesigroup.click();
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
	
	public String getBranchMessage(){
		return successfullBranchMessage.getText();
	}
	
	public String getPFMessage(){
		return successfullPFMessage.getText();
	}
	
	public String getESIMessage(){
		return successfullESIMessage.getText();
	}
	
	public String getPTMessage(){
		return successfullPTMessage.getText();
	}
	public void selectmonthoptionPF() {
		MonthPickerPF.click();
	}
	public void selectmonthoptionESI() {
		MonthPickerESI.click();
	}
	public void selectmonthoptionPT() {
		MonthPickerPT.click();
	}
	public void selectmonth() {
		SelectMonth.click();
	}
}
