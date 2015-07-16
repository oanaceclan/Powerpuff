package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class MyFreeDaysPage extends PageObject {

	@FindBy(css = "[href*='menuItem=my-free-days']")
	private WebElementFacade myFreeDaysButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_TabsBack")
	private WebElementFacade backButton;

	public void myFreeDays() {
		myFreeDaysButton.click();
	}

	public boolean isBackButtonPresent() {
		return backButton.isPresent();
	}

}