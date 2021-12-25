package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteClassificationDetailsInEmployee extends BasePage{

	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement ClickOnEmployDetails;
	@FindBy(id="filter_head")
	WebElement ClickOnFilterHead;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"bf_non_classified_emp_form\"]/div[2]/button[1]")
	WebElement Load2;
	@FindBy(xpath="//*[@id='employees_dtable']/tbody/tr/td[contains(text(),'Anil')]/parent::tr/td[6]/a[1]")
	WebElement ClickOnView; 
	@FindBy(xpath="//*[@id='employees_dtable']/tbody/tr/td[contains(text(),'Anil')]/parent::tr/td[6]/a[2]")
	WebElement DeleteEmployee;
	@FindBy(xpath="//*[@id=\"classification_details\"]/a")
	WebElement ClickClassificationDetail;
	@FindBy(xpath="//*[@id=\"main\"]/div[4]/table/tbody/tr[1]/td[7]/a")
	WebElement DeleteClassification;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfulmessage;
	@FindBy(xpath="//input[@attr='non_classified_emp']")
	WebElement EmployeewithoutClass;
	
	
	public DeleteClassificationDetailsInEmployee(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonemployeedetails() {
		ClickOnEmployDetails.click();
	}
	public void clickonfilter() {
		ClickOnFilterHead.click();
	}
	public void clickEmployeewithoutClass(){
		EmployeewithoutClass.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonload2() {
		Load2.click();
	}
	
	public void clickonview() {
		ClickOnView.click();
	}
	public void clickclassificationdetail() {
		ClickClassificationDetail.click();
	}
	public void deletecclassification() {
		DeleteClassification.click();
	}
		public String getMessage(){
		return successfulmessage.getText();
	}
	public void deleteemployee() {
		DeleteEmployee.click();
	}
		
}
