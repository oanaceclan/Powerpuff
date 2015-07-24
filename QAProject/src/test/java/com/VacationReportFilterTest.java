package com;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import tools.Constants;

import com.steps.LoginSteps;
import com.steps.VacationMenuSteps;
import com.steps.VacationReportFilterSteps;
import com.steps.VacationReportSteps;

@RunWith(SerenityRunner.class)
public class VacationReportFilterTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.EvoPortal)
	public Pages pages;

	@Steps
	public VacationReportFilterSteps vacationReportFilterSteps;

	@Steps
	public LoginSteps loginSteps;

	@Steps
	public VacationMenuSteps vacationSteps;

	@Steps
	public VacationReportSteps vacationReportSteps;

	@Test
	public void checkIfTheFiltersOfVacationReportButtonAndTheExportButtonWorks() {
		loginSteps.openLoginPage();
		loginSteps.enterUsername(Constants.DMUserName);
		loginSteps.enterPassword(Constants.DMPassWord);
		loginSteps.signInButtonClick();
		vacationSteps.startVacationButton();
		vacationReportSteps.vacationReportButtonClick();
		vacationReportFilterSteps.exportMonthCheck("August");
		vacationReportFilterSteps.exportYearCheck("2014");
		vacationReportFilterSteps.approvedStatusCheck();
		vacationReportFilterSteps.pendingStatusCheck();
		vacationReportFilterSteps.cimIncludeCheck();
		vacationReportFilterSteps.otherIncludeCheck();
		vacationReportFilterSteps.firstNameField("Oana");
		vacationReportFilterSteps.lastNameField("Ceclan");
		vacationReportFilterSteps.SearchButton();
		vacationReportFilterSteps.ExportButton();
	}

}
