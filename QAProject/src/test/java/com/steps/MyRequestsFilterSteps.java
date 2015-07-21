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
	public void myRequestsButtonClick() {
		myVacationRequests.myRequestsButton();
	}

	@Step
	public void selectVacationType(String type) {
		myVacationRequests.vacationTypeSelect(type);
	}

	@Step
	public void selectDaysNumber(String type) {
		myVacationRequests.daysNumberSelect(type);
	}
	
	@Step
	public void selectVacationStatus(String type) {
		myVacationRequests.vacationStatusSelect(type);
	}
	
	
	@Step
	public void applyButtonClick() {
		myVacationRequests.applyButton();
	}

	@Step
	public void getStatus(String word) {
		myVacationRequests.search(word);
	}

	@Step
	public void clickOnCancelButton() {
		myVacationRequests.cancelBtn();
	}

	@Step
	public void checkWithdrawnStatusIsPresent() {
		Assert.assertTrue("Withdrawn status is not present!!!", myVacationRequests.isWithdrawnStatusPresent());
	}
}