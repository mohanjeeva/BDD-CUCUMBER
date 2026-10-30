/*In pages we are defining what to do, Contains page-specific locators and Selenium actions to interact with web elements.*/

package com.site.automation.pages;

import com.site.automation.base.BaseClass;
import com.site.automation.reusable.Reusable;

import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BaseClass
{	
	private String logInButton = "(//button[text()='Sign in'])[2]";
	String profileName = "Kumar";
	
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

	public static void clickTheButton(String buttonName) 
	{
		driver.findElement(By.xpath("//*[text()='"+buttonName+"']")).click();
	}

	public void enterUsernameAndPassword(String username, String password) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath(logInButton)).click();
		Thread.sleep(5000);
	}

	public void verifyUserLoggedInToInfoezPage() throws InterruptedException 
	{
		Reusable.softAssert("User not logged into Infoez", "//button//span[@class='hidden sm:inline text-sm font-medium']");
		Thread.sleep(2000);
	}

	public void clickMenuInNavigationBar(String navigationMenu) 
	{
		driver.findElement(By.xpath("//a[text()='"+navigationMenu+"']")).click();
	}

	public void clickOptionUnderUserProfile(String profileOptions) throws InterruptedException 
	{
		Thread.sleep(5000);
		//driver.findElement(By.id("radix-:r3:")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("radix-:r3:"))).click();
		driver.findElement(By.xpath("//div[text()='"+profileOptions+"']")).click();
		Thread.sleep(2000);
	}

	public void updateUserDetails() 
	{
		driver.findElement(By.xpath("//label[text()='Name']//following-sibling::input")).clear();
		driver.findElement(By.xpath("//label[text()='Name']//following-sibling::input")).sendKeys(profileName);
		driver.findElement(By.xpath("//button[text()='Save changes']")).click();
	}

	public void verifyUpdatedValueInUserProfile() throws InterruptedException 
	{
		Thread.sleep(3000);
		String actualName = driver.findElement(By.xpath("//span[@class='hidden sm:inline text-sm font-medium']")).getText();
		Assert.assertEquals(actualName, profileName, "Value Not matched");
		
		/*CHanging back to the original value*/
		driver.findElement(By.xpath("//label[text()='Name']//following-sibling::input")).clear();
		driver.findElement(By.xpath("//label[text()='Name']//following-sibling::input")).sendKeys("Ravi");
		driver.findElement(By.xpath("//button[text()='Save changes']")).click();
		Thread.sleep(5000);
	}
	
}
