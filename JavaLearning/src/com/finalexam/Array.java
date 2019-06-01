package com.finalexam;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int s = sc.nextInt();//array length
		int myArray[] = new int[s];
		System.out.println("Array contains: ");
		for (int i=0;i<s;i++) {
			myArray[i]=sc.nextInt();		
		}
		
System.out.println(Arrays.toString(myArray));
System.out.println("First element: "+ myArray[0]);
System.out.println("Last element: "+ myArray[s-1]);

	}

}