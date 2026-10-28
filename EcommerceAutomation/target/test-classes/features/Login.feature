Feature: Access the application

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

  Scenario: Search for a business and city that exist
    When User click on "Explore" menu in the navigation bar
    Then Verify explore tab is opened
    When User enter the business name "Nayudu Mobiles" in Search bar
    Then Click on "Search" button
    And Verify the search result has matching business name in dashboard
    Then Clear the search results
    When User enter the City name "Chennai" in city bar
    Then Click on "Search" button
    And Verify the search result has matching city name in dashboard
    Then Click on user profile and select "Log out" option

  Scenario: Search for a business and city that does not exist
    When User click on "Explore" menu in the navigation bar
    Then Verify explore tab is opened
    When User enter the business name "Sathish Pvt Ltd" in Search bar
    And User enter the City name "US" in city bar
    Then Click on "Search" button
    And Verify the search result should not listed based on business name or city
    Then Click on user profile and select "Log out" option
 
 
  Scenario: Verify user can able to add the business as favorites 
    When User click on "Explore" menu in the navigation bar
    Then Verify explore tab is opened
    When User selects the first business as favorites
    Then Click on user profile and select "Favorites" option
    And verify selected business is listed under favorites page
    
    @login   
  Scenario: Verify user can able send an enquiry 
    When User click on "Explore" menu in the navigation bar
    Then Verify explore tab is opened
    When User opens the first displayed business
    Then Verify send enquiry button is visible
    And Click on "Send Enquiry" button
    And Feed the enquiry message and submit it
    Then Click on user profile and select "My Enquiries" option
    Then Verify the recent enquiry is listed under my enquires page
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    