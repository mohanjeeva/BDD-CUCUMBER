/*In steps java class as we are not declaring any codes and locators to make the framework reusable, readable, and easy to maintain.*/

package com.site.automation.stepdefinitions;

import com.site.automation.driver.DriverFactory;
import com.site.automation.pages.ExplorePage;
import io.cucumber.java.en.*;

public class ExploreStep 
{
	ExplorePage explorePage = new ExplorePage(DriverFactory.getDriver());

	@When("User click on {string} menu in the navigation bar")
    public void clickMenuInNavigationBar(String navigationMenu) throws InterruptedException 
    {
    	explorePage.clickMenuInNavigationBar(navigationMenu);
    }
	
    @Then("Verify explore tab is opened")
    public void verifyExploreTabIsOpened() 
    {
        explorePage.verifyExploreTabIsOpened();
    }
    
    @When("User enter the business name {string} in Search bar")
    public void user_enter_the_business_name_in_search_bar(String businessName) 
    {
        explorePage.user_enter_the_business_name_in_search_bar(businessName);
    }
    
    @Then("Verify the search result has matching business name in dashboard")
    public void verify_the_search_result_has_matching_business_name_in_dashboard() throws InterruptedException 
    {
        explorePage.verify_the_search_result_has_matching_business_name_in_dashboard();
    }
    
    @When("User enter the City name {string} in city bar")
    public void user_enter_the_city_name_in_city_bar(String city) 
    {
        explorePage.user_enter_the_city_name_in_city_bar(city);
    }
    
    @Then("Verify the search result has matching city name in dashboard")
    public void verify_the_search_result_has_matching_city_name_in_dashboard() throws InterruptedException 
    {
        explorePage.verify_the_search_result_has_matching_city_name_in_dashboard();
    }
    
    @Then("Verify the search result should not listed based on business name or city")
    public void verifyTheSearchedBusinessOrCityIsNotListed() throws InterruptedException 
    {
        explorePage.verifyTheSearchedBusinessOrCityIsNotListed();
    }
    
    @Then("Clear the search results")
    public void clearTheSearchResults() throws InterruptedException 
    {
        explorePage.clearTheSearchResults();
    }
    
    @When("User selects the first business as favorites")
    public void user_selects_the_first_business_as_favorites() throws Exception 
    {
        explorePage.user_selects_the_first_business_as_favorites();
    }
    
    @Then("verify selected business is listed under favorites page")
    public void verify_selected_business_is_listed_under_favorites_page() throws InterruptedException 
    {
        explorePage.verify_selected_business_is_listed_under_favorites_page();
    }
    
    @When("User opens the first displayed business")
    public void user_opens_the_first_displayed_business() throws InterruptedException 
    {
        explorePage.user_opens_the_first_displayed_business();
    }
    
    @Then("Verify send enquiry button is visible")
    public void verify_send_enquiry_button_is_visible() 
    {
        explorePage.verify_send_enquiry_button_is_visible();
    }
    
    @Then("Verify {string} button is visible inside the business")
    public void verify_button_is_visible_Inside_Business(String buttonName) throws Exception 
    {
        explorePage.verify_button_is_visible_Inside_Business(buttonName);
    }
    
    @Then("Feed the enquiry message and submit it")
    public void feed_the_enquiry_message_and_submit() throws Exception 
    {
        explorePage.feed_the_enquiry_message_and_submit();
    }
    
    @Then("Verify the recent enquiry is listed under my enquires page")
    public void verifyRecentEnquiry() 
    {
    	explorePage.verifyRecentEnquiry();
    }
    
    @Then("Provide a reason for the ownership claim")
    public void provideReasonForTheBusiness() throws InterruptedException 
    {
    	explorePage.provideReasonForTheBusiness();
    }
    
    @Then("Verify claim submitted successfully notification")
    public void verifyPopupNotification() throws InterruptedException 
    {
    	explorePage.verifyPopupNotification();
    }
    
    @Then("Provide rating and comments for the business")
    public void provideRatingAndCommentsForTheBusiness() 
    {
    	explorePage.provideRatingAndCommentsForTheBusiness();
    }
    
    @Then("Verify the given rating and comments are listed")
    public void verifyTheRatingAndComments() 
    {
    	explorePage.verifyTheRatingAndComments();
    }
    
    @Then("Delete the review posted")
    public void deleteTheReviewPosted() 
    {
    	explorePage.deleteTheReviewPosted();
    }
    
    @Then("Verify the review is removed")
    public void verifyReviewIsRemoved() throws InterruptedException 
    {
    	explorePage.verifyReviewIsRemoved();
    }
    
    @Then("user select {string} option under the {string} filter")
    public void apply_the_filter(String dropdownOptions, String filterName) throws InterruptedException 
    {
        explorePage.apply_the_filter(dropdownOptions, filterName);
    }
    
    @Then("Verify the listed business is filtered based on the category filter")
    public void verify_the_listed_business_is_filtered_based_on_the_category_filter() throws InterruptedException 
    {
        explorePage.verify_the_listed_business_is_filtered_based_on_the_category_filter();
    }
    
    @Then("Navigate backe to the explore page")
    public void naviagateBackToExplorePage() throws InterruptedException 
    {
    	explorePage.naviagateBackToExplorePage();
    }
    
    @Then("Verify the listed business is filtered based on the sort by filter")
    public void verify_the_listed_business_is_filtered_based_on_the_sortBy_filter() throws InterruptedException 
    {
        explorePage.verify_the_listed_business_is_filtered_based_on_the_sortBy_filter();
    }
    
    @Then("Verify the listed business is filtered based on the min rating filter")
    public void verify_the_listed_business_is_filtered_based_on_the_minRating_filter() throws InterruptedException 
    {
    	explorePage.verify_the_listed_business_is_filtered_based_on_the_minRating_filter();
    }
    
    @Then("User selects verified only business check box")
    public void selectVerifiedOnlyCheckBox() throws InterruptedException 
    {
    	explorePage.selectVerifiedOnlyCheckBox();
    }
    
    @Then("Verify the listed business is verified by Infoez")
    public void verifyTheListedBusinessIsVerifiedByInfoez() throws InterruptedException 
    {
    	explorePage.verifyTheListedBusinessIsVerifiedByInfoez();
    }
    
}

