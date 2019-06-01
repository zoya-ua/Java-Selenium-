package com.finalexam;

public class Overloading {
	public void add(int x, int y) {
	int a=x+y;
	System.out.println("Sum of two integers =" +a);
	}
	public void add(double x, double y) {
		double a=x+y;
		System.out.println("Sum of two doubles= "+a);
	}
	public static void main(String args[]) {
		Overloading obj = new Overloading();
		obj.add(3,6);
		obj.add(2.4, 3.7);	
	}

    }
