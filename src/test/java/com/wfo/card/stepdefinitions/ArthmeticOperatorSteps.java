package com.wfo.card.stepdefinitions;

import com.wfo.card.driver.ArthmeticOperatorsDAO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ArthmeticOperatorSteps {

	private ArthmeticOperatorsDAO addTwonum;
	private int c;

	@Given("^I have a calculator$")
	public void i_have_a_calculator() throws Throwable {

		ArthmeticOperatorsDAO addTwonum = new ArthmeticOperatorsDAO();

		System.out.println(addTwonum);

	}

	@When("^I add -(\\d+) and (\\d+)$")
	public int add(int a, int b) throws Throwable {

		int c = addTwonum.add(a, b);

		return c;

	}

	@Then("^the result should be (\\d+)$")
	public void result(int a) throws Throwable {

		addTwonum.equals(addTwonum);
	}

}
