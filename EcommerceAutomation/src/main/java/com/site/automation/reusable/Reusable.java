/*Reusable class is to reuse the repeated codes like validations, logical implementations, etc*/
package com.site.automation.reusable;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.site.automation.base.BaseClass;

public class Reusable extends BaseClass
{	
	public Reusable(WebDriver driver) 
	{
		super(driver);
	}

	public static void softAssert(String falseMessage, String xpath)
	{
		SoftAssert softAssert = new SoftAssert();
		WebElement verificationElement = driver.findElement(By.xpath(xpath));

		Assert.assertTrue(falseMessage,verificationElement.isDisplayed() || verificationElement.isEnabled());
		
		//softAssert.assertAll();
	}
}
