 package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/zoiapekun/Selenium/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://cnn.com");
		//driver.close();
		driver.quit();//-browser terminated

}
}