package com.assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhanding {

	public static void main(String[] args) {
		int num1,num2, num3;
	
		try {
			System.out.println("Enter two integers");
			Scanner in = new Scanner( System.in);
			num1= in.nextInt();
			num2=in.nextInt();
			num3=num1/num2;
			System.out.println(num3);
		}
		
		catch(InputMismatchException e) {
		    System.out.println("Warning:input is not integer");
		}
		catch (ArithmeticException e) {
	        System.out.println("Warning: number cant be devided by 0");		
		}
}
}