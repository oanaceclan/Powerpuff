package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

@RunWith(SerenityRunner.class)
public class LoginTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.22.4.88:9091/login")
	public Pages pages;

	@Steps
	public LoginSteps loginSteps;

	@Test
	public void loginWithValidCredentials() {
		loginSteps.openLoginPage();
		loginSteps.enterUsername("Oana");
		loginSteps.enterPassword("test");
		loginSteps.startSearch();
		loginSteps.checkLoginIsPerformed();
	}

	@Test
	public void loginWithInvalidCredentials() {
		/*loginSteps.openLoginPage();
		loginSteps.enterUsername("Oana");
		loginSteps.enterPassword("testing");
		loginSteps.start_search();*/
		loginSteps.loginWith("Oana", "testing");
		
		loginSteps.should_see_error_message("Your request failed to complete.");
		loginSteps.should_see_error_message(
				"Authentication failed. Please try again using your zimbra credentials (without @evozon.com).");
	}

}