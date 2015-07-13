package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://172.22.4.88:9091/login")
public class VacationHomePage extends PageObject {

	
	@FindBy (css="[href*='menuItem=new-request']")
	private WebElementFacade newRequestButton;

	public boolean isRequestButtonPresent() {
		return newRequestButton.isPresent();
	}
	
	@FindBy (id="vacDaysLeft")
	private WebElementFacade vacDaysLeft;
	
	public boolean isVacDaysLeftPresent() {
		return vacDaysLeft.isPresent();
	}

}