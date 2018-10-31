package com.wfo.card.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableHomePage {

	private WebDriver webDriver;

	public WebTableHomePage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}

	public void openHomePage() {
		webDriver.get("http://demo.guru99.com/test/table.html");

		webDriver.manage().window().maximize();

	}

	public void Logo() {

		WebElement clicklogo = webDriver
				.findElement(By
						.xpath("//*[@id='includedContent']/div/div[1]/div[1]/div[1]/a/img"));

		clicklogo.click();

		// WebElement mytable =
		// webDriver.findElement(By.xpath("/html/body/table/tbody"));

	}

	public void getRowsandColumns() {

		WebElement table = webDriver.findElement(By
				.xpath("/html/body/table/tbody"));

		List<WebElement> rows_table = table.findElements(By.tagName("tr"));

		// To calculate no of rows In table.
		int rows_count = rows_table.size();

		System.out.println(rows_count);

		// Loop will execute till the last row of table.
		for (int row = 0; row < rows_count; row++) {
			// To locate columns(cells) of that specific row.
			List<WebElement> Columns_row = rows_table.get(row).findElements(
					By.tagName("td"));
			// To calculate no of columns (cells). In that specific row.
			int columns_count = Columns_row.size();
			System.out.println("Number of cells In Row " + row + " are "
					+ columns_count);
			// Loop will execute till the last cell of that specific row.
			for (int column = 0; column < columns_count; column++) {
				// To retrieve text from that specific cell.
				String celtext = Columns_row.get(column).getText();
				System.out.println("Cell Value of row number " + row
						+ " and column number " + column + " Is " + celtext);
			}

			System.out.println("********************** ");

		}
	}

	public WebElement getInsuranceProjectInfo() {
		WebElement insuranceproject = webDriver.findElement(By
				.xpath("//*[@id='navbar-brand-centered']/ul/li[2]/a"));
		return insuranceproject;
	}

}
