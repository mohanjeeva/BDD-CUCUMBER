@nearMe
Feature: Near me page of Infoez application

  Background:
    Given Open the Infoez portal
    And Verify Infoez homepage is opened
    Then Click on "Sign in" button
    When User logs in with username "owner@infoez.com" and password "Owner@123"
    Then Verify user is logged in to the Infoez portal
    When User click on "Near me" menu in the navigation bar
    Then Verify near me tab is opened

  Scenario: Verify map page components
    Then the nearby search field should be visible
    And the category filter should be visible
    And the distance filter should be visible
    And the "Apply" button should be visible
    And the business results panel should be displayed
    And the "Use my location" button should be visible

  Scenario: Search for a business by name
    When the user searches for "Naga Biryani House" in search near me filter
    And Click on "Apply" button
    Then the results should contains business "Naga Biryani House"

  Scenario: Search for a business by city
    When the user searches for "Delhi" in search near me filter
    And Click on "Apply" button
    Then the results should contains city "Delhi"

  Scenario: Verify category filters under explore page is working as expected
    When user select "Restaurants" option under the category filter
    And Click on "Apply" button
    Then User click on first filtered business
    Then Click on user profile and select "Log out" option

  Scenario: Verify search result for non exists data
    When the user searches for "dummy" in search near me filter
    Then Click on "Apply" button
    And Verify no result should populate based on the search
    Then Click on user profile and select "Log out" option
