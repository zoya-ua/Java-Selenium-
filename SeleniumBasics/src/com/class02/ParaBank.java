package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/zoiapekun/Selenium/chromedriver");
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
	Thread.sleep(2000);
	driver.findElement(By.id("customer.firstName")).sendKeys("First");
	Thread.sleep(2000);
	driver.findElement(By.id("customer.lastName")).sendKeys("Last");;
	Thread.sleep(2000);
	driver.findElement(By.id("customer.address.street")).sendKeys("123 street");
    Thread.sleep(2000);
   driver.findElement(By.id("customer.address.city")).sendKeys("A town");
    Thread.sleep(2000);
   driver.findElement(By.id("customer.address.state")).sendKeys("Fl"); 
   Thread.sleep(2000);
   driver.findElement(By.id("customer.address.zipCode")).sendKeys("11111");
   Thread.sleep(2000);
   driver.findElement(By.id("customer.phoneNumber")).sendKeys("000-000-0000");
    Thread.sleep(2000);
   driver.findElement(By.id("customer.ssn")).sendKeys("000-00-0000");
    Thread.sleep(2000);
   driver.findElement(By.id("customer.username")).sendKeys("new_user");
    Thread.sleep(2000);
   driver.findElement(By.id("customer.password")).sendKeys("pass123");
    Thread.sleep(2000);
   driver.findElement(By.id("repeatedPassword")).sendKeys("pass123");
    Thread.sleep(2000);
   driver.findElement(By.className("button")).click();

	
	}

}
