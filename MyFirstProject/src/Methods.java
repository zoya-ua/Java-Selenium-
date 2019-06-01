
public class Methods {

	public static void main(String[] args) {
    sayHelloWorld();
    sayHelloTo("Zoia");
    int x = returnFive();
    System.out.println(x);
    
    int result = square (returnFive());
    System.out.println(result);


	}
	
	// this method returns a value and takes in data
	
	static int square( int x) {
		return  x*x;
	}
	
	// this method returns an int type with value 5
	
	static int returnFive() {
		return 5;
	}
	
	// this method will say hello to whatever name is passed when called
	
	static void sayHelloWorld() {
		System.out.println("Hello, World!");
		
	}
	static void sayHelloTo(String name) {
		System.out.println("Hello, " + name);
	}

}
