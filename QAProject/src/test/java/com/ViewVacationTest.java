package com;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import tools.Constants;

import com.steps.LoginSteps;
import com.steps.VacationMenuSteps;
import com.steps.ViewVacationSteps;


@RunWith(SerenityRunner.class)
public class ViewVacationTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.EvoPortal)
	public Pages pages;

	@Steps
	public ViewVacationSteps viewvacationSteps;


	@Steps
	public VacationMenuSteps vacationMenuSteps;

	@Steps
	public LoginSteps loginSteps;

	@Test
	public void checkIfThereIsAViewVacationsButton() {
		loginSteps.openLoginPage();
		loginSteps.EnterUsername(Constants.DMUserName);
		loginSteps.EnterPassword(Constants.DMPassWord);
		loginSteps.signInButtonClick();
		vacationMenuSteps.startVacationButton();
		viewvacationSteps.viewVacationButton();
		viewvacationSteps.ApplyButton();
	}
}
