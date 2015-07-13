package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class InboxPage extends PageObject {
	
	
	@FindBy (css="[href='http://172.22.4.88:9091/vacation']")
	private WebElementFacade vacationbtn;
	
	@FindBy (css="[href*='menuItem=inbox']")
	private WebElementFacade inboxButton;
	

   
   
	
	public void vacation_button() {
		vacationbtn.click();
	}
	
	public void inbox_button(){
		inboxButton.click();
	}
	
	
}