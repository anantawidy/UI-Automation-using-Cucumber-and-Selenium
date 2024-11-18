@login
Feature: Login Feature

  @positif-scenario
  Scenario: Login with valid username and password
    Given user is on login page
    When user input valid username with "standard_user"
    And user input valid password with "secret_sauce"
    And user click login button
    Then user will be redirect to homepage

  @negatif-scenario
  Scenario: Login with invalid username and password
    Given user is on login page
    When user input valid username with "standard_user"
    And user input valid password with "invalid_user"
    And user click login button
    Then user get error message "Epic sadface: Username and password do not match any user in this service"

    @boundaries-scenario
    Scenario: User try to checkout product
      Given user is on login page
      When user input valid username with "standard_user"
      And user input valid password with "secret_sauce"
      And user click login button
      And user click add to cart
      And user click cart
      And user click checkout
      And user input firstname with "Test"
      And user input lastname with "JayJay"
      And user input postal code with "123456"
      And user click continue
      And user click finish
      Then user success to order "THANK YOU FOR YOUR ORDER"
