package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class MyRequestsFilterPage extends PageObject {

	@FindBy(css = "[href='http://172.22.4.88:9091/vacation']")
	private WebElementFacade vacationbtn;

	@FindBy(css = "[href*='menuItem=my-requests']")
	private WebElementFacade myRequestsButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_VACATION_WITHOUT_PAYMENTCheckbox")
	private WebElementFacade vacationWithoutPaymentBtn;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElementFacade daysNumber;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_PENDINGCheckbox")
	private WebElementFacade vacationStatus;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;

	@FindBy(css = "[text()='Withdrawn']")
	private WebElementFacade withdrawnSts;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_withdrawnVacationRequest")
	private WebElementFacade cancel;

	@FindBy(css = ".col-6 a")
	private List<WebElement> status;

	@FindBy(css = "div > div.view-vacation > div.aui-column.aui-w20.vacation-actions.aui-column-first > div > div > div:nth-child(2) > div > i")
	private WebElementFacade messageAfterWithdrawn;

	public void myRequestsButton() {
		myRequestsButton.click();
	}

	public void vacationWithoutPaymentButton() {
		vacationWithoutPaymentBtn.click();
	}

	public void daysNumber() {
		daysNumber.click();
	}

	public void vacationStatus() {
		vacationStatus.click();
	}

	public void applyButton() {
		applyButton.click();
	}

	public void cancelBtn() {
		cancel.click();
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

	public boolean isWithdrawnMessagePresent() {
		return messageAfterWithdrawn.isPresent();
	}
}
