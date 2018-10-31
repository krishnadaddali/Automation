package com.wfo.card.pages;

import org.openqa.selenium.WebDriver;

public class CheckBxRdoBtnHome {

	private WebDriver webDriver;

	public CheckBxRdoBtnHome(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}

	public void openHomePage() {
		webDriver.get("http://toolsqa.com/automation-practice-form/");

		webDriver.manage().window().maximize();

	}
}
