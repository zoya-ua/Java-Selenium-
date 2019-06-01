package com.homework;

class Dog{
	String name, breed;
	double age;
	Dog(String n, String b, double a){
		name  = n;
		breed = b;
		age = a;
		System.out.println("This dog's name: " +n+ ", bread: "+ b+ ", age: "+a+"years");
	}
	Dog(String n, String b){
		name=n;
		breed = b;
		System.out.println("This dog's name: " +n+ " ,bread: "+b);
	}
	Dog(){
	System.out.println("Information about this dog is missing");
	
	}
}

public class MainDog {

	public static void main(String[] args) {
		Dog t = new Dog("Tyson", "boxer", 4.6);
		Dog l = new Dog("Lucy", "beagle");
		Dog u =new Dog();		

	
	}

}	

