package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteEMIDetailsInLoanDetail extends BasePage{
	public DeleteEMIDetailsInLoanDetail(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(linkText="Loan Detail")
	WebElement LoanDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
//	@FindBy(id="filter")
//	WebElement MultiAllotment;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[3]/td[6]/a")
	WebElement View;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr[1]/td[7]/a")
	WebElement Detail;
	@FindBy(id="delete_emi")
	WebElement Delete;
	@FindBy(id="popup_ok")
	WebElement YesButton;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement SuccessfulMessage;

	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickLoanDetails() throws Exception{
		LoanDetails.click();
	}
	public void clickAddEmployee() throws Exception{
		AddEmployee.click();	
	}
	public void clickLoad() throws Exception{
		Load.click();
	}
//	public void clickMultiAllotment() throws Exception{
//		MultiAllotment.click();
//	}
	public void clickView() throws Exception{
		View.click();
	}
	public void ClickDetail() throws Exception{
		Detail.click();
	}
	public void ClickDelete() throws Exception{
		Delete.click();
	}
	public void clickYesButton() throws Exception{
		YesButton.click();
		}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}

}
