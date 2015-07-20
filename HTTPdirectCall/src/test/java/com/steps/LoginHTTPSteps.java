package com.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import org.junit.Assert;





import com.pages.LoginHTTPPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class LoginHTTPSteps extends ScenarioSteps {

    LoginHTTPPage loginHTTPPage;
    

    @StepGroup
    public void openLoginPage() {
    	loginHTTPPage.getDriver().close();
    	loginHTTPPage.open();
    	loginHTTPPage.getDriver().manage().window().maximize();
    }
    
    @Step
    public void EnterUsername(String keyword) {
    	loginHTTPPage.enterUsername(keyword);
    }

    @Step
    public void EnterPassword(String keyword) {
    	loginHTTPPage.enterPassword(keyword);
    }
    
    @Step
    public void signInButtonClick() {
    	loginHTTPPage.signIn();
    }
    
    @StepGroup
    public void loginWith(String username, String password) {
    	openLoginPage();
    	EnterUsername(username);
    	EnterPassword(password);
    	signInButtonClick();
    }
    
    @Step
    public void checkLoginIsPerformed() {
    	Assert.assertTrue("SignOut button is not present!!!", loginHTTPPage.isSignOutButtonPresent());
    }
    
   
    
//    @Step
//    public void shouldSeeErrorMessage(String eMessage) {
//        assertThat(loginHTTPPage.getErrorMessages(), hasItem(containsString(eMessage)));
//    }

}