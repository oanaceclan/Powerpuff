package com.steps;

import org.junit.Assert;

import com.pages.VacationHomePage;
import com.pages.VacationPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class VacationSteps extends ScenarioSteps {

	VacationPage vacationPage;
	VacationHomePage vachomepage;

	@Step
	public void openLoginPage() {
		vacationPage.getDriver().close();
		vacationPage.open();
		vacationPage.getDriver().manage().window().maximize();
	}

	@Step
	public void enterUsername(String keyword) {
		vacationPage.enter_username(keyword);
	}

	@Step
	public void enterPassword(String keyword) {
		vacationPage.enter_password(keyword);
	}

	@Step
	public void startSearch() {
		vacationPage.sign_in();
	}

	@StepGroup
	public void loginWith(String username, String password) {
		openLoginPage();
		enterUsername(username);
		enterPassword(password);
		startSearch();
	}

	@Step
	public void startVacationbtn() {
		vacationPage.vacation_button();
	}

	@Step
	public void newRequestbtn() {
		vacationPage.new_request_button();
	}
	
	@Step
	public void vacationWithoutPaymenyBtn() {
		vacationPage.vacation_without_payment_check();
	}
	

	@Step
	public void checkVacationButtonIsPressed() {
		Assert.assertTrue("Vacation days left is not present", vachomepage.isRequestButtonPresent());
	}
	
	@Step
	public void checkVacDaysLeft() {
		Assert.assertTrue("New request button is not present", vachomepage.isVacDaysLeftPresent());
	}
}