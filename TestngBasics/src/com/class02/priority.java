package com.class02;

import org.testng.annotations.Test;

public class priority {
	@Test
	public void first() {
	System.out.println("first test annotation");	
	}
    @Test(priority=1)
    public void second() {
    	System.out.println("second test annotation");
    }
    @Test (priority=2)
    public void third() {
    	System.out.println("third test annotation");
    }
    @Test (priority=3)
    public void forth() {
    	System.out.println("forth test annotation");
    }
}
