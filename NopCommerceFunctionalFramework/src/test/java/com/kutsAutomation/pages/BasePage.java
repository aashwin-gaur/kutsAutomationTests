package com.kutsAutomation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class BasePage {

	protected static WebDriver driver;	
	
	private WebDriver initialisedriver(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void openChrome(){
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		System.setProperty("webdriver.chrome.driver","ThirdParty\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(capabilities);   //needs location
		initialisedriver();
	}
	
	public void closeDriver(){
		if(driver!=null){
			driver.close();
		}
	}
	
}
