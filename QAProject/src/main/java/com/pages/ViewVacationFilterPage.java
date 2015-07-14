package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class ViewVacationFilterPage extends PageObject {
	
	
	@FindBy (css="[href*='menuItem=view-vacations']")
	private WebElementFacade viewVacationButton;
	
	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_SICK_LEAVECheckbox")
	private WebElementFacade vacationTypeSickleave;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElementFacade daysNumber;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_APPROVEDCheckbox")
	private WebElementFacade vacationStatus;
	
	//@FindBy(id="_evovacation_WAR_EvoVacationportlet_inactiveUsersCheckbox")
	//private WebElementFacade inactiveUsers;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_viewVacationsLastName")
	private WebElementFacade lastname;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_viewVacationsFirstName")
	private WebElementFacade firstname;
	
	@FindBy (id="_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;
	
	
	public void view_vacation_button(){
		viewVacationButton.click();
	}
	
	public void vacation_type_sick_leave() {
		vacationTypeSickleave.click();
	}

	public void days_number() {
		daysNumber.click();
	}
	
	public void vacation_status() {
		vacationStatus.click();
	}
	
	public void last_name(String keyword) {
		lastname.type(keyword);
	}
	
	public void first_name(String keyword) {
		firstname.type(keyword);
	}
	
	
	/*public void inactive_users() {
		inactiveUsers.click();
	}*/
	
	public void applyButton() {
		applyButton.waitUntilVisible();
		applyButton.click();
	}
}