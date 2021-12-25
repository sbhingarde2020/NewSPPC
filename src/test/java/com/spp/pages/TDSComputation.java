package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class TDSComputation extends BasePage{

	@FindBy(id="tds")
	WebElement ClickOnTDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[1]/a")
	WebElement ClickOnComputation;
	@FindBy(id="tds_financial_year")
	WebElement SelectFinancialYear;
	@FindBy(id="filter_head")
	WebElement ClickOnFilter;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement ClickOnLoad;
	
	public TDSComputation(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void clickontds() {
		ClickOnTDS.click();
	}
	public void clickoncomputation() {
		ClickOnComputation.click();
	}
	public void selectfinancialyear(String value) {
		dropDownSelect(SelectFinancialYear, value);
	}
	public void clickonfilter() {
		ClickOnFilter.click();
	}
}
