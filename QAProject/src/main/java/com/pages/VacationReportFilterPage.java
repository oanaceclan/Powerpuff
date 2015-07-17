package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class VacationReportFilterPage extends PageObject {

	@FindBy(css = "[href*='menuItem=vacation-report']")
	private WebElementFacade vacationReportButton;

	@FindBy(css = "[id*='_evovacation_WAR_EvoVacationportlet_exportMonth']")
	private WebElementFacade exportMonth;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_exportYear")
	private WebElementFacade exportYear;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_approved")
	private WebElementFacade approved;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_pending")
	private WebElementFacade pending;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_CIM")
	private WebElementFacade cim;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_other")
	private WebElementFacade other;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_reportLastName")
	private WebElementFacade lastnameField;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_reportFirstName")
	private WebElementFacade firstnameField;

	@FindBy(css = ".aui-button-input-submit")
	private WebElementFacade searchButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_exportButton")
	private WebElementFacade exportButton;

	public void vacationReportButtonClick() {
		vacationReportButton.click();
	}

	public void selectMonthClick(String text) {
		exportMonth.click();
		exportMonth.click();
		(exportMonth).selectByVisibleText(text);
	}

	public void selectYearClick(String text) {
		(exportYear).selectByVisibleText(text);
	}

	public void approvedStatusCheck() {
		approved.click();
	}

	public void pendingStatusCheck() {
		pending.click();
	}

	public void cimIncludeCheck() {
		cim.click();
	}

	public void otherIncludeCheck() {
		other.click();
	}

	public void WriteLastNameField(String keyword) {
		lastnameField.type(keyword);
	}

	public void WriteFirstNameField(String keyword) {
		firstnameField.type(keyword);
	}

	public void searchButtonClick() {
		searchButton.click();
	}
	
	public void exportButtonClick() {
		exportButton.waitUntilVisible();
		exportButton.click();
	}

}