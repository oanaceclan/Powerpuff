package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class NewVacationRequestPage extends PageObject {

	@FindBy(css = "[href='http://172.22.4.88:9091/vacation']")
	private WebElementFacade vacationbtn;

	@FindBy(css = "[href*='menuItem=new-request']")
	private WebElementFacade newRequestButton;

	@FindBy(id = "vacDaysLeft")
	private WebElementFacade vacationDaysLeft;

	public boolean isRequestButtonPresent() {
		return newRequestButton.isPresent();
	}

	public boolean isVacDaysLeftPresent() {
		return vacationDaysLeft.isPresent();
	}

	public void vacationButton() {
		vacationbtn.click();
	}

	public void newRequestButton() {
		newRequestButton.click();
	}

}