package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateMasterWeeklyOff extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(linkText="Master Weekly Holiday")
	WebElement MasterWeeklyHoliday;
	@FindBy(xpath="//*[@id=\"filters_list\"]/tbody/tr/td[3]/a")
	WebElement View;
	@FindBy(xpath="//*[@id=\"weekly_off_content\"]/div[2]/nav/ul/li[2]/a/span")
	WebElement NewMasterWeeklyOff;
	@FindBy(id="eff_from")
	WebElement EffectiveFrom;
	@FindBy(id="master_weekly_off_first_week_first_off")
	WebElement FirstOff;
	@FindBy(xpath="//*[@id=\"new_master_weekly_off\"]/div[2]/table/tbody/tr[2]/td[3]/select")
	WebElement FullDay1;
	@FindBy(id="master_weekly_off_first_week_second_off")
	WebElement SecondOff	;
	@FindBy(xpath="//*[@id=\"new_master_weekly_off\"]/div[2]/table/tbody/tr[2]/td[5]/select")
	WebElement FullDay2;
	@FindBy(xpath="//*[@id=\"new_master_weekly_off\"]/div[2]/div[5]/input")
	WebElement CreateMasterWeeklyOffButton;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id=\"weekly_off_content\"]/div[2]/nav/ul/li[3]/a/span")
	WebElement WeeklyOffHistory;
	@FindBy(xpath="//*[@id=\"history_detail\"]/div[2]/table/tbody/tr[1]/td[3]/a")
	WebElement DeleteButton;
	
	
	public UpdateMasterWeeklyOff(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickMasterWeeklyHoliday() throws Exception{
		MasterWeeklyHoliday.click();
	}

	public void clickView() throws Exception{
		View.click();
	}
	
	public void clickNewMasterWeeklyOff() throws Exception{
		NewMasterWeeklyOff.click();
	}
	public void enterEffectiveFrom(String value) throws Exception{
		EffectiveFrom.sendKeys(value);
		EffectiveFrom.sendKeys(Keys.TAB);
	}
	
	public void selectFirstOff(String value) throws Exception{
		dropDownSelect(FirstOff, value);
	}
 
	public void selectFullDay1(String value) throws Exception{
		dropDownSelect(FullDay1, value);
	}
	
	public void selectSecondOff(String value) throws Exception{
		dropDownSelect(SecondOff, value);
	}
	public void selectFullDay2(String value) throws Exception{
		dropDownSelect(FullDay2, value);
	}

	public void clickCreateMasterWeeklyOffButton() throws Exception{
		CreateMasterWeeklyOffButton.click();
	}

	public String getMessage(){
		return successfullMessage.getText();
	}
	public void clickWeeklyOffHistory() throws Exception{
		WeeklyOffHistory.click();
	}
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
}
