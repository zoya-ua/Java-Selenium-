package com.class10;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

 class HW3 extends CommonMethods{
	/*Open chrome browser
	 * 2.Go to “https://jqueryui.com/”
	 * 3.Click on “Datepicker”
	 * 4.Select August 10 of 2019
	 * 5.Verify date “08/10/2019” has been entered succesfully
	 * 6.Close browser
	 * 
	 */
public static void main(String[] args)  {
		
String url="https://jqueryui.com/";
setUpDriver("chrome",url);
//Click on “Datepicker”
 linkTextClick("Datepicker");
 //Select August 10 of 2019
 WebElement frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
 switchToFrame(frame);
 driver.findElement(By.id("datepicker")).click();
 // checking month
 String month="";
 String expectedMonth="August";
 do {
         driver.findElement(By.cssSelector("a[title='Next']")).click();
         month = driver.findElement(By.cssSelector("span[class=\'ui-datepicker-month']")).getText();

     } while (!month.equals(expectedMonth));
 //checking  day=10    
String expectedDay="10";
List <WebElement> cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
for (WebElement cell: cells) {
	String cellText=cell.getText();
	if (cellText.equals(expectedDay)) {
		cell.click();
}
}
//Verify date “08/10/2019” has been entered sucessfully
String expectedDate="08/10/2019";
WebElement date=driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
String actualDate=date.getAttribute("value");
if(actualDate.equals(expectedDate)) {
System.out.println(actualDate+" has been entered successfully.");
}else {
	System.out.println("Wrong date");
}
	driver.close();
		
	}
}
