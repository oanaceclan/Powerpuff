package com.test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginHTTPSteps;

@RunWith(SerenityRunner.class)
public class LoginHTTPTest {

	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl ="http://google-gruyere.appspot.com/910808698420/login")
	public Pages pages;

	@Steps
	public LoginHTTPSteps loginHTTPSteps;

	@Test
	public void verifyLoginWithValidCredentials() {
		loginHTTPSteps.openLoginPage();
		loginHTTPSteps.EnterUsername("roxana");
		loginHTTPSteps.EnterPassword("test1");
		loginHTTPSteps.signInButtonClick();
		loginHTTPSteps.checkLoginIsPerformed();
	}

//	@Test
//	public void verifyLoginWithInvalidCredentials() {
//		loginSteps.loginWith(Constants.UserName, Constants.WrongPassWord);
//		loginSteps.shouldSeeErrorMessage(Constants.ErrorMessage1);
//		loginSteps.shouldSeeErrorMessage(Constants.ErrorMessage1);
//	}

}