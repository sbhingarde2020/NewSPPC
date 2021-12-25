package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateRestrictPFContributionOfAllEmployee extends BasePage{
	@FindBy(id="emp_detail")
    WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[3]/a")
	WebElement PfContribution;
	@FindBy(id="Restrict_Employee_PF_check_box")
	WebElement CheckRestrictEmployeePF;
	@FindBy(id="Restrict_Employer_PF_check_box")
	WebElement CheckRestrictEmployerPF;
	@FindBy(xpath="//*[@id=\"RestrictPFESIForm\"]/div[3]/input")
	WebElement UpdateButton;
	@FindBy(xpath="//*[@id='show_message']/div/strong")
	WebElement SuccessfulMessage;
	public UpdateRestrictPFContributionOfAllEmployee(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public void selectEmployee() {
		Employee.click();
	}
	public void selectPfContribution() {
		PfContribution.click();
	}
	public void selectCheckBox1() {
		CheckRestrictEmployeePF.click();
	}
	public void selectCheckBox2() {
		CheckRestrictEmployerPF.click();
	}
	public void selectUpdateButton() {
		UpdateButton.click();
	}
  public String getPFMessage() {
	  return SuccessfulMessage.getText();
  }
}
