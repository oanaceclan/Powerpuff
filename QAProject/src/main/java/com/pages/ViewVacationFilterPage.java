package com.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ViewVacationFilterPage<WebElement> extends PageObject {


	@FindBy(css = "[href*='menuItem=view-vacations']")
	private WebElementFacade viewVacationButton;

//	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_SICK_LEAVECheckbox")
//	private WebElementFacade vacationTypeSickleave;
//
//	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
//	private WebElementFacade daysNumber;
//
//	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_APPROVEDCheckbox")
//	private WebElementFacade vacationStatusApproved;

	// @FindBy(id="_evovacation_WAR_EvoVacationportlet_inactiveUsersCheckbox")
	// private WebElementFacade inactiveUsers;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewVacationsLastName")
	private WebElementFacade lastname;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewVacationsFirstName")
	private WebElementFacade firstname;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_cancelVacationRequest")
	private WebElementFacade cancel;
	
	@FindBy(css = "div[class*='aui-column column-three aui-column-first '] label")
	private List<WebElementFacade> vacationTypeList;
	
	@FindBy(css = "div[class='aui-column column-three column-center '] label")
	private List<WebElementFacade> daysNumberList;
	
	@FindBy(css = "div[class='aui-column-content aui-column-content-last column-three-content column-center-content '] label")
	private List<WebElementFacade> vacationStatusList;
	
	@FindBy(css = ".col-9 a")
	private List<WebElementFacade> statusColomn;

	public void viewVacationButtonClick() {
		viewVacationButton.click();
	}

//	public void vacationTypeSickLeaveCheck() {
//		vacationTypeSickleave.click();
//	}
//
//	public void daysNumberCheck() {
//		daysNumber.click();
//	}
//
//	public void vacationStatusApprovedCheck() {
//		vacationStatusApproved.click();
//	}

	public void lastNameField(String keyword) {
		lastname.type(keyword);
	}

	public void firstNameField(String keyword) {
		firstname.type(keyword);
	}

	/*
	 * public void inactiveUsersCheck() { inactiveUsers.click(); }
	 */

	public void applyButtonClick() {
		applyButton.click();
	}

	public void cancelButtonClick() {
		cancel.click();
	}

	public void search(String word) {
		for (int i = 1; i < statusColomn.size(); i++) {
			if (statusColomn.get(i).getText().toLowerCase()
					.contains(word.toLowerCase()))
				;
			{
				System.out.println(statusColomn.get(i).getText());
				statusColomn.get(i).click();

			}
		}

	}

	public boolean isApplyButtonPresent() {

		return applyButton.isPresent();
	}

	public void selectVacationType(String type) {
		for (WebElementFacade option : vacationTypeList) {
			if (option.getText().contains(type)) {
				option.click();
				break;
			}

		}

	}
	public void selectDaysNumber(String type) {
		for (WebElementFacade option : daysNumberList) {
			if (option.getText().contains(type)) {
				option.click();
				break;
			}

		}

	}
	public void selectVacationStatus(String type) {
		for (WebElementFacade option : vacationStatusList) {
			if (option.getText().contains(type)) {
				option.click();
				break;
}
		}
	}
}
