package com.steps;

import org.junit.Assert;

import com.pages.MyFreeDaysPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class MyFreeDaysSteps extends ScenarioSteps {

	MyFreeDaysPage myFreeDaysPage;

	@Step
	public void clickMyFreeDaysButton() {
		myFreeDaysPage.clickMyFreeDays();
	}

	@Step
	public void checkBackBtnIsPresent() {
		Assert.assertTrue("My free days text is not present", myFreeDaysPage.checkIfBackIsButtonPresent());
	}
}