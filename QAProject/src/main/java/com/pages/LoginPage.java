package com.pages;

import static ch.lambdaj.Lambda.convert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://172.22.4.88:9091/login")
public class LoginPage extends PageObject {

	@FindBy(id = "_58_login")
	private WebElementFacade username;

	@FindBy(id = "_58_password")
	private WebElementFacade password;

	@FindBy(css = "input[type='submit']")
	private WebElementFacade signInButton;

	@FindBy(css = ".portlet-msg-error")
	private List<WebElement> errorList;

	@FindBy(css = "[class='sign-out'] a")
	private WebElementFacade signOutButton;

	public boolean isSignOutButtonPresent() {
		return signOutButton.isPresent();
	}

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

	public List<String> getErrorMessages() {
		List<WebElement> results = getDriver().findElements(By.cssSelector(".portlet-msg-error"));
		return convert(results, toStrings());
	}

	private Converter<WebElement, String> toStrings() {
		return new Converter<WebElement, String>() {
			public String convert(WebElement from) {
				return from.getText();
			}
		};
	}

}