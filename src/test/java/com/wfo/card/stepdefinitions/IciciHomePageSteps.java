package com.wfo.card.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wfo.card.driver.DriverFactory;
import com.wfo.card.pages.IciciHomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IciciHomePageSteps {

	private IciciHomePage icicihomepage;

	public IciciHomePageSteps() {
		WebDriver webDriver = DriverFactory.getDriver();
		icicihomepage = new IciciHomePage(webDriver);
	}

	@Given("^customer see the all the information about bank$")
	public void customer_see_the_all_the_information_about_bank()
			throws Throwable {

		WebElement geticicitext = icicihomepage.getIciciText();

		Assert.assertEquals("ICICILogo", geticicitext);

	}

	@And("^customer wants know about personal banking$")
	public void customer_wants_know_about_personal_banking() throws Throwable {

	}

	@And("^customer wants know about corporate banking$")
	public void customer_wants_know_about_corporate_banking() throws Throwable {

		icicihomepage.clickCorporateTab();
	}

	@When("^customer wants know about international banking$")
	public void customer_wants_know_about_international_banking()
			throws Throwable {

	}

	@When("^customer wants know about policy$")
	public void customer_wants_know_about_policy() throws Throwable {

	}

	@Then("^customer wants open the account$")
	public void customer_wants_open_the_account() throws Throwable {

	}

}
