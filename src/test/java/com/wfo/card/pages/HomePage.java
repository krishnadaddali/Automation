package com.wfo.card.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver webDriver;

	public HomePage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}

	public void openHomePage() {
		webDriver.get("http://www.store.demoqa.com");

	}

	public WebElement clickMyAccount() {

		WebElement clickMyAccount = webDriver.findElement(By
				.xpath("//*[@id='account']/a"));
		return clickMyAccount;

	}

	public WebElement getAboutElement() {
		WebElement aboutElement = webDriver.findElement(By
				.xpath("//*[@id='hptl']/a[1]"));
		return aboutElement;
	}

}
