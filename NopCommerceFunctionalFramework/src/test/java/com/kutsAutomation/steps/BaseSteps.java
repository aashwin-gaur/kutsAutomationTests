package com.kutsAutomation.steps;



import com.kutsAutomation.pages.BasePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseSteps extends BasePage {

	@Before
	public void before(){
		initialisedriver();
	}
	
	@After
	public void after(){
		closeDriver();
	}
}
