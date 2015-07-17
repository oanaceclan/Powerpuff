package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginSteps;
import com.steps.MyRequestsFilterSteps;
import com.steps.VacationMenuSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import tools.Constants;

@RunWith(SerenityRunner.class)
public class MyRequestsFilterTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.EvoPortal)
	public Pages pages;

	@Steps
	public VacationMenuSteps vacationSteps;

	@Steps
	public MyRequestsFilterSteps myReqSteps;

	@Steps
	public LoginSteps loginSteps;

	@Test
	public void checkIfMyRequestsFilterWorks() {
		loginSteps.openLoginPage();
		loginSteps.EnterUsername(Constants.UserName);
		loginSteps.EnterPassword(Constants.PassWord);
		loginSteps.signInButtonClick();
		vacationSteps.startVacationButton();
		myReqSteps.myRequestsButtonClick();
		myReqSteps.vacationTypeSelect();
		myReqSteps.daysNumberSelect();
		myReqSteps.vacationStatusSelect();
		myReqSteps.applyButtonClick();
		myReqSteps.getStatus(Constants.Status2);
		myReqSteps.checkWithdrawnStatusIsPresent();

	}
}
