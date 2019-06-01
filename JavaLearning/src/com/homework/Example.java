package com.homework;

public class Example {
	public static void main(String[]args){
		System.out.println("Initialization program...");
		try {
		int a=34;
		int b=0;
		int c=a/b;
		System.out.println("Quotient is ="+c);
		}
		catch(ArithmeticException e) {
		
		System.out.println("Terminating program....");
		}
	}

}
