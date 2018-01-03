
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		//3. ask the user what color they would like the robot to draw
		
		//4. use an if/else statement to set the pen color that the user requested

        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)
			String color= JOptionPane.showInputDialog("What color would you like to draw");
		Robot bot= new Robot();
		size(10,10);
					
					bot.setSpeed(20);
					bot.penDown();
					bot.move(100);
					bot.turn(90);
					bot.move(100);
					bot.turn(90);
					bot.move(100);
					bot.turn(90);
					bot.move(100);
					bot.setPenWidth(10);
				if(bot.equals(color));
				bot.setPenColor(0, 0, 0);
				
	}			


	private static void size(int i, int j) {
		// TODO Auto-generated method stub
		
	}
}
