package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import tools.Constants;

import com.steps.InboxSteps;
import com.steps.LoginSteps;
import com.steps.ViewVacationFilterSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

@RunWith(SerenityRunner.class)
public class ViewVacationFilterTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = Constants.EvoPortal)
    public Pages pages;

    @Steps
    public ViewVacationFilterSteps viewvacationFilterSteps;
    
    @Steps
    public InboxSteps inboxSteps;
    
    @Steps
    public LoginSteps loginSteps;

    @Test
	public void checkVacationButton() {
    	loginSteps.openLoginPage();
    	loginSteps.enterUsername(Constants.DMUserName);
    	loginSteps.enterPassword(Constants.DMPassWord);
    	loginSteps.startSearch();
    	inboxSteps.startVacationbtn();
    	viewvacationFilterSteps.viewvacationbtn();
    	viewvacationFilterSteps.vacationType();
    	viewvacationFilterSteps.daysNumber();
    	viewvacationFilterSteps.vacationStatus();
    	viewvacationFilterSteps.firstName("Oana");
    	viewvacationFilterSteps.lastName("Ceclan");
    	//viewvacationFilterSteps.inactiveUsers();
    	viewvacationFilterSteps.applyButton();
    	viewvacationFilterSteps.search("sick");
    	viewvacationFilterSteps.cancel();
    	
    	
	}
}
