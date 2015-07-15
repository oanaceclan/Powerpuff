package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class VacationReportPage extends PageObject {
	
	
	@FindBy (css="[href*='menuItem=vacation-report']")
	private WebElementFacade vacationReportButton;
	
	@FindBy (id="_evovacation_WAR_EvoVacationportlet_exportButton")
	private WebElementFacade exportButton;
	
	
	public void vacation_report_button(){
		vacationReportButton.click();
	}
	
	public void applyButton() {
		exportButton.waitUntilVisible();
		exportButton.click();
	}
	
	public boolean isExportButtonPresent() {
		return exportButton.isPresent();
	}


}