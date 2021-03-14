package com.aashu.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aashu.base.TestBase;

public class AddCustomerTest extends TestBase{

	
	@Test
	public void addCustomerTest() throws InterruptedException {
		// TODO Auto-generated constructor stub
		
		log.debug("Inside Add Cust Login");
		
		driver.findElement(By.xpath(or.getProperty("bmlBtn_xPath"))).click();
		
		driver.findElement(By.xpath(or.getProperty("addCustBtn_xPath"))).click();
		
		driver.findElement(By.xpath(or.getProperty("firstName_xPath"))).sendKeys("Aashu");
		driver.findElement(By.xpath(or.getProperty("lastName_xPath"))).sendKeys("Bhaiyya");
		driver.findElement(By.xpath(or.getProperty("postCode_xPath"))).sendKeys("A2304");
		
		driver.findElement(By.xpath(or.getProperty("toAddInSystemBtn_xPath"))).click();
		Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(or.getProperty("CustomersBtn_xPath"))).click();
		
		Assert.assertTrue(driver.findElement(By.xpath(or.getProperty("toVerifyEntryInAddCustomer_xpath"))).isDisplayed());

		Assert.fail("AddCustomerTestFailed");
		
		log.debug("Sab ho gaya");
		
		
	}

	
}
