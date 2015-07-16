package com.steps;

import com.pages.VacationWithoutPaymentRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class VacationWithoutPaymentRequestSteps extends ScenarioSteps {

	VacationWithoutPaymentRequestPage holidayReqPage;
	
	
	@Step
	public void SelectStartDate() {
		holidayReqPage.selectStartDate();
	}
	
	@Step
	public void SelectEndDate() {
		holidayReqPage.selectEndDate();
	}
	
	
	@Step
	public void selectVacationWithoutPaymentType() {
		holidayReqPage.selectVacationWithoutPayment();
	}
	
	@Step
	public void saveRequest() {
		holidayReqPage.save();
	}
	
	
	

	
}