package com;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.UseTestDataFrom;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import tools.Constants;

import com.steps.LoginSteps;
import com.steps.VacationMenuSteps;
import com.steps.ViewVacationFilterSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("/Resources/dataTypes.csv")
public class ViewVacationFilterTest {
	
	String VacationType, DaysNumber, VacationStatus;

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = Constants.EvoPortal)
    public Pages pages;
    
    @Steps
    public LoginSteps loginSteps;
    
    @Steps
    public VacationMenuSteps vacationSteps;

    @Steps
    public ViewVacationFilterSteps viewvacationFilterSteps;
    
    
   String type;

    @Test
	public void checkIfTheFiltersOfViewVacationButtonAndTheCancelButtonWorks() {
    	loginSteps.openLoginPage();
    	loginSteps.EnterUsername(Constants.DMUserName);
    	loginSteps.EnterPassword(Constants.DMPassWord);
    	loginSteps.signInButtonClick();
    	vacationSteps.startVacationButton();
    	viewvacationFilterSteps.viewVacationButton();
    	viewvacationFilterSteps.selectVacationType(VacationType);
    	viewvacationFilterSteps.selectDaysNumber(DaysNumber);
    	viewvacationFilterSteps.selectVacationStatus(VacationStatus);
    	
    	/*viewvacationFilterSteps.vacationTypeCheck();
    	viewvacationFilterSteps.daysNumberCheck();
    	viewvacationFilterSteps.vacationStatusCheck();
    	viewvacationFilterSteps.firstName("Oana");
    	viewvacationFilterSteps.lastName("Ceclan");
    	//viewvacationFilterSteps.inactiveUsers();
    	viewvacationFilterSteps.applyButton();
    	viewvacationFilterSteps.searchButtonClick("sick");
    	viewvacationFilterSteps.cancel();
    	*/
    }
    	
    	
	}

