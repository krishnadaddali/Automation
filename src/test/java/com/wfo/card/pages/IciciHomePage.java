package com.wfo.card.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IciciHomePage {

	private WebDriver webDriver;

	public IciciHomePage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}

	public void openHomePage() {
		webDriver.get("https://www.icicibank.com/");

	}

	public WebElement getIciciText() {

		WebElement webelelement = webDriver.findElement(By
				.xpath("//*[@id='main']/div[2]/a"));
		webelelement.getText();
		System.out.println("Printing " + webelelement);
		return webelelement;
	}

	public void clickCorporateTab() {

		WebElement corporatetext = webDriver.findElement(By.id("CorporateTab"));
		corporatetext.click();
		System.out.println(corporatetext);
	}

	public void paymentsTab() {

		WebElement payment = webDriver.findElement(By.id("paymentstab"));
		payment.click();
		System.out.println(payment);
	}

}
