package com.aashu.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aashu.base.TestBase;

public class BankManagerLoginTest extends TestBase{

	public BankManagerLoginTest() {
		
		
	}
	
	@Test
	public void loginAsBankManager() throws InterruptedException
	{
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		log.debug("Inside Login Test");
		//driver.findElement(By.cssSelector(or.getProperty("bmlBtn_CSS"))).click();
		driver.findElement(By.xpath(or.getProperty("bmlBtn_xPath"))).click();
		//Assert.assertTrue(isElementPresent(driver.findElement(By.cssSelector(or.getProperty("acBtn_CSS")))),"Login Not successful !!!");
		Assert.assertTrue(isElementPresent(By.cssSelector(or.getProperty("acBtn_CSS"))),"Login Not successful !!!");
		
		//Thread.sleep(5000);
		
		log.debug("Login Successsfully Executed");
		
		Assert.fail("BankManagerLoginFailed");
		}

	

}
