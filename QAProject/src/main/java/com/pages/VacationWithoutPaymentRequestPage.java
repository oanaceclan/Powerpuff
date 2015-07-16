package com.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

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

	
	

}