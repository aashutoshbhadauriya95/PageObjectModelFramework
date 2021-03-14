package com.prac.selenium;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Account {

	@Test
	public void account() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLearning\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div:nth-of-type(2) > .btn.btn-lg.btn-primary")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[ng-click='addCust\\(\\)']")).click();
		driver.findElement(By.xpath("//form[@role='form']//div[1]//input[@type='text']")).click();
		driver.findElement(By.xpath("//form[@role='form']//div[1]//input[@type='text']")).sendKeys("Aashu");
		Thread.sleep(2000);
		driver.close();
	}

}
