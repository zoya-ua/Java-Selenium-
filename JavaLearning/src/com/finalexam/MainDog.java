package com.finalexam;

class Animal{
	  String name="Tyson"; 
	void display(){
		System.out.println(name);
	}
}
class Dog extends Animal{
	void sound(){
		System.out.println("Barks!");
	}
}
public class MainDog {
	public static void main(String[] args) {
	Dog dog =new Dog();
	dog.display();
	dog.sound();	

	}
}