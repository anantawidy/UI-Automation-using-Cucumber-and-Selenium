package com.ananta.stepdef;

import com.ananta.BaseTest;
import com.ananta.page.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class checkoutStepDef extends BaseTest {

    CheckoutPage checkoutPage;
    public checkoutStepDef(){
        this.checkoutPage = new CheckoutPage(driver);
    }
    @And("user click add to cart")
    public void userClickAddToCart() {
        checkoutPage.clickAddToCartButton();
    }

    @And("user click cart")
    public void userClickCart() {
        checkoutPage.clickCartButton();
    }

    @And("user click checkout")
    public void userClickCheckout() {
        checkoutPage.clickCheckoutButton();
    }

    @And("user input firstname with {string}")
    public void userInputFirstnameWith(String firstname) {
        checkoutPage.inputFirstname(firstname);
    }

    @And("user input lastname with {string}")
    public void userInputLastnameWith(String lastname) {
        checkoutPage.inputLastname(lastname);
    }

    @And("user input postal code with {string}")
    public void userInputPostalCodeWith(String postalCode) {
        checkoutPage.inputPostalCode(postalCode);
    }

    @And("user click continue")
    public void userClickContinue() {
        checkoutPage.clickContinueButton();
    }

    @And("user click finish")
    public void userClickFinish() {
        checkoutPage.clickFinishButton();
    }

    @Then("user success to order {string}")
    public void userSuccessToOrder(String successCheckout) {
        checkoutPage.validateSuccessCheckout(successCheckout);
    }
}
