package com.wfo.card.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.wfo.card.servicetest.DriverInit;

public class SingletonDriverInitiTest {

	WebDriver driver;

	@Before
	public void setUp() {
		DriverInit instanceDriver = DriverInit.getInstance();
		driver = instanceDriver.openBrowser();

	}

	@Test
	public void testMethod() {
		driver.get("http://www.google.com");
		System.out.print(driver.getTitle());
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
