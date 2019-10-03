package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot  eh =new Robot();
	eh.setSpeed(420);
	eh.penDown();
	for(int i=0; i<4 ; i++); 
	eh.setPenColor(244, 255, 0);
	eh.move(200);
	eh.turn(90);
		
		
	}

}
