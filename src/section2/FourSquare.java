package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	 
			
	
	// 2. Create a new Robot
	Robot  e = new Robot();
	
	
	
			

	void go() {
		// 4. Make the robot move as fast as possible
	e.penDown();
	e.setPenWidth(5);
	e.setSpeed(900);
	e.move(250);
	e.turn(90);
	e.move(250);
	e.turn(90);
	e.move(250);
	e.turn(90);
	e.move(250);
	e.turn(90);
	e.move(125);
	e.turn(90);
	e.move(250);
	e.turn(90);
	e.move(125);
	e.turn(90);
	e.move(125);
	e.turn(90);
	e.move(250);
		

		// 5. Set the pen width to 5

		// 6. Use a for loop to repeat steps #7 to #8, four times...
	
	}
			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	
			// 8. Turn the robot 90 degrees to the right

	

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



