package com.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class HolidayRequestPage extends PageObject {

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_startDate")
	private WebElementFacade datePicker;

	@FindBy(css = ".Zebra_DatePicker_Icon_Wrapper input[id='_evovacation_WAR_EvoVacationportlet_startDate']")
	private WebElement startdate;
	
	@FindBy(css = ".Zebra_DatePicker_Icon_Wrapper input[id='_evovacation_WAR_EvoVacationportlet_endDate']")
	private WebElement enddate;
	
	@FindBy(css = "div:nth-child(11) > table.dp_daypicker > tbody > tr:nth-child(4) > td.dp_selected.dp_current")
	private WebElement currentdate;
	
	@FindBy(css = "div:nth-child(12) > table.dp_daypicker > tbody > tr:nth-child(4) > td:nth-child(6)")
	private WebElement end;
	
	@FindBy(css = ".aui-button-holder  > .aui-button-submit [id='_evovacation_WAR_EvoVacationportlet_saveButton']")
	private WebElement savebutton;
	
	public void datePick() {
		element(datePicker).waitUntilVisible();
		datePicker.click();
	}

	public void SelectStartDate() {
		startdate.click();
		currentdate.click();
	}

	public void SelectEndDate() {
		enddate.click();
		end.click();
	}

	public void save() {
		savebutton.click();
	}

	

}