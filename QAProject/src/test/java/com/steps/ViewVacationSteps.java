package com.steps;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


//import org.junit.Assert;
import com.pages.ViewVacationPage;

@SuppressWarnings("serial")
public class ViewVacationSteps extends ScenarioSteps {

	ViewVacationPage viewvacationPage;

	@Step
	public void viewvacationbtn() {
		viewvacationPage.view_vacation_button();
	}

	@Step
	public void ApplyButton() {
		Assert.assertTrue("View Vacation button is not present", viewvacationPage.isApplyButtonPresent());
	}
}
	
	