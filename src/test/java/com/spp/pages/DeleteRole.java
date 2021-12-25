package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteRole extends BasePage{
	@FindBy(xpath="/html/body/div/div[4]/div/div[2]/ul/li/a/span[1]") 
	WebElement SuperUser;
	@FindBy(xpath="/html/body/div/div[4]/div/div[2]/ul/li/ul/li[3]/a")
	WebElement RolePermission;
	@FindBy(xpath="//*[@id=\"main\"]/div[4]/table/tbody/tr[4]/td[6]/a")
	WebElement Delete;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement successfullMessage;
	public DeleteRole(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSuperUser(){
		SuperUser.click();
	}
	
	public void selectRolePermission(){
		RolePermission.click();
	}

	public void clickDelete(){
		Delete.click();
	}	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
