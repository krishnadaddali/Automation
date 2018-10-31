package com.wfo.card.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wfo.card.driver.DriverFactory;
import com.wfo.card.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestSteps {

	private HomePage homepage;
	private WebDriver webDriver;

	public LoginTestSteps() {
		webDriver = DriverFactory.getDriver();
		homepage = new HomePage(webDriver);
	}

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {

		homepage.openHomePage();

	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {

		WebElement clickmyaccount = homepage.clickMyAccount();
		clickmyaccount.click();

	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password)
			throws Throwable {

		webDriver.findElement(By.id("log")).sendKeys(username);
		webDriver.findElement(By.id("pwd")).sendKeys(password);
		webDriver.findElement(By.id("login")).click();

	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {

	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {

	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {

	}

}
