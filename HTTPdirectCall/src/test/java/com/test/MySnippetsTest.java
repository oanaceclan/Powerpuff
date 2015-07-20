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
import com.steps.MySnippetsSteps;

@RunWith(SerenityRunner.class)
public class MySnippetsTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://google-gruyere.appspot.com/910808698420/login")
	public Pages pages;

	@Steps
	public MySnippetsSteps mySnippetsSteps;

	@Steps
	public LoginHTTPSteps loginHTTPSteps;
	
	
	@Test
	public void checkIfThereAllSnippetsWereDeleted() {
		loginHTTPSteps.openLoginPage();
		loginHTTPSteps.EnterUsername("roxana");
		loginHTTPSteps.EnterPassword("test1");
		loginHTTPSteps.signInButtonClick();
		mySnippetsSteps.startMySnippetsButton();
		mySnippetsSteps.deleteMySnippets();
		mySnippetsSteps.checkIfAllSnippetsAreDeleted();
    }
}
