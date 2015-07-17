package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class VacationReportPage extends PageObject {

	@FindBy(css = "[href*='menuItem=vacation-report']")
	private WebElementFacade vacationReportButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_exportButton")
	private WebElementFacade exportButton;

	public void vacationReportButtonClick() {
		vacationReportButton.click();
	}
	
	

	public void exportButtonClick() {
		exportButton.waitUntilVisible();
		exportButton.click();
	}

	public boolean isExportButtonPresent() {
		return exportButton.isPresent();
	}

}