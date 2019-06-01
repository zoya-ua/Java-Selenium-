package com.class08;

import org.openqa.selenium.By;
/*
 * Task for doubleClick
Navigate to https://www.saucedemo.com
senkeys  to the password textbox
double click on the password text
 Close the browser 
 */
import org.openqa.selenium.interactions.Actions;

import com.class06.CommonMethods;

public class DoubleClick2 extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
	setUpDriver("chrome", "https://www.saucedemo.com");
   driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");;
    Actions action = new Actions(driver);
    Thread.sleep(2000);
    action.doubleClick(driver.findElement(By.cssSelector("#password"))).perform();
    
    Thread.sleep(4000);
    driver.quit();
		
	}
	

}
