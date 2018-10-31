package com.wfo.card.test;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "/KSoftwares/chromedriver_win32/chromedriver.exe");
		 */

		System.setProperty("webdriver.chrome.driver",
				"/SeleniumSoftwares/new_driver/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		// Wait For Page To Load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement email = driver.findElement(By.id("email"));

		try {
			driver.findElement(By.id("email")).sendKeys("k");

			// Enter Password id="identifierId"
			driver.findElement(By.id("pass")).sendKeys("Amma1820");

			// Click on 'Sign In' button

			driver.findElement(By.id("signIn")).click();

			// Click on Compose Mail.
			driver.findElement(By.xpath("//div[@class='z0']/div")).click();

			// Click on the image icon present in the top right navigational Bar
			driver.findElement(
					By.xpath("//div[@class='gb_1 gb_3a gb_nc gb_e']/div/a"))
					.click();

			// Click on 'Logout' Button
			driver.findElement(By.xpath("//*[@id='gb_71']")).click();

			// Identify the number of Link on webpage and assign into Webelement
			// List

			List<WebElement> links = driver.findElements(By.xpath("//a"));

			// Count the total Link list on Web Page

			int linkCount = links.size();

			// Print the total count of links on webpage

			System.out.println("Total Number of link count on webpage = "
					+ linkCount);

			// Identify all the elements on web page

			List<WebElement> allElements = driver.findElements(By.xpath("//*"));

			// Count the total all element on web page

			int elementsCount = allElements.size();

			// Print the total count of all element on webpage

			System.out.println("Total Number of All Element on webpage = "
					+ elementsCount);
		} catch (Exception e) {
			takeSnapShot(driver, "/SeleniumSoftwares/test.png");
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.close();
		}

		driver.close();
	}

	public static void takeSnapShot(WebDriver webdriver, String fileWithPath)
			throws Exception {

		// Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

		// Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination

		File DestFile = new File(fileWithPath);

		// Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);

	}

}
