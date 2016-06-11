package com.kutsAutomation.steps;


import com.kutsAutomation.pages.Pages;

import static org.junit.Assert.*;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	@Given("^I am on the \"([^\"]*)\" Page$")
	public void i_am_on_the_Page(String arg1) throws Throwable {
	    Pages.getAdminLoginPage().gotoPage();
	}



	@When("^I login with my credentials$")
	public void i_login_with_my_credentials(DataTable arg1) throws Throwable {
		String email = arg1.cells(0).get(0).toString();
		String password = arg1.cells(0).get(1).toString();
	    Pages.getAdminLoginPage().login(email, password);
	}
	
	
	@Then("^I should be taken to the \"([^\"]*)\" Page$")
	public void i_should_be_taken_to_the_Page(String arg1) throws Throwable {
	    assertTrue(Pages.dashboardPage.isAt());
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
	    throw new PendingException();
	}

	@When("^I Reopen the browser$")
	public void i_Reopen_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I am on the AdminHomePage$")
	public void i_am_on_the_AdminHomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^The \"([^\"]*)\" should be the value of the email textbox$")
	public void the_should_be_the_value_of_the_email_textbox(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}