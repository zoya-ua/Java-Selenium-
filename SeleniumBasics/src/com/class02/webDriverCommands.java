package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommands {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/zoiapekun/Selenium/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("google")) {
			System.out.println("this is the right title");
		}
		else {
			System.out.println("sorry this not the title");
		}
		System.out.println("--------------------");
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		String title2=driver.getTitle();
		if(title2.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
			System.out.println("this is the right title");
		}
		else {
			System.out.println("sorry this not the title");
		}
		driver.close();
	}

}
