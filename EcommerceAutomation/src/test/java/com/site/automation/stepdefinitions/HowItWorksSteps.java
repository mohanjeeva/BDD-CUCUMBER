/*In steps java class as we are not declaring any codes and locators to make the framework reusable, readable, and easy to maintain.*/

package com.site.automation.stepdefinitions;

import com.site.automation.driver.DriverFactory;
import com.site.automation.pages.HowItWorkPages;

import io.cucumber.java.en.*;

public class HowItWorksSteps 
{
	HowItWorkPages howItWorkPages = new HowItWorkPages(DriverFactory.getDriver());

    @Then("Verify how it work tab is opened")
    public void verifyHowItWorkgTabIsOpened() throws InterruptedException 
    {
        howItWorkPages.verifyHowItWorkgTabIsOpened();
    }
    
    @Then("Verify {string} section is present")
    public void verifyHowInfoezSubSectionIsPresent(String sectionName) throws InterruptedException 
    {
    	howItWorkPages.verifyHowItWorkgTabIsOpened(sectionName);
    }
    
    @Then("User should navigate to explore page")
    public void userShouldNavigateToExplorePage() throws InterruptedException 
    {
    	howItWorkPages.userShouldNavigateToExplorePage();
    }
    
    @Then("Verify user is navigated in to the join Infoez page")
    public void verifyUserIsOnJoinInfoezPage() 
    {
    	howItWorkPages.verifyUserIsOnJoinInfoezPage();
    }
    
    @Then("Verify I am a Customer or Business owner radio buttons are visible")
    public void verify_i_am_a_customer_or_businessOwner_radio_buttons_are_visible()
    {
    	howItWorkPages.verify_i_am_a_customer_or_businessOwner_radio_buttons_are_visible();
    }
    
    @Then("User can see Full name, Email, Phone and Password fields")
    public void user_can_see_full_name_email_phone_and_password_fields() 
    {
    	howItWorkPages.user_can_see_full_name_email_phone_and_password_fields();
    }
    
    @Then("verify Already have an account then sign in link is visible")
    public void verify_already_have_an_account_then_sign_in_link_is_visible() 
    {
    	howItWorkPages.verify_already_have_an_account_then_sign_in_link_is_visible();
    }
    
    @Then("Click on Already have an account then Sign in link")
    public void clickAlreadyHaveAccountSignIn() 
    {
    	howItWorkPages.clickAlreadyHaveAccountSignIn();
    }
    
    @Then("Verify user navigated to signIn page")
    public void verifyUserInSignInPage() 
    {
    	howItWorkPages.verifyUserInSignInPage();
    }
    
    @Then("Fill all the required details")
    public void fillCreateAccountFields() throws InterruptedException 
    {
    	howItWorkPages.fillCreateAccountFields();
    }
    
    @Then("Verify business dashboard page is opened")
    public void verifyBusinessDashboardPageIsOpened() throws InterruptedException 
    {
    	howItWorkPages.verifyBusinessDashboardPageIsOpened();
    }

}





