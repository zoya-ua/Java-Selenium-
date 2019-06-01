package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.class06.CommonMethods;

public class DropDownTest extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
String browser="chrome";
		String url="https://www.toolsqa.com/automation-practice-form/";

		setUpDriver("chrome", url);
		WebElement contriesDD = driver.findElement(By.cssSelector("select#continents"));

		selectValueFromDD(contriesDD, "Australia");

		Thread.sleep(7000);
		driver.quit();
	}
}
