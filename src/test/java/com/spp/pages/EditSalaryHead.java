package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class EditSalaryHead extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Salary Heads']")
	WebElement salaryheads;
	@FindBy(xpath="//*[@id='earning_heads']/tbody/tr/td[contains(text(),'EA2')]/parent::tr/td/a[text()='Edit']")
	WebElement editsalaryhead;
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
	@FindBy(xpath="//input[@value='Update Salary Head']")
	WebElement updatebutton;
	@FindBy(xpath="//strong[text()='Salary head succesfully updated']")
	WebElement successfullMessage;
	
	public EditSalaryHead(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickSalaryHeadsLink() throws Exception{
		salaryheads.click();
	}
	
	public void clickEditSalaryHeadsLink() throws Exception{
		editsalaryhead.click();
	}
	
	public void enterSalaryHeadName(String value) throws Exception{
		headname.clear();
		headname.sendKeys(value);
	}

	public void enterSalaryHeadShortName(String value) throws Exception{
		shortname.clear();
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
	
	public void clickUpdateButton() throws Exception{
		updatebutton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
