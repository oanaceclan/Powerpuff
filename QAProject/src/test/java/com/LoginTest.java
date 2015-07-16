package com;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.UseTestDataFrom;
import tools.Constants;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("/Resources/data.csv")
public class LoginTest {
	
	String username, password;
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.EvoPortal)
	public Pages pages;

	@Steps
	public LoginSteps loginSteps;

	@Test
	public void verifyLoginWithValidCredentials() {
		loginSteps.openLoginPage();
		loginSteps.EnterUsername(Constants.UserName);
		loginSteps.EnterPassword(Constants.PassWord);
		loginSteps.signInButtonClick();
		loginSteps.checkLoginIsPerformed();
	}

	@Test
	public void verifyLoginWithInvalidCredentials() {
		loginSteps.loginWith(Constants.UserName, Constants.WrongPassWord);
		loginSteps.shouldSeeErrorMessage(Constants.ErrorMessage1);
		loginSteps.shouldSeeErrorMessage(Constants.ErrorMessage1);
	}

}