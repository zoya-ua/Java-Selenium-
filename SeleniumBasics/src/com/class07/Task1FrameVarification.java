package com.class07;

import org.openqa.selenium.By;

import com.class06.CommonMethods;
//task
//Click on “Blogs” link inside first frame
//Verify element “Interactions” is present in second frame
//Navigate to Home Page

public class Task1FrameVarification extends CommonMethods{
public static void main(String[] args) throws InterruptedException {
	
	CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
	driver.switchTo().frame("IF1");
	driver.findElement(By.xpath("//a[text()='Git Log']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	boolean inter = driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed();
	if(inter==true) {
		System.out.println(inter);
		driver.switchTo().defaultContent();
		driver.close();
	}
	

}
}
