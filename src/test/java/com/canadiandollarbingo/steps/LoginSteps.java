package com.canadiandollarbingo.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import com.canadiandollarbingo.pages.HomePage;

public class LoginSteps {
    @Given("^when I am on homepage$")
    public void whenIAmOnHomepage() {
    }

    @When("^I enter \"([^\"]*)\" in the username field$")
    public void iEnterInTheUsernameField(String userId) {
        new HomePage().sendTextToLoginField(userId);
    }

    @And("^I enter \"([^\"]*)\" in the password field$")
    public void iEnterInThePasswordField(String password) {
        new HomePage().sendTextToPasswordField(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLogin();
    }

    @Then("^I should not be able to log in with invalid credentials$")
    public void iShouldNotBeAbleToLogInWithInvalidCredentials() {
        String expectedText = "Incorrect username or password.";
        Assert.assertEquals("incorrect message", new HomePage().getErrorText(), expectedText);
    }

}
