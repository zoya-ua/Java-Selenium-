package com.class05;

import java.util.Iterator;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int count=0;
		int emptycount=0;
		Iterator<WebElement>it=links.iterator();
		while(it.hasNext()) {
			String linkText=it.next().getText();
			if(!linkText.isEmpty()) {
				
			System.out.println(linkText);
				count++;
			}else {
				emptycount++;
			}
		}
			System.out.println("number of links that has text = "+count);
			System.out.println("empty links = "+emptycount);
			
		driver.quit();
}
}