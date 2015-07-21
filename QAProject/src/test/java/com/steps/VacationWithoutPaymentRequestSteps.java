package com.steps;

import org.junit.Assert;

import com.pages.VacationWithoutPaymentRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class VacationWithoutPaymentRequestSteps extends ScenarioSteps {

	VacationWithoutPaymentRequestPage vacationReqPage;

	@Step
	public void SelectStartDate() {
		vacationReqPage.selectStartDate();
	}

	@Step
	public void SelectEndDate() {
		vacationReqPage.selectEndDate();
	}

	@Step
	public void selectVacationWithoutPaymentType() {
		vacationReqPage.selectVacationWithoutPayment();
	}

	@Step
	public void saveTheRequest() {
		vacationReqPage.save();
	}

//	@Step
//	public void vacationStatusSelect() {
//		vacationReqPage.vacationStatus();
//	}

	@Step
	public void getTheStatus(String word) {
		vacationReqPage.search(word);
	}

	@Step
	public void checkWithdrawnActionIsPerformed() {
		Assert.assertTrue("Withdrawn action was not performed!", vacationReqPage.isWithdrawnMessagePresent());
	}

}