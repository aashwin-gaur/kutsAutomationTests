package com.kutsAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DashboardPage extends BasePage {

	private String url = "http://admin-demo.nopcommerce.com/admin/";

	@FindBy(how = How.XPATH, using = "//html/body/div[3]/div[2]/div/ul/li[2]/a/span")
	private WebElement catalogButton;

	@FindBy(how = How.XPATH, using = "//html/body/div[3]/div[2]/div/ul/li[2]/ul/li[1]/a/span")
	private WebElement productButton;

	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	public DashboardPage gotoPage() {
		driver.get(url);
		return this;
	}

	public boolean isAt() {
		if (driver.getCurrentUrl().toLowerCase().equals(url.toLowerCase())) {
			return true;
		}
		return false;
	}

	public void clickOnCatalog() {
		catalogButton.click();
	}

	public void clickOnProducts() {
		productButton.click();
	}

}
