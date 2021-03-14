package com.prac.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruPopUpOne {

	public static void vmain(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLearning\\chromedriver.exe");
		
		WebDriver chDriver= new ChromeDriver();
		
		chDriver.get( "http://jsbin.com/usidix/1");
		
		chDriver.findElement(By.xpath("/html[1]/body[1]/input[1]")).click();
		
		
		
		//chDriver.findElement(By.xpath("/html[1]/body[1]")).click();
		
		String alertMessage=chDriver.switchTo().alert().getText();
		
		chDriver.switchTo().alert().accept();
		
		Thread.sleep(1500);
		
		System.out.println("Pop Up clicked"+alertMessage);
		chDriver.close();
		
		
	}

}
