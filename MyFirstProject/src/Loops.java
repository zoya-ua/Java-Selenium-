
public class Loops {

	public static void main(String[] args) {
	//whileLoop
		whileLoop();
    // dowhilelooop
		doWhileLoop();
		forLoop();	

	}
	static void whileLoop() {
		int count =10;
		while (count<10) {
			count=count +1;
			System.out.println(count);
		}	
	}
    static void doWhileLoop() {
    	int count=10;
    	do {
    		count=count+1;
    		System.out.println(count);
    	} while (count<10);	
    }
    static void forLoop() {
    	for (int counter=1; counter<=10;counter=counter+1) {
    		System.out.println(counter);
    	}
    }
}
