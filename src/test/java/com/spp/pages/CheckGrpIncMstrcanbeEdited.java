package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckGrpIncMstrcanbeEdited extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Group Insurance Master']")
	WebElement groupInsurance;
	@FindBy(xpath="//*[@class=\"action-edit\"]")
	WebElement ClickOnEdit;
	@FindBy(xpath="//a[text()='Add New Insurance Master']")
	WebElement addGroupInsurance;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement groupInsuranceName;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_clubbed_in_salary_head\"]")
	WebElement uncheckClubbInSalHead;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[6]/input")
	WebElement UpdateGrpInsurnce;
	@FindBy(xpath="//input[@value='Create Group Insurance']")
	WebElement createGroupInsurance;
	@FindBy(xpath="//strong[text()='Group Insurance successfully updated']")
	WebElement successfullMessage;
	
	public CheckGrpIncMstrcanbeEdited(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void selectGroupInsurance() throws Exception{
		groupInsurance.click();
	}
	public void clickonedit() throws Exception{
		ClickOnEdit.click();
	}
	
	public void clickaddGroupInsurance() throws Exception{
		addGroupInsurance.click();
	}
	public void updategrpinsurnce() throws Exception{
		UpdateGrpInsurnce.click();
	}
	
	public void enterGroupInsurance(String value) throws Exception{
		groupInsuranceName.clear();
		groupInsuranceName.sendKeys(value);
	}
	public void uncheckclubbinsalhead() {
		uncheckClubbInSalHead.click();
	}
	
	public void clickCreateGroupInsurance() throws Exception{
		createGroupInsurance.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}


