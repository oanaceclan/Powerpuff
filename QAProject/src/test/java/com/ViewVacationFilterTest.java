package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginSteps;
import com.steps.VacationMenuSteps;
import com.steps.ViewVacationFilterSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import tools.Constants;


//@RunWith(SerenityParameterizedRunner.class)
//@UseTestDataFrom("/Resources/vacations.csv")

@RunWith(SerenityRunner.class)
public class ViewVacationFilterTest {

	String VacationType, DaysNumber, VacationStatus;

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.EvoPortal)
	public Pages pages;

	@Steps
	public LoginSteps loginSteps;

	@Steps
	public VacationMenuSteps vacationSteps;

	@Steps
	public ViewVacationFilterSteps viewvacationFilterSteps;

	/*
	 * @Steps public InboxSteps inboxSteps;
	 */

	@Test
	public void checkIfTheFiltersOfViewVacationButtonAndTheCancelButtonWorks() {
		loginSteps.openLoginPage();
		loginSteps.EnterUsername(Constants.DMUserName);
		loginSteps.EnterPassword(Constants.DMPassWord);
		loginSteps.signInButtonClick();
		vacationSteps.startVacationButton();
		viewvacationFilterSteps.viewVacationButton();
		viewvacationFilterSteps.vacationTypeCheck();
		viewvacationFilterSteps.daysNumberCheck();
		viewvacationFilterSteps.vacationStatusCheck();
		viewvacationFilterSteps.firstName("Oana");
		viewvacationFilterSteps.lastName("Ceclan");
		// viewvacationFilterSteps.inactiveUsers();
		viewvacationFilterSteps.applyButton();
		viewvacationFilterSteps.searchButtonClick("sick");
		viewvacationFilterSteps.cancel();

	}

}
