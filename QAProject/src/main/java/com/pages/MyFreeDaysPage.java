package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class MyFreeDaysPage extends PageObject {

	@FindBy(css = "[href*='menuItem=my-free-days']")
	private WebElementFacade MyFreeDaysButton;

	@FindBy(id= "_evovacation_WAR_EvoVacationportlet_TabsBack")
	private WebElementFacade backButton;
	
	
	public void my_free_days() {
		MyFreeDaysButton.click();
	}

	public boolean isBackButtonPresent() {
		return backButton.isPresent();
	}


}