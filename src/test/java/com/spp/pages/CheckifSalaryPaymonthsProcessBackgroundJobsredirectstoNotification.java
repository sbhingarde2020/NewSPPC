package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifSalaryPaymonthsProcessBackgroundJobsredirectstoNotification extends BasePage{
	
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[1]/a")
	WebElement ClickOnPayMonths;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/li/a")
	WebElement ClickProcessBackgroundJobs;
	
	public CheckifSalaryPaymonthsProcessBackgroundJobsredirectstoNotification(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	public void clickonsalary() {
		ClickOnSalary.click();
	}
	public void clickonPayMonth() {
		ClickOnPayMonths.click();
	}
	public void clickprocessbackgroundjobs() {
		ClickProcessBackgroundJobs.click();
	}
}
