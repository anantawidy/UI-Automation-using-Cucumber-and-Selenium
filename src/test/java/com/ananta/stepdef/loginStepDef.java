package com.ananta.stepdef;

import com.ananta.BaseTest;
import com.ananta.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDef extends BaseTest {

    LoginPage loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }

    @When("user input valid username with {string}")
    public void userInputValidUsernameWith(String username) {
        loginPage.inputUsername(username);
    }

    @And("user input valid password with {string}")
    public void userInputValidPasswordWith(String password) {
        loginPage.inputPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user get error message {string}")
    public void userGetErrorMessage(String errorMessage) {
        loginPage.validateErrorMessage(errorMessage);
    }
}
