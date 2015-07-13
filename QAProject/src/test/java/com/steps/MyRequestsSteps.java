package com.steps;

import com.pages.MyRequestsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class MyRequestsSteps extends ScenarioSteps {

	
	MyRequestsPage myVacationRequests;

	@Step
	public void myRequestsbtn() {
		myVacationRequests.my_requests_button();
	}
	
	@Step
	public void vacationType() {
		myVacationRequests.vacation_without_payment_button();
	}
	
	@Step
	public void daysNumber() {
		myVacationRequests.days_number();
	}
	
	@Step
	public void vacationStatus() {
		myVacationRequests.vacation_status();
	}
	
	@Step
	public void applyButton() {
		myVacationRequests.apply_button();
	}

}