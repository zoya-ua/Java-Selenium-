package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
	/*
	 * TC 1: Amazon Page Title Verification:
Open Chrome browser
Go to “https://www.amazon.com/”
Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, 
Computers, Books, DVDs & more” is displayed
	 */
	public static void main(String[] args) {
		
/*System.setProperty("webdriver.chrome.driver","/Users/zoiapekun/Selenium/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.Amazon.com");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		System.out.println("Varify title "+title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));
		driver.quit();
		*/
		
	System.setProperty("webdriver.gecko.driver","/Users/zoiapekun/Selenium/geckodriver");	
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.Amazon.com");
	System.out.println(driver.getTitle());
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("Correct title");
		} else {
			
			System.out.println("Wrong title");
		}
		driver.quit();
	}

}
