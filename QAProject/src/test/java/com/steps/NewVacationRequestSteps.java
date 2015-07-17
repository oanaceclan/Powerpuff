package com.steps;

import org.junit.Assert;

import com.pages.NewVacationRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class NewVacationRequestSteps extends ScenarioSteps {

	NewVacationRequestPage newVacationReqPage;

	public void newRequestButtonClick() {
		newVacationReqPage.newRequestButton();

	}

	@Step
	public void selectTheStartDate() {
		newVacationReqPage.selectStartDate();
	}

	@Step
	public void selectTheEndDate() {
		newVacationReqPage.selectEndDate();
	}

	@Step
	public void selectTheSpecialVacation() {
		newVacationReqPage.selectSpecialVacation();
	}

	@Step
	public void selectTheSpecialVacationType() {
		newVacationReqPage.selectSpecialVacationType();
	}

	@Step
	public void saveRequest() {
		newVacationReqPage.save();
	}

	@Step
	public void checkIfTheChildBirthRequestWasCreated() {
		Assert.assertTrue("Child birth request was not created",
				newVacationReqPage.childBirthVacationRequestWasCreated());
	}

}