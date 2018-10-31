package com.wfo.card.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationrPage {

	private WebDriver webDriver;

	public RegistrationrPage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}

	public void openRegistraitonPage() {
		webDriver.get("http://demo.guru99.com/test/newtours/register.php");

	}

	public void selectAnElementFromDropDown() {

		Select drpCountry = new Select(
				webDriver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
	}

	public String getDropdownValue() {

		Select select = new Select(webDriver.findElement(By.name("country")));
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		return defaultItem;
	}

}
