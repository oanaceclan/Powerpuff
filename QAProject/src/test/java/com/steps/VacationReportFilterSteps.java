package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.VacationReportFilterPage;

@SuppressWarnings("serial")
public class VacationReportFilterSteps extends ScenarioSteps {

	VacationReportFilterPage vacationReportFilterPage;

	@Step
	public void vacationReportButton() {
		vacationReportFilterPage.vacation_report_button();
	}

	@Step
	public void exportMonth(String text) {
		vacationReportFilterPage.select_month(text);
	}

	@Step
	public void exportYear(String text) {
		vacationReportFilterPage.select_year(text);
	}

	@Step
	public void approved() {
		vacationReportFilterPage.approved();
	}
	
	@Step
	public void cim() {
		vacationReportFilterPage.cim();
	}
	
	@Step
	public void other() {
		vacationReportFilterPage.other();
	}

	@Step
	public void pending() {
		vacationReportFilterPage.pending();
	}

	@Step
	public void lastName(String keyword) {
		vacationReportFilterPage.last_name(keyword);
	}

	@Step
	public void firstName(String keyword) {
		vacationReportFilterPage.first_name(keyword);
	}
	
	@StepGroup
	public void loginWith(String lastName, String firstName) {
		lastName("Ceclan");
		firstName("Oana");

	}
	
	/*
	 * @Step public void search(String word) {
	 * viewvacationFilterPage.search(word); }
	 */
	
	

	
	
	@Step
	public void ExportButton() {
		vacationReportFilterPage.exportButton();
	}

	
	/*  @Step public void ExportButton() {
	  Assert.assertTrue("Vacation Report button is not present",vacationReportPage.isExportButtonPresent()); }
	*/
}
