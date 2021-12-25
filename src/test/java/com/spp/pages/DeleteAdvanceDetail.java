package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteAdvanceDetail extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[3]/a")
	WebElement AdvanceMaster;
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[6]/a")
	WebElement AdvanceDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	@FindBy(id="filter")
	WebElement MultiAllotment;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[1]/td[6]/a")
	WebElement View;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr[1]/td[8]/a")
	WebElement Delete;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[2]/table/tbody/tr/td[contains(text(),'Default')]/parent::tr/td[5]/a")
	WebElement DeleteAdvanceMaster;
	public DeleteAdvanceDetail(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickMastserLink(){

		masterLink.click();
	}

	public void clickAdvanceMaster(){
		AdvanceMaster.click();
	}
	public void deleteadvancemaster() {
		DeleteAdvanceMaster.click();
		switchToPopUpAndAccept(driver);
	}

	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickAdvanceDetails() throws Exception{
		AdvanceDetails.click();
	}
	public void clickAddEmployee() throws Exception{
		AddEmployee.click();	
	}
	public void clickLoad() throws Exception{
		Load.click();
	}
	public void clickMultiAllotment() throws Exception{
		MultiAllotment.click();
	}
	public void clickView() throws Exception{
		View.click();
	}
	
	public void clickDelete() throws Exception{
		Delete.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
}
