@Pricing
Feature: Explore page of Infoez application

  Background:
    Given Open the Infoez portal
    And Verify Infoez homepage is opened
    Then Click on "Sign in" button
    When User logs in with username "owner@infoez.com" and password "Owner@123"
    Then Verify user is logged in to the Infoez portal

  Scenario: Verify user can access the pricing tab
    When User click on "Pricing" menu in the navigation bar
    Then Verify pricing tab is opened
    Then Click on user profile and select "Log out" option

  Scenario: Verify user can access the pricing tab through Subscription under user profile
    When Click on user profile and select "Subscription" option
    Then Verify pricing tab is opened
    Then Click on user profile and select "Log out" option

  Scenario: Verify user can see all four subscription package
    When User click on "Pricing" menu in the navigation bar
    Then Verify pricing tab is opened
    And Verify "Free" package is displayed
    And Verify "Starter" package is displayed
    And Verify "Pro" package is displayed
    And Verify "Enterprise" package is displayed
    Then Click on user profile and select "Log out" option

  Scenario: Verify user can choose subscription package
    When User click on "Pricing" menu in the navigation bar
    Then Verify pricing tab is opened
    And Choose an subscription plan under pricing tab
    And Verify the subscription is applied for the user
    Then Click on user profile and select "Log out" option
