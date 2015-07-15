package com;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import tools.Constants;

import com.steps.InboxSteps;
import com.steps.LoginSteps;
import com.steps.VacationReportFilterSteps;

@RunWith(SerenityRunner.class)
public class VacationReportFilterTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = Constants.EvoPortal)
    public Pages pages;
    
    @Steps
    public InboxSteps inboxSteps;

    @Steps
    public VacationReportFilterSteps vacationReportFilterSteps;
    
    @Steps
    public LoginSteps loginSteps;

    @Test
	public void checkVacationButton() {
    	loginSteps.openLoginPage();
    	loginSteps.enterUsername(Constants.DMUserName);
    	loginSteps.enterPassword(Constants.DMPassWord);
    	loginSteps.startSearch();
    	inboxSteps.startVacationbtn();
    	vacationReportFilterSteps.vacationReportButton();
    	vacationReportFilterSteps.exportMonth("November");
    	vacationReportFilterSteps.exportYear("2010");
    	vacationReportFilterSteps.approved();
    	vacationReportFilterSteps.pending();
    	vacationReportFilterSteps.cim();
    	vacationReportFilterSteps.other();
    	vacationReportFilterSteps.ExportButton();
	}
}