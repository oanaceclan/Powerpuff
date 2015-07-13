package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.VacationSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

@RunWith(SerenityRunner.class)
public class VacationTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://172.22.4.88:9091/login")
    public Pages pages;

    @Steps
    public VacationSteps vacationSteps;

    @Test
	public void checkVacationButton() {
    	vacationSteps.openLoginPage();
    	vacationSteps.enterUsername("Oana");
    	vacationSteps.enterPassword("test");
    	vacationSteps.startSearch();
    	vacationSteps.startVacationbtn();
    	vacationSteps.newRequestbtn();
    	vacationSteps.vacationWithoutPaymenyBtn();
    	//vacationSteps.checkVacDaysLeft();
    	//vacationSteps.checkVacationButtonIs();
	}
}
