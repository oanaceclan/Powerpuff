package com.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class MyRequestsFilterPage<WebElement> extends PageObject {

	@FindBy(css = "[href='http://172.22.4.88:9091/vacation']")
	private WebElementFacade vacationbtn;

	@FindBy(css = "[href*='menuItem=my-requests']")
	private WebElementFacade myRequestsButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;

	@FindBy(css = "[text()='Withdrawn']")
	private WebElementFacade withdrawnSts;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_withdrawnVacationRequest")
	private WebElementFacade cancel;

	@FindBy(css = ".col-6 a")
	private List<WebElementFacade> status;

	@FindBy(css = "div > div.view-vacation > div.aui-column.aui-w70.vacation-info-column.aui-column-first > div > table > tbody > tr:nth-child(2) > td:nth-child(1) > div > b")
	private WebElementFacade vacationStatusAfterWithdrawn;

	@FindBy(css = "[class='aui-column-content aui-column-content-first column-three-content '] label")
	private List<WebElementFacade> vacationType;

	@FindBy(css = "[class='aui-column-content column-three-content column-center-content '] label")
	private List<WebElementFacade> daysNumber;

	@FindBy(css = "[class='aui-column column-three column-center aui-column-last'] label")
	private List<WebElementFacade> vacationStatus;

	public void myRequestsButton() {
		myRequestsButton.click();
	}

	public void search(String word) {
		for (int i = 1; i < status.size(); i++) {
			if (status.get(i).getText().toLowerCase().contains(word.toLowerCase()))

			{
				System.out.println(status.get(i).getText());
				status.get(i).click();

			}
		}

	}

	public void vacationTypeSelect(String type) {
		for (WebElementFacade option : vacationType) {
			if (option.getText().contains(type)) {
				option.click();
				break;
			}

		}

	}

	public void daysNumberSelect(String type) {
		for (WebElementFacade option : daysNumber) {
			if (option.getText().contains(type)) {
				option.click();
				break;
			}

		}

	}

	public void vacationStatusSelect(String type) {
		for (WebElementFacade option : vacationStatus) {
			if (option.getText().contains(type)) {
				option.click();
				break;
			}
		}
	}

	public void applyButton() {
		applyButton.click();
	}

	public void cancelBtn() {
		cancel.click();
	}

	public boolean isWithdrawnStatusPresent() {
		return vacationStatusAfterWithdrawn.isPresent();
	}
}
