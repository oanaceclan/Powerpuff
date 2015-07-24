package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class InboxPage extends PageObject {
	
	
	@FindBy (css="[href='http://172.22.4.88:9091/vacation']")
	private WebElementFacade vacationButton;
	
	@FindBy (css="[href*='menuItem=inbox']")
	private WebElementFacade inboxButton;
	
	@FindBy (css="a[href*='assignToTab=assignedToOthers'] ")
	 private WebElementFacade assignedToMe;
	
	public boolean isInboxButtonPresent() {
		return inboxButton.isPresent();
	}
	
	public boolean isInboxButtonAssignedToOthersPresent() {
		return assignedToMe.isPresent();
	}
	
	
	@FindBy (css="[name='_evovacation_WAR_EvoVacationportlet_allRowIds']")
	private WebElementFacade checkAllRows;
	
	@FindBy (css="[name='_evovacation_WAR_EvoVacationportlet_rowIds']")
	private WebElementFacade checkFirstRow;
	
	@FindBy (id="_evovacation_WAR_EvoVacationportlet_multipleApproveButton")
	private WebElementFacade approveButton;
	
	@FindBy (id="_evovacation_WAR_EvoVacationportlet_multipleRejectButton")
	private WebElementFacade rejectButton;
	
	public void vacationButtonClick() {
		vacationButton.click();
	}
	
	public void inboxButtonClick(){
		inboxButton.click();
	}
	
	public void checkAllRows(){
		checkAllRows.click();
	}
	
	public void checkFirstRow(){
		checkFirstRow.click();
	}
	
	public void clickApproveButton(){
		approveButton.click();
	}
	
	public void clickRejectButton(){
		rejectButton.click();
	}
	
}