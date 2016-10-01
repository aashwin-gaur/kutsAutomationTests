package com.kutsAutomation.pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddProductsPage extends BasePage {

	private String url = "http://admin-demo.nopcommerce.com/Admin/Product/Create";

	@FindBy(how = How.ID, using = "Name")
	private WebElement productName;

	@FindBy(how = How.ID, using = "ShortDescription")
	private WebElement productDesc;


	@FindBy(how = How.NAME, using = "save")
	private WebElement save;

	public AddProductsPage() {
		PageFactory.initElements(driver, this);
	}

	public AddProductsPage gotoPage() {
		driver.get(url);
		return this;
	}

	public boolean isAt() {
		if (driver.getCurrentUrl().equals(url)) {
			return true;
		}
		return false;
	}

	public void addProduct(String prodName, String prodDesc, String price) throws AWTException {
		productName.sendKeys(prodName);
		productDesc.sendKeys(prodDesc);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0, 2000)");
		executor.executeScript("document.getElementById(\"Price\").value = "+price);
		save.click();
	}

}
