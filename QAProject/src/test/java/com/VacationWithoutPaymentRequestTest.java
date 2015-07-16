package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginSteps;
import com.steps.MyRequestsFilterSteps;
import com.steps.NewVacationRequestSteps;
import com.steps.VacationWithoutPaymentRequestSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import tools.Constants;

@RunWith(SerenityRunner.class)
public class VacationWithoutPaymentRequestTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.EvoPortal)
	public Pages pages;

	@Steps
	public LoginSteps loginSteps;

	@Steps
	public NewVacationRequestSteps vacationSteps;

	@Steps
	public VacationWithoutPaymentRequestSteps vacationRequestSteps;

	@Steps
	public MyRequestsFilterSteps myReqSteps;
	

	@Test
	public void checkIfTheWithdrawnActionForVacationWithoutPaymentRequestIsPerformed() {
		loginSteps.openLoginPage();
		loginSteps.EnterUsername(Constants.UserName);
		loginSteps.EnterPassword(Constants.PassWord);
		loginSteps.signInButtonClick();
		vacationSteps.startVacationButton();
		vacationSteps.newRequestButtonClick();
		vacationRequestSteps.SelectStartDate();
		vacationRequestSteps.SelectEndDate();
		vacationRequestSteps.selectVacationWithoutPaymentType();
		vacationRequestSteps.saveRequest();
		myReqSteps.myRequestsButtonClick();
		myReqSteps.vacationTypeSelect();
		myReqSteps.daysNumberSelect();
		myReqSteps.vacationStatusSelect();
		myReqSteps.applyButtonClick();
		myReqSteps.getStatus(Constants.Status);
		myReqSteps.clickOnCancelButton();
		vacationRequestSteps.checkWithdrawnActionIsPerformed();

	}

}
