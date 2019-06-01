package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1Amazon {
	/*
	 * TC 1: Amazon Department List Verification
Open chrome browser
Go to “http://amazon.com/”
Verify how many department options available.
Print each department
Select Computers
Quit browser
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/zoiapekun/Selenium/chromedriver/");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://amazon.com/");
		WebElement departmentsDD=driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select select = new Select(departmentsDD);
		List<WebElement> allDepartments=select.getOptions();
		System.out.println(allDepartments.size()+" department options available.");
		System.out.println("Print each department");
		for(WebElement department:allDepartments) {
			String option=department.getText();
			System.out.println(option);
		}
		//Selecting  Computers
		select.selectByVisibleText("Computers");
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
