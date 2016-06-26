package com.kutsAutomation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public abstract class BasePage {

	protected WebDriver driver = new HtmlUnitDriver();	
	
	public WebDriver initialisedriver(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void closeDriver(){
		if(driver!=null){
			driver.close();
		}
	}
	
}
