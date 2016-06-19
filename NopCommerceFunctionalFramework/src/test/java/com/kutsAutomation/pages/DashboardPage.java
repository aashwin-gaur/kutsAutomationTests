package com.kutsAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {

	
	private String url = "http://admin-demo.nopcommerce.com/login?ReturnUrl=%2fadmin%2f";
	
	
	public DashboardPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public DashboardPage gotoPage(){
		driver.get(url);
		return this;
	}
	
	public boolean isAt(){
		if(driver.getCurrentUrl().equals(url)){
			return true;
		}
		return false;
	}
}
