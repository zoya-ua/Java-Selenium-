package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	/* Syntax Page URL Verification:
		Open chrome browser
		Navigate to “https://www.syntaxtechs.com/”
		Navigate to “https://www.google.com/”
		Navigate back to Syntax Technologies Page
		Refresh current page
		Verify url contains “Syntax”
*/
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","/Users/zoiapekun/Selenium/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.syntaxtechs.com");
	    driver.navigate().to("http://google.com");
		driver.navigate().back();
		driver.navigate().refresh();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println("Varify title "+url.contains("syntaxtechs"));
		driver.quit();
}
}