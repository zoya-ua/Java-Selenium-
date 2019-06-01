package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;
/* 1: Swag Lab Title and Login Verification

@BeforeMethod should contain navigation to the URL and title verification

@Test should contain steps to login and “Product” word verification

@AfterMethod should logOut from the application and close the browser
 * 
 */

public class task1 extends CommonMethods {
@BeforeMethod
    
    public void setUp() {
        String url="https://www.saucedemo.com/";
        CommonMethods.setUpDriver("chrome", url);
    }
@Test
    
    public void logIn() {
        CommonMethods.sendText(driver.findElement(By.cssSelector("input#user-name")),"standard_user");
        CommonMethods.sendText(driver.findElement(By.cssSelector("input#password")),"secret_sauce");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        String text=driver.findElement(By.xpath("//div[@class='product_label']")).getText();
        if(text.equals("Products")) {
            System.out.println("Product");
        }else {
            System.out.println("No Label");
        }
        
    }
    
    @AfterMethod
    public void Close() {
        
        driver.findElement(By.xpath("//button[text()='Open Menu']")).click();;
       // WebDriverWait wait=new WebDriverWait(driver,30);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#logout_sidebar_link")));
        driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
        driver.close();
    }

}
