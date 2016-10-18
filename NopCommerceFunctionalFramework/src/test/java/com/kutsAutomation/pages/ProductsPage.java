package com.kutsAutomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class ProductsPage extends BasePage {
	
	private String url = "http://admin-demo.nopcommerce.com/Admin/Product/List";

	@FindBy(how=How.XPATH,using="//html/body/div[3]/div[3]/div/form[1]/div[1]/div/a")
	private WebElement addnewButton;
	
	@FindBy(how=How.XPATH,using="//html/body/div[3]/div[3]/div[1]")
	private WebElement addSuccessfulMesage;
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div[3]/div/form[1]/div[2]/div/div/div[2]/div/div/table/tbody")
	private WebElement productTable;
	
	private String lastSearchedProduct;
	
	@FindBy(how=How.ID,using="delete-selected")
	private WebElement deleteSelectedButton;
	
	
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
	
	public void selectProduct(String productName){
		WebElement tr = searchProduct(productName);
		tr.findElement(By.tagName("input")).click();
		//System.out.println("Product Selected : "+tr.findElement(By.xpath("td[3]")).getText());
	}
	
	public WebElement searchProduct(String productName){
		lastSearchedProduct = productName;
		List<WebElement> allrows = productTable.findElements(By.tagName("tr"));
		for(WebElement tr : allrows){
			for(WebElement td: tr.findElements(By.tagName("td"))){
				if(td.getText().equals(productName)){
					//System.out.println("Product exists : "+td.getText());
					return tr;
				}
			}
		}
		return null;
	}
	
	public WebElement searchPreviousProduct() throws InterruptedException{
		return searchProduct(lastSearchedProduct);
	}
	
	public void clickDeleteSelectedButton(){
		deleteSelectedButton.click();
		driver.navigate().refresh();
		//System.out.println("Deleted : "+ lastSearchedProduct);
	}
}