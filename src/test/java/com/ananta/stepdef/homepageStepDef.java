package com.ananta.stepdef;

import com.ananta.BaseTest;
import com.ananta.page.HomePage;
import io.cucumber.java.en.Then;

public class homepageStepDef extends BaseTest {

    @Then("user will be redirect to homepage")
    public void userWillBeRedirectToHomepage() {
        HomePage homePage = new HomePage(driver);
        homePage.validateOnHomepage();
    }
}
