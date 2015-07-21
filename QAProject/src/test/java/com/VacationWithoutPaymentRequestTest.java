package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginSteps;
import com.steps.MyRequestsFilterSteps;
import com.steps.NewVacationRequestSteps;
import com.steps.VacationMenuSteps;
import com.steps.VacationWithoutPaymentRequestSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.UseTestDataFrom;
import tools.Constants;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("/Resources/dataFilter2.csv")
public class VacationWithoutPaymentRequestTest {

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
	public VacationWithoutPaymentRequestSteps vacationRequestSteps;

	@Steps
	public MyRequestsFilterSteps myReqSteps;
	
	@Steps
	public NewVacationRequestSteps newVacationRequestSteps;

	@Test
	public void checkIfTheWithdrawnActionForVacationWithoutPaymentRequestIsPerformed() {
		loginSteps.openLoginPage();
		loginSteps.EnterUsername(Constants.UserName);
		loginSteps.EnterPassword(Constants.PassWord);
		loginSteps.signInButtonClick();
		vacationSteps.startVacationButton();
		newVacationRequestSteps.newRequestButtonClick();
		vacationRequestSteps.SelectStartDate();
		vacationRequestSteps.SelectEndDate();
		vacationRequestSteps.selectVacationWithoutPaymentType();
		vacationRequestSteps.saveTheRequest();
		myReqSteps.myRequestsButtonClick();
		myReqSteps.selectVacationType(VacationType);
		myReqSteps.selectDaysNumber(DaysNumber);
		myReqSteps.selectVacationStatus(VacationStatus);
		myReqSteps.applyButtonClick();
		vacationRequestSteps.getTheStatus(Constants.Status);
		myReqSteps.clickOnCancelButton();
		vacationRequestSteps.checkWithdrawnActionIsPerformed();

	}

}
