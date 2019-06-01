package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1Facebook {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "/Users/zoiapekun/Selenium/chromedriver");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","/Users/zoiapekun/Selenium/geckodriver");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("zoyapen@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("pass")).sendKeys("Ruslan2010)");
	    Thread.sleep(2000);
	    driver.findElement(By.id("loginbutton")).click();
	    Thread.sleep(2000);
		driver.quit();
	}

}
