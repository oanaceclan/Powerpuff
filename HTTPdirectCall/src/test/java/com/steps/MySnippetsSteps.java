package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;

import com.pages.MySnippetsPage;

@SuppressWarnings("serial")
public class MySnippetsSteps extends ScenarioSteps {

	MySnippetsPage mySnippetsPage;

	@Step
	public void startMySnippetsButton() {
		mySnippetsPage.MySnippetsButtonClick();
	}

	@Step
	public void deleteMySnippets() {
		mySnippetsPage.deleteButtonClick();
	}

	@Step
	public void checkIfAllSnippetsAreDeleted() {
		Assert.assertTrue("Not All Snippets were deleted",
				mySnippetsPage.noSnippetsMessage());
	}
}