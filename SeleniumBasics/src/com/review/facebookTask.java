package com.review;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/zoiapekun/Selenium/chromedriver/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name^='first']")).sendKeys("User");
		driver.findElement(By.cssSelector("input[name^='last']")).sendKeys("New");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("240-000-0000");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123");
	WebElement monthDD=driver.findElement(By.xpath("//select[@id='month']"));
	Select select=new Select(monthDD);
	select.selectByIndex(6);
	WebElement dayDD=driver.findElement(By.cssSelector("select#day"));
	Select select2=new Select(dayDD);
	select2.selectByIndex(20);
	WebElement yearDD=driver.findElement(By.cssSelector("select[name='birthday_year']"));
	Select select3=new Select(yearDD);
	select3.selectByIndex(30);	
	String selects="emale";
	
   driver.findElement(By.xpath("//label[text()='Female']")).click();	
	
	}
	}

