package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;

import com.pages.InboxHomePage;
import com.pages.InboxPage;
import com.pages.NewVacationRequestHomePage;
import com.pages.NewVacationRequestPage;

@SuppressWarnings("serial")
public class InboxSteps extends ScenarioSteps {

	NewVacationRequestPage vacationPage;
	NewVacationRequestHomePage vachomepage;
	InboxPage inboxPage;
	InboxHomePage inboxhomepage;

	@Step
	public void startVacationbtn() {
		vacationPage.vacation_button();
	}

	@Step
	public void inboxbtn() {
		inboxPage.inbox_button();
	}
	

	@Step
	public void checkVacationButtonIsPressed() {
		Assert.assertTrue("Vacation days left is not present", vachomepage.isRequestButtonPresent());
	}
	
	@Step
	public void checkInboxButton() {
		Assert.assertTrue("Inbox button is not present", inboxhomepage.isInboxButtonPresent());
	}
	
	@Step
	public void checkInboxButtonIsPressed() {
		Assert.assertTrue("Assigned to others is not present", inboxhomepage.isInboxButtonAssignedToOthersPresent());
	}
}