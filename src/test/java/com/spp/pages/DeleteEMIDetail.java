package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteEMIDetail extends BasePage {
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
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr[1]/td[8]/a")
	WebElement Details;
	
	
	@FindBy(xpath="//*[@id='emi_list']/table/tbody/tr[1]/td[5]/a")
	WebElement Delete;
	@FindBy(id="popup_no")
	WebElement NoButton;
	@FindBy(id="popup_ok")
	WebElement YesButton;
	
	@FindBy(xpath="//*[@id='show_message']/div/strong")
	WebElement successfullyMessage;
	
	public DeleteEMIDetail(WebDriver driver){
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
	
	
	
	
	public void clickDelete1() throws Exception{
		Delete.click();
		
	}
	public void clickDelete2() throws Exception{
		Delete.click();
	}
	public void clickNoButton() throws Exception{
		NoButton.click();
		
	}
	public void clickYesButton() throws Exception{
		YesButton.click();
	}
	public String getMessage(){
		return successfullyMessage.getText();
	}
	

}
