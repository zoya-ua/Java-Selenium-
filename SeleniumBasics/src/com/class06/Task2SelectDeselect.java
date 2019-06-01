package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2SelectDeselect {
	/*
	 * Select and Deselect values
Open chrome browser
Go to “http://uitestpractice.com/”
Click on “Select” tab
Verify how many options available in the first drop down and then select “United states of America”
Verify how many options available in the second drop down and then select all.
Deselect China from the second drop down
Quit browser (edited) 
	 */
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "//zoiapekun/Selenium/chromedriver/");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().fullscreen();
	driver.get("http://uitestpractice.com/");
	//Clicking on “Select” tab
	driver.findElement(By.xpath("//a[text()='Select']")).click();//(By.linkText("Select")
	
	//Verify how many options available in the Single DD
	WebElement countriesDD= driver.findElement(By.id("countriesSingle"));
	Select select=new Select(countriesDD);
	int ddSize=select.getOptions().size();
	System.out.println(ddSize);
	select.selectByVisibleText("United states of America");
	//Verify how many options available in the Multiple DD
	WebElement multCountriesDD=driver.findElement(By.cssSelector("select#countriesMultiple"));
    select=new Select(multCountriesDD);
    ddSize=select.getOptions().size();
    System.out.println(ddSize);
    //check if we can select multiple options
    if(select.isMultiple()) {
    	for(int i=0;i<ddSize;i++) {
    		select.selectByIndex(i);
    		Thread.sleep(1000);
    	}
    }
   
	
	Thread.sleep(5000);
	driver.quit();
	
}
}
