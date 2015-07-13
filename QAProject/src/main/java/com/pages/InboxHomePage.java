package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://172.22.4.88:9091/login")
public class InboxHomePage extends PageObject {

	
	@FindBy (css="[href*='menuItem=inbox']")
	 private WebElementFacade inboxButton;

	@FindBy (css="a[href*='assignToTab=assignedToOthers'] ")
	 private WebElementFacade assignedToMe;
	
	public boolean isInboxButtonPresent() {
		return inboxButton.isPresent();
	}
	
	public boolean isInboxButtonAssignedToOthersPresent() {
		return assignedToMe.isPresent();
	}
	
	
	//@FindBy (id="vacDaysLeft")
	//private WebElementFacade vacDaysLeft;
	
	//public boolean isVacDaysLeftPresent() {
		//return vacDaysLeft.isPresent();
	//}

}