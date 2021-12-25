package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteComputationDetails extends BasePage{
	@FindBy(id="salary") 
	WebElement SalaryLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[3]/a")
	WebElement Arrears;
	@FindBy(xpath="//*[@id=\"main\"]/div/table/tbody/tr[6]/td[4]/a")
	WebElement computation;
	@FindBy(linkText="Add Employees")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement SuccessfullMessage;
	@FindBy(id="select_all")
	WebElement SelectAll;
	@FindBy(xpath="//*[@id=\"arrear_add_emp\"]/tbody/tr[3]/td[1]/input")
	WebElement Employee;
	@FindBy(xpath="//*[@id=\"EmployeesArrears\"]/div[3]/div/div/input")
	WebElement Save;
	@FindBy(xpath="//*[@id=\"manual_headwise_arrears\"]/tbody/tr/td[6]/a")
	WebElement Delete;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/fieldset/table/tbody/tr[3]/td[1]/table[1]/tbody/tr[2]/td[1]/input")
	WebElement Basic;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement successfullMessage;
	
public DeleteComputationDetails(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver,this);
}

public void clickSalaryLink(){
	SalaryLink.click();
}

public void selectArrears(){
	Arrears.click();
}
public void selectComputation(){
	computation.click();
}
public void SelectAddEmployee(){
	AddEmployee.click();
}

public void ClickLoad(){
	Load.click();
}
public String getMessage1(){
	return SuccessfullMessage.getText();
}
public void ClickSelectAll(){
	SelectAll.click();
}

public void ClickEmployee(){
	Employee.click();
}
public void ClickSave(){
	Save.click();
}
public void ClickDelete(){
	Delete.click();
}
public String getMessage(){
	return successfullMessage.getText();
}


}
