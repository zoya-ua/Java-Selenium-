package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.class06.CommonMethods;

public class Homework extends CommonMethods {

	/*
	 * Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Multiple Windows” link
Click on “Elemental Selenium”
Verify title of second window is “Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro”
Close second window
Click on “Click Here” link
Verify title if newly open window is “New Window”
Close second window
Verify title of second window is “The Internet”
Quit browser
NOTE: Selenium execution could be too fast, please use Thread.sleep
	 */
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		Thread.sleep(2000);
		String parentId=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		Set<String>handle=driver.getWindowHandles();
	    System.out.println(handle.size());	
	Iterator<String> it=handle.iterator();
	while (it.hasNext()) {
		String childOne=it.next();
		driver.switchTo().window(childOne);
		if(!childOneId.equals(parntId)) {
			driver.switchTo().window(childOneId);
			
		}
	}
		
		Thread.sleep(2000);
		driver.close();
	}
}
