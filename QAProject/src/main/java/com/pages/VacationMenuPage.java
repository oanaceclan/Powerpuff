package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class VacationMenuPage extends PageObject {

	@FindBy(css = "[href='http://172.22.4.88:9091/vacation']")
	private WebElementFacade vacationButton;

	public void vacationButtonClick() {
		vacationButton.click();
	}

	public static boolean isVacationMenuButtonPresent() {

		return false;
	}

}