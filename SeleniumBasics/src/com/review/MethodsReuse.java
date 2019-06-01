package com.review;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MethodsReuse {
	public static WebDriver driver;
	
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}	
	
	
	public static void browserSetUp(String browser,String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/zoiapekun/Selenium/chromedriver/");
		driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/zoiapekun/Selenium/geckodriver/");
			driver=new FirefoxDriver();	
		}
		driver.get(url);
	}
	
	public static void selectByValue(WebElement element,String value) {
		Select select=new Select(element);
		List<WebElement> list=select.getOptions();
		for(WebElement ele:list) {
			System.out.println(ele.getText());
		if(value.equalsIgnoreCase("value"))	{
			select.selectByValue(value);
		}
		}
	}
	
	
public static void selectbyIndex(WebElement element,int index) {
	Select select=new Select(element);
	List<WebElement> options=select.getOptions();
	if(options.size()>index) {
		select.selectByIndex(index);
	}else {
		System.out.println("Invalid index has been passed");
	}
}
}
