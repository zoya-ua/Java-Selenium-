package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver","/Users/zoiapekun/Selenium/chromedriver");
	
		//WebDriver driver=new ChromeDriver();
	//	driver.get("http://google.com");
		//driver.get("https://facebook.com");
		//driver.get("https://amazon.com");
		
		System.setProperty("webdriver.gecko.driver","/Users/zoiapekun/Selenium/geckodriver");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.quit();
	}

}
