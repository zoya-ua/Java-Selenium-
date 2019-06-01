package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class HW1 extends CommonMethods {
	/*
	 * 1.Open chrome browser
	 * 2.Go to “http://uitestpractice.com/”
	 * 3.Click on “Forms” link
	 * 4.Fill out the entire form
	 * 5.Close the browser
	 */
public static void main(String[] args) {
//Open “http://uitestpractice.com/” with chrome
String url="http://uitestpractice.com/";
setUpDriver("chrome",url);
//Click on “Forms” link
clickByXpath("//a[text()='Form']");

//first name, last name
findByCssAndSendKeys("#firstname","First");
findByCssAndSendKeys("#lastname","Last");
//checking radio button
checkButtonByXpath( "//label[@class='radio-inline']", "Single");
//checking checkbox
checkButtonByXpath( "//label[@class='checkbox-inline']", "Reading");
checkButtonByXpath( "//label[@class='checkbox-inline']", "Dancing");

//select country from DropDown box
WebElement countriesDD=driver.findElement(By.cssSelector("#sel1"));
selectValueFromDD(countriesDD, "Canada");

//selecting date on a calendar
WebElement calendar=driver.findElement(By.id("datepicker"));
rightClick(calendar);
//month
WebElement monthDD=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
selectValueFromDD(monthDD, "Mar");
//year
WebElement yearDD=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
selectValueFromDD(yearDD, "2010");
//date
linkTextClick("15");
//phone,username,email,aboutYourself,password fields
findByCssAndSendKeys("#phonenumber","240-000-0000");
findByCssAndSendKeys("#username","NewUser");
findByCssAndSendKeys("#email","new@gmail,com");
findByCssAndSendKeys("#comment","I took me forever to complete this task");
findByCssAndSendKeys("#pwd","123pass");

driver.close();
}

}
