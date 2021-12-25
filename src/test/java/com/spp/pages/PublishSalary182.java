package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class PublishSalary182 extends BasePage{
	public PublishSalary182(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[1]/a")
	WebElement SalaryEditor;
	@FindBy(id="month_year")
	WebElement PayMonth;
	@FindBy(id="salary_structure")
	WebElement SalaryStructure;
	@FindBy(id="get_salary")
	WebElement GetValues;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"salary_editor_form\"]/table/tbody/tr[2]/td/div/div/div[1]/input")
	WebElement Process;
	@FindBy(xpath="//*[@id=\"salary_review\"]/tbody/tr[1]/td[7]/a")
	WebElement Edit;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/a")
	WebElement SubmitForReview;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[3]/a")
	WebElement Review;
	@FindBy(xpath="//*[@id=\"salary_review\"]/tbody/tr[1]/td[8]/a")
	WebElement view;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/a[1]")
	WebElement publish;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/strong")
	WebElement successfulMessage;
	
	public void selectSalary() {
		Salary.click();
	}
	public void selectSalaryEditor() {
		SalaryEditor.click();
	}
	
	public void selectPayMonth(String value){
		dropDownSelect(PayMonth, value);
	}
	public void selectSalaryStructure(String value){
		dropDownSelect(SalaryStructure, value);
	}
	public void selectGetValues() {
		GetValues.click();
	}
	public void selectLoad() {
		Load.click();
	}
	public void selectProcess() {
		Process.click();
	}
	public void selectEdit() {
		Edit.click();
	}
	public void selectSubmitForReview() {
		SubmitForReview.click();
	}
	public void selectReview() {
		Review.click();
	}
	public void selectview() {
		view.click();
	}
	public void selectpublish() {
		publish.click();
	}
	public String getMessage() {
		return successfulMessage.getText();
	}
}
