/*In pages we are defining what to do, Contains page-specific locators and Selenium actions to interact with web elements.*/

package com.site.automation.pages;

import com.site.automation.base.BaseClass;
import com.site.automation.reusable.Reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseClass
{	
	private String logInButton = "(//button[text()='Sign in'])[2]";
	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}

	public void openApplication(String url) throws InterruptedException 
	{
        driver.get(url);
        Thread.sleep(2000);
    }
	
	public void verifyInfoezHomepageIsOpened() 
	{
		//Creating soft assert as a reusable method with failed message and xpath as as argument
		//As it is a resusable method for all validation we can utilize it which helps in reducing repeated codes
		Reusable.softAssert("Infoez home page is not opened", "//button[text()='Sign in']");
    }

	public void clickTheButton(String buttonName) 
	{
		driver.findElement(By.xpath("//button[text()='"+buttonName+"']")).click();
	}

	public void enterUsernameAndPassword(String username, String password) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath(logInButton)).click();
		Thread.sleep(2000);
	}

	public void verifyUserLoggedInToInfoezPage() throws InterruptedException 
	{
		Reusable.softAssert("User not logged into Infoez", "//button//span[@class='hidden sm:inline text-sm font-medium']");
		Thread.sleep(5000);
	}

	public void clickMenuInNavigationBar(String navigationMenu) 
	{
		driver.findElement(By.xpath("//a[text()='"+navigationMenu+"']")).click();
	}
	
}
