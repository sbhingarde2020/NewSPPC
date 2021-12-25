package com.spp.pages;

import org.apache.commons.collections4.iterators.PermutationIterator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckPeriodicIncMstrcanbeEdited extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Periodic Incentive Master']")
	WebElement periodicIncentive;
	@FindBy(xpath="//*[@class=\"action-edit\"]")
	WebElement clickonedit;
	@FindBy(xpath="//a[text()='Add New Periodic Incentive Master']")
	WebElement addPeriodicIncentive;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement periodicIncentiveName;
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement UntickClubbedInSalary;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[6]/input")
	WebElement updateperiodicincentive;
	@FindBy(xpath="//strong[text()='Periodic Incentive successfully updated']")
	WebElement successfullMessage;

	public CheckPeriodicIncMstrcanbeEdited(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void selectPeriodicIncentive() throws Exception{
		periodicIncentive.click();
	}
	public void clickonedit() throws Exception{
		clickonedit.click();
	}

	public void selectUntickClubbedInSalary() throws Exception{
		UntickClubbedInSalary.click();
	}
	
	public void clickAddPeriodicIncentive() throws Exception{
		addPeriodicIncentive.click();
	}

	public void enterPeriodicIncentiveName(String value) throws Exception{
		periodicIncentiveName.clear();
		periodicIncentiveName.sendKeys(value);
	}

	public void updateperiodicincentive() throws Exception{
		updateperiodicincentive.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
