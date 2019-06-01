
public class ClassesAndObjects {

	public static void main(String[] args) {
		Person john = new Person("John");
		john.setAge(20);
		Person bob = new Person("Bob");
		bob.setAge(25);
		
		john.sayHelloTo(bob);

		System.out.println(john.getName()+" is "+john.age+"years old");
		System.out.println(bob.getName()+" is "+bob.age+"years old");
	}

}
