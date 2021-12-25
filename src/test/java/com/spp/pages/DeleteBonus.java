package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteBonus extends BasePage{
	@FindBy(id="salary") 
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[11]/a")
	WebElement Bonus;
	@FindBy(xpath="//*[@id='bonus_or_exgratia']/div/table/tbody/tr[1]/td[3]/a")
	WebElement Compute;
	@FindBy(id="add_employees")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id='bec_employees']/tbody/tr/td[normalize-space()='Anil']/parent::tr/td[8]/a")
	WebElement Delete;
	@FindBy(xpath="//*[@id='bec_employees']/tbody/tr[1]/td[8]/a")
	WebElement Delete1;
	
	public DeleteBonus(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSalary(){
		Salary.click();
	}
	
	public void selectBonus(){
		Bonus.click();
	}
	public void clickCompute(){
		Compute.click();
	}
	public void selectAddEmployee(){
		AddEmployee.click();
	}
	public void clickLoad(){
		Load.click();
	}
	public void clickDelete(){
		Delete.click();
	}
	public void clickDelete1(){
		Delete1.click();
	}
}
