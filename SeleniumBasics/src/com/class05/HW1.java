package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
	/*
TC 1: Tools QA check all elements
Open chrome browser
Go to “https://www.toolsqa.com/automation-practice-form/”
Fill out:
First Name
Last Name

Check all Years of Experience radio buttons are clickable
Date
Select both checkboxes for profession
Check all Automation Tools checkboxes are clickable and keep “Selenium WebDriver” option as selected
Quit browser
	 */
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		
		String url="https://www.toolsqa.com/automation-practice-form/";
		//Fill out:First Name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("User");
		Thread.sleep(2000);
		////Fill out:Last Name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("New");
		//
		List <WebElement> sexRadioBattn=driver.findElements(By.name("sex"));
		String sexValueToSelect="Male";
		for (WebElement mF:sexRadioBattn) {
			String sexValue=mF.getAttribute("value");
			System.out.println("Is "+sexValue+" enabled - "+mF.isEnabled());
			if (sexValue.equals(sexValueToSelect)){
				mF.click();
			}	
		}
		Thread.sleep(2000);
		//Check all Years of Experience radio buttons are clickable
		List <WebElement> experience=driver.findElements(By.xpath("//input[@name='exp']"));
		for (WebElement years:experience) {
			if(years.isEnabled()) {
				years.click();
				String value=years.getAttribute("value");
				Thread.sleep(1000);
				System.out.println("radio button "+value+ " works");
			}
		}
		////Fill out:Date
		driver.findElement(By.cssSelector("input[id$='picker']")).sendKeys("05.19.2019");
		Thread.sleep(2000);
		//Select both checkboxes for profession
		List<WebElement> profList=driver.findElements(By.name("profession"));    // By.xpath("//label[@for='profession']"));
		for(WebElement prof:profList) {
			prof.click();
		}
		Thread.sleep(2000);
		//Check all Automation Tools checkboxes are clickable and keep “Selenium WebDriver” option as selected
		List <WebElement> tools = driver.findElements(By.name("tool"));
		for (WebElement auto:tools) {
			if(auto.isEnabled()) {
				auto.click();
				String value2=auto.getAttribute("value");	
				System.out.println("radio button "+value2+ " works");
				Thread.sleep(1000);
				
			}
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
