package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/zoiapekun/Selenium/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.saucedemo.com/");
	driver.findElement(By.xpath("//input[contains(@id,'-name')]")).sendKeys("standartUser");
	driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[contains(@class,'_action')]")).click();
	
	driver.close();
	}

}
