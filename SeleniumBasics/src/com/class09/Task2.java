package com.class09;

import com.class06.CommonMethods;

public class Task2 extends CommonMethods{
	/*
	 * C 2: Verify element is clickable1.Open chrome browser
	 * 2.Go to “https://the-internet.herokuapp.com/”
	 * 3.Click on “Click on the “Dynamic Controls” link
	 * 4.Select checkbox and click Remove
	 * 5.Click on Add button and verify “It's back!” text is displayed
	 * 6.Close the browser
	 */
public static void main(String[] args) {
	setUpDriver("chrome", "https://the-internet.herokuapp.com/");
	
	
}
}
