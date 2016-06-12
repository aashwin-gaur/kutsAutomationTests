package com.kutsAutomation.testRunners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/kutsAutomation/features"
				,glue = "src/test/java/com/kutsAutomation/steps")
public class Runner1 {
	
	
}
