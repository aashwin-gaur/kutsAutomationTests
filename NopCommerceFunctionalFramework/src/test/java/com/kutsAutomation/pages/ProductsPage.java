package com.kutsAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class ProductsPage extends BasePage {
	
	private String url = "http://admin-demo.nopcommerce.com/Admin/Product/List";

	@FindBy(how=How.XPATH,using="//html/body/div[3]/div[3]/div/form[1]/div[1]/div/a")
	private WebElement addnewButton;
	
	@FindBy(how=How.XPATH,using="//html/body/div[3]/div[3]/div[1]")
	private WebElement addSuccessfulMesage;
	
	public ProductsPage() {
		PageFactory.initElements(driver, this);
	}

	public ProductsPage gotoPage() {
		driver.get(url);
		return this;
	}

	public boolean isAt() {
		if (driver.getCurrentUrl().equals(url)) {
			return true;
		}
		return false;
	}

	public void clickOnAddnewButton(){
		addnewButton.click();
	}
	
	public boolean addProductSuccess(){
		return addSuccessfulMesage.isDisplayed();
	}
}
