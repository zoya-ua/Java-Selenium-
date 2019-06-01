package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTaskXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/zoiapekun/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("User");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("New");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("911");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("test123@gmaqil.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123 address");
		Thread.sleep(2000);
		driver.findElement(By.id("//input[@name='city']")).sendKeys("123 address");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("Ashburn");
		Thread.sleep(2000);
		driver.findElement(By.name("state")).sendKeys("VA");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode")).sendKeys("00000");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.name("confirmPassword")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.name("register")).click();
		Thread.sleep(2000);
		driver.close();
	}
	

}
