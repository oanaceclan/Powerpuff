package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import tools.Constants;





import com.steps.LoginSteps;
import com.steps.VacationMenuSteps;
import com.steps.VacationReportSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

@RunWith(SerenityRunner.class)
public class VacationReportTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = Constants.EvoPortal)
    public Pages pages;

    @Steps
    public VacationReportSteps vacationReportSteps;
    
    @Steps
    public LoginSteps loginSteps;
    
    @Steps
	public VacationMenuSteps vacationMenuSteps;

    @Test

	public void checkIfTheVacationReportButtonIsApplyed() {
    	loginSteps.openLoginPage();
    	loginSteps.EnterUsername(Constants.DMUserName);
    	loginSteps.EnterPassword(Constants.DMPassWord);
    	loginSteps.signInButtonClick();
    	vacationMenuSteps.startVacationButton();
    	vacationReportSteps.vacationReportButtonClick();
    	vacationReportSteps.ExportButtonClick();
    }
}
