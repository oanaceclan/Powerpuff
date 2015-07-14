package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import tools.Constants;

import com.steps.InboxSteps;
import com.steps.LoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

@RunWith(SerenityRunner.class)
public class InboxTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = Constants.EvoPortal)
    public Pages pages;

    @Steps
    public InboxSteps inboxSteps;
    
    @Steps
    public LoginSteps loginSteps;

    @Test
	public void checkVacationButton() {
    	loginSteps.openLoginPage();
    	loginSteps.enterUsername("Roxana");
    	loginSteps.enterPassword("test1");
    	loginSteps.startSearch();
    	inboxSteps.startVacationbtn();
    	inboxSteps.inboxbtn();
    	inboxSteps.checkInboxButtonIsPressed();
	}
}
