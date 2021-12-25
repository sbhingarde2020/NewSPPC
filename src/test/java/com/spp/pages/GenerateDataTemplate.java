package com.spp.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class GenerateDataTemplate extends  BasePage{

	@FindBy(id="emp_detail")
	WebElement EmployeeTab;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement EmployeeDetailsLink;
	@FindBy(xpath="//div[@id='accordion']/div[3]/h3")
	WebElement ImportExportEmployees;
	@FindBy(linkText="Generate Data Template")
	WebElement GenerateDataTemplateTab;
	@FindBy(id="select_category")
	WebElement EmployeeExcelTypeDropDown;
	@FindBy(id="data_excel_filter")
	WebElement GetEmployeeButton;
	@FindBy(xpath="//input[@attr='non_classified_emp']")
	WebElement EmpWithoutClassificationButton;
	@FindBy(xpath="//*[@id=\"bf_non_classified_emp_form\"]/div[2]/button[1]")
	WebElement LoadEmployeesButton;
	@FindBy(xpath="//*[@id='main']/div[4]/form/fieldset/div/div[4]/button")
	WebElement GenerateTemplateButton;
	

	public GenerateDataTemplate(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickEmployeeTab(){
		EmployeeTab.click();
	}
	
	public void clickEmployeeDetailsLink(){
		EmployeeDetailsLink.click();
	}
	
	public void clickImportExportTab(){
		ImportExportEmployees.click();
	}
	
	public void clickGenerateDataTemplateTab(){
		GenerateDataTemplateTab.click();
	}
	
	
	public void SelectExcelType(String value) throws IOException {
		
		selectValue(EmployeeExcelTypeDropDown, value);
	}
	
	public void clickGetEmployees(){
		
		GetEmployeeButton.click();
	}
	
	public void SelectEmpWithoutClassificationButton(){
		
		EmpWithoutClassificationButton.click();
	}
	
	public void LoadEmployees(){
		
		LoadEmployeesButton.click();
	}
	
	public void DownloadTemplate(){
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1000);");
		GenerateTemplateButton.click();
	}

}

