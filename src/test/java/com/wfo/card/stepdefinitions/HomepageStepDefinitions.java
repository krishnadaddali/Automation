package com.wfo.card.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wfo.card.driver.DriverFactory;
import com.wfo.card.pages.HomePage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomepageStepDefinitions {

	private HomePage homePage;

	public HomepageStepDefinitions() {
		WebDriver webDriver = DriverFactory.getDriver();
		homePage = new HomePage(webDriver);
	}

	@Given("^i access google homepage$")
	public void i_access_google_homepage() throws Throwable {
		homePage.openHomePage();

	}

	@Then("^i see About link$")
	public void i_see_About_link() throws Throwable {
		WebElement aboutElement = homePage.getAboutElement();
		Assert.assertTrue(aboutElement.isDisplayed());

	}

	@Given("^i choose one element from the list$")
	public void i_choose_one_element_from_the_list() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the name is display$")
	public void the_name_is_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
