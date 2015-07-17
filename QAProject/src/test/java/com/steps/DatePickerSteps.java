package com.steps;

import com.pages.DatePickerPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class DatePickerSteps extends ScenarioSteps {

	DatePickerPage datePickerPage;

	@Step
	public void selectStartDate(int day, String month, int year) {
		datePickerPage.chooseTheStartDate(day, month, year);
	}

	@Step
	public void selectEndDate(int day, String month, int year) {
		datePickerPage.chooseTheEndDate(day, month, year);
	}

}