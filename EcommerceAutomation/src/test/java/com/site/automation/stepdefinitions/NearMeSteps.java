/*In steps java class as we are not declaring any codes and locators to make the framework reusable, readable, and easy to maintain.*/

package com.site.automation.stepdefinitions;

import com.site.automation.driver.DriverFactory;
import com.site.automation.pages.NearMePage;

import io.cucumber.java.en.*;

public class NearMeSteps 
{
	NearMePage nearMePage = new NearMePage(DriverFactory.getDriver());

    @Then("Verify near me tab is opened")
    public void verifyNearMeTabIsOpened() throws InterruptedException 
    {
        nearMePage.verifyNearMeTabIsOpened();
    }
    
    @Then("the nearby search field should be visible")
    public void the_nearby_search_field_should_be_visible() 
    {
    	nearMePage.the_nearby_search_field_should_be_visible();
    }
    
    @Then("the category filter should be visible")
    public void the_category_filter_should_be_visible() throws InterruptedException 
    {
    	nearMePage.the_category_filter_should_be_visible();
    }
    
    @Then("the distance filter should be visible")
    public void the_distance_filter_should_be_visible() 
    {
    	nearMePage.the_distance_filter_should_be_visible();
    }
    
    @Then("the {string} button should be visible")
    public void verify_button_should_be_visible(String buttonName) 
    {
    	nearMePage.verify_button_should_be_visible(buttonName);
    }
    
    @Then("the business results panel should be displayed")
    public void the_business_results_panel_should_be_displayed() 
    {
    	nearMePage.the_business_results_panel_should_be_displayed();
    }
    
    @When("the user searches for {string} in search near me filter")
    public void the_user_searches_for_in_search_near_me_filter(String searchByBusinessOrCity) 
    {
    	nearMePage.the_user_searches_for_in_search_near_me_filter(searchByBusinessOrCity);
    }
    
    @Then("the results should contains business {string}")
    public void the_results_should_contain_business(String verifyBusiness) throws InterruptedException
    {
    	nearMePage.the_results_should_contain_business(verifyBusiness);
    }
    
    @Then("the results should contains city {string}")
    public void the_results_should_contain_city(String verifyCity) throws InterruptedException
    {
    	nearMePage.the_results_should_contain_City(verifyCity);
    }
    
    @Then("User click on first filtered business")
    public void clickFirstFilteredBusiness() throws InterruptedException
    {
    	nearMePage.clickFirstFilteredBusiness();
    }
    
    @Then("user select {string} option under the category filter")
    public void selectOptionsInCategoryFilter(String categoryOption) throws InterruptedException
    {
    	nearMePage.selectOptionsInCategoryFilter(categoryOption);
    }
    
    @Then("Verify no result should populate based on the search")
    public void verifySearchShouldNotPopulate() throws InterruptedException
    {
    	nearMePage.verifySearchShouldNotPopulate();
    }
    
}


