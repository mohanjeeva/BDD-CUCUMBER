@HowItWork
Feature: Explore page of Infoez application

  Background:
    Given Open the Infoez portal
    And Verify Infoez homepage is opened
    Then Click on "Sign in" button
    When User logs in with username "owner@infoez.com" and password "Owner@123"
    Then Verify user is logged in to the Infoez portal

  Scenario: Verify user can access how it works tab
    When User click on "How it works" menu in the navigation bar
    Then Verify how it work tab is opened
    Then Click on user profile and select "Log out" option
  
   Scenario: Verify user can view how Infoez works
    When User click on "How it works" menu in the navigation bar
    Then Verify how it work tab is opened 
    And Verify "Search verified locals" section is present
    And Verify "Trust the badge" section is present
    And Verify "Send enquiries" section is present
    And Verify "Rate & review" section is present
    And the "Start exploring" button should be visible
    And the "List your business" button should be visible
    Then Click on user profile and select "Log out" option
   
    Scenario: Verify the behaviour of start exploring button
    When User click on "How it works" menu in the navigation bar
    Then Verify how it work tab is opened 
    When Click on "Start exploring" button
    Then User should navigate to explore page
    Then Click on user profile and select "Log out" option
    
     Scenario: Verify the behaviour of List your business button
    When User click on "How it works" menu in the navigation bar
    Then Verify how it work tab is opened 
    When Click on "List your business" button
    Then Verify user is navigated in to the join Infoez page
    And Verify I am a Customer or Business owner radio buttons are visible
    And User can see Full name, Email, Phone and Password fields 
    And the "Create account" button should be visible
    And verify Already have an account then sign in link is visible
    Then Click on user profile and select "Log out" option
    
     Scenario: Verify user can login if user already have an Infoez account
    When User click on "How it works" menu in the navigation bar
    Then Verify how it work tab is opened 
    When Click on "List your business" button
    Then Verify user is navigated in to the join Infoez page
    Then Click on Already have an account then Sign in link
    Then Verify user navigated to signIn page
    Then Click on user profile and select "Log out" option
    
    @test
     Scenario: Verify user can create an Infoez account
    When User click on "How it works" menu in the navigation bar
    Then Verify how it work tab is opened 
    When Click on "List your business" button
    Then Verify user is navigated in to the join Infoez page
    Then Fill all the required details
    And Click on "Create account" button
    And Verify business dashboard page is opened
    Then Click on user profile and select "Log out" option
    