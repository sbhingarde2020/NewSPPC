package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckIfPaymonthsRedirectsToNotification extends BasePage{
		@FindBy(id="salary")
		WebElement SalaryLink;
		@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[1]/a")
		WebElement PaymonthsLink;
		@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/li/a")
		WebElement ProcessJobs;
		
		public CheckIfPaymonthsRedirectsToNotification(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver,this);
		}
		
		public void clickSalaryLink(){
			SalaryLink.click();
		}
		
		public void selectPaymonthsLink(){
			PaymonthsLink.click();
		}

		public void selectProcessJobs(){
			ProcessJobs.click();
		}
		
		}
