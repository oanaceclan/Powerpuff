package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class MyRequestsPage extends PageObject {

	@FindBy(css = "[href='http://172.22.4.88:9091/vacation']")
	private WebElementFacade vacationbtn;

	@FindBy(css = "[href*='menuItem=my-requests']")
	private WebElementFacade myRequestsButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_VACATION_WITHOUT_PAYMENTCheckbox")
	private WebElementFacade vacationWithoutPaymentBtn;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElementFacade daysNumber;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_WITHDRAWNCheckbox")
	private WebElementFacade vacationStatus;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;

	
	
	public void my_requests_button() {
		myRequestsButton.click();
	}

	public void vacation_without_payment_button() {
		vacationWithoutPaymentBtn.click();
	}

	public void days_number() {
		daysNumber.click();
	}
	
	public void vacation_status() {
		vacationStatus.click();
	}
	
	public void apply_button() {
		applyButton.click();
	}
}