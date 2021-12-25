package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditEMIDetailInsuranceDetails extends BasePage {
	
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[8]/a")
	WebElement InsuranceDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[1]/td[6]/a")
	WebElement View;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr/td[8]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"emi_list\"]/table/tbody/tr[1]/td[4]/a")
	WebElement Edit;
	@FindBy(id="modified_amount")
	WebElement Amount;
	@FindBy(id="update")
	WebElement Update;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement SuccessfulMessage;
	
	public EditEMIDetailInsuranceDetails(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickInsuranceDetails() throws Exception{
		InsuranceDetails.click();
	}
	public void clickAddEmployee() throws Exception{
		AddEmployee.click();
	}
	public void clickLoad() throws Exception{
		Load.click();
	}
	public void clickView() throws Exception{
		View.click();
	}
	public void clickDetails() throws Exception{
		Details.click();
	}
	public void clickEdit() throws Exception{
		Edit.click();
	}
	public void clickAmount(String value) throws Exception{
		//Amount.sendKeys("");
		Amount.clear();
		Amount.sendKeys(value);
		//Amount.sendKeys(Keys.TAB);
	}
	public void clickUpdate() throws Exception{
		Update.click();
	}
   public String getMessage() {
	   return SuccessfulMessage.getText();
   }

public void navigateMaster() {
	// TODO Auto-generated method stub
	
}
}
