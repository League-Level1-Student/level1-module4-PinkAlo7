package Alo_Game;

import javax.swing.JOptionPane;

public class Alo_Game_Runner {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Welcome! You are about to fight with a marvelous opponent, but first, you must choose who you want"
			+ "\n to be and where you would like to confront your opponent. ");
	new Alo_Game().run();
	String character = JOptionPane.showInputDialog("Choose your character");
	
	
	
}
}
