package com.steps;

import com.pages.HolidayRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class HolidayRequestSteps extends ScenarioSteps {

	HolidayRequestPage holidayReqPage;
	
	@Step
	public void selectDatePicker() {
		holidayReqPage.datePick();
	}
	
	@Step
	public void selectStartDate() {
		holidayReqPage.SelectStartDate();
	}
	
	@Step
	public void selectEndDate() {
		holidayReqPage.SelectEndDate();
	}
	
	
	@Step
	public void saveRequest() {
		holidayReqPage.save();
	}

	
}