package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

import org.openqa.selenium.WebElement;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class VacationWithoutPaymentRequestPage extends PageObject {

	@FindBy(css = ".Zebra_DatePicker_Icon_Wrapper input[id='_evovacation_WAR_EvoVacationportlet_startDate']")
	private WebElement startDatePicker;

	@FindBy(css = "div:nth-child(11) > table.dp_header > tbody > tr > td.dp_caption")
	private WebElementFacade goToMonthSelect;

	@FindBy(css = "div:nth-child(11) > table.dp_monthpicker > tbody > tr:nth-child(3) > td.dp_month_8")
	private WebElementFacade monthSelect;

	@FindBy(css = "div:nth-child(11) > table.dp_daypicker > tbody > tr:nth-child(2) > td:nth-child(3)")
	private WebElement selectStartDate;

	@FindBy(css = ".Zebra_DatePicker_Icon_Wrapper input[id='_evovacation_WAR_EvoVacationportlet_endDate']")
	private WebElement endDatePicker;

	@FindBy(css = "div:nth-child(12) > table.dp_header > tbody > tr > td.dp_caption")
	private WebElement goToMonthSelectForEndDate;

	@FindBy(css = "div:nth-child(12) > table.dp_monthpicker > tbody > tr:nth-child(3) > td.dp_month_8")
	private WebElementFacade monthSelectForEndDate;

	@FindBy(css = "div:nth-child(12) > table.dp_daypicker > tbody > tr:nth-child(2) > td:nth-child(6)")
	private WebElement selectEndDate;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_type_CF")
	private WebElementFacade vacationWithoutPayment;

	@FindBy(css = ".aui-button-holder  > .aui-button-submit [id='_evovacation_WAR_EvoVacationportlet_saveButton']")
	private WebElement saveButton;

	@FindBy(css = "div > div.view-vacation > div.aui-column.aui-w20.vacation-actions.aui-column-first > div > div > div:nth-child(2) > div > i")
	private WebElementFacade messageAfterWithdrawn;

	@FindBy(css = ".col-6 a")
	private List<WebElement> status;

//	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_PENDINGCheckbox")
//	private WebElementFacade vacationStatus;

	public void selectStartDate() {
		startDatePicker.click();
		goToMonthSelect.click();
		monthSelect.click();
		selectStartDate.click();
	}

	public void selectEndDate() {
		endDatePicker.click();
		goToMonthSelectForEndDate.click();
		monthSelectForEndDate.click();
		selectEndDate.click();
	}

	public void selectVacationWithoutPayment() {
		vacationWithoutPayment.click();
	}

	public void save() {
		saveButton.click();
	}

	public boolean isWithdrawnMessagePresent() {
		return messageAfterWithdrawn.isPresent();
	}

//	public void vacationStatus() {
//		vacationStatus.click();
//	}

	public void search(String word) {
		for (int i = 1; i < status.size(); i++) {
			if (status.get(i).getText().toLowerCase().contains(word.toLowerCase()))

			{
				System.out.println(status.get(i).getText());
				status.get(i).click();

			}
		}

	}

}