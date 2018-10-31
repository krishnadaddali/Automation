package com.wfo.card.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private static WebDriver webDriver;

	public static WebDriver getDriver() {
		if (webDriver == null) {
			System.setProperty("webdriver.chrome.driver",
					"/SeleniumSoftwares/new_driver/chromedriver_win32/chromedriver.exe");
			webDriver = new ChromeDriver();
		} /*
		 * else { System.setProperty("webdriver.chrome.driver",
		 * "/SeleniumSoftwares/new_driver/chromedriver_win32/FirefoxDriver.exe"
		 * ); webDriver = new FirefoxDriver();
		 */

		return webDriver;

	}

}
