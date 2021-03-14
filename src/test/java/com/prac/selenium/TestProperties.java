package com.prac.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class TestProperties {
	
	public static void pmain(String[] args) throws Exception {
		
		System.out.println(System.getProperty("user.dir"));
		
		Properties config = new Properties();
		Properties or = new Properties();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		
		FileInputStream nfis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		
		config.load(fis);
		or.load(nfis);
		
		System.out.println(config.getProperty("browser"));
		System.out.println(or.getProperty("bmlBtn_CSS"));
			
	}

}
