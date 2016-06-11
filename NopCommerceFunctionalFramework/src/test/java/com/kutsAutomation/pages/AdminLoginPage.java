package com.kutsAutomation.pages;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class AdminLoginPage {

	private WebDriver driver = new FirefoxDriver();
	private String url = "http://admin-demo.nopcommerce.com/login?ReturnUrl=%2fadmin%2f";
	
	@FindBy(how = How.ID, using = "Email")
	private WebElement email;
	
	@FindBy(how = How.ID, using = "Password")
	private WebElement pass;
	
	@FindBy(how = How.ID,using = "RememberMe")
	private WebElement rememberMeCheckbox;
	
	@FindBy(how = How.CSS, using = "html body div.master-wrapper-page div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.login-page div.page-body div.customer-blocks div.returning-wrapper.fieldset form div.buttons input.button-1.login-button")
	private WebElement loginbutton;
	
	public AdminLoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public AdminLoginPage gotoPage(){
		driver.get(url);
		return this;
	}
	
	public boolean isAt(){
		if(driver.getCurrentUrl().equals(url)){
			return true;
		}
		return false;
	}
	
	public void login(String email,String password){
		if(!isAt()){
			gotoPage();
		}
		this.email.clear();
		this.email.sendKeys(email);
		pass.clear();
		pass.sendKeys(password);
		loginbutton.click();
		
	}
}
