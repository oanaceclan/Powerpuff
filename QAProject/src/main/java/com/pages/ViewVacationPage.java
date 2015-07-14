package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class ViewVacationPage extends PageObject {
	
	
	@FindBy (css="[href*='menuItem=view-vacations']")
	private WebElementFacade viewVacationButton;
	
	@FindBy (id="_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;
	
	
	public void view_vacation_button(){
		viewVacationButton.click();
	}
	
	public void applyButton() {
		applyButton.waitUntilVisible();
		applyButton.click();
	}
	
	public boolean isApplyButtonPresent() {
		return applyButton.isPresent();
	}

	
}