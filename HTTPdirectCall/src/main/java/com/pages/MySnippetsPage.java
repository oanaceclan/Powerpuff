package com.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class MySnippetsPage extends PageObject {

	@FindBy(css = "#menu-left > a:nth-child(2)")
	private WebElementFacade mySnippetsButton;

	@FindBy(css = "td:nth-child(2) > a")
	private WebElementFacade deleteButton;

	@FindBy(css = "body > div:nth-child(2) > div.content")
	private WebElementFacade noSnippetsMessage;

	@FindBy(xpath = "//*[contains(text(),'[X]')]")
	private List<WebElementFacade> snippetList;

	public void MySnippetsButtonClick() {
		mySnippetsButton.click();
	}

	public void deleteButtonClick() {
		while (snippetList.size() > 0) {
			deleteButton.click();
		}
	}

	public void snippetListLength() {
		System.out.println(snippetList.size());
	}

	public boolean noSnippetsMessage() {

		return noSnippetsMessage.isPresent();
	}

}