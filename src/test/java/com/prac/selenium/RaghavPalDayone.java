package com.prac.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RaghavPalDayone {

	public static void rmain(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		googleSearch();
		

	}
	
	public static void googleSearch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLearning\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("abcd");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(Keys.RETURN);
		
		Thread.sleep(2000);
		driver.close();
	}

}
