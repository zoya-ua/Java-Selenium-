package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2SwagLabsNagativeLogin {
	/*
	 * Swag Labs Negative login:
Open chrome browser
Go to “https://www.saucedemo.com/”
Enter invalid username and password and click login
Verify error message contains: “Username and password do not match any user in this service”
	 */
public static void main(String args[]) {
	

System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/");
driver.manage().window().fullscreen();
driver.findElement(By.id("user-name")).sendKeys("User");
driver.findElement(By.cssSelector("input#password")).sendKeys("pass");
driver.findElement(By.xpath("//input[@type='submit']")).click();

WebElement error=driver.findElement(By.xpath("//h3[@data-test='error']"));
//System.out.println(error.isDisplayed());
String massage=error.getText();
String expectedmassege="Username and password do not match any user in this service";

if (massage.contains(expectedmassege)) {
	System.out.println("error message contains: “Username and password do not match any user in this service");
}else {
	System.out.println("Fail");
}

driver.quit();

}
}