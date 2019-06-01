package com.class10;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class HW2 extends CommonMethods{
	/*1.Open browser and go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
	 *2.Login to the application
	 *3.Create an Order
	 *4.Verify order of that person is displayed in the table “List of All Orders”
	 *5.Click on edit of that specific order
	 *6.Verify each order details 
	 *7.Update street address
	 *8.Verify in the table that street has been updated
	 *9.Close browser
	 * 
	 */
	public static void main(String[] args)  {
	String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";	
	setUpDriver("chrome",url);
	//Login in
	findByCssAndSendKeys("input[id*='_user']","Tester");
	findByCssAndSendKeys("input[id*='_pass']","test");
	//clicking on Login
	driver.findElement(By.cssSelector("input[id*='_butt']")).click();
	//creating an Order
	driver.findElement(By.linkText("Order")).click();	
	WebElement product=driver.findElement(By.cssSelector("select[id*='dd']"));
	selectValueFromDD(product, "ScreenSaver");
	findByCssAndSendKeys("input[id*='txtQ']", "3");
	findByCssAndSendKeys("input[id*='txtUnit']", "20");
	findByCssAndSendKeys("input[id*='txtDis']", "60");
	
	//clicking on Calculate button
	clickByXpath("//input[@value='Calculate']");
	
	//Filling in address info
	findByCssAndSendKeys("input[id*='txtNa']", "Ann Dee");
	findByCssAndSendKeys("input[id$='TextBox2']", "10th St NE");
	findByCssAndSendKeys("input[id$='TextBox3']", "Atlanta");
	findByCssAndSendKeys("input[id$='TextBox4']", "Georgia");
	findByCssAndSendKeys("input[id$='TextBox5']", "30309");
	
	// Filling in payment info
	checkButtonByXpath("//table[@id='ctl00_MainContent_fmwOrder_cardList']/tbody/tr/td", "MasterCard");
	findByCssAndSendKeys("input[id$='TextBox6']", "56789909876");
	findByCssAndSendKeys("input[id$='TextBox1']", "06/22");
	
   clickByXpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']");
	 
  // viewing List of All Orders
	 linkTextClick("View all orders");	
	 //checking new order is displayed at List of Orders
	List<WebElement> rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
	String newOrder="Ann Lee";
	for (WebElement r: rows) {
		if (r.getText().contains(newOrder)){
		System.out.println("Order've been placed sucsesfully");	
		break;
		}
	}
	//Click on edit specific order
	clickByXpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[13]");
	//Verify each order details 
	
	verifyElementValueByCss("input[id*='txtQ']","3");
	verifyElementValueByCss("input[id*='txtUnit']", "20");
	verifyElementValueByCss("input[id*='txtDis']", "60");
	verifyElementValueByCss("input[id*='txtNa']", "Ann Dee");
	verifyElementValueByCss("input[id$='TextBox2']", "10th St NE");
	verifyElementValueByCss("input[id$='TextBox3']", "Atlanta");
	verifyElementValueByCss("input[id$='TextBox4']", "Georgia");
	verifyElementValueByCss("input[id$='TextBox5']", "30309");
	//checking element from DD menu
	String expectedCard2 = "MasterCard";
	List<WebElement> cells5 = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_fmwOrder_cardList']/tbody/tr/td"));
	for (WebElement cell : cells5) {
		WebElement input = cell.findElement(By.xpath("input"));
		if (input.isSelected()) {
			String cellT = input.getAttribute("value");
			if (cellT.equals(expectedCard2)) {
				System.out.println(cellT);
			}
		}
	}
	verifyElementValueByCss("input[id$='TextBox6']", "56789909876");
	verifyElementValueByCss("input[id$='TextBox1']", "06/22");
	//Update street address
	findByCssAndSendKeys("input[id$='TextBox2']", "Updated St NE");
	
	clickByXpath("//a[@id='ctl00_MainContent_fmwOrder_UpdateButton']");
	
	//Verifying that street has been updated
	
	String newAddress="Updated St NE";
	List<WebElement> coloms = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td"));
	for (WebElement cell : coloms) {
		String cellText = cell.getText();
		if (cellText.equalsIgnoreCase(newAddress)) {
			System.out.println("Address has been updated");
			break;
		}
	}

	
    driver.quit();
}
}