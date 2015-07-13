package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class VacationPage extends PageObject {
	
	
	@FindBy (css="[href='http://172.22.4.88:9091/vacation']")
	private WebElementFacade vacationbtn;
	
	@FindBy (css="[href*='menuItem=new-request']")
	private WebElementFacade newRequestButton;
	
	@FindBy(id = "_58_login")
	private WebElementFacade username;

	@FindBy(id = "_58_password")
	private WebElementFacade password;

	@FindBy(css = "input[type='submit']")
	private WebElementFacade signInButton;

	@FindBy(id="_evovacation_WAR_EvoVacationportlet_type_CF")
	private WebElementFacade vacWithoutPaymentButton;
   
    public void enter_username(String keyword) {
		username.waitUntilVisible();
		username.type(keyword);
	}

	public void enter_password(String keyword) {
		password.type(keyword);
	}

	public void sign_in() {
		signInButton.click();
	}
	
	public void vacation_button() {
		vacationbtn.click();
	}
	
	public void new_request_button(){
		newRequestButton.click();
	}
	
	public void vacation_without_payment_check(){
		vacWithoutPaymentButton.click();
	}
}