package org.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
glue = {"org.stepdefinition"} ,dryRun=false,
plugin= {"pretty","html:target/cucumber-html-report",
		"json:target/cucumber-report/cucumber.json",
		"pretty:target/cucumber-pretty.txt",
		"junit:target/cucumber-report/cucumber-results.xml"},
monochrome=true)

public class TestRunnerClass {
	

}
