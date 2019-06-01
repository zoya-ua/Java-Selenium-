package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {
	/*
	 * TC 1: Facebook dropdown verification
Open chrome browser
Go to “https://www.facebook.com”
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth    
Quit browser
	 */

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com");
		WebElement month=driver.findElement(By.id("month"));
		Select scrolMonth=new Select(month);
		List<WebElement> allMonth=scrolMonth.getOptions();
		System.out.println(allMonth.size()-1);
		
		WebElement day=driver.findElement(By.id("day"));
		Select scrolDay=new Select(day);
		List<WebElement> allDay=scrolDay.getOptions();
		System.out.println(allMonth.size()-1);
		
		driver.quit();
}
}	
