package com.finalexam;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enter an integer:");
		Scanner in = new Scanner(System.in);
		int num =in.nextInt();
		for ( int i=1;i<=num;i++) {
			if (num%i==0) { count++;
	    }
		}
		
			if (count==2 || num==2) {
				System.out.println(num+ " PRIME ");
	    }   else {
	    	System.out.println(num+" NOT PRIME");
	    }
	    }		
        }


