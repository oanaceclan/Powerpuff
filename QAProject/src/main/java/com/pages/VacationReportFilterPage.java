package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class VacationReportFilterPage extends PageObject {

	@FindBy(css = "[href*='menuItem=vacation-report']")
	private WebElementFacade vacationReportButton;

	@FindBy(css = "[id*='_evovacation_WAR_EvoVacationportlet_exportMonth']")
	private WebElementFacade exportMonth;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_exportYear")
	private WebElementFacade exportYear;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_approved")
	private WebElementFacade approvedbtn;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_pending")
	private WebElementFacade pendingbtn;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_CIM")
	private WebElementFacade cimbtn;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_other")
	private WebElementFacade otherbtn;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_reportLastName")
	private WebElementFacade lastname;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_reportFirstName")
	private WebElementFacade firstname;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_exportButton")
	private WebElementFacade exportButton;

	public void vacation_report_button() {
		vacationReportButton.click();
	}

	public void select_month(String text) {
		exportMonth.click();
		exportMonth.click();
		//exportMonth.waitUntilVisible();
		(exportMonth).selectByVisibleText(text);
		//exportMonth.click();
	}

	public void select_year(String text) {
		(exportYear).selectByVisibleText(text);
	}

	public void approved() {
		approvedbtn.click();
	}

	public void pending() {
		pendingbtn.click();
	}

	public void cim() {
		cimbtn.click();
	}

	public void other() {
		otherbtn.click();
	}

	public void last_name(String keyword) {
		lastname.type(keyword);
	}

	public void first_name(String keyword) {
		firstname.type(keyword);
	}

	public void exportButton() {
		exportButton.waitUntilVisible();
		exportButton.click();
	}

	// public boolean isExportButtonPresent() {
	// return exportButton.isPresent();
	// }

}