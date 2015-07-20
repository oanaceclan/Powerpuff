package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;

import com.pages.ViewVacationFilterPage;

@SuppressWarnings("serial")
public class ViewVacationFilterSteps extends ScenarioSteps {

	
	ViewVacationFilterPage viewVacationFilterPage;

	@Step
	public void viewVacationButton() {
		viewVacationFilterPage.viewVacationButtonClick();
	}
	
	@Step
	public void vacationTypeCheck() {
		viewVacationFilterPage.vacationTypeSickLeaveCheck();
	}
	
	@Step
	public void daysNumberCheck() {
		viewVacationFilterPage.daysNumberCheck();
	}
	
	@Step
	public void vacationStatusCheck() {
		viewVacationFilterPage.vacationStatusApprovedCheck();
	}
	
	@Step
	public void lastName(String keyword) {
		viewVacationFilterPage.lastNameField(keyword);
	}
	
	@Step
	public void firstName(String keyword) {
		viewVacationFilterPage.firstNameField(keyword);
	}
	
	@Step
	public void searchButtonClick(String word) {
		viewVacationFilterPage.search(word);
	}
	
	@StepGroup
    public void loginWith(String lastName, String firstName) {
    	lastName("Ceclan");
    	firstName("Oana");
	
	}
	/*@Step
	//public void inactiveUsers() {
		//viewvacationFilterPage.inactive_users();
	//}*/
	
	@Step
	public void applyButton() {
		viewVacationFilterPage.applyButtonClick();
	}
	
	@Step
	public void cancel()
	{
	viewVacationFilterPage.cancelButtonClick();
	}
	
	@Step
	public void ApplyButton() {
		Assert.assertTrue("View Vacation button is not present", viewVacationFilterPage.isApplyButtonPresent());
	}
	
	@Step
	public void selectVacationType(String type) {
		viewVacationFilterPage.selectVacationType(type);
	}
	
	@Step
	public void selectDaysNumber(String type) {
		viewVacationFilterPage.selectDaysNumber(type);
	}
	
	@Step
	public void selectVacationStatus(String type) {
		viewVacationFilterPage.selectVacationStatus(type);
	}
	
}

	
	
