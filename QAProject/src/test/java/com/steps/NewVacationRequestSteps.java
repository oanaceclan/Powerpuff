package com.steps;

import org.junit.Assert;

import com.pages.NewVacationRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class NewVacationRequestSteps extends ScenarioSteps {

	NewVacationRequestPage newVacationReqPage;

	@Step
	public void startVacationButton() {
		newVacationReqPage.vacationButton();
	}

	@Step
	public void newRequestButtonClick() {
		newVacationReqPage.newRequestButton();
	}

	@Step
	public void checkVacationDaysLeftTextIsPresent() {
		Assert.assertTrue("New request button is not present", newVacationReqPage.isVacDaysLeftPresent());
	}
}