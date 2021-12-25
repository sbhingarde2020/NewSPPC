package com.spp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.spp.common.BasePage;

public class EncashmentSettings extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
    @FindBy(xpath="//div[@id='leave-policy-master-list']//tr[1]//td[4]//a[text()='Add Leaves']")
	WebElement addLeaves;
    @FindBy(xpath="//*[@id=\"leave_policy_setting_details\"]/div[2]/table/tbody/tr[5]/td[3]/a")
    WebElement settingsLink;
	@FindBy(xpath="//div[@id='main']//div[3]//li[2]//span[normalize-space(text()='Lapse/Carry Over/Encashment')]")
	WebElement encashmentTab;
	@FindBy(id="leave_policy_head_wise_setting_encashment_settings_encash")
	WebElement allowEncahment;
	//@FindBy(name="leave_policy_head_wise_setting[encashment_settings[min_encash]]")
	@FindBy(xpath="//*[@id=\"lapse_carryover_encashment_sets\"]/table/tbody/tr[2]/td[2]/input")
	WebElement encashedPerInstance;
	@FindBy(name="leave_policy_head_wise_setting[encashment_settings[max_encash]]")
	WebElement encashedinYear;
	@FindBy(name="leave_policy_head_wise_setting[encashment_settings[encash_year_limit]]")
	WebElement numberofTimesEncachsed;
	@FindBy(id="leave_policy_head_wise_setting_encashment_settings_round_off_year")
	WebElement roundOff;
	@FindBy(xpath="//div[@id='lapse_carryover_encashment_sets']//tr[6]//input[@value='Update']")
	WebElement updateButton;
	@FindBy(xpath="//strong[text()='Setting was successfully updated.']")
	WebElement successfullMessage;
	@FindBy(xpath="//input[@checked='checked' and @id='leave_policy_head_wise_setting_encashment_settings_encash']/parent::td")
	WebElement allowearned;

	public EncashmentSettings(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectLeavePolicy(){
		leavePolicy.click();
	}
	
	public void clickAddLeaves(){
		addLeaves.click();
	}
	
	public void clickSettingsLink(){
		settingsLink.click();
	}
	
	public void clickLapseTab(){
		encashmentTab.click();
	}
 
	//public void clickAllowEncahment(){
	//	/*String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";
	//	((JavascriptExecutor) driver).executeScript(js, allowEncahment);*/
		
	//	WebDriverWait wait = new WebDriverWait (driver, 10);
	//	allowEncahment = wait.until(ExpectedConditions.elementToBeClickable(By.id("leave_policy_head_wise_setting_encashment_settings_encash")));
	//	allowEncahment.click();
	 
	public void clickallowEarnedLeave() throws Exception {
		String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";
		((JavascriptExecutor) driver).executeScript(js, allowearned);
		 
		// Click on element
		 
		//allowearned.click();	
	//allowearned.sendKeys("  ");
	allowearned.sendKeys(Keys.SPACE);
		System.out.println(encashedPerInstance.getText());
		encashedPerInstance.sendKeys("100");
	}
	
	
	
	public void enterEncashedPerInstance(String value){
		System.out.println(encashedPerInstance.getAttribute("disabled"));
		System.out.println(driver.getPageSource());
		encashedPerInstance.clear();
		encashedPerInstance.sendKeys(value);
	}
	
	public void enterencashedinYear(String value){
		encashedinYear.clear();
		encashedinYear.sendKeys(value);
	}
	
	public void enterNumberofTimesEncachsed(String value){
		numberofTimesEncachsed.clear();
		numberofTimesEncachsed.sendKeys(value);
		
	}
	
	public void selectRoundOff(String value){
	 dropDownSelect(roundOff,value);
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
