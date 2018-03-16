//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String bam = JOptionPane.showInputDialog("¿te gusta platano?");
		// 2. if they say no,
		if (bam.equals("no")) {
			// tell them they are crazy
			JOptionPane.showMessageDialog(null, "tu eres loco");
			// and end quiz
			JOptionPane.showConfirmDialog(null, "hasta manana");
		} // 3. if they say yes
		if (bam.equals("si"))
			;
		// ask them what is their favorite hobby
		String nac = JOptionPane.showInputDialog(null, "¿Que es tu actividades extracurriculares favorita?");
		// show a pop up that says "<your hobby> is much better with bananas!"
		int vav = JOptionPane.showConfirmDialog(null, nac + " esta mas divertito con platanos");
		// 4. OPTIONAL: if they say something other than “yes” or “no”
		if (vav == 1) {
			// show a pop up that says “You are bananas!”
			JOptionPane.showConfirmDialog(null, nac + "tu eres bananas");
		}

	}
}
