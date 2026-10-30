/*In pages we are defining what to do, Contains page-specific locators and Selenium actions to interact with web elements.*/

package com.site.automation.pages;

import com.site.automation.base.BaseClass;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PricingPages extends BaseClass
{	
	public PricingPages(WebDriver driver) 
	{
		super(driver);
	}
	
	public void verifyPricingTabIsOpened() throws InterruptedException 
	{
		boolean pricingPage = driver.findElement(By.xpath("//h1[text()='Choose your plan']")).isDisplayed();
		Assert.assertTrue(pricingPage, "Pricing tab is not opened");
	}
	
	public void verifySubscriptionPackageIsDisplayed(String packageName) 
	{
		boolean packageStatus = driver.findElement(By.xpath("//h3[text()='"+packageName+"']")).isDisplayed();
		Assert.assertTrue(packageStatus, packageName+" package is not available");
	}

	public void choose_an_subscription_plan_under_pricing_tab() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//button[text()='Choose plan'])[1]")).click();
		Thread.sleep(2000);
	}

	public void verify_the_subscription_is_applied_for_the_user() 
	{
		boolean subscriptionMessage = driver.findElement(By.xpath("//div[text()='Subscription updated']")).isDisplayed();
		boolean activePlan = driver.findElement(By.xpath("//button[text()='Active plan']")).isDisplayed();
		
		Assert.assertTrue(subscriptionMessage, "Subscription not updated");
		
		Assert.assertTrue(activePlan, "Plan is not active");
	}
	
	
}



