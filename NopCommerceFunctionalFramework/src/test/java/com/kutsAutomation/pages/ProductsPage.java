package com.kutsAutomation.pages;

import java.util.List;

import org.apache.bcel.generic.Select;
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
	
	@FindBy(how=How.XPATH, using="//*[@id=\"products-grid\"]/table/tbody")
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
	}
	
	public WebElement searchProduct(String productName){
		lastSearchedProduct = productName;
		List<WebElement> allrows = productTable.findElements(By.tagName("tr"));
		System.out.println(allrows.size());
		for(WebElement tr : allrows){
			for(WebElement td: tr.findElements(By.xpath("/td[3]"))){
				
				System.out.println("Name of product : "+td.getText());

				if(td.getText().equals(productName)){
					return tr;
				}
			}
		}
		return null;
	}
	
	public WebElement searchPreviousProduct(){
		return searchProduct(lastSearchedProduct);
	}
	
	public void clickDeleteSelectedButton(){
		deleteSelectedButton.click();
	}
}
