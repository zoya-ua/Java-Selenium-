package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.class06.CommonMethods;

public class iframe extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "http://www.uitestpractice.com/Students/Switchto");
	
		//driver.switchTo().frame("iframe_a");    //one way
		
		   
		WebElement element=driver.findElement(By.xpath("//iframe[@name='iframe_a']")); //second way element
		  driver.switchTo().frame(element);
		  
		// driver.switchTo().frame(0); //-Way 3 index
		
		driver.findElement(By.cssSelector("input#name")).sendKeys("Zoia");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.close();
	}

}

