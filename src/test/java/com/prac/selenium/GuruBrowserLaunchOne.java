package com.prac.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruBrowserLaunchOne {

	public static void dmain(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLearning\\chromedriver.exe");
		
		WebDriver chDriver = new ChromeDriver();
		
		/*
		 * String expectedTitle = "Welcome: Mercury Tours"; String actualTitle = "";
		 * 
		 * chDriver.get("http://demo.guru99.com/test/newtours/");
		 * 
		 * chDriver.manage().window().maximize();
		 * 
		 * actualTitle=chDriver.getTitle();
		 * 
		 * System.out.println("Actaul Title is:"+actualTitle);
		 * 
		 * if(actualTitle.equals(expectedTitle)) System.out.println("Passed"); else
		 * System.out.println("Failed");
		 */
		
		
		
		
		//Finding Element
		
		//chDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/a[1]")).click();
		
		//chDriver.get("http://demo.guru99.com/test/newtours/");
		//chDriver.findElement(By.linkText("Car Rentals")).click();

		
		chDriver.get("https://www.google.co.in/");
		
		chDriver.manage().window().maximize();
		
		chDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("INDIA");
				
		Thread.sleep(5000);
		chDriver.close();
		
		
		

	}

}
