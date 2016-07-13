package com.kutsAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DashboardPage extends BasePage {

	
	private String url = "http://admin-demo.nopcommerce.com/admin/";
	
	
	public DashboardPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public DashboardPage gotoPage(){
		driver.get(url);
		return this;
	}
	
	public boolean isAt(){
		Reporter.log(url);
		Reporter.log(driver.getCurrentUrl());
		if(driver.getCurrentUrl().toLowerCase().equals(url.toLowerCase())){
			return true;
		}
		return false;
	}
}
