Feature: Access the application

Scenario: Login to the application
Given Open the Infoez portal
And Verify Infoez homepage is opened
Then Click on "Sign in" button
When User logs in with username "owner@infoez.com" and password "Owner@123"
Then Verify user is logged in to the Infoez portal

@login
Scenario: Verify sort by dropdown values for category Restaurants
Given Open the Infoez portal
And Verify Infoez homepage is opened
Then Click on "Sign in" button
When User logs in with username "owner@infoez.com" and password "Owner@123"
Then Verify user is logged in to the Infoez portal
When Click on "Explore" menu in the navigation bar
