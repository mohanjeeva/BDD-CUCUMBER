/*In pages we are defining what to do, Contains page-specific locators and Selenium actions to interact with web elements.*/

package com.site.automation.pages;

import com.site.automation.base.BaseClass;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NearMePage extends BaseClass
{	
	String mapXpath = "//div[@class='leaflet-container leaflet-touch leaflet-fade-anim leaflet-grab leaflet-touch-drag leaflet-touch-zoom']";
	public NearMePage(WebDriver driver) 
	{
		super(driver);
	}

	public void verifyNearMeTabIsOpened() throws InterruptedException 
	{
		boolean nearMePage = driver.findElement(By.xpath("//h1[text()='Businesses on map']")).isDisplayed();
		Assert.assertTrue(nearMePage, "Near me tab is not opened");
		Thread.sleep(3000);
	}
	
	public void the_nearby_search_field_should_be_visible() 
	{
		boolean nearByFilter = driver.findElement(By.xpath("//input[@placeholder='Search nearby…']")).isDisplayed();
		Assert.assertTrue(nearByFilter, "Search near by filter is not visible");
	}

	public void the_category_filter_should_be_visible() throws InterruptedException 
	{
		Thread.sleep(2000);
		boolean categoryFilter = driver.findElement(By.xpath("//button[@data-testid='map-category']")).isDisplayed();
		Assert.assertTrue(categoryFilter, "Category filter is not visible");
	}

	public void the_distance_filter_should_be_visible() 
	{
		boolean distanceFilter = driver.findElement(By.xpath("//button[@data-testid='map-radius']")).isDisplayed();
		Assert.assertTrue(distanceFilter, "Distance filter is not visible");
	}

	public void verify_button_should_be_visible(String buttonName) 
	{
		boolean applyButton = driver.findElement(By.xpath("//*[text()='"+buttonName+"']")).isDisplayed();
		Assert.assertTrue(applyButton, applyButton+" filter is not visible");
	}

	public void the_business_results_panel_should_be_displayed()
	{
		boolean businessResult = driver.findElement(By.xpath("//aside//div[@class='eyebrow mb-3']")).isDisplayed();
		Assert.assertTrue(businessResult, "Business result filter is not visible");
	}

	public void the_user_searches_for_in_search_near_me_filter(String searchByBusinessOrCity) 
	{
		driver.findElement(By.xpath("//input[@placeholder='Search nearby…']")).sendKeys(searchByBusinessOrCity);
	}

	public void the_results_should_contain_business(String verifyBusiness) throws InterruptedException 
	{
		Thread.sleep(3000);
		String searchedBusiness = driver.findElement(By.xpath("(//button[contains(@data-testid,'map-result-')]//div[@class='font-semibold truncate'])[1]")).getText();
		Assert.assertEquals(searchedBusiness, verifyBusiness, "Searched business is not matching");
	}

	public void the_results_should_contain_City(String verifyCity) throws InterruptedException 
	{
		Thread.sleep(3000);
		String searchedCity = driver.findElement(By.xpath("(//button[contains(@data-testid,'map-result-')]//div[@class='text-xs text-muted-foreground flex items-center gap-1'])[1]")).getText();
		//System.out.println(searchedCity.replaceAll("[^a-zA-Z]", ""));
		Assert.assertEquals(searchedCity.replaceAll("[^a-zA-Z]", ""), verifyCity, "Searched city is not matching");	
	}

	public void clickFirstFilteredBusiness() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//div[@class='font-semibold truncate'])[1]")).click();
		Thread.sleep(3000);
	}

	public void selectOptionsInCategoryFilter(String categoryOption) throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@data-testid='map-category']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role='option']//span[text()='"+categoryOption+"']")).click();
	}

	public void verifySearchShouldNotPopulate() throws InterruptedException 
	{
		Thread.sleep(2000);
		boolean noResult = driver.findElement(By.xpath("//p[text()='No businesses in this radius. Try expanding the range or a different area.']")).isDisplayed();
		Assert.assertTrue(noResult, "Even with non exit data system populating result");
	}
	
	
	
}


