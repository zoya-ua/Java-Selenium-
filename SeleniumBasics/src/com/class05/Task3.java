package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	/*
	 *  Check all Years of Experience radio buttons are clickable
	 *  Check all Automation Tools checkboxes are clickable
	 *  and keep “Selenium WebDriver” option as selected
	 */	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		List <WebElement> experience=driver.findElements(By.name("exp"));
		//byxpath("//input[@name='exp']")
		for (WebElement years:experience) {
			if(years.isEnabled()) {
				years.click();
				String value=years.getAttribute("value");
				Thread.sleep(1000);
				System.out.println("radio button "+value+ " works");
			}
		}
		Thread.sleep(1000);
		List <WebElement> tools = driver.findElements(By.name("tool"));
		for (WebElement auto:tools) {
			if(auto.isEnabled()) {
				auto.click();
				String value2=auto.getAttribute("value");	
				System.out.println("radio button "+value2+ " works");
				Thread.sleep(1000);
				if (!value2.equals("Selenium Webdriver")) {
					auto.click();
					Thread.sleep(1000);
			}
			}
		}
driver.quit();
}
}