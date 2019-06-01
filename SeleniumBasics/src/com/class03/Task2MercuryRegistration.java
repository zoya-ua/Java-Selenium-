package com.class03;

import org.openqa.selenium.By;
/*
 * Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info
Click Submit
User successfully registered
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2MercuryRegistration {
	/*
	 * Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info
Click Submit
User successfully registered
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("First");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Last");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("000-000-0000");
		driver.findElement(By.id("userName")).sendKeys("122@gmail.com");
		
		driver.findElement(By.id("email")).sendKeys("test123");
		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'confirm')]")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'regis')]")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
}
