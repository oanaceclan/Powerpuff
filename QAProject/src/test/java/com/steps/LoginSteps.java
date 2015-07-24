package com.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import org.junit.Assert;


import com.pages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;
    

    @Step
    public void openLoginPage() {
    	loginPage.getDriver().close();
    	loginPage.open();
    	loginPage.getDriver().manage().window().maximize();
    }
    
    @Step
    public void enterUsername(String keyword) {
        loginPage.enterUsername(keyword);
    }

    @Step
    public void enterPassword(String keyword) {
        loginPage.enterPassword(keyword);
    }
    
    @Step
    public void signInButtonClick() {
    	loginPage.clickSignInButton();
    }
    
    @StepGroup
    public void loginWith(String username, String password) {
    	openLoginPage();
    	enterUsername(username);
    	enterPassword(password);
    	signInButtonClick();
    }
    
    @Step
    public void checkLoginIsPerformed() {
    	Assert.assertTrue("SignOut button is not present!!!", loginPage.checkIfSignOutButtonIsPresent());
    }
    
    @Step
    public void shouldSeeErrorMessage(String eMessage) {
        assertThat(loginPage.getErrorMessages(), hasItem(containsString(eMessage)));
    }

}