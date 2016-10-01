package com.kutsAutomation.steps;


import com.kutsAutomation.pages.BasePage;
import com.kutsAutomation.pages.Pages;

import static org.testng.Assert.*;

import org.hamcrest.generator.QDoxFactoryReader;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminLoginSteps extends BasePage{
	
	@Before
	public void before(){
		openChrome();
	}
	
	@After
	public void after(){
		closeDriver();
	}
	
	@Given("^I am on the \"([^\"]*)\" Page$")
	public void i_am_on_the_Page(String arg1) throws Throwable {
		Pages.getAdminLoginPage().gotoPage();
	}


	@When("^I login with my credentials$")
	public void i_login_with_my_credentials(DataTable arg1) throws Throwable {
		String email = arg1.cells(0).get(1).get(0);
		String password = arg1.cells(0).get(1).get(1);
	    Pages.getAdminLoginPage().login(email, password);
		//System.out.println(email + "    " + password);
	}
	
	
	@Then("^I should be taken to the \"([^\"]*)\" Page$")
	public void i_should_be_taken_to_the_Page(String arg1) throws Throwable {
	    assertTrue(Pages.getDashboardPage().isAt());
	}


	@Then("^I should be given an error$")
	public void i_should_be_given_an_error() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on RememberMe$")
	public void i_click_on_RememberMe() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		closeDriver();
	}

	@When("^I Reopen the browser$")
	public void i_Reopen_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    openChrome();
	}

	@When("^I am on the AdminHomePage$")
	public void i_am_on_the_AdminHomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^The \"([^\"]*)\" should be the value of the email textbox$")
	public void the_should_be_the_value_of_the_email_textbox(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}
	
	
	@Given("^I click on \"([^\"]*)\"$")
	public void i_click_on(String arg1) throws Throwable {
		if(arg1.equals("Catalog")){
			Pages.getDashboardPage().clickOnCatalog();
		}
		if(arg1.equals("Products")){
			Pages.getDashboardPage().clickOnProducts();
		}
		if(arg1.equals("Add New")){
			Pages.getProductsPage().clickOnAddnewButton();
		}
	}

	@When("^I add Product Details$")
	public void add_Product_Details(DataTable arg1) throws Throwable {
		String prodName = arg1.cells(0).get(1).get(0);
		String prodDesc = arg1.cells(0).get(1).get(1);
		String price = arg1.cells(0).get(1).get(2).toString();
	    Pages.getAddProductsPage().addProduct(prodName, prodDesc, price);
	}

	@Then("^The product is in the list of Product$")
	public void the_product_is_in_the_list_of_Product() throws Throwable {
		assertTrue(Pages.getProductsPage().addProductSuccess());
	}
}
