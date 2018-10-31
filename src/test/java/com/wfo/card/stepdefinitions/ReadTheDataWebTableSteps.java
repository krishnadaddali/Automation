package com.wfo.card.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.wfo.card.driver.DriverFactory;
import com.wfo.card.pages.WebTableHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReadTheDataWebTableSteps {

	private WebDriver webDriver;
	private WebTableHomePage homepage;

	public ReadTheDataWebTableSteps() {
		webDriver = DriverFactory.getDriver();
		homepage = new WebTableHomePage(webDriver);

	}

	@Given("^to go to home page$")
	public void to_go_to_home_page() throws Throwable {

		homepage.openHomePage();

	}

	@When("^to click the logo button$")
	public void to_click_the_logo_button() throws Throwable {

		homepage.Logo();

	}

	@When("^Count the no of rows columns and fetch the data from the table$")
	public void count_the_no_of_rows_and_columns_from_the_table()
			throws Throwable {

		homepage.getRowsandColumns();
	}

	@Then("^To get the information about insurance Project$")
	public void to_get_the_information_about_insurance_Project()
			throws Throwable {

		System.out.println(homepage.getInsuranceProjectInfo());

	}

}
