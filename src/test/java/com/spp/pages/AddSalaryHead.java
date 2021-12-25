package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class AddSalaryHead extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Salary Heads']")
	WebElement salaryheads;
	@FindBy(xpath="//a[text()='Add New Salary Head']")
	WebElement addsalaryheadlink;
	@FindBy(id="salary_head_head_name")
	WebElement headname;
	@FindBy(id="salary_head_short_name")
	WebElement shortname;
	@FindBy(id="salary_head_open_component")
	WebElement opencomponent;
	@FindBy(id="salary_head_calculative_field")
	WebElement calculativefield;
	@FindBy(id="salary_head_consider_for_gratuity")
	WebElement considerforGratuity;
	@FindBy(id="salary_head_consider_for_leave_en_cash")
	WebElement considerforLeaveEncahment;
	@FindBy(xpath="//input[@value='Create Salary Head']")
	WebElement createsalaryheadbutton;
	@FindBy(xpath="//strong[text()='Salary head successfully created']")
	WebElement successfullMessage;

	public AddSalaryHead(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickSalaryHeadsLink() throws Exception{
		salaryheads.click();
	}

	public void clickAddSalaryHeadsLink() throws Exception{
		addsalaryheadlink.click();
	}

	public void enterSalaryHeadName(String value) throws Exception{
		headname.sendKeys(value);
	}

	public void enterSalaryHeadShortName(String value) throws Exception{
		shortname.sendKeys(value);
	}

	public void clickOpenComponentRadioButton() throws Exception{
		opencomponent.click();
	}

	public void clickCalcultaiveFieldRadioButton() throws Exception{
		calculativefield.click();
	}

	public void clickConsiderForGratuity() throws Exception{
		considerforGratuity.click();
	}

	public void clickConsiderForLeaveEncahment() throws Exception{
		considerforLeaveEncahment.click();
	}

	public void clickCreateSalaryHeadButton() throws Exception{
		createsalaryheadbutton.click();
	}

	public String getMessage(){
		return successfullMessage.getText();
	}
}