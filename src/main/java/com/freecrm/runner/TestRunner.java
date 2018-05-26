package com.freecrm.runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Chau\\eclipse-workspace\\com.freecrm\\src\\main\\java\\com\\freecrm\\features\\testCaseOne.feature",
				glue = {"com.freecrm.stepdefinition"},
				monochrome = true,
				strict = true,
				dryRun = true)

public class TestRunner {

}