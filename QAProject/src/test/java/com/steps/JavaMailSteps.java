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
public class JavaMailSteps extends ScenarioSteps {

    LoginPage loginPage;
    

    @Step
    public void openLoginPage() {
    	loginPage.getDriver().close();
    	loginPage.open();
    	loginPage.getDriver().manage().window().maximize();
    }
    
    @Step
    public void enterUsername(String keyword) {
        loginPage.enter_username(keyword);
    }

    @Step
    public void enterPassword(String keyword) {
        loginPage.enter_password(keyword);
    }
    
    @Step
    public void startSearch() {
    	loginPage.signIn();
    }
    
    @StepGroup
    public void loginWith(String username, String password) {
    	openLoginPage();
    	enterUsername(username);
    	enterPassword(password);
    	startSearch();
    }
    
    @Step
    public void checkLoginIsPerformed() {
    	Assert.assertTrue("SignOut button is not present!!!", loginPage.isSignOutButtonPresent());
    }
    
    @Step
    public void should_see_error_message(String eMessage) {
        assertThat(loginPage.getErrorMessages(), hasItem(containsString(eMessage)));
    }

}