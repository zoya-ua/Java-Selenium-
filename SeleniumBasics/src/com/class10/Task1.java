package com.class10;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.class06.CommonMethods;

public class Task1 extends CommonMethods{
	/*
	 * Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Sortable Data Tables” link
Verify tables consist of 4 rows and 6 columns
Print name of all column headers
Print data of all rows
	 */
	public static void main(String[] args) throws InterruptedException {
	setUpDriver("chrome","https://the-internet.herokuapp.com/");
	driver.findElement(By.linkText("Sortable Data Tables")).click();
	List <WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
	System.out.println("Table consist of  ="+rows.size()+" rows");
	List<WebElement> cols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
	System.out.println("Table consist of  ="+cols.size()+" colums");
	System.out.println("-----------ROW DATA-----------------");
	Iterator<WebElement> it=rows.iterator();
	while(it.hasNext()) {
		String rowText=it.next().getText();
		System.out.println(rowText);
	}
		System.out.println("-----------COLUMNS HEADERS-----------------");
		for (WebElement col: cols) {
			String colText=col.getText();
			System.out.println(colText);
		}
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
