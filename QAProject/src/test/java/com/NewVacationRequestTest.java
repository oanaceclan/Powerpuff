package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginSteps;
import com.steps.NewVacationRequestSteps;
import com.steps.VacationMenuSteps;
import com.steps.VacationWithoutPaymentRequestSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import tools.Constants;

@RunWith(SerenityRunner.class)
public class NewVacationRequestTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.EvoPortal)
	public Pages pages;

	@Steps
	public LoginSteps loginSteps;

	@Steps
	public NewVacationRequestSteps newVacationRequestSteps;
	
	@Steps
	public VacationMenuSteps vacationSteps;
	
	@Steps
	public VacationWithoutPaymentRequestSteps vacationRequestSteps;

	@Test
	public void checkIfTheSpecialVacationRequestWasCreated() {
		loginSteps.openLoginPage();
		loginSteps.EnterUsername(Constants.UserName);
		loginSteps.EnterPassword(Constants.PassWord);
		loginSteps.signInButtonClick();
		vacationSteps.startVacationButton();
		newVacationRequestSteps.newRequestButtonClick();
		newVacationRequestSteps.selectTheStartDate();
		newVacationRequestSteps.selectTheEndDate();
		newVacationRequestSteps.selectTheSpecialVacation();
		newVacationRequestSteps.selectTheSpecialVacationType();
		newVacationRequestSteps.saveRequest();
		newVacationRequestSteps.checkIfTheChildBirthRequestWasCreated();
		
	}
}
