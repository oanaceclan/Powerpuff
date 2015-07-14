package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class HolidayRequestPage extends PageObject {


	@FindBy(id="_evovacation_WAR_EvoVacationportlet_startDate")
	private WebElementFacade datePicker;

	

	/*public void vacation_button() {
		vacationbtn.click();
	}

	public void new_request_button() {
		newRequestButton.click();
	}*/

}