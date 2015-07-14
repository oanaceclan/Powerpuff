package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;
import com.pages.ViewVacationPage;

@SuppressWarnings("serial")
public class ViewVacationSteps extends ScenarioSteps {

	ViewVacationPage viewvacationPage;

	@Step
	public void viewvacationbtn() {
		viewvacationPage.view_vacation_button();
	}
	

	@Step
	public void applyButton() {
		Assert.assertTrue("Vacation days left is not present", viewvacationPage.applyButton());
	}
	
	
}