package com.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/zoiapekun/Selenium/chromedriver");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[starts-with(@id,'em')]")).sendKeys("W@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("45590000");
	driver.findElement(By.xpath("//input[contains(@value,'Log')]")).click();
	
	}

}
