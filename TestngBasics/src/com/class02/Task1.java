package com.class02;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Task1 extends CommonMethods{
	@BeforeClass
	public void setUp() {
		setUpDriver("chrome","https://opensource-demo.orangehrmlive.com/");
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("OrangeHRM")) {
			System.out.println("Correct title");
		}else {
			System.out.println("Wrong title");
		}
	}
@Test
public void test() {
	findByCssAndSendKeys("input[name*='Usern']","Admin");
	findByCssAndSendKeys("input[name*='txtP']","admin123");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
}

@AfterMethod
public static void logout(){
	driver.close();
}
}
