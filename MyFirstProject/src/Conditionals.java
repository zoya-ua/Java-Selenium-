
public class Conditionals {

	public static void main(String[] args) {
		//if (some expression that evaluate to true do something
		
		boolean sayHello = false;
		
		
		
		
		if (sayHello) {
		System.out.println("Hello");
		} else {
			
		System.out.println("Goodbye");
		}
		
		// > , < , >= , != , ==
		// if (x==5) test wheter x has the value 5(it is either be true or false)
		//&& AND, || OR

int playerX = 50;
if (true && false) {
	System.out.println("AND executed");
	
}
//if our player is past left side of screen, or if our player is past the right side of the screen
if (playerX<0||playerX>800) {
	//some code that reverses our players diraction
	System.out.println("OR executed");
}

}
}