import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objrct {

	public static void main(String[] args) {
		
		//creates My window
		JFrame window =new JFrame(); //  window variable that holds JFrame objects, and we are creating a new JFrame to assign to our variable
		window.setTitle("My window");// we are calling methods on our JFrame object to configure it
		window.setSize (800,600);
		window.setVisible(true);
		
		JLabel label = new JLabel();//label variable holds JLabel object, and we are creating a new JLabel to assign to our variable
		label.setText("My Label"); 
				window.add(label);
			
				

	}

}
