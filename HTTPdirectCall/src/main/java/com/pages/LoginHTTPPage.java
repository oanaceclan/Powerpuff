package com.pages;

import static ch.lambdaj.Lambda.convert;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ch.lambdaj.function.convert.Converter;

//@DefaultUrl("http://172.22.4.88:9091/login")
public class LoginHTTPPage extends PageObject {

	@FindBy(css = "input[type='text']")
	private WebElementFacade username;

	@FindBy(css = " input[type='password']")
	private WebElementFacade password;

	@FindBy(css = "input[type='submit']")
	private WebElementFacade signInButton;
	
	@FindBy(css = "#menu-right > a:nth-child(3)")
	private WebElementFacade signOutButton;
	
	public void enterUsername(String keyword) {
		username.waitUntilVisible();
		username.type(keyword);
	}

	public void enterPassword(String keyword) {
		password.type(keyword);
	}

	public void signIn() {
		signInButton.click();
	}
	
	public boolean isSignOutButtonPresent() {
		return signOutButton.isPresent();
	}
	
	
}
