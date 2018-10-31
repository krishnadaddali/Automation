package com.wfo.card.servicetest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// Create a new instance of the FireFox driver

		System.setProperty("webdriver.chrome.driver",
				"/SeleniumSoftwares/new_driver/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://toolsqa.wpengine.com/automation-practice-form");

		List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));

		boolean bValue = false;

		bValue = rdBtn_Sex.get(0).isSelected();

		if (bValue == true) {

			rdBtn_Sex.get(1).click();
		} else {

			rdBtn_Sex.get(0).click();
		}

		WebElement rdBtn_Exp = driver.findElement(By.id("exp-2"));
		rdBtn_Exp.click();

		List<WebElement> chkBx_Profession = driver.findElements(By
				.name("profession"));

		int iSize = chkBx_Profession.size();

		for (int i = 0; i < iSize; i++) {

			String sValue = chkBx_Profession.get(i).getAttribute("value");

			if (sValue.equalsIgnoreCase("Automation Tester")) {
				chkBx_Profession.get(i).click();

				break;
			}
		}

		WebElement webelent = driver.findElement(By
				.cssSelector("input[value='Selenium IDE']"));
		webelent.click();

		// driver.quit();

	}

}
