package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginSteps;
import com.steps.NewVacationRequestSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

@RunWith(SerenityRunner.class)
public class NewVacationRequestTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.22.4.88:9091/login")
	public Pages pages;

	@Steps
	public LoginSteps loginSteps;

	@Steps
	public NewVacationRequestSteps vacationSteps;

	@Test
	public void checkVacationButton() {
		loginSteps.openLoginPage();
		loginSteps.EnterUsername("Oana");
		loginSteps.EnterPassword("test");
		loginSteps.startSearch();
		vacationSteps.startVacationButton();
		vacationSteps.newRequestButtonClick();
		vacationSteps.checkVacationDaysLeftTextIsPresent();

	}
}
