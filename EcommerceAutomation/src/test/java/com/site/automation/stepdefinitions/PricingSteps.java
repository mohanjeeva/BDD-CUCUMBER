/*In steps java class as we are not declaring any codes and locators to make the framework reusable, readable, and easy to maintain.*/

package com.site.automation.stepdefinitions;

import com.site.automation.driver.DriverFactory;
import com.site.automation.pages.PricingPages;

import io.cucumber.java.en.*;

public class PricingSteps 
{
	PricingPages pricingPage = new PricingPages(DriverFactory.getDriver());

    @Then("Verify pricing tab is opened")
    public void verifyPricingTabIsOpened() throws InterruptedException 
    {
        pricingPage.verifyPricingTabIsOpened();
    }
    
    @Then("Verify {string} package is displayed")
    public void verifySubscriptionPackageIsDisplayed(String packageName) throws InterruptedException 
    {
    	pricingPage.verifySubscriptionPackageIsDisplayed(packageName);
    }
    
    @Then("Choose an subscription plan under pricing tab")
    public void choose_an_subscription_plan_under_pricing_tab() throws InterruptedException 
    {
    	pricingPage.choose_an_subscription_plan_under_pricing_tab();
    }
    
    @Then("Verify the subscription is applied for the user")
    public void verify_the_subscription_is_applied_for_the_user() 
    {
    	pricingPage.verify_the_subscription_is_applied_for_the_user();
    }
}



