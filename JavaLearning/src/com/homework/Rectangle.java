package com.homework;


interface Shape{
	static double area(double w, double h) {return w*h;};
	static double perimeter(double w, double h) {return 2*w+2*h;}
}
class Rectangle implements   Shape{
	public static void main(String[] args) {
		
	System.out.println("Area = "+Shape.area(4.5,5));
	System.out.println("Perimeter=" +Shape.perimeter(4.5,5));	

	}



}

