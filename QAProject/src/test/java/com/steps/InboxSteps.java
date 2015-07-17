package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;

import com.pages.InboxHomePage;
import com.pages.InboxPage;
import com.pages.VacationMenuPage;

@SuppressWarnings("serial")
public class InboxSteps extends ScenarioSteps {

	VacationMenuPage vacationPage;
	InboxPage inboxPage;
	InboxHomePage inboxhomepage;

	
	@Step
	public void startInboxButton() {
		inboxPage.inboxButtonClick();
	}
	

	@Step
	public void clickInboxButton() {
		Assert.assertTrue("Inbox button is not present", inboxhomepage.isInboxButtonPresent());
	}
	
	@Step
	public void checkInboxButtonIsPressed() {
		Assert.assertTrue("Assigned to others is not present", inboxhomepage.isInboxButtonAssignedToOthersPresent());
	}
}