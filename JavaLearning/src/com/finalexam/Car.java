package com.finalexam;

class Sedan{
    void body(){
	   System.out.println("Car has 4 doors");	
}
}
class Coupe extends Sedan{
	void body() {
		System.out.println("Car has 2 doors");
}
}

public class Car {

public static void main(String[] args) {
	 Sedan car1 = new Sedan();
	 Coupe car2 = new Coupe();
	 car1.body(); //runs the method in Sedan class
	 car2.body(); //runs the method in Dog class	

}
}

