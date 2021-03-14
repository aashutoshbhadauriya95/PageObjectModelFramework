package com.aashu.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aashu.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBase {

	/*
	 * This Base is class is used for initiaizing WebDriver PRoperties logs
	 * ExtentReports DB Excel MAil
	 */

	public static WebDriver driver;

	public static Properties config = new Properties();
	public static Properties or = new Properties();
	public static FileInputStream fis;
	
	public ExtentReports rep= ExtentManager.getInstance();
	public static ExtentTest test;

	public static Logger log = Logger.getLogger("devpinoyLogger");

	@BeforeMethod
	public void setUp() {
		if (driver == null) {
			FileInputStream fis;
			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");

				try {
					config.load(fis);
					log.debug("Config Properties Loaded");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			FileInputStream nfis;
			try {
				nfis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
				try {
					or.load(nfis);
					log.debug("OR Properties Loaded");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (config.getProperty("browser").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");

				driver = new ChromeDriver();
				log.debug("Chrome Launched !!");
			}

			driver.get(config.getProperty("testsiteurl"));
			log.debug("Test Site Launched !!");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
					TimeUnit.SECONDS);

		}
	}

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);

			return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver = null;

		log.debug("Test Execution completed");
	}
}
