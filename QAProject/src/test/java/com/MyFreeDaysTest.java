package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginSteps;
import com.steps.MyFreeDaysSteps;
import com.steps.VacationMenuSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import tools.Constants;

@RunWith(SerenityRunner.class)
public class MyFreeDaysTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.EvoPortal)
	public Pages pages;

	@Steps
	public LoginSteps loginSteps;

	@Steps
	public VacationMenuSteps vacationSteps;

	@Steps
	public MyFreeDaysSteps myFreeDaysSteps;

	@Test
	public void checkIfTheBackButtonIsPresent() {
		loginSteps.openLoginPage();
		loginSteps.enterUsername(Constants.UserName);
		loginSteps.enterPassword(Constants.PassWord);
		loginSteps.signInButtonClick();
		vacationSteps.startVacationButton();
		myFreeDaysSteps.clickMyFreeDaysButton();
		myFreeDaysSteps.checkBackBtnIsPresent();

	}
}
