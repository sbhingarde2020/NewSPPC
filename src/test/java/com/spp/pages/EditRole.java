package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditRole extends BasePage{

	@FindBy(xpath="/html/body/div/div[4]/div/div[2]/ul/li/a/span[1]") 
	WebElement SuperUser;
	@FindBy(xpath="/html/body/div/div[4]/div/div[2]/ul/li/ul/li[3]/a")
	WebElement RolePermission;
	@FindBy(xpath="//*[@id=\"main\"]/div[4]/table/tbody/tr[3]/td[5]/a")
	WebElement Edit;
	@FindBy(id="role_name")
	WebElement RoleName;
	@FindBy(id="SPP_Cloud_permissions_company_statutory_create")
	WebElement CSCreate;
	@FindBy(id="SPP_Cloud_permissions_company_statutory_read")
	WebElement CSRead;
	@FindBy(id="SPP_Cloud_permissions_company_statutory_update")
	WebElement CSUpdate;
	@FindBy(xpath="//*[@id=\"role_screen\"]/div[6]/input[1]")
	WebElement Update;
	@FindBy(id="SPP_Cloud_permissions_company_statutory_destroy")
	WebElement CSDelete;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id=\"main\"]/div[4]/table/tbody/tr[3]/td[6]/a")
	WebElement Delete;
	public EditRole(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSuperUser(){
		SuperUser.click();
	}
	
	public void selectRolePermission(){
		RolePermission.click();
	}

	public void selectEdit(){
		Edit.click();
	}
	
	public void EnterRoleName(String value){
		RoleName.sendKeys(value);
		
	}
	public void selectCSCreate(){
		CSCreate.click();
	}
	public void selectCSRead(){
		CSRead.click();
	}
	public void selectCSUpdate(){
		CSUpdate.click();
	}
	public void selectCSDelete(){
		CSDelete.click();
	}
	public void clickUpdate(){
		Update.click();
	}

		
	public String getMessage(){
		return successfullMessage.getText();
	}
		
}
