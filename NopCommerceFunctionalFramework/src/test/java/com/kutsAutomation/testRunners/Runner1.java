package com.kutsAutomation.testRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/com/kutsAutomation/features"
				,glue = "com.kutsAutomation.steps"
				, tags = {"@Single"}
				, format= {"pretty"})
public class Runner1 extends AbstractTestNGCucumberTests{
	
	
}
