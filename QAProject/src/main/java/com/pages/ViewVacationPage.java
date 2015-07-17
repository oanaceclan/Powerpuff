package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ViewVacationPage extends PageObject {
	
	
	@FindBy (css="[href*='menuItem=view-vacations']")
	private WebElementFacade viewVacationButton;
	
	@FindBy (id="_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;
	
	
	public void viewVacationButtonClick(){
		viewVacationButton.click();
	}
	
	public void applyButtonClick() {
		applyButton.waitUntilVisible();
		applyButton.click();
	}
	
	public boolean isApplyButtonPresent() {
		return applyButton.isPresent();
	}

	
}