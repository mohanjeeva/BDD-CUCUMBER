package com.site.automation.stepdefinitions;

import com.site.automation.driver.DriverFactory;
import com.site.automation.pages.LoginPage;

/*In steps java class as we are not declaring any codes and locators to make the framework reusable, readable, and easy to maintain.*/

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
        loginPage.clickTheButton(buttonName);
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
    
    @When("Click on {string} menu in the navigation bar")
    public void clickMenuInNavigationBar(String navigationMenu) throws InterruptedException 
    {
    	loginPage.clickMenuInNavigationBar(navigationMenu);
    }
//
//    @Then("the user should see the banking dashboard")
//    public void verifyDashboard() 
//    {
//        assertTrue(loginPage.isDashboardDisplayed(),
//            "Banking dashboard was not displayed");
//    }
//
//    @Then("the user should see an invalid credentials message")
//    public void verifyErrorMessage() 
//    {
//        assertEquals(loginPage.getErrorMessage(),
//            "Invalid credentials");
//    }
}
