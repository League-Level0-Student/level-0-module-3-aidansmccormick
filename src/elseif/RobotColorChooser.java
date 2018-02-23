
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {

		Robot bot = new Robot();
		// 3. ask the user what color they would like the robot to draw
		for (int b = 0; b < 50; b++) {
			String colour = JOptionPane.showInputDialog("What color would you like to draw");
			// 4. use an if/else statement to set the pen color that the user requested

			if (colour.equalsIgnoreCase("blue")) {
				bot.setPenColor(0, 0, 255);
			}
			if (colour.equalsIgnoreCase("red")) {
				bot.setPenColor(255, 0, 0);
			}
			if (colour.equalsIgnoreCase("green")) {
				bot.setPenColor(0, 255, 0);
			}
			if (colour.equalsIgnoreCase("black")) {
				bot.setPenColor(255, 255, 255);
			}
			// 5. if the user doesn’t enter anything, choose a random color

			// 6. put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 2. set the pen width to 10
			bot.setPenWidth(10);

			// 1. make the robot draw a shape (this will take more than one line of code)
			for (int i = 0; i < 5; i++)

			{
				bot.penDown();
				bot.setSpeed(500);
				bot.turn(72);
				bot.move(100);

			}
			bot.turn(170);
		}

	}

	private static void size(int i, int j) {
		// TODO Auto-generated method stub

	}
}
