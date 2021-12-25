package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateSecurityPolicy extends BasePage {
	
	//pending----
	
	
	@FindBy(xpath="/html/body/div/div[4]/div/div[2]/ul/li/a/span[1]") 
	WebElement SuperUser;
	@FindBy(xpath="//*[@id=\"menu\"]/li[9]/div/div/ul/li[5]/a")
	WebElement DashboardSettings;
	@FindBy(id="setting_NEWLY_JOINED")
	WebElement NewEmployee;
	@FindBy(id="setting_CLASSIFICATION_NOT_ASSIGNED")
	WebElement ClassificationNotAssigned;
	@FindBy(xpath="//*[@id=\"edit_dash_board_setting_1\"]/div[4]/input")
	WebElement UpdateDashboard;
	@FindBy(id="flash_notice")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id=\"topbar-menuwrapper\"]/ul/li[1]/a")
	WebElement SPPIcon;
	
	public UpdateSecurityPolicy(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSettings(){
		//Settings.click();
	}
	
	public void selectDashboardSettings(){
		DashboardSettings.click();
	}
	public void selectNewEmployee(){
		NewEmployee.click();
	}
	public void selectClassificationNotAssigned(){
		ClassificationNotAssigned.click();
	}
	public void clickUpdateDashboard(){
		UpdateDashboard.click();
	}

		
	public String getMessage(){
		return successfullMessage.getText();
	}
	public void clickSPPIcon(){
		SPPIcon.click();
	}

}
