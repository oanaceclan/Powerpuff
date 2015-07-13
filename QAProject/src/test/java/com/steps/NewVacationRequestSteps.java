package com.steps;

import org.junit.Assert;

import com.pages.NewVacationRequestHomePage;
import com.pages.NewVacationRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class NewVacationRequestSteps extends ScenarioSteps {

	NewVacationRequestPage newVacationReqPage;
	NewVacationRequestHomePage newVacReqHomepage;

	
	@Step
	public void startVacationbtn() {
		newVacationReqPage.vacation_button();
	}

	@Step
	public void newRequestbtn() {
		newVacationReqPage.new_request_button();
	}
	
	

	@Step
	public void checkVacationButtonIsPressed() {
		Assert.assertTrue("Vacation days left is not present", newVacReqHomepage.isRequestButtonPresent());
	}
	
	@Step
	public void checkVacDaysLeft() {
		Assert.assertTrue("New request button is not present", newVacReqHomepage.isVacDaysLeftPresent());
	}
}