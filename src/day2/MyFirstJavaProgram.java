package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;
import org.omg.Messaging.SyncScopeHelper;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		System.out.println("Hello World!");
	Robot Greg = new Robot("mini");
	Greg.sparkle();
	Greg.setWindowColor(70,255,206);
	Greg.penDown();
	Greg.setPenColor(230,22,147);
	Greg.moveTo(500, 500);
	Greg.setPenWidth(5);
	Greg.move(200);
	Greg.turn(90);
	Greg.move(200);
	Greg.turn(90);
	Greg.move(200);
	Greg.turn(90);
	Greg.move(200);
	}
}
