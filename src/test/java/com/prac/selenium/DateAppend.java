package com.prac.selenium;

import java.util.Date;

public class DateAppend {

	public DateAppend() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args)
	{
Date d = new Date();

String screenshotName=d.toString().replace(":", "_").replace(" ", "_")+".jpg";
	
System.out.println(screenshotName);
	}

}
