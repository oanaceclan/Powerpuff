package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class NewVacationRequestPage extends PageObject {

	@FindBy(css = "[href='http://172.22.4.88:9091/vacation']")
	private WebElementFacade vacationbtn;

	@FindBy(css = "[href*='menuItem=new-request']")
	private WebElementFacade newRequestBtn;

	@FindBy(id = "vacDaysLeft")
	private WebElementFacade vacationDaysLeft;

	@FindBy(css = ".Zebra_DatePicker_Icon_Wrapper input[id='_evovacation_WAR_EvoVacationportlet_startDate']")
	private WebElement startDatePicker;

	@FindBy(css = "div:nth-child(11) > table.dp_header > tbody > tr > td.dp_caption")
	private WebElementFacade goToMonthSelect;

	@FindBy(css = "div:nth-child(11) > table.dp_monthpicker > tbody > tr:nth-child(3) > td.dp_month_8")
	private WebElementFacade monthSelect;

	@FindBy(css = "div:nth-child(11) > table.dp_daypicker > tbody > tr:nth-child(3) > td:nth-child(2)")
	private WebElement selectStartDate;

	@FindBy(css = ".Zebra_DatePicker_Icon_Wrapper input[id='_evovacation_WAR_EvoVacationportlet_endDate']")
	private WebElement endDatePicker;

	@FindBy(css = "div:nth-child(12) > table.dp_header > tbody > tr > td.dp_caption")
	private WebElement goToMonthSelectForEndDate;

	@FindBy(css = "div:nth-child(12) > table.dp_monthpicker > tbody > tr:nth-child(3) > td.dp_month_8")
	private WebElementFacade monthSelectForEndDate;

	@FindBy(css = "div:nth-child(12) > table.dp_daypicker > tbody > tr:nth-child(3) > td:nth-child(6)")
	private WebElement selectEndDate;

	@FindBy(css = ".aui-button-holder  > .aui-button-submit [id='_evovacation_WAR_EvoVacationportlet_saveButton']")
	private WebElement saveButton;

	@FindBy(css = "[id*='_evovacation_WAR_EvoVacationportlet_type_CS']")
	private WebElementFacade specialVacation;

	@FindBy(css = "[id*='_evovacation_WAR_EvoVacationportlet_specialReason'] option[value='CHILD_BIRTH']")
	private WebElementFacade specialVacationType;

	@FindBy(css = "div > div.view-vacation > div.aui-column.aui-w70.vacation-info-column.aui-column-first > div > div:nth-child(6) >b")
	private WebElementFacade childBirthVacationRequest;

	public void vacationButton() {
		vacationbtn.click();
	}

	public void newRequestButton() {
		newRequestBtn.click();
	}

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

	public void selectSpecialVacation() {
		specialVacation.click();
	}
	
	public void selectSpecialVacationType() {
		specialVacationType.click();
	}

	public void save() {
		saveButton.click();
	}

	public boolean childBirthVacationRequestWasCreated() {
		return childBirthVacationRequest.isPresent();
	}

	

}