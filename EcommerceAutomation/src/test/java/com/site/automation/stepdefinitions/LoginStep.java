/*In steps java class as we are not declaring any codes and locators to make the framework reusable, readable, and easy to maintain.*/

package com.site.automation.stepdefinitions;

import com.site.automation.driver.DriverFactory;
import com.site.automation.pages.LoginPage;

import io.cucumber.java.en.*;

public class LoginStep 
{
	LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Given("Open the Infoez portal")
    public void openApplication() throws InterruptedException 
	{
        loginPage.openApplication("https://d2mojgetgp5xie.cloudfront.net/");
    }
	
	@And("Verify Infoez homepage is opened")
    public void verifyInfoezHomepageIsOpened() throws InterruptedException 
	{
        loginPage.verifyInfoezHomepageIsOpened();
    }
	
	@Then("Click on {string} button")
    public void clickTheButton(String buttonName) throws InterruptedException 
	{
		//System.out.println(buttonName);
        LoginPage.clickTheButton(buttonName);
    }

    @When("User logs in with username {string} and password {string}")
    public void loginToInfoez(String username, String password) throws InterruptedException 
    {
        loginPage.enterUsernameAndPassword(username, password);
    }
    
    @Then("Verify user is logged in to the Infoez portal")
    public void verifyUserLoggedInToInfoezPage() throws InterruptedException 
    {
    	loginPage.verifyUserLoggedInToInfoezPage();
    }
    
    @When("Click on user profile and select {string} option")
    public void clickOptionUnderUserProfile(String profileOptions) throws InterruptedException 
    {
    	loginPage.clickOptionUnderUserProfile(profileOptions);
    }

    @Then("Update user details and save the changes")
    public void updateUserDetails() 
    {
        loginPage.updateUserDetails();
    }
    
    @Then("Verify updated value is reflect in the profile")
    public void verifyUpdatedValueInUserProfile() throws InterruptedException 
    {
        loginPage.verifyUpdatedValueInUserProfile();
    }  
}
