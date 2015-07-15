package com.steps;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.VacationReportPage;


@SuppressWarnings("serial")
public class VacationReportSteps extends ScenarioSteps {

	VacationReportPage vacationReportPage;

	@Step
	public void vacationReportbtn() {
		vacationReportPage.vacation_report_button();
	}

	@Step
	public void ExportButton() {
		Assert.assertTrue("Vacation Report button is not present",vacationReportPage.isExportButtonPresent());
	}
}
