package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginSteps;
import com.steps.MyRequestsFilterSteps;
import com.steps.VacationMenuSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.UseTestDataFrom;
import tools.Constants;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("/Resources/dataFilter.csv")
public class MyRequestsFilterTest {

	String VacationType, DaysNumber, VacationStatus;

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
		loginSteps.enterUsername(Constants.UserName);
		loginSteps.enterPassword(Constants.PassWord);
		loginSteps.signInButtonClick();
		vacationSteps.startVacationButton();
		myReqSteps.clickMyRequestsButton();
		myReqSteps.selectVacationType(VacationType);
		myReqSteps.selectDaysNumber(DaysNumber);
		myReqSteps.selectVacationStatus(VacationStatus);
		myReqSteps.clickApplyButton();
		myReqSteps.getVacationStatus(Constants.Status2);
		myReqSteps.checkWithdrawnStatusIsPresent();

	}
}
