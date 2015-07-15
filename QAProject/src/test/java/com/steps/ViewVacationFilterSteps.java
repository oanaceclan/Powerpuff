package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.ViewVacationFilterPage;

@SuppressWarnings("serial")
public class ViewVacationFilterSteps extends ScenarioSteps {

	ViewVacationFilterPage viewvacationFilterPage;

	@Step
	public void viewvacationbtn() {
		viewvacationFilterPage.view_vacation_button();
	}
	
	@Step
	public void vacationType() {
		viewvacationFilterPage.vacation_type_sick_leave();
	}
	
	@Step
	public void daysNumber() {
		viewvacationFilterPage.days_number();
	}
	
	@Step
	public void vacationStatus() {
		viewvacationFilterPage.vacation_status();
	}
	
	@Step
	public void lastName(String keyword) {
		viewvacationFilterPage.last_name(keyword);
	}
	
	@Step
	public void firstName(String keyword) {
		viewvacationFilterPage.first_name(keyword);
	}
	
	@Step
	public void search(String word) {
		viewvacationFilterPage.search(word);
	}
	
	@StepGroup
    public void loginWith(String lastName, String firstName) {
    	lastName("Ceclan");
    	firstName("Oana");
	
	}
	//@Step
	//public void inactiveUsers() {
		//viewvacationFilterPage.inactive_users();
	//}*/
	
	@Step
	public void applyButton() {
		viewvacationFilterPage.applyButton();
	}
	
	@Step
	public void cancel()
	{
	viewvacationFilterPage.cancel();
	}
	
}

	
	
