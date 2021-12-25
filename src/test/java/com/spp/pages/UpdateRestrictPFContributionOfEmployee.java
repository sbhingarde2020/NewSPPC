package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateRestrictPFContributionOfEmployee extends BasePage{

	public UpdateRestrictPFContributionOfEmployee(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="emp_detail")
    WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[3]/a")
	WebElement PfContribution;
	@FindBy(xpath="//*[@id='employees_table']/tbody/tr[1]/td[4]/input")
	WebElement CheckBox1;
	@FindBy(xpath="//*[@id='employees_table']/tbody/tr[1]/td[5]/input")
	WebElement CheckBox2;
	@FindBy(xpath="//*[@id=\"RestrictPFESIForm\"]/div[3]/input")
	WebElement UpdateButton;
	@FindBy(xpath="//*[@id='show_message']/div/strong")
	WebElement SuccessfulMessage;
	
	
	
	public void selectEmployee() {
		Employee.click();
	}
	public void selectPfContribution() {
		PfContribution.click();
	}
	public void selectCheckBox1() {
		CheckBox1.click();
	}
	public void selectCheckBox2() {
		CheckBox2.click();
	}
	public void selectUpdateButton() {
		UpdateButton.click();
	}
  public String getPFMessage() {
	  return SuccessfulMessage.getText();
  }
}
