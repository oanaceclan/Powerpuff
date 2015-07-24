package com.steps;

import org.junit.Assert;

import com.pages.MyRequestsFilterPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class MyRequestsFilterSteps extends ScenarioSteps {

	@SuppressWarnings("rawtypes")
	MyRequestsFilterPage myVacationRequests;

	@Step
	public void clickMyRequestsButton() {
		myVacationRequests.clickMyRequestsButton();
	}

	@Step
	public void selectVacationType(String type) {
		myVacationRequests.searchVacationStatus(type);
	}

	@Step
	public void selectDaysNumber(String type) {
		myVacationRequests.selectDaysNumber(type);
	}
	
	@Step
	public void selectVacationStatus(String type) {
		myVacationRequests.selectVacationStatus(type);
	}
	
	
	@Step
	public void clickApplyButton() {
		myVacationRequests.clickApplyButton();
	}

	@Step
	public void getVacationStatus(String word) {
		myVacationRequests.searchVacationStatus(word);
	}

	@Step
	public void clickOnCancelButton() {
		myVacationRequests.clickCancelButton();
	}

	@Step
	public void checkWithdrawnStatusIsPresent() {
		Assert.assertTrue("Withdrawn status is not present!!!", myVacationRequests.checkIfWithdrawnStatusIsPresent());
	}
}