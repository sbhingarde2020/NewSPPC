package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateFormula extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//ul[@id='menu']//li[3]//div[4]//li[6]//a[text()='Formula Editor']")
	WebElement formulaEditor;
	@FindBy(xpath="//*[@id='dt_formula_list']/tbody/tr/td[contains(text(),'Basic')]/parent::tr/td[2]/span[1]/a")
	WebElement editIcon;
	@FindBy(id="formula_formulae_name")
	WebElement name;
	@FindBy(xpath="//select[@id='variables']//option[3]")
	WebElement basicFormula;
	@FindBy(id="formula_formulae")
	WebElement expression;
	@FindBy(xpath="//select[@id='operators']//option[1]")
	WebElement operator;
	@FindBy(xpath="//input[@value='Verify']")
	WebElement verifyButton;
	@FindBy(xpath="//strong[text()='Formula is verified.']")
	WebElement successfullVerify;
	@FindBy(xpath="//input[@value='Update']")
	WebElement updateButton;
	@FindBy(xpath="//strong[text()='Formula is successfully updated']")
	WebElement suceesfullMessage;

	public UpdateFormula(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickMastserLink(){
		masterLink.click();
	}
    
	public void selectFormulaEditor(){
		formulaEditor.click();
	}

	public void clickEditIcon(){
		editIcon.click();
	}
	
	public void enterName(String value){
		name.clear();
		name.sendKeys(value);
	}
	
	public void clickBasicFormula(){
		doubleClickAction(driver,basicFormula);
		basicFormula.click();
	}
	
	public void clearExpression(){
		expression.clear();
	}
	
	public void enterExpression(String value){
		expression.sendKeys(value);
	}
	
	public void clickOperator(){
		doubleClickAction(driver, operator);
	}
	
	public void clickVerifyButton(){
		verifyButton.click();
	}
	
	public String getMessage(){
		return successfullVerify.getText();
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getUpdateMessage(){
		return suceesfullMessage.getText();
	}
}