package com.steps;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.VacationMenuPage;

@SuppressWarnings("serial")
public class VacationMenuSteps extends ScenarioSteps {

	VacationMenuPage vacationPage;

	@Step
	public void startVacationButton() {
		vacationPage.vacationButtonClick();
	}

	@Step
	public void clickVacationMenuButton() {
		Assert.assertTrue("Vacation button is not present",
				VacationMenuPage.isVacationMenuButtonPresent());
	}

}