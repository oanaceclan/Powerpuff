package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.VacationReportFilterPage;

@SuppressWarnings("serial")
public class VacationReportFilterSteps extends ScenarioSteps {

	VacationReportFilterPage vacationReportFilterPage;

	@Step
	public void vacationReportButtonClick() {
		vacationReportFilterPage.vacationReportButtonClick();
	}

	@Step
	public void exportMonthCheck(String text) {
		vacationReportFilterPage.selectMonthClick(text);
	}

	@Step
	public void exportYearCheck(String text) {
		vacationReportFilterPage.selectYearClick(text);
	}

	@Step
	public void approvedStatusCheck() {
		vacationReportFilterPage.approvedStatusCheck();
	}

	@Step
	public void cimIncludeCheck() {
		vacationReportFilterPage.cimIncludeCheck();
	}

	@Step
	public void otherIncludeCheck() {
		vacationReportFilterPage.otherIncludeCheck();
	}

	@Step
	public void pendingStatusCheck() {
		vacationReportFilterPage.pendingStatusCheck();
	}

	@Step
	public void lastNameField(String keyword) {
		vacationReportFilterPage.WriteLastNameField(keyword);
	}

	@Step
	public void firstNameField(String keyword) {
		vacationReportFilterPage.WriteFirstNameField(keyword);
	}

	@StepGroup
	public void loginWith(String lastName, String firstName) {
		lastNameField("Ceclan");
		firstNameField("Oana");

	}
	
	@Step
	public void SearchButton() {
		vacationReportFilterPage.searchButtonClick();
	}

	/*
	 * @Step public void search(String word) {
	 * viewvacationFilterPage.search(word); }
	 */

	@Step
	public void ExportButton() {
		vacationReportFilterPage.exportButtonClick();
	}

}
