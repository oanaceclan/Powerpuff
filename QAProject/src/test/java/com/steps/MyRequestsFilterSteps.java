package com.steps;

import org.junit.Assert;

import com.pages.MyRequestsFilterPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class MyRequestsFilterSteps extends ScenarioSteps {

	
	MyRequestsFilterPage myVacationRequests;

	@Step
	public void myRequestsbtn() {
		myVacationRequests.my_requests_button();
	}
	
	@Step
	public void vacationType() {
		myVacationRequests.vacation_without_payment_button();
	}
	
	@Step
	public void daysNumber() {
		myVacationRequests.days_number();
	}
	
	@Step
	public void vacationStatus() {
		myVacationRequests.vacation_status();
	}
	
	@Step
	public void applyButton() {
		myVacationRequests.apply_button();
	}

	@Step
	public void getStatus(String word) {
		myVacationRequests.search(word);
	}
	
	@Step
	public void clickOnCancelButton() {
		myVacationRequests.cancelBtn();
	}
	
	@Step
    public void checkWithdrawnActionIsPerformed() {
    	Assert.assertTrue("SignOut button is not present!!!", myVacationRequests.isWithdrawnMessagePresent());
    }
	
    
}