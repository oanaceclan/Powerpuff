package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginSteps;
import com.steps.MyRequestsSteps;
import com.steps.NewVacationRequestSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

@RunWith(SerenityRunner.class)
public class MyRequestsTest {

	 @Managed(uniqueSession = true)
	    public WebDriver webdriver;

	    @ManagedPages(defaultUrl = "http://172.22.4.88:9091/login")
	    public Pages pages;

	    @Steps
	    public NewVacationRequestSteps vacationSteps;
	    
	    @Steps
	    public MyRequestsSteps myReqSteps;
	    
	    @Steps
	    public LoginSteps loginSteps;
	    

	    @Test
		public void myRequestsFilter() {
	    	loginSteps.openLoginPage();
	    	loginSteps.enterUsername("Oana");
	    	loginSteps.enterPassword("test");
	    	loginSteps.startSearch();
	    	vacationSteps.startVacationbtn();
	    	myReqSteps.myRequestsbtn();
	    	myReqSteps.vacationType();
	    	myReqSteps.daysNumber();
	    	myReqSteps.vacationStatus();
	    	myReqSteps.applyButton();
	    	
	    	
		}
}
