//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();

	public static void main(String[] args) {
		robot.setSpeed(500);
		// 2. Ask the user how dizzy you want the robot from 1-10, then spin that number
		// of times.
		String val = JOptionPane.showInputDialog("how dizzy would you like the robot to be on a scale of 1 - 10");
		// new1. Use the dance method to make the robot spin.
		dance(Integer.parseInt(val));

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}

	}
}
