package com.wfo.card.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wfo.card.driver.DriverFactory;
import com.wfo.card.pages.CheckBxRdoBtnHome;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckBoxRadioBtnSteps {

	private CheckBxRdoBtnHome home;
	private WebDriver webDriver;

	public CheckBoxRadioBtnSteps() {
		WebDriver webDriver = DriverFactory.getDriver();
		home = new CheckBxRdoBtnHome(webDriver);
	}

	@Given("^i access toolQA homepage$")
	public void i_access_toolQA_homepage() throws Throwable {

		home.openHomePage();
	}

	@When("^select the radio btn$")
	public void select_the_radio_btn() throws Throwable {

		/*
		 * WebElement webelement = webDriver.findElement(By
		 * .xpath("//*[@id='sex-0']"));
		 */

		WebElement webelement = webDriver.findElement(By
				.xpath("//*[@id='exp-0']"));

		webelement.click();

	}

	@Then("^click the check box$")
	public void click_the_check_box() throws Throwable {

		WebElement webelement = webDriver.findElement(By
				.cssSelector("input[value='Selenium IDE']"));
		webelement.click();

	}
}
