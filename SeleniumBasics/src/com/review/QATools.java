package com.review;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QATools {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/zoiapekun/Selenium/chromedriver/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		List<WebElement> list=driver.findElements(By.cssSelector("input[id^='sex']"));
		
		for(WebElement s:list) {
			s.click();
			Thread.sleep(1000);
			
		}
		
		
		
		List<WebElement> list2=driver.findElements(By.cssSelector("input[id^='exp-']"));
		for(WebElement ele:list) {
			if(ele.isEnabled()) {
			ele.click();
			Thread.sleep(1000);
			
			}
		}
	
		//2nd way xpath and Iterator
		
		 List<WebElement> list3 = driver.findElements(By.xpath("//input[@name='exp']"));
	        Iterator<WebElement> radios = list3.iterator();
	        while (radios.hasNext()) {
	            radios.next().click();
	            Thread.sleep(1000);
	            
	        }
	        List<WebElement> list4=driver.findElements(By.cssSelector("input[id^='prof']"));
Iterator<WebElement> prof=list4.iterator();	
while(prof.hasNext()) {
	prof.next().click();
	Thread.sleep(1000);
	
}
	        
	        driver.close();
		}
	}


