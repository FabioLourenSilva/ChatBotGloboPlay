package com.globobot.runner;


import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import com.globo.util.DriverContext;


import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", 
				 glue = {"com.globobot.steps"},
				 plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty",
	                		"json:target/cucumber-reports/CucumberTestReport.json"}, 
				 //Verifica se a step esta lincada com o BDD cucumber deixar ela comentada e descomentar apenas para teste
				// strict=true , dryRun=true,
//				 tags="@validarbotoesmenugenerico",
				 tags="@teste",
				 monochrome = true)

public class RunCucumberTest {
	@BeforeClass

	public static void beforeclass() {
		//chrome ou firefox
		System.setProperty("navegador", "chrome");

		//windows ou mac
		System.setProperty("SO", "windows");
		
	}
	
	@AfterClass
	public static void afterclass() {
		//DriverContext.getDriver().quit();
		//DriverContext.getDriver().close();
	}
}
