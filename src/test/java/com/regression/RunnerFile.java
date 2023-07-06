package com.regression;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		plugin = { "json:target/cucumber.json" }, // report = main in json format {}
		features = { "./src/test/resources/Online banking login.feature" }, // feature file location/path
		glue = { "com.generic" }, // step def package name
		tags = "@Smoke" // test type= @Smoke
		
		)

public class RunnerFile extends AbstractTestNGCucumberTests  {
	
}
