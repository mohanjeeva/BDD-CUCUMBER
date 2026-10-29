@login
Feature: Login the Infoez application

  Background:
    Given Open the Infoez portal
    And Verify Infoez homepage is opened
    Then Click on "Sign in" button
    When User logs in with username "owner@infoez.com" and password "Owner@123"
    Then Verify user is logged in to the Infoez portal

  Scenario: Update user profile
    When Click on user profile and select "Profile" option
    Then Update user details and save the changes
    Then Verify updated value is reflect in the profile
    And Click on user profile and select "Log out" option
    Then Verify Infoez homepage is opened
