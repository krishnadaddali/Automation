package com.wfo.card.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.wfo.card.driver.DriverFactory;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/ReadTheDataWebTable.feature", glue = { "com.wfo.card.stepdefinitions" }, tags = { "@smokeTest" }, plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" })
public class TestRunner {

	@AfterClass
	public static void closeBrowser() {
		DriverFactory.getDriver().close();

		System.out.println("Browser should not closed");

		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
		Reporter.setSystemInfo("user", "krishna");
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}

}
