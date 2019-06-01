package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathdemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/zoiapekun/Selenium/geckodriver");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@class='btn_action']")).click();
	Thread.sleep(2000);
	driver.close();
	}

}
