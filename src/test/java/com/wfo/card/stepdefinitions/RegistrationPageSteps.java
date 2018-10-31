package com.wfo.card.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.wfo.card.driver.DriverFactory;
import com.wfo.card.pages.RegistrationrPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationPageSteps {

	private RegistrationrPage registrationrPage;

	public RegistrationPageSteps() {
		WebDriver webDriver = DriverFactory.getDriver();
		registrationrPage = new RegistrationrPage(webDriver);
	}

	@Given("^i go to guru registration page$")
	public void i_go_to_guru_registration_page() throws Throwable {
		registrationrPage.openRegistraitonPage();
	}

	@When("^i choose an element from the dropdown$")
	public void i_choose_an_element_from_the_dropdown() throws Throwable {
		registrationrPage.selectAnElementFromDropDown();
	}

	@Then("^the that element will be selected$")
	public void the_that_element_will_be_selected() throws Throwable {
		String selectedValue = registrationrPage.getDropdownValue();

		Assert.assertEquals("ANTARCTICA", selectedValue);
	}

}
