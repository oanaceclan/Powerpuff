package com;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.UseTestDataFrom;
import tools.Constants;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.DatePickerSteps;
import com.steps.LoginSteps;
import com.steps.NewVacationRequestSteps;
import com.steps.VacationMenuSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("/Resources/data2.csv")
public class DatePickerTest {
	
	String username, password;
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.EvoPortal)
	public Pages pages;

	@Steps
	public LoginSteps loginSteps;

	@Steps
	public DatePickerSteps datePickerSteps;
	
	@Steps
	public VacationMenuSteps vacationSteps;
	
	@Steps
	public NewVacationRequestSteps newVacationRequestSteps;
	
	@Test
	public void chooseTheStartDateAndTheEndDate() {
		loginSteps.openLoginPage();
		loginSteps.enterUsername(Constants.UserName);
		loginSteps.enterPassword(Constants.PassWord);
		loginSteps.signInButtonClick();
		vacationSteps.startVacationButton();
		newVacationRequestSteps.newRequestButtonClick();
		datePickerSteps.selectStartDate(Constants.StartDate, Constants.MonthForStartDate, Constants.YearForStartDate);
		datePickerSteps.selectEndDate(Constants.EndDate, Constants.MonthForEndDate, Constants.YearForEndDate);
	}

}