package com.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//@DefaultUrl("http://172.22.4.88:9091/login")
public class DatePickerPage extends PageObject {
	@FindBy(css = "div[style*='display: block']")
	private WebElementFacade monthAndYearFromStartDate;

	@FindBy(css = ".Zebra_DatePicker_Icon_Wrapper input[id='_evovacation_WAR_EvoVacationportlet_startDate']")
	private WebElement startDatelocator;

	@FindBy(css = ".Zebra_DatePicker_Icon_Wrapper input[id='_evovacation_WAR_EvoVacationportlet_endDate']")
	private WebElement endDateLocator;

	@FindBy(css = "div[style*='display: block'] table[class='dp_daypicker'] td:not(.dp_not_in_month)")
	private List<WebElement> daysInMonth;

	public void chooseTheStartDate(int day, String month, int year) {
		String monthAndYear = month + ", " + year;
		startDatelocator.click();
		WebElement date = monthAndYearFromStartDate.findElement(By.cssSelector("td[class='dp_caption']"));
		String text = date.getText();
		WebElement next = monthAndYearFromStartDate.findElement(By.cssSelector("td[class='dp_next']"));
		while (true) {
			if (text.compareTo(monthAndYear) == 0)
				break;
			else {
				next.click();
				WebElement data = monthAndYearFromStartDate.findElement(By.cssSelector("td[class='dp_caption']"));
				text = data.getText();
			}
		}
			WebElement tableDay = monthAndYearFromStartDate.findElement(By.cssSelector("table[class='dp_daypicker']"));

		String ziua = Integer.toString(day);

		for (WebElement daySelected : daysInMonth) {
			if (daySelected.getText().contentEquals(ziua)) {
				element(daySelected).waitUntilVisible();
				daySelected.click();
				break;
			}
		}

	}

	public void chooseTheEndDate(int day, String month, int year) {
		String monthAndYear = month + ", " + year;
		endDateLocator.click();
		WebElement date = monthAndYearFromStartDate.findElement(By.cssSelector("td[class='dp_caption']"));
		String text = date.getText();
		WebElement next = monthAndYearFromStartDate.findElement(By.cssSelector("td[class='dp_next']"));
		while (true) {
			if (text.compareTo(monthAndYear) == 0)
				break;
			else {
				next.click();
				WebElement data = monthAndYearFromStartDate.findElement(By.cssSelector("td[class='dp_caption']"));
				text = data.getText();
			}
		}
		@SuppressWarnings("unused")
		WebElement tableDay = monthAndYearFromStartDate.findElement(By.cssSelector("table[class='dp_daypicker']"));

		String ziua = Integer.toString(day);

		for (WebElement daySelected : daysInMonth) {
			if (daySelected.getText().contentEquals(ziua)) {
				element(daySelected).waitUntilVisible();
				daySelected.click();
				break;
			}
		}
	}
}