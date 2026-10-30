/*In pages we are defining what to do, Contains page-specific locators and Selenium actions to interact with web elements.*/

package com.site.automation.pages;

import com.site.automation.base.BaseClass;
import com.site.automation.reusable.Reusable;

import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HowItWorkPages extends BaseClass
{	
	String email = "", password = "", name="";
	public HowItWorkPages(WebDriver driver) 
	{
		super(driver);
	}

	public void verifyHowItWorkgTabIsOpened() 
	{
		boolean howItWorksPage = driver.findElement(By.xpath("//h1[text()='How Infoez works']")).isDisplayed();
		Assert.assertTrue(howItWorksPage, "How it works tab is not opened");
	}

	public void verifyHowItWorkgTabIsOpened(String sectionName) 
	{
		boolean sectionStatus = driver.findElement(By.xpath("//h3[text()='"+sectionName+"']")).isDisplayed();
		Assert.assertTrue(sectionStatus, sectionStatus+" section is not available");
	}

	public void userShouldNavigateToExplorePage() 
	{
		boolean explorePage = driver.findElement(By.xpath("//h1[contains(text(),'Businesses')]")).isDisplayed();
		Assert.assertTrue(explorePage, "Explore tab is not opened");
	}

	public void verifyUserIsOnJoinInfoezPage() 
	{
		boolean joinInfoezPage = driver.findElement(By.xpath("//p[text()='Join Infoez in seconds.']")).isDisplayed();
		Assert.assertTrue(joinInfoezPage, "Join Infoez page is not opened");
	}

	public void verify_i_am_a_customer_or_businessOwner_radio_buttons_are_visible() 
	{
		boolean customer = driver.findElement(By.xpath("//div[text()='Customer']")).isDisplayed();
		boolean businessOwner = driver.findElement(By.xpath("//div[text()='Business']")).isDisplayed();
		
		System.out.println(customer+""+businessOwner);
		Assert.assertTrue(customer && businessOwner, "Customer and Business owner radio button is not available");
	}

	public void user_can_see_full_name_email_phone_and_password_fields() 
	{
		boolean name = driver.findElement(By.xpath("//label[text()='Full name']")).isDisplayed();
		boolean email = driver.findElement(By.xpath("//label[text()='Email']")).isDisplayed();
		boolean phone = driver.findElement(By.xpath("//label[text()='Phone (optional)']")).isDisplayed();
		boolean password = driver.findElement(By.xpath("//label[text()='Password']")).isDisplayed();
		Assert.assertTrue(name && email && phone && password, "Input fields are not available");
	}

	public void verify_already_have_an_account_then_sign_in_link_is_visible()
	{
		boolean alreadyHaveAnAccount = driver.findElement(By.xpath("//p[text()='Already have an account? ']")).isDisplayed();
		Assert.assertTrue(alreadyHaveAnAccount, "Already have an account link is not visible");
	}

	public void clickAlreadyHaveAccountSignIn() 
	{
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	}

	public void verifyUserInSignInPage() 
	{
		boolean signInPage = driver.findElement(By.xpath("//button[text()='Sign in']")).isDisplayed();
		Assert.assertTrue(signInPage, "User is not redirected to signIn page");
	}

	public void fillCreateAccountFields() throws InterruptedException 
	{
		String randomText = Reusable.generateRandomText(5);
		name = "Business "+randomText;
		email = "business"+randomText+"@infoez.com";
		password = "Password@123";
		driver.findElement(By.xpath("//label[text()='Full name']//following-sibling::input")).sendKeys(name);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Email']//following-sibling::input")).sendKeys(email);	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Password']//following-sibling::input")).sendKeys(password);	
		Thread.sleep(1000);
	}

	public void verifyBusinessDashboardPageIsOpened() throws InterruptedException 
	{
		Thread.sleep(3000);
		boolean businessDashboardPage = driver.findElement(By.xpath("//h1[text()='Business dashboard']")).isDisplayed();
		Assert.assertTrue(businessDashboardPage, "User is not redirected to business dashboard page");
	}
	
}





