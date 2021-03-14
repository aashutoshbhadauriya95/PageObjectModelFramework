package com.prac.selenium;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch {

	public static void smain(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLearning\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div:nth-of-type(1) > .btn.btn-lg.btn-primary")).click();
		Thread.sleep(2000);
		String name=driver.findElement(By.cssSelector("label")).getText();
		assertEquals(name, "Your Name :");
		
		Select dropDownVal = new Select(driver.findElement(By.cssSelector("[ng-model='custId']")));
		dropDownVal.selectByValue("Harry Potter");
		
		Thread.sleep(2000);
		driver.close();
	}

}
